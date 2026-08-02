package defpackage;

import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes4.dex */
public final class x8r {
    public final xzi a;
    public final is4 b;
    public final fi1 c;

    public x8r(xzi xziVar, is4 is4Var, fi1 fi1Var) {
        this.a = xziVar;
        this.b = is4Var;
        this.c = fi1Var;
    }

    public static String a(String str) {
        if (c.n(str, "/", false)) {
            str = mlr.F(str);
        }
        jch b = new Regex("orig$|[bm]?(\\d+)x(\\d+)$").b(str);
        if (b != null) {
            return b.getValue();
        }
        return null;
    }

    public static Pair b(fi1 fi1Var) {
        xxq c = ((frt) fi1Var.a.getValue()).c();
        String str = c.a;
        if (!c.a()) {
            str = null;
        }
        if (str == null) {
            return new Pair(Boolean.FALSE, 0);
        }
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Integer b = ((v8r) ((byb) qdcVar.C(I)).b(v8r.class)).a().b("sample_size");
        if (b == null) {
            return new Pair(Boolean.FALSE, 0);
        }
        int intValue = b.intValue();
        if (intValue < 0 || intValue >= 101) {
            su4.s(2, null, k5r.i(intValue, "Invalid sampleSize "), null);
        }
        Long r0 = StringsKt.r0(10, str);
        if (r0 != null) {
            return new Pair(Boolean.valueOf((r0.longValue() % ((long) 100)) + 1 <= ((long) intValue)), b);
        }
        return new Pair(Boolean.FALSE, 0);
    }
}
