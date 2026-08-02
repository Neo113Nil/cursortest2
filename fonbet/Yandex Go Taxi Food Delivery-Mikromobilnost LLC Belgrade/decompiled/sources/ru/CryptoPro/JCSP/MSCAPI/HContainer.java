package ru.CryptoPro.JCSP.MSCAPI;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1OpenType;
import defpackage.ny61;
import defpackage.unr0;
import java.io.IOException;
import java.security.AccessControlException;
import java.security.InvalidKeyException;
import java.security.KeyException;
import java.security.KeyStoreException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostPrivateCertificateStore;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.KeyStore.InvalidAliasException;
import ru.CryptoPro.JCP.KeyStore.InvalidPasswordException;
import ru.CryptoPro.JCP.KeyStore.KeyIsNotExportableException;
import ru.CryptoPro.JCP.KeyStore.NoSuchKeyException;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.DiversKeyBase;
import ru.CryptoPro.JCP.params.ECDSAParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.spec.NameAlgIdSpec;
import ru.CryptoPro.JCP.spec.NameAlgIdSpecForeign;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.CSPVersionDependentAlgorithms;
import ru.CryptoPro.JCSP.CStructReader.ContainerExtensionStructure;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.Key.ContainerPassword;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase;
import ru.CryptoPro.JCSP.params.DefaultCSPProvider;

/* loaded from: classes4.dex */
public class HContainer {
    public static final int EPHEMERAL_CONTEXT_POOL_SIZE;
    public static final int EPHEMERAL_CONTEXT_POOL_SIZE_DEFAULT = 8;
    public static final boolean USE_EPHEMERAL_CONTEXT_POOL = GetProperty.getBooleanProperty("use_ephemeral_context_pool", false);
    static final /* synthetic */ boolean a = true;
    private static final int c;
    private static ru.CryptoPro.JCSP.tools.cl_0 d;
    private final String b;

    public static class cl_0 {
        private cl_0() {
            ru.CryptoPro.JCSP.tools.cl_0 unused = HContainer.d = new ru.CryptoPro.JCSP.tools.cl_0(HContainer.c);
        }
    }

    public static class cl_1 {
        private static final cl_0 a = new cl_0();

        private cl_1() {
        }
    }

    static {
        int integerProperty = GetProperty.getIntegerProperty("ephemeral_context_pool_size", 8);
        EPHEMERAL_CONTEXT_POOL_SIZE = integerProperty;
        c = integerProperty > 0 ? integerProperty : 8;
    }

    public HContainer(String str) {
        this.b = str;
    }

    private static void a(HProv hProv, AlgIdInterface algIdInterface, int i) {
        JCSPLogger.subEnter();
        if (algIdInterface == null) {
            JCSPLogger.subExit();
            return;
        }
        if (i != -2147483643) {
            if (algIdInterface.getCryptParams() != null) {
                hProv.setOIDParam(93, algIdInterface.getCryptParams().getOID().toByteZ());
            }
            if (algIdInterface.getDigestParams() != null && !algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_256) && !algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_512) && !algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) && !algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
                hProv.setOIDParam(92, algIdInterface.getDigestParams().getOID().toByteZ());
            }
            if (algIdInterface.getOID().equals(AlgIdSpec.OID_19)) {
                if (algIdInterface.getSignParams() != null) {
                    hProv.setOIDParam(94, algIdInterface.getSignParams().getOID().toByteZ());
                }
            } else if (algIdInterface.getOID().equals(AlgIdSpec.OID_98)) {
                if (algIdInterface.getSignParams() != null) {
                    hProv.setOIDParam(95, algIdInterface.getSignParams().getOID().toByteZ());
                }
            } else if (algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_256) || algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_512) || algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) || algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
                if (algIdInterface.getSignParams() != null) {
                    if (i == 1) {
                        hProv.setOIDParam(95, algIdInterface.getSignParams().getOID().toByteZ());
                    } else if (i == 2) {
                        hProv.setOIDParam(94, algIdInterface.getSignParams().getOID().toByteZ());
                    }
                }
            } else if ((algIdInterface.getOID().equals(AlgIdSpecForeign.OID_ECDSA) || algIdInterface.getOID().equals(AlgIdSpecForeign.OID_ECDH)) && algIdInterface.getSignParams() != null && algIdInterface.getSignParams().getOID().equals(ECDSAParamsSpec.OID_ECDSA_SECP256K1)) {
                if (!hProv.isSupported(2)) {
                    ny61.g(unr0.p("Koblitz curve is not supported in this version of CryptPro CSP ", CAPI.CSP_PROVIDER_INFO.getFormattedVersion(), ". Update CryptPro CSP to version ", CSPVersionDependentAlgorithms.CSP_SUPPORT_KOBLITZ.getFormattedVersion(), " or higher."));
                    return;
                } else if (i == 1) {
                    hProv.setOIDParam(95, algIdInterface.getSignParams().getOID().toByteZ());
                } else if (i == 2) {
                    hProv.setOIDParam(94, algIdInterface.getSignParams().getOID().toByteZ());
                }
            }
        }
        JCSPLogger.subExit();
    }

    private static void b() {
        cl_0 cl_0Var = cl_1.a;
        if (a || cl_0Var != null) {
            return;
        }
        ny61.w();
    }

    public static void changePassword(HKey hKey, ContainerPassword containerPassword) {
        if (hKey != null) {
            hKey.setNewPassword(containerPassword);
        }
    }

    public static HKey copyOtherForeignKey(ru.CryptoPro.JCSP.KeyStore.cl_0 cl_0Var, ReaderInfo readerInfo, ContainerPassword containerPassword, String str, byte[] bArr, boolean z, boolean z2, ContainerPassword containerPassword2, boolean z3) throws KeyIsNotExportableException, UnrecoverableKeyException {
        return a(cl_0Var, readerInfo, containerPassword, str, bArr, z, z2, containerPassword2, z3);
    }

    public static int getAlgorithmIdByName(String str) {
        str.getClass();
        switch (str) {
            case "CP_3DES_112":
            case "3DES_112":
                return 26121;
            case "AES":
            case "CP_AES":
                return HProv.CALG_AES;
            case "DES":
            case "CP_DES":
                return 26113;
            case "3DES":
            case "TripleDES":
            case "CP_3DES":
            case "DESede":
                return 26115;
            default:
                return 0;
        }
    }

    public static int getKeyCount(String str, ReaderInfo readerInfo, String str2, int i) {
        try {
            return HProv.b(str, readerInfo, str2, i);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean isExist(String str, ReaderInfo readerInfo, String str2, int i) {
        try {
            return HProv.a(str, readerInfo, str2, i);
        } catch (UnrecoverableKeyException unused) {
            return true;
        }
    }

    public static void setPassword(HKey hKey, ContainerPassword containerPassword) throws InvalidPasswordException {
        if (hKey != null) {
            hKey.setPassword(true, containerPassword);
        }
    }

    public void clear(HKey hKey) {
        if (hKey != null) {
            hKey.destroyKey();
        }
    }

    public HKey copy(HKey hKey, ru.CryptoPro.JCSP.KeyStore.cl_0 cl_0Var, ReaderInfo readerInfo, ContainerPassword containerPassword, int i, boolean z, ContainerPassword containerPassword2, boolean z2, boolean z3) throws KeyIsNotExportableException, UnrecoverableKeyException {
        return a(hKey, cl_0Var, readerInfo, containerPassword, i, z, containerPassword2, z2, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if (r15 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        r1.openContainerWithSetPin(r2.d(), r0, r16, 0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a2, code lost:
    
        r1.openContainer(r2.d(), r0, r16, 0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0043, code lost:
    
        r6 = r17.getReaders().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004f, code lost:
    
        if (r6.hasNext() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0051, code lost:
    
        r8 = (ru.CryptoPro.JCSP.MSCAPI.ReaderInfo) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005f, code lost:
    
        if (r8.getReaderPseudo().equalsIgnoreCase(r5) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0061, code lost:
    
        r0 = r8.getProviderName(r0);
        r5 = r8.getReaderName();
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4 A[Catch: all -> 0x0029, InvalidAliasException -> 0x002d, MSException -> 0x0031, IllegalArgumentException -> 0x0035, UnrecoverableKeyException -> 0x0039, AccessControlException | InvalidPasswordException -> 0x003d, TryCatch #5 {InvalidAliasException -> 0x002d, blocks: (B:3:0x0010, B:5:0x0014, B:7:0x001f, B:11:0x006b, B:13:0x0082, B:16:0x0089, B:17:0x0090, B:21:0x0095, B:26:0x00f6, B:28:0x00fa, B:30:0x00fe, B:34:0x0108, B:35:0x0111, B:37:0x0119, B:39:0x011f, B:40:0x012c, B:43:0x0102, B:45:0x00cc, B:47:0x00d8, B:51:0x00f3, B:52:0x00e7, B:54:0x00eb, B:55:0x00f0, B:56:0x00ee, B:57:0x00a2, B:60:0x00b4, B:61:0x00b8, B:63:0x0043, B:64:0x004b, B:66:0x0051, B:69:0x0061, B:75:0x00c1), top: B:2:0x0010, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8 A[Catch: all -> 0x0029, InvalidAliasException -> 0x002d, MSException -> 0x0031, IllegalArgumentException -> 0x0035, UnrecoverableKeyException -> 0x0039, AccessControlException | InvalidPasswordException -> 0x003d, TryCatch #5 {InvalidAliasException -> 0x002d, blocks: (B:3:0x0010, B:5:0x0014, B:7:0x001f, B:11:0x006b, B:13:0x0082, B:16:0x0089, B:17:0x0090, B:21:0x0095, B:26:0x00f6, B:28:0x00fa, B:30:0x00fe, B:34:0x0108, B:35:0x0111, B:37:0x0119, B:39:0x011f, B:40:0x012c, B:43:0x0102, B:45:0x00cc, B:47:0x00d8, B:51:0x00f3, B:52:0x00e7, B:54:0x00eb, B:55:0x00f0, B:56:0x00ee, B:57:0x00a2, B:60:0x00b4, B:61:0x00b8, B:63:0x0043, B:64:0x004b, B:66:0x0051, B:69:0x0061, B:75:0x00c1), top: B:2:0x0010, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HKey create(int i, int i2, int i3, AlgIdInterface algIdInterface, boolean z, ContainerPassword containerPassword, KeyStoreConfigBase keyStoreConfigBase, String str, boolean z2) throws UnrecoverableKeyException {
        AlgIdInterface algIdSpec;
        String str2;
        boolean isExist;
        JCSPLogger.subEnter();
        HProv instanceByParamSet = HProv.getInstanceByParamSet(algIdInterface);
        int provType = instanceByParamSet.getProvType();
        String providerNameByType = DefaultCSPProvider.getProviderNameByType(provType);
        try {
            try {
                try {
                    try {
                        String str3 = this.b;
                        if (str3 != null) {
                            ru.CryptoPro.JCSP.KeyStore.cl_0 a2 = ru.CryptoPro.JCSP.KeyStore.cl_0.a(null, str3, null);
                            String b = a2.b();
                            if (str != null && !HProv.isForeignProvider(str)) {
                                str2 = str;
                                ru.CryptoPro.JCSP.KeyStore.cl_0 cl_0Var = new ru.CryptoPro.JCSP.KeyStore.cl_0(str2, b, a2.c(), null);
                                isExist = isExist(cl_0Var.d(), null, str2, instanceByParamSet.getProvType());
                                if (isExist && HKey.isSecretKey(i)) {
                                    throw new UnrecoverableKeyException("Rewriting secret key is forbidden.");
                                }
                                String str4 = str2;
                                if (z) {
                                    instanceByParamSet.createContainer(cl_0Var, str4, containerPassword);
                                } else {
                                    instanceByParamSet.createContainerWithSetPin(cl_0Var, str4, containerPassword);
                                }
                            }
                            str2 = providerNameByType;
                            ru.CryptoPro.JCSP.KeyStore.cl_0 cl_0Var2 = new ru.CryptoPro.JCSP.KeyStore.cl_0(str2, b, a2.c(), null);
                            isExist = isExist(cl_0Var2.d(), null, str2, instanceByParamSet.getProvType());
                            if (isExist) {
                                throw new UnrecoverableKeyException("Rewriting secret key is forbidden.");
                            }
                            String str42 = str2;
                            if (z) {
                            }
                        } else {
                            if (str != null) {
                                providerNameByType = str;
                            }
                            instanceByParamSet.createWithoutContainer(providerNameByType);
                        }
                        if (i == 2 || i == 1) {
                            if (algIdInterface != null && !algIdInterface.getOID().equals(AlgIdSpec.OID_19) && !algIdInterface.getOID().equals(AlgIdSpec.OID_98)) {
                                algIdSpec = algIdInterface;
                                a(instanceByParamSet, algIdSpec, i);
                            }
                            algIdSpec = new AlgIdSpec(i == 2 ? AlgIdSpec.OID_19 : AlgIdSpec.OID_98);
                            a(instanceByParamSet, algIdSpec, i);
                        }
                        if ((instanceByParamSet instanceof CSPProvRSA) || (instanceByParamSet instanceof CSPProvECDSA) || (instanceByParamSet instanceof CSPProvEDDSA)) {
                            i2 |= i3 << 16;
                        }
                        if (z2) {
                            instanceByParamSet.setProvParam(100, instanceByParamSet.getProvParam(100, 0), 0);
                        }
                        HKey newKey = instanceByParamSet.newKey(i, i2);
                        if (this.b != null && newKey.isSecretKey()) {
                            newKey.setKeyParam(HKey.KP_STORE, Array.toByteArray(-2147483643), 0);
                        }
                        JCSPLogger.subExit();
                        instanceByParamSet.releaseContext(4);
                        return newKey;
                    } catch (InvalidAliasException e) {
                        throw ((UnrecoverableKeyException) new UnrecoverableKeyException("Invalid alias").initCause(e));
                    }
                } catch (AccessControlException | InvalidPasswordException e2) {
                    throw ((UnrecoverableKeyException) new UnrecoverableKeyException("Wrong Password").initCause(e2));
                } catch (UnrecoverableKeyException e3) {
                    throw ((UnrecoverableKeyException) new UnrecoverableKeyException("No such key").initCause(e3));
                }
            } catch (IllegalArgumentException e4) {
                throw e4;
            } catch (MSException e5) {
                throw ((UnrecoverableKeyException) new UnrecoverableKeyException("Set KP_STORE error").initCause(e5));
            }
        } catch (Throwable th) {
            instanceByParamSet.releaseContext(4);
            throw th;
        }
    }

    public HKey createEPH(int i, int i2, int i3, AlgIdInterface algIdInterface) throws UnrecoverableKeyException {
        JCSPLogger.subEnter();
        HProv instanceByParamSet = HProv.getInstanceByParamSet(algIdInterface);
        try {
            try {
                boolean z = USE_EPHEMERAL_CONTEXT_POOL;
                if (z) {
                    b();
                    instanceByParamSet = d.a(instanceByParamSet.getProvType());
                } else {
                    instanceByParamSet.createWithoutContainer();
                }
                HKey newKey = instanceByParamSet.newKey(i, i3 | 64);
                a(algIdInterface, newKey);
                JCSPLogger.subExit();
                if (!z) {
                    instanceByParamSet.releaseContext(4);
                }
                return newKey;
            } catch (UnrecoverableKeyException e) {
                throw ((UnrecoverableKeyException) new UnrecoverableKeyException("No such key").initCause(e));
            } catch (MSException e2) {
                throw ((UnrecoverableKeyException) new UnrecoverableKeyException("No such key").initCause(e2));
            }
        } catch (Throwable th) {
            if (!USE_EPHEMERAL_CONTEXT_POOL) {
                instanceByParamSet.releaseContext(4);
            }
            throw th;
        }
    }

    public void forgetPassword(HKey hKey) {
        if (hKey != null) {
            hKey.forgetPassword();
        }
    }

    public byte[] genPublic(HKey hKey) {
        return hKey.genPublic();
    }

    public Extension getCertExtension(HKey hKey, Asn1ObjectIdentifier asn1ObjectIdentifier) {
        HProv provHandle;
        Vector enumContainerExtensions;
        JCSPLogger.subEnter();
        Extension extension = null;
        if (hKey != null && (provHandle = hKey.getProvHandle()) != null && (enumContainerExtensions = provHandle.enumContainerExtensions()) != null && !enumContainerExtensions.isEmpty()) {
            for (int i = 0; i < enumContainerExtensions.size(); i++) {
                ContainerExtensionStructure containerExtensionStructure = (ContainerExtensionStructure) enumContainerExtensions.elementAt(i);
                if (containerExtensionStructure.ifInit()) {
                    Asn1ObjectIdentifier asn1ObjectIdentifier2 = new Asn1ObjectIdentifier(OID.fromByteZ(containerExtensionStructure.sOid.value).value);
                    if (asn1ObjectIdentifier.equals(asn1ObjectIdentifier2) && containerExtensionStructure.ifInit()) {
                        extension = new Extension(asn1ObjectIdentifier2.value, containerExtensionStructure.bCritical.value != 0, containerExtensionStructure.pbExtension.value);
                    }
                }
            }
        }
        JCSPLogger.subExit();
        return extension;
    }

    public Certificate getCertificate(HKey hKey) {
        if (hKey != null) {
            return hKey.getCertificate();
        }
        return null;
    }

    public CryptParamsInterface getCryptParams(HKey hKey) {
        if (hKey == null || hKey.isForeignKey()) {
            return null;
        }
        return CryptParamsSpec.getInstance(hKey.getKeyAlg() != 26146 ? hKey.getOIDParam(104) : null);
    }

    public int getKeyLength(HKey hKey) {
        return hKey.getKeyLen();
    }

    public String getKeyName() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0094, code lost:
    
        if (r12 != 2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AlgIdInterface getParameters(HKey hKey, int i) {
        OID oid;
        OID oid2;
        AlgIdInterface algIdInterface;
        JCSPLogger.subEnter();
        AlgIdInterface algIdInterface2 = null;
        r0 = null;
        OID oIDParam = null;
        if (hKey != null) {
            AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup = hKey.getKeyAlgorithmGroup();
            if (keyAlgorithmGroup == AlgorithmGroups.KeyAlgorithmGroup.RSA) {
                return new NameAlgIdSpecForeign(getKeyName());
            }
            int keyAlg = hKey.getKeyAlg();
            boolean isSecretKey = hKey.isSecretKey();
            OID a2 = ru.CryptoPro.JCSP.MSCAPI.cl_0.a(keyAlg);
            OID oIDParam2 = (keyAlg == 26146 || keyAlg == 19462) ? null : hKey.getOIDParam(104);
            if (isSecretKey || a2 == null) {
                oid = null;
                oid2 = null;
            } else {
                OID oIDParam3 = hKey.getOIDParam(103);
                if (!a2.equals(AlgIdSpec.OID_98)) {
                    if (!a2.equals(AlgIdSpec.OID_19)) {
                        if (!a2.equals(AlgIdSpec.OID_PARAMS_SIG_2012_256) && !a2.equals(AlgIdSpec.OID_PARAMS_SIG_2012_512) && !a2.equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) && !a2.equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
                            if (a2.equals(AlgIdSpecForeign.OID_ECDSA) || a2.equals(AlgIdSpecForeign.OID_ECDH)) {
                                if (i != 1) {
                                }
                            }
                            oid = oIDParam;
                            oid2 = oIDParam3;
                        }
                    }
                    oIDParam = hKey.getOIDParam(105);
                    oid = oIDParam;
                    oid2 = oIDParam3;
                }
                oIDParam = hKey.getOIDParam(106);
                oid = oIDParam;
                oid2 = oIDParam3;
            }
            if (isSecretKey) {
                algIdInterface = new NameAlgIdSpec(a2, (ParamsInterface) null, (ParamsInterface) null, CryptParamsSpec.getInstance(oIDParam2), getKeyName());
            } else if (keyAlgorithmGroup == AlgorithmGroups.KeyAlgorithmGroup.ECDSA) {
                algIdInterface2 = new NameAlgIdSpecForeign(a2, oid, getKeyName());
            } else if (keyAlgorithmGroup == AlgorithmGroups.KeyAlgorithmGroup.EDDSA) {
                algIdInterface2 = new NameAlgIdSpecForeign(a2, getKeyName());
            } else {
                algIdInterface = new NameAlgIdSpec(a2, oid, oid2, oIDParam2, getKeyName());
            }
            algIdInterface2 = algIdInterface;
        }
        JCSPLogger.subExit();
        return algIdInterface2;
    }

    public byte[] getRawCertificate(HKey hKey) {
        if (hKey != null) {
            return hKey.getRawCertificate();
        }
        return null;
    }

    public byte[] getSign(HKey hKey, byte[] bArr, int i, int i2, int i3) {
        JCSPLogger.subEnter();
        HHash hHash = null;
        try {
            try {
                hHash = hKey.makeNewGostHash(i, false);
                hHash.setHashValue(bArr);
                byte[] a2 = hHash.a(i2, i3);
                hHash.destroyHash();
                JCSPLogger.subExit();
                return a2;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (Throwable th) {
            if (hHash != null) {
                hHash.destroyHash();
            }
            throw th;
        }
    }

    public boolean isEqualName(HKey hKey, String str, ReaderInfo readerInfo, String str2, int i) {
        if (!isExist(str, readerInfo, str2, i)) {
            return false;
        }
        if (str2 == null) {
            str2 = readerInfo.getProviderName(i);
        }
        HProv provider = HProv.getProvider(i);
        try {
            provider.readContextOnly(str, str2);
            return provider.getFullName().equals(hKey.getProvHandle().getFullName());
        } catch (Exception e) {
            JCSPLogger.subThrown(e);
            return false;
        } finally {
            provider.releaseContext(7);
        }
    }

    public boolean isExportable(HKey hKey) {
        return hKey.isExportable();
    }

    public HKey makeDHSessionKey(HKey hKey, PublicKeyInterface publicKeyInterface) {
        return hKey.makeDHSessionKey(publicKeyInterface);
    }

    public HKey makeDiversKey(HKey hKey, int i, DiversKeyBase diversKeyBase) {
        return hKey.makeDiversKey(i, diversKeyBase);
    }

    public HKey open(AlgIdInterface algIdInterface, String str, ReaderInfo readerInfo, int i, boolean z, ContainerPassword containerPassword, boolean z2, boolean z3) throws UnrecoverableKeyException {
        HProv instanceByParamSet;
        JCSPLogger.subEnter();
        if (str != null) {
            List providerTypes = readerInfo.getProviderTypes(str, readerInfo.getProviderTypes());
            if (providerTypes.isEmpty()) {
                StringBuilder x = unr0.x("Opening failed, no provider type found for provider name ", str, ". It may not support ");
                x.append(readerInfo.getReaderName());
                throw new UnrecoverableKeyException(x.toString());
            }
            instanceByParamSet = HProv.getProvider(((Integer) providerTypes.get(0)).intValue());
        } else {
            instanceByParamSet = HProv.getInstanceByParamSet(algIdInterface);
            int provType = instanceByParamSet.getProvType();
            List providerTypes2 = readerInfo.getProviderTypes();
            if (!readerInfo.containsProviderType(provType)) {
                if (providerTypes2.isEmpty()) {
                    throw new UnrecoverableKeyException("Opening failed, no provider type found to open the key container. No one provider may support " + readerInfo.getReaderName());
                }
                provType = ((Integer) providerTypes2.get(0)).intValue();
            }
            if (provType != instanceByParamSet.getProvType()) {
                instanceByParamSet = HProv.getProvider(provType);
            }
            str = readerInfo.getProviderName(instanceByParamSet.getProvType());
        }
        HProv hProv = instanceByParamSet;
        String str2 = str;
        int i2 = z2 ? 64 : 0;
        try {
            try {
                if (z) {
                    hProv.openContainerWithSetPin(getKeyName(), str2, containerPassword, i2, z3);
                } else {
                    hProv.openContainer(getKeyName(), str2, containerPassword, i2, z3);
                }
                JCSPLogger.subExit();
                HKey readKey = hProv.readKey(i);
                hProv.releaseContext(3);
                return readKey;
            } catch (AccessControlException e) {
                InvalidPasswordException invalidPasswordException = new InvalidPasswordException();
                invalidPasswordException.initCause(e);
                throw invalidPasswordException;
            } catch (InvalidPasswordException e2) {
                throw e2;
            } catch (UnrecoverableKeyException e3) {
                NoSuchKeyException noSuchKeyException = new NoSuchKeyException();
                noSuchKeyException.initCause(e3);
                throw noSuchKeyException;
            }
        } catch (Throwable th) {
            hProv.releaseContext(3);
            throw th;
        }
    }

    public void setAllCertificates(HKey hKey, Certificate[] certificateArr, int i) throws KeyStoreException {
        JCSPLogger.subEnter();
        if (certificateArr != null && certificateArr.length > 0) {
            Certificate[] certificateArr2 = new Certificate[certificateArr.length - 1];
            System.arraycopy(certificateArr, 1, certificateArr2, 0, certificateArr.length - 1);
            try {
                hKey.setCertificate(certificateArr[0]);
                a(hKey, i == 2, certificateArr2);
            } catch (CertificateEncodingException e) {
                throw new KeyStoreException("Certificate is not correct: " + e.getMessage(), e);
            }
        }
        JCSPLogger.subExit();
    }

    public void setCertExtension(HKey hKey, String str, boolean z, byte[] bArr) {
        HProv provHandle;
        if (hKey == null || (provHandle = hKey.getProvHandle()) == null) {
            return;
        }
        provHandle.setCertExtension(str, z, bArr);
    }

    public void setCertificate(HKey hKey, Certificate certificate) throws KeyException {
        try {
            hKey.setCertificate(certificate);
        } catch (IllegalArgumentException e) {
            throw new KeyException("Certificate is not correct: " + e.getMessage(), e);
        } catch (CertificateEncodingException e2) {
            throw new KeyException("Certificate is not correct: " + e2.getMessage(), e2);
        }
    }

    public byte[] getSign(HHash hHash, int i, int i2) {
        JCSPLogger.subEnter();
        byte[] a2 = hHash.a(i, i2);
        JCSPLogger.subExit();
        return a2;
    }

    public HKey open(AlgIdInterface algIdInterface, String str, ReaderInfo readerInfo, int i) throws UnrecoverableKeyException {
        return open(algIdInterface, str, readerInfo, i, false, null, false, false);
    }

    private static Asn1OctetString a(Certificate certificate) throws KeyStoreException {
        if (certificate == null) {
            return null;
        }
        try {
            return new Asn1OctetString(certificate.getEncoded());
        } catch (CertificateEncodingException e) {
            throw ru.CryptoPro.JCSP.KeyStore.cl_1.d(e);
        }
    }

    private static HKey a(ru.CryptoPro.JCSP.KeyStore.cl_0 cl_0Var, ReaderInfo readerInfo, ContainerPassword containerPassword, String str, byte[] bArr, boolean z, boolean z2, ContainerPassword containerPassword2, boolean z3) throws KeyIsNotExportableException, UnrecoverableKeyException {
        HKey copyPrivateForeignKeyFromPKCS8;
        JCSPLogger.subEnter();
        HProv d2 = AlgorithmGroups.d(AlgorithmGroups.a(str));
        String providerName = readerInfo.getProviderName(d2.getProvType());
        if (cl_0Var.a() != null) {
            providerName = cl_0Var.a();
        }
        String str2 = providerName;
        try {
            try {
                boolean isExist = isExist(cl_0Var.d(), readerInfo, str2, d2.getProvType());
                if (isExist) {
                    if (z2) {
                        d2.openContainerWithSetPin(cl_0Var.d(), str2, containerPassword, 0, false);
                    } else {
                        d2.openContainer(cl_0Var.d(), str2, containerPassword, 0, false);
                    }
                } else if (z2) {
                    d2.createContainerWithSetPin(cl_0Var, str2, containerPassword2);
                } else {
                    d2.createContainer(cl_0Var, str2, containerPassword2);
                }
                int algorithmIdByName = getAlgorithmIdByName(str);
                if (algorithmIdByName == 0 && z) {
                    throw new IllegalArgumentException("Unsupported algorithm of secret key: " + str);
                }
                if (algorithmIdByName == 26129) {
                    try {
                        algorithmIdByName = HKey.getAESAlgId(bArr);
                    } catch (InvalidKeyException e) {
                        throw new UnrecoverableKeyException(e.getMessage());
                    }
                }
                if ((57344 & algorithmIdByName) != 24576) {
                    try {
                        copyPrivateForeignKeyFromPKCS8 = HKey.copyPrivateForeignKeyFromPKCS8((HKey) null, str, true, bArr, d2, z3);
                        d2 = d2;
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        throw e;
                    } catch (UnrecoverableKeyException e3) {
                        e = e3;
                        throw e;
                    } catch (InvalidAliasException e4) {
                        e = e4;
                        throw ((UnrecoverableKeyException) new UnrecoverableKeyException("Invalid alias").initCause(e));
                    } catch (MSException e5) {
                        e = e5;
                        throw new IllegalArgumentException(e);
                    } catch (Throwable th) {
                        th = th;
                        d2 = d2;
                        Throwable th2 = th;
                        d2.releaseContext(4);
                        throw th2;
                    }
                } else {
                    if (isExist) {
                        throw new UnrecoverableKeyException("Rewriting secret key is forbidden.");
                    }
                    copyPrivateForeignKeyFromPKCS8 = HKey.a(algorithmIdByName, bArr, d2, z3);
                    copyPrivateForeignKeyFromPKCS8.setKeyParam(HKey.KP_STORE, Array.toByteArray(-2147483643), 0);
                }
                if (isExist && z2) {
                    copyPrivateForeignKeyFromPKCS8.setNewPassword(containerPassword2);
                }
                d2.releaseContext(4);
                JCSPLogger.subExit();
                return copyPrivateForeignKeyFromPKCS8;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IllegalArgumentException e6) {
            e = e6;
        } catch (UnrecoverableKeyException e7) {
            e = e7;
        } catch (InvalidAliasException e8) {
            e = e8;
        } catch (MSException e9) {
            e = e9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r15 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        r3.openContainerWithSetPin(r11.d(), r5, r13, 0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r3.openContainer(r11.d(), r5, r13, 0, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HKey a(HKey hKey, ru.CryptoPro.JCSP.KeyStore.cl_0 cl_0Var, ReaderInfo readerInfo, ContainerPassword containerPassword, int i, boolean z, ContainerPassword containerPassword2, boolean z2, boolean z3) throws KeyIsNotExportableException, UnrecoverableKeyException {
        JCSPLogger.subEnter();
        int keyAlg = hKey.getKeyAlg();
        int provType = hKey.getProvHandle().getProvType();
        HProv cSPProv2012_256 = (keyAlg == 11849 || keyAlg == 43590) ? new CSPProv2012_256() : (keyAlg == 11837 || keyAlg == 43586) ? new CSPProv2012_512() : AlgorithmGroups.d(HKey.getKeyAlgorithmGroup(keyAlg, provType));
        if (provType > cSPProv2012_256.getProvType()) {
            cSPProv2012_256 = AlgorithmGroups.b(provType);
        }
        HProv hProv = cSPProv2012_256;
        String a2 = cl_0Var.a() != null ? cl_0Var.a() : readerInfo.getProviderName(hProv.getProvType());
        try {
            try {
                try {
                    try {
                        try {
                            boolean isExist = isExist(cl_0Var.d(), readerInfo, a2, hProv.getProvType());
                            if (isExist && hKey.isSecretKey()) {
                                throw new UnrecoverableKeyException("Rewriting secret key is forbidden.");
                            }
                            if (z) {
                                hProv.createContainerWithSetPin(cl_0Var, a2, containerPassword2);
                            } else {
                                hProv.createContainer(cl_0Var, a2, containerPassword2);
                            }
                            a(hProv, getParameters(hKey, i), i);
                            HKey copyKey = hKey.copyKey(hProv, z2);
                            if (isExist && z) {
                                copyKey.setNewPassword(containerPassword2);
                            }
                            if (copyKey.isSecretKey()) {
                                copyKey.setKeyParam(HKey.KP_STORE, Array.toByteArray(-2147483643), 0);
                            }
                            hProv.releaseContext(4);
                            JCSPLogger.subExit();
                            return copyKey;
                        } catch (InvalidAliasException e) {
                            throw ((UnrecoverableKeyException) new UnrecoverableKeyException("Invalid alias").initCause(e));
                        }
                    } catch (MSException e2) {
                        throw new IllegalArgumentException(e2);
                    }
                } catch (UnrecoverableKeyException e3) {
                    throw e3;
                }
            } catch (IllegalArgumentException e4) {
                throw e4;
            } catch (KeyIsNotExportableException e5) {
                throw e5;
            }
        } catch (Throwable th) {
            hProv.releaseContext(4);
            throw th;
        }
    }

    private static void a(Exception exc) throws KeyStoreException {
        KeyStoreException keyStoreException = new KeyStoreException();
        keyStoreException.initCause(exc);
        throw keyStoreException;
    }

    private void a(AlgIdInterface algIdInterface, HKey hKey) throws MSException {
        JCSPLogger.subEnter();
        if (algIdInterface.getCryptParams() != null) {
            hKey.setKeyParam(104, algIdInterface.getCryptParams().getOID().toByteZ(), 0);
        }
        if (algIdInterface.getDigestParams() != null && !algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_256) && !algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_512) && !algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) && !algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
            hKey.setKeyParam(103, algIdInterface.getDigestParams().getOID().toByteZ(), 0);
        }
        hKey.setKeyParam(106, algIdInterface.getSignParams().getOID().toByteZ(), 0);
        hKey.setKeyParam(14, null, 0);
        JCSPLogger.subExit();
    }

    private void a(HKey hKey, Asn1ObjectIdentifier asn1ObjectIdentifier, boolean z, Certificate[] certificateArr) throws KeyStoreException {
        JCSPLogger.subEnter();
        if (certificateArr != null && certificateArr.length > 0) {
            Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
            GostPrivateCertificateStore gostPrivateCertificateStore = new GostPrivateCertificateStore(1);
            gostPrivateCertificateStore.elements[0] = new Asn1OpenType(a(certificateArr[certificateArr.length - 1]).value);
            try {
                gostPrivateCertificateStore.encode(asn1BerEncodeBuffer);
            } catch (Asn1Exception e) {
                a(e);
            }
            hKey.getProvHandle().setCertExtension(new OID(asn1ObjectIdentifier.value).toString(), false, asn1BerEncodeBuffer.getMsgCopy());
            asn1BerEncodeBuffer.reset();
            if (z && certificateArr.length > 1) {
                GostPrivateCertificateStore gostPrivateCertificateStore2 = new GostPrivateCertificateStore(certificateArr.length - 1);
                for (int i = 0; i < certificateArr.length - 1; i++) {
                    gostPrivateCertificateStore2.elements[i] = new Asn1OpenType(a(certificateArr[i]).value);
                }
                try {
                    gostPrivateCertificateStore2.encode(asn1BerEncodeBuffer);
                } catch (Asn1Exception e2) {
                    a(e2);
                }
                hKey.getProvHandle().setCertExtension(new OID(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_intermidiate_store).toString(), false, asn1BerEncodeBuffer.getMsgCopy());
            }
        }
        JCSPLogger.subExit();
    }

    private void a(HKey hKey, boolean z, Certificate[] certificateArr) throws KeyStoreException {
        int i;
        JCSPLogger.subEnter();
        Vector enumContainerExtensions = hKey.getProvHandle().enumContainerExtensions();
        Asn1ObjectIdentifier asn1ObjectIdentifier = z ? new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_signature_trust_store) : new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_exchange_trust_store);
        Asn1ObjectIdentifier asn1ObjectIdentifier2 = new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_intermidiate_store);
        if (certificateArr != null) {
            if (enumContainerExtensions == null || enumContainerExtensions.size() == 0) {
                a(hKey, asn1ObjectIdentifier, true, certificateArr);
            } else {
                int i2 = 0;
                Certificate[] certificateArr2 = certificateArr;
                boolean z2 = false;
                int i3 = 0;
                while (i3 < enumContainerExtensions.size()) {
                    ContainerExtensionStructure containerExtensionStructure = (ContainerExtensionStructure) enumContainerExtensions.elementAt(i3);
                    if (new Asn1ObjectIdentifier(OID.fromByteZ(containerExtensionStructure.sOid.value).value).equals(asn1ObjectIdentifier2)) {
                        byte[] bArr = containerExtensionStructure.ifInit() ? containerExtensionStructure.pbExtension.value : null;
                        if (bArr != null) {
                            Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(bArr);
                            GostPrivateCertificateStore gostPrivateCertificateStore = new GostPrivateCertificateStore();
                            try {
                                gostPrivateCertificateStore.decode(asn1BerDecodeBuffer);
                            } catch (Asn1Exception | IOException e) {
                                a(e);
                            }
                            int length = gostPrivateCertificateStore.elements.length;
                            byte[][] bArr2 = new byte[length][];
                            int i4 = i2;
                            while (true) {
                                Asn1OpenType[] asn1OpenTypeArr = gostPrivateCertificateStore.elements;
                                if (i4 >= asn1OpenTypeArr.length) {
                                    break;
                                }
                                bArr2[i4] = asn1OpenTypeArr[i4].value;
                                i4++;
                            }
                            int length2 = certificateArr2.length;
                            Certificate[] certificateArr3 = new Certificate[length2];
                            System.arraycopy(certificateArr2, i2, certificateArr3, i2, length2);
                            HashSet hashSet = new HashSet(Arrays.asList(certificateArr3));
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                Certificate certificate = (Certificate) it.next();
                                while (true) {
                                    if (i2 < length) {
                                        try {
                                        } catch (CertificateEncodingException e2) {
                                            a(e2);
                                        }
                                        if (Arrays.equals(certificate.getEncoded(), bArr2[i2])) {
                                            it.remove();
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                                i2 = 0;
                            }
                            Certificate[] certificateArr4 = (Certificate[]) hashSet.toArray(new Certificate[hashSet.size()]);
                            if (certificateArr4.length > 1) {
                                GostPrivateCertificateStore gostPrivateCertificateStore2 = new GostPrivateCertificateStore((certificateArr4.length - 1) + gostPrivateCertificateStore.elements.length);
                                Asn1OpenType[] asn1OpenTypeArr2 = gostPrivateCertificateStore.elements;
                                i = 0;
                                System.arraycopy(asn1OpenTypeArr2, 0, gostPrivateCertificateStore2.elements, 0, asn1OpenTypeArr2.length);
                                int length3 = gostPrivateCertificateStore.elements.length;
                                while (true) {
                                    Asn1OpenType[] asn1OpenTypeArr3 = gostPrivateCertificateStore2.elements;
                                    if (length3 >= asn1OpenTypeArr3.length) {
                                        break;
                                    }
                                    asn1OpenTypeArr3[length3] = new Asn1OpenType(a(certificateArr4[length3 - gostPrivateCertificateStore.elements.length]).value);
                                    length3++;
                                }
                                Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                                try {
                                    gostPrivateCertificateStore2.encode(asn1BerEncodeBuffer);
                                } catch (Asn1Exception e3) {
                                    a(e3);
                                }
                                setCertExtension(hKey, OID.fromByteZ(containerExtensionStructure.sOid.value).toString(), containerExtensionStructure.ifInit() && containerExtensionStructure.bCritical.value != 0, asn1BerEncodeBuffer.getMsgCopy());
                            } else {
                                i = 0;
                            }
                            certificateArr2 = certificateArr4;
                            z2 = true;
                            i3++;
                            i2 = i;
                        }
                    }
                    i = i2;
                    i3++;
                    i2 = i;
                }
                a(hKey, asn1ObjectIdentifier, !z2, certificateArr2);
            }
        }
        JCSPLogger.subExit();
    }
}
