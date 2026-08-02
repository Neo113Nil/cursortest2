package com.squareup.cash.markdown.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.squareup.cash.ui.drawable.NumberedBulletDrawable;
import com.squareup.util.android.Views;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class NumberedBulletSpan extends ListItemSpan implements LeadingMarginSpan {
    public final int contentIndent;
    public final NumberedBulletDrawable drawable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberedBulletSpan(String str, Context context, Integer num) {
        super(context, num);
        str.getClass();
        context.getClass();
        this.drawable = new NumberedBulletDrawable(context, str);
        this.contentIndent = Views.dip(context, 40);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        canvas.getClass();
        paint.getClass();
        charSequence.getClass();
        layout.getClass();
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(layout.getLineDescent(0) + i4, layout.getLineAscent(0) + i4, 2, i3 + this.itemSpace);
            NumberedBulletDrawable numberedBulletDrawable = this.drawable;
            int i8 = numberedBulletDrawable.height;
            int i9 = m - (i8 / 2);
            numberedBulletDrawable.setBounds(i, i9, numberedBulletDrawable.width + i, i8 + i9);
            numberedBulletDrawable.draw(canvas);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.contentIndent;
    }
}
