package androidx.versionedparcelable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class EmeraldStackBinaryClosureI9d3f9OYExuCyYXFnE69150514532222 extends MetricAffectingSpan {
    public final float RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public EmeraldStackBinaryClosureI9d3f9OYExuCyYXFnE69150514532222(float f) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
    }
}
