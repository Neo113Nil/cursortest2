package defpackage;

import io.appmetrica.analytics.BuildConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes6.dex */
public final class b5t {
    public final f7l a;
    public final z5l b;
    public final e c;
    public final g0l d;
    public final cut e;
    public final k21 f;
    public final ay g;
    public final t3g h;
    public final lum i;

    public b5t(f7l f7lVar, z5l z5lVar, e eVar, g0l g0lVar, cut cutVar, k21 k21Var, ay ayVar, t3g t3gVar, lum lumVar, z4c z4cVar) {
        this.a = f7lVar;
        this.b = z5lVar;
        this.c = eVar;
        this.d = g0lVar;
        this.e = cutVar;
        this.f = k21Var;
        this.g = ayVar;
        this.h = t3gVar;
        this.i = lumVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(b5t b5tVar, String str, cg6 cg6Var) {
        x4t x4tVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof x4t) {
            x4tVar = (x4t) cg6Var;
            int i2 = x4tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x4tVar.l = i2 - Integer.MIN_VALUE;
                Object obj = x4tVar.j;
                nm6 nm6Var = nm6.a;
                i = x4tVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ay ayVar = b5tVar.g;
                    x4tVar.l = 1;
                    obj = ayVar.d(str, true, x4tVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return null;
                }
                if (rj6Var instanceof qj6) {
                    return ((oq) ((qj6) rj6Var).a).F;
                }
                b6e.s();
                return null;
            }
        }
        x4tVar = new x4t(b5tVar, cg6Var);
        Object obj2 = x4tVar.j;
        nm6 nm6Var2 = nm6.a;
        i = x4tVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b5t b5tVar, String str, cg6 cg6Var) {
        y4t y4tVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof y4t) {
            y4tVar = (y4t) cg6Var;
            int i2 = y4tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y4tVar.l = i2 - Integer.MIN_VALUE;
                Object obj = y4tVar.j;
                nm6 nm6Var = nm6.a;
                i = y4tVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    k21 k21Var = b5tVar.f;
                    y4tVar.l = 1;
                    obj = k21.b(k21Var, str, false, y4tVar, 30);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return null;
                }
                if (rj6Var instanceof qj6) {
                    return ((i21) ((qj6) rj6Var).a).g;
                }
                b6e.s();
                return null;
            }
        }
        y4tVar = new y4t(b5tVar, cg6Var);
        Object obj2 = y4tVar.j;
        nm6 nm6Var2 = nm6.a;
        i = y4tVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b5t b5tVar, nvl nvlVar, cg6 cg6Var) {
        z4t z4tVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof z4t) {
            z4tVar = (z4t) cg6Var;
            int i2 = z4tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z4tVar.l = i2 - Integer.MIN_VALUE;
                z4t z4tVar2 = z4tVar;
                Object obj = z4tVar2.j;
                nm6 nm6Var = nm6.a;
                i = z4tVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cut cutVar = b5tVar.e;
                    String str = nvlVar.a;
                    String str2 = nvlVar.b;
                    z4tVar2.l = 1;
                    obj = cut.h(cutVar, str, str2, false, true, z4tVar2, BuildConfig.API_LEVEL);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return null;
                }
                if (rj6Var instanceof qj6) {
                    return ((rrl) ((qj6) rj6Var).a).c;
                }
                b6e.s();
                return null;
            }
        }
        z4tVar = new z4t(b5tVar, cg6Var);
        z4t z4tVar22 = z4tVar;
        Object obj2 = z4tVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = z4tVar22.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    public static boolean d(n7q n7qVar, final ybb ybbVar) {
        if (ybbVar instanceof l20) {
            final int i = 0;
            return wct.E(n7qVar, ((l20) ybbVar).b.a, i3q.a, new Function0() { // from class: w4t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            ArrayList arrayList = ((l20) ybbVar).c;
                            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((h0r) it.next()).a.d());
                            }
                            return arrayList2;
                        case 1:
                            ArrayList arrayList3 = ((fm1) ybbVar).c;
                            ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((h0r) it2.next()).a.d());
                            }
                            return arrayList4;
                        case 2:
                            ArrayList arrayList5 = ((o3m) ybbVar).e;
                            ArrayList arrayList6 = new ArrayList(v75.o(arrayList5, 10));
                            Iterator it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(((h0r) it3.next()).a.d());
                            }
                            return arrayList6;
                        default:
                            List list = ((u1t) ybbVar).c;
                            ArrayList arrayList7 = new ArrayList(v75.o(list, 10));
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                arrayList7.add(((h0r) it4.next()).a.d());
                            }
                            return arrayList7;
                    }
                }
            }, 8);
        }
        if (ybbVar instanceof fm1) {
            final int i2 = 1;
            return zc4.K(n7qVar, ((fm1) ybbVar).b.a, k3q.a, new Function0() { // from class: w4t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            ArrayList arrayList = ((l20) ybbVar).c;
                            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((h0r) it.next()).a.d());
                            }
                            return arrayList2;
                        case 1:
                            ArrayList arrayList3 = ((fm1) ybbVar).c;
                            ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((h0r) it2.next()).a.d());
                            }
                            return arrayList4;
                        case 2:
                            ArrayList arrayList5 = ((o3m) ybbVar).e;
                            ArrayList arrayList6 = new ArrayList(v75.o(arrayList5, 10));
                            Iterator it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(((h0r) it3.next()).a.d());
                            }
                            return arrayList6;
                        default:
                            List list = ((u1t) ybbVar).c;
                            ArrayList arrayList7 = new ArrayList(v75.o(list, 10));
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                arrayList7.add(((h0r) it4.next()).a.d());
                            }
                            return arrayList7;
                    }
                }
            });
        }
        if (ybbVar instanceof o3m) {
            final int i3 = 2;
            return szf.f0(n7qVar, ((o3m) ybbVar).b.d(), o3q.b, new Function0() { // from class: w4t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            ArrayList arrayList = ((l20) ybbVar).c;
                            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((h0r) it.next()).a.d());
                            }
                            return arrayList2;
                        case 1:
                            ArrayList arrayList3 = ((fm1) ybbVar).c;
                            ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((h0r) it2.next()).a.d());
                            }
                            return arrayList4;
                        case 2:
                            ArrayList arrayList5 = ((o3m) ybbVar).e;
                            ArrayList arrayList6 = new ArrayList(v75.o(arrayList5, 10));
                            Iterator it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(((h0r) it3.next()).a.d());
                            }
                            return arrayList6;
                        default:
                            List list = ((u1t) ybbVar).c;
                            ArrayList arrayList7 = new ArrayList(v75.o(list, 10));
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                arrayList7.add(((h0r) it4.next()).a.d());
                            }
                            return arrayList7;
                    }
                }
            }, null, 24);
        }
        if (!(ybbVar instanceof u1t)) {
            b6e.s();
            return false;
        }
        final int i4 = 3;
        Function0 function0 = new Function0() { // from class: w4t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        ArrayList arrayList = ((l20) ybbVar).c;
                        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((h0r) it.next()).a.d());
                        }
                        return arrayList2;
                    case 1:
                        ArrayList arrayList3 = ((fm1) ybbVar).c;
                        ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((h0r) it2.next()).a.d());
                        }
                        return arrayList4;
                    case 2:
                        ArrayList arrayList5 = ((o3m) ybbVar).e;
                        ArrayList arrayList6 = new ArrayList(v75.o(arrayList5, 10));
                        Iterator it3 = arrayList5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(((h0r) it3.next()).a.d());
                        }
                        return arrayList6;
                    default:
                        List list = ((u1t) ybbVar).c;
                        ArrayList arrayList7 = new ArrayList(v75.o(list, 10));
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            arrayList7.add(((h0r) it4.next()).a.d());
                        }
                        return arrayList7;
                }
            }
        };
        n7qVar.getClass();
        return ((Boolean) wdg.A(n7qVar, new ift(function0))).booleanValue();
    }

    public static r3q f(ybb ybbVar) {
        if (ybbVar instanceof l20) {
            lt ltVar = ((l20) ybbVar).b;
            return new j3q(new xc5(ltVar.a), new n3q(ltVar.c), i3q.a);
        }
        if (ybbVar instanceof fm1) {
            u51 u51Var = ((fm1) ybbVar).b;
            return new l3q(new yc5(u51Var.a), new n3q(u51Var.b), k3q.a);
        }
        if (ybbVar instanceof o3m) {
            eul eulVar = ((o3m) ybbVar).b;
            nvl d = eulVar.d();
            return new p3q(new zc5(d.a, d.b), o3q.b, new n3q(eulVar.c));
        }
        if (!(ybbVar instanceof u1t)) {
            b6e.s();
            return null;
        }
        List list = ((u1t) ybbVar).c;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((h0r) it.next()).a.a);
        }
        return new m3q(new cd5(arrayList), ryt.a);
    }

    public static String h(ybb ybbVar) {
        if (ybbVar instanceof l20) {
            return "album";
        }
        if (ybbVar instanceof fm1) {
            return "artist";
        }
        if (ybbVar instanceof o3m) {
            return "playlist";
        }
        if (ybbVar instanceof u1t) {
            return "track";
        }
        b6e.s();
        return null;
    }

    public final void e(c cVar, Function1 function1, mqs mqsVar, a6l a6lVar) {
        z5l.g(this.b, cVar, a6lVar, null, mqsVar, 0, 0, null, null, null, new tx4(function1, null, 2), 24052);
    }

    public final boolean g(ybb ybbVar, w5l w5lVar, a6l a6lVar, kxi kxiVar) {
        z5l z5lVar = this.b;
        ybbVar.getClass();
        kxiVar.getClass();
        z4c.b.l(null);
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((a4q) ((byb) qdcVar.C(I)).c(ern.a(a4q.class))).h()) {
            g0l.p(this.d, hcr.a, ybbVar.b(), f(ybbVar), kxiVar, w5lVar, hrg.q("mobile-trailer-", h(ybbVar), "-default"), null, new u4t(this, 1), 448);
            return false;
        }
        d6l x = p6g.x((e6l) this.a.d.getValue());
        n7q n7qVar = x != null ? x.a : null;
        if (n7qVar != null && d(n7qVar, ybbVar)) {
            return z5lVar.i(true);
        }
        qe5 h = l3l.h(e.j(ybbVar), ybbVar.b(), a6lVar);
        h.d(2);
        h.i = hyn.f;
        h.k = true;
        z5lVar.f(h.b(), uyk.a).k(new v4t(this, 1));
        return true;
    }
}
