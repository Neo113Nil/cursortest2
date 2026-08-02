package defpackage;

import android.content.Context;
import ru.yandex.taxi.logistics.postcard.presentation.PostcardPresentationModalView;

/* loaded from: classes5.dex */
public final class sfe0 extends m230 {
    public final lfe0 E;
    public final w030 F;
    public final yvf0 G;
    public final oep0 H;
    public final boolean I;

    public sfe0(lfe0 lfe0Var, w030 w030Var, yvf0 yvf0Var, oep0 oep0Var) {
        super(null);
        this.E = lfe0Var;
        this.F = w030Var;
        this.G = yvf0Var;
        this.H = oep0Var;
        this.I = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.I;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        ofe0 ofe0Var = (ofe0) obj;
        qfe0 qfe0Var = new qfe0(this, ofe0Var.a, ofe0Var.b);
        lfe0 lfe0Var = this.E;
        lfe0Var.getClass();
        xvf0 b = i5m.b(new f2i(n3w.a(ofe0Var), n3w.a(qfe0Var), 2));
        Context context = lfe0Var.a;
        q5z.h(context);
        return new PostcardPresentationModalView(context, (pfe0) b.get());
    }
}
