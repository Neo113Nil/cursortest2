package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.t;
import java.util.List;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class c0v {
    public final jnb a;
    public final Context b;
    public final qyf c;
    public final kxi d;
    public final jyr e;
    public final rdk f;
    public qvk g;

    public c0v(jnb jnbVar) {
        gs4 i0 = wdp.i0(jnbVar);
        Context requireContext = jnbVar.requireContext();
        requireContext.getClass();
        nyf nyfVar = (nyf) i0.a;
        this.a = jnbVar;
        this.b = requireContext;
        qyf F = wyf.F(nyfVar);
        this.c = F;
        kxi kxiVar = (kxi) i0.d;
        this.d = kxiVar;
        ekf ekfVar = new ekf(jnbVar.g.m());
        bdt I = hag.I(m4l.class);
        l18 l18Var = l18.b;
        this.e = l18Var.b(I, true);
        this.f = new rdk(F, (mg5) l18Var.b(hag.I(mg5.class), true).getValue(), kxiVar, ekfVar, new f5r(20, this), new lgq(1, this, c0v.class, "uiAnalyticsData", "uiAnalyticsData(Lru/yandex/music/data/wave/recommendations/seeds/Seeds;)Lcom/yandex/music/shared/core/evgen/analytics/PlaybackStartAnalyticsData;", 0, 26));
        nyfVar.a(new ao7(6, kyf.ON_DESTROY, this));
    }

    public static void b(boolean z, t tVar) {
        tVar.getClass();
        a aVar = tVar instanceof a ? (a) tVar : null;
        if (aVar != null) {
            v3w.n(z, aVar.L, null);
        }
        np2 np2Var = (np2) vq2.R(tVar);
        if (np2Var != null) {
            np2Var.l().p(z);
        }
    }

    public final void a(List list, boolean z, Bundle bundle, String str) {
        list.getClass();
        str.getClass();
        if (bundle == null) {
            c(list, z, null, str);
            return;
        }
        dyd a = dyd.a(bundle);
        if (a == null || a.c) {
            return;
        }
        c(list, z, (xpt) a.b, str);
        a.c = true;
    }

    public final void c(List list, boolean z, xpt xptVar, String str) {
        qvk qvkVar = this.g;
        if (qvkVar == null) {
            qvkVar = new qvk();
            qvkVar.a(new h88(this.b, false));
            this.g = qvkVar;
        }
        qvk qvkVar2 = qvkVar;
        qvkVar2.b = new w1e(z, this, 6);
        x97.y(this.c, null, null, new inr(qvkVar2, this, str, list, xptVar, null, 11), 3);
    }
}
