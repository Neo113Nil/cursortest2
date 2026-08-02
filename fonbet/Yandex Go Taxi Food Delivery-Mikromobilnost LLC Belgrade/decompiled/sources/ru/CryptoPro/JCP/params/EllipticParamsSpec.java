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
import ru.CryptoPro.JCP.params.EllipticConsts;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.pref.JCPRes;

/* loaded from: classes4.dex */
public class EllipticParamsSpec implements EllipticConsts, EllipticParamsInterface {
    public static final OID OID_ECCDHPRO;
    public static final OID OID_ECCDHPVar_1;
    public static final OID OID_ECCSignDHOSCAR;
    public static final OID OID_ECCSignDHPRO;
    public static final OID OID_ECCSignDHVar_1;
    public static final OID OID_ECCSignEdw;
    public static final OID OID_ECCSignEdw_TC26_A;
    public static final OID OID_ECCSignEdw_TC26_B;
    public static final OID OID_ECCSignEdw_TC26_C;
    public static final OID OID_ECCSignEdw_TC26_D;
    public static final OID OID_ECCTest3410;
    public static final String S_OID_ECCDHPRO;
    public static final String S_OID_ECCDHP_VAR_1;
    public static final String S_OID_ECCSignEdw;
    public static final String S_OID_ECCSignEdw_TC26_A;
    public static final String S_OID_ECCSignEdw_TC26_B;
    public static final String S_OID_ECCSignEdw_TC26_C;
    public static final String S_OID_ECCSignEdw_TC26_D;
    public static final String S_OID_ECC_SIGNDH_OSCAR;
    public static final String S_OID_ECC_SIGNDH_PRO;
    public static final String S_OID_ECC_SIGNDH_VAR_1;
    public static final String S_OID_ECC_TEST3410;
    public static final int VAR_DEFAULT = -1;
    public static final int VAR_EDW_TC26_A = 6;
    public static final int VAR_EDW_TC26_B = 7;
    public static final int VAR_EDW_TC26_C = 8;
    public static final int VAR_EDW_TC26_D = 9;
    public static final int VAR_EXCH_PRO = 4;
    public static final int VAR_EXCH_VAR1 = 5;
    public static final int VAR_SIGN_OSCAR = 3;
    public static final int VAR_SIGN_PRO = 1;
    public static final int VAR_SIGN_TEST = 0;
    public static final int VAR_SIGN_VAR1 = 2;
    public static final OID[] b;
    public static final String[] c;
    public static final BigIntr[] w;
    public static final EllipticParamsSpec[] x;
    public static int y;
    public static int z;
    public final int a;

    public static class EllipticCurveInstanceHolder {
        public static final EllipticCurve[] CURVES;

        static {
            EllipticCurve ellipticCurve = EllipticConsts.EllipticInstanceHolder.CURVE_desimal;
            EllipticCurve ellipticCurve2 = EllipticConsts.EllipticInstanceHolder.CURVE_CryptoPRO;
            EllipticCurve ellipticCurve3 = EllipticConsts.EllipticInstanceHolder.CURVE_PROvar1;
            EllipticCurve ellipticCurve4 = EllipticConsts.EllipticInstanceHolder.CURVE_OSCAR;
            CURVES = new EllipticCurve[]{ellipticCurve, ellipticCurve2, ellipticCurve3, ellipticCurve4, ellipticCurve2, ellipticCurve3, EllipticConsts.EllipticInstanceHolder.CURVE_Edw256, ellipticCurve2, ellipticCurve4, ellipticCurve3};
        }
    }

    public static class EllipticPointInstanceHolder {
        public static final EllipticPoint[] POINTS;

        static {
            EllipticPoint ellipticPoint = EllipticConsts.EllipticInstanceHolder.p_desimal_store_table;
            EllipticPoint ellipticPoint2 = EllipticConsts.EllipticInstanceHolder.p_CryptoPRO_store_table;
            EllipticPoint ellipticPoint3 = EllipticConsts.EllipticInstanceHolder.p_PROvar1_store_table;
            EllipticPoint ellipticPoint4 = EllipticConsts.EllipticInstanceHolder.p_OSCAR_store_table;
            POINTS = new EllipticPoint[]{ellipticPoint, ellipticPoint2, ellipticPoint3, ellipticPoint4, ellipticPoint2, ellipticPoint3, EllipticConsts.EllipticInstanceHolder.p_Edw256_store_table, ellipticPoint2, ellipticPoint4, ellipticPoint3};
        }
    }

    static {
        OID oid = new OID("1.2.643.2.2.35.0");
        OID_ECCTest3410 = oid;
        String oIDdecl = JCPRes.getOIDdecl(oid);
        S_OID_ECC_TEST3410 = oIDdecl;
        OID oid2 = new OID("1.2.643.2.2.35.1");
        OID_ECCSignDHPRO = oid2;
        String oIDdecl2 = JCPRes.getOIDdecl(oid2);
        S_OID_ECC_SIGNDH_PRO = oIDdecl2;
        OID oid3 = new OID("1.2.643.2.2.35.2");
        OID_ECCSignDHOSCAR = oid3;
        String oIDdecl3 = JCPRes.getOIDdecl(oid3);
        S_OID_ECC_SIGNDH_OSCAR = oIDdecl3;
        OID oid4 = new OID("1.2.643.2.2.35.3");
        OID_ECCSignDHVar_1 = oid4;
        String oIDdecl4 = JCPRes.getOIDdecl(oid4);
        S_OID_ECC_SIGNDH_VAR_1 = oIDdecl4;
        OID oid5 = new OID("1.2.643.2.2.36.0");
        OID_ECCDHPRO = oid5;
        String oIDdecl5 = JCPRes.getOIDdecl(oid5);
        S_OID_ECCDHPRO = oIDdecl5;
        OID oid6 = new OID("1.2.643.2.2.36.1");
        OID_ECCDHPVar_1 = oid6;
        String oIDdecl6 = JCPRes.getOIDdecl(oid6);
        S_OID_ECCDHP_VAR_1 = oIDdecl6;
        OID oid7 = new OID("1.2.643.7.1.2.1.1.1");
        OID_ECCSignEdw_TC26_A = oid7;
        String oIDdecl7 = JCPRes.getOIDdecl(oid7);
        S_OID_ECCSignEdw_TC26_A = oIDdecl7;
        OID_ECCSignEdw = oid7;
        S_OID_ECCSignEdw = oIDdecl7;
        OID oid8 = new OID("1.2.643.7.1.2.1.1.2");
        OID_ECCSignEdw_TC26_B = oid8;
        String oIDdecl8 = JCPRes.getOIDdecl(oid8);
        S_OID_ECCSignEdw_TC26_B = oIDdecl8;
        OID oid9 = new OID("1.2.643.7.1.2.1.1.3");
        OID_ECCSignEdw_TC26_C = oid9;
        String oIDdecl9 = JCPRes.getOIDdecl(oid9);
        S_OID_ECCSignEdw_TC26_C = oIDdecl9;
        OID oid10 = new OID("1.2.643.7.1.2.1.1.4");
        OID_ECCSignEdw_TC26_D = oid10;
        String oIDdecl10 = JCPRes.getOIDdecl(oid10);
        S_OID_ECCSignEdw_TC26_D = oIDdecl10;
        b = new OID[]{oid, oid2, oid4, oid3, oid5, oid6, oid7, oid8, oid9, oid10};
        c = new String[]{oIDdecl, oIDdecl2, oIDdecl4, oIDdecl3, oIDdecl5, oIDdecl6, oIDdecl7, oIDdecl8, oIDdecl9, oIDdecl10};
        BigIntr bigIntr = new BigIntr(EllipticConsts.ECCq_desimal);
        int[] iArr = EllipticConsts.ECCq_CryptoPRO;
        BigIntr bigIntr2 = new BigIntr(iArr);
        int[] iArr2 = EllipticConsts.ECCq_PROvar1;
        BigIntr bigIntr3 = new BigIntr(iArr2);
        int[] iArr3 = EllipticConsts.ECCq_OSCAR;
        w = new BigIntr[]{bigIntr, bigIntr2, bigIntr3, new BigIntr(iArr3), new BigIntr(iArr), new BigIntr(iArr2), new BigIntr(EllipticConsts.ECCq256_Edw), new BigIntr(iArr), new BigIntr(iArr3), new BigIntr(iArr2)};
        x = new EllipticParamsSpec[]{new EllipticParamsSpec(0), new EllipticParamsSpec(1), new EllipticParamsSpec(2), new EllipticParamsSpec(3), new EllipticParamsSpec(4), new EllipticParamsSpec(5), new EllipticParamsSpec(6), new EllipticParamsSpec(7), new EllipticParamsSpec(8), new EllipticParamsSpec(9), new EllipticParamsSpecDH(1), new EllipticParamsSpecDH(2), new EllipticParamsSpecDH(3), new EllipticParamsSpecDH(4), new EllipticParamsSpecDH(5), new EllipticParamsSpecDH(6), new EllipticParamsSpecDH(7), new EllipticParamsSpecDH(8), new EllipticParamsSpecDH(9)};
        y = getIndex(loadDefault("EllipticParamsSpec_class_defaultECC"));
        z = getIndex(loadDefault("EllipticParamsSpec_2012_256_class_defaultECC"));
    }

    public EllipticParamsSpec(int i) {
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

    public static EllipticParamsSpec getInstance(int i) {
        if (i == -1) {
            i = ProviderSpec.getInstance().a != 1 ? y : z;
        }
        if (i >= 0 && i < b.length) {
            return x[i];
        }
        w511.q();
        return null;
    }

    public static boolean is256OID_A(OID oid) {
        return oid.equals(OID_ECCSignEdw_TC26_A);
    }

    public static boolean isShortNewOID(OID oid) {
        return oid.equals(OID_ECCSignEdw_TC26_B) || oid.equals(OID_ECCSignEdw_TC26_C) || oid.equals(OID_ECCSignEdw_TC26_D);
    }

    public static OID loadDefault(final String str) {
        OID oid;
        try {
            oid = (OID) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.params.EllipticParamsSpec.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    return new JCPPref(EllipticParamsSpec.class).getOID(str, null);
                }
            });
        } catch (Exception unused) {
            oid = null;
        }
        return oid == null ? OID_ECCSignDHPRO : oid;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EllipticParamsSpec) {
            return this.a == ((EllipticParamsSpec) obj).a;
        }
        return false;
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface
    public final EllipticCurve getCurve() {
        return EllipticCurveInstanceHolder.CURVES[this.a];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public OID getDefault(OID oid) {
        return b[ProviderSpec.getInstance(oid).a != 1 ? y : z];
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r4.equals(ru.CryptoPro.JCP.params.AlgIdSpec.OID_PARAMS_EXC_2012_256) == false) goto L13;
     */
    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enumeration getOIDs(OID oid) {
        boolean z2 = false;
        Vector vector = new Vector(0);
        if (oid == null) {
            switch (this.a) {
                case 6:
                case 7:
                case 8:
                case 9:
                    z2 = true;
                    break;
            }
        } else {
            if (!oid.equals(AlgIdSpec.OID_PARAMS_SIG_2012_256)) {
            }
            z2 = true;
        }
        vector.add(OID_ECCSignDHPRO);
        vector.add(OID_ECCSignDHVar_1);
        vector.add(OID_ECCSignDHOSCAR);
        vector.add(OID_ECCDHPRO);
        vector.add(OID_ECCDHPVar_1);
        if (z2) {
            vector.add(OID_ECCSignEdw_TC26_A);
            vector.add(OID_ECCSignEdw_TC26_B);
            vector.add(OID_ECCSignEdw_TC26_C);
            vector.add(OID_ECCSignEdw_TC26_D);
        }
        return vector.elements();
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface
    public final EllipticPoint getP() {
        return EllipticPointInstanceHolder.POINTS[this.a];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface
    public final BigIntr getQ() {
        return w[this.a];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public void setDefault(OID oid, OID oid2) {
        int index = getIndex(oid2);
        if (index <= 0 || index > 9) {
            w511.q();
            return;
        }
        int i = oid != null ? ProviderSpec.getInstance(oid).a : 0;
        String str = i == 0 ? "EllipticParamsSpec_class_defaultECC" : "EllipticParamsSpec_2012_256_class_defaultECC";
        if (i != 1) {
            y = index;
        } else {
            z = index;
        }
        new JCPPref(EllipticParamsSpec.class).putOID(str, b[index]);
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public boolean setDefaultAvailable() {
        return nzs.u(EllipticParamsSpec.class);
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

    public static EllipticParamsSpec getInstance() {
        return x[ProviderSpec.getInstance().a != 1 ? y : z];
    }

    public static EllipticParamsSpec getInstance(OID oid) {
        int index;
        if (oid == null) {
            index = ProviderSpec.getInstance().a != 1 ? y : z;
        } else {
            index = getIndex(oid);
        }
        return x[index];
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public void setDefault(OID oid) {
        setDefault(null, oid);
    }

    @Override // ru.CryptoPro.JCP.params.EllipticParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final Enumeration getOIDs() {
        return getOIDs(null);
    }
}
