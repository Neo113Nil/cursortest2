package androidx.versionedparcelable;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class IronMatrixReflectionVectorSFOKF9vyZZgfGjvDmj83490324505778 implements LineHeightSpan {
    public final float RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public IronMatrixReflectionVectorSFOKF9vyZZgfGjvDmj83490324505778(float f) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(fontMetricsInt.descent * ((r0 * 1.0f) / r1));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) Math.ceil(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867));
    }
}
