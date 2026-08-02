package defpackage;

import android.content.Context;
import androidx.fragment.app.y;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes4.dex */
public final class ik1 extends m18 {
    public final Context b;
    public final y c;
    public final hv0 d;
    public final u51 e;
    public final kxi f;
    public final kc g;
    public final jyr h;
    public final jyr i;

    public ik1(Context context, y yVar, hv0 hv0Var, u51 u51Var, kxi kxiVar, kc kcVar) {
        context.getClass();
        yVar.getClass();
        u51Var.getClass();
        this.b = context;
        this.c = yVar;
        this.d = hv0Var;
        this.e = u51Var;
        this.f = kxiVar;
        this.g = kcVar;
        bdt I = hag.I(e.class);
        l18 l18Var = l18.b;
        this.h = l18Var.b(I, true);
        this.i = l18Var.b(hag.I(z5l.class), true);
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        mqsVar.getClass();
        int ordinal = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return;
            } else if (mqsVar.i() != null) {
                return;
            }
        }
        zus zusVar = zus.b;
        k3q k3qVar = k3q.a;
        u51 u51Var = this.e;
        rre.Z(mqsVar, zusVar, y5g.t0(u51Var, k3qVar), new ve(muo.ARTIST, zqt.d), this.b, this.c, this.f, d.f(u51Var.a, u51Var.b), null, null, null, 1792);
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        mqsVar.getClass();
        String t = weo.t();
        u51 u51Var = this.e;
        PlaybackScope f = d.f(u51Var.a, u51Var.b);
        ((e) this.h.getValue()).getClass();
        c e = f.e(u51Var);
        jyr jyrVar = this.i;
        if (!((z5l) jyrVar.getValue()).c(e, mqsVar, false)) {
            a0g.G(this.b, mqsVar, new ye(this, t, e, mqsVar, 4));
        } else if (((z5l) jyrVar.getValue()).i(false)) {
            this.g.invoke(t);
        }
    }
}
