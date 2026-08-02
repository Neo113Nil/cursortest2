package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class xs60 implements b70 {
    public static final List a = Collections.singletonList("__typename");

    public static ws60 c(xdx xdxVar, c cVar) {
        ss60 ss60Var;
        ts60 ts60Var;
        us60 us60Var;
        j70 j70Var = cVar.a;
        vs60 vs60Var = null;
        String str = null;
        while (xdxVar.h2(a) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("IntroPlan"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            ss60Var = ys60.c(xdxVar, cVar);
        } else {
            ss60Var = null;
        }
        if (a.a(a.b("IntroUntilPlan"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            ts60Var = zs60.c(xdxVar, cVar);
        } else {
            ts60Var = null;
        }
        if (a.a(a.b("TrialPlan"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            us60Var = at60.c(xdxVar, cVar);
        } else {
            us60Var = null;
        }
        if (a.a(a.b("TrialUntilPlan"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            vs60Var = bt60.c(xdxVar, cVar);
        }
        return new ws60(str, ss60Var, ts60Var, us60Var, vs60Var);
    }

    public static void d(bfx bfxVar, c cVar, ws60 ws60Var) {
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(ws60Var.a);
        ss60 ss60Var = ws60Var.b;
        if (ss60Var != null) {
            List list = ys60.a;
            bfxVar.A1("__typename");
            bfxVar.r0(ss60Var.a);
            List list2 = ls60.a;
            ks60 ks60Var = ss60Var.b;
            bfxVar.A1("period");
            foe foeVar2 = l80.a;
            uga1.f(bfxVar, ks60Var.a);
            bfxVar.A1("price");
            ms60 ms60Var = ms60.a;
            js60 js60Var = ks60Var.b;
            if (bfxVar instanceof ek00) {
                ek00 ek00Var = (ek00) bfxVar;
                ek00Var.u();
                ms60Var.a(bfxVar, cVar, js60Var);
                ek00Var.y();
            } else {
                ek00 ek00Var2 = new ek00();
                ek00Var2.u();
                ms60Var.a(ek00Var2, cVar, js60Var);
                ek00Var2.y();
                uga1.f(bfxVar, ek00Var2.c());
            }
            bfxVar.A1("repetitionCount");
            l80.b.a(bfxVar, cVar, Integer.valueOf(ks60Var.c));
        }
        ts60 ts60Var = ws60Var.c;
        if (ts60Var != null) {
            List list3 = zs60.a;
            bfxVar.A1("__typename");
            bfxVar.r0(ts60Var.a);
            List list4 = ps60.a;
            os60 os60Var = ts60Var.b;
            bfxVar.A1("price");
            qs60 qs60Var = qs60.a;
            foe foeVar3 = l80.a;
            ns60 ns60Var = os60Var.a;
            if (bfxVar instanceof ek00) {
                ek00 ek00Var3 = (ek00) bfxVar;
                ek00Var3.u();
                qs60Var.a(bfxVar, cVar, ns60Var);
                ek00Var3.y();
            } else {
                ek00 ek00Var4 = new ek00();
                ek00Var4.u();
                qs60Var.a(ek00Var4, cVar, ns60Var);
                ek00Var4.y();
                uga1.f(bfxVar, ek00Var4.c());
            }
            bfxVar.A1("until");
            foe foeVar4 = l80.a;
            uga1.f(bfxVar, os60Var.b);
        }
        us60 us60Var = ws60Var.d;
        if (us60Var != null) {
            List list5 = at60.a;
            bfxVar.A1("__typename");
            bfxVar.r0(us60Var.a);
            List list6 = pt60.a;
            ot60 ot60Var = us60Var.b;
            bfxVar.A1("period");
            uga1.f(bfxVar, ot60Var.a);
        }
        vs60 vs60Var = ws60Var.e;
        if (vs60Var != null) {
            List list7 = bt60.a;
            bfxVar.A1("__typename");
            bfxVar.r0(vs60Var.a);
            List list8 = rt60.a;
            qt60 qt60Var = vs60Var.b;
            bfxVar.A1("until");
            uga1.f(bfxVar, qt60Var.a);
        }
    }
}
