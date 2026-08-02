package ru.CryptoPro.JCSP.Key;

import defpackage.kbs;
import defpackage.oyr;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfig;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigECDSA;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigEDDSA;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigRSA;
import ru.CryptoPro.JCSP.MSCAPI.CSPProv2001;
import ru.CryptoPro.JCSP.MSCAPI.CSPProv2012_256;
import ru.CryptoPro.JCSP.MSCAPI.CSPProv2012_512;
import ru.CryptoPro.JCSP.MSCAPI.CSPProvECDSA;
import ru.CryptoPro.JCSP.MSCAPI.CSPProvEDDSA;
import ru.CryptoPro.JCSP.MSCAPI.CSPProvRSA;
import ru.CryptoPro.JCSP.MSCAPI.CSPProvRSA_1;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class AlgorithmGroups {

    /* renamed from: ru.CryptoPro.JCSP.Key.AlgorithmGroups$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ru$CryptoPro$JCSP$Key$AlgorithmGroups$KeyAlgorithmGroup;

        static {
            int[] iArr = new int[KeyAlgorithmGroup.values().length];
            $SwitchMap$ru$CryptoPro$JCSP$Key$AlgorithmGroups$KeyAlgorithmGroup = iArr;
            try {
                iArr[KeyAlgorithmGroup.RSA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$CryptoPro$JCSP$Key$AlgorithmGroups$KeyAlgorithmGroup[KeyAlgorithmGroup.ECDSA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$CryptoPro$JCSP$Key$AlgorithmGroups$KeyAlgorithmGroup[KeyAlgorithmGroup.EDDSA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum KeyAlgorithmGroup {
        GOST,
        RSA,
        ECDSA,
        EDDSA,
        Unknown
    }

    public enum KeyAlgorithmType {
        Unknown,
        Asymmetric,
        Symmetric
    }

    public static AlgIdInterface a(int i, OID oid, OID oid2, OID oid3) {
        if (i == 8707) {
            return new AlgIdSpecForeign(AlgIdSpecForeign.OID_ECDSA, oid);
        }
        if (i == 8736) {
            return new AlgIdSpecForeign(AlgIdSpecForeign.OID_EDDSA);
        }
        if (i != 9216) {
            if (i == 11811) {
                return new AlgIdSpec(AlgIdSpec.OID_19, oid, oid2, oid3);
            }
            if (i == 11837) {
                return new AlgIdSpec(AlgIdSpec.OID_PARAMS_SIG_2012_512, oid, oid2, oid3);
            }
            if (i == 11849) {
                return new AlgIdSpec(AlgIdSpec.OID_PARAMS_SIG_2012_256, oid, oid2, oid3);
            }
            if (i != 41984) {
                if (i != 43525) {
                    return null;
                }
                return new AlgIdSpecForeign(AlgIdSpecForeign.OID_ECDH, oid);
            }
        }
        return new AlgIdSpecForeign(AlgIdSpecForeign.OID_RSA);
    }

    public static HProv b(OID oid) {
        if (oid.equals(AlgIdSpec.OID_PARAMS_SIG_2012_256) || oid.equals(AlgIdSpec.OID_PARAMS_EXC_2012_256)) {
            return new CSPProv2012_256();
        }
        if (oid.equals(AlgIdSpec.OID_PARAMS_SIG_2012_512) || oid.equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
            return new CSPProv2012_512();
        }
        if (oid.equals(AlgIdSpec.OID_19) || oid.equals(AlgIdSpec.OID_98)) {
            return new CSPProv2001();
        }
        if (oid.equals(AlgIdSpecForeign.OID_RSA)) {
            return new CSPProvRSA();
        }
        if (oid.equals(AlgIdSpecForeign.OID_ECDSA) || oid.equals(AlgIdSpecForeign.OID_ECDH)) {
            return new CSPProvECDSA();
        }
        if (oid.equals(AlgIdSpecForeign.OID_EDDSA)) {
            return new CSPProvEDDSA();
        }
        kbs.f(oid, "Invalid parameter set: ");
        return null;
    }

    public static AlgIdInterface c(int i) {
        return i != 16 ? i != 24 ? i != 32 ? new AlgIdSpec((OID) null) : new AlgIdSpecForeign(AlgIdSpecForeign.OID_EDDSA) : new AlgIdSpecForeign(AlgIdSpecForeign.OID_RSA) : new AlgIdSpecForeign(AlgIdSpecForeign.OID_ECDSA);
    }

    public static HProv d(KeyAlgorithmGroup keyAlgorithmGroup) {
        int i = AnonymousClass1.$SwitchMap$ru$CryptoPro$JCSP$Key$AlgorithmGroups$KeyAlgorithmGroup[keyAlgorithmGroup.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? new CSPProv2001() : new CSPProvEDDSA() : new CSPProvECDSA() : new CSPProvRSA();
    }

    public static KeyStoreConfigBase c(KeyAlgorithmGroup keyAlgorithmGroup) {
        int i = AnonymousClass1.$SwitchMap$ru$CryptoPro$JCSP$Key$AlgorithmGroups$KeyAlgorithmGroup[keyAlgorithmGroup.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? KeyStoreConfig.getInstance() : KeyStoreConfigEDDSA.getInstance() : KeyStoreConfigECDSA.getInstance() : KeyStoreConfigRSA.getInstance();
    }

    public static KeyAlgorithmGroup a(int i) {
        if (i != 8707) {
            if (i == 8736) {
                return KeyAlgorithmGroup.EDDSA;
            }
            if (i == 9216 || i == 41984) {
                return KeyAlgorithmGroup.RSA;
            }
            if (i != 43525) {
                return KeyAlgorithmGroup.GOST;
            }
        }
        return KeyAlgorithmGroup.ECDSA;
    }

    public static KeyAlgorithmGroup a(String str) {
        return (str.equalsIgnoreCase("RSA") || str.equalsIgnoreCase("CP_RSA")) ? KeyAlgorithmGroup.RSA : (str.equalsIgnoreCase(JCP.ECDSA_NAME) || str.equalsIgnoreCase(JCP.CP_ECDSA_NAME) || str.equalsIgnoreCase(JCP.ECDH_NAME) || str.equalsIgnoreCase(JCP.CP_ECDH_NAME) || str.equalsIgnoreCase("EC")) ? KeyAlgorithmGroup.ECDSA : (str.equalsIgnoreCase("Ed25519") || str.equalsIgnoreCase("CP_Ed25519")) ? KeyAlgorithmGroup.EDDSA : KeyAlgorithmGroup.GOST;
    }

    public static KeyAlgorithmGroup a(OID oid) {
        return oid.equals(AlgIdSpecForeign.OID_RSA) ? KeyAlgorithmGroup.RSA : (oid.equals(AlgIdSpecForeign.OID_ECDSA) || oid.equals(AlgIdSpecForeign.OID_ECDH)) ? KeyAlgorithmGroup.ECDSA : oid.equals(AlgIdSpecForeign.OID_EDDSA) ? KeyAlgorithmGroup.EDDSA : KeyAlgorithmGroup.GOST;
    }

    public static HProv a(int i, long j) throws Exception {
        if (i == 1) {
            return new CSPProvRSA_1(j);
        }
        if (i == 16) {
            return new CSPProvECDSA(j);
        }
        if (i == 24) {
            return new CSPProvRSA(j);
        }
        if (i == 32) {
            return new CSPProvEDDSA(j);
        }
        if (i == 80) {
            return new CSPProv2012_256(j);
        }
        if (i == 81) {
            return new CSPProv2012_512(j);
        }
        throw new Exception(oyr.i(i, "Invalid provider type: "));
    }

    public static boolean a(KeyAlgorithmGroup keyAlgorithmGroup) {
        return keyAlgorithmGroup != KeyAlgorithmGroup.GOST;
    }

    public static HProv b(int i) {
        return i != 16 ? i != 24 ? i != 32 ? i != 80 ? i != 81 ? new CSPProv2001() : new CSPProv2012_512() : new CSPProv2012_256() : new CSPProvEDDSA() : new CSPProvRSA() : new CSPProvECDSA();
    }

    public static boolean b(String str) {
        return str.equalsIgnoreCase("RSA") || str.equalsIgnoreCase("CP_RSA") || str.equalsIgnoreCase(JCP.ECDSA_NAME) || str.equalsIgnoreCase(JCP.CP_ECDSA_NAME) || str.equalsIgnoreCase(JCP.ECDH_NAME) || str.equalsIgnoreCase(JCP.CP_ECDH_NAME) || str.equalsIgnoreCase("Ed25519") || str.equalsIgnoreCase("CP_Ed25519") || str.equalsIgnoreCase("EC");
    }

    public static boolean b(KeyAlgorithmGroup keyAlgorithmGroup) {
        return keyAlgorithmGroup == KeyAlgorithmGroup.RSA || keyAlgorithmGroup == KeyAlgorithmGroup.ECDSA || keyAlgorithmGroup == KeyAlgorithmGroup.EDDSA || keyAlgorithmGroup == KeyAlgorithmGroup.GOST;
    }
}
