package androidx.cardview.widget;

import M2.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.icefishing.icefishingbigwin.C5275R;
import m1.C4726a;
import q.AbstractC4860a;
import r.C4942a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4635y = {R.attr.colorBackground};

    /* renamed from: z, reason: collision with root package name */
    public static final i f4636z = new i(21);

    /* renamed from: n, reason: collision with root package name */
    public boolean f4637n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4638u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f4639v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f4640w;

    /* renamed from: x, reason: collision with root package name */
    public final C4726a f4641x;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f4639v = rect;
        this.f4640w = new Rect();
        C4726a c4726a = new C4726a(2, this);
        this.f4641x = c4726a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4860a.f39971a, C5275R.attr.cardViewStyle, C5275R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f4635y);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(C5275R.color.cardview_light_background) : getResources().getColor(C5275R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f4637n = obtainStyledAttributes.getBoolean(7, false);
        this.f4638u = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        i iVar = f4636z;
        C4942a c4942a = new C4942a(valueOf, dimension);
        c4726a.f39272u = c4942a;
        setBackgroundDrawable(c4942a);
        setClipToOutline(true);
        setElevation(dimension2);
        iVar.r(c4726a, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C4942a) ((Drawable) this.f4641x.f39272u)).f40292h;
    }

    public float getCardElevation() {
        return ((CardView) this.f4641x.f39273v).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f4639v.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4639v.left;
    }

    public int getContentPaddingRight() {
        return this.f4639v.right;
    }

    public int getContentPaddingTop() {
        return this.f4639v.top;
    }

    public float getMaxCardElevation() {
        return ((C4942a) ((Drawable) this.f4641x.f39272u)).f40289e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f4638u;
    }

    public float getRadius() {
        return ((C4942a) ((Drawable) this.f4641x.f39272u)).f40285a;
    }

    public boolean getUseCompatPadding() {
        return this.f4637n;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C4942a c4942a = (C4942a) ((Drawable) this.f4641x.f39272u);
        if (valueOf == null) {
            c4942a.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c4942a.f40292h = valueOf;
        c4942a.f40286b.setColor(valueOf.getColorForState(c4942a.getState(), c4942a.f40292h.getDefaultColor()));
        c4942a.invalidateSelf();
    }

    public void setCardElevation(float f3) {
        ((CardView) this.f4641x.f39273v).setElevation(f3);
    }

    public void setMaxCardElevation(float f3) {
        f4636z.r(this.f4641x, f3);
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
    public final void setPadding(int i, int i6, int i9, int i10) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i6, int i9, int i10) {
    }

    public void setPreventCornerOverlap(boolean z3) {
        if (z3 != this.f4638u) {
            this.f4638u = z3;
            i iVar = f4636z;
            C4726a c4726a = this.f4641x;
            iVar.r(c4726a, ((C4942a) ((Drawable) c4726a.f39272u)).f40289e);
        }
    }

    public void setRadius(float f3) {
        C4942a c4942a = (C4942a) ((Drawable) this.f4641x.f39272u);
        if (f3 == c4942a.f40285a) {
            return;
        }
        c4942a.f40285a = f3;
        c4942a.b(null);
        c4942a.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z3) {
        if (this.f4637n != z3) {
            this.f4637n = z3;
            i iVar = f4636z;
            C4726a c4726a = this.f4641x;
            iVar.r(c4726a, ((C4942a) ((Drawable) c4726a.f39272u)).f40289e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C4942a c4942a = (C4942a) ((Drawable) this.f4641x.f39272u);
        if (colorStateList == null) {
            c4942a.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c4942a.f40292h = colorStateList;
        c4942a.f40286b.setColor(colorStateList.getColorForState(c4942a.getState(), c4942a.f40292h.getDefaultColor()));
        c4942a.invalidateSelf();
    }
}
