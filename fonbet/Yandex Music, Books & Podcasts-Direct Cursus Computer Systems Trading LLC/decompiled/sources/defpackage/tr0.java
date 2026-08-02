package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class tr0 extends xiu {
    public final sr0 h;
    public Drawable i;
    public ColorStateList j;
    public PorterDuff.Mode k;
    public boolean l;
    public boolean m;

    public tr0(sr0 sr0Var) {
        super(sr0Var);
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = false;
        this.h = sr0Var;
    }

    public final void J() {
        Drawable drawable = this.i;
        if (drawable != null) {
            if (this.l || this.m) {
                Drawable mutate = drawable.mutate();
                this.i = mutate;
                if (this.l) {
                    mutate.setTintList(this.j);
                }
                if (this.m) {
                    this.i.setTintMode(this.k);
                }
                if (this.i.isStateful()) {
                    this.i.setState(this.h.getDrawableState());
                }
            }
        }
    }

    public final void K(Canvas canvas) {
        if (this.i != null) {
            int max = this.h.getMax();
            if (max > 1) {
                int intrinsicWidth = this.i.getIntrinsicWidth();
                int intrinsicHeight = this.i.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.i.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.i.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // defpackage.xiu
    public final void y(AttributeSet attributeSet, int i) {
        super.y(attributeSet, i);
        sr0 sr0Var = this.h;
        Context context = sr0Var.getContext();
        int[] iArr = ken.g;
        lum W = lum.W(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) W.b;
        wdu.p(sr0Var, sr0Var.getContext(), iArr, attributeSet, (TypedArray) W.b, i, 0);
        Drawable N = W.N(0);
        if (N != null) {
            sr0Var.setThumb(N);
        }
        Drawable M = W.M(1);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.i = M;
        if (M != null) {
            M.setCallback(sr0Var);
            M.setLayoutDirection(sr0Var.getLayoutDirection());
            if (M.isStateful()) {
                M.setState(sr0Var.getDrawableState());
            }
            J();
        }
        sr0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.k = xpa.c(typedArray.getInt(3, -1), this.k);
            this.m = true;
        }
        if (typedArray.hasValue(2)) {
            this.j = W.J(2);
            this.l = true;
        }
        W.f0();
        J();
    }
}
