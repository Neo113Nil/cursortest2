package com.google.android.datatransport;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestResolver implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = WinterFlowSessionProvider.WinterFlowRouterStructure;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float WinterFlowArrayHelper = WinterFlowInvokerComponent.WinterFlowArrayHelper(layout, lineForOffset, paint) + WinterFlowInvokerComponent.WinterFlowEventEmitterController(layout, lineForOffset, paint);
            if (WinterFlowArrayHelper == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(WinterFlowArrayHelper, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
