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
import ru.CryptoPro.JCP.params.EllipticConsts2012_512;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.pref.JCPRes;

/* loaded from: classes4.dex */
public class EllipticParamsSpec2012_512 implements EllipticConsts2012_512, EllipticParamsInterface {
    public static final OID OID_tc26_gost_3410_12_512_paramSetA;
    public static final OID OID_tc26_gost_3410_12_512_paramSetB;
    public static final OID OID_tc26_gost_3410_12_512_paramSetC;
    public static final String S_OID_tc26_gost_3410_12_512_paramSetA;
    public static final String S_OID_tc26_gost_3410_12_512_paramSetB;
    public static final String S_OID_tc26_gost_3410_12_512_paramSetC;
    public static final int VAR_DEFAULT = -1;
    public static final int VAR_SIGN_SetA = 0;
    public static final int VAR_SIGN_SetB = 1;
    public static final int VAR_SIGN_SetC = 2;
    public static final OID[] b;
    public static final String[] c;
    public static final BigIntr[] w;
    public static final EllipticParamsSpec2012_512[] x;
    public static int y;
    public final int a;

    public static class EllipticCurve512InstanceHolder {
        public static final EllipticCurve[] CURVES = {EllipticConsts2012_512.Elliptic512InstanceHolder.CURVE_tc26_A, EllipticConsts2012_512.Elliptic512InstanceHolder.CURVE_tc26_B, EllipticConsts2012_512.Elliptic512InstanceHolder.CURVE_tc26_C};
    }

    public static class EllipticPoint512InstanceHolder {
        public static final EllipticPoint[] POINTS = {EllipticConsts2012_512.Elliptic512InstanceHolder.p_tc26_A_store_table, EllipticConsts2012_512.Elliptic512InstanceHolder.p_tc26_B_store_table, EllipticConsts2012_512.Elliptic512InstanceHolder.p_tc26_C_store_table};
    }

    static {
        OID oid = new OID("1.2.643.7.1.2.1.2.1");
        OID_tc26_gost_3410_12_512_paramSetA = oid;
        String oIDdecl = JCPRes.getOIDdecl(oid);
        S_OID_tc26_gost_3410_12_512_paramSetA = oIDdecl;
        OID oid2 = new OID("1.2.643.7.1.2.1.2.2");
        OID_tc26_gost_3410_12_512_paramSetB = oid2;
        String oIDdecl2 = JCPRes.getOIDdecl(oid2);
        S_OID_tc26_gost_3410_12_512_paramSetB = oIDdecl2;
        OID oid3 = new OID("1.2.643.7.1.2.1.2.3");
        OID_tc26_gost_3410_12_512_paramSetC = oid3;
        String oIDdecl3 = JCPRes.getOIDdecl(oid3);
        S_OID_tc26_gost_3410_12_512_paramSetC = oIDdecl3;
        b = new OID[]{oid, oid2, oid3};
        c = new String[]{oIDdecl, oIDdecl2, oIDdecl3};
        w = new BigIntr[]{new BigIntr(EllipticConsts2012_512.ECCq_tc26_A), new BigIntr(EllipticConsts2012_512.ECCq_tc26_B), new BigIntr(EllipticConsts2012_512.ECCq_tc26_C)};
        x = new EllipticParamsSpec2012_512[]{new EllipticParamsSpec2012_512(0), new EllipticParamsSpec2012_512(1), new EllipticParamsSpec2012_512(2), new EllipticParamsSpecDH2012_512(0), new EllipticParamsSpecDH2012_512(1), new EllipticParamsSpecDH2012_512(2)};
        y = getIndex(loadDefault("EllipticParamsSpec2012_512_class_defaultECC2012", oid));
    }

    public EllipticParamsSpec2012_512(int i) {
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

    public static EllipticParamsSpec2012_512 getInstance(OID oid) {
        return x[oid == null ? y : getIndex(oid)];
    }

    public static OID loadDefault(final String str, OID oid) {
        OID oid2;
        try {
            oid2 = (OID) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.params.EllipticParamsSpec2012_512.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    return new JCPPref(EllipticParamsSpec2012_512.class).getOID(str, null);
                }
            });
        } catch (Exception unused) {
            oid2 = null;
        }
        return oid2 == null ? oid : oid2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EllipticParamsSpec2012_512) {
            return this.a == ((EllipticParamsSpec2012_512) obj).a;
        }
        return false;
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface
    public final EllipticCurve getCurve() {
        return EllipticCurve512InstanceHolder.CURVES[this.a];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public OID getDefault(OID oid) {
        return b[y];
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
        vector.add(OID_tc26_gost_3410_12_512_paramSetA);
        vector.add(OID_tc26_gost_3410_12_512_paramSetB);
        vector.add(OID_tc26_gost_3410_12_512_paramSetC);
        return vector.elements();
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface
    public final EllipticPoint getP() {
        return EllipticPoint512InstanceHolder.POINTS[this.a];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface
    public final BigIntr getQ() {
        return w[this.a];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public void setDefault(OID oid, OID oid2) {
        int index = getIndex(oid2);
        if (index < 0 || index > 2) {
            w511.q();
        } else {
            y = index;
            new JCPPref(EllipticParamsSpec2012_512.class).putOID("EllipticParamsSpec2012_512_class_defaultECC2012", b[y]);
        }
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public boolean setDefaultAvailable() {
        return nzs.u(EllipticParamsSpec2012_512.class);
    }

    public static EllipticParamsSpec2012_512 getInstance(int i) {
        if (i == -1) {
            i = y;
        }
        return x[i];
    }

    public static EllipticParamsSpec2012_512 getInstance() {
        return x[y];
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

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid) {
        setDefault(null, oid);
    }
}
