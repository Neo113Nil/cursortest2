package ru.CryptoPro.JCSP.KeyStore;

import defpackage.g8e;
import defpackage.ny61;
import java.io.File;
import java.io.IOException;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.JCSPLogger;

/* loaded from: classes4.dex */
public class FILE extends MSStoreInternal {

    public static abstract class Builder extends KeyStore.Builder {
        static final int MAX_CALLBACK_TRIES = 3;

        public static final class FileStoreBuilder extends Builder {
            private final AccessControlContext context;
            private KeyStore keyStore;
            private Throwable oldException;
            private final FileStoreProtection protection;

            public FileStoreBuilder(FileStoreProtection fileStoreProtection, AccessControlContext accessControlContext) {
                this.protection = fileStoreProtection;
                this.context = accessControlContext;
            }

            @Override // java.security.KeyStore.Builder
            public synchronized KeyStore getKeyStore() throws KeyStoreException {
                JCSPLogger.subEnter();
                if (this.keyStore != null) {
                    JCSPLogger.subExit();
                    return this.keyStore;
                }
                if (this.oldException != null) {
                    throw new KeyStoreException("Previous KeyStore instantiation failed", this.oldException);
                }
                try {
                    this.keyStore = (KeyStore) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.JCSP.KeyStore.FILE.Builder.FileStoreBuilder.1
                        @Override // java.security.PrivilegedExceptionAction
                        public Object run() throws Exception {
                            int i = 0;
                            do {
                                i++;
                                try {
                                    return this.run0();
                                } catch (IOException e) {
                                    if (i >= 3) {
                                        break;
                                    }
                                    throw e;
                                }
                            } while (e.getCause() instanceof UnrecoverableKeyException);
                            throw e;
                        }

                        public Object run0() throws Exception {
                            Provider provider = FileStoreBuilder.this.protection.provider;
                            FileStoreBuilder fileStoreBuilder = FileStoreBuilder.this;
                            KeyStore keyStore = provider == null ? KeyStore.getInstance(fileStoreBuilder.protection.type) : KeyStore.getInstance(fileStoreBuilder.protection.type, FileStoreBuilder.this.protection.provider);
                            keyStore.load(new FileLoadStoreParameter(FileStoreBuilder.this.protection));
                            return keyStore;
                        }
                    }, this.context);
                    JCSPLogger.subExit();
                    return this.keyStore;
                } catch (PrivilegedActionException e) {
                    this.oldException = e.getCause();
                    throw new KeyStoreException("KeyStore instantiation failed", this.oldException);
                }
            }

            @Override // java.security.KeyStore.Builder
            public synchronized KeyStore.ProtectionParameter getProtectionParameter(String str) {
                JCSPLogger.subEnter();
                if (str == null) {
                    throw new NullPointerException();
                }
                if (this.keyStore == null) {
                    throw new IllegalStateException("getKeyStore() must be called first.");
                }
                JCSPLogger.subExit();
                return this.protection;
            }
        }

        public static Builder newInstance(String str, char[] cArr) {
            JCSPLogger.subEnter();
            File file = new File(str);
            if (!file.isFile()) {
                ny61.g(g8e.n(file, "Storage does not exist or it does not refer to a file: "));
                return null;
            }
            Provider provider = Security.getProvider("JCSP");
            provider.getClass();
            FileStoreProtection fileStoreProtection = new FileStoreProtection(JCSP.FILE_STORE_NAME, provider, file.getAbsolutePath(), cArr);
            JCSPLogger.subExit();
            return new FileStoreBuilder(fileStoreProtection, AccessController.getContext());
        }
    }

    public static class FileLoadStoreParameter implements KeyStore.LoadStoreParameter {
        private final KeyStore.ProtectionParameter protection;

        public FileLoadStoreParameter(KeyStore.ProtectionParameter protectionParameter) {
            this.protection = protectionParameter;
        }

        @Override // java.security.KeyStore.LoadStoreParameter
        public KeyStore.ProtectionParameter getProtectionParameter() {
            return this.protection;
        }
    }

    public FILE() {
        super(JCSP.FILE_STORE_NAME);
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.MSStore, java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException, NoSuchAlgorithmException, CertificateException {
        JCSPLogger.subEnter();
        if (loadStoreParameter.getProtectionParameter() instanceof FileStoreProtection) {
            FileStoreProtection fileStoreProtection = (FileStoreProtection) loadStoreParameter.getProtectionParameter();
            this.storePath = fileStoreProtection.storePath;
            engineLoad(null, fileStoreProtection.getPassword());
        } else {
            super.engineLoad(loadStoreParameter);
        }
        JCSPLogger.subExit();
    }

    public static class FileStoreProtection extends KeyStore.PasswordProtection {
        private Provider provider;
        private String storePath;
        private String type;

        public FileStoreProtection(String str, char[] cArr) {
            super(cArr);
            this.provider = null;
            this.type = JCSP.FILE_STORE_NAME;
            this.storePath = str;
        }

        public String getStorePath() {
            return this.storePath;
        }

        public FileStoreProtection(String str, Provider provider, String str2, char[] cArr) {
            super(cArr);
            this.type = str;
            this.provider = provider;
            this.storePath = str2;
        }
    }
}
