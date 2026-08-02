package ru.CryptoPro.JCP.params;

import defpackage.av61;
import defpackage.htf0;
import defpackage.nzs;
import defpackage.w511;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Vector;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.pref.JCPRes;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class DigestParamsSpec implements DigestParamsInterface, av61 {
    public static int A = 0;
    public static final int DEFAULT = -1;
    public static final int GOST3411_2012_256 = 5;
    public static final int GOST3411_2012_512 = 6;
    public static final OID OID_Gost2012_256;
    public static final OID OID_Gost2012_512;
    public static final OID OID_HashTest;
    public static final OID OID_HashVar_1;
    public static final OID OID_HashVar_2;
    public static final OID OID_HashVar_3;
    public static final OID OID_HashVerbaO;
    public static final int TEST = 0;
    public static final int VAR_1 = 2;
    public static final int VAR_2 = 3;
    public static final int VAR_3 = 4;
    public static final int VERBAO = 1;
    public static final OID[] b;
    public static final int[][] c;
    public static final String[] w;
    public static final DigestParamsSpec[] x;
    public static int y;
    public static int z;
    public static final int[] zeroStartDigestVector = {0, 0, 0, 0, 0, 0, 0, 0};
    public final int a;

    static {
        OID oid = new OID("1.2.643.2.2.30.0");
        OID_HashTest = oid;
        OID oid2 = new OID("1.2.643.2.2.30.1");
        OID_HashVerbaO = oid2;
        OID oid3 = new OID("1.2.643.2.2.30.2");
        OID_HashVar_1 = oid3;
        OID oid4 = new OID("1.2.643.2.2.30.3");
        OID_HashVar_2 = oid4;
        OID oid5 = new OID("1.2.643.2.2.30.4");
        OID_HashVar_3 = oid5;
        OID oid6 = new OID("1.2.643.7.1.1.2.2");
        OID_Gost2012_256 = oid6;
        OID oid7 = new OID("1.2.643.7.1.1.2.3");
        OID_Gost2012_512 = oid7;
        b = new OID[]{oid, oid2, oid3, oid4, oid5, oid6, oid7};
        c = new int[][]{av61.q5, av61.r5, av61.s5, av61.t5, av61.u5, new int[]{0}, new int[]{0}};
        w = new String[]{"", JCPRes.getOIDdecl(oid2), JCPRes.getOIDdecl(oid3), JCPRes.getOIDdecl(oid4), JCPRes.getOIDdecl(oid5), JCPRes.getOIDdecl(oid6), JCPRes.getOIDdecl(oid7)};
        x = new DigestParamsSpec[]{new DigestParamsSpec(0), new DigestParamsSpec(1), new DigestParamsSpec(2), new DigestParamsSpec(3), new DigestParamsSpec(4), new DigestParamsSpec(5), new DigestParamsSpec(6)};
        y = c(a("DigestParamsSpec_class_default", oid2));
        z = c(a("DigestParamsSpec_2012_256_class_default", oid6));
        A = c(a("DigestParamsSpec_2012_512_class_default", oid7));
    }

    public DigestParamsSpec(int i) {
        this.a = i;
    }

    public static OID a(String str, OID oid) {
        OID oid2;
        try {
            oid2 = (OID) AccessController.doPrivileged(new htf0(str, 10));
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

    public static DigestParamsSpec getInstance(OID oid, OID oid2) {
        int c2;
        if (oid2 == null) {
            int i = ProviderSpec.getInstance(oid).a;
            c2 = i != 1 ? i != 2 ? y : A : z;
        } else {
            c2 = c(oid2);
        }
        return x[c2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DigestParamsSpec) {
            return this.a == ((DigestParamsSpec) obj).a;
        }
        return false;
    }

    @Override // ru.CryptoPro.JCP.params.DigestParamsInterface, ru.CryptoPro.JCP.params.CryptParamsInterface
    public final int[] getCommutator() {
        return c[this.a];
    }

    @Override // ru.CryptoPro.JCP.params.DigestParamsInterface
    public final int getCommutatorIndex() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCP.params.DigestParamsInterface, ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getDefault(OID oid) {
        int i = ProviderSpec.getInstance(oid).a;
        return b[i != 1 ? i != 2 ? y : A : z];
    }

    @Override // ru.CryptoPro.JCP.params.DigestParamsInterface, ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final String getNameByOID(OID oid) {
        return w[c(oid)];
    }

    @Override // ru.CryptoPro.JCP.params.DigestParamsInterface, ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final OID getOID() {
        return b[this.a];
    }

    @Override // ru.CryptoPro.JCP.params.DigestParamsInterface, ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0036, code lost:
    
        if (r5.equals(ru.CryptoPro.JCP.params.AlgIdSpec.OID_PARAMS_EXC_2012_512) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r4 != 6) goto L21;
     */
    @Override // ru.CryptoPro.JCP.params.DigestParamsInterface, ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enumeration getOIDs(OID oid) {
        OID oid2;
        char c2 = 0;
        Vector vector = new Vector(0);
        if (oid == null) {
            int i = this.a;
            if (i != 5) {
            }
            c2 = 1;
        } else {
            if (!oid.equals(AlgIdSpec.OID_PARAMS_SIG_2012_256) && !oid.equals(AlgIdSpec.OID_PARAMS_EXC_2012_256)) {
                if (!oid.equals(AlgIdSpec.OID_PARAMS_SIG_2012_512)) {
                }
                c2 = 2;
            }
            c2 = 1;
        }
        if (c2 == 0) {
            oid2 = OID_HashVerbaO;
        } else {
            if (c2 != 1) {
                if (c2 == 2) {
                    oid2 = OID_Gost2012_512;
                }
                return vector.elements();
            }
            oid2 = OID_Gost2012_256;
        }
        vector.add(oid2);
        return vector.elements();
    }

    @Override // ru.CryptoPro.JCP.params.DigestParamsInterface
    public final int[] getStartHash() {
        return zeroStartDigestVector;
    }

    @Override // ru.CryptoPro.JCP.params.DigestParamsInterface, ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid, OID oid2) {
        String str;
        char c2;
        int c3 = c(oid2);
        if (c3 != 1 && c3 != 5 && c3 != 6) {
            w511.q();
            return;
        }
        if (c3 == 5) {
            str = "DigestParamsSpec_2012_256_class_default";
            c2 = 1;
        } else if (c3 != 6) {
            c2 = 0;
            str = "DigestParamsSpec_class_default";
        } else {
            str = "DigestParamsSpec_2012_512_class_default";
            c2 = 2;
        }
        if (c2 == 1) {
            z = c3;
        } else if (c2 != 2) {
            y = c3;
        } else {
            A = c3;
        }
        new JCPPref(DigestParamsSpec.class).putOID(str, b[c3]);
    }

    @Override // ru.CryptoPro.JCP.params.DigestParamsInterface, ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final boolean setDefaultAvailable() {
        return nzs.u(DigestParamsSpec.class);
    }

    public final String toString() {
        return getClass().getName() + Extension.COLON_SPACE + b[this.a].toString();
    }

    public static DigestParamsSpec getInstance(int i) {
        if (i == -1) {
            i = b();
        }
        if (i >= 0 && i < b.length) {
            return x[i];
        }
        w511.q();
        return null;
    }

    public static DigestParamsSpec getInstance(OID oid) {
        return x[oid == null ? b() : c(oid)];
    }

    public static DigestParamsSpec getInstance() {
        return x[b()];
    }

    @Override // ru.CryptoPro.JCP.params.DigestParamsInterface, ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final void setDefault(OID oid) {
        setDefault(null, oid);
    }

    @Override // ru.CryptoPro.JCP.params.DigestParamsInterface, ru.CryptoPro.JCP.params.CryptParamsInterface, ru.CryptoPro.JCP.params.ParamsInterface
    public final Enumeration getOIDs() {
        return getOIDs(null);
    }
}
