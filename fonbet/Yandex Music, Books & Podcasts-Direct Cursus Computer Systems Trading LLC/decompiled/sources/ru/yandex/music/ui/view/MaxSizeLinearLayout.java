package ru.yandex.music.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.c9n;

/* loaded from: classes6.dex */
public class MaxSizeLinearLayout extends LinearLayout {
    public final c9n a;

    public MaxSizeLinearLayout(Context context) {
        super(context);
        this.a = new c9n(context, (AttributeSet) null);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        c9n c9nVar = this.a;
        if (measuredWidth > c9nVar.b || measuredHeight > c9nVar.c) {
            int measuredWidth2 = getMeasuredWidth();
            int i3 = c9nVar.b;
            if (i3 != Integer.MAX_VALUE) {
                i = View.MeasureSpec.makeMeasureSpec(Math.min(i3, measuredWidth2), 1073741824);
            }
            int measuredHeight2 = getMeasuredHeight();
            int i4 = c9nVar.c;
            if (i4 != Integer.MAX_VALUE) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, measuredHeight2), 1073741824);
            }
            super.onMeasure(i, i2);
        }
    }

    public MaxSizeLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new c9n(context, attributeSet);
    }

    public MaxSizeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new c9n(context, attributeSet);
    }

    public MaxSizeLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new c9n(context, attributeSet);
    }
}
