package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import yads.aq;
import yads.eb2;
import yads.hm2;
import yads.kz1;
import yads.p9;
import yads.r41;
import yads.t22;
import yads.w4;
import yads.xz;
import yads.y02;

/* loaded from: classes7.dex */
public abstract class va81 {
    public final cr71 A;
    public final jzz B;
    public final st81 C;
    public final ot81 D;
    public final cr71 E;
    public final b181 F;
    public final vi71 G;
    public final fp71 H;
    public o081 I;
    public final x081 J;
    public final String K;
    public final List L;
    public final rr41 M;
    public final Context a;
    public final nr41 b;
    public final ku81 c;
    public final vi71 d;
    public final hlx0 e;
    public final v981 f;
    public final ck61 g;
    public final fe81 h;
    public final d881 i;
    public final qb71 j;
    public final ak81 k;
    public final ml71 l;
    public final bl61 m;
    public final iy61 n;
    public final c481 o;
    public final j981 p;
    public final ui21 q;
    public final w040 r;
    public final shu s;
    public final d381 t;
    public final d381 u;
    public final rr41 v;
    public final kzo w;
    public final f69 x;
    public final hn71 y;
    public final rr71 z;

    public va81(Context context, hq71 hq71Var, nr41 nr41Var) {
        c481 c481Var;
        sz61 sz61Var;
        s781 s781Var;
        yx71 ha81Var;
        ku81 ku81Var = hq71Var.d;
        vi71 vi71Var = hq71Var.b;
        hlx0 hlx0Var = hq71Var.c;
        tg81 tg81Var = hq71Var.a;
        v981 v981Var = hq71Var.h;
        ck61 ck61Var = hq71Var.e;
        j371 j371Var = hq71Var.f;
        cr71 cr71Var = hq71Var.g;
        se71 se71Var = hq71Var.i;
        p9 p9Var = hq71Var.j;
        fe81 fe81Var = tg81Var.c;
        xz xzVar = fe81Var.a;
        d881 d881Var = tg81Var.b;
        qb71 qb71Var = tg81Var.a;
        List list = (List) hlx0Var.b;
        String str = (String) hlx0Var.x;
        ak81 ak81Var = qb71Var.i;
        ml71 ml71Var = new ml71();
        jh81 jh81Var = new jh81();
        bl61 bl61Var = new bl61();
        i181 i181Var = new i181();
        eb2 a = eb2.h.a(context);
        iz71 iz71Var = new iz71();
        iy61 iy61Var = new iy61();
        ji41 ji41Var = ck61Var.a;
        c481 c481Var2 = c481.c;
        if (c481Var2 == null) {
            synchronized (c481.b) {
                c481Var = c481.c;
                if (c481Var == null) {
                    c481Var = new c481();
                    c481.c = c481Var;
                }
            }
        } else {
            c481Var = c481Var2;
        }
        j981 j981Var = new j981(context, fe81Var, v981Var);
        rr41 rr41Var = new rr41(4, new aj31(18, vi71Var), cr71Var);
        ui21 ui21Var = new ui21(list);
        w040 w040Var = new w040(context, d881Var, fe81Var, v981Var, (w4) hlx0Var.y);
        shu shuVar = new shu(list, 2);
        n291 n291Var = (n291) v981Var;
        Context context2 = n291Var.a;
        d381 d381Var = new d381(ji41Var, xzVar, d881Var, str, wha1.c(context2, context2));
        d381 d381Var2 = new d381(context, v981Var, ji41Var, xzVar, d881Var, str);
        rr41 rr41Var2 = new rr41(context, v981Var, ji41Var, xzVar, str);
        kzo kzoVar = new kzo(context, v981Var, ji41Var, xzVar, d881Var, str);
        f69 f69Var = new f69(list, false);
        hn71 hn71Var = new hn71(list);
        hn71 hn71Var2 = new hn71(new mf1((byte) 0, 27, str));
        rr71 rr71Var = new rr71();
        cr71 cr71Var2 = new cr71(fe81Var, d881Var, list);
        new pb81(context, fe81Var, v981Var);
        new l681();
        Context context3 = n291Var.a;
        wha1.c(context3, context3);
        jzz jzzVar = new jzz();
        this.a = context;
        this.b = nr41Var;
        this.c = ku81Var;
        this.d = vi71Var;
        this.e = hlx0Var;
        this.f = v981Var;
        this.g = ck61Var;
        this.h = fe81Var;
        this.i = d881Var;
        this.j = qb71Var;
        this.k = ak81Var;
        this.l = ml71Var;
        this.m = bl61Var;
        this.n = iy61Var;
        this.o = c481Var;
        this.p = j981Var;
        this.q = ui21Var;
        this.r = w040Var;
        this.s = shuVar;
        this.t = d381Var;
        this.u = d381Var2;
        this.v = rr41Var2;
        this.w = kzoVar;
        this.x = f69Var;
        this.y = hn71Var;
        this.z = rr71Var;
        this.A = cr71Var2;
        this.B = jzzVar;
        st81 st81Var = new st81(context, fe81Var, ck61Var.b.a, d881Var);
        this.C = st81Var;
        int i = cs71.b;
        String obj = toString();
        String str2 = obj == null ? "" : obj;
        this.J = new x081(this);
        nr41 nr41Var2 = new nr41(24, this);
        String str3 = d881Var.e;
        if (str3 == null && (str3 = fe81Var.c.a) == null) {
            str3 = "";
        }
        this.K = str3;
        this.L = qb71Var.f;
        Object obj2 = ui21Var.a.get("media");
        d171 d171Var = obj2 instanceof d171 ? (d171) obj2 : null;
        if (d171Var != null) {
            s781Var = d171Var.b != null ? new s781() : null;
            sz61Var = d171Var.a != null ? new sz61() : null;
        } else {
            sz61Var = null;
            s781Var = null;
        }
        this.M = new rr41(14, s781Var, sz61Var);
        go61 go61Var = new go61(context, st81Var, w040Var, hn71Var2);
        bl61Var.c.add(go61Var);
        bl61Var.d.add(go61Var);
        bl61Var.b.add(go61Var);
        bl61Var.e.add(go61Var);
        ArrayList arrayList = (ArrayList) hlx0Var.c;
        w4 w4Var = (w4) hlx0Var.y;
        go61Var.e = arrayList;
        go61Var.f = w4Var;
        oz61 oz61Var = go61Var.c;
        oz61Var.c = false;
        oz61Var.d = false;
        b181 b181Var = new b181(context, v981Var, d881Var, fe81Var, st81Var, jh81Var, iz71Var);
        this.F = b181Var;
        this.G = new vi71(21, b181Var, iz71Var, bl61Var);
        int ordinal = p9Var.ordinal();
        if (ordinal == 0) {
            ac71 ac71Var = i181Var.a;
            p9 p9Var2 = p9.d;
            ac71Var.getClass();
            z871 a2 = ac71.a(p9Var2);
            ac71 ac71Var2 = i181Var.a;
            p9 p9Var3 = p9.c;
            ac71Var2.getClass();
            ha81Var = new ha81(new xl71(w040Var, a2), new xl71(w040Var, ac71.a(p9Var3)));
        } else {
            if (ordinal != 1 && ordinal != 2) {
                w511.b();
                throw null;
            }
            i181Var.a.getClass();
            ha81Var = new xl71(w040Var, ac71.a(p9Var));
        }
        ot81 ot81Var = new ot81(context, fe81Var, v981Var, ha81Var, nr41Var2, str2, p9Var);
        this.D = ot81Var;
        switch (j371Var.a) {
            case 0:
                r581 r581Var = j371Var.b.a;
                kgx kgxVar = o381.b[0];
                r581Var.getClass();
                r581Var.a = new WeakReference(bl61Var);
                break;
            default:
                bl61Var.a.add(j371Var.b);
                break;
        }
        bl61Var.a.add(new v481(ot81Var));
        this.E = new cr71(ot81Var, new no6(context, rr41Var, d881Var, fe81Var, v981Var, p9Var, hn71Var2, bl61Var, iz71Var, (ArrayList) hlx0Var.w), new cr71(vi71Var, arrayList), a, 6);
        ot81Var.i = bl61Var;
        synchronized (ot81Var) {
            ot81Var.b.c(d881Var);
            ot81Var.l.clear();
            ot81Var.b.invalidate();
            ot81Var.k = false;
            ot81Var.d();
            ot81Var.b(arrayList);
        }
        this.H = new fp71(list, b181Var, iz71Var, bl61Var, se71Var != null ? se71Var.f : null);
    }

    public static void f(va81 va81Var, c481 c481Var) {
        boolean z;
        c481Var.getClass();
        synchronized (c481.b) {
            Iterator it = c481Var.a.entrySet().iterator();
            z = false;
            while (it.hasNext()) {
                if (((va81) ((Map.Entry) it.next()).getValue()) == va81Var) {
                    it.remove();
                    z = true;
                }
            }
        }
        if (z) {
            va81Var.l();
        }
    }

    public final void b(uio0 uio0Var) {
        this.F.g.y = uio0Var;
        this.r.h = uio0Var;
        z4m0 z4m0Var = this.C.b;
        z4m0Var.A = uio0Var;
        ((n871) ((hlx0) z4m0Var.z).c).k = uio0Var;
        ((z4m0) ((vi71) ((no6) this.E.c).x).w).A = new rr41(29, uio0Var, this.y);
        this.t.c.y = uio0Var;
        this.u.c.y = uio0Var;
        ((hlx0) this.v.c).y = uio0Var;
        ((hlx0) this.w.x).y = uio0Var;
    }

    public final void c(View view) {
        o781 o781Var = new o781(this);
        rr71 rr71Var = this.z;
        rr71Var.getClass();
        Context context = view.getContext();
        vu71 vu71Var = rr71Var.a;
        if (vu71Var != null) {
            vu71Var.b.d(context, vu71Var);
        }
        Activity activity = null;
        rr71Var.a = null;
        y02 y02Var = rr71Var.b;
        if (y02Var != null) {
            y02Var.b();
        }
        rr71Var.b = null;
        Context context2 = view.getContext();
        int i = 0;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                break;
            }
            int i2 = i + 1;
            if (i >= 10) {
                break;
            }
            if (context2 instanceof Activity) {
                activity = (Activity) context2;
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
                i = i2;
            }
        }
        if (activity != null) {
            vu71 vu71Var2 = new vu71(activity, o781Var);
            rr71Var.a = vu71Var2;
            vu71Var2.b.b(activity, vu71Var2);
        }
        y02 y02Var2 = new y02(view, o781Var);
        rr71Var.b = y02Var2;
        y02Var2.a();
    }

    public final void d(View view, v881 v881Var, aj31 aj31Var) {
        va81 va81Var;
        c481 c481Var = this.o;
        c481Var.getClass();
        Object obj = c481.b;
        synchronized (obj) {
            va81Var = (va81) c481Var.a.get(view);
        }
        if (equals(va81Var)) {
            return;
        }
        if (va81Var != null) {
            va81Var.l();
        }
        f(this, c481Var);
        synchronized (obj) {
            c481Var.a.put(view, this);
        }
        o081 o081Var = new o081(aj31Var, this.h, this.f, v881Var, this.m, this.g, this.q, this.M, this.l, this.i, this.e, this.b, this.p, this.k, this.B, ks81.b);
        vi71 vi71Var = this.d;
        o081Var.b();
        kzo kzoVar = this.w;
        d881 d881Var = (d881) kzoVar.c;
        if (kzoVar.b) {
            kzoVar.b = false;
        } else {
            hn71 e = ((hlx0) kzoVar.x).e();
            Map map = (Map) e.b;
            Map map2 = d881Var.r;
            if (map2 != null) {
                map.putAll(map2);
            }
            no61 no61Var = d881Var.i;
            e.c = no61Var;
            ((ge71) kzoVar.w).c(new zj71("rebind", new LinkedHashMap(map), no61Var));
        }
        this.n.getClass();
        HashMap hashMap = o081Var.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            i281 i281Var = (i281) entry.getValue();
            if (i281Var != null ? i281Var.b() : false) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        this.v.p(arrayList, hm2.u);
        List list = this.x.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!((uy71) obj2).f) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            i281 a = o081Var.a((uy71) next);
            if (a == null || !a.b()) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((uy71) it3.next()).a);
        }
        if (!arrayList4.isEmpty()) {
            d381 d381Var = this.u;
            hlx0 hlx0Var = d381Var.c;
            d881 d881Var2 = d381Var.a;
            hn71 e2 = hlx0Var.e();
            Map map3 = (Map) e2.b;
            e2.r("no_view_for_asset", CRLReasonCodeExtension.REASON);
            e2.r(arrayList4, "assets");
            Map map4 = d881Var2.r;
            if (map4 != null) {
                map3.putAll(map4);
            }
            no61 no61Var2 = d881Var2.i;
            e2.c = no61Var2;
            d381Var.b.c(new zj71("expected_view_missing", new LinkedHashMap(map3), no61Var2));
        }
        this.I = o081Var;
        this.y.c = o081Var;
        vi71 vi71Var2 = (vi71) vi71Var.b;
        vi71Var2.w = o081Var;
        vi71Var.w = o081Var;
        boolean k = vi71Var2.k(new u381(3, vi71Var2));
        String str = (String) vi71Var2.c;
        if (k) {
            this.c.e(o081Var);
            k(o081Var);
            c(view);
            return;
        }
        d381 d381Var2 = this.t;
        hn71 e3 = d381Var2.c.e();
        Map map5 = (Map) e3.b;
        e3.r("no_view_for_asset", CRLReasonCodeExtension.REASON);
        e3.r(str, "asset_name");
        d881 d881Var3 = d381Var2.a;
        Map map6 = d881Var3.r;
        if (map6 != null) {
            map5.putAll(map6);
        }
        no61 no61Var3 = d881Var3.i;
        e3.c = no61Var3;
        d381Var2.b.c(new zj71("binding_failure", new LinkedHashMap(map5), no61Var3));
        throw new kz1(String.format("Resource for required view " + str + " is not present", Arrays.copyOf(new Object[0], 0)), str);
    }

    public final void e(View view, v881 v881Var, aj31 aj31Var, t171 t171Var) {
        va81 va81Var;
        c481 c481Var;
        c481 c481Var2 = c481.c;
        if (c481Var2 == null) {
            synchronized (c481.b) {
                c481Var = c481.c;
                if (c481Var == null) {
                    c481Var = new c481();
                    c481.c = c481Var;
                }
            }
            c481Var2 = c481Var;
        }
        Object obj = c481.b;
        synchronized (obj) {
            va81Var = (va81) c481Var2.a.get(view);
        }
        if (equals(va81Var)) {
            return;
        }
        if (va81Var != null) {
            va81Var.l();
        }
        f(this, c481Var2);
        synchronized (obj) {
            c481Var2.a.put(view, this);
        }
        o081 o081Var = new o081(aj31Var, this.h, this.f, v881Var, this.m, this.g, this.q, this.M, this.l, this.i, this.e, this.b, this.p, this.k, this.B, t171Var.a);
        o081Var.b();
        this.I = o081Var;
        this.y.c = o081Var;
        vi71 vi71Var = this.d;
        ((vi71) vi71Var.b).w = o081Var;
        vi71Var.w = o081Var;
        this.c.e(o081Var);
        fp71 fp71Var = this.H;
        t171Var.b = new ui21((List) fp71Var.a, (b181) fp71Var.b, o081Var, (iz71) fp71Var.c, (bl61) fp71Var.w, (fj71) fp71Var.x);
        k(o081Var);
        c(view);
    }

    public abstract void h();

    public void j(nr41 nr41Var) {
        this.C.a.b = nr41Var;
    }

    public final void k(o081 o081Var) {
        this.c.c(o081Var, this.G);
        d881 d881Var = this.i;
        boolean z = jl40.l(d881Var.t, t22.c.b) || jl40.l(d881Var.t, t22.d.b);
        cr71 cr71Var = this.A;
        if (((fe81) cr71Var.b).m) {
            if (((d881) cr71Var.x).x) {
                v571 v571Var = (v571) cr71Var.w;
                List list = (List) cr71Var.c;
                v571Var.getClass();
                Set a = v571.a(list);
                if (!a.isEmpty()) {
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        if (!((cu81) it.next()).f) {
                        }
                    }
                }
            }
            if (!z) {
                h();
            }
        }
        List list2 = this.s.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            i281 a2 = o081Var.a((uy71) obj);
            if (a2 != null ? a2.b() : false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((uy71) it2.next()).a);
        }
        this.v.p(arrayList2, hm2.v);
        m();
    }

    public final void l() {
        n();
        rr71 rr71Var = this.z;
        vu71 vu71Var = rr71Var.a;
        if (vu71Var != null) {
            vu71Var.b.d(this.a, vu71Var);
        }
        rr71Var.a = null;
        y02 y02Var = rr71Var.b;
        if (y02Var != null) {
            y02Var.b();
        }
        rr71Var.b = null;
        o081 o081Var = this.I;
        if (o081Var != null) {
            this.c.e(o081Var);
            cr71 cr71Var = (cr71) this.E.w;
            ((Handler) cr71Var.c).removeCallbacksAndMessages(null);
            View a = o081Var.c.a();
            if (a instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) a;
                d181 d181Var = ((tx71) cr71Var.b).a;
                WeakHashMap weakHashMap = d181Var.d;
                WeakHashMap weakHashMap2 = d181Var.e;
                WeakReference weakReference = (WeakReference) weakHashMap.get(frameLayout);
                aq aqVar = weakReference != null ? (aq) weakReference.get() : null;
                if (aqVar != null) {
                    d181Var.d.remove(frameLayout);
                    frameLayout.removeView(aqVar);
                }
                WeakReference weakReference2 = (WeakReference) weakHashMap2.get(frameLayout);
                r41 r41Var = weakReference2 != null ? (r41) weakReference2.get() : null;
                if (r41Var != null) {
                    weakHashMap2.remove(frameLayout);
                    frameLayout.removeView(r41Var);
                }
            }
            this.y.c = null;
        }
    }

    public final void m() {
        View a;
        boolean z;
        boolean z2;
        o081 o081Var = this.I;
        if (o081Var == null || (a = o081Var.c.a()) == null) {
            return;
        }
        boolean z3 = true;
        if (a.isAttachedToWindow()) {
            cr71 cr71Var = this.E;
            Context context = this.a;
            x081 x081Var = this.J;
            o081 o081Var2 = this.I;
            no6 no6Var = (no6) cr71Var.c;
            int i = 18;
            boolean z4 = false;
            if (!no6Var.a) {
                no6Var.a = true;
                kzo kzoVar = (kzo) no6Var.y;
                ((Handler) kzoVar.x).post(new uqs(kzoVar, (rr41) kzoVar.c, z4, i));
            }
            ((ot81) cr71Var.b).c();
            ((eb2) cr71Var.x).a(x081Var);
            if (o081Var2 != null) {
                cr71 cr71Var2 = (cr71) cr71Var.w;
                pf81 pf81Var = (pf81) cr71Var2.w;
                gg81 a2 = pf81Var.a.a(context);
                Boolean bool = a2 != null ? a2.Q : null;
                a081 a081Var = pf81Var.a;
                Object obj = a081.f;
                synchronized (obj) {
                    z = a081Var.c;
                }
                a081 a081Var2 = pf81Var.a;
                a081Var2.getClass();
                synchronized (obj) {
                    z2 = a081Var2.d;
                }
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else if ((!z || !xga1.c(context)) && !z2) {
                    z3 = false;
                }
                if (z3) {
                    ((Handler) cr71Var2.c).post(new do91(cr71Var2, o081Var2, z4, i));
                }
            }
        }
    }

    public final void n() {
        cr71 cr71Var = this.E;
        no6 no6Var = (no6) cr71Var.c;
        no6Var.a = false;
        ((Handler) ((kzo) no6Var.y).x).removeCallbacksAndMessages(null);
        ((ot81) cr71Var.b).d();
        ((eb2) cr71Var.x).b(this.J);
        ((Handler) ((cr71) cr71Var.w).c).removeCallbacksAndMessages(null);
    }

    public final List f() {
        return this.L;
    }

    public final qb71 b() {
        return this.j;
    }

    public final rr41 d() {
        return this.M;
    }
}
