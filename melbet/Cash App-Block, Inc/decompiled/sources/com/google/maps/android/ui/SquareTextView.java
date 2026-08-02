package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class SquareTextView extends TextView {
    public int mOffsetLeft;
    public int mOffsetTop;

    public SquareTextView(Context context) {
        super(context);
        this.mOffsetTop = 0;
        this.mOffsetLeft = 0;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.translate(this.mOffsetLeft / 2, this.mOffsetTop / 2);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.mOffsetTop = measuredWidth - measuredHeight;
            this.mOffsetLeft = 0;
        } else {
            this.mOffsetTop = 0;
            this.mOffsetLeft = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }

    public SquareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOffsetTop = 0;
        this.mOffsetLeft = 0;
    }

    public SquareTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOffsetTop = 0;
        this.mOffsetLeft = 0;
    }
}
