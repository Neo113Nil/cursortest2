package com.google.android.datatransport;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackendGateway extends ReplacementSpan {
    public boolean WinterFlowTransactionManagerStrategy;
    public Paint.FontMetricsInt WinterFlowVariableVersionControl;

    public final int WinterFlowHookDataSource() {
        if (this.WinterFlowTransactionManagerStrategy) {
            return 0;
        }
        WinterFlowWorkerPipeline.WinterFlowHookDataSource("PlaceholderSpan is not laid out yet.");
        return 0;
    }

    public final Paint.FontMetricsInt WinterFlowRouterStructure() {
        Paint.FontMetricsInt fontMetricsInt = this.WinterFlowVariableVersionControl;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        WinterFlowManagerRequest.WinterFlowCloudMicroservice("fontMetrics");
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.WinterFlowTransactionManagerStrategy = true;
        paint.getTextSize();
        this.WinterFlowVariableVersionControl = paint.getFontMetricsInt();
        if (WinterFlowRouterStructure().descent <= WinterFlowRouterStructure().ascent) {
            WinterFlowWorkerPipeline.WinterFlowRouterStructure("Invalid fontMetrics: line height can not be negative.");
        }
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
