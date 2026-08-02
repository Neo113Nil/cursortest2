package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public class ul4 extends MaterialCardView implements bm4 {
    public final gs4 n;

    public ul4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new gs4(this);
    }

    @Override // defpackage.bm4
    public final void a() {
        this.n.getClass();
    }

    @Override // defpackage.bm4
    public final void b() {
        this.n.getClass();
    }

    @Override // defpackage.bm4
    public final void c(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // defpackage.bm4
    public final boolean d() {
        return super.isOpaque();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        gs4 gs4Var = this.n;
        if (gs4Var != null) {
            gs4Var.n(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return (Drawable) this.n.e;
    }

    @Override // defpackage.bm4
    public int getCircularRevealScrimColor() {
        return ((Paint) this.n.c).getColor();
    }

    @Override // defpackage.bm4
    public am4 getRevealInfo() {
        gs4 gs4Var = this.n;
        am4 am4Var = (am4) gs4Var.d;
        if (am4Var == null) {
            return null;
        }
        am4 am4Var2 = new am4(am4Var);
        if (am4Var2.c == Float.MAX_VALUE) {
            float f = am4Var2.a;
            float f2 = am4Var2.b;
            FrameLayout frameLayout = (FrameLayout) gs4Var.b;
            am4Var2.c = wxf.t(f, f2, frameLayout.getWidth(), frameLayout.getHeight());
        }
        return am4Var2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.FrameLayout, bm4] */
    @Override // android.view.View
    public final boolean isOpaque() {
        gs4 gs4Var = this.n;
        if (gs4Var == null) {
            return super.isOpaque();
        }
        if (!((FrameLayout) gs4Var.a).d()) {
            return false;
        }
        am4 am4Var = (am4) gs4Var.d;
        return am4Var == null || am4Var.c == Float.MAX_VALUE;
    }

    @Override // defpackage.bm4
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        gs4 gs4Var = this.n;
        gs4Var.e = drawable;
        ((FrameLayout) gs4Var.b).invalidate();
    }

    @Override // defpackage.bm4
    public void setCircularRevealScrimColor(int i) {
        gs4 gs4Var = this.n;
        ((Paint) gs4Var.c).setColor(i);
        ((FrameLayout) gs4Var.b).invalidate();
    }

    @Override // defpackage.bm4
    public void setRevealInfo(am4 am4Var) {
        this.n.W(am4Var);
    }

    public ul4(Context context) {
        this(context, null);
    }
}
