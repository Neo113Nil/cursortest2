package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xp0 extends ReplacementSpan {
    public int AvO7iQsrTN;
    public int EljAMC1QTz;
    public Paint.FontMetricsInt OOA6hdeuvCS;
    public boolean encWxUiV2;

    public final Paint.FontMetricsInt GWasM1elztuh() {
        Paint.FontMetricsInt fontMetricsInt = this.OOA6hdeuvCS;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        o30.YXi2hvwn7WL("fontMetrics");
        throw null;
    }

    public final int X1lG3V04pd() {
        if (!this.encWxUiV2) {
            u10.Yi7zF1RB1("PlaceholderSpan is not laid out yet.");
        }
        return this.EljAMC1QTz;
    }

    public final int Yi7zF1RB1() {
        if (!this.encWxUiV2) {
            u10.Yi7zF1RB1("PlaceholderSpan is not laid out yet.");
        }
        return this.AvO7iQsrTN;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.encWxUiV2 = true;
        paint.getTextSize();
        this.OOA6hdeuvCS = paint.getFontMetricsInt();
        if (GWasM1elztuh().descent <= GWasM1elztuh().ascent) {
            u10.GWasM1elztuh("Invalid fontMetrics: line height can not be negative.");
        }
        this.EljAMC1QTz = (int) Math.ceil(0.0d);
        this.AvO7iQsrTN = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = GWasM1elztuh().ascent;
            fontMetricsInt.descent = GWasM1elztuh().descent;
            fontMetricsInt.leading = GWasM1elztuh().leading;
            if (fontMetricsInt.ascent > (-Yi7zF1RB1())) {
                fontMetricsInt.ascent = -Yi7zF1RB1();
            }
            fontMetricsInt.top = Math.min(GWasM1elztuh().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(GWasM1elztuh().bottom, fontMetricsInt.descent);
        }
        return X1lG3V04pd();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
