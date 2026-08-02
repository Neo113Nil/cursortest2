package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.coroutines.Continuation;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes6.dex */
public final class pui {
    public final t a;
    public final PlaybackScope b;
    public final kxi c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final kkp j;
    public final qyf k;

    public pui(t tVar, PlaybackScope playbackScope, kxi kxiVar) {
        tVar.getClass();
        this.a = tVar;
        this.b = playbackScope;
        this.c = kxiVar;
        bdt I = hag.I(z5l.class);
        l18 l18Var = l18.b;
        this.d = l18Var.b(I, true);
        this.e = l18Var.b(hag.I(e.class), true);
        this.f = l18Var.b(hag.I(ms.class), true);
        this.g = l18Var.b(hag.I(nsl.class), true);
        this.h = l18Var.b(hag.I(t3g.class), true);
        this.i = l18Var.b(hag.I(z3g.class), true);
        this.j = new kkp(tVar, playbackScope, kxiVar);
        this.k = wyf.F(tVar.getLifecycle());
    }

    public final qe5 a(oq oqVar, mqs mqsVar, String str) {
        ((e) this.e.getValue()).getClass();
        c b = this.b.b(oqVar);
        Continuation continuation = null;
        sfm sfmVar = new sfm(new hv0(new w90(this, oqVar, continuation, 8), continuation, 27));
        a6l a = this.c.a(str);
        qe5 qe5Var = new qe5(b, sfmVar, new pe5(new v80(b.a(), a.a, a.b), null));
        qe5Var.a(oqVar);
        if (mqsVar != null) {
            qe5Var.g = mqsVar;
            qe5Var.e = -1;
        }
        return qe5Var;
    }

    public final z5l b() {
        return (z5l) this.d.getValue();
    }

    public final void c(mqs mqsVar) {
        mqsVar.getClass();
        zus zusVar = zus.b;
        b6v B0 = y5g.B0(mqsVar, ryt.a);
        ve veVar = new ve(muo.MY_SHELF, zqt.d);
        t tVar = this.a;
        y supportFragmentManager = tVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        rre.Z(mqsVar, zusVar, B0, veVar, tVar, supportFragmentManager, this.c, this.b, null, null, null, 1792);
    }

    public final void d(nu1 nu1Var) {
        x97.y(this.k, null, null, new zig(this, nu1Var, null, 27), 3);
    }
}
