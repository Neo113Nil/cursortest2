package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* loaded from: classes.dex */
public final class sw6 implements LeadingMarginSpan {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public sw6(float f, float f2, float f3, jx7 jx7Var, float f4) {
        this.a = f;
        this.b = f2;
        int b = eeh.b(f + f3);
        this.c = b;
        this.d = eeh.b(f4) - b;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (canvas == null) {
            return;
        }
        float f = (i3 + i5) / 2.0f;
        int i8 = i - this.c;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = i8;
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        Object obj = dbc.a;
        Integer num = null;
        if (obj.equals(obj)) {
            paint.setStyle(Paint.Style.FILL);
        }
        rw6 rw6Var = new rw6(this, (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L), i2, canvas, paint, i9, f);
        if (!Float.isNaN(1.0f)) {
            num = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(255.0f));
        }
        rw6Var.invoke();
        if (num != null) {
            paint.setAlpha(num.intValue());
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.d;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
