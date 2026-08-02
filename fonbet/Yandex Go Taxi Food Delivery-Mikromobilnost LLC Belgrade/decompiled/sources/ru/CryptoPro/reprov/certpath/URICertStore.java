package ru.CryptoPro.reprov.certpath;

import com.adjust.sdk.Constants;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import defpackage.cph;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CRLException;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.Base64InputStream;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.reprov.RevCAPI;
import ru.CryptoPro.reprov.utils.Cache;
import ru.CryptoPro.reprov.x509.AccessDescription;
import ru.CryptoPro.reprov.x509.GeneralNameInterface;
import ru.CryptoPro.reprov.x509.URIName;

/* loaded from: classes4.dex */
public class URICertStore extends CertStoreSpi {
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final boolean m;
    public static final boolean n;
    public static final boolean o;
    public static final String p;
    public static final String q;
    public static final boolean r;
    public static final boolean s;
    public static final Cache t;
    public final CertificateFactory a;
    public Collection b;
    public X509CRL c;
    public long d;
    public long e;
    public final URI f;
    public final boolean g;
    public final boolean h;

    class UCS extends CertStore {
        public UCS(URICertStore uRICertStore, URICertStoreParameters uRICertStoreParameters) {
            super(uRICertStore, null, GlobalRouterActivity.URI, uRICertStoreParameters);
        }
    }

    public class URICertStoreParameters implements CertStoreParameters {
        public final URI a;
        public boolean b;
        public boolean c;
        public volatile int w = 0;

        public URICertStoreParameters(URI uri) {
            this.a = uri;
        }

        @Override // java.security.cert.CertStoreParameters
        public Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                throw new InternalError(e.toString());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof URICertStoreParameters) {
                return this.a.equals(((URICertStoreParameters) obj).a);
            }
            return false;
        }

        public void failOnError() {
            this.c = true;
        }

        public int hashCode() {
            if (this.w == 0) {
                this.w = this.a.hashCode() + 629;
            }
            return this.w;
        }

        public void useBase64Stream() {
            this.b = true;
        }
    }

    static {
        int integerProperty = GetProperty.getIntegerProperty("com.sun.security.crl.timeout", 15);
        i = integerProperty < 0 ? 15000 : integerProperty * 1000;
        int integerProperty2 = GetProperty.getIntegerProperty("ru.CryptoPro.crl.read_timeout", 10);
        j = integerProperty2 < 0 ? 10000 : integerProperty2 * 1000;
        int integerProperty3 = GetProperty.getIntegerProperty("ru.CryptoPro.cert.connect_timeout", 15);
        k = integerProperty3 >= 0 ? integerProperty3 * 1000 : 15000;
        int integerProperty4 = GetProperty.getIntegerProperty("ru.CryptoPro.cert.read_timeout", 10);
        l = integerProperty4 >= 0 ? integerProperty4 * 1000 : 10000;
        m = r || new JCPPref(URICertStore.class).getBoolean("allow_crl_redirect", false);
        n = s || new JCPPref(URICertStore.class).getBoolean("allow_cert_redirect", false);
        o = GetProperty.getBooleanProperty("use_default_jsse_impl", true) && new JCPPref(URICertStore.class).getBoolean("use_default_jsse_impl", true);
        String str = null;
        String stringProperty = GetProperty.getStringProperty("use_jsse_impl", null);
        String str2 = new JCPPref(URICertStore.class).get("use_jsse_impl", stringProperty);
        if (stringProperty == null) {
            stringProperty = str2 != null ? str2 : null;
        }
        p = stringProperty;
        String stringProperty2 = GetProperty.getStringProperty("use_jsse_alg", null);
        String str3 = new JCPPref(URICertStore.class).get("use_jsse_alg", stringProperty2);
        if (stringProperty2 != null) {
            str = stringProperty2;
        } else if (str3 != null) {
            str = str3;
        }
        q = str;
        r = GetProperty.getBooleanProperty("allow_crl_redirect", false);
        s = GetProperty.getBooleanProperty("allow_cert_redirect", false);
        t = Cache.newSoftMemoryCache(185);
    }

    public URICertStore(URICertStoreParameters uRICertStoreParameters) {
        super(uRICertStoreParameters);
        this.b = Collections.EMPTY_SET;
        if (uRICertStoreParameters == null) {
            kbs.t("params must be instanceof URICertStoreParameters");
            throw null;
        }
        URI uri = uRICertStoreParameters.a;
        this.f = uri;
        this.g = uRICertStoreParameters.b;
        this.h = uRICertStoreParameters.c;
        if (uri.getScheme().toLowerCase().equals("ldap")) {
            JCPLogger.fine("URICertStore: ignore LDAP scheme.");
        }
        try {
            this.a = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
        } catch (CertificateException unused) {
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static URLConnection a(HttpURLConnection httpURLConnection, int i2, int i3) {
        SSLContext sSLContext;
        boolean z = false;
        int i4 = 0;
        while (true) {
            if (i4 < 5) {
                String headerField = httpURLConnection.getHeaderField("Location");
                String headerField2 = httpURLConnection.getHeaderField("Set-Cookie");
                URL url = new URL(headerField);
                JCPLogger.fine("Connecting (redirect): " + url);
                if (!url.getProtocol().equals("http") && !url.getProtocol().equals(Constants.SCHEME)) {
                    break;
                }
                ((HttpURLConnection) httpURLConnection).disconnect();
                httpURLConnection = url.openConnection();
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i3);
                if (httpURLConnection instanceof HttpsURLConnection) {
                    try {
                        if (o) {
                            sSLContext = SSLContext.getDefault();
                        } else {
                            String str = Platform.isSun ? "SunJSSE" : "IBMJSSE2";
                            String str2 = p;
                            if (str2 != null) {
                                str = str2;
                            }
                            String str3 = q;
                            sSLContext = SSLContext.getInstance(str3 != null ? str3 : "Default", str);
                        }
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
                    } catch (Exception e) {
                        JCPLogger.subThrown(e);
                    }
                }
                if (headerField2 != null) {
                    httpURLConnection.setRequestProperty("Cookie", headerField2);
                }
                i4++;
                if (!e(((HttpURLConnection) httpURLConnection).getResponseCode())) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            return httpURLConnection;
        }
        ny61.v(oyr.j(i4, "Redirection has failed after attempts: ", ". If count of attempts is equal 1 something may be wrong with https redirection (cpSSL/JavaTLS should be deleted and security options should be dropped to default values)."));
        return null;
    }

    public static CertStore b(AccessDescription accessDescription) {
        if (!accessDescription.getAccessMethod().equals((Object) AccessDescription.Ad_CAISSUERS_Id)) {
            return null;
        }
        GeneralNameInterface name = accessDescription.getAccessLocation().getName();
        if (!(name instanceof URIName)) {
            return null;
        }
        try {
            return getInstance(new URICertStoreParameters(((URIName) name).getURI()));
        } catch (Exception e) {
            JCPLogger.warning("exception creating CertStore: ", (Throwable) e);
            return null;
        }
    }

    public static Collection c(Collection collection, CertSelector certSelector) {
        if (certSelector == null) {
            return collection;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            X509Certificate x509Certificate = (X509Certificate) it.next();
            if (certSelector.match(x509Certificate)) {
                arrayList.add(x509Certificate);
            }
        }
        return arrayList;
    }

    public static List d(X509CRL x509crl, CRLSelector cRLSelector) {
        return (cRLSelector == null || (x509crl != null && cRLSelector.match(x509crl))) ? Collections.singletonList(x509crl) : Collections.EMPTY_LIST;
    }

    public static boolean e(int i2) {
        return i2 == 301 || i2 == 302 || i2 == 303;
    }

    public static synchronized CertStore getInstance(URICertStoreParameters uRICertStoreParameters) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        CertStore certStore;
        synchronized (URICertStore.class) {
            try {
                JCPLogger.finer("CertStore URI:", uRICertStoreParameters.a);
                Cache cache = t;
                certStore = (CertStore) cache.get(uRICertStoreParameters);
                if (certStore == null) {
                    certStore = new UCS(new URICertStore(uRICertStoreParameters), uRICertStoreParameters);
                    cache.put(uRICertStoreParameters, certStore);
                } else {
                    JCPLogger.finer("URICertStore.getInstance: cache hit");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return certStore;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x019d, code lost:
    
        if (r1 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016d, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016b, code lost:
    
        if (r1 != null) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.security.cert.CertStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized Collection engineGetCRLs(CRLSelector cRLSelector) throws CertStoreException {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.d < 30000) {
            JCPLogger.finer("Returning CRL from cache");
            return d(this.c, cRLSelector);
        }
        this.d = currentTimeMillis;
        cph cphVar = 0;
        int i2 = -1;
        try {
            try {
                JCPLogger.fine("Connecting: " + this.f);
                if (Platform.isAndroid) {
                    byte[] bArr = new byte[16384];
                    int[] iArr = {16384};
                    String url = this.f.toURL().toString();
                    int i3 = i;
                    int cryptRetrieveObjectByUrl = RevCAPI.cryptRetrieveObjectByUrl(url, 2, i3, bArr, iArr);
                    if (cryptRetrieveObjectByUrl == 8) {
                        bArr = new byte[iArr[0]];
                        cryptRetrieveObjectByUrl = RevCAPI.cryptRetrieveObjectByUrl(this.f.toURL().toString(), 2, i3, bArr, iArr);
                    }
                    if (cryptRetrieveObjectByUrl != 0) {
                        throw new CRLException("RevCAPI ERROR: " + cryptRetrieveObjectByUrl);
                    }
                    this.e = System.currentTimeMillis();
                    inputStream = new ByteArrayInputStream(bArr, 0, iArr[0]);
                } else {
                    URLConnection openConnection = this.f.toURL().openConnection();
                    long j2 = this.e;
                    if (j2 != 0) {
                        openConnection.setIfModifiedSince(j2);
                    }
                    int i4 = i;
                    openConnection.setConnectTimeout(i4);
                    int i5 = j;
                    openConnection.setReadTimeout(i5);
                    if (openConnection instanceof HttpURLConnection) {
                        i2 = ((HttpURLConnection) openConnection).getResponseCode();
                        if (m && e(i2)) {
                            openConnection = a((HttpURLConnection) openConnection, i4, i5);
                        }
                    }
                    JCPLogger.finer("Downloading new CRL...");
                    inputStream = openConnection.getInputStream();
                    try {
                        long j3 = this.e;
                        long lastModified = openConnection.getLastModified();
                        this.e = lastModified;
                        if (j3 != 0) {
                            if (j3 == lastModified) {
                                JCPLogger.finer("Not modified, using cached copy");
                                List d = d(this.c, cRLSelector);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                return d;
                            }
                            if ((openConnection instanceof HttpURLConnection) && ((HttpURLConnection) openConnection).getResponseCode() == 304) {
                                JCPLogger.finer("Not modified, using cached copy");
                                List d2 = d(this.c, cRLSelector);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                return d2;
                            }
                        }
                    } catch (IOException e) {
                        e = e;
                        if (this.h) {
                            throw new CertStoreException(String.format("Exception fetching CRL: %s (status: %d)", this.f, Integer.valueOf(i2)), e);
                        }
                        JCPLogger.fineFormat("Exception fetching CRL: {0} (status: {1})", this.f, Integer.valueOf(i2));
                        JCPLogger.subThrown(e);
                    } catch (CRLException e2) {
                        e = e2;
                        if (this.h) {
                            throw new CertStoreException(String.format("Exception fetching CRL: %s (status: %d)", this.f, Integer.valueOf(i2)), e);
                        }
                        JCPLogger.fineFormat("Exception fetching CRL: {0} (status: {1})", this.f, Integer.valueOf(i2));
                        JCPLogger.subThrown(e);
                    }
                }
                JCPLogger.finer("Generating new CRL...");
                this.c = (X509CRL) this.a.generateCRL(this.g ? new Base64InputStream(inputStream) : inputStream);
                JCPLogger.finer("CRL has been generated.");
                List d3 = d(this.c, cRLSelector);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return d3;
            } catch (Throwable th) {
                th = th;
                cphVar = "Connecting: ";
                if (cphVar != 0) {
                    try {
                        cphVar.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
        } catch (CRLException e4) {
            e = e4;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (cphVar != 0) {
            }
            throw th;
        }
        this.e = 0L;
        this.c = null;
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
    
        if (0 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0150, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014e, code lost:
    
        if (0 == 0) goto L69;
     */
    @Override // java.security.cert.CertStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized Collection engineGetCertificates(CertSelector certSelector) throws CertStoreException {
        InputStream byteArrayInputStream;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.d < 30000) {
            JCPLogger.finer("Returning certificates from cache");
            return c(this.b, certSelector);
        }
        this.d = currentTimeMillis;
        InputStream inputStream = null;
        try {
            try {
                try {
                    JCPLogger.fine("Connecting: " + this.f);
                    if (Platform.isAndroid) {
                        byte[] bArr = new byte[16384];
                        int[] iArr = {16384};
                        String url = this.f.toURL().toString();
                        int i2 = k;
                        int cryptRetrieveObjectByUrl = RevCAPI.cryptRetrieveObjectByUrl(url, 1, i2, bArr, iArr);
                        if (cryptRetrieveObjectByUrl == 8) {
                            bArr = new byte[iArr[0]];
                            cryptRetrieveObjectByUrl = RevCAPI.cryptRetrieveObjectByUrl(this.f.toURL().toString(), 1, i2, bArr, iArr);
                        }
                        if (cryptRetrieveObjectByUrl != 0) {
                            throw new CertStoreException("RevCAPI ERROR: " + cryptRetrieveObjectByUrl);
                        }
                        this.e = System.currentTimeMillis();
                        byteArrayInputStream = new ByteArrayInputStream(bArr, 0, iArr[0]);
                    } else {
                        URLConnection openConnection = this.f.toURL().openConnection();
                        long j2 = this.e;
                        if (j2 != 0) {
                            openConnection.setIfModifiedSince(j2);
                        }
                        int i3 = k;
                        openConnection.setConnectTimeout(i3);
                        int i4 = l;
                        openConnection.setReadTimeout(i4);
                        if (openConnection instanceof HttpURLConnection) {
                            int responseCode = ((HttpURLConnection) openConnection).getResponseCode();
                            if (n && e(responseCode)) {
                                openConnection = a((HttpURLConnection) openConnection, i3, i4);
                            }
                        }
                        JCPLogger.finer("Downloading new certificates...");
                        byteArrayInputStream = openConnection.getInputStream();
                        long j3 = this.e;
                        long lastModified = openConnection.getLastModified();
                        this.e = lastModified;
                        if (j3 != 0) {
                            if (j3 == lastModified) {
                                JCPLogger.finer("Not modified, using cached copy");
                                Collection c = c(this.b, certSelector);
                                if (byteArrayInputStream != null) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                return c;
                            }
                            if ((openConnection instanceof HttpURLConnection) && ((HttpURLConnection) openConnection).getResponseCode() == 304) {
                                JCPLogger.finer("Not modified, using cached copy");
                                Collection c2 = c(this.b, certSelector);
                                if (byteArrayInputStream != null) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                return c2;
                            }
                        }
                    }
                    JCPLogger.finer("Generating new certificates from stream...");
                    this.b = this.a.generateCertificates(byteArrayInputStream);
                    JCPLogger.finer("Certificate has been generated.");
                    Collection c3 = c(this.b, certSelector);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return c3;
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                JCPLogger.fineFormat("Exception fetching certificates: {0} (status: {1})", this.f, -1);
                JCPLogger.subThrown(e);
            }
        } catch (CertificateException e2) {
            JCPLogger.fineFormat("Exception fetching certificates: {0} (status: {1})", this.f, -1);
            JCPLogger.subThrown(e2);
        }
        this.e = 0L;
        Set set = Collections.EMPTY_SET;
        this.b = set;
        return set;
    }
}
