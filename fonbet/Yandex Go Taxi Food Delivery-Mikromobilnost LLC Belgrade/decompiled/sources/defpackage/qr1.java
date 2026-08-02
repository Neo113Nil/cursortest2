package defpackage;

import defpackage.dub0;

/* loaded from: classes5.dex */
public abstract class qr1 {
    public static final dub0 a(cub0 cub0Var) {
        ztb0 ztb0Var = cub0Var.a;
        dub0.a aVar = ztb0Var != null ? new dub0.a(ztb0Var.a, ztb0Var.b, ztb0Var.c) : null;
        ztb0 ztb0Var2 = cub0Var.b;
        return new dub0(aVar, ztb0Var2 != null ? new dub0.a(ztb0Var2.a, ztb0Var2.b, ztb0Var2.c) : null);
    }

    public static final yuf0 b(pq1 pq1Var, String str) {
        String str2 = pq1Var.a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = pq1Var.b;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = pq1Var.c;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = pq1Var.d;
        if (str5 == null) {
            str5 = "";
        }
        return new yuf0(str2, str3, str4, str5, pq1Var.e, str == null ? "" : str);
    }
}
