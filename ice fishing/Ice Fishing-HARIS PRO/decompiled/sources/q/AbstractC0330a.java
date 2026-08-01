package q;

import F.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p.AbstractC0318a;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0330a extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f4218f = {R.attr.colorBackground};

    /* renamed from: g, reason: collision with root package name */
    public static final C0331b f4219g = new C0331b();

    /* renamed from: a, reason: collision with root package name */
    public boolean f4220a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4221b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f4222c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4223d;
    public final i e;

    public AbstractC0330a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.materialCardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f4222c = rect;
        this.f4223d = new Rect();
        i iVar = new i(15, this);
        this.e = iVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0318a.f4130a, com.lumenpath.harispro.hrnavigator.R.attr.materialCardViewStyle, com.lumenpath.harispro.hrnavigator.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f4218f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.lumenpath.harispro.hrnavigator.R.color.cardview_light_background) : getResources().getColor(com.lumenpath.harispro.hrnavigator.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, RecyclerView.f2111C0);
        float dimension2 = obtainStyledAttributes.getDimension(4, RecyclerView.f2111C0);
        float dimension3 = obtainStyledAttributes.getDimension(5, RecyclerView.f2111C0);
        this.f4220a = obtainStyledAttributes.getBoolean(7, false);
        this.f4221b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C0331b c0331b = f4219g;
        c cVar = new c(valueOf, dimension);
        iVar.f208b = cVar;
        setBackgroundDrawable(cVar);
        setClipToOutline(true);
        setElevation(dimension2);
        c0331b.a(iVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((c) ((Drawable) this.e.f208b)).f4230h;
    }

    public float getCardElevation() {
        return ((AbstractC0330a) this.e.f209c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f4222c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4222c.left;
    }

    public int getContentPaddingRight() {
        return this.f4222c.right;
    }

    public int getContentPaddingTop() {
        return this.f4222c.top;
    }

    public float getMaxCardElevation() {
        return ((c) ((Drawable) this.e.f208b)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f4221b;
    }

    public float getRadius() {
        return ((c) ((Drawable) this.e.f208b)).f4224a;
    }

    public boolean getUseCompatPadding() {
        return this.f4220a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        c cVar = (c) ((Drawable) this.e.f208b);
        if (valueOf == null) {
            cVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        cVar.f4230h = valueOf;
        cVar.f4225b.setColor(valueOf.getColorForState(cVar.getState(), cVar.f4230h.getDefaultColor()));
        cVar.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((AbstractC0330a) this.e.f209c).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        f4219g.a(this.e, f2);
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

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.f4221b) {
            this.f4221b = z2;
            C0331b c0331b = f4219g;
            i iVar = this.e;
            c0331b.a(iVar, ((c) ((Drawable) iVar.f208b)).e);
        }
    }

    public void setRadius(float f2) {
        c cVar = (c) ((Drawable) this.e.f208b);
        if (f2 == cVar.f4224a) {
            return;
        }
        cVar.f4224a = f2;
        cVar.b(null);
        cVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f4220a != z2) {
            this.f4220a = z2;
            C0331b c0331b = f4219g;
            i iVar = this.e;
            c0331b.a(iVar, ((c) ((Drawable) iVar.f208b)).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        c cVar = (c) ((Drawable) this.e.f208b);
        if (colorStateList == null) {
            cVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        cVar.f4230h = colorStateList;
        cVar.f4225b.setColor(colorStateList.getColorForState(cVar.getState(), cVar.f4230h.getDefaultColor()));
        cVar.invalidateSelf();
    }
}
