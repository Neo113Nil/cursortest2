package defpackage;

/* loaded from: classes.dex */
public final class z40 implements android.text.style.LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7, boolean z, android.text.Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        java.lang.ThreadLocal threadLocal = defpackage.sf1.IHQe1A4L2xu;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float UsuH8pd5P = defpackage.ci0.UsuH8pd5P(layout, lineForOffset, paint) + defpackage.ci0.C0U8sNJm(layout, lineForOffset, paint);
            if (UsuH8pd5P == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(UsuH8pd5P, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
