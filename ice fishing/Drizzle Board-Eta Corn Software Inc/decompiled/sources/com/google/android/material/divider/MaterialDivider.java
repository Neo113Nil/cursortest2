package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.kolosta.rejin.jilosa.R;
import defpackage.fn;
import defpackage.le0;
import defpackage.tr;
import defpackage.w30;
import defpackage.y00;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    public int MdtA4re8;
    public final tr NCTxEWno;
    public int P7K7Inc8;
    public int VgvYg0wo;
    public int wxUZMvaN;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(le0.nSmgoSB5(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.NCTxEWno = new tr();
        TypedArray FySoLYna = fn.FySoLYna(context2, attributeSet, y00.lDXGDhIF, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.MdtA4re8 = FySoLYna.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.VgvYg0wo = FySoLYna.getDimensionPixelOffset(2, 0);
        this.P7K7Inc8 = FySoLYna.getDimensionPixelOffset(1, 0);
        setDividerColor(w30.gjV1z5T1(context2, FySoLYna, 0).getDefaultColor());
        FySoLYna.recycle();
    }

    public int getDividerColor() {
        return this.wxUZMvaN;
    }

    public int getDividerInsetEnd() {
        return this.P7K7Inc8;
    }

    public int getDividerInsetStart() {
        return this.VgvYg0wo;
    }

    public int getDividerThickness() {
        return this.MdtA4re8;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.P7K7Inc8 : this.VgvYg0wo;
        if (z) {
            width = getWidth();
            i = this.VgvYg0wo;
        } else {
            width = getWidth();
            i = this.P7K7Inc8;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        tr trVar = this.NCTxEWno;
        trVar.setBounds(i2, 0, i3, bottom);
        trVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.MdtA4re8;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.wxUZMvaN != i) {
            this.wxUZMvaN = i;
            this.NCTxEWno.OxcuoDLp(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.P7K7Inc8 = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.VgvYg0wo = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.MdtA4re8 != i) {
            this.MdtA4re8 = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context) {
        this(context, null);
    }
}
