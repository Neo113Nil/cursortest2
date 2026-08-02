package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import ru.yandex.taxi.bubbles.interactors.a;
import ru.yandex.taxi.bubbles.models.BubbleModelShownFrom;

/* loaded from: classes12.dex */
public final class ygt0 extends ad5 {
    public final po21 A;
    public final qwc B;
    public final a C;
    public final yuf0 D;
    public final jgt0 E;
    public final o050 F;
    public boolean G;
    public dn6 H;
    public l30 I;
    public pzt0 J;
    public final b01 K;
    public final Context x;
    public final Lifecycle y;
    public final ah00 z;

    public ygt0(Context context, Lifecycle lifecycle, ah00 ah00Var, po21 po21Var, qwc qwcVar, a aVar, yuf0 yuf0Var, jgt0 jgt0Var, o050 o050Var) {
        super(wgt0.class);
        this.x = context;
        this.y = lifecycle;
        this.z = ah00Var;
        this.A = po21Var;
        this.B = qwcVar;
        this.C = aVar;
        this.D = yuf0Var;
        this.E = jgt0Var;
        this.F = o050Var;
        dn6.a.getClass();
        this.H = cn6.b;
        this.K = new b01(29, this);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        l30 l30Var = this.I;
        if (l30Var != null) {
            l30Var.cancel();
        }
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    public final void Kg() {
        jgt0 jgt0Var = this.E;
        if (jgt0Var.a().t() && this.G && (!jgt0Var.a().b() || ((gh00) this.z).j() >= 15.0f)) {
            ((wgt0) Dg()).t0();
        } else {
            ((wgt0) Dg()).n0();
        }
    }

    public final void Lg(dn6 dn6Var, BubbleModelShownFrom bubbleModelShownFrom) {
        dn6.a.getClass();
        if (dn6Var == cn6.b) {
            ((wgt0) Dg()).v2();
        } else {
            dn6Var.c(bubbleModelShownFrom);
            ((wgt0) Dg()).pc(dn6Var.b(this.x, this.D), Integer.valueOf(dn6Var.a()));
        }
    }
}
