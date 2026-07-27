package G3;

import E3.g;
import E3.k;
import O.J;
import O.L;
import O.X;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.icefishing.icefishinglive2.C5275R;
import java.util.WeakHashMap;
import k3.AbstractC4632a;

/* loaded from: classes2.dex */
public abstract class c extends FrameLayout {

    /* renamed from: B, reason: collision with root package name */
    public static final b f1061B = new b(0);

    /* renamed from: A, reason: collision with root package name */
    public PorterDuff.Mode f1062A;

    /* renamed from: n, reason: collision with root package name */
    public final k f1063n;

    /* renamed from: u, reason: collision with root package name */
    public int f1064u;

    /* renamed from: v, reason: collision with root package name */
    public final float f1065v;

    /* renamed from: w, reason: collision with root package name */
    public final float f1066w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1067x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1068y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1069z;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(J3.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC4632a.f38651x);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = X.f2054a;
            L.s(this, dimensionPixelSize);
        }
        this.f1064u = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f1063n = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f1065v = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(O3.b.m(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(y3.k.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1066w = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f1067x = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1068y = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f1061B);
        setFocusable(true);
        if (getBackground() == null) {
            int r9 = V2.a.r(V2.a.l(C5275R.attr.colorSurface, this), V2.a.l(C5275R.attr.colorOnSurface, this), getBackgroundOverlayColorAlpha());
            k kVar = this.f1063n;
            if (kVar != null) {
                int i = d.f1070a;
                g gVar = new g(kVar);
                gVar.j(ColorStateList.valueOf(r9));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i6 = d.f1070a;
                float dimension = resources.getDimension(C5275R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(r9);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f1069z;
            if (colorStateList != null) {
                H.a.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = X.f2054a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f1066w;
    }

    public int getAnimationMode() {
        return this.f1064u;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f1065v;
    }

    public int getMaxInlineActionWidth() {
        return this.f1068y;
    }

    public int getMaxWidth() {
        return this.f1067x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = X.f2054a;
        J.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
        int i9 = this.f1067x;
        if (i9 <= 0 || getMeasuredWidth() <= i9) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i6);
    }

    public void setAnimationMode(int i) {
        this.f1064u = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f1069z != null) {
            drawable = drawable.mutate();
            H.a.h(drawable, this.f1069z);
            H.a.i(drawable, this.f1062A);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f1069z = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            H.a.h(mutate, colorStateList);
            H.a.i(mutate, this.f1062A);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f1062A = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            H.a.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f1061B);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
