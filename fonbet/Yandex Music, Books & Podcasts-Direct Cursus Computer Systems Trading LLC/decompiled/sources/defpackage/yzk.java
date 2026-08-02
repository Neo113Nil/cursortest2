package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes4.dex */
public final class yzk {
    public final cq4 a;
    public final PlaybackScope b;
    public final kxi c;
    public final e d;
    public final xdr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final j0q i;

    public yzk(cq4 cq4Var, PlaybackScope playbackScope, kxi kxiVar) {
        playbackScope.getClass();
        kxiVar.getClass();
        this.a = cq4Var;
        this.b = playbackScope;
        this.c = kxiVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(e.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.d = (e) qdcVar.C(I);
        this.e = ydr.a(null);
        this.f = l18Var.b(hag.I(z5l.class), true);
        this.g = l18Var.b(hag.I(oq7.class), true);
        l18Var.b(hag.I(cut.class), true);
        this.h = l18Var.b(hag.I(k21.class), true);
        l18Var.b(hag.I(ay.class), true);
        this.i = new j0q();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(yzk yzkVar, String str, cg6 cg6Var) {
        vzk vzkVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof vzk) {
            vzkVar = (vzk) cg6Var;
            int i2 = vzkVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vzkVar.l = i2 - Integer.MIN_VALUE;
                Object obj = vzkVar.j;
                nm6 nm6Var = nm6.a;
                i = vzkVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    k21 k21Var = (k21) yzkVar.h.getValue();
                    vzkVar.l = 1;
                    obj = k21.b(k21Var, str, false, vzkVar, 30);
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
                    return (i21) ((qj6) rj6Var).a;
                }
                b6e.s();
                return null;
            }
        }
        vzkVar = new vzk(yzkVar, cg6Var);
        Object obj2 = vzkVar.j;
        nm6 nm6Var2 = nm6.a;
        i = vzkVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    public static boolean e(n7q n7qVar, final czk czkVar) {
        if (czkVar instanceof zyk) {
            zyk zykVar = (zyk) czkVar;
            final int i = 0;
            return wct.E(n7qVar, zykVar.a.a, zykVar.c, new Function0() { // from class: tzk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            List list = ((zyk) czkVar).b;
                            ArrayList arrayList = new ArrayList(v75.o(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((mqs) it.next()).d());
                            }
                            return arrayList;
                        default:
                            List list2 = ((bzk) czkVar).b;
                            ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((mqs) it2.next()).d());
                            }
                            return arrayList2;
                    }
                }
            }, 8);
        }
        if (czkVar instanceof azk) {
            azk azkVar = (azk) czkVar;
            String str = azkVar.a.a;
            k3q k3qVar = azkVar.d;
            List list = azkVar.b;
            return zc4.K(n7qVar, str, k3qVar, list != null ? new zga(list, 2) : null);
        }
        if (!(czkVar instanceof bzk)) {
            b6e.s();
            return false;
        }
        bzk bzkVar = (bzk) czkVar;
        final int i2 = 1;
        return szf.f0(n7qVar, bzkVar.a.g(), bzkVar.c, new Function0() { // from class: tzk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        List list2 = ((zyk) czkVar).b;
                        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((mqs) it.next()).d());
                        }
                        return arrayList;
                    default:
                        List list22 = ((bzk) czkVar).b;
                        ArrayList arrayList2 = new ArrayList(v75.o(list22, 10));
                        Iterator it2 = list22.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((mqs) it2.next()).d());
                        }
                        return arrayList2;
                }
            }
        }, bzkVar.d, 8);
    }

    public final se5 b(u51 u51Var, List list, String str) {
        this.d.getClass();
        PlaybackScope playbackScope = this.b;
        playbackScope.getClass();
        u51Var.getClass();
        return l3l.h(playbackScope.e(u51Var), list, this.c.a(str)).b();
    }

    public final j0q c() {
        kvh kvhVar = new kvh(this.i, 26);
        j0q j0qVar = new j0q();
        x97.y(this.a, null, null, new f98(kvhVar, j0qVar, (Continuation) null, 24), 3);
        return j0qVar;
    }

    public final pjc d() {
        return zsd.b0(new u21(10, new bca(this.e, 18), ((oq7) this.g.getValue()).a.c, new v42(this, null, 9)));
    }

    public final void f(u51 u51Var, List list) {
        u51Var.getClass();
        list.getClass();
        azk azkVar = new azk(u51Var, list, null, t3q.b(this.b));
        xdr xdrVar = this.e;
        xdrVar.getClass();
        xdrVar.m(null, azkVar);
    }

    public final void g(se5 se5Var) {
        ((z5l) this.f.getValue()).d(se5Var, true, uyk.a).k(new szk(this, 0));
    }

    public final void h(String str) {
        str.getClass();
        czk czkVar = (czk) this.e.getValue();
        if (czkVar == null) {
            return;
        }
        d6l x = p6g.x((e6l) ((oq7) this.g.getValue()).a.c.getValue());
        n7q n7qVar = x != null ? x.a : null;
        boolean e = n7qVar != null ? e(n7qVar, czkVar) : false;
        jyr jyrVar = this.f;
        if (e) {
            ((z5l) jyrVar.getValue()).i(false);
            return;
        }
        boolean z = czkVar instanceof zyk;
        kxi kxiVar = this.c;
        PlaybackScope playbackScope = this.b;
        e eVar = this.d;
        if (z) {
            zyk zykVar = (zyk) czkVar;
            oq oqVar = zykVar.a;
            eVar.getClass();
            qe5 h = l3l.h(e.a(playbackScope, oqVar), zykVar.b, kxiVar.a(str));
            h.a(oqVar);
            g(h.b());
            return;
        }
        if (czkVar instanceof azk) {
            azk azkVar = (azk) czkVar;
            List list = azkVar.b;
            if (list != null) {
                g(b(azkVar.a, list, str));
                return;
            } else if (azkVar.c != null) {
                z5l.e((z5l) jyrVar.getValue(), new xzk(azkVar, this, str, (Continuation) null)).k(new szk(this, 1));
                return;
            } else {
                z5l.e((z5l) jyrVar.getValue(), new xzk(this, azkVar, str, (Continuation) null)).k(new szk(this, 1));
                return;
            }
        }
        if (!(czkVar instanceof bzk)) {
            b6e.s();
            return;
        }
        bzk bzkVar = (bzk) czkVar;
        cvl cvlVar = bzkVar.a;
        eVar.getClass();
        qe5 h2 = l3l.h(e.f(playbackScope, cvlVar), bzkVar.b, kxiVar.a(str));
        h2.l = bzkVar.d;
        h2.c(cvlVar);
        g(h2.b());
    }
}
