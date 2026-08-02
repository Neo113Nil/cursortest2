package com.squareup.cash.markdown.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class BulletSpan extends ListItemSpan implements LeadingMarginSpan {
    public final int bulletIndent;
    public final int contentIndent;
    public final int radius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletSpan(Context context, Integer num) {
        super(context, num);
        context.getClass();
        this.radius = Views.sp(context, 3);
        this.contentIndent = Views.dip(context, 40);
        this.bulletIndent = Views.dip(context, 9);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        canvas.getClass();
        paint.getClass();
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            int i8 = i + this.bulletIndent;
            int i9 = this.radius;
            canvas.drawCircle(i8 + i9 + i2, layout != null ? layout.getLineBaseline(layout.getLineForOffset(i6)) - (i9 * 2.0f) : (i3 + i5) / 2.0f, i9, paint);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.contentIndent;
    }
}
