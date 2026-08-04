package com.gamericefishpro.space.s;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.gamericefishpro.space.n9.z;
import com.gamericefishpro.space.u6.e;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class a extends FrameLayout {
    public static final int[] y = {R.attr.colorBackground};
    public static final z z = new z(24);
    public boolean d;
    public boolean e;
    public final Rect i;
    public final Rect v;
    public final e w;

    public a(Context context) {
        ColorStateList colorStateListValueOf;
        super(context, null, com.gamericefishpro.space.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.i = rect;
        this.v = new Rect();
        e eVar = new e(11, this);
        this.w = eVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, com.gamericefishpro.space.r.a.a, com.gamericefishpro.space.R.attr.cardViewStyle, com.gamericefishpro.space.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(y);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.gamericefishpro.space.R.color.cardview_light_background) : getResources().getColor(com.gamericefishpro.space.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.d = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.e = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        b bVar = new b(colorStateListValueOf, dimension);
        eVar.b = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        z.c(eVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) ((Drawable) this.w.b)).h;
    }

    public float getCardElevation() {
        return ((a) this.w.c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.i.bottom;
    }

    public int getContentPaddingLeft() {
        return this.i.left;
    }

    public int getContentPaddingRight() {
        return this.i.right;
    }

    public int getContentPaddingTop() {
        return this.i.top;
    }

    public float getMaxCardElevation() {
        return ((b) ((Drawable) this.w.b)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.e;
    }

    public float getRadius() {
        return ((b) ((Drawable) this.w.b)).a;
    }

    public boolean getUseCompatPadding() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        b bVar = (b) ((Drawable) this.w.b);
        if (colorStateListValueOf == null) {
            bVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        bVar.h = colorStateListValueOf;
        bVar.b.setColor(colorStateListValueOf.getColorForState(bVar.getState(), bVar.h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((a) this.w.c).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        z.c(this.w, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.e) {
            this.e = z2;
            e eVar = this.w;
            z.c(eVar, ((b) ((Drawable) eVar.b)).e);
        }
    }

    public void setRadius(float f) {
        b bVar = (b) ((Drawable) this.w.b);
        if (f == bVar.a) {
            return;
        }
        bVar.a = f;
        bVar.b(null);
        bVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.d != z2) {
            this.d = z2;
            e eVar = this.w;
            z.c(eVar, ((b) ((Drawable) eVar.b)).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) ((Drawable) this.w.b);
        if (colorStateList == null) {
            bVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        bVar.h = colorStateList;
        bVar.b.setColor(colorStateList.getColorForState(bVar.getState(), bVar.h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
