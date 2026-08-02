package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class a2e {
    public final jnb a;
    public final Context b;
    public final qyf c;
    public final kxi d;
    public final jyr e;
    public final ekf f;
    public final rdk g;
    public qvk h;

    public a2e(jnb jnbVar) {
        this.a = jnbVar;
        Context requireContext = jnbVar.requireContext();
        requireContext.getClass();
        this.b = requireContext;
        gs4 i0 = wdp.i0(jnbVar);
        nyf nyfVar = (nyf) i0.a;
        qyf F = wyf.F(nyfVar);
        this.c = F;
        kxi kxiVar = (kxi) i0.d;
        this.d = kxiVar;
        bdt I = hag.I(m4l.class);
        l18 l18Var = l18.b;
        this.e = l18Var.b(I, true);
        jyr b = l18Var.b(hag.I(mg5.class), true);
        ekf ekfVar = new ekf(jnbVar.g.m());
        this.f = ekfVar;
        this.g = new rdk(F, (mg5) b.getValue(), kxiVar, ekfVar, new nha(17, this), new aub(1, this, a2e.class, "uiAnalyticsData", "uiAnalyticsData(Lru/yandex/music/data/wave/recommendations/seeds/Seeds;)Lcom/yandex/music/shared/core/evgen/analytics/PlaybackStartAnalyticsData;", 0, 12));
        nyfVar.a(new ao7(2, kyf.ON_DESTROY, this));
    }

    public final void a(List list, boolean z, xpt xptVar, String str) {
        qvk qvkVar = this.h;
        if (qvkVar == null) {
            qvkVar = new qvk();
            qvkVar.a(new h88(this.b, false));
            this.h = qvkVar;
        }
        qvk qvkVar2 = qvkVar;
        qvkVar2.b = new w1e(z, this, 1);
        x97.y(this.c, null, null, new ov(qvkVar2, (Object) this, str, list, xptVar, (Continuation) null, 26), 3);
    }
}
