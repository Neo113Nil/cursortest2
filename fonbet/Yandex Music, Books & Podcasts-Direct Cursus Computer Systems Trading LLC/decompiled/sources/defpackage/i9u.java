package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes3.dex */
public final class i9u extends bfu {
    public final xdr A;
    public final xdr B;
    public final xdr C;
    public final xdr D;
    public final xdr E;
    public final fkn F;
    public rar G;
    public final xdr H;
    public final j0q I;
    public final j0q J;
    public x8u K;
    public x8u L;
    public final kxi k;
    public final d8u l;
    public rar m;
    public final i5l n;
    public final w5u o;
    public final u9u p;
    public final jyr q;
    public List r;
    public Function0 s;
    public boolean t;
    public final byk u;
    public final xdr v;
    public final fkn w;
    public final xdr x;
    public final xdr y;
    public final xdr z;

    public i9u(kxi kxiVar, d8u d8uVar) {
        d8uVar.getClass();
        this.k = kxiVar;
        this.l = d8uVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(e4u.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        e4u e4uVar = (e4u) qdcVar.C(I);
        this.n = new i5l();
        l13 l13Var = e4uVar.a;
        w5u w5uVar = (w5u) l13Var.a.D(hag.I(w5u.class), l13Var, l13Var.b);
        this.o = w5uVar;
        fal falVar = new fal((g64) l13Var.a.D(hag.I(g64.class), l13Var, l13Var.b), (dk4) l13Var.a.D(hag.I(dk4.class), l13Var, l13Var.b));
        cq4 F = ot0.F(this);
        new h(Page.VIDEO_CLIPS);
        bdt I2 = hag.I(e.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        Continuation continuation = null;
        ydr.a(null);
        l18Var.b(hag.I(z5l.class), true);
        l18Var.b(hag.I(oq7.class), true);
        l18Var.b(hag.I(cut.class), true);
        l18Var.b(hag.I(k21.class), true);
        l18Var.b(hag.I(ay.class), true);
        j0q j0qVar = new j0q();
        this.p = (u9u) l13Var.a.D(hag.I(u9u.class), l13Var, l13Var.b);
        this.q = l18Var.b(hag.I(g0l.class), true);
        bdt I3 = hag.I(z66.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        z66 z66Var = (z66) qdcVar3.C(I3);
        this.r = c5b.a;
        this.s = new hft(19);
        this.u = new byk(1);
        this.v = ydr.a(b9u.a);
        int i = 11;
        y4s y4sVar = new y4s(w5uVar.b().a.c, i);
        cq4 F2 = ot0.F(this);
        Boolean bool = Boolean.FALSE;
        this.w = lg3.u0(y4sVar, F2, bool);
        this.x = ydr.a(bool);
        this.y = ydr.a(0);
        this.z = ydr.a(new m6u(null, 0L, 0L));
        this.A = ydr.a(null);
        x8u x8uVar = x8u.AUTO;
        this.B = ydr.a(x8uVar);
        this.C = ydr.a(bool);
        Boolean bool2 = Boolean.TRUE;
        this.D = ydr.a(bool2);
        this.E = ydr.a(bool2);
        int i2 = 3;
        this.F = zsd.F0(new u21(10, new y4s(falVar.b, 13), new y4s(falVar.d, 14), new hk4(i2, 8, continuation)), ot0.F(this), lbq.a, null);
        xdr a = ydr.a(Float.valueOf(0.0f));
        this.H = a;
        kvh kvhVar = new kvh(j0qVar, 26);
        j0q j0qVar2 = new j0q();
        x97.y(F, null, null, new f98(kvhVar, j0qVar2, continuation, 24), 3);
        this.I = j0qVar2;
        this.J = new j0q();
        this.K = x8uVar;
        int i3 = 21;
        ox6.B(zsd.b0(zsd.k0(zsd.M0(zsd.b0(new f9l(i3, new em(new u21(10, new f9l(22, new cla(y1g.L(w5uVar.b().a), i)), w5uVar.i, new ow1(3, 7, (Continuation) null)), 8))), new cle(continuation, w5uVar, 27)), dm6.b)), ot0.F(this), new e9u(this, 0));
        ox6.B(zsd.b0(new f9l(23, new y4s(w5uVar.b().a.c, 12))), ot0.F(this), new e9u(this, 1));
        ox6.B(w5uVar.c.a, ot0.F(this), new e9u(this, 2));
        ox6.B(new ujq(zsd.a0(w5uVar.b().a.c, new j1p(22)), 1), ot0.F(this), new e9u(this, i2));
        t1f t1fVar = w5uVar.b().d;
        msa msaVar = nsa.b;
        int i4 = 5;
        ox6.B(new i7b(t1fVar.D(yd5.M(500, ssa.MILLISECONDS)), i4), ot0.F(this), new e9u(this, 4));
        ox6.B(ox6.L(zsd.d0(a, 1), 500L), ot0.F(this), new e9u(this, i4));
        ox6.B(z66Var.c(), ot0.F(this), new e9u(this, 6));
    }

    public final o3u G() {
        return (o3u) CollectionsKt.S(this.r, ((Number) this.y.getValue()).intValue());
    }

    public final void H(x8u x8uVar) {
        o3u G;
        x1u x1uVar;
        String str;
        String str2;
        String str3;
        String str4;
        if (x8uVar == x8u.AUTO || (G = G()) == null || (x1uVar = G.a) == null) {
            return;
        }
        String str5 = x1uVar.a;
        String str6 = x1uVar.b;
        List list = x1uVar.g;
        List list2 = x1uVar.h;
        int ordinal = x8uVar.ordinal();
        kxi kxiVar = this.k;
        byk bykVar = this.u;
        if (ordinal == 0) {
            String G2 = kxiVar.a.G();
            bykVar.getClass();
            G2.getClass();
            c01 c01Var = (c01) CollectionsKt.firstOrNull(list2);
            nmb nmbVar = bykVar.a;
            if (c01Var == null || (str = c01Var.a) == null) {
                str = "";
            }
            if (c01Var == null || (str2 = c01Var.b) == null) {
                str2 = "";
            }
            String str7 = (String) CollectionsKt.firstOrNull(list);
            String str8 = str7 == null ? "" : str7;
            nmbVar.getClass();
            str6.getClass();
            str5.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("artist_id", str);
            linkedHashMap.put("artist_name", str2);
            linkedHashMap.put("hash", G2);
            linkedHashMap.put("page_type", "object");
            linkedHashMap.put("track_id", str8);
            linkedHashMap.put("track_name", str6);
            linkedHashMap.put("tag", "");
            dfi.p(1, "clip_id", str5, "_meta", linkedHashMap);
            nmbVar.C("Video.FullScreen.Activated", linkedHashMap);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return;
            }
            b6e.s();
            return;
        }
        String G3 = kxiVar.a.G();
        bykVar.getClass();
        G3.getClass();
        c01 c01Var2 = (c01) CollectionsKt.firstOrNull(list2);
        nmb nmbVar2 = bykVar.a;
        if (c01Var2 == null || (str3 = c01Var2.a) == null) {
            str3 = "";
        }
        if (c01Var2 == null || (str4 = c01Var2.b) == null) {
            str4 = "";
        }
        String str9 = (String) CollectionsKt.firstOrNull(list);
        String str10 = str9 == null ? "" : str9;
        nmbVar2.getClass();
        str6.getClass();
        str5.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("artist_id", str3);
        linkedHashMap2.put("artist_name", str4);
        linkedHashMap2.put("hash", G3);
        linkedHashMap2.put("page_type", "object");
        linkedHashMap2.put("track_id", str10);
        linkedHashMap2.put("track_name", str6);
        linkedHashMap2.put("tag", "");
        dfi.p(1, "clip_id", str5, "_meta", linkedHashMap2);
        nmbVar2.C("Video.FullScreen.Deactivated", linkedHashMap2);
    }

    public final void J() {
        rar rarVar = this.G;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.G = null;
        if (((Boolean) this.x.getValue()).booleanValue()) {
            this.G = x97.y(ot0.F(this), null, null, new f9u(this, continuation, 1), 3);
        }
    }

    public final void K(List list, int i, wmn wmnVar, u5l u5lVar) {
        list.getClass();
        wmnVar.getClass();
        xdr xdrVar = this.v;
        xdrVar.getClass();
        xdrVar.m(null, b9u.a);
        this.s = new gk1(this, list, i, wmnVar, u5lVar);
        g0l g0lVar = (g0l) this.q.getValue();
        new icr(i);
        r3s r3sVar = new r3s(20, this);
        aok aokVar = new aok(9);
        g0lVar.getClass();
        kxi kxiVar = this.k;
        kxiVar.getClass();
        g0lVar.q("default", new s6u(list, wmnVar), new p9u(i), kxiVar, u5lVar, b0l.b, aokVar, r3sVar);
    }

    public final void L(boolean z) {
        xdr xdrVar = this.D;
        v3w.n(!((Boolean) xdrVar.getValue()).booleanValue(), xdrVar, null);
        xdr xdrVar2 = this.E;
        if (!((Boolean) xdrVar2.getValue()).booleanValue()) {
            Boolean bool = Boolean.TRUE;
            xdrVar2.getClass();
            xdrVar2.m(null, bool);
        }
        if (z && ((Boolean) xdrVar.getValue()).booleanValue()) {
            this.n.getClass();
            if (i5l.a()) {
                return;
            }
            J();
        }
    }
}
