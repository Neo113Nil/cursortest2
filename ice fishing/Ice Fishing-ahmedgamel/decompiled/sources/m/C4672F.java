package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.icefishingapp.icefishing.C5275R;
import g.AbstractC4518a;

/* renamed from: m.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4672F extends C4667A {

    /* renamed from: e, reason: collision with root package name */
    public final C4671E f38995e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f38996f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f38997g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f38998h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f38999j;

    public C4672F(C4671E c4671e) {
        super(c4671e);
        this.f38997g = null;
        this.f38998h = null;
        this.i = false;
        this.f38999j = false;
        this.f38995e = c4671e;
    }

    @Override // m.C4667A
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, C5275R.attr.seekBarStyle);
        C4671E c4671e = this.f38995e;
        Context context = c4671e.getContext();
        int[] iArr = AbstractC4518a.f37594g;
        j4.g s9 = j4.g.s(context, attributeSet, iArr, C5275R.attr.seekBarStyle);
        O.X.n(c4671e, c4671e.getContext(), iArr, attributeSet, (TypedArray) s9.f38405v, C5275R.attr.seekBarStyle);
        Drawable j6 = s9.j(0);
        if (j6 != null) {
            c4671e.setThumb(j6);
        }
        Drawable i6 = s9.i(1);
        Drawable drawable = this.f38996f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f38996f = i6;
        if (i6 != null) {
            i6.setCallback(c4671e);
            H.b.b(i6, c4671e.getLayoutDirection());
            if (i6.isStateful()) {
                i6.setState(c4671e.getDrawableState());
            }
            f();
        }
        c4671e.invalidate();
        TypedArray typedArray = (TypedArray) s9.f38405v;
        if (typedArray.hasValue(3)) {
            this.f38998h = AbstractC4694j0.b(typedArray.getInt(3, -1), this.f38998h);
            this.f38999j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f38997g = s9.h(2);
            this.i = true;
        }
        s9.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f38996f;
        if (drawable != null) {
            if (this.i || this.f38999j) {
                Drawable mutate = drawable.mutate();
                this.f38996f = mutate;
                if (this.i) {
                    H.a.h(mutate, this.f38997g);
                }
                if (this.f38999j) {
                    H.a.i(this.f38996f, this.f38998h);
                }
                if (this.f38996f.isStateful()) {
                    this.f38996f.setState(this.f38995e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f38996f != null) {
            int max = this.f38995e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f38996f.getIntrinsicWidth();
                int intrinsicHeight = this.f38996f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i6 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f38996f.setBounds(-i, -i6, i, i6);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i9 = 0; i9 <= max; i9++) {
                    this.f38996f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
