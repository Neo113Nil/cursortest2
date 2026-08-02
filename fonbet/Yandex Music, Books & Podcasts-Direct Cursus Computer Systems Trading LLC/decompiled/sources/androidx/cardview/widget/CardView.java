package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import defpackage.aen;
import defpackage.jf0;
import defpackage.kgo;
import defpackage.qne;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] f = {R.attr.colorBackground};
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final qne e;

    public CardView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        qne qneVar = new qne((Object) this, false);
        this.e = qneVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aen.a, i, ru.yandex.music.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(ru.yandex.music.R.color.cardview_light_background) : getResources().getColor(ru.yandex.music.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        kgo kgoVar = new kgo(valueOf, dimension);
        qneVar.a = kgoVar;
        setBackgroundDrawable(kgoVar);
        setClipToOutline(true);
        setElevation(dimension2);
        jf0.X(qneVar, dimension3);
    }

    public void f(int i, int i2, int i3, int i4) {
        this.c.set(i, i2, i3, i4);
        jf0.e0(this.e);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((kgo) this.e.a).h;
    }

    public float getCardElevation() {
        return ((CardView) this.e.b).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((kgo) this.e.a).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return ((kgo) this.e.a).a;
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        kgo kgoVar = (kgo) this.e.a;
        if (valueOf == null) {
            kgoVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        kgoVar.h = valueOf;
        kgoVar.b.setColor(valueOf.getColorForState(kgoVar.getState(), kgoVar.h.getDefaultColor()));
        kgoVar.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((CardView) this.e.b).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        jf0.X(this.e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            qne qneVar = this.e;
            jf0.X(qneVar, ((kgo) qneVar.a).e);
        }
    }

    public void setRadius(float f2) {
        kgo kgoVar = (kgo) this.e.a;
        if (f2 == kgoVar.a) {
            return;
        }
        kgoVar.a = f2;
        kgoVar.b(null);
        kgoVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            qne qneVar = this.e;
            jf0.X(qneVar, ((kgo) qneVar.a).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        kgo kgoVar = (kgo) this.e.a;
        if (colorStateList == null) {
            kgoVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        kgoVar.h = colorStateList;
        kgoVar.b.setColor(colorStateList.getColorForState(kgoVar.getState(), kgoVar.h.getDefaultColor()));
        kgoVar.invalidateSelf();
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.yandex.music.R.attr.cardViewStyle);
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }
}
