package ru.CryptoPro.JCP.params;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1Type;
import defpackage.nzs;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Vector;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_ParamSet;
import ru.CryptoPro.JCP.ASN.GostR3410_2001_PKISyntax.GostR3410_2001_PublicKeyParameters;
import ru.CryptoPro.JCP.ASN.GostR3410_2012_PKISyntax.GostR3410_2012_PublicKeyParameters;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88._gost2001DHPubKey_Type;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88._gost2001PubKey_Type;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88._gost2012_256DH_PubKey_Type;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88._gost2012_256_PubKey_Type;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88._gost2012_512DH_PubKey_Type;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88._gost2012_512_PubKey_Type;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.pref.JCPRes;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class AlgIdSpec implements AlgIdInterface {
    public static final Object A;
    public static OID B;
    public static final Object C;
    public static final Object D;
    public static OID E;
    public static final Object F;
    public static final Object G;
    public static final OID[] H;
    public static final Class[] I;
    public static final OID OID_19;
    public static final OID OID_21;
    public static final OID OID_3;
    public static final OID OID_9;
    public static final OID OID_98;
    public static final OID OID_DIGEST_2012_256;
    public static final OID OID_DIGEST_2012_512;
    public static final OID OID_PARAMS_EXC_2012_256;
    public static final OID OID_PARAMS_EXC_2012_512;
    public static final OID OID_PARAMS_SIG_2012_256;
    public static final OID OID_PARAMS_SIG_2012_512;
    public static final OID OID_SIGN_2012_256;
    public static final OID OID_SIGN_2012_512;
    public static final String S_OID_19;
    public static final String S_OID_21;
    public static final String S_OID_3;
    public static final String S_OID_9;
    public static final String S_OID_98;
    public static final String S_OID_DIGEST_2012_256;
    public static final String S_OID_DIGEST_2012_512;
    public static final String S_OID_PARAMS_EXC_2012_256;
    public static final String S_OID_PARAMS_EXC_2012_512;
    public static final String S_OID_PARAMS_SIG_2012_256;
    public static final String S_OID_PARAMS_SIG_2012_512;
    public static final String S_OID_SIGN_2012_256;
    public static final String S_OID_SIGN_2012_512;
    public static OID x;
    public static final Object y;
    public static OID z;
    public final OID a;
    public final ParamsInterface b;
    public ParamsInterface c;
    public ParamsInterface w;

    static {
        OID oid = new OID("1.2.643.2.2.19");
        OID_19 = oid;
        OID oid2 = new OID("1.2.643.2.2.98");
        OID_98 = oid2;
        OID oid3 = new OID("1.2.643.2.2.3");
        OID_3 = oid3;
        OID oid4 = new OID("1.2.643.7.1.1.3.2");
        OID_SIGN_2012_256 = oid4;
        OID oid5 = new OID("1.2.643.7.1.1.3.3");
        OID_SIGN_2012_512 = oid5;
        OID oid6 = new OID("1.2.643.7.1.1.1.1");
        OID_PARAMS_SIG_2012_256 = oid6;
        OID oid7 = new OID("1.2.643.7.1.1.6.1");
        OID_PARAMS_EXC_2012_256 = oid7;
        OID oid8 = new OID("1.2.643.7.1.1.1.2");
        OID_PARAMS_SIG_2012_512 = oid8;
        OID oid9 = new OID("1.2.643.7.1.1.6.2");
        OID_PARAMS_EXC_2012_512 = oid9;
        OID oid10 = new OID("1.2.643.2.2.9");
        OID_9 = oid10;
        OID oid11 = new OID("1.2.643.7.1.1.2.2");
        OID_DIGEST_2012_256 = oid11;
        OID oid12 = new OID("1.2.643.7.1.1.2.3");
        OID_DIGEST_2012_512 = oid12;
        OID oid13 = new OID("1.2.643.2.2.21");
        OID_21 = oid13;
        y = new Object();
        A = new Object();
        C = new Object();
        D = new Object();
        F = new Object();
        G = new Object();
        final String str = "AlgIdSpec_class_default";
        final String str2 = "AlgIdSpec_class_defaultDH";
        OID[] oidArr = (OID[]) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.params.AlgIdSpec.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                JCPPref jCPPref = new JCPPref(AlgIdSpec.class);
                return new OID[]{jCPPref.getOID(str, null), jCPPref.getOID(str2, null)};
            }
        });
        OID oid14 = oidArr[0];
        OID oid15 = oidArr[1];
        final String str3 = "AlgIdSpec_2012_256_class_default";
        final String str4 = "AlgIdSpec_2012_256_dh_class_defaultDH";
        OID[] oidArr2 = (OID[]) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.params.AlgIdSpec.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                JCPPref jCPPref = new JCPPref(AlgIdSpec.class);
                return new OID[]{jCPPref.getOID(str3, null), jCPPref.getOID(str4, null)};
            }
        });
        OID oid16 = oidArr2[0];
        OID oid17 = oidArr2[1];
        final String str5 = "AlgIdSpec_2012_512_class_default";
        final String str6 = "AlgIdSpec_2012_512_dh_class_defaultDH";
        OID[] oidArr3 = (OID[]) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.params.AlgIdSpec.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                JCPPref jCPPref = new JCPPref(AlgIdSpec.class);
                return new OID[]{jCPPref.getOID(str5, null), jCPPref.getOID(str6, null)};
            }
        });
        OID oid18 = oidArr3[0];
        OID oid19 = oidArr3[1];
        S_OID_19 = JCPRes.getOIDdecl(oid);
        S_OID_98 = JCPRes.getOIDdecl(oid2);
        S_OID_3 = JCPRes.getOIDdecl(oid3);
        S_OID_9 = JCPRes.getOIDdecl(oid10);
        S_OID_DIGEST_2012_256 = JCPRes.getOIDdecl(oid11);
        S_OID_DIGEST_2012_512 = JCPRes.getOIDdecl(oid12);
        S_OID_PARAMS_SIG_2012_256 = JCPRes.getOIDdecl(oid6);
        S_OID_PARAMS_SIG_2012_512 = JCPRes.getOIDdecl(oid8);
        S_OID_PARAMS_EXC_2012_256 = JCPRes.getOIDdecl(oid7);
        S_OID_PARAMS_EXC_2012_512 = JCPRes.getOIDdecl(oid9);
        S_OID_SIGN_2012_256 = JCPRes.getOIDdecl(oid4);
        S_OID_SIGN_2012_512 = JCPRes.getOIDdecl(oid5);
        S_OID_21 = JCPRes.getOIDdecl(oid13);
        if (oid14 == null) {
            x = oid;
        } else {
            x = oid14;
        }
        if (oid15 == null) {
            z = oid2;
        } else {
            z = oid15;
        }
        if (oid16 == null) {
            B = oid6;
        } else {
            B = oid16;
        }
        if (oid18 == null) {
            E = oid8;
        } else {
            E = oid18;
        }
        H = new OID[]{oid, oid2, oid13, oid6, oid7, oid8, oid9};
        I = new Class[]{EllipticParamsSpec.class, EllipticParamsSpecDH.class, EllipticParamsSpec.class, EllipticParamsSpec.class, EllipticParamsSpecDH.class, EllipticParamsSpec2012_512.class, EllipticParamsSpecDH2012_512.class};
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AlgIdSpec(AlgorithmIdentifier algorithmIdentifier) {
        ParamsInterface ellipticParamsSpecDH;
        int i;
        DigestParamsSpec digestParamsSpec;
        OID oid = new OID(algorithmIdentifier.algorithm.value);
        this.a = oid;
        OID oid2 = OID_98;
        if (oid.equals(oid2) || oid.equals(OID_PARAMS_EXC_2012_256)) {
            ellipticParamsSpecDH = EllipticParamsSpecDH.getInstance(EllipticParamsSpec.OID_ECCDHPRO);
        } else {
            if (!oid.equals(OID_19) && !oid.equals(OID_3) && !oid.equals(OID_PARAMS_SIG_2012_256)) {
                if (oid.equals(OID_PARAMS_SIG_2012_512)) {
                    ellipticParamsSpecDH = EllipticParamsSpec2012_512.getInstance(EllipticParamsSpec2012_512.OID_tc26_gost_3410_12_512_paramSetA);
                } else if (oid.equals(OID_PARAMS_EXC_2012_512)) {
                    ellipticParamsSpecDH = EllipticParamsSpecDH2012_512.getInstance(EllipticParamsSpec2012_512.OID_tc26_gost_3410_12_512_paramSetA);
                }
            }
            ellipticParamsSpecDH = EllipticParamsSpec.getInstance(EllipticParamsSpec.OID_ECCSignDHPRO);
        }
        this.b = ellipticParamsSpecDH;
        OID oid3 = OID_PARAMS_SIG_2012_256;
        if (oid.equals(oid3) || oid.equals(OID_PARAMS_EXC_2012_256)) {
            i = 5;
        } else {
            if (!oid.equals(OID_PARAMS_SIG_2012_512) && !oid.equals(OID_PARAMS_EXC_2012_512)) {
                digestParamsSpec = DigestParamsSpec.getInstance(1);
                this.c = digestParamsSpec;
                this.w = (!oid.equals(oid3) || oid.equals(OID_PARAMS_EXC_2012_256) || oid.equals(OID_PARAMS_SIG_2012_512) || oid.equals(OID_PARAMS_EXC_2012_512)) ? CryptParamsSpec.getInstance(14) : CryptParamsSpec.getInstance(1);
                if (oid.equals(OID_19) && ((_gost2001PubKey_Type) algorithmIdentifier.parameters).getChoiceID() == 2) {
                    GostR3410_2001_PublicKeyParameters gostR3410_2001_PublicKeyParameters = (GostR3410_2001_PublicKeyParameters) ((_gost2001PubKey_Type) algorithmIdentifier.parameters).getElement();
                    OID oid4 = new OID(gostR3410_2001_PublicKeyParameters.publicKeyParamSet.value);
                    this.b = EllipticParamsSpec.getInstance(new OID(gostR3410_2001_PublicKeyParameters.publicKeyParamSet.value));
                    DigestParamsSpec digestParamsSpec2 = DigestParamsSpec.getInstance(new OID(gostR3410_2001_PublicKeyParameters.digestParamSet.value));
                    Gost28147_89_ParamSet gost28147_89_ParamSet = gostR3410_2001_PublicKeyParameters.encryptionParamSet;
                    CryptParamsSpec cryptParamsSpec = gost28147_89_ParamSet == null ? CryptParamsSpec.getInstance(new OID(gost28147_89_ParamSet.value)) : null;
                    a(oid4, digestParamsSpec2.getOID(), cryptParamsSpec == null ? cryptParamsSpec.getOID() : null);
                }
                if (oid.equals(oid3) && ((_gost2012_256_PubKey_Type) algorithmIdentifier.parameters).getChoiceID() == 2) {
                    GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters = (GostR3410_2012_PublicKeyParameters) ((_gost2012_256_PubKey_Type) algorithmIdentifier.parameters).getElement();
                    OID oid5 = new OID(gostR3410_2012_PublicKeyParameters.publicKeyParamSet.value);
                    this.b = EllipticParamsSpec.getInstance(oid5);
                    Asn1ObjectIdentifier asn1ObjectIdentifier = gostR3410_2012_PublicKeyParameters.digestParamSet;
                    DigestParamsSpec digestParamsSpec3 = asn1ObjectIdentifier == null ? DigestParamsSpec.getInstance(new OID(asn1ObjectIdentifier.value)) : null;
                    Asn1ObjectIdentifier asn1ObjectIdentifier2 = gostR3410_2012_PublicKeyParameters.encryptionParamSet;
                    CryptParamsSpec cryptParamsSpec2 = asn1ObjectIdentifier2 == null ? CryptParamsSpec.getInstance(new OID(asn1ObjectIdentifier2.value)) : null;
                    a(oid5, digestParamsSpec3 == null ? digestParamsSpec3.getOID() : null, cryptParamsSpec2 == null ? cryptParamsSpec2.getOID() : null);
                }
                if (oid.equals(OID_PARAMS_SIG_2012_512) && ((_gost2012_512_PubKey_Type) algorithmIdentifier.parameters).getChoiceID() == 2) {
                    GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters2 = (GostR3410_2012_PublicKeyParameters) ((_gost2012_512_PubKey_Type) algorithmIdentifier.parameters).getElement();
                    OID oid6 = new OID(gostR3410_2012_PublicKeyParameters2.publicKeyParamSet.value);
                    this.b = EllipticParamsSpec2012_512.getInstance(new OID(gostR3410_2012_PublicKeyParameters2.publicKeyParamSet.value));
                    Asn1ObjectIdentifier asn1ObjectIdentifier3 = gostR3410_2012_PublicKeyParameters2.digestParamSet;
                    DigestParamsSpec digestParamsSpec4 = asn1ObjectIdentifier3 == null ? DigestParamsSpec.getInstance(new OID(asn1ObjectIdentifier3.value)) : null;
                    Asn1ObjectIdentifier asn1ObjectIdentifier4 = gostR3410_2012_PublicKeyParameters2.encryptionParamSet;
                    CryptParamsSpec cryptParamsSpec3 = asn1ObjectIdentifier4 == null ? CryptParamsSpec.getInstance(new OID(asn1ObjectIdentifier4.value)) : null;
                    a(oid6, digestParamsSpec4 == null ? digestParamsSpec4.getOID() : null, cryptParamsSpec3 == null ? cryptParamsSpec3.getOID() : null);
                }
                if (oid.equals(OID_PARAMS_EXC_2012_256) && ((_gost2012_256DH_PubKey_Type) algorithmIdentifier.parameters).getChoiceID() == 2) {
                    GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters3 = (GostR3410_2012_PublicKeyParameters) ((_gost2012_256DH_PubKey_Type) algorithmIdentifier.parameters).getElement();
                    OID oid7 = new OID(gostR3410_2012_PublicKeyParameters3.publicKeyParamSet.value);
                    this.b = EllipticParamsSpecDH.getInstance(oid7);
                    Asn1ObjectIdentifier asn1ObjectIdentifier5 = gostR3410_2012_PublicKeyParameters3.digestParamSet;
                    DigestParamsSpec digestParamsSpec5 = asn1ObjectIdentifier5 == null ? DigestParamsSpec.getInstance(new OID(asn1ObjectIdentifier5.value)) : null;
                    Asn1ObjectIdentifier asn1ObjectIdentifier6 = gostR3410_2012_PublicKeyParameters3.encryptionParamSet;
                    CryptParamsSpec cryptParamsSpec4 = asn1ObjectIdentifier6 == null ? CryptParamsSpec.getInstance(new OID(asn1ObjectIdentifier6.value)) : null;
                    a(oid7, digestParamsSpec5 == null ? digestParamsSpec5.getOID() : null, cryptParamsSpec4 == null ? cryptParamsSpec4.getOID() : null);
                }
                if (oid.equals(OID_PARAMS_EXC_2012_512) && ((_gost2012_512DH_PubKey_Type) algorithmIdentifier.parameters).getChoiceID() == 2) {
                    GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters4 = (GostR3410_2012_PublicKeyParameters) ((_gost2012_512DH_PubKey_Type) algorithmIdentifier.parameters).getElement();
                    OID oid8 = new OID(gostR3410_2012_PublicKeyParameters4.publicKeyParamSet.value);
                    this.b = EllipticParamsSpecDH2012_512.getInstance(new OID(gostR3410_2012_PublicKeyParameters4.publicKeyParamSet.value));
                    Asn1ObjectIdentifier asn1ObjectIdentifier7 = gostR3410_2012_PublicKeyParameters4.digestParamSet;
                    DigestParamsSpec digestParamsSpec6 = asn1ObjectIdentifier7 == null ? DigestParamsSpec.getInstance(new OID(asn1ObjectIdentifier7.value)) : null;
                    Asn1ObjectIdentifier asn1ObjectIdentifier8 = gostR3410_2012_PublicKeyParameters4.encryptionParamSet;
                    CryptParamsSpec cryptParamsSpec5 = asn1ObjectIdentifier8 == null ? CryptParamsSpec.getInstance(new OID(asn1ObjectIdentifier8.value)) : null;
                    a(oid8, digestParamsSpec6 == null ? digestParamsSpec6.getOID() : null, cryptParamsSpec5 == null ? cryptParamsSpec5.getOID() : null);
                }
                if (oid.equals(oid2) || ((_gost2001DHPubKey_Type) algorithmIdentifier.parameters).getChoiceID() != 2) {
                }
                GostR3410_2001_PublicKeyParameters gostR3410_2001_PublicKeyParameters2 = (GostR3410_2001_PublicKeyParameters) ((_gost2001DHPubKey_Type) algorithmIdentifier.parameters).getElement();
                OID oid9 = new OID(gostR3410_2001_PublicKeyParameters2.publicKeyParamSet.value);
                this.b = EllipticParamsSpecDH.getInstance(new OID(gostR3410_2001_PublicKeyParameters2.publicKeyParamSet.value));
                Asn1ObjectIdentifier asn1ObjectIdentifier9 = gostR3410_2001_PublicKeyParameters2.digestParamSet;
                DigestParamsSpec digestParamsSpec7 = asn1ObjectIdentifier9 != null ? DigestParamsSpec.getInstance(new OID(asn1ObjectIdentifier9.value)) : null;
                Gost28147_89_ParamSet gost28147_89_ParamSet2 = gostR3410_2001_PublicKeyParameters2.encryptionParamSet;
                CryptParamsSpec cryptParamsSpec6 = gost28147_89_ParamSet2 != null ? CryptParamsSpec.getInstance(new OID(gost28147_89_ParamSet2.value)) : null;
                a(oid9, digestParamsSpec7 != null ? digestParamsSpec7.getOID() : null, cryptParamsSpec6 != null ? cryptParamsSpec6.getOID() : null);
                return;
            }
            i = 6;
        }
        digestParamsSpec = DigestParamsSpec.getInstance(i);
        this.c = digestParamsSpec;
        this.w = (!oid.equals(oid3) || oid.equals(OID_PARAMS_EXC_2012_256) || oid.equals(OID_PARAMS_SIG_2012_512) || oid.equals(OID_PARAMS_EXC_2012_512)) ? CryptParamsSpec.getInstance(14) : CryptParamsSpec.getInstance(1);
        if (oid.equals(OID_19)) {
            GostR3410_2001_PublicKeyParameters gostR3410_2001_PublicKeyParameters3 = (GostR3410_2001_PublicKeyParameters) ((_gost2001PubKey_Type) algorithmIdentifier.parameters).getElement();
            OID oid42 = new OID(gostR3410_2001_PublicKeyParameters3.publicKeyParamSet.value);
            this.b = EllipticParamsSpec.getInstance(new OID(gostR3410_2001_PublicKeyParameters3.publicKeyParamSet.value));
            DigestParamsSpec digestParamsSpec22 = DigestParamsSpec.getInstance(new OID(gostR3410_2001_PublicKeyParameters3.digestParamSet.value));
            Gost28147_89_ParamSet gost28147_89_ParamSet3 = gostR3410_2001_PublicKeyParameters3.encryptionParamSet;
            if (gost28147_89_ParamSet3 == null) {
            }
            a(oid42, digestParamsSpec22.getOID(), cryptParamsSpec == null ? cryptParamsSpec.getOID() : null);
        }
        if (oid.equals(oid3)) {
            GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters5 = (GostR3410_2012_PublicKeyParameters) ((_gost2012_256_PubKey_Type) algorithmIdentifier.parameters).getElement();
            OID oid52 = new OID(gostR3410_2012_PublicKeyParameters5.publicKeyParamSet.value);
            this.b = EllipticParamsSpec.getInstance(oid52);
            Asn1ObjectIdentifier asn1ObjectIdentifier10 = gostR3410_2012_PublicKeyParameters5.digestParamSet;
            if (asn1ObjectIdentifier10 == null) {
            }
            Asn1ObjectIdentifier asn1ObjectIdentifier22 = gostR3410_2012_PublicKeyParameters5.encryptionParamSet;
            if (asn1ObjectIdentifier22 == null) {
            }
            a(oid52, digestParamsSpec3 == null ? digestParamsSpec3.getOID() : null, cryptParamsSpec2 == null ? cryptParamsSpec2.getOID() : null);
        }
        if (oid.equals(OID_PARAMS_SIG_2012_512)) {
            GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters22 = (GostR3410_2012_PublicKeyParameters) ((_gost2012_512_PubKey_Type) algorithmIdentifier.parameters).getElement();
            OID oid62 = new OID(gostR3410_2012_PublicKeyParameters22.publicKeyParamSet.value);
            this.b = EllipticParamsSpec2012_512.getInstance(new OID(gostR3410_2012_PublicKeyParameters22.publicKeyParamSet.value));
            Asn1ObjectIdentifier asn1ObjectIdentifier32 = gostR3410_2012_PublicKeyParameters22.digestParamSet;
            if (asn1ObjectIdentifier32 == null) {
            }
            Asn1ObjectIdentifier asn1ObjectIdentifier42 = gostR3410_2012_PublicKeyParameters22.encryptionParamSet;
            if (asn1ObjectIdentifier42 == null) {
            }
            a(oid62, digestParamsSpec4 == null ? digestParamsSpec4.getOID() : null, cryptParamsSpec3 == null ? cryptParamsSpec3.getOID() : null);
        }
        if (oid.equals(OID_PARAMS_EXC_2012_256)) {
            GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters32 = (GostR3410_2012_PublicKeyParameters) ((_gost2012_256DH_PubKey_Type) algorithmIdentifier.parameters).getElement();
            OID oid72 = new OID(gostR3410_2012_PublicKeyParameters32.publicKeyParamSet.value);
            this.b = EllipticParamsSpecDH.getInstance(oid72);
            Asn1ObjectIdentifier asn1ObjectIdentifier52 = gostR3410_2012_PublicKeyParameters32.digestParamSet;
            if (asn1ObjectIdentifier52 == null) {
            }
            Asn1ObjectIdentifier asn1ObjectIdentifier62 = gostR3410_2012_PublicKeyParameters32.encryptionParamSet;
            if (asn1ObjectIdentifier62 == null) {
            }
            a(oid72, digestParamsSpec5 == null ? digestParamsSpec5.getOID() : null, cryptParamsSpec4 == null ? cryptParamsSpec4.getOID() : null);
        }
        if (oid.equals(OID_PARAMS_EXC_2012_512)) {
            GostR3410_2012_PublicKeyParameters gostR3410_2012_PublicKeyParameters42 = (GostR3410_2012_PublicKeyParameters) ((_gost2012_512DH_PubKey_Type) algorithmIdentifier.parameters).getElement();
            OID oid82 = new OID(gostR3410_2012_PublicKeyParameters42.publicKeyParamSet.value);
            this.b = EllipticParamsSpecDH2012_512.getInstance(new OID(gostR3410_2012_PublicKeyParameters42.publicKeyParamSet.value));
            Asn1ObjectIdentifier asn1ObjectIdentifier72 = gostR3410_2012_PublicKeyParameters42.digestParamSet;
            if (asn1ObjectIdentifier72 == null) {
            }
            Asn1ObjectIdentifier asn1ObjectIdentifier82 = gostR3410_2012_PublicKeyParameters42.encryptionParamSet;
            if (asn1ObjectIdentifier82 == null) {
            }
            a(oid82, digestParamsSpec6 == null ? digestParamsSpec6.getOID() : null, cryptParamsSpec5 == null ? cryptParamsSpec5.getOID() : null);
        }
        if (oid.equals(oid2)) {
        }
    }

    public static OID getDHDefault() {
        OID oid;
        synchronized (A) {
            oid = new OID(z);
        }
        return oid;
    }

    public static Enumeration getDHNames() {
        Vector vector = new Vector(0);
        vector.add(S_OID_98);
        vector.add(S_OID_PARAMS_EXC_2012_256);
        vector.add(S_OID_PARAMS_EXC_2012_512);
        return vector.elements();
    }

    public static Enumeration getDHOIDs() {
        Vector vector = new Vector(0);
        vector.add(OID_98);
        vector.add(OID_PARAMS_EXC_2012_256);
        vector.add(OID_PARAMS_EXC_2012_512);
        return vector.elements();
    }

    public static ParamsInterface getDefaultCryptParams() {
        return CryptParamsSpec.getInstance();
    }

    public static ParamsInterface getDefaultDigestParams() {
        return DigestParamsSpec.getInstance();
    }

    public static ParamsInterface getDefaultExchangeParams() {
        return EllipticParamsSpecDH.getInstance();
    }

    public static ParamsInterface getDefaultSignParams() {
        return EllipticParamsSpec.getInstance();
    }

    public static boolean isGost2001OID(OID oid) {
        return oid.equals(OID_98) || oid.equals(OID_19) || oid.equals(OID_3);
    }

    public static boolean isGost2012OID(OID oid) {
        return isGost256OID(oid) || isGost512OID(oid);
    }

    public static boolean isGost256OID(OID oid) {
        return oid.equals(OID_PARAMS_SIG_2012_256) || oid.equals(OID_PARAMS_EXC_2012_256);
    }

    public static boolean isGost512OID(OID oid) {
        return oid.equals(OID_PARAMS_SIG_2012_512) || oid.equals(OID_PARAMS_EXC_2012_512);
    }

    public static void setDHDefault(OID oid) {
        JCPPref jCPPref = new JCPPref(AlgIdSpec.class);
        int i = ProviderSpec.getInstance(oid).a;
        if (i == 1) {
            synchronized (D) {
                try {
                    if (oid.equals(OID_PARAMS_EXC_2012_256)) {
                        jCPPref.putOID("AlgIdSpec_2012_256_dh_class_defaultDH", oid);
                    }
                } finally {
                }
            }
            return;
        }
        if (i == 2) {
            synchronized (G) {
                try {
                    if (oid.equals(OID_PARAMS_EXC_2012_512)) {
                        jCPPref.putOID("AlgIdSpec_2012_512_dh_class_defaultDH", oid);
                    }
                } finally {
                }
            }
            return;
        }
        synchronized (A) {
            try {
                OID oid2 = OID_98;
                if (oid.equals(oid2)) {
                    jCPPref.putOID("AlgIdSpec_class_defaultDH", oid);
                    z = oid2;
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r7 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(OID oid, OID oid2, OID oid3) {
        CryptParamsSpec cryptParamsSpec;
        OID oid4 = CryptParamsSpec.OID_Gost28147_89_Rosstandart_TC26_Z_ParamSet;
        OID oid5 = this.a;
        if (oid5 != null) {
            if (isGost2012OID(oid5)) {
                oid2 = DigestParamsSpec.OID_Gost2012_256;
                OID oid6 = DigestParamsSpec.OID_Gost2012_512;
                if (oid != null && EllipticParamsSpec.isShortNewOID(oid)) {
                    this.c = DigestParamsSpec.getInstance(oid2);
                } else if (oid != null && (EllipticParamsSpec.is256OID_A(oid) || isGost512OID(oid5))) {
                    this.c = isGost512OID(oid5) ? DigestParamsSpec.getInstance(oid5, oid6) : DigestParamsSpec.getInstance(oid5, oid2);
                }
                cryptParamsSpec = CryptParamsSpec.getInstance(oid4);
                this.w = cryptParamsSpec;
            }
            if (!isGost2001OID(oid5)) {
                return;
            }
            this.c = DigestParamsSpec.getInstance(oid5, oid2);
            cryptParamsSpec = CryptParamsSpec.getInstance(oid5, oid3);
            this.w = cryptParamsSpec;
        }
    }

    @Override // ru.CryptoPro.JCP.params.AlgIdInterface
    public ParamsInterface getCryptParams() {
        return this.w;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    @Override // ru.CryptoPro.JCP.params.AlgIdInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getDecoded() {
        Asn1Type _gost2001dhpubkey_type;
        OID oid = getOID();
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(oid.value);
        ParamsInterface signParams = getSignParams();
        ParamsInterface digestParams = getDigestParams();
        ParamsInterface cryptParams = getCryptParams();
        Asn1ObjectIdentifier asn1ObjectIdentifier = null;
        Asn1ObjectIdentifier asn1ObjectIdentifier2 = signParams != null ? new Asn1ObjectIdentifier(signParams.getOID().value) : null;
        Asn1ObjectIdentifier asn1ObjectIdentifier3 = digestParams != null ? new Asn1ObjectIdentifier(digestParams.getOID().value) : null;
        Gost28147_89_ParamSet gost28147_89_ParamSet = cryptParams != null ? new Gost28147_89_ParamSet(cryptParams.getOID().value) : null;
        if (gost28147_89_ParamSet != null && ((oid.equals(OID_19) && CryptParamsSpec.OID_Crypt_VerbaO.eq(gost28147_89_ParamSet.value)) || ((oid.equals(OID_PARAMS_SIG_2012_256) || oid.equals(OID_PARAMS_SIG_2012_512)) && CryptParamsSpec.OID_Gost28147_89_Rosstandart_TC26_Z_ParamSet.eq(gost28147_89_ParamSet.value)))) {
            gost28147_89_ParamSet = null;
        }
        if (isGost2012OID(oid)) {
            if (signParams != null && EllipticParamsSpec.isShortNewOID(signParams.getOID())) {
                gost28147_89_ParamSet = null;
                if (!oid.equals(OID_19)) {
                    _gost2001dhpubkey_type = new _gost2001PubKey_Type((byte) 2, new GostR3410_2001_PublicKeyParameters(asn1ObjectIdentifier2, asn1ObjectIdentifier, gost28147_89_ParamSet));
                } else if (oid.equals(OID_PARAMS_SIG_2012_256)) {
                    _gost2001dhpubkey_type = new _gost2012_256_PubKey_Type((byte) 2, new GostR3410_2012_PublicKeyParameters(asn1ObjectIdentifier2, asn1ObjectIdentifier, gost28147_89_ParamSet));
                } else if (oid.equals(OID_PARAMS_EXC_2012_256)) {
                    _gost2001dhpubkey_type = new _gost2012_256DH_PubKey_Type((byte) 2, new GostR3410_2012_PublicKeyParameters(asn1ObjectIdentifier2, asn1ObjectIdentifier, gost28147_89_ParamSet));
                } else if (oid.equals(OID_PARAMS_SIG_2012_512)) {
                    _gost2001dhpubkey_type = new _gost2012_512_PubKey_Type((byte) 2, new GostR3410_2012_PublicKeyParameters(asn1ObjectIdentifier2, asn1ObjectIdentifier, gost28147_89_ParamSet));
                } else if (oid.equals(OID_PARAMS_EXC_2012_512)) {
                    _gost2001dhpubkey_type = new _gost2012_512DH_PubKey_Type((byte) 2, new GostR3410_2012_PublicKeyParameters(asn1ObjectIdentifier2, asn1ObjectIdentifier, gost28147_89_ParamSet));
                } else {
                    if (!oid.equals(OID_98)) {
                        return algorithmIdentifier;
                    }
                    _gost2001dhpubkey_type = new _gost2001DHPubKey_Type((byte) 2, new GostR3410_2001_PublicKeyParameters(asn1ObjectIdentifier2, asn1ObjectIdentifier, gost28147_89_ParamSet));
                }
                algorithmIdentifier.parameters = _gost2001dhpubkey_type;
                return algorithmIdentifier;
            }
            if (signParams != null && ((EllipticParamsSpec.is256OID_A(signParams.getOID()) || isGost512OID(oid)) && gost28147_89_ParamSet != null && CryptParamsSpec.OID_Gost28147_89_Rosstandart_TC26_Z_ParamSet.eq(gost28147_89_ParamSet.value))) {
                gost28147_89_ParamSet = null;
            }
        }
        asn1ObjectIdentifier = asn1ObjectIdentifier3;
        if (!oid.equals(OID_19)) {
        }
        algorithmIdentifier.parameters = _gost2001dhpubkey_type;
        return algorithmIdentifier;
    }

    @Override // ru.CryptoPro.JCP.params.AlgIdInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public OID getDefault(OID oid) {
        OID oid2;
        OID oid3;
        OID oid4;
        int i = ProviderSpec.getInstance(oid).a;
        if (i == 1) {
            synchronized (C) {
                oid2 = new OID(B);
            }
            return oid2;
        }
        if (i != 2) {
            synchronized (y) {
                oid4 = new OID(x);
            }
            return oid4;
        }
        synchronized (F) {
            oid3 = new OID(E);
        }
        return oid3;
    }

    @Override // ru.CryptoPro.JCP.params.AlgIdInterface
    public ParamsInterface getDigestParams() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCP.params.AlgIdInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public String getNameByOID(OID oid) {
        if (oid.equals(OID_19)) {
            return S_OID_19;
        }
        if (oid.equals(OID_98)) {
            return S_OID_98;
        }
        if (oid.equals(OID_3)) {
            return S_OID_3;
        }
        if (oid.equals(OID_SIGN_2012_256)) {
            return S_OID_SIGN_2012_256;
        }
        if (oid.equals(OID_SIGN_2012_512)) {
            return S_OID_SIGN_2012_512;
        }
        if (oid.equals(OID_9)) {
            return S_OID_9;
        }
        if (oid.equals(OID_DIGEST_2012_256)) {
            return S_OID_DIGEST_2012_256;
        }
        if (oid.equals(OID_DIGEST_2012_512)) {
            return S_OID_DIGEST_2012_512;
        }
        if (oid.equals(OID_21)) {
            return S_OID_21;
        }
        if (oid.equals(OID_PARAMS_SIG_2012_256)) {
            return S_OID_PARAMS_SIG_2012_256;
        }
        if (oid.equals(OID_PARAMS_EXC_2012_256)) {
            return S_OID_PARAMS_EXC_2012_256;
        }
        if (oid.equals(OID_PARAMS_SIG_2012_512)) {
            return S_OID_PARAMS_SIG_2012_512;
        }
        if (oid.equals(OID_PARAMS_EXC_2012_512)) {
            return S_OID_PARAMS_EXC_2012_512;
        }
        return null;
    }

    @Override // ru.CryptoPro.JCP.params.AlgIdInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public OID getOID() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCP.params.AlgIdInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public OID getOIDByName(String str) {
        if (str.equals(S_OID_19)) {
            return OID_19;
        }
        if (str.equals(S_OID_98)) {
            return OID_98;
        }
        if (str.equals(S_OID_3)) {
            return OID_3;
        }
        if (str.equals(S_OID_SIGN_2012_256)) {
            return OID_SIGN_2012_256;
        }
        if (str.equals(S_OID_SIGN_2012_512)) {
            return OID_SIGN_2012_512;
        }
        if (str.equals(S_OID_9)) {
            return OID_9;
        }
        if (str.equals(S_OID_DIGEST_2012_256)) {
            return OID_DIGEST_2012_256;
        }
        if (str.equals(S_OID_DIGEST_2012_512)) {
            return OID_DIGEST_2012_512;
        }
        if (str.equals(S_OID_21)) {
            return OID_21;
        }
        if (str.equals(S_OID_PARAMS_SIG_2012_256)) {
            return OID_PARAMS_SIG_2012_256;
        }
        if (str.equals(S_OID_PARAMS_EXC_2012_256)) {
            return OID_PARAMS_EXC_2012_256;
        }
        if (str.equals(S_OID_PARAMS_SIG_2012_512)) {
            return OID_PARAMS_SIG_2012_512;
        }
        if (str.equals(S_OID_PARAMS_EXC_2012_512)) {
            return OID_PARAMS_EXC_2012_512;
        }
        return null;
    }

    @Override // ru.CryptoPro.JCP.params.AlgIdInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public Enumeration getOIDs(OID oid) {
        OID oid2;
        Vector vector = new Vector(0);
        int i = ProviderSpec.getInstance(oid).a;
        if (i == 0) {
            oid2 = OID_19;
        } else {
            if (i != 1) {
                if (i == 2) {
                    vector.add(OID_PARAMS_EXC_2012_256);
                    oid2 = OID_PARAMS_EXC_2012_512;
                }
                return vector.elements();
            }
            vector.add(OID_PARAMS_SIG_2012_256);
            oid2 = OID_PARAMS_SIG_2012_512;
        }
        vector.add(oid2);
        return vector.elements();
    }

    @Override // ru.CryptoPro.JCP.params.AlgIdInterface
    public ParamsInterface getSignParams() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCP.params.AlgIdInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public void setDefault(OID oid, OID oid2) {
        JCPPref jCPPref = new JCPPref(AlgIdSpec.class);
        int i = ProviderSpec.getInstance(oid).a;
        if (i == 1) {
            synchronized (C) {
                try {
                    OID oid3 = OID_PARAMS_SIG_2012_256;
                    if (oid2.equals(oid3)) {
                        jCPPref.putOID("AlgIdSpec_2012_256_class_default", oid2);
                        B = oid3;
                    }
                } finally {
                }
            }
            return;
        }
        if (i != 2) {
            synchronized (y) {
                try {
                    OID oid4 = OID_19;
                    if (oid2.equals(oid4)) {
                        jCPPref.putOID("AlgIdSpec_class_default", oid2);
                        x = oid4;
                    }
                } finally {
                }
            }
            return;
        }
        synchronized (F) {
            try {
                OID oid5 = OID_PARAMS_SIG_2012_512;
                if (oid2.equals(oid5)) {
                    jCPPref.putOID("AlgIdSpec_2012_512_class_default", oid2);
                    E = oid5;
                }
            } finally {
            }
        }
    }

    @Override // ru.CryptoPro.JCP.params.AlgIdInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public boolean setDefaultAvailable() {
        return nzs.u(AlgIdSpec.class);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(Extension.COLON_SPACE);
        OID oid = this.a;
        sb.append(oid != null ? oid.toString() : "null");
        sb.append("\n ");
        ParamsInterface paramsInterface = this.b;
        sb.append(paramsInterface != null ? paramsInterface.toString() : "null");
        sb.append("\n ");
        ParamsInterface paramsInterface2 = this.c;
        sb.append(paramsInterface2 != null ? paramsInterface2.toString() : "null");
        sb.append("\n ");
        ParamsInterface paramsInterface3 = this.w;
        sb.append(paramsInterface3 != null ? paramsInterface3.toString() : "null");
        return sb.toString();
    }

    @Override // ru.CryptoPro.JCP.params.AlgIdInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public Enumeration getOIDs() {
        return getOIDs(this.a);
    }

    @Override // ru.CryptoPro.JCP.params.AlgIdInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public void setDefault(OID oid) {
        setDefault(oid, oid);
    }

    public AlgIdSpec(String str) {
        this(str == null ? null : new OID(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AlgIdSpec(OID oid) {
        this(oid, r4, DigestParamsSpec.getInstance().getDefault(oid), CryptParamsSpec.getInstance().getDefault(oid));
        OID oid2 = EllipticParamsSpec.getInstance().getDefault(oid);
        OID oid3 = EllipticParamsSpecDH.getInstance().getDefault(oid);
        OID oid4 = EllipticParamsSpec2012_512.getInstance().getOID();
        OID oid5 = EllipticParamsSpecDH2012_512.getInstance().getOID();
        OID oid6 = null;
        if (oid != null) {
            for (int i = 0; i < 7; i++) {
                if (oid.equals(H[i])) {
                    Class[] clsArr = I;
                    if (clsArr[i].equals(EllipticParamsSpecDH.class)) {
                        oid6 = oid3;
                    } else if (clsArr[i].equals(EllipticParamsSpec.class)) {
                        oid6 = oid2;
                    } else if (clsArr[i].equals(EllipticParamsSpec2012_512.class)) {
                        oid6 = oid4;
                    } else if (clsArr[i].equals(EllipticParamsSpecDH2012_512.class)) {
                        oid6 = oid5;
                    }
                }
            }
        }
    }

    public AlgIdSpec(OID oid, OID oid2, OID oid3, OID oid4) {
        ParamsInterface ellipticParamsSpec;
        if (oid == null) {
            int i = ProviderSpec.getInstance().a;
            if (i == 1) {
                synchronized (C) {
                    this.a = B;
                }
            } else if (i != 2) {
                synchronized (y) {
                    this.a = x;
                }
            } else {
                synchronized (F) {
                    this.a = E;
                }
            }
        } else {
            this.a = oid;
        }
        if (!this.a.equals(OID_98) && !this.a.equals(OID_PARAMS_EXC_2012_256) && !this.a.equals(OID_19) && !this.a.equals(OID_3) && !this.a.equals(OID_PARAMS_SIG_2012_256)) {
            if (this.a.equals(OID_PARAMS_SIG_2012_512)) {
                ellipticParamsSpec = EllipticParamsSpec2012_512.getInstance(oid2);
            } else if (this.a.equals(OID_PARAMS_EXC_2012_512)) {
                ellipticParamsSpec = EllipticParamsSpecDH2012_512.getInstance(oid2);
            }
            this.b = ellipticParamsSpec;
            a(oid2, oid3, oid4);
        }
        ellipticParamsSpec = EllipticParamsSpec.getInstance(oid2);
        this.b = ellipticParamsSpec;
        a(oid2, oid3, oid4);
    }

    public AlgIdSpec(OID oid, ParamsInterface paramsInterface, ParamsInterface paramsInterface2, ParamsInterface paramsInterface3) {
        this.a = oid;
        this.b = paramsInterface;
        this.c = paramsInterface2;
        this.w = paramsInterface3;
        a(paramsInterface != null ? paramsInterface.getOID() : null, paramsInterface2 != null ? paramsInterface2.getOID() : null, paramsInterface3 != null ? paramsInterface3.getOID() : null);
    }
}
