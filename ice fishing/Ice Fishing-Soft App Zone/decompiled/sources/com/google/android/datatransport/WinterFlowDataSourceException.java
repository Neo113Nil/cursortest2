package com.google.android.datatransport;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDataSourceException extends MetricAffectingSpan {
    public final float WinterFlowVariableVersionControl;

    public WinterFlowDataSourceException(float f) {
        this.WinterFlowVariableVersionControl = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.WinterFlowVariableVersionControl);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.WinterFlowVariableVersionControl);
    }
}
