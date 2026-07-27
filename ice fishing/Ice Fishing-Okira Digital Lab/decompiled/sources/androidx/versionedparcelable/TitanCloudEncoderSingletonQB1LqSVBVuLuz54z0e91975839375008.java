package androidx.versionedparcelable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class TitanCloudEncoderSingletonQB1LqSVBVuLuz54z0e91975839375008 extends ReplacementSpan {
    public int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public Paint.FontMetricsInt RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public boolean TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public final int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        if (!this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
            FrostBridgeJITPostfixMylqyMJyT0NakVJzcG66093763923863.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("PlaceholderSpan is not laid out yet.");
        }
        return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    }

    public final Paint.FontMetricsInt ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        Paint.FontMetricsInt fontMetricsInt = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.YellowLoopEncoderRouterINqff2SYTbtqZyuhu243435970216181("fontMetrics");
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = true;
        paint.getTextSize();
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = paint.getFontMetricsInt();
        if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800().descent <= ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800().ascent) {
            FrostBridgeJITPostfixMylqyMJyT0NakVJzcG66093763923863.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800("Invalid fontMetrics: line height can not be negative.");
        }
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = (int) Math.ceil(0.0d);
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800().ascent;
            fontMetricsInt.descent = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800().descent;
            fontMetricsInt.leading = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800().leading;
            if (fontMetricsInt.ascent > (-AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365())) {
                fontMetricsInt.ascent = -AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
            }
            fontMetricsInt.top = Math.min(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800().bottom, fontMetricsInt.descent);
        }
        if (!this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
            FrostBridgeJITPostfixMylqyMJyT0NakVJzcG66093763923863.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("PlaceholderSpan is not laid out yet.");
        }
        return this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
