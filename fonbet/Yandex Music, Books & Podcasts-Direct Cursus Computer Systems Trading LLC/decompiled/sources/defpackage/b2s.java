package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class b2s extends uqr {
    public static final /* synthetic */ int v = 0;
    public ky9 j;
    public one k;
    public int l;
    public boolean m;
    public boolean n;
    public z1s o;
    public or2 p;
    public ny9 q;
    public ny9 r;
    public Integer s;
    public Integer t;
    public boolean u;

    public b2s(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new e7o(22);
        setGravity(8388627);
        setClickable(true);
        setMaxLines(1);
        setSingleLine(true);
        setOnClickListener(new pw3(2));
    }

    private Typeface getDefaultTypeface() {
        if (this.j != null) {
            if (this.u) {
                Integer num = this.t;
                if (num != null && num.intValue() > 0) {
                    return this.j.e(this.t.intValue());
                }
                ny9 ny9Var = this.r;
                if (ny9Var != null) {
                    ky9 ky9Var = this.j;
                    int ordinal = ny9Var.ordinal();
                    return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ky9Var.c() : ky9Var.b() : ky9Var.a() : ky9Var.d();
                }
            } else {
                Integer num2 = this.s;
                if (num2 != null && num2.intValue() > 0) {
                    return this.j.e(this.s.intValue());
                }
                ny9 ny9Var2 = this.q;
                if (ny9Var2 != null) {
                    ky9 ky9Var2 = this.j;
                    int ordinal2 = ny9Var2.ordinal();
                    return ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ky9Var2.c() : ky9Var2.b() : ky9Var2.a() : ky9Var2.d();
                }
            }
        }
        ky9 ky9Var3 = this.j;
        if (ky9Var3 != null) {
            return ky9Var3.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return pd.class.getName();
    }

    @Override // defpackage.uqr, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        or2 or2Var;
        CharSequence charSequence;
        TextPaint paint;
        Typeface defaultTypeface;
        TextPaint paint2 = getPaint();
        if (paint2 != null && (defaultTypeface = getDefaultTypeface()) != null) {
            paint2.setTypeface(defaultTypeface);
        }
        if (!this.n) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int g = this.o.g();
        if (g > 0 && (mode == 0 || size > g)) {
            i = View.MeasureSpec.makeMeasureSpec(g, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0 || (or2Var = this.p) == null || (charSequence = or2Var.a) == null || (paint = layout.getPaint()) == null) {
            return;
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        if (charSequence == null) {
            return;
        }
        setText(TextUtils.ellipsize(charSequence, paint, ((int) layout.getLineMax(0)) - paint.measureText("..."), TextUtils.TruncateAt.END));
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        one oneVar = this.k;
        if (oneVar != null) {
            bg3.s(this, oneVar);
        }
        or2 or2Var = this.p;
        if (or2Var == null) {
            return performClick;
        }
        qr2 qr2Var = or2Var.c;
        if (qr2Var != null) {
            qr2Var.k(or2Var, true);
            return true;
        }
        xq0.x("Tab not attached to a TabLayout");
        return false;
    }

    public void setActiveTypefaceType(ny9 ny9Var) {
        this.r = ny9Var;
    }

    public void setActiveTypefaceWeight(Integer num) {
        this.t = num;
    }

    public void setBoldTextOnSelection(boolean z) {
        this.m = z;
    }

    public void setEllipsizeEnabled(boolean z) {
        this.n = z;
        setEllipsize(z ? TextUtils.TruncateAt.END : null);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.2f);
    }

    public void setInactiveTypefaceType(ny9 ny9Var) {
        this.q = ny9Var;
    }

    public void setInactiveTypefaceWeight(Integer num) {
        this.s = num;
    }

    public void setInputFocusTracker(one oneVar) {
        this.k = oneVar;
    }

    public void setMaxWidthProvider(@NonNull z1s z1sVar) {
        this.o = z1sVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        setTypefaceType(z);
        if (this.m && z2 && !isSelected()) {
            setTextAppearance(getContext(), this.l);
        }
    }

    public void setTab(or2 or2Var) {
        if (or2Var != this.p) {
            this.p = or2Var;
            setText(or2Var == null ? null : or2Var.a);
        }
    }

    public void setTextColorList(ColorStateList colorStateList) {
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setTypefaceType(boolean z) {
        boolean z2 = this.u != z;
        this.u = z;
        if (z2) {
            requestLayout();
        }
    }

    public void setOnUpdateListener(a2s a2sVar) {
    }

    public b2s(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b2s(@NonNull Context context) {
        this(context, null);
    }
}
