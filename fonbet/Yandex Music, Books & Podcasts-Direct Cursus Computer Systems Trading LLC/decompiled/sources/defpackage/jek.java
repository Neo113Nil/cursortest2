package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes4.dex */
public final class jek {
    public final ehk a;
    public final xwj b;
    public final sdk c;
    public final hek d;
    public final egk e;
    public mgk f;
    public ogk g;
    public boolean h;
    public final boolean i;

    public jek(ehk ehkVar, xwj xwjVar, sdk sdkVar, hek hekVar, egk egkVar) {
        ehkVar.getClass();
        this.a = ehkVar;
        this.b = xwjVar;
        this.c = sdkVar;
        this.d = hekVar;
        this.e = egkVar;
        this.i = c.v(ehkVar.a, "payment:", false);
    }

    public final void a(String str, x7o x7oVar) {
        String str2 = this.a.a;
        hek hekVar = this.d;
        egk egkVar = this.e;
        Pair pair = new Pair(hekVar, egkVar);
        str2.getClass();
        if (u7g.a == null) {
            u7g.a = str2;
            u7g.b = pair;
        }
        mgk mgkVar = this.f;
        if (mgkVar == null) {
            Intrinsics.j("payment");
            throw null;
        }
        mgkVar.e(ifk.a, str, egkVar.a(new le3(x7oVar, hekVar)));
    }

    public final void b(String str, x7o x7oVar) {
        mgk mgkVar = this.f;
        if (mgkVar == null) {
            Intrinsics.j("payment");
            throw null;
        }
        mgkVar.n = new ozw(26, x7oVar);
        String str2 = this.a.a;
        hek hekVar = this.d;
        egk egkVar = this.e;
        Pair pair = new Pair(hekVar, egkVar);
        str2.getClass();
        if (u7g.a == null) {
            u7g.a = str2;
            u7g.b = pair;
        }
        mgk mgkVar2 = this.f;
        if (mgkVar2 == null) {
            Intrinsics.j("payment");
            throw null;
        }
        mgkVar2.e(kfk.a, str, egkVar.a(new le3(x7oVar, hekVar)));
    }

    public final void c(g3j g3jVar, String str, x7o x7oVar) {
        g3jVar.getClass();
        x07 x07Var = new x07(x7oVar, xuj.z);
        hek hekVar = this.d;
        hek.f(hekVar, x07Var);
        mgk mgkVar = this.f;
        if (mgkVar == null) {
            Intrinsics.j("payment");
            throw null;
        }
        mgkVar.e(jfk.a, str, this.e.a(new le3(x7oVar, hekVar)));
        ((tdk) this.c).d(g3jVar);
    }

    public final void d(rfk rfkVar, Function1 function1, String str, x7o x7oVar) {
        rfkVar.getClass();
        x07 x07Var = new x07(x7oVar, new ssb(function1, this));
        hek hekVar = this.d;
        hek.f(hekVar, x07Var);
        String str2 = this.a.a;
        egk egkVar = this.e;
        Pair pair = new Pair(hekVar, egkVar);
        str2.getClass();
        if (u7g.a == null) {
            u7g.a = str2;
            u7g.b = pair;
        }
        mgk mgkVar = this.f;
        if (mgkVar != null) {
            mgkVar.e(rfkVar, str, egkVar.a(new le3(x7oVar, hekVar)));
        } else {
            Intrinsics.j("payment");
            throw null;
        }
    }

    public final void e(String str, x7o x7oVar) {
        mgk mgkVar = this.f;
        if (mgkVar == null) {
            Intrinsics.j("payment");
            throw null;
        }
        mgkVar.n = new ozw(26, x7oVar);
        String str2 = this.a.a;
        hek hekVar = this.d;
        egk egkVar = this.e;
        Pair pair = new Pair(hekVar, egkVar);
        str2.getClass();
        if (u7g.a == null) {
            u7g.a = str2;
            u7g.b = pair;
        }
        mgk mgkVar2 = this.f;
        if (mgkVar2 == null) {
            Intrinsics.j("payment");
            throw null;
        }
        mgkVar2.e(lfk.a, str, egkVar.a(new le3(x7oVar, hekVar)));
    }

    public final void f(String str, String str2, String str3, x7o x7oVar) {
        str.getClass();
        ogk ogkVar = this.g;
        if (ogkVar == null) {
            Intrinsics.j("synchronizer");
            throw null;
        }
        qxp qxpVar = new qxp(x7oVar);
        pv9 pv9Var = new pv9(21, x7oVar);
        yop yopVar = ogkVar.g;
        a03 a03Var = new a03(ogkVar, str, str2, str3, qxpVar, pv9Var, 9);
        yopVar.getClass();
        mif.b(mif.b(mif.a(yopVar, a03Var, null, 5), new pl2(x7oVar, 8), null, 5), lhb.y0, new pl2(x7oVar, 9), 1);
    }
}
