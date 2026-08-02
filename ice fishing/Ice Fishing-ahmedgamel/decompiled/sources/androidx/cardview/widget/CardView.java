package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import c4.e;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.WP;
import q.AbstractC4860a;
import r.C4891a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4603y = {R.attr.colorBackground};

    /* renamed from: z, reason: collision with root package name */
    public static final e f4604z = new e();

    /* renamed from: n, reason: collision with root package name */
    public boolean f4605n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4606u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f4607v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f4608w;

    /* renamed from: x, reason: collision with root package name */
    public final WP f4609x;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f4607v = rect;
        this.f4608w = new Rect();
        WP wp = new WP(this);
        this.f4609x = wp;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4860a.f40018a, C5248R.attr.cardViewStyle, C5248R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f4603y);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(C5248R.color.cardview_light_background) : getResources().getColor(C5248R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f4605n = obtainStyledAttributes.getBoolean(7, false);
        this.f4606u = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        e eVar = f4604z;
        C4891a c4891a = new C4891a(valueOf, dimension);
        wp.f29152n = c4891a;
        setBackgroundDrawable(c4891a);
        setClipToOutline(true);
        setElevation(dimension2);
        eVar.p(wp, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C4891a) ((Drawable) this.f4609x.f29152n)).f40103h;
    }

    public float getCardElevation() {
        return ((CardView) this.f4609x.f29153u).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f4607v.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4607v.left;
    }

    public int getContentPaddingRight() {
        return this.f4607v.right;
    }

    public int getContentPaddingTop() {
        return this.f4607v.top;
    }

    public float getMaxCardElevation() {
        return ((C4891a) ((Drawable) this.f4609x.f29152n)).f40100e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f4606u;
    }

    public float getRadius() {
        return ((C4891a) ((Drawable) this.f4609x.f29152n)).f40096a;
    }

    public boolean getUseCompatPadding() {
        return this.f4605n;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C4891a c4891a = (C4891a) ((Drawable) this.f4609x.f29152n);
        if (valueOf == null) {
            c4891a.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c4891a.f40103h = valueOf;
        c4891a.f40097b.setColor(valueOf.getColorForState(c4891a.getState(), c4891a.f40103h.getDefaultColor()));
        c4891a.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((CardView) this.f4609x.f29153u).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        f4604z.p(this.f4609x, f2);
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
    public final void setPadding(int i, int i4, int i6, int i9) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i4, int i6, int i9) {
    }

    public void setPreventCornerOverlap(boolean z6) {
        if (z6 != this.f4606u) {
            this.f4606u = z6;
            e eVar = f4604z;
            WP wp = this.f4609x;
            eVar.p(wp, ((C4891a) ((Drawable) wp.f29152n)).f40100e);
        }
    }

    public void setRadius(float f2) {
        C4891a c4891a = (C4891a) ((Drawable) this.f4609x.f29152n);
        if (f2 == c4891a.f40096a) {
            return;
        }
        c4891a.f40096a = f2;
        c4891a.b(null);
        c4891a.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z6) {
        if (this.f4605n != z6) {
            this.f4605n = z6;
            e eVar = f4604z;
            WP wp = this.f4609x;
            eVar.p(wp, ((C4891a) ((Drawable) wp.f29152n)).f40100e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C4891a c4891a = (C4891a) ((Drawable) this.f4609x.f29152n);
        if (colorStateList == null) {
            c4891a.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c4891a.f40103h = colorStateList;
        c4891a.f40097b.setColor(colorStateList.getColorForState(c4891a.getState(), c4891a.f40103h.getDefaultColor()));
        c4891a.invalidateSelf();
    }
}
