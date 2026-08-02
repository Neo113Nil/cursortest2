package yads;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import defpackage.auo;
import defpackage.dl71;
import defpackage.hm61;
import defpackage.ux71;
import defpackage.wp61;
import defpackage.xn81;

/* loaded from: classes7.dex */
public final class t52 extends FrameLayout {
    public final og3 a;
    public final TextureView b;
    public final e42 c;
    public xn81 d;
    public wp61 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t52(Context context, og3 og3Var, TextureView textureView, e42 e42Var) {
        super(context);
        dl71 dl71Var = new dl71();
        this.a = og3Var;
        this.b = textureView;
        this.c = e42Var;
        this.e = dl71Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xn81 xn81Var = this.d;
        if (xn81Var != null) {
            ux71 ux71Var = (ux71) xn81Var;
            ux71Var.a.c(ux71Var.b.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xn81 xn81Var = this.d;
        if (xn81Var != null) {
            ux71 ux71Var = (ux71) xn81Var;
            ux71Var.b.a.a.clearAnimation();
            ux71Var.a.c(null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        hm61 l = this.e.l(i, i2);
        super.onMeasure(l.a, l.b);
    }

    public final void setAspectRatio(float f) {
        this.e = new auo(f);
    }

    public final void setOnAttachStateChangeListener(xn81 xn81Var) {
        this.d = xn81Var;
    }
}
