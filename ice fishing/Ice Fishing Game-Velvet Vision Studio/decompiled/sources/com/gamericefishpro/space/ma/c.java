package com.gamericefishpro.space.ma;

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
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.fa.l;
import com.gamericefishpro.space.ka.j;
import com.gamericefishpro.space.ka.n;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends FrameLayout {
    public static final b B = new b();
    public PorterDuff.Mode A;
    public final n d;
    public int e;
    public final float i;
    public final float v;
    public final int w;
    public final int y;
    public ColorStateList z;

    public c(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(com.gamericefishpro.space.oa.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, com.gamericefishpro.space.s9.a.u);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.e = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.d = n.b(context2, attributeSet, 0, 0).a();
        }
        this.i = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(com.gamericefishpro.space.hj.c.v(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(l.f(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.v = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(B);
        setFocusable(true);
        if (getBackground() == null) {
            int iZ = com.gamericefishpro.space.b9.a.z(getBackgroundOverlayColorAlpha(), com.gamericefishpro.space.b9.a.s(this, R.attr.colorSurface), com.gamericefishpro.space.b9.a.s(this, R.attr.colorOnSurface));
            n nVar = this.d;
            if (nVar != null) {
                int i = d.a;
                j jVar = new j(nVar);
                jVar.n(ColorStateList.valueOf(iZ));
                drawable = jVar;
            } else {
                Resources resources = getResources();
                int i2 = d.a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iZ);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.z;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.v;
    }

    public int getAnimationMode() {
        return this.e;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.i;
    }

    public int getMaxInlineActionWidth() {
        return this.y;
    }

    public int getMaxWidth() {
        return this.w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.w;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.z != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.z);
            drawable.setTintMode(this.A);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.z = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.A);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.A = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
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
        setOnTouchListener(onClickListener != null ? null : B);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
