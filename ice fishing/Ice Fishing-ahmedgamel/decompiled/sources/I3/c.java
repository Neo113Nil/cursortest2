package I3;

import A3.n;
import G3.g;
import G3.k;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.bumptech.glide.f;
import java.util.WeakHashMap;
import m3.AbstractC4742a;

/* loaded from: classes2.dex */
public abstract class c extends FrameLayout {

    /* renamed from: B, reason: collision with root package name */
    public static final b f1313B = new b(0);

    /* renamed from: A, reason: collision with root package name */
    public PorterDuff.Mode f1314A;

    /* renamed from: n, reason: collision with root package name */
    public final k f1315n;

    /* renamed from: u, reason: collision with root package name */
    public int f1316u;

    /* renamed from: v, reason: collision with root package name */
    public final float f1317v;

    /* renamed from: w, reason: collision with root package name */
    public final float f1318w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1319x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1320y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1321z;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(L3.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC4742a.f39440x);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = X.f2142a;
            L.s(this, dimensionPixelSize);
        }
        this.f1316u = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f1315n = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f1317v = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(f.j(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(n.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1318w = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f1319x = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1320y = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f1313B);
        setFocusable(true);
        if (getBackground() == null) {
            int l9 = Q3.b.l(Q3.b.h(C5248R.attr.colorSurface, this), Q3.b.h(C5248R.attr.colorOnSurface, this), getBackgroundOverlayColorAlpha());
            k kVar = this.f1315n;
            if (kVar != null) {
                int i = d.f1322a;
                g gVar = new g(kVar);
                gVar.j(ColorStateList.valueOf(l9));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i4 = d.f1322a;
                float dimension = resources.getDimension(C5248R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(l9);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f1321z;
            if (colorStateList != null) {
                H.a.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = X.f2142a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f1318w;
    }

    public int getAnimationMode() {
        return this.f1316u;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f1317v;
    }

    public int getMaxInlineActionWidth() {
        return this.f1320y;
    }

    public int getMaxWidth() {
        return this.f1319x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = X.f2142a;
        J.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int i6 = this.f1319x;
        if (i6 <= 0 || getMeasuredWidth() <= i6) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i4);
    }

    public void setAnimationMode(int i) {
        this.f1316u = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f1321z != null) {
            drawable = drawable.mutate();
            H.a.h(drawable, this.f1321z);
            H.a.i(drawable, this.f1314A);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f1321z = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            H.a.h(mutate, colorStateList);
            H.a.i(mutate, this.f1314A);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f1314A = mode;
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
        setOnTouchListener(onClickListener != null ? null : f1313B);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
