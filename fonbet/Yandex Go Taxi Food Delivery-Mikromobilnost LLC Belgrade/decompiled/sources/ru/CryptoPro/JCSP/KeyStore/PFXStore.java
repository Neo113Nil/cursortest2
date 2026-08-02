package ru.CryptoPro.JCSP.KeyStore;

import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import ru.CryptoPro.JCSP.CAPILogger;
import ru.CryptoPro.JCSP.CSPVersionDependentAlgorithms;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.KeyStore.MSStore;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.JCSP.exception.BadAsn1Exception;
import ru.CryptoPro.JCSP.exception.InvalidPFXException;
import ru.CryptoPro.JCSP.exception.InvalidStoreException;
import ru.CryptoPro.JCSP.exception.WrongPasswordException;

/* loaded from: classes4.dex */
public class PFXStore extends MSStore {
    private static final int BLOCK_SIZE = 16384;
    private boolean certificatesOnly;
    private boolean enableNoPersistKey;
    private boolean enableSilentMode;
    private boolean enableUUIDKeyAliasOnLoading;

    public static class PfxLoadStoreParameter extends MSStore.SystemStoreLoadStoreParameter {
        private boolean certificatesOnly;
        private boolean enableNoPersistKey;
        private boolean enableSilentMode;
        private boolean enableUUIDKeyAliasOnLoading;

        public PfxLoadStoreParameter(KeyStore.ProtectionParameter protectionParameter) {
            super(protectionParameter);
            this.certificatesOnly = false;
            this.enableSilentMode = false;
            this.enableNoPersistKey = true;
            this.enableUUIDKeyAliasOnLoading = false;
        }

        public void certificatesOnly() {
            this.certificatesOnly = true;
        }

        public void disableNoPersistKey() {
            this.enableNoPersistKey = false;
        }

        public void disableSilentMode() {
            this.enableSilentMode = false;
        }

        public void disableUUIDKeyAliasOnLoading() {
            this.enableUUIDKeyAliasOnLoading = false;
        }

        public void enableNoPersistKey() {
            this.enableNoPersistKey = true;
        }

        public void enableSilentMode() {
            this.enableSilentMode = true;
        }

        public void enableUUIDKeyAliasOnLoading() {
            this.enableUUIDKeyAliasOnLoading = true;
        }

        public void keysAndCertificates() {
            this.certificatesOnly = false;
        }
    }

    public static class PfxStoreProtection extends KeyStore.PasswordProtection {
        private InputStream stream;
        private String type;

        public PfxStoreProtection(InputStream inputStream, char[] cArr) {
            super(cArr);
            this.type = JCSP.PFX_STORE_NAME;
            this.stream = inputStream;
        }

        public InputStream getStream() {
            return this.stream;
        }
    }

    public PFXStore() {
        super(JCSP.PFX_STORE_NAME, MSStore.StoreType.stPFX);
        this.certificatesOnly = false;
        this.enableSilentMode = false;
        this.enableNoPersistKey = true;
        this.enableUUIDKeyAliasOnLoading = false;
    }

    private void closeStore(long j) throws InvalidStoreException {
        JCSPLogger.subEnter();
        if (j <= 0) {
            return;
        }
        CAPILogger.log("CertCloseStore", new Object[]{Long.valueOf(j)}, 0L, new String[0]);
        int closeMemoryStore = closeMemoryStore(j);
        if (closeMemoryStore == 0) {
            JCSPLogger.subExit();
        } else {
            CAPILogger.error("CertCloseStore", new Object[]{Long.valueOf(j)}, closeMemoryStore, new String[0]);
            throw new InvalidStoreException(oyr.r(new StringBuilder("CertCloseStore failed, error: 0x"), closeMemoryStore), closeMemoryStore);
        }
    }

    private long createStore(int i) throws InvalidStoreException {
        JCSPLogger.subEnter();
        long[] jArr = new long[1];
        CAPILogger.log("CertOpenStore", new Object[]{jArr, Integer.valueOf(i)}, 0L, new String[0]);
        int createMemoryStore = createMemoryStore(jArr, i);
        if (createMemoryStore == 0) {
            JCSPLogger.subExit();
            return jArr[0];
        }
        CAPILogger.error("CertOpenStore", new Object[]{jArr, Integer.valueOf(i)}, createMemoryStore, new String[0]);
        throw new InvalidStoreException(oyr.r(new StringBuilder("CertOpenStore failed, error: 0x"), createMemoryStore), createMemoryStore);
    }

    private byte[] exportPfx(long j, String str, int i) throws InvalidPFXException {
        JCSPLogger.subEnter();
        int[] iArr = new int[1];
        CAPILogger.log("PFXExportCertStore", new Object[]{Long.valueOf(j), "***", Integer.valueOf(i), null, Integer.valueOf(iArr[0])}, 0L, "size");
        int exportPfx = exportPfx(j, str, i, null, iArr);
        if (exportPfx != 0) {
            CAPILogger.error("PFXExportCertStore", new Object[]{Long.valueOf(j), "***", Integer.valueOf(i), null, Integer.valueOf(iArr[0])}, exportPfx, new String[0]);
            throw new InvalidPFXException(oyr.r(new StringBuilder("PFXExportCertStore failed (size), error: 0x"), exportPfx), exportPfx);
        }
        byte[] bArr = new byte[iArr[0]];
        CAPILogger.log("PFXExportCertStore", new Object[]{Long.valueOf(j), "***", Integer.valueOf(i), bArr, Integer.valueOf(iArr[0])}, 0L, Constants.KEY_DATA);
        int exportPfx2 = exportPfx(j, str, i, bArr, iArr);
        if (exportPfx2 == 0) {
            JCSPLogger.subExit();
            return bArr;
        }
        CAPILogger.error("PFXExportCertStore", new Object[]{Long.valueOf(j), "***", Integer.valueOf(i), bArr, Integer.valueOf(iArr[0])}, exportPfx2, new String[0]);
        throw new InvalidPFXException(oyr.r(new StringBuilder("PFXExportCertStore failed (data), error: 0x"), exportPfx2), exportPfx2);
    }

    private void importPfx(byte[] bArr, String str, int i) throws InvalidPFXException {
        JCSPLogger.subEnter();
        CAPILogger.log("PFXImportCertStore", new Object[]{bArr, Integer.valueOf(bArr.length), "***", Integer.valueOf(i)}, 0L, new String[0]);
        int importPfx = importPfx(bArr, bArr.length, str, i);
        if (importPfx == 0) {
            JCSPLogger.subExit();
        } else {
            CAPILogger.error("PFXImportCertStore", new Object[]{bArr, Integer.valueOf(bArr.length), "***", Integer.valueOf(i)}, importPfx, new String[0]);
            throw new InvalidPFXException(oyr.r(new StringBuilder("PFXImportCertStore failed, error: 0x"), importPfx), importPfx);
        }
    }

    private void putEntryToCertStore(long j, MSStore.KeyEntry keyEntry) throws CertificateException, KeyStoreException {
        JCSPLogger.subEnter();
        X509Certificate[] certificateChain = keyEntry.getCertificateChain();
        MSStore.KeyEntry keyEntry2 = new MSStore.KeyEntry(this, keyEntry.getAlias(), keyEntry.getKey(), certificateChain);
        keyEntry2.sethCertStoreForExportToPfx(j);
        keyEntry2.setCertificateChain(certificateChain, false);
        JCSPLogger.subExit();
    }

    private void verifyPfx(byte[] bArr, String str) throws MSException {
        JCSPLogger.subEnter();
        if (CSPVersionDependentAlgorithms.isPfxVerifyPasswordSupported()) {
            CAPILogger.log("PFXVerifyPassword", new Object[]{bArr, Integer.valueOf(bArr.length), "***", 0}, 0L, new String[0]);
            int verifyPfx = verifyPfx(bArr, bArr.length, str, 0);
            if (verifyPfx != 0) {
                CAPILogger.error("PFXVerifyPassword", new Object[]{bArr, Integer.valueOf(bArr.length), "***", 0}, verifyPfx, new String[0]);
                MSException.procCode(verifyPfx);
            }
        } else {
            CAPILogger.log("PFXVerifyPassword", "method is unavailable, because CSP version is less 11707.");
        }
        JCSPLogger.subExit();
    }

    public native int closeMemoryStore(long j);

    public native int createMemoryStore(long[] jArr, int i);

    @Override // ru.CryptoPro.JCSP.KeyStore.MSStore
    public boolean enableUUIDKeyAliasOnLoading() {
        return this.enableUUIDKeyAliasOnLoading;
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.MSStore, java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException, NoSuchAlgorithmException, CertificateException {
        JCSPLogger.subEnter();
        if (loadStoreParameter instanceof PfxLoadStoreParameter) {
            PfxLoadStoreParameter pfxLoadStoreParameter = (PfxLoadStoreParameter) loadStoreParameter;
            this.enableUUIDKeyAliasOnLoading = pfxLoadStoreParameter.enableUUIDKeyAliasOnLoading;
            this.certificatesOnly = pfxLoadStoreParameter.certificatesOnly;
            this.enableSilentMode = pfxLoadStoreParameter.enableSilentMode;
            this.enableNoPersistKey = pfxLoadStoreParameter.enableNoPersistKey;
        }
        if (loadStoreParameter.getProtectionParameter() instanceof PfxStoreProtection) {
            PfxStoreProtection pfxStoreProtection = (PfxStoreProtection) loadStoreParameter.getProtectionParameter();
            engineLoad(pfxStoreProtection.stream, pfxStoreProtection.getPassword());
        } else {
            super.engineLoad(loadStoreParameter);
        }
        JCSPLogger.subExit();
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.MSStore
    public void engineLoadInternal(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        JCSPLogger.subEnter();
        if (inputStream != null) {
            byte[] bArr = new byte[16384];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr, 0, 16384);
                if (read <= 0) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
            String valueOf = cArr != null ? String.valueOf(cArr) : null;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                verifyPfx(byteArray, valueOf);
                int keySetType = getKeySetType();
                if (this.enableSilentMode) {
                    keySetType |= 64;
                }
                int i = keySetType | 1;
                if (this.enableNoPersistKey) {
                    i = 32769 | keySetType;
                }
                importPfx(byteArray, valueOf, i);
            } catch (Exception e) {
                if (!(e instanceof MSException)) {
                    kbs.r(e);
                    return;
                }
                MSException mSException = (MSException) e;
                int description = mSException.getDescription();
                if (mSException.isPfxInvalidPassword()) {
                    throw new WrongPasswordException("Invalid password.", description);
                }
                if (mSException.isPfxBadAsn1()) {
                    throw new BadAsn1Exception("Invalid ASN1.", description);
                }
                ny61.v(oyr.r(new StringBuilder("PFXVerifyPassword failed with error 0x"), description));
                return;
            }
        }
        JCSPLogger.subExit();
    }

    @Override // ru.CryptoPro.JCSP.KeyStore.MSStore, java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        long j;
        JCSPLogger.subEnter();
        if (outputStream == null) {
            return;
        }
        if (cArr == null) {
            ny61.v("Password can't be null.");
            return;
        }
        String valueOf = String.valueOf(cArr);
        this.entriesR.lock();
        try {
            int keySetType = getKeySetType();
            int i = !this.certificatesOnly ? -65522 : -65526;
            int i2 = this.enableSilentMode ? (i & (-20)) | 64 : i & (-84);
            j = createStore(keySetType);
            try {
                Iterator it = this.entries.values().iterator();
                while (it.hasNext()) {
                    try {
                        putEntryToCertStore(j, (MSStore.KeyEntry) it.next());
                    } catch (KeyStoreException e) {
                        throw new IOException(e);
                    }
                }
                outputStream.write(exportPfx(j, valueOf, i2));
                if (j != 0) {
                    try {
                        closeStore(j);
                    } catch (Exception unused) {
                    }
                }
                this.entriesR.unlock();
                JCSPLogger.subExit();
            } catch (Throwable th) {
                th = th;
                if (j != 0) {
                    try {
                        closeStore(j);
                    } catch (Exception unused2) {
                    }
                }
                this.entriesR.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = 0;
        }
    }

    public native int exportPfx(long j, String str, int i, byte[] bArr, int[] iArr);

    public native int importPfx(byte[] bArr, int i, String str, int i2);

    public native int verifyPfx(byte[] bArr, int i, String str, int i2);
}
