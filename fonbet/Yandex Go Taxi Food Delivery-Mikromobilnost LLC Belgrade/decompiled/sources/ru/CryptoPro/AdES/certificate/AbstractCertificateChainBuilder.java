package ru.CryptoPro.AdES.certificate;

import defpackage.oyr;
import defpackage.qv10;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.CryptoPro.AdES.AdESConfig;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.support.BKSTrustStore;
import ru.CryptoPro.reprov.RevCheck;

/* loaded from: classes4.dex */
public abstract class AbstractCertificateChainBuilder {
    private static final Set<X509Certificate> CA_CERTS_INTERMEDIATE_CERTIFICATES;
    private static final ReentrantReadWriteLock CA_CERTS_RW_LOCK;
    private static final Lock CA_CERTS_R_LOCK;
    private static final Set<X509Certificate> CA_CERTS_TRUST_CERTIFICATES;
    private static final Lock CA_CERTS_W_LOCK;
    public static final String DEFAULT_TRUST_STORE = "cacerts";
    public static final String DEFAULT_TRUST_STORE_DIR;
    public static final char[] DEFAULT_TRUST_STORE_PASSWORD;
    public static final String DEFAULT_TRUST_STORE_PATH;
    public static final boolean ENABLE_WATCH_SERVICE;
    public static final String JAVA_HOME;
    protected Date validationDate = null;
    protected String provider = null;
    protected X509Certificate targetCert = null;
    protected X509Certificate rootCert = null;

    static {
        String stringProperty = GetProperty.getStringProperty("java.home", null);
        JAVA_HOME = stringProperty;
        boolean booleanProperty = GetProperty.getBooleanProperty("enable_trust_watch_service", false);
        ENABLE_WATCH_SERVICE = booleanProperty;
        StringBuilder t = qv10.t(stringProperty);
        char c = File.separatorChar;
        t.append(c);
        t.append("lib");
        t.append(c);
        t.append(BKSTrustStore.STORAGE_DIRECTORY);
        String sb = t.toString();
        DEFAULT_TRUST_STORE_DIR = sb;
        DEFAULT_TRUST_STORE_PATH = oyr.f(c, sb, "cacerts");
        boolean z = Platform.isAndroid;
        DEFAULT_TRUST_STORE_PASSWORD = z ? AdESConfig.DEFAULT_CACERTS_PASSWORD : AdESConfig.getCACertsPassword();
        CA_CERTS_TRUST_CERTIFICATES = new HashSet();
        CA_CERTS_INTERMEDIATE_CERTIFICATES = new HashSet();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        CA_CERTS_RW_LOCK = reentrantReadWriteLock;
        CA_CERTS_W_LOCK = reentrantReadWriteLock.writeLock();
        CA_CERTS_R_LOCK = reentrantReadWriteLock.readLock();
        loadTrustedCertificates();
        if (z || !booleanProperty) {
            return;
        }
        Thread thread = new Thread() { // from class: ru.CryptoPro.AdES.certificate.AbstractCertificateChainBuilder.1WatchThread
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                String str;
                try {
                    JCPLogger.fine("%%% Starting watch service... %%%");
                    WatchService newWatchService = FileSystems.getDefault().newWatchService();
                    String str2 = AbstractCertificateChainBuilder.DEFAULT_TRUST_STORE_DIR;
                    Path path = Paths.get(str2, new String[0]);
                    JCPLogger.fine("Watching directory: " + str2);
                    path.register(newWatchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
                    while (!Thread.interrupted()) {
                        WatchKey take = newWatchService.take();
                        for (WatchEvent<?> watchEvent : take.pollEvents()) {
                            WatchEvent.Kind<?> kind = watchEvent.kind();
                            if (kind != StandardWatchEventKinds.OVERFLOW) {
                                Path path2 = (Path) watchEvent.context();
                                if (path2.toFile().getName().equals("cacerts")) {
                                    File file = ((Path) take.watchable()).resolve(path2).toFile();
                                    JCPLogger.finer("Watching file " + file + " with size = " + Files.size(file.toPath()));
                                    if (StandardWatchEventKinds.ENTRY_CREATE.equals(kind)) {
                                        str = "Entry was created, reloading trust store...";
                                    } else if (StandardWatchEventKinds.ENTRY_MODIFY.equals(kind)) {
                                        str = "Entry was modified, reloading trust store...";
                                    } else if (StandardWatchEventKinds.ENTRY_DELETE.equals(kind)) {
                                        JCPLogger.finer("Entry was deleted, nothing to do.");
                                    }
                                    JCPLogger.finer(str);
                                    AbstractCertificateChainBuilder.loadTrustedCertificates();
                                }
                            }
                        }
                        take.reset();
                    }
                } catch (IOException | InterruptedException e) {
                    JCPLogger.warning(e.getMessage(), e);
                    Thread.currentThread().interrupt();
                }
            }
        };
        thread.setName("AdES-WatchService");
        thread.setDaemon(true);
        thread.start();
    }

    public static Set<X509Certificate> getCaCertsIntermediateCertificates() {
        Lock lock = CA_CERTS_R_LOCK;
        lock.lock();
        try {
            HashSet hashSet = new HashSet(CA_CERTS_INTERMEDIATE_CERTIFICATES);
            lock.unlock();
            return hashSet;
        } catch (Throwable th) {
            CA_CERTS_R_LOCK.unlock();
            throw th;
        }
    }

    public static Set<X509Certificate> getCaCertsTrustCertificates() {
        Lock lock = CA_CERTS_R_LOCK;
        lock.lock();
        try {
            HashSet hashSet = new HashSet(CA_CERTS_TRUST_CERTIFICATES);
            lock.unlock();
            return hashSet;
        } catch (Throwable th) {
            CA_CERTS_R_LOCK.unlock();
            throw th;
        }
    }

    public static boolean loadTrustedCertificates() {
        boolean z;
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Loading trusted certificates... %%%");
        CA_CERTS_W_LOCK.lock();
        try {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            try {
                if (Platform.isAndroid) {
                    loadTrustedCertificates("AndroidCAStore", null, null, hashSet, hashSet2);
                } else {
                    loadTrustedCertificates("JKS", DEFAULT_TRUST_STORE_PATH, DEFAULT_TRUST_STORE_PASSWORD, hashSet, hashSet2);
                    if (AdESConfig.useCspStores()) {
                        try {
                            loadTrustedCertificates(JCSP.ROOT_STORE_NAME, null, null, hashSet, hashSet2);
                        } catch (Exception e) {
                            JCPLogger.warning("Unable to load ROOT system store.", (Throwable) e);
                        }
                        try {
                            loadTrustedCertificates(JCSP.CA_STORE_NAME, null, null, hashSet, hashSet2);
                        } catch (Exception e2) {
                            JCPLogger.warning("Unable to load CA system store.", (Throwable) e2);
                        }
                    }
                }
            } catch (AdESException e3) {
                JCPLogger.warning(e3.getMessage(), (Throwable) e3);
                z = Platform.isAndroid;
            }
            if (Platform.isAndroid) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(JCP.getAndroidApplicationDirectory());
                    char c = File.separatorChar;
                    sb.append(c);
                    sb.append(BKSTrustStore.STORAGE_DIRECTORY);
                    sb.append(c);
                    sb.append("cacerts");
                    String sb2 = sb.toString();
                    JCPLogger.fine("%%% Loading additional android trusted certificates:", sb2);
                    loadTrustedCertificates(BKSTrustStore.STORAGE_TYPE, sb2, DEFAULT_TRUST_STORE_PASSWORD, hashSet, hashSet2);
                    JCPLogger.fine("%%% Additional android trusted certificates were loaded %%%");
                } catch (AdESException e4) {
                    JCPLogger.warning(e4.getMessage(), (Throwable) e4);
                }
            }
            if (z) {
                JCPLogger.fine("Trust store has been loaded, updating certificate list...");
                Set<X509Certificate> set = CA_CERTS_TRUST_CERTIFICATES;
                set.clear();
                Set<X509Certificate> set2 = CA_CERTS_INTERMEDIATE_CERTIFICATES;
                set2.clear();
                set.addAll(hashSet);
                set2.addAll(hashSet2);
                JCPLogger.finer("Trust certificates count after loading is " + set.size());
                JCPLogger.finer("Intermediate certificates count after loading is " + set2.size());
            } else {
                JCPLogger.warning("Trusted store loading failed.");
            }
            JCPLogger.fine("%%% Trusted certificates have been loaded %%%");
            CA_CERTS_W_LOCK.unlock();
            JCPLogger.subExit();
            return z;
        } catch (Throwable th) {
            CA_CERTS_W_LOCK.unlock();
            throw th;
        }
    }

    public String getAlgorithm() {
        return RevCheck.CP_REV_CHECK_ALG;
    }

    public String getRevocationProvider() {
        return RevCheck.PROVIDER_NAME;
    }

    private static void loadTrustedCertificates(String str, String str2, char[] cArr, Set<X509Certificate> set, Set<X509Certificate> set2) throws AdESException {
        JCPLogger.subEnter();
        JCPLogger.fineFormat("Loading trusted certificates from store {0} with type {1}", str2, str);
        try {
            KeyStore keyStore = KeyStore.getInstance(str);
            keyStore.load(str2 != null ? new FileInputStream(str2) : null, cArr);
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(aliases.nextElement());
                if (x509Certificate != null) {
                    boolean z = Platform.isAndroid;
                    if (z) {
                        x509Certificate = (X509Certificate) AdESUtility.CERT_FACTORY.generateCertificate(new ByteArrayInputStream(x509Certificate.getEncoded()));
                    }
                    if (!AdESUtility.isSelfSignedForCaCerts(x509Certificate)) {
                        if (!Platform.isIbm && !z) {
                            set2.add(x509Certificate);
                        }
                        if (AdESUtility.isGost(x509Certificate)) {
                            set2.add(x509Certificate);
                        }
                    }
                    set.add(x509Certificate);
                }
            }
            if (set.isEmpty()) {
                JCPLogger.fine("Trust store is empty.");
            } else {
                JCPLogger.fine("A few trust certificates were loaded:", Integer.valueOf(set.size()));
            }
            if (!set2.isEmpty()) {
                JCPLogger.fine("A few intermediate certificates were loaded:", Integer.valueOf(set2.size()));
            }
            JCPLogger.subExit();
        } catch (Exception e) {
            throw new AdESException(e, IAdESException.ecInternal);
        }
    }
}
