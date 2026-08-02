package defpackage;

import android.os.Parcel;
import androidx.fragment.app.t;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.k;
import com.yandex.media.ynison.service.m;
import com.yandex.media.ynison.service.u;
import com.yandex.media.ynison.service.w;
import com.yandex.messenger.websdk.api.NotificationClickIntentFactory;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.text.c;

/* loaded from: classes6.dex */
public final class cuk implements o7q, zzo, ccg, NotificationClickIntentFactory, pun {
    public /* synthetic */ cuk(Object obj) {
    }

    public static drt B(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        if (str.length() == 0) {
            str = CommonUrlParts.Values.FALSE_INTEGER;
        }
        if (str3 == null) {
            str3 = "";
        }
        return new drt(str, str2, str3, !str.equals(CommonUrlParts.Values.FALSE_INTEGER));
    }

    public static final String w(pdv pdvVar, String str) {
        return String.format("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", Arrays.copyOf(new Object[]{pdvVar.a, Integer.valueOf(pdvVar.b), Integer.valueOf(pdvVar.c), Integer.valueOf(pdvVar.d), Integer.valueOf(pdvVar.e), f1d.d(1, 1, c.r(c.r(c.r(str, "\\u003C", "<", false), "\\n", "", false), "\\\"", "\"", false))}, 6));
    }

    @Override // defpackage.ccg
    public Object I(Continuation continuation) {
        return Unit.a;
    }

    @Override // defpackage.ccg
    public bcg O() {
        return null;
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        xax xaxVar = (xax) ((z6x) obj).s();
        m9x m9xVar = new m9x(1, (i8s) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = w4x.a;
        obtain.writeInt(1);
        o8g.p0(obtain, o8g.o0(obtain, 20293));
        obtain.writeStrongBinder(m9xVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            xaxVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // defpackage.zzo
    public boolean b() {
        return true;
    }

    @Override // defpackage.o7q
    public Object c() {
        su4.s(2, null, "SharedYnisonQueueState should not be converted to player state in active mode via this method", null);
        return null;
    }

    @Override // defpackage.zzo
    public void f(y6p y6pVar, int i) {
        y6pVar.getClass();
    }

    @Override // defpackage.ccg
    public void l(t tVar) {
        tVar.getClass();
    }

    @Override // defpackage.o7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        throw null;
    }

    @Override // defpackage.o7q
    public Object n(szu szuVar) {
        z4q z4qVar;
        String str;
        w Q;
        szuVar.getClass();
        e5q e5qVar = szuVar.a;
        g9p g9pVar = null;
        if (e5qVar instanceof z4q) {
            z4qVar = (z4q) e5qVar;
        } else {
            if (!(e5qVar instanceof d5q)) {
                b6e.s();
                return null;
            }
            z4qVar = null;
        }
        jzs jzsVar = (jzs) CollectionsKt.firstOrNull(szuVar.o());
        List j = jzsVar == null ? szuVar.j() : CollectionsKt.h0(szuVar.j(), jzsVar);
        fyu X = u1g.X(szuVar.l(), jzsVar == null);
        List e = szuVar.b.a.a.e();
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        asw U = y7g.U(e, new asw(e5bVar, e5bVar));
        List<jzs> list = j;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (jzs jzsVar2 : list) {
            jzsVar2.getClass();
            arrayList.add(o2g.q0(jzsVar2, U.b(jzsVar2.g)));
        }
        Map map = U.a;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList2.add(y7g.W((d6v) entry.getValue(), ((Number) entry.getKey()).intValue()));
        }
        Map map2 = U.b;
        ArrayList arrayList3 = new ArrayList(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            arrayList3.add(y7g.V((b6v) entry2.getValue(), ((Number) entry2.getKey()).intValue()));
        }
        if (z4qVar == null) {
            Q = t7g.P(szuVar.j().size(), szuVar.m().a, szuVar.m().b, arrayList3);
        } else {
            List<jzs> o = szuVar.o();
            ArrayList arrayList4 = new ArrayList(v75.o(o, 10));
            for (jzs jzsVar3 : o) {
                jzsVar3.getClass();
                arrayList4.add(o2g.q0(jzsVar3, U.b(jzsVar3.g)));
            }
            xnu id = z4qVar.getId();
            if (id instanceof tnu) {
                str = ((tnu) id).b;
            } else {
                if (!(id instanceof unu)) {
                    b6e.s();
                    return null;
                }
                str = ((unu) id).b;
            }
            Q = t7g.Q(str, CollectionsKt.g0(arrayList2, arrayList3), arrayList4, szuVar.m.b.b, szuVar.m().a, szuVar.m().b);
        }
        if (e5qVar instanceof u4q) {
            g9pVar = ((u4q) e5qVar).a.a.a();
        } else if (e5qVar instanceof s4q) {
            g9pVar = ((s4q) e5qVar).a.a.a();
        } else if (e5qVar instanceof w4q) {
            g9pVar = ((w4q) e5qVar).a.a.a();
        } else if (e5qVar instanceof y4q) {
            g9pVar = ((y4q) e5qVar).a.e().a();
        } else if (!(e5qVar instanceof b5q)) {
            b6e.s();
            return null;
        }
        return new aow(Q, arrayList, X, g9pVar);
    }

    @Override // defpackage.zzo
    public void o(y6p y6pVar, int i) {
        y6pVar.getClass();
    }

    @Override // defpackage.zzo
    public void p(k7p k7pVar, int i) {
        k7pVar.getClass();
    }

    @Override // defpackage.o7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        String a = y4dVar.a.a.a.a();
        dhl t = w.t();
        ehl i = k.i();
        i.h(a);
        t.d();
        w.f((w) t.b, (k) i.b());
        w wVar = (w) t.b();
        k4d k4dVar = y4dVar.b;
        e5d e5dVar = k4dVar.a;
        v80 v80Var = k4dVar.b;
        e5dVar.getClass();
        String str = e5dVar.a;
        gxc gxcVar = v80Var.b;
        return new aow(wVar, t75.c(bzf.J(str, lwk.INFINITE, gxcVar.a, gxcVar.b, v80Var.a, e5dVar.c, null, e5dVar.e, null)), (g9p) null, 12);
    }

    @Override // defpackage.zzo
    public void r(k7p k7pVar, int i) {
        k7pVar.getClass();
    }

    @Override // defpackage.o7q
    public Object t(t1q t1qVar) {
        w R;
        f J;
        List list = t1qVar.e;
        z3q z3qVar = t1qVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((m1q) obj).a() != null) {
                arrayList.add(obj);
            }
        }
        boolean z = z3qVar instanceof c1q;
        g9p g9pVar = null;
        if (z) {
            String str = ((c1q) z3qVar).c.a;
            int size = arrayList.size();
            String G = avf.G("glagol");
            String t = weo.t();
            str.getClass();
            t.getClass();
            c5b c5bVar = c5b.a;
            khl m = u.m();
            m.h(t7g.y(0, 1, str));
            R = t7g.O(c5bVar, size, (u) m.b(), G, t);
        } else if (z3qVar instanceof e1q) {
            String str2 = ((e1q) z3qVar).c.a;
            int size2 = arrayList.size();
            String G2 = avf.G("glagol");
            String t2 = weo.t();
            str2.getClass();
            t2.getClass();
            c5b c5bVar2 = c5b.a;
            khl m2 = u.m();
            m2.h(t7g.z(0, 1, str2));
            R = t7g.O(c5bVar2, size2, (u) m2.b(), G2, t2);
        } else if (z3qVar instanceof r1q) {
            String d = ((r1q) z3qVar).c.a.d();
            int size3 = arrayList.size();
            String G3 = avf.G("glagol");
            String t3 = weo.t();
            t3.getClass();
            c5b c5bVar3 = c5b.a;
            khl m3 = u.m();
            m3.h(t7g.A(0, 1, d, null));
            R = t7g.O(c5bVar3, size3, (u) m3.b(), G3, t3);
        } else if (z3qVar instanceof a2q) {
            R = t7g.R(arrayList.size(), avf.G("glagol"), weo.t());
        } else if (z3qVar instanceof u1q) {
            c5b c5bVar4 = c5b.a;
            R = t7g.Q("", c5bVar4, c5bVar4, arrayList.size() - 1, avf.G("glagol"), weo.t());
        } else if (z3qVar instanceof h1q) {
            String str3 = ((h1q) z3qVar).b.a;
            str3.getClass();
            dhl t4 = w.t();
            ehl i = k.i();
            i.h(str3);
            t4.d();
            w.f((w) t4.b, (k) i.b());
            R = (w) t4.b();
        } else {
            if (!(z3qVar instanceof k1q)) {
                b6e.s();
                return null;
            }
            R = t7g.R(arrayList.size(), avf.G("glagol"), weo.t());
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m1q m1qVar = (m1q) it.next();
            v80 v80Var = m1qVar.b;
            String str4 = v80Var.a;
            gxc gxcVar = v80Var.b;
            str4.getClass();
            gxcVar.getClass();
            boolean z2 = m1qVar instanceof c2q;
            lwk lwkVar = lwk.TRACK;
            if (z2) {
                mqs mqsVar = ((c2q) m1qVar).d;
                mqsVar.getClass();
                iiw q = ngg.q(mqsVar);
                J = bzf.J(q.a, lwkVar, gxcVar.a, gxcVar.b, str4, mqsVar.c, q.b, mqsVar.x0.a.getUri(), null);
            } else if (m1qVar instanceof e2q) {
                ckd ckdVar = ((e2q) m1qVar).c;
                J = bzf.J(ckdVar.a, lwkVar, gxcVar.a, gxcVar.b, str4, ckdVar.d, null, ckdVar.f, null);
            } else {
                if (!(m1qVar instanceof j1q)) {
                    b6e.s();
                    return null;
                }
                e5d e5dVar = ((j1q) m1qVar).d;
                e5dVar.getClass();
                J = bzf.J(e5dVar.a, lwk.INFINITE, gxcVar.a, gxcVar.b, str4, e5dVar.c, null, e5dVar.e, null);
            }
            arrayList2.add(J);
        }
        if (z3qVar instanceof u1q) {
            g9pVar = o8g.E(c9g.E(((u1q) z3qVar).c.a)).a();
        } else if (!z && !(z3qVar instanceof e1q) && !(z3qVar instanceof r1q) && !(z3qVar instanceof a2q) && !(z3qVar instanceof h1q) && !(z3qVar instanceof k1q)) {
            b6e.s();
            return null;
        }
        return new aow(R, arrayList2, g9pVar, 4);
    }

    @Override // defpackage.o7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        dhl t = w.t();
        ghl i = m.i();
        String str = u7uVar.a.a.a;
        i.d();
        m.f((m) i.b, str);
        m mVar = (m) i.b();
        t.d();
        w.g((w) t.b, mVar);
        w wVar = (w) t.b();
        ArrayList<i5u> arrayList = u7uVar.g;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        for (i5u i5uVar : arrayList) {
            arrayList2.add(ngg.O(i5uVar.a, i5uVar.b, i5uVar.c));
        }
        return new aow(wVar, arrayList2, (g9p) null, 12);
    }

    @Override // defpackage.ccg
    public void a() {
    }
}
