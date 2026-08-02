package ru.CryptoPro.JCSP.Key;

import defpackage.dy31;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.yci0;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.UnrecoverableKeyException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.spec.PBEKeySpec;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.params.JCPPBEKeySpec;
import ru.CryptoPro.JCP.params.KdfTreeDiversKeySpec;
import ru.CryptoPro.JCP.params.LicenseControlInfoInterface;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.spec.ProviderParameterInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CStructReader.SchannelAlgStructure;
import ru.CryptoPro.JCSP.CStructReader.SimpleBlobForeignStructure;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.MSCAPI.CAPI;
import ru.CryptoPro.JCSP.MSCAPI.CSPProv2012_256;
import ru.CryptoPro.JCSP.MSCAPI.CSPProvECDSA;
import ru.CryptoPro.JCSP.MSCAPI.CSPProvEDDSA;
import ru.CryptoPro.JCSP.MSCAPI.CSPProvRSA;
import ru.CryptoPro.JCSP.MSCAPI.HHash;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.JCSP.params.DefaultCSPProvider;

/* loaded from: classes4.dex */
public abstract class SecretKeyImpl extends AbstractEncryptionKeySpec implements LicenseControlInfoInterface {
    public static final int KEY_LEN = 32;
    public static final int KEY_SIZE = 8;
    public static final int MODE_CBC = 32;
    public static final int MODE_CFB = 128;
    public static final int MODE_CNT = 64;
    public static final int MODE_CTR = 2048;
    public static final int MODE_CTR_ACPKM = 4096;
    public static final int MODE_ECB = 16;
    public static final int MODE_GCM = 2097152;
    public static final int MODE_KEXP_2015_K_EXPORT = 262144;
    public static final int MODE_KEXP_2015_M_EXPORT = 131072;
    public static final int MODE_MGM_K_EXPORT = 1048576;
    public static final int MODE_MGM_M_EXPORT = 524288;
    public static final int MODE_OMAC_CTR = 8192;
    public static final int MODE_PRO12_EXPORT = 65536;
    public static final int MODE_PRO_EXPORT = 16384;
    public static final int MODE_SIMPLE_EXPORT = 32768;
    public static final int SECRET_CONTEXT_POOL_SIZE;
    public static final int SECRET_CONTEXT_POOL_SIZE_DEFAULT = 8;
    public static final String UNWRAP_ERR = "UnwrapWrapError";
    public static final boolean USE_SECRET_CONTEXT_POOL = GetProperty.getBooleanProperty("use_secret_context_pool", false);
    public static final String WRAP_ERR = "WrapError";
    private static final int a = 2048;
    static final /* synthetic */ boolean b = true;
    private static final int c;
    private static ru.CryptoPro.JCSP.tools.cl_0 d;
    private SecretKeyImpl e;
    private SecretKeyImpl f;
    private SecretKeyImpl g;

    public static class cl_0 {
        private cl_0() {
            ru.CryptoPro.JCSP.tools.cl_0 unused = SecretKeyImpl.d = new ru.CryptoPro.JCSP.tools.cl_0(SecretKeyImpl.c);
        }
    }

    public static class cl_1 {
        private static final cl_0 a = new cl_0();

        private cl_1() {
        }
    }

    static {
        int integerProperty = GetProperty.getIntegerProperty("secret_context_pool_size", 8);
        SECRET_CONTEXT_POOL_SIZE = integerProperty;
        c = integerProperty > 0 ? integerProperty : 8;
    }

    public SecretKeyImpl(HKey hKey, SecretKeyImpl secretKeyImpl) throws CloneNotSupportedException {
        super(hKey, secretKeyImpl);
        this.e = null;
        this.f = null;
        this.g = null;
        SecretKeyImpl secretKeyImpl2 = secretKeyImpl.g;
        if (secretKeyImpl2 != null) {
            this.g = (SecretKeyImpl) secretKeyImpl2.clone();
        }
        SecretKeyImpl secretKeyImpl3 = secretKeyImpl.e;
        if (secretKeyImpl3 != null) {
            this.e = (SecretKeyImpl) secretKeyImpl3.clone();
        }
        SecretKeyImpl secretKeyImpl4 = secretKeyImpl.f;
        if (secretKeyImpl4 != null) {
            this.f = (SecretKeyImpl) secretKeyImpl4.clone();
        }
    }

    private JCSPMasterKeyInterface a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, boolean z) throws InvalidKeyException, KeyManagementException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        if (!z) {
            JCSPLogger.fine("SecretKeyImpl:preHashMaster() key algorithm = " + this.insideKey.getKeyAlg());
            JCSPLogger.fine("SecretKeyImpl:preHashMaster() set PRF algorithm = " + i);
            SchannelAlgStructure schannelAlgStructure = new SchannelAlgStructure(2, i, 0);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                schannelAlgStructure.write(byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.reset();
                this.insideKey.setOIDParam(20, byteArray);
                JCSPLogger.fine("SecretKeyImpl:preHashMaster() set encryption algorithm = " + i2 + " with IV length = " + i3);
                try {
                    new SchannelAlgStructure(1, i2, i3).write(byteArrayOutputStream);
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.reset();
                    this.insideKey.setOIDParam(20, byteArray2);
                    JCSPLogger.fine("SecretKeyImpl:preHashMaster() set MAC algorithm = " + i2);
                    try {
                        new SchannelAlgStructure(0, i2, 0).write(byteArrayOutputStream);
                        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.reset();
                        this.insideKey.setOIDParam(20, byteArray3);
                    } catch (StructException e) {
                        InvalidKeyException invalidKeyException = new InvalidKeyException("Unable set SCHANNEL_MAC_KEY");
                        invalidKeyException.initCause(e);
                        throw invalidKeyException;
                    }
                } catch (StructException e2) {
                    InvalidKeyException invalidKeyException2 = new InvalidKeyException("Unable to set SCHANNEL_ENC_KEY");
                    invalidKeyException2.initCause(e2);
                    throw invalidKeyException2;
                }
            } catch (StructException e3) {
                InvalidKeyException invalidKeyException3 = new InvalidKeyException("Unable to set SCHANNEL_PRF_ALG");
                invalidKeyException3.initCause(e3);
                throw invalidKeyException3;
            }
        }
        if (bArr == null || bArr.length <= 0) {
            JCSPLogger.fine("SecretKeyImpl:preHashMaster() set client random");
            this.insideKey.setOIDParam(21, bArr2);
            JCSPLogger.fine("SecretKeyImpl:preHashMaster() set server random");
            this.insideKey.setOIDParam(22, bArr3);
        } else {
            JCSPLogger.fine("SecretKeyImpl:preHashMaster() set session hash");
            this.insideKey.setOIDParam(110, bArr);
        }
        JCSPLogger.fine("SecretKeyImpl:preHashMaster() pre-hash algorithm: " + i);
        this.insideKey.setOIDParam(34, Array.toByteArray(i));
        try {
            try {
                this.insideKey.readLock();
                return MasterKeySpec.getInstance(this.insideKey);
            } catch (CloneNotSupportedException e4) {
                throw new KeyManagementException(e4);
            }
        } finally {
            this.insideKey.readUnlock();
        }
    }

    private static void c() {
        cl_0 cl_0Var = cl_1.a;
        if (b || cl_0Var != null) {
            return;
        }
        ny61.w();
    }

    public static JCSPSecretKeySpec create(int i, boolean z, AlgIdInterface algIdInterface, EllipticParamsInterface ellipticParamsInterface) throws KeyManagementException {
        JCSPLogger.enter();
        JCSPSecretKeySpec jCSPSecretKeySpec = JCSPSecretKeySpec.getInstance(createKey(i, z, algIdInterface, ellipticParamsInterface), i);
        JCSPLogger.exit();
        return jCSPSecretKeySpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v10, types: [ru.CryptoPro.JCSP.MSCAPI.HProv] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ru.CryptoPro.JCSP.MSCAPI.HProv] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static HKey createKey(int i, boolean z, AlgIdInterface algIdInterface, EllipticParamsInterface ellipticParamsInterface) throws KeyManagementException {
        ?? cSPProvECDSA;
        JCSPLogger.enter();
        boolean isForeignSecretKey = HKey.isForeignSecretKey(i);
        HProv hProv = null;
        try {
            try {
                boolean z2 = USE_SECRET_CONTEXT_POOL;
                if (z2) {
                    c();
                    cSPProvECDSA = d.a(isForeignSecretKey ? algIdInterface.getOID().equals(AlgIdSpecForeign.OID_ECDSA) ? 16 : algIdInterface.getOID().equals(AlgIdSpecForeign.OID_EDDSA) ? 32 : 24 : 80);
                } else {
                    cSPProvECDSA = isForeignSecretKey ? algIdInterface.getOID().equals(AlgIdSpecForeign.OID_ECDSA) ? new CSPProvECDSA() : algIdInterface.getOID().equals(AlgIdSpecForeign.OID_EDDSA) ? new CSPProvEDDSA() : new CSPProvRSA() : new CSPProv2012_256();
                    try {
                        cSPProvECDSA.createWithoutContainer();
                        cSPProvECDSA = cSPProvECDSA;
                    } catch (UnrecoverableKeyException e) {
                        e = e;
                        throw new KeyManagementException(e);
                    } catch (Throwable th) {
                        th = th;
                        hProv = cSPProvECDSA;
                        if (!USE_SECRET_CONTEXT_POOL && hProv != null) {
                            hProv.releaseContext(4);
                        }
                        throw th;
                    }
                }
                boolean z3 = CAPI.isCSPLicenseExported;
                ?? r7 = z;
                r7 = z;
                r7 = z;
                if (z3 && !isForeignSecretKey && ellipticParamsInterface != null) {
                    r7 = (z ? 1 : 0) | 524352;
                }
                HKey newKey = cSPProvECDSA.newKey(i, r7);
                if (i == 26142) {
                    newKey.setOIDParam(104, CryptParamsSpec.getInstance().getDefault(null).toByteZ());
                }
                if (z3 && !isForeignSecretKey && ellipticParamsInterface != null) {
                    newKey.setOIDParam(106, ellipticParamsInterface.getOID().toByteZ());
                }
                JCSPLogger.exit();
                if (!z2) {
                    cSPProvECDSA.releaseContext(4);
                }
                return newKey;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (UnrecoverableKeyException e2) {
            e = e2;
        }
    }

    public static JCSPSecretKeySpec derivePBKDF2(PBEKeySpec pBEKeySpec, int i) throws InvalidKeySpecException {
        JCSPLogger.subEnter();
        if (pBEKeySpec.getSalt() == null || pBEKeySpec.getPassword() == null) {
            throw new InvalidKeySpecException("Password and salt can not be null");
        }
        HHash hHash = null;
        HProv instanceByParamSet = HProv.getInstanceByParamSet(new AlgIdSpec((OID) null));
        String providerNameByType = DefaultCSPProvider.getProviderNameByType(instanceByParamSet.getProvType());
        int keyLength = pBEKeySpec.getKeyLength();
        if (keyLength == 0) {
            keyLength = 32826;
        }
        if (keyLength != 32832 && keyLength != 32827 && keyLength != 32826) {
            throw new InvalidKeySpecException(oyr.i(keyLength, "Invalid PBKDF2 algorithm "));
        }
        try {
            try {
                instanceByParamSet.createWithoutContainer(providerNameByType);
                hHash = instanceByParamSet.initHashGR3411(keyLength);
                hHash.setHashParam(23, pBEKeySpec.getSalt());
                if (pBEKeySpec instanceof JCPPBEKeySpec) {
                    hHash.setHashParam(24, ((JCPPBEKeySpec) pBEKeySpec).getPasswd());
                } else {
                    hHash.setHashParam(24, new String(pBEKeySpec.getPassword()).getBytes(StandardCharsets.UTF_8));
                }
                hHash.setHashParam(25, Array.toByteArray(pBEKeySpec.getIterationCount()));
                HKey cryptDeriveKey = hHash.cryptDeriveKey(i, 1);
                JCSPLogger.subExit();
                JCSPSecretKeySpec jCSPSecretKeySpec = JCSPSecretKeySpec.getInstance(cryptDeriveKey, i);
                hHash.destroyHash();
                instanceByParamSet.releaseContext(4);
                return jCSPSecretKeySpec;
            } catch (MSException e) {
                throw new InvalidKeySpecException(e);
            }
        } catch (Throwable th) {
            if (hHash != null) {
                hHash.destroyHash();
            }
            instanceByParamSet.releaseContext(4);
            throw th;
        }
    }

    public static HKey importRawKey(byte[] bArr, int i, int i2, AlgIdInterface algIdInterface) {
        JCSPLogger.subEnter();
        HProv instanceByParamSet = HProv.getInstanceByParamSet(algIdInterface);
        String providerNameByType = DefaultCSPProvider.getProviderNameByType(instanceByParamSet.getProvType());
        String providerName = algIdInterface instanceof ProviderParameterInterface ? ((ProviderParameterInterface) algIdInterface).getProviderName() : null;
        if (providerName != null) {
            providerNameByType = providerName;
        }
        try {
            instanceByParamSet.createWithoutContainer(providerNameByType);
            HKey a2 = HKey.isForeignKey(i) ? bArr.length > 64 ? a(instanceByParamSet, bArr, i, 1) : a(instanceByParamSet, bArr, i, 32782, (bArr.length << 19) | 1) : a(instanceByParamSet, bArr, i, i2, 1);
            JCSPLogger.subExit();
            instanceByParamSet.releaseContext(4);
            return a2;
        } catch (Throwable th) {
            instanceByParamSet.releaseContext(4);
            throw th;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public abstract /* synthetic */ Object clone2() throws CloneNotSupportedException;

    @Override // ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public int getAppropriateCryptMode() {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return 0;
        }
        int keyAlg = this.insideKey.getKeyAlg();
        if (keyAlg == 26142 || keyAlg == 26161 || keyAlg == 26160) {
            return 2032;
        }
        if (keyAlg == 26143) {
            return 16384;
        }
        if (keyAlg == 26144) {
            return 32768;
        }
        if (keyAlg == 26145) {
            return 65536;
        }
        if (keyAlg == 26148) {
            return 131072;
        }
        if (keyAlg == 26149) {
            return 262144;
        }
        if (keyAlg == 26153) {
            return 524288;
        }
        if (keyAlg == 26154) {
            return 1048576;
        }
        ny61.g(oyr.i(keyAlg, "Cannot find crypt mode for key with algorithm "));
        return 0;
    }

    public long getC1() {
        return 0L;
    }

    public long getC2() {
        return 0L;
    }

    public long getC3() {
        return 0L;
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractKeySpec
    public int getKeyType() {
        return -2147483643;
    }

    @Override // ru.CryptoPro.JCP.params.LicenseControlInfoInterface
    public byte[] getLicenseControlInfo() {
        if (!CAPI.isCSPLicenseExported) {
            return null;
        }
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return null;
        }
        try {
            return this.insideKey.getKeyParam(HKey.KP_LIC_CONTROL_INFO);
        } catch (MSException e) {
            yci0.r(e);
            return null;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public boolean getMixMode() {
        if (!this.destroyed) {
            return this.insideKey.getMixMode() != 0;
        }
        ny61.r("The key has been destroyed.");
        return false;
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public SecretKeyInterface getWorkKey() {
        return this.g;
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public JCSPMasterKeyInterface preHashMaster(byte[] bArr, int i, int i2, int i3, boolean z) throws InvalidKeyException, KeyManagementException {
        return a(bArr, null, null, i, i2, i3, z);
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setAlgorithmIdentifierByCryptMode(int i) throws InvalidKeyException {
        int i2;
        if ((i & 2032) != 0) {
            i2 = this instanceof JCSPSecretKeySpecM ? 26160 : this instanceof JCSPSecretKeySpecK ? 26161 : 26142;
        } else if (i == 16384) {
            if (this instanceof JCSPSecretKeySpecM) {
                super.setAlgorithmIdentifier(HProv.CALG_MGM_EXPORT_M);
                return;
            } else {
                if (this instanceof JCSPSecretKeySpecK) {
                    super.setAlgorithmIdentifier(HProv.CALG_MGM_EXPORT_K);
                    return;
                }
                i2 = HProv.CALG_PRO_EXPORT;
            }
        } else if (i == 131072) {
            i2 = HProv.CALG_KEXP_2015_M;
        } else if (i == 262144) {
            i2 = HProv.CALG_KEXP_2015_K;
        } else {
            if (i == 524288) {
                super.setAlgorithmIdentifier(HProv.CALG_MGM_EXPORT_M);
                return;
            }
            if (i == 1048576) {
                super.setAlgorithmIdentifier(HProv.CALG_MGM_EXPORT_K);
                return;
            } else if (i == 32768) {
                i2 = HProv.CALG_SIMPLE_EXPORT;
            } else if (i != 65536) {
                return;
            } else {
                i2 = HProv.CALG_PRO12_EXPORT;
            }
        }
        super.setAlgorithmIdentifier(i2);
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setMixMode(boolean z) {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
        } else {
            this.insideKey.setMixMode(z);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public void setModeBits(int i) {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
        } else {
            this.insideKey.setModeBits(i);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface, ru.CryptoPro.JCP.Key.SecretKeyInterface
    public boolean updateTLSKey(long j, int i) throws InvalidKeyException {
        SecretKeyImpl secretKeyImpl;
        long j2;
        int i2;
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return false;
        }
        boolean a2 = a(j, getC1());
        boolean a3 = a(j, getC2());
        boolean a4 = a(j, getC3());
        if (a2 || this.e == null) {
            SecretKeyImpl secretKeyImpl2 = this.e;
            if (secretKeyImpl2 != null) {
                secretKeyImpl2.clear();
            }
            secretKeyImpl = this;
            j2 = j;
            i2 = i;
            secretKeyImpl.e = (SecretKeyImpl) secretKeyImpl.a("level1", j, getC1(), i);
        } else {
            secretKeyImpl = this;
            j2 = j;
            i2 = i;
        }
        if (a3 || secretKeyImpl.f == null) {
            SecretKeyImpl secretKeyImpl3 = secretKeyImpl.f;
            if (secretKeyImpl3 != null) {
                secretKeyImpl3.clear();
            }
            secretKeyImpl.f = (SecretKeyImpl) secretKeyImpl.e.a("level2", j2, secretKeyImpl.getC2(), i2);
        }
        if (!a4 && secretKeyImpl.g != null) {
            return true;
        }
        SecretKeyImpl secretKeyImpl4 = secretKeyImpl.g;
        if (secretKeyImpl4 != null) {
            secretKeyImpl4.clear();
        }
        secretKeyImpl.g = (SecretKeyImpl) secretKeyImpl.f.a("level3", j2, secretKeyImpl.getC3(), i2);
        return true;
    }

    @Override // ru.CryptoPro.JCSP.Key.AbstractEncryptionKeySpec, ru.CryptoPro.JCSP.Key.JCSPSecretKeyInterface
    public JCSPMasterKeyInterface preHashMaster(byte[] bArr, byte[] bArr2, int i, int i2, int i3, boolean z) throws InvalidKeyException, KeyManagementException {
        return a(null, bArr, bArr2, i, i2, i3, z);
    }

    public SecretKeyImpl(AlgIdInterface algIdInterface, boolean z) {
        super(algIdInterface, z, false, true);
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public SecretKeyImpl(HKey hKey, AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup) {
        super(hKey, keyAlgorithmGroup);
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public SecretKeyImpl(AlgIdInterface algIdInterface, String str) {
        super(algIdInterface, str);
        this.e = null;
        this.f = null;
        this.g = null;
    }

    private JCSPSecretKeyInterface a(String str, long j, long j2, int i) throws InvalidKeyException {
        JCSPSecretKeySpecK jCSPSecretKeySpecK;
        JCSPLogger.subEnter();
        JCSPSecretKeyInterface jCSPSecretKeyInterface = (JCSPSecretKeyInterface) ((GostSecretKey) diversKeyByBlob(i, new KdfTreeDiversKeySpec(null, str.getBytes(), 1, Array.toByteArrayI(j & j2), 256, 1))).getSpec();
        if (i != 26161) {
            if (i == 26160) {
                jCSPSecretKeySpecK = (JCSPSecretKeySpecM) jCSPSecretKeyInterface;
            }
            JCSPLogger.subExit();
            return jCSPSecretKeyInterface;
        }
        jCSPSecretKeySpecK = (JCSPSecretKeySpecK) jCSPSecretKeyInterface;
        jCSPSecretKeySpecK.setNeedMacSize(true);
        JCSPLogger.subExit();
        return jCSPSecretKeyInterface;
    }

    private static HKey a(HProv hProv, byte[] bArr, int i, int i2) {
        JCSPLogger.subEnter();
        HKey hKey = null;
        try {
            try {
                hKey = hProv.genKey(26115, 0);
                byte[] copyOf = Arrays.copyOf(bArr, Math.max(hKey.getEncryptBufferLength(true, bArr.length), bArr.length));
                hKey.encrypt(true, copyOf, new int[]{bArr.length});
                SimpleBlobForeignStructure simpleBlobForeignStructure = new SimpleBlobForeignStructure(i, 26115, copyOf);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                simpleBlobForeignStructure.write(byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                JCSPLogger.subExit();
                HKey importSessionSecretKey = hKey.importSessionSecretKey(byteArray, i2, AlgorithmGroups.KeyAlgorithmGroup.RSA.ordinal());
                hKey.destroyKey();
                return importSessionSecretKey;
            } catch (Exception e) {
                throw new IllegalArgumentException("Import of key failed.", e);
            }
        } catch (Throwable th) {
            if (hKey != null) {
                hKey.destroyKey();
            }
            throw th;
        }
    }

    private static HKey a(HProv hProv, byte[] bArr, int i, int i2, int i3) {
        JCSPLogger.subEnter();
        HHash hHash = null;
        try {
            try {
                hHash = hProv.initHash(i2, null, null, null, 0);
                hHash.setHashValue(bArr);
                JCSPLogger.subExit();
                HKey cryptDeriveKey = hHash.cryptDeriveKey(i, i3);
                hHash.destroyHash();
                return cryptDeriveKey;
            } catch (Exception e) {
                throw new IllegalArgumentException("Import of key failed.", e);
            }
        } finally {
        }
    }

    private static boolean a(long j, long j2) {
        return j == 0 || ((j - 1) & j2) != (j & j2);
    }
}
