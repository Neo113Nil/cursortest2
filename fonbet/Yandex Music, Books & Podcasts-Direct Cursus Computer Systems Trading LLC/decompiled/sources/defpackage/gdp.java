package defpackage;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class gdp extends bfu {
    public mfk A;
    public final jek k;
    public final sdk l;
    public final rfk m;
    public final g3j n;
    public final String o;
    public final boolean p;
    public final g0c q;
    public final voi r;
    public final voi s;
    public final voi t;
    public final voi u;
    public final voi v;
    public mgk w;
    public boolean x;
    public rn5 y;
    public s7g z;

    public gdp(jek jekVar, sdk sdkVar, rfk rfkVar, g3j g3jVar, String str, boolean z, g0c g0cVar) {
        jekVar.getClass();
        sdkVar.getClass();
        g0cVar.getClass();
        this.k = jekVar;
        this.l = sdkVar;
        this.m = rfkVar;
        this.n = g3jVar;
        this.o = str;
        this.p = z;
        this.q = g0cVar;
        this.r = new voi();
        this.s = new voi();
        this.t = new voi();
        this.u = new voi();
        this.v = new voi();
        this.z = new wdk(vdk.a);
    }

    public static /* synthetic */ void L(gdp gdpVar) {
        gdpVar.K(new jst());
    }

    public final void G(jst jstVar) {
        f4m f4mVar = new f4m(8, this);
        rn5 rn5Var = this.y;
        if (rn5Var == null) {
            Intrinsics.j("mediator");
            throw null;
        }
        rfk rfkVar = (rfk) rn5Var.h;
        if (rfkVar == null) {
            xq0.q("Invalid state. Selected method is empty.");
            return;
        }
        boolean z = rfkVar instanceof lfk;
        voi voiVar = this.t;
        if (z || (rfkVar instanceof kfk)) {
            voiVar.l(new wcp(rfkVar instanceof kfk ? yqo.a : zqo.a, true));
            return;
        }
        String str = jstVar.a;
        if (str == null) {
            str = this.o;
        }
        voiVar.l(new vcp(true, z));
        this.u.l(nl3.a);
        boolean equals = rfkVar.equals(jfk.a);
        jek jekVar = this.k;
        if (equals || o8g.y(rfkVar)) {
            g3j g3jVar = this.n;
            g3jVar.getClass();
            jekVar.c(g3jVar, str, f4mVar);
            return;
        }
        if (rfkVar.equals(ifk.a)) {
            jekVar.a(str, f4mVar);
            return;
        }
        if ((rfkVar instanceof ffk) && !o8g.y(rfkVar)) {
            jekVar.d(rfkVar, new fdp(this, 1), str, f4mVar);
            return;
        }
        if (rfkVar instanceof mfk) {
            mfk mfkVar = (mfk) rfkVar;
            this.A = mfkVar;
            jekVar.f(mfkVar.a, str, mfkVar.i, new knn(5, this));
        } else if (rfkVar instanceof pfk) {
            jekVar.d(rfkVar, dpo.H, str, f4mVar);
        } else {
            xq0.q("Invalid state. Selected method is not payable here.");
        }
    }

    public final void H(rfk rfkVar, boolean z) {
        qne s = avf.s(rfkVar, z);
        x60 x60Var = (x60) this.q;
        x60Var.getClass();
        x60Var.a(s);
        if (rfkVar.equals(jfk.a)) {
            this.t.l(new scp(z));
        }
    }

    public final void J(List list) {
        rn5 rn5Var = this.y;
        if (rn5Var == null) {
            Intrinsics.j("mediator");
            throw null;
        }
        ArrayList E = rn5Var.E();
        rn5 rn5Var2 = this.y;
        if (rn5Var2 == null) {
            Intrinsics.j("mediator");
            throw null;
        }
        this.t.l(new xcp(E, rn5Var2.I()));
        if (list.size() == 1) {
            H((rfk) CollectionsKt.Q(list), false);
        } else {
            L(this);
        }
    }

    public final void K(jst jstVar) {
        Object ll3Var;
        String str = jstVar.a;
        if (str == null) {
            str = this.o;
        }
        if ((str == null || StringsKt.U(str)) && (this.k.i || !this.p)) {
            ll3Var = new ll3(null);
        } else {
            s7g s7gVar = this.z;
            if (s7gVar instanceof wdk) {
                ll3Var = ((wdk) s7gVar).a == vdk.b ? new ll3(Integer.valueOf(R.string.paymentsdk_wait_for_cvv_title)) : new ll3(null);
            } else {
                if (!Intrinsics.d(s7gVar, xdk.a)) {
                    b6e.s();
                    return;
                }
                rn5 rn5Var = this.y;
                if (rn5Var == null) {
                    Intrinsics.j("mediator");
                    throw null;
                }
                rfk rfkVar = (rfk) rn5Var.h;
                ll3Var = new ml3(rfkVar instanceof mfk ? true : Intrinsics.d(rfkVar, lfk.a) ? true : Intrinsics.d(rfkVar, kfk.a));
            }
        }
        this.u.l(ll3Var);
    }

    public final void a(mgk mgkVar) {
        mgk mgkVar2;
        mgkVar.getClass();
        ArrayList d = mgkVar.d();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(((rfk) next) instanceof gfk)) {
                arrayList.add(next);
            }
        }
        g0c g0cVar = this.q;
        rfk rfkVar = this.m;
        voi voiVar = this.t;
        if (rfkVar == null) {
            if (arrayList.isEmpty()) {
                qne k1 = gut.k1();
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(k1);
                voiVar.l(new scp(false));
                return;
            }
            qne l1 = gut.l1();
            x60 x60Var2 = (x60) g0cVar;
            x60Var2.getClass();
            x60Var2.a(l1);
            List p = o8g.p(arrayList);
            rn5 rn5Var = this.y;
            if (rn5Var == null) {
                Intrinsics.j("mediator");
                throw null;
            }
            rn5Var.U(p);
            List list = p;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((rfk) it2.next()) instanceof mfk) {
                        voiVar.l(new vcp(false, false));
                        rn5 rn5Var2 = this.y;
                        if (rn5Var2 != null) {
                            q7g.O(this.l, rn5Var2.E(), new iwe(25, this, p));
                            return;
                        } else {
                            Intrinsics.j("mediator");
                            throw null;
                        }
                    }
                }
            }
            J(p);
            return;
        }
        qne n1 = gut.n1();
        x60 x60Var3 = (x60) g0cVar;
        x60Var3.getClass();
        x60Var3.a(n1);
        if (o8g.r(o8g.w(rfkVar), arrayList) == null) {
            Parcelable.Creator<bfk> creator = bfk.CREATOR;
            voiVar.l(new tcp(y7g.L(o8g.w(rfkVar))));
            return;
        }
        rn5 rn5Var3 = this.y;
        if (rn5Var3 == null) {
            Intrinsics.j("mediator");
            throw null;
        }
        rn5Var3.U(t75.c(rfkVar));
        if (((rfkVar instanceof ffk) && (mgkVar2 = this.w) != null && !mgkVar2.g(((ffk) rfkVar).a)) || (((rfkVar instanceof jfk) && this.n != null) || (rfkVar instanceof pfk) || (rfkVar instanceof ifk) || (rfkVar instanceof mfk))) {
            G(new jst());
            return;
        }
        if (rfkVar instanceof lfk) {
            voiVar.l(new wcp(zqo.a, false));
            return;
        }
        if (rfkVar instanceof kfk) {
            voiVar.l(new wcp(yqo.a, false));
            return;
        }
        rn5 rn5Var4 = this.y;
        if (rn5Var4 == null) {
            Intrinsics.j("mediator");
            throw null;
        }
        ArrayList E = rn5Var4.E();
        rn5 rn5Var5 = this.y;
        if (rn5Var5 == null) {
            Intrinsics.j("mediator");
            throw null;
        }
        voiVar.l(new xcp(E, rn5Var5.I()));
        H(rfkVar, false);
    }
}
