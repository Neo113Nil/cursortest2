package defpackage;

import android.os.Looper;
import androidx.fragment.app.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kub {
    public final t a;
    public final grl b;
    public final a9l c;
    public final jvo d;
    public final qyf e;
    public final msj f;
    public final xdr g;
    public final fkn h;
    public final fkn i;
    public final fkn j;
    public final fkn k;
    public final pv9 l;
    public final xdr m;
    public final x0q n;
    public final dkn o;
    public rar p;
    public rar q;
    public final xdr r;

    public kub(t tVar, grl grlVar, a9l a9lVar, jvo jvoVar, fal falVar, qyf qyfVar, c2h c2hVar, msj msjVar) {
        tVar.getClass();
        grlVar.getClass();
        a9lVar.getClass();
        jvoVar.getClass();
        this.a = tVar;
        this.b = grlVar;
        this.c = a9lVar;
        this.d = jvoVar;
        this.e = qyfVar;
        this.f = msjVar;
        this.g = grlVar.x;
        Continuation continuation = null;
        fkn F0 = zsd.F0(new bca(grlVar.D, 15), qyfVar, new hdr(5000L, Long.MAX_VALUE), null);
        this.h = F0;
        this.i = grlVar.A;
        this.j = grlVar.B;
        this.k = zsd.F0(new bca(falVar.d, 16), qyfVar, new hdr(5000L, Long.MAX_VALUE), v84.c);
        this.l = new pv9(falVar.a);
        xdr a = ydr.a(q3h.a);
        this.m = a;
        x0q b = y0q.b(0, 0, null, 7);
        this.n = b;
        this.o = new dkn(b);
        xdr a2 = ydr.a(Boolean.FALSE);
        this.r = a2;
        pjc b0 = zsd.b0(new z78(new bca(F0, 18), 1));
        nyf lifecycle = tVar.getLifecycle();
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            xq0.q("Check failed.");
            throw null;
        }
        x97.y(wyf.F(lifecycle), null, null, new j57(lifecycle, b0, (Continuation) null, this), 3);
        x97.y(qyfVar, null, null, new f98(new em(new u21(10, a, a2, new hk4(3, 2, continuation)), 3), continuation, this, 27), 3);
    }

    public final mqs a() {
        mwk b;
        n7q J = this.b.J();
        if (J == null || (b = J.b()) == null) {
            return null;
        }
        return b.a();
    }

    public final void b() {
        xdr xdrVar = this.m;
        Object value = xdrVar.getValue();
        s3h s3hVar = value instanceof s3h ? (s3h) value : null;
        if (s3hVar != null) {
            s3h a = s3h.a(s3hVar, a3h.b, false, 1);
            xdrVar.getClass();
            xdrVar.m(null, a);
        }
    }

    public final void c() {
        grl grlVar = this.b;
        x97.y(ot0.F(grlVar), null, null, new eub(this, null, 0), 3);
        p9l p9lVar = (p9l) grlVar.C.i;
        mqs mqsVar = p9lVar.b;
        if (mqsVar != null) {
            nwh nwhVar = p9lVar.e;
            if (p9lVar.c == q9l.b) {
                p9lVar.c = q9l.c;
                nmb nmbVar = (nmb) nwhVar.h;
                String str = mqsVar.a;
                String str2 = mqsVar.c;
                boolean o = mqsVar.o();
                boolean booleanValue = ((Boolean) ((vdr) nwhVar.b).getValue()).booleanValue();
                nmbVar.getClass();
                str.getClass();
                str2.getClass();
                LinkedHashMap m = dfi.m("page_type", "object", "track_id", str);
                eta.u(m, "track_name", str2, o, "with_videoshot");
                m.put("with_animated_text", String.valueOf(true));
                m.put("videoshot_on", String.valueOf(booleanValue));
                m.put("animated_text_on", String.valueOf(true));
                m.put("_meta", nmb.u(1));
                nmbVar.C("ExpandedPlayer.AnimatedText.Showed", m);
            }
            if (((Boolean) ((fkn) nwhVar.d).a.getValue()).booleanValue()) {
                p9lVar.a();
            }
        }
    }

    public final void d() {
        mqs a;
        grl grlVar = this.b;
        mwk G = grlVar.G();
        if (G == null || (a = G.a()) == null) {
            return;
        }
        yk3 yk3Var = grlVar.z;
        yk3Var.getClass();
        xdr xdrVar = (xdr) yk3Var.e;
        o3h o3hVar = (o3h) xdrVar.getValue();
        Continuation continuation = null;
        y5g y5gVar = o3hVar != null ? o3hVar.b : null;
        e2h e2hVar = y5gVar instanceof e2h ? (e2h) y5gVar : null;
        g1h g1hVar = e2hVar != null ? e2hVar.a : null;
        if (yk3Var.a) {
            return;
        }
        o3h o3hVar2 = (o3h) xdrVar.getValue();
        if (!a.equals(o3hVar2 != null ? o3hVar2.a : null) || g1hVar == null) {
            return;
        }
        x97.y((cq4) yk3Var.c, null, null, new zig(yk3Var, g1hVar, continuation, 5), 3);
        yk3Var.a = true;
    }

    public final void e() {
        ArrayList arrayList;
        mqs a = a();
        if (a == null) {
            return;
        }
        oq oqVar = a.t;
        List list = a.u;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Iterable iterable = ((c01) it.next()).h;
                if (iterable == null) {
                    iterable = c5b.a;
                }
                z75.t(arrayList2, iterable);
            }
            ArrayList g0 = CollectionsKt.g0(list2, arrayList2);
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it2 = g0.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (hashSet.add(((c01) next).a)) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        a9l a9lVar = this.c;
        grl grlVar = this.b;
        if (arrayList == null || !a.n()) {
            if (oqVar == null || !a.l()) {
                return;
            }
            a9lVar.getClass();
            a9lVar.a().u(oqVar);
            nwh nwhVar = grlVar.C;
            nwhVar.getClass();
            nwhVar.r(xkb.AlbumScreen);
            return;
        }
        if (arrayList.size() != 1) {
            lqs I = a.I();
            a9lVar.getClass();
            a9lVar.a().y(arrayList, hld.M(I));
            nwh nwhVar2 = grlVar.C;
            nwhVar2.getClass();
            nwhVar2.r(xkb.ArtistPickerBottomsheet);
            return;
        }
        c01 c01Var = (c01) CollectionsKt.k0(arrayList);
        a9lVar.getClass();
        c01Var.getClass();
        a9lVar.a().w(c01Var);
        nwh nwhVar3 = grlVar.C;
        nwhVar3.getClass();
        nwhVar3.r(xkb.ArtistScreen);
    }

    public final void f(yur yurVar) {
        yurVar.getClass();
        int ordinal = yurVar.ordinal();
        grl grlVar = this.b;
        if (ordinal == 0) {
            grlVar.M(true);
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            grlVar.L(true);
        }
        g();
        xdr xdrVar = this.m;
        Object value = xdrVar.getValue();
        s3h s3hVar = value instanceof s3h ? (s3h) value : null;
        if (s3hVar != null) {
            s3h a = s3h.a(s3hVar, a3h.b, false, 1);
            xdrVar.getClass();
            xdrVar.m(null, a);
        }
    }

    public final void g() {
        rar rarVar = this.p;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.p = x97.y(this.e, null, null, new eub(this, continuation, 1), 3);
    }
}
