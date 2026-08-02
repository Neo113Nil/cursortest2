package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.shape.a;
import kotlin.KotlinVersion;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class ddh {
    public static final double y = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable z;
    public final MaterialCardView a;
    public final a c;
    public final a d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public eup m;
    public ColorStateList n;
    public RippleDrawable o;
    public LayerDrawable p;
    public a q;
    public boolean s;
    public ValueAnimator t;
    public final TimeInterpolator u;
    public final int v;
    public final int w;
    public final Rect b = new Rect();
    public boolean r = false;
    public float x = 0.0f;

    static {
        z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public ddh(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.a = materialCardView;
        a aVar = new a(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.c = aVar;
        aVar.n(materialCardView.getContext());
        aVar.u();
        iz7 h = aVar.b.a.h();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, aen.a, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            h.m(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.d = new a();
        h(h.e());
        this.u = szf.q0(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, wm0.a);
        this.v = szf.p0(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.w = szf.p0(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(ff7 ff7Var, float f) {
        if (ff7Var instanceof vgo) {
            return (float) ((1.0d - y) * f);
        }
        if (ff7Var instanceof hy6) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        ff7 ff7Var = this.m.a;
        a aVar = this.c;
        float b = b(ff7Var, aVar.l());
        ff7 ff7Var2 = this.m.b;
        float[] fArr = aVar.C;
        float max = Math.max(b, b(ff7Var2, fArr != null ? fArr[0] : aVar.b.a.f.a(aVar.h())));
        ff7 ff7Var3 = this.m.c;
        float[] fArr2 = aVar.C;
        float b2 = b(ff7Var3, fArr2 != null ? fArr2[1] : aVar.b.a.g.a(aVar.h()));
        ff7 ff7Var4 = this.m.d;
        float[] fArr3 = aVar.C;
        return Math.max(max, Math.max(b2, b(ff7Var4, fArr3 != null ? fArr3[2] : aVar.b.a.h.a(aVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.o == null) {
            this.q = new a(this.m);
            this.o = new RippleDrawable(this.k, null, this.q);
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    public final cdh d(Drawable drawable) {
        int i;
        int i2;
        if (this.a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            i = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new cdh(drawable, i, i2, i, i2);
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.p != null) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getUseCompatPadding()) {
                i3 = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                i4 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i7 = this.g;
            boolean z2 = (i7 & 8388613) == 8388613;
            int i8 = this.e;
            int i9 = z2 ? ((i - i8) - this.f) - i4 : i8;
            int i10 = (i7 & 80) == 80 ? i8 : ((i2 - i8) - this.f) - i3;
            int i11 = (i7 & 8388613) == 8388613 ? i8 : ((i - i8) - this.f) - i4;
            if ((i7 & 80) == 80) {
                i8 = ((i2 - i8) - this.f) - i3;
            }
            int i12 = i8;
            if (materialCardView.getLayoutDirection() == 1) {
                i6 = i11;
                i5 = i9;
            } else {
                i5 = i11;
                i6 = i9;
            }
            this.p.setLayerInset(2, i6, i12, i5, i10);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
                this.x = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = this.x;
            if (z2) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.t = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, f);
            this.t = ofFloat;
            ofFloat.addUpdateListener(new hr2(10, this));
            this.t.setInterpolator(this.u);
            this.t.setDuration((long) ((z2 ? this.v : this.w) * f2));
            this.t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.j = mutate;
            mutate.setTintList(this.l);
            f(this.a.i, false);
        } else {
            this.j = z;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(eup eupVar) {
        this.m = eupVar;
        a aVar = this.c;
        aVar.setShapeAppearanceModel(eupVar);
        aVar.x = !aVar.o();
        a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.setShapeAppearanceModel(eupVar);
        }
        a aVar3 = this.q;
        if (aVar3 != null) {
            aVar3.setShapeAppearanceModel(eupVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.getPreventCornerOverlap() && this.c.o() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.i;
        Drawable c = j() ? c() : this.d;
        this.i = c;
        if (drawable != c) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c);
            } else {
                materialCardView.setForeground(d(c));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.a;
        float f = 0.0f;
        float a = ((!materialCardView.getPreventCornerOverlap() || this.c.o()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f = (float) ((1.0d - y) * materialCardView.getCardViewRadius());
        }
        int i = (int) (a - f);
        Rect rect = this.b;
        materialCardView.h(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
    }

    public final void m() {
        boolean z2 = this.r;
        MaterialCardView materialCardView = this.a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.i));
    }
}
