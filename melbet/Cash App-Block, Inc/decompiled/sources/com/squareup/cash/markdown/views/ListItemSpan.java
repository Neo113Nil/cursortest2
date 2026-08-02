package com.squareup.cash.markdown.views;

import android.content.Context;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public abstract class ListItemSpan implements LineHeightSpan {
    public final int itemSpace;
    public boolean modifiedLineHeight;

    public ListItemSpan(Context context, Integer num) {
        context.getClass();
        this.itemSpace = num != null ? num.intValue() : Views.dip(context, 24);
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        fontMetricsInt.getClass();
        charSequence.getClass();
        int spanStart = ((Spanned) charSequence).getSpanStart(this);
        int i5 = this.itemSpace;
        if (spanStart == i) {
            fontMetricsInt.ascent -= i5;
            fontMetricsInt.top -= i5;
            this.modifiedLineHeight = true;
        } else if (this.modifiedLineHeight) {
            fontMetricsInt.ascent += i5;
            fontMetricsInt.top += i5;
            this.modifiedLineHeight = false;
        }
    }
}
