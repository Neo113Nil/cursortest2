package r;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p6.i;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f5877l = {R.attr.colorBackground};

    /* renamed from: m, reason: collision with root package name */
    public static final i f5878m = new i();

    /* renamed from: g, reason: collision with root package name */
    public boolean f5879g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5880h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f5881i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f5882j;

    /* renamed from: k, reason: collision with root package name */
    public final s f5883k;

    public a(Context context) {
        super(context, null, org.fortheloss.st.R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f5881i = rect;
        this.f5882j = new Rect();
        s sVar = new s(this);
        this.f5883k = sVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, q.a.f5695a, org.fortheloss.st.R.attr.cardViewStyle, org.fortheloss.st.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f5877l);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(org.fortheloss.st.R.color.cardview_light_background) : getResources().getColor(org.fortheloss.st.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f5879g = obtainStyledAttributes.getBoolean(7, false);
        this.f5880h = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b bVar = new b(valueOf, dimension);
        sVar.f8356h = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        f5878m.d(sVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) ((Drawable) this.f5883k.f8356h)).f5891h;
    }

    public float getCardElevation() {
        return ((a) this.f5883k.f8357i).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f5881i.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f5881i.left;
    }

    public int getContentPaddingRight() {
        return this.f5881i.right;
    }

    public int getContentPaddingTop() {
        return this.f5881i.top;
    }

    public float getMaxCardElevation() {
        return ((b) ((Drawable) this.f5883k.f8356h)).f5888e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f5880h;
    }

    public float getRadius() {
        return ((b) ((Drawable) this.f5883k.f8356h)).f5884a;
    }

    public boolean getUseCompatPadding() {
        return this.f5879g;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        b bVar = (b) ((Drawable) this.f5883k.f8356h);
        if (valueOf == null) {
            bVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        bVar.f5891h = valueOf;
        bVar.f5885b.setColor(valueOf.getColorForState(bVar.getState(), bVar.f5891h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        ((a) this.f5883k.f8357i).setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f5878m.d(this.f5883k, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f5880h) {
            this.f5880h = z10;
            s sVar = this.f5883k;
            f5878m.d(sVar, ((b) ((Drawable) sVar.f8356h)).f5888e);
        }
    }

    public void setRadius(float f10) {
        b bVar = (b) ((Drawable) this.f5883k.f8356h);
        if (f10 == bVar.f5884a) {
            return;
        }
        bVar.f5884a = f10;
        bVar.b(null);
        bVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f5879g != z10) {
            this.f5879g = z10;
            s sVar = this.f5883k;
            f5878m.d(sVar, ((b) ((Drawable) sVar.f8356h)).f5888e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) ((Drawable) this.f5883k.f8356h);
        if (colorStateList == null) {
            bVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        bVar.f5891h = colorStateList;
        bVar.f5885b.setColor(colorStateList.getColorForState(bVar.getState(), bVar.f5891h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }
}
