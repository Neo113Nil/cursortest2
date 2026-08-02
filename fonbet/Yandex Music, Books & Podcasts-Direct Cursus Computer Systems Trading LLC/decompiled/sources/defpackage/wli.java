package defpackage;

import android.content.Context;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.utils.api.commands.AwaitOriginalPositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetOriginalPositionCommand;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes3.dex */
public final class wli implements ag5 {
    public final /* synthetic */ xli a;
    public final /* synthetic */ w2r b;
    public final /* synthetic */ eli c;

    public wli(xli xliVar, w2r w2rVar, eli eliVar) {
        this.a = xliVar;
        this.b = w2rVar;
        this.c = eliVar;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        PlaybackScope q;
        d6v d6vVar;
        e6v e6vVar;
        mqsVar.getClass();
        xli xliVar = this.a;
        ime imeVar = xliVar.a.s;
        imeVar.getClass();
        eli eliVar = this.c;
        eliVar.getClass();
        imeVar.F(new j80(ot0.U((zii) eliVar.b().c, eliVar.a()), ot0.X(eliVar.b()), k80.a));
        hgp hgpVar = xliVar.b;
        zii ziiVar = (zii) this.b.c;
        int ordinal = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return;
            } else if (mqsVar.i() != null) {
                return;
            }
        }
        boolean z = ziiVar instanceof qii;
        wii wiiVar = wii.a;
        vii viiVar = vii.a;
        if (z || (ziiVar instanceof rii) || (ziiVar instanceof tii) || (ziiVar instanceof yii) || (ziiVar instanceof sii) || (ziiVar instanceof uii)) {
            q = d.q();
        } else if (ziiVar.equals(viiVar)) {
            q = d.r();
        } else {
            if (!ziiVar.equals(wiiVar)) {
                b6e.s();
                return;
            }
            q = d.s();
        }
        PlaybackScope playbackScope = q;
        if (z) {
            e6vVar = y5g.s0(((qii) ziiVar).a, i3q.b);
        } else if (ziiVar instanceof rii) {
            e6vVar = y5g.t0(((rii) ziiVar).a, k3q.d);
        } else if (ziiVar instanceof tii) {
            e6vVar = new b6v(y5g.x0(((tii) ziiVar).a, o3q.a));
        } else if (ziiVar.equals(wiiVar)) {
            e6vVar = y5g.B0(mqsVar, dyt.a);
        } else if (ziiVar.equals(viiVar)) {
            e6vVar = y5g.B0(mqsVar, eyt.a);
        } else {
            if (ziiVar instanceof yii) {
                dou douVar = ((yii) ziiVar).a;
                d6vVar = new d6v(hgpVar.e(douVar.b, new s4v(douVar.c, douVar.d), weo.t()), c6v.a);
            } else if (ziiVar instanceof sii) {
                dou douVar2 = ((sii) ziiVar).a;
                d6vVar = new d6v(hgpVar.e(douVar2.b, new s4v(douVar2.c, douVar2.d), weo.t()), c6v.a);
            } else if (!(ziiVar instanceof uii)) {
                b6e.s();
                return;
            } else {
                n7n n7nVar = ((uii) ziiVar).a;
                d6vVar = new d6v(hgpVar.e(o8g.E(n7nVar.c), new s4v(n7nVar.a, n7nVar.b), weo.t()), c6v.a);
            }
            e6vVar = d6vVar;
        }
        zus zusVar = zus.b;
        ve veVar = new ve(muo.HISTORY, zqt.d);
        t tVar = (t) hgpVar.b;
        y supportFragmentManager = tVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        rre.Z(mqsVar, zusVar, e6vVar, veVar, tVar, supportFragmentManager, (kxi) hgpVar.c, playbackScope, null, null, null, 1792);
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        pmi pmiVar;
        p9 qmiVar;
        Boolean bool;
        mqsVar.getClass();
        w2r w2rVar = this.b;
        mqs mqsVar2 = (mqs) w2rVar.d;
        eli eliVar = this.c;
        w70 a = eliVar.a();
        xli xliVar = this.a;
        dae daeVar = new dae(27, xliVar, eliVar);
        hgp hgpVar = xliVar.b;
        t tVar = (t) hgpVar.b;
        if (((Boolean) xliVar.l.invoke()).booleanValue()) {
            a0g.G(tVar, mqsVar2, new ye(xliVar, a, mqsVar2, w2rVar, 25));
            return;
        }
        zii ziiVar = (zii) w2rVar.c;
        if (!ziiVar.r()) {
            ziiVar = null;
        }
        vii viiVar = vii.a;
        if (ziiVar == null) {
            ziiVar = viiVar;
        }
        if (ziiVar instanceof qii) {
            qmiVar = new mmi(mqsVar2, ((qii) ziiVar).a);
        } else if (ziiVar instanceof rii) {
            qmiVar = new mmi(mqsVar2, ((rii) ziiVar).a);
        } else if (ziiVar instanceof tii) {
            qmiVar = new mmi(mqsVar2, ((tii) ziiVar).a);
        } else if (ziiVar instanceof yii) {
            qmiVar = new rmi(mqsVar2, ((yii) ziiVar).a);
        } else if (ziiVar instanceof sii) {
            qmiVar = new nmi(mqsVar2, ((sii) ziiVar).a);
        } else if (ziiVar instanceof uii) {
            qmiVar = new omi(mqsVar2, ((uii) ziiVar).a);
        } else {
            if (!(ziiVar instanceof xii)) {
                b6e.s();
                return;
            }
            xii xiiVar = (xii) ziiVar;
            if (xiiVar.equals(wii.a)) {
                pmiVar = pmi.a;
            } else {
                if (!xiiVar.equals(viiVar)) {
                    b6e.s();
                    return;
                }
                pmiVar = pmi.b;
            }
            qmiVar = new qmi(mqsVar2, pmiVar);
        }
        String t = weo.t();
        d6l x = p6g.x((e6l) ((oq7) ((jyr) hgpVar.d).getValue()).a.c.getValue());
        n7q n7qVar = x != null ? x.a : null;
        mqs mqsVar3 = (mqs) qmiVar.a;
        if (n7qVar != null) {
            bool = (Boolean) wdg.A(n7qVar, new nur(mqsVar3));
            bool.getClass();
        } else {
            bool = null;
        }
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            String t2 = weo.t();
            if (c9g.D(x.a) != 0) {
                daeVar.invoke(t2);
                ((k1l) ((e3q) ((vyk) ((jyr) hgpVar.g).getValue())).j.getValue()).b(new eyk(u75.h(new SetOriginalPositionCommand(), new AwaitOriginalPositionCommand(), new AwaitPlayerConvergedCommand(false), new PlayCommand(false))), new b3t("queue_set_original_position"));
                return;
            } else {
                if (!p6g.C(x)) {
                    daeVar.invoke(t2);
                }
                ((z5l) ((jyr) hgpVar.e).getValue()).i(false);
                return;
            }
        }
        daeVar.invoke(t);
        if (qmiVar instanceof mmi) {
            a0g.G(tVar, mqsVar3, new ye(hgpVar, (mmi) qmiVar, mqsVar3, t, 23));
            return;
        }
        if (qmiVar instanceof rmi) {
            hgpVar.A(((rmi) qmiVar).b, mqsVar3, t);
            return;
        }
        if (qmiVar instanceof nmi) {
            hgpVar.A(((nmi) qmiVar).b, mqsVar3, t);
            return;
        }
        if (qmiVar instanceof omi) {
            n7n n7nVar = ((omi) qmiVar).b;
            hgpVar.z(mqsVar3, mqsVar3.c, hgp.f(mqsVar3, new d6v(hgpVar.e(o8g.E(n7nVar.c), new s4v(n7nVar.a, n7nVar.b), t), c6v.a), new v80("mobile-history-my_vibe-default", ((kxi) hgpVar.c).a(t).a, null)), t);
        } else if (qmiVar instanceof qmi) {
            a0g.G(tVar, mqsVar3, new ye(hgpVar, (qmi) qmiVar, mqsVar3, t, 24));
        } else {
            b6e.s();
        }
    }

    @Override // defpackage.ag5
    public final void e(Context context, mqs mqsVar) {
        context.getClass();
        mqsVar.getClass();
        hgp hgpVar = this.a.b;
        l18 l18Var = l18.b;
        bdt I = hag.I(ty7.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ((ty7) qdcVar.C(I)).invoke(context, mqsVar);
    }
}
