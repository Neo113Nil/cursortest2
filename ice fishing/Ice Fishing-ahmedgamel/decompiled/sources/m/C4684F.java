package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.IceFishing.LiveIceFishing.C5248R;
import g.AbstractC4528a;

/* renamed from: m.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4684F extends C4679A {

    /* renamed from: e, reason: collision with root package name */
    public final C4683E f39063e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f39064f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f39065g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f39066h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f39067j;

    public C4684F(C4683E c4683e) {
        super(c4683e);
        this.f39065g = null;
        this.f39066h = null;
        this.i = false;
        this.f39067j = false;
        this.f39063e = c4683e;
    }

    @Override // m.C4679A
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, C5248R.attr.seekBarStyle);
        C4683E c4683e = this.f39063e;
        Context context = c4683e.getContext();
        int[] iArr = AbstractC4528a.f37556g;
        l4.g s9 = l4.g.s(context, attributeSet, iArr, C5248R.attr.seekBarStyle);
        O.X.n(c4683e, c4683e.getContext(), iArr, attributeSet, (TypedArray) s9.f38917v, C5248R.attr.seekBarStyle);
        Drawable j6 = s9.j(0);
        if (j6 != null) {
            c4683e.setThumb(j6);
        }
        Drawable i4 = s9.i(1);
        Drawable drawable = this.f39064f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f39064f = i4;
        if (i4 != null) {
            i4.setCallback(c4683e);
            H.b.b(i4, c4683e.getLayoutDirection());
            if (i4.isStateful()) {
                i4.setState(c4683e.getDrawableState());
            }
            f();
        }
        c4683e.invalidate();
        TypedArray typedArray = (TypedArray) s9.f38917v;
        if (typedArray.hasValue(3)) {
            this.f39066h = AbstractC4707j0.b(typedArray.getInt(3, -1), this.f39066h);
            this.f39067j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f39065g = s9.h(2);
            this.i = true;
        }
        s9.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f39064f;
        if (drawable != null) {
            if (this.i || this.f39067j) {
                Drawable mutate = drawable.mutate();
                this.f39064f = mutate;
                if (this.i) {
                    H.a.h(mutate, this.f39065g);
                }
                if (this.f39067j) {
                    H.a.i(this.f39064f, this.f39066h);
                }
                if (this.f39064f.isStateful()) {
                    this.f39064f.setState(this.f39063e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f39064f != null) {
            int max = this.f39063e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f39064f.getIntrinsicWidth();
                int intrinsicHeight = this.f39064f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i4 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f39064f.setBounds(-i, -i4, i, i4);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f39064f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
