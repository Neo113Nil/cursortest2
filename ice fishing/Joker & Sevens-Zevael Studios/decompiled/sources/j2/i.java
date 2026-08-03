package j2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: g, reason: collision with root package name */
    public Paint.FontMetricsInt f3516g;

    /* renamed from: h, reason: collision with root package name */
    public int f3517h;

    /* renamed from: i, reason: collision with root package name */
    public int f3518i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3519j;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f3516g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        pc.j.k("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f3519j) {
            m2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f3518i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        this.f3519j = true;
        paint.getTextSize();
        this.f3516g = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            m2.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f3517h = (int) Math.ceil(0.0f);
        this.f3518i = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f3519j) {
            m2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f3517h;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
