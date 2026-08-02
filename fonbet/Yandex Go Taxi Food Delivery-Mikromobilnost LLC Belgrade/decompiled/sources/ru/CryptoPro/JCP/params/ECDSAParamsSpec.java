package ru.CryptoPro.JCP.params;

import defpackage.nzs;
import defpackage.w511;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Vector;
import ru.CryptoPro.JCP.math.BigIntr;
import ru.CryptoPro.JCP.math.EllipticCurve;
import ru.CryptoPro.JCP.math.EllipticPoint;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.pref.JCPRes;

/* loaded from: classes4.dex */
public class ECDSAParamsSpec implements ECDSAConsts, EllipticParamsInterface {
    public static final String ECDSA_P192_NAME = "secp192r1";
    public static final String ECDSA_P224_NAME = "secp224r1";
    public static final String ECDSA_P256_NAME = "secp256r1";
    public static final String ECDSA_P384_NAME = "secp384r1";
    public static final String ECDSA_P521_NAME = "secp521r1";
    public static final String ECDSA_SECP256K1_NAME = "secp256k1";
    public static final OID OID_ECDSA_P192;
    public static final OID OID_ECDSA_P224;
    public static final OID OID_ECDSA_P256;
    public static final OID OID_ECDSA_P384;
    public static final OID OID_ECDSA_P521;
    public static final OID OID_ECDSA_SECP256K1;
    public static final String S_OID_ECDSA_P192;
    public static final String S_OID_ECDSA_P224;
    public static final String S_OID_ECDSA_P256;
    public static final String S_OID_ECDSA_P384;
    public static final String S_OID_ECDSA_P521;
    public static final String S_OID_ECDSA_SECP256K1;
    public static final int VAR_DEFAULT = -1;
    public static final int VAR_ECDSA_P192 = 0;
    public static final int VAR_ECDSA_P224 = 1;
    public static final int VAR_ECDSA_P256 = 2;
    public static final int VAR_ECDSA_P384 = 3;
    public static final int VAR_ECDSA_P521 = 4;
    public static final int VAR_ECDSA_SECP256K1 = 5;
    public static final OID[] b;
    public static final String[] c;
    public static final ECDSAParamsSpec[] w;
    public static int x;
    public final int a;

    static {
        OID oid = new OID("1.2.840.10045.3.1.1");
        OID_ECDSA_P192 = oid;
        String oIDdecl = JCPRes.getOIDdecl(oid);
        S_OID_ECDSA_P192 = oIDdecl;
        OID oid2 = new OID("1.2.840.10045.3.1.7");
        OID_ECDSA_P256 = oid2;
        String oIDdecl2 = JCPRes.getOIDdecl(oid2);
        S_OID_ECDSA_P256 = oIDdecl2;
        OID oid3 = new OID("1.3.132.0.33");
        OID_ECDSA_P224 = oid3;
        String oIDdecl3 = JCPRes.getOIDdecl(oid3);
        S_OID_ECDSA_P224 = oIDdecl3;
        OID oid4 = new OID("1.3.132.0.34");
        OID_ECDSA_P384 = oid4;
        String oIDdecl4 = JCPRes.getOIDdecl(oid4);
        S_OID_ECDSA_P384 = oIDdecl4;
        OID oid5 = new OID("1.3.132.0.35");
        OID_ECDSA_P521 = oid5;
        String oIDdecl5 = JCPRes.getOIDdecl(oid5);
        S_OID_ECDSA_P521 = oIDdecl5;
        OID oid6 = new OID("1.3.132.0.10");
        OID_ECDSA_SECP256K1 = oid6;
        String oIDdecl6 = JCPRes.getOIDdecl(oid6);
        S_OID_ECDSA_SECP256K1 = oIDdecl6;
        b = new OID[]{oid, oid3, oid2, oid4, oid5, oid6};
        c = new String[]{oIDdecl, oIDdecl3, oIDdecl2, oIDdecl4, oIDdecl5, oIDdecl6};
        w = new ECDSAParamsSpec[]{new ECDSAParamsSpec(0), new ECDSAParamsSpec(1), new ECDSAParamsSpec(2), new ECDSAParamsSpec(3), new ECDSAParamsSpec(4), new ECDSAParamsSpec(5)};
        x = getIndex(loadDefault("ECDSAParamsSpec_class_default"));
    }

    public ECDSAParamsSpec(int i) {
        this.a = i;
    }

    public static int getIndex(String str) {
        for (int i = 0; i < b.length; i++) {
            if (c[i].equals(str)) {
                return i;
            }
        }
        w511.q();
        return 0;
    }

    public static ECDSAParamsSpec getInstance(int i) {
        if (i == -1) {
            i = x;
        }
        if (i < b.length) {
            return w[i];
        }
        w511.q();
        return null;
    }

    public static OID loadDefault(final String str) {
        OID oid;
        try {
            oid = (OID) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.params.ECDSAParamsSpec.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    return new JCPPref(ECDSAParamsSpec.class).getOID(str, null);
                }
            });
        } catch (Exception unused) {
            oid = null;
        }
        return oid == null ? OID_ECDSA_P256 : oid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ECDSAParamsSpec) {
            return this.a == ((ECDSAParamsSpec) obj).a;
        }
        return false;
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface
    public final EllipticCurve getCurve() {
        return null;
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getDefault(OID oid) {
        return b[x];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final String getNameByOID(OID oid) {
        return c[getIndex(oid)];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getOID() {
        return b[this.a];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getOIDByName(String str) {
        return b[getIndex(str)];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final Enumeration getOIDs(OID oid) {
        Vector vector = new Vector(0);
        vector.add(OID_ECDSA_P192);
        vector.add(OID_ECDSA_P224);
        vector.add(OID_ECDSA_P256);
        vector.add(OID_ECDSA_P384);
        vector.add(OID_ECDSA_P521);
        return vector.elements();
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface
    public final EllipticPoint getP() {
        return null;
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface
    public final BigIntr getQ() {
        return null;
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid, OID oid2) {
        int index = getIndex(oid2);
        x = index;
        new JCPPref(ECDSAParamsSpec.class).putOID("ECDSAParamsSpec_class_default", b[index]);
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final boolean setDefaultAvailable() {
        return nzs.u(ECDSAParamsSpec.class);
    }

    public final String toString() {
        return "ECDSA params:\n OID: " + getOID().toString();
    }

    public static ECDSAParamsSpec getInstance() {
        return w[x];
    }

    public static ECDSAParamsSpec getInstance(OID oid) {
        int index;
        if (oid == null) {
            index = x;
        } else {
            index = getIndex(oid);
        }
        return w[index];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid) {
        setDefault(null, oid);
    }

    public static int getIndex(OID oid) {
        int i = 0;
        while (true) {
            OID[] oidArr = b;
            if (i >= oidArr.length) {
                w511.q();
                return 0;
            }
            if (oidArr[i].equals(oid)) {
                return i;
            }
            i++;
        }
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final Enumeration getOIDs() {
        return getOIDs(null);
    }
}
