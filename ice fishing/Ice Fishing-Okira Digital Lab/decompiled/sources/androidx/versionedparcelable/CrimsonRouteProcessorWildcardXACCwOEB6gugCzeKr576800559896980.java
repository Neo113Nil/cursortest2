package androidx.versionedparcelable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class CrimsonRouteProcessorWildcardXACCwOEB6gugCzeKr576800559896980 extends ReplacementSpan {
    public TextPaint BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final AxiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final Paint.FontMetricsInt RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new Paint.FontMetricsInt();
    public short YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = -1;
    public float TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = 1.0f;

    public CrimsonRouteProcessorWildcardXACCwOEB6gugCzeKr576800559896980(AxiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193 axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193) {
        ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193, "rasterizer cannot be null");
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        XenoGridInjectionPipelineIZx33zrhf3LqVycsEW24852805145837.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        AxiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193 axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997 vertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997 = axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        Typeface typeface = (Typeface) vertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) vertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        AxiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193 axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = abs / (axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365().ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(14) != 0 ? ((ByteBuffer) r8.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).getShort(r1 + r8.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) : (short) 0);
        FrostBridgeEventLoopCryptographyRIfEKnqSgKujbcJLfN34116343365393 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
        int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(14);
        if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 != 0) {
            ((ByteBuffer) AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).getShort(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 + AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
        }
        short s = (short) ((axiomCoreOperatorBootstrapDmDzDgTcrOt4qEzPsO81877222888193.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365().ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(12) != 0 ? ((ByteBuffer) r5.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).getShort(r7 + r5.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) : (short) 0) * this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
