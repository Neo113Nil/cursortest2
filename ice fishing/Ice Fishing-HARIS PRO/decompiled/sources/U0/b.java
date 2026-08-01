package U0;

import B0.n;
import L0.m;
import O.AbstractC0049z;
import O.B;
import O.K;
import S0.g;
import S0.k;
import a.AbstractC0078a;
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
import com.lumenpath.harispro.hrnavigator.R;
import java.util.WeakHashMap;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public abstract class b extends FrameLayout {
    public static final n i = new n(1);

    /* renamed from: a, reason: collision with root package name */
    public final k f1194a;

    /* renamed from: b, reason: collision with root package name */
    public int f1195b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1196c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1197d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1198f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1199g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1200h;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, AttributeSet attributeSet) {
        super(X0.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0358a.f4434E);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = K.f747a;
            B.k(this, dimensionPixelSize);
        }
        this.f1195b = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f1194a = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f1196c = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0078a.B(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(m.i(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1197d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1198f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(i);
        setFocusable(true);
        if (getBackground() == null) {
            int O2 = AbstractC0078a.O(AbstractC0078a.y(this, R.attr.colorSurface), AbstractC0078a.y(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            k kVar = this.f1194a;
            if (kVar != null) {
                int i2 = c.f1201a;
                g gVar = new g(kVar);
                gVar.m(ColorStateList.valueOf(O2));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i3 = c.f1201a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(O2);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f1199g;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = K.f747a;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(c cVar) {
    }

    public float getActionTextColorAlpha() {
        return this.f1197d;
    }

    public int getAnimationMode() {
        return this.f1195b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f1196c;
    }

    public int getMaxInlineActionWidth() {
        return this.f1198f;
    }

    public int getMaxWidth() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = K.f747a;
        AbstractC0049z.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.f1195b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f1199g != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f1199g);
            drawable.setTintMode(this.f1200h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f1199g = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f1200h);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f1200h = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
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
        setOnTouchListener(onClickListener != null ? null : i);
        super.setOnClickListener(onClickListener);
    }
}
