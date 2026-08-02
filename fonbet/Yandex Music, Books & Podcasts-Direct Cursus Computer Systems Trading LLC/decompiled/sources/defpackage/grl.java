package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.utils.api.commands.PreviousOrReplayCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class grl extends bfu {
    public final fkn A;
    public final fkn B;
    public final nwh C;
    public final fkn D;
    public final fkn E;
    public final x0q F;
    public final fnb k;
    public final Resources l;
    public final u3h m;
    public final kkl n;
    public final oq7 o;
    public final k1l p;
    public final dn9 q;
    public final jkl r;
    public final t1f s;
    public final n7b t;
    public final yks u;
    public final ime v;
    public final xdr w;
    public final xdr x;
    public final a1l y;
    public final yk3 z;

    public grl(fnb fnbVar, Resources resources, u3h u3hVar) {
        resources.getClass();
        this.k = fnbVar;
        this.l = resources;
        this.m = u3hVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(kkl.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        kkl kklVar = (kkl) qdcVar.C(I);
        this.n = kklVar;
        jyr b = btf.b(new ril(9, this));
        oq7 oq7Var = (oq7) kklVar.b.a(hag.I(oq7.class));
        this.o = oq7Var;
        k1l k1lVar = (k1l) kklVar.b.a(hag.I(k1l.class));
        this.p = k1lVar;
        l13 l13Var = kklVar.b;
        zpl zplVar = (zpl) l13Var.a.D(hag.I(icu.class), l13Var, l13Var.b);
        dn9 dn9Var = new dn9(26);
        this.q = dn9Var;
        mka mkaVar = new mka(28);
        kmd kmdVar = (kmd) l18Var.c(hag.I(kmd.class));
        this.r = new jkl();
        l13 l13Var2 = kklVar.b;
        fal falVar = new fal((g64) l13Var2.a(hag.I(g64.class)), (dk4) l13Var2.a(hag.I(dk4.class)));
        t1f a = kkl.a();
        this.s = a;
        this.t = new n7b(25);
        bdt I2 = hag.I(cjl.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        cjl cjlVar = (cjl) qdcVar2.C(I2);
        yks yksVar = new yks(resources, new atn(13, (Context) l13Var.a.D(hag.I(Context.class), l13Var, l13Var.b), (frt) l13Var.a.D(hag.I(frt.class), l13Var, l13Var.b)));
        this.u = yksVar;
        this.v = new ime(k1lVar, ot0.F(this));
        Continuation continuation = null;
        xdr a2 = ydr.a(null);
        this.w = a2;
        xdr a3 = ydr.a(evo.a);
        this.x = a3;
        g4l g4lVar = oq7Var.b;
        this.y = new a1l(g4lVar.f, 25);
        f7l f7lVar = oq7Var.a;
        pjc C = zsd.C(zsd.M0(f7lVar.c, new qql(0, this, continuation)), 0);
        pjc b0 = zsd.b0(new cla(y1g.L(f7lVar), 5));
        t1f a4 = kkl.a();
        pjc b02 = zsd.b0(new f9l(3, new a1l(b0, 26)));
        bdt I3 = hag.I(z66.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        z66 z66Var = (z66) qdcVar3.C(I3);
        cq4 F = ot0.F(this);
        yk3 yk3Var = new yk3();
        yk3Var.b = a4;
        yk3Var.c = F;
        xdr a5 = ydr.a(Boolean.FALSE);
        yk3Var.d = a5;
        yk3Var.e = ydr.a(null);
        ox6.B(zsd.M0(zsd.b0(new njf(new fs(22, zsd.Q(b02, zsd.b0(new ifd(z66Var.c(), 26)), a5, new h2h(yk3Var, null))), yk3Var, 8)), new cle(continuation, yk3Var, 4)), F, new i2h(yk3Var, 0));
        pjc b03 = zsd.b0(b02);
        int i = 1;
        ox6.B(b03, F, new i2h(yk3Var, i));
        this.z = yk3Var;
        t1f t1fVar = oq7Var.d;
        msa msaVar = nsa.b;
        ssa ssaVar = ssa.MILLISECONDS;
        this.A = zsd.F0(new clc(new i7b(t1fVar.D(yd5.M(100, ssaVar)), 3), new jud(2, 13, null)), ot0.F(this), lbq.a(), 0L);
        fs z = jf0.z(zsd.b0(new a1l(f7lVar.c, 27)), new k32(4, new sjl(23)));
        xdr xdrVar = f7lVar.c;
        clc clcVar = new clc(new i7b(t1fVar.D(yd5.M(500, ssaVar)), 4), new jud(2, 14, null));
        uol uolVar = oq7Var.c;
        fkn F0 = zsd.F0(zsd.P(xdrVar, z, clcVar, uolVar.j, new oql(this, null)), ot0.F(this), lbq.a(), v7l.g);
        this.B = F0;
        icu icuVar = (icu) zplVar;
        xdr xdrVar2 = icuVar.a;
        fkn fknVar = falVar.b;
        fkn F02 = zsd.F0(new v0b(F0, 3), ot0.F(this), lbq.a(), Boolean.FALSE);
        xdr xdrVar3 = (xdr) a.d;
        xdr xdrVar4 = cjlVar.b;
        v5n v5nVar = (v5n) b.getValue();
        cq4 F2 = ot0.F(this);
        xdrVar2.getClass();
        fknVar.getClass();
        xdrVar3.getClass();
        xdrVar4.getClass();
        v5nVar.getClass();
        nwh nwhVar = new nwh();
        nwhVar.b = xdrVar2;
        nwhVar.c = fknVar;
        nwhVar.d = F02;
        nwhVar.e = xdrVar3;
        nwhVar.f = xdrVar4;
        nwhVar.g = v5nVar;
        nwhVar.h = qld.m();
        nwhVar.i = new p9l(nwhVar);
        nwhVar.j = new p2b(nwhVar);
        nwhVar.l = new ogp();
        ox6.B(new u21(9, aal.a, xdrVar4, new v42(nwhVar, null, 10)), F2, o7b.d);
        ox6.B(F02, F2, new fmi(27, nwhVar));
        this.C = nwhVar;
        xdr xdrVar5 = icuVar.a;
        Continuation continuation2 = null;
        v81 v81Var = new v81(new ub7(12, new bca(zsd.M0(zsd.b0(new z78(new bca((xdr) dn9Var.d, 18), 3)), new cle(continuation2, dn9Var, 14)), 18), new seg(dn9Var, continuation2, 19)), 5);
        fkn fknVar2 = (fkn) mkaVar.a;
        a1l a1lVar = new a1l(kmdVar.e, 23);
        fkn fknVar3 = uolVar.j;
        xdr xdrVar6 = (xdr) yk3Var.e;
        xdr xdrVar7 = (xdr) a.d;
        brl brlVar = new brl(10, 4, grl.class, this, "collectData", "collectData(Lcom/yandex/music/screen/player/viewmodel/PlayerViewModel$ComposedPlaybackQueueState;ZLru/yandex/music/likes/LikeState;Lcom/yandex/music/screen/player/api/deps/Quality;Lcom/yandex/music/screen/player/api/deps/PlayerTimerState;Lcom/yandex/music/shared/playback/core/api/model/SharedPlaybackSpeed;Lru/yandex/music/cast/picker/api/player/Device;Lcom/yandex/music/screen/player/viewmodel/LyricsResult;Z)Lcom/yandex/music/screen/player/viewmodel/FlowDataCollector;");
        C.getClass();
        xdrVar5.getClass();
        fknVar2.getClass();
        fknVar3.getClass();
        xdrVar6.getClass();
        xdrVar7.getClass();
        pjc[] pjcVarArr = {C, xdrVar5, v81Var, fknVar2, a1lVar, fknVar3, fknVar, xdrVar6, xdrVar7};
        Continuation continuation3 = null;
        this.D = zsd.F0(zsd.M0(new mpq(17, pjcVarArr, brlVar), new qql(i, this, continuation3)), ot0.F(this), lbq.a(), qnl.a);
        this.E = zsd.F0(zsd.Q(new u21(9, v7q.a, g4lVar.f, new t81(3, 18, continuation3)), a2, a3, new a35(this, continuation3, 7)), ot0.F(this), lbq.a(), gve.a);
        this.F = (x0q) yksVar.d;
        ox6.B(zsd.b0(new a1l(b0, 28)), ot0.F(this), new gql(this, 0));
        ox6.B(cjlVar.d, ot0.F(this), new gql(this, 1));
        ox6.B(falVar.e, ot0.F(this), new gql(this, 2));
        ox6.B(falVar.c, ot0.F(this), new gql(this, 3));
        ox6.B(xdrVar6, ot0.F(this), new gql(this, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(grl grlVar, hql hqlVar, Continuation continuation) {
        nql nqlVar;
        Object obj;
        int i;
        if (continuation instanceof nql) {
            nqlVar = (nql) continuation;
            int i2 = nqlVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nqlVar.m = i2 - Integer.MIN_VALUE;
                obj = nqlVar.k;
                nm6 nm6Var = nm6.a;
                i = nqlVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    g2l g2lVar = new g2l(grlVar, null, 6);
                    nqlVar.j = hqlVar;
                    nqlVar.m = 1;
                    obj = tyf.L(15000L, g2lVar, nqlVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hqlVar = nqlVar.j;
                    qgg.h0(obj);
                }
                if (obj != null) {
                    grlVar.K(hqlVar);
                }
                return Unit.a;
            }
        }
        nqlVar = new nql(grlVar, continuation);
        obj = nqlVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nqlVar.m;
        if (i != 0) {
        }
        if (obj != null) {
        }
        return Unit.a;
    }

    public final mwk G() {
        n7q J = J();
        if (J != null) {
            return J.b();
        }
        return null;
    }

    public final g4q H() {
        return (g4q) this.o.b.c.getValue();
    }

    public final n7q J() {
        d6l x = p6g.x((e6l) this.o.a.c.getValue());
        if (x != null) {
            return x.a;
        }
        return null;
    }

    public final void K(hql hqlVar) {
        hqlVar.getClass();
        xdr xdrVar = this.w;
        xdrVar.getClass();
        xdrVar.m(null, hqlVar);
        if (hqlVar == hql.b) {
            evo evoVar = evo.a;
            xdr xdrVar2 = this.x;
            xdrVar2.getClass();
            xdrVar2.m(null, evoVar);
        }
    }

    public final void L(boolean z) {
        PlaybackCommand$QueueBound playbackCommand$QueueBound;
        nwh nwhVar = this.C;
        k1l k1lVar = this.p;
        if (!z) {
            k1lVar.a(PreviousOrReplayCommand.INSTANCE, new b3t("queue_prev"));
            nwhVar.getClass();
            nwhVar.c(olb.Previous);
        } else {
            g4q H = H();
            if (H != null && (playbackCommand$QueueBound = (PlaybackCommand$QueueBound) zdg.p(H, new xqm())) != null) {
                k1lVar.a(playbackCommand$QueueBound, new b3t("queue_prev"));
            }
            nwhVar.getClass();
            nwhVar.c(olb.SwipeTrackBack);
        }
    }

    public final void M(boolean z) {
        PlaybackCommand$QueueBound playbackCommand$QueueBound;
        g4q H = H();
        if (H != null && (playbackCommand$QueueBound = (PlaybackCommand$QueueBound) zdg.p(H, new irq())) != null) {
            this.p.a(playbackCommand$QueueBound, new b3t("queue_skip"));
        }
        nwh nwhVar = this.C;
        nwhVar.getClass();
        if (z) {
            nwhVar.c(olb.SwipeTrackForward);
        } else {
            nwhVar.c(olb.Next);
        }
    }

    public final void N() {
        boolean z = ((v7l) this.B.a.getValue()).a;
        nwh nwhVar = this.C;
        nwhVar.getClass();
        if (z) {
            nwhVar.c(olb.Pause);
        } else {
            nwhVar.c(olb.Play);
        }
        this.p.a(new ToggleCommand(false), new b3t("core_toggle"));
    }
}
