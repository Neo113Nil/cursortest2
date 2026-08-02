package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.view.b;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class vr2 extends tr2 {
    public final AppCompatSeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public vr2(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = appCompatSeekBar;
    }

    @Override // defpackage.tr2
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        AppCompatSeekBar appCompatSeekBar = this.d;
        dfz0 e = dfz0.e(i, 0, appCompatSeekBar.getContext(), attributeSet, n4i0.AppCompatSeekBar);
        TypedArray typedArray = e.b;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = n4i0.AppCompatSeekBar;
        TypedArray typedArray2 = e.b;
        WeakHashMap weakHashMap = b.a;
        sp31.b(appCompatSeekBar, context, iArr, attributeSet, typedArray2, i, 0);
        Drawable c = e.c(n4i0.AppCompatSeekBar_android_thumb);
        if (c != null) {
            appCompatSeekBar.setThumb(c);
        }
        Drawable b = e.b(n4i0.AppCompatSeekBar_tickMark);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = b;
        if (b != null) {
            b.setCallback(appCompatSeekBar);
            b.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (b.isStateful()) {
                b.setState(appCompatSeekBar.getDrawableState());
            }
            c();
        }
        appCompatSeekBar.invalidate();
        if (typedArray.hasValue(n4i0.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = vbm.c(typedArray.getInt(n4i0.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (typedArray.hasValue(n4i0.AppCompatSeekBar_tickMarkTint)) {
            this.f = e.a(n4i0.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        e.g();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable mutate = drawable.mutate();
                this.e = mutate;
                if (this.h) {
                    mutate.setTintList(this.f);
                }
                if (this.i) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
