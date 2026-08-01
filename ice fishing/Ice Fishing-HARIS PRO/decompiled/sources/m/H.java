package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import g.AbstractC0155a;

/* loaded from: classes.dex */
public final class H extends C0237C {
    public final C0241G e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3830f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3831g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3832h;
    public boolean i;
    public boolean j;

    public H(C0241G c0241g) {
        super(c0241g);
        this.f3831g = null;
        this.f3832h = null;
        this.i = false;
        this.j = false;
        this.e = c0241g;
    }

    @Override // m.C0237C
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0241G c0241g = this.e;
        Context context = c0241g.getContext();
        int[] iArr = AbstractC0155a.f3039g;
        M0.h i2 = M0.h.i(context, attributeSet, iArr, R.attr.seekBarStyle);
        O.K.k(c0241g, c0241g.getContext(), iArr, attributeSet, (TypedArray) i2.f617c, R.attr.seekBarStyle);
        Drawable d2 = i2.d(0);
        if (d2 != null) {
            c0241g.setThumb(d2);
        }
        Drawable c2 = i2.c(1);
        Drawable drawable = this.f3830f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f3830f = c2;
        if (c2 != null) {
            c2.setCallback(c0241g);
            c2.setLayoutDirection(c0241g.getLayoutDirection());
            if (c2.isStateful()) {
                c2.setState(c0241g.getDrawableState());
            }
            f();
        }
        c0241g.invalidate();
        TypedArray typedArray = (TypedArray) i2.f617c;
        if (typedArray.hasValue(3)) {
            this.f3832h = AbstractC0265l0.b(typedArray.getInt(3, -1), this.f3832h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f3831g = i2.b(2);
            this.i = true;
        }
        i2.l();
        f();
    }

    public final void f() {
        Drawable drawable = this.f3830f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f3830f = mutate;
                if (this.i) {
                    mutate.setTintList(this.f3831g);
                }
                if (this.j) {
                    this.f3830f.setTintMode(this.f3832h);
                }
                if (this.f3830f.isStateful()) {
                    this.f3830f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f3830f != null) {
            int max = this.e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3830f.getIntrinsicWidth();
                int intrinsicHeight = this.f3830f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3830f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3830f.draw(canvas);
                    canvas.translate(width, RecyclerView.f2111C0);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
