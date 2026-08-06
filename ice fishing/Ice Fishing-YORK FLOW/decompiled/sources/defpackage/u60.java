package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class u60 implements android.text.style.LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7, boolean z, android.text.Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        java.lang.ThreadLocal threadLocal = defpackage.dn1.ZpBGe2uQfcn8;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float UmgHb6n58gfG = defpackage.w60.UmgHb6n58gfG(layout, lineForOffset, paint) + defpackage.w60.blKFvluuDQOf(layout, lineForOffset, paint);
            if (UmgHb6n58gfG == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(UmgHb6n58gfG, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
