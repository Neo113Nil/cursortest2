package ru.CryptoPro.JCP.params;

import defpackage.ct61;
import defpackage.htf0;
import defpackage.iq61;
import defpackage.jr61;
import defpackage.nzs;
import defpackage.w511;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Vector;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.pref.JCPRes;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class CryptParamsSpec implements CryptParamsInterface, iq61, jr61, ct61 {
    public static int A = 0;
    public static final int DEFAULT = -1;
    public static final int KUZNECHIK = 16;
    public static final int MAGMA = 15;
    public static final OID OID_Crypt_OSCAR;
    public static final OID OID_Crypt_RIC1;
    public static final OID OID_Crypt_Test;
    public static final OID OID_Crypt_TestHash;
    public static final OID OID_Crypt_Var_1;
    public static final OID OID_Crypt_Var_2;
    public static final OID OID_Crypt_Var_3;
    public static final OID OID_Crypt_VerbaO;
    public static final OID OID_Gost28147_89_Rosstandart_TC26_Z_ParamSet;
    public static final OID OID_Gost28147_89_TC26_A_ParamSet;
    public static final OID OID_Gost28147_89_TC26_B_ParamSet;
    public static final OID OID_Gost28147_89_TC26_C_ParamSet;
    public static final OID OID_Gost28147_89_TC26_D_ParamSet;
    public static final OID OID_Gost28147_89_TC26_E_ParamSet;
    public static final OID OID_Gost28147_89_TC26_F_ParamSet;
    public static final OID OID_tc26_cipher_gost_3412_2015_K;
    public static final OID OID_tc26_cipher_gost_3412_2015_K_ctr_acpkm;
    public static final OID OID_tc26_cipher_gost_3412_2015_K_ctr_acpkm_omac;
    public static final OID OID_tc26_cipher_gost_3412_2015_M;
    public static final OID OID_tc26_cipher_gost_3412_2015_M_ctr_acpkm;
    public static final OID OID_tc26_cipher_gost_3412_2015_M_ctr_acpkm_omac;
    public static final OID OID_tc26_wrap_gost_3412_2015_K;
    public static final OID OID_tc26_wrap_gost_3412_2015_K_kexp15;
    public static final OID OID_tc26_wrap_gost_3412_2015_M;
    public static final OID OID_tc26_wrap_gost_3412_2015_M_kexp15;
    public static final int OSCAR = 5;
    public static final int RIC1 = 7;
    public static final int Rosstandart_TC26_Z = 14;
    public static final int TC26_A = 8;
    public static final int TC26_B = 9;
    public static final int TC26_C = 10;
    public static final int TC26_D = 11;
    public static final int TC26_E = 12;
    public static final int TC26_F = 13;
    public static final int TEST = 0;
    public static final int TESTHASH = 6;
    public static final int VAR_1 = 2;
    public static final int VAR_2 = 3;
    public static final int VAR_3 = 4;
    public static final int VERBAO = 1;
    public static final OID[] b;
    public static final int[][] c;
    public static final String[] w;
    public static final CryptParamsSpec[] x;
    public static int y;
    public static int z;
    public final int a;

    static {
        OID oid = new OID("1.2.643.2.2.31.0");
        OID_Crypt_Test = oid;
        OID oid2 = new OID("1.2.643.2.2.31.1");
        OID_Crypt_VerbaO = oid2;
        OID oid3 = new OID("1.2.643.2.2.31.2");
        OID_Crypt_Var_1 = oid3;
        OID oid4 = new OID("1.2.643.2.2.31.3");
        OID_Crypt_Var_2 = oid4;
        OID oid5 = new OID("1.2.643.2.2.31.4");
        OID_Crypt_Var_3 = oid5;
        OID oid6 = new OID("1.2.643.2.2.31.5");
        OID_Crypt_OSCAR = oid6;
        OID oid7 = new OID("1.2.643.2.2.31.6");
        OID_Crypt_TestHash = oid7;
        OID oid8 = new OID("1.2.643.2.2.31.7");
        OID_Crypt_RIC1 = oid8;
        OID oid9 = new OID("1.2.643.2.2.31.12");
        OID_Gost28147_89_TC26_A_ParamSet = oid9;
        OID oid10 = new OID("1.2.643.2.2.31.13");
        OID_Gost28147_89_TC26_B_ParamSet = oid10;
        OID oid11 = new OID("1.2.643.2.2.31.14");
        OID_Gost28147_89_TC26_C_ParamSet = oid11;
        OID oid12 = new OID("1.2.643.2.2.31.15");
        OID_Gost28147_89_TC26_D_ParamSet = oid12;
        OID oid13 = new OID("1.2.643.2.2.31.16");
        OID_Gost28147_89_TC26_E_ParamSet = oid13;
        OID oid14 = new OID("1.2.643.2.2.31.17");
        OID_Gost28147_89_TC26_F_ParamSet = oid14;
        OID oid15 = new OID("1.2.643.7.1.2.5.1.1");
        OID_Gost28147_89_Rosstandart_TC26_Z_ParamSet = oid15;
        OID oid16 = new OID("1.2.643.7.1.1.5.1");
        OID_tc26_cipher_gost_3412_2015_M = oid16;
        OID_tc26_cipher_gost_3412_2015_M_ctr_acpkm = new OID("1.2.643.7.1.1.5.1.1");
        OID_tc26_cipher_gost_3412_2015_M_ctr_acpkm_omac = new OID("1.2.643.7.1.1.5.1.2");
        OID oid17 = new OID("1.2.643.7.1.1.5.2");
        OID_tc26_cipher_gost_3412_2015_K = oid17;
        OID_tc26_cipher_gost_3412_2015_K_ctr_acpkm = new OID("1.2.643.7.1.1.5.2.1");
        OID_tc26_cipher_gost_3412_2015_K_ctr_acpkm_omac = new OID("1.2.643.7.1.1.5.2.2");
        OID_tc26_wrap_gost_3412_2015_M = new OID("1.2.643.7.1.1.7.1");
        OID_tc26_wrap_gost_3412_2015_M_kexp15 = new OID("1.2.643.7.1.1.7.1.1");
        OID_tc26_wrap_gost_3412_2015_K = new OID("1.2.643.7.1.1.7.2");
        OID_tc26_wrap_gost_3412_2015_K_kexp15 = new OID("1.2.643.7.1.1.7.2.1");
        b = new OID[]{oid, oid2, oid3, oid4, oid5, oid6, oid7, oid8, oid9, oid10, oid11, oid12, oid13, oid14, oid15, oid16, oid17};
        int[] iArr = jr61.a5;
        int[] iArr2 = ct61.b5;
        int[] iArr3 = iq61.L4;
        int[] iArr4 = iq61.K4;
        int[] iArr5 = iq61.P4;
        int[] iArr6 = iq61.Q4;
        int[] iArr7 = iq61.R4;
        int[] iArr8 = iq61.S4;
        int[] iArr9 = iq61.O4;
        int[] iArr10 = iq61.T4;
        int[] iArr11 = jr61.U4;
        c = new int[][]{iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, iArr11, jr61.V4, jr61.W4, jr61.Y4, jr61.Z4, iArr, iArr11, iArr11, iArr2};
        w = new String[]{"", JCPRes.getOIDdecl(oid2), JCPRes.getOIDdecl(oid3), JCPRes.getOIDdecl(oid4), JCPRes.getOIDdecl(oid5), JCPRes.getOIDdecl(oid6), JCPRes.getOIDdecl(oid7), JCPRes.getOIDdecl(oid8), JCPRes.getOIDdecl(oid9), JCPRes.getOIDdecl(oid10), JCPRes.getOIDdecl(oid11), JCPRes.getOIDdecl(oid12), JCPRes.getOIDdecl(oid13), JCPRes.getOIDdecl(oid14), JCPRes.getOIDdecl(oid15), JCPRes.getOIDdecl(oid16), JCPRes.getOIDdecl(oid17)};
        x = new CryptParamsSpec[]{new CryptParamsSpec(0), new CryptParamsSpec(1), new CryptParamsSpec(2), new CryptParamsSpec(3), new CryptParamsSpec(4), new CryptParamsSpec(5), new CryptParamsSpec(6), new CryptParamsSpec(7), new CryptParamsSpec(8), new CryptParamsSpec(9), new CryptParamsSpec(10), new CryptParamsSpec(11), new CryptParamsSpec(12), new CryptParamsSpec(13), new CryptParamsSpec(14), new CryptParamsSpec(15), new CryptParamsSpec(16)};
        y = c(a("CryptParamsSpec_class_default", oid2));
        z = c(a("CryptParamsSpec_2012_256_class_default", oid15));
        A = c(a("CryptParamsSpec_2012_512_class_default", oid15));
    }

    public CryptParamsSpec(int i) {
        this.a = i;
    }

    public static OID a(String str, OID oid) {
        OID oid2;
        try {
            oid2 = (OID) AccessController.doPrivileged(new htf0(str, 9));
        } catch (Exception unused) {
            oid2 = null;
        }
        return oid2 == null ? oid : oid2;
    }

    public static int b() {
        int i = ProviderSpec.getInstance().a;
        return i != 1 ? i != 2 ? y : A : z;
    }

    public static int c(OID oid) {
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

    public static CryptParamsSpec getInstance(OID oid, OID oid2) {
        int c2;
        if (oid2 == null) {
            int i = ProviderSpec.getInstance(oid).a;
            c2 = i != 1 ? i != 2 ? y : A : z;
        } else {
            c2 = c(oid2);
        }
        return x[c2];
    }

    public static boolean isGR34122015(OID oid) {
        return oid.equals(OID_tc26_cipher_gost_3412_2015_M) || oid.equals(OID_tc26_cipher_gost_3412_2015_M_ctr_acpkm) || oid.equals(OID_tc26_cipher_gost_3412_2015_M_ctr_acpkm_omac) || oid.equals(OID_tc26_cipher_gost_3412_2015_K) || oid.equals(OID_tc26_cipher_gost_3412_2015_K_ctr_acpkm) || oid.equals(OID_tc26_cipher_gost_3412_2015_K_ctr_acpkm_omac) || oid.equals(OID_tc26_wrap_gost_3412_2015_M) || oid.equals(OID_tc26_wrap_gost_3412_2015_M_kexp15) || oid.equals(OID_tc26_wrap_gost_3412_2015_K) || oid.equals(OID_tc26_wrap_gost_3412_2015_K_kexp15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CryptParamsSpec) {
            return this.a == ((CryptParamsSpec) obj).a;
        }
        return false;
    }

    @Override // ru.CryptoPro.JCP.params.CryptParamsInterface
    public final int[] getCommutator() {
        return c[this.a];
    }

    @Override // ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getDefault(OID oid) {
        int i = ProviderSpec.getInstance(oid).a;
        return b[i != 1 ? i != 2 ? y : A : z];
    }

    @Override // ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final String getNameByOID(OID oid) {
        return w[c(oid)];
    }

    @Override // ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getOID() {
        return b[this.a];
    }

    @Override // ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getOIDByName(String str) {
        int i = 0;
        while (true) {
            OID[] oidArr = b;
            if (i >= oidArr.length) {
                w511.q();
                return null;
            }
            if (w[i].equals(str)) {
                return oidArr[i];
            }
            i++;
        }
    }

    @Override // ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final Enumeration getOIDs(OID oid) {
        Vector vector = new Vector(0);
        vector.add(OID_Crypt_VerbaO);
        vector.add(OID_Crypt_Var_1);
        vector.add(OID_Crypt_Var_2);
        vector.add(OID_Crypt_Var_3);
        vector.add(OID_Crypt_OSCAR);
        vector.add(OID_Crypt_TestHash);
        vector.add(OID_Crypt_RIC1);
        vector.add(OID_Gost28147_89_TC26_A_ParamSet);
        vector.add(OID_Gost28147_89_TC26_B_ParamSet);
        vector.add(OID_Gost28147_89_TC26_C_ParamSet);
        vector.add(OID_Gost28147_89_TC26_D_ParamSet);
        vector.add(OID_Gost28147_89_TC26_E_ParamSet);
        vector.add(OID_Gost28147_89_TC26_F_ParamSet);
        vector.add(OID_Gost28147_89_Rosstandart_TC26_Z_ParamSet);
        vector.add(OID_tc26_cipher_gost_3412_2015_M);
        vector.add(OID_tc26_cipher_gost_3412_2015_K);
        return vector.elements();
    }

    @Override // ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid, OID oid2) {
        String str;
        int c2 = c(oid2);
        if (c2 == 0) {
            w511.q();
            return;
        }
        char c3 = 0;
        int i = oid != null ? ProviderSpec.getInstance(oid).a : 0;
        if (i == 1) {
            str = "CryptParamsSpec_2012_256_class_default";
            c3 = 1;
        } else if (i != 2) {
            str = "CryptParamsSpec_class_default";
        } else {
            str = "CryptParamsSpec_2012_512_class_default";
            c3 = 2;
        }
        if (c3 == 1) {
            z = c2;
        } else if (c3 != 2) {
            y = c2;
        } else {
            A = c2;
        }
        new JCPPref(CryptParamsSpec.class).putOID(str, b[c2]);
    }

    @Override // ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final boolean setDefaultAvailable() {
        return nzs.u(CryptParamsSpec.class);
    }

    public final String toString() {
        return getClass().getName() + Extension.COLON_SPACE + b[this.a].toString();
    }

    public static CryptParamsSpec getInstance(int i) {
        if (i == -1) {
            i = b();
        }
        if (i >= 0 && i < b.length) {
            return x[i];
        }
        w511.q();
        return null;
    }

    public static CryptParamsSpec getInstance(OID oid) {
        return x[oid == null ? b() : c(oid)];
    }

    public static CryptParamsSpec getInstance() {
        return x[b()];
    }

    @Override // ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid) {
        setDefault(null, oid);
    }

    @Override // ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final Enumeration getOIDs() {
        return getOIDs(null);
    }
}
