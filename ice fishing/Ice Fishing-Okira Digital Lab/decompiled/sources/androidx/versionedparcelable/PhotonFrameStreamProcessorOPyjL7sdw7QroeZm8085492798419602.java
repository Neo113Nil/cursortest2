package androidx.versionedparcelable;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class PhotonFrameStreamProcessorOPyjL7sdw7QroeZm8085492798419602 implements LineHeightSpan {
    public final float BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public int CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
    public int EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
    public final int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final float RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final boolean TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final int UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
    public final boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    public int NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = Integer.MIN_VALUE;
    public int ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = Integer.MIN_VALUE;
    public int ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = Integer.MIN_VALUE;
    public int ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = Integer.MIN_VALUE;

    public PhotonFrameStreamProcessorOPyjL7sdw7QroeZm8085492798419602(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = f;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = z;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = z2;
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = f2;
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            FrostBridgeJITPostfixMylqyMJyT0NakVJzcG66093763923863.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        int i7 = this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
        boolean z3 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        boolean z4 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int ceil = (int) Math.ceil(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
            int i9 = ceil - i8;
            if (i7 != 1 || i9 > 0) {
                float f = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i9 <= 0 ? Math.ceil(i9 * f) : Math.ceil((1.0f - f) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = ceil2 + i10;
                this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = i11;
                int i12 = i11 - ceil;
                this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = i11;
                    this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = fontMetricsInt.ascent - i12;
                    this.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111 = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
                    this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = 0;
                    this.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111 = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = i16;
                int i17 = fontMetricsInt.descent;
                this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = i17;
                this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = i16;
                this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = i17;
                this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = 0;
                this.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111 = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 : this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        fontMetricsInt.descent = z2 ? this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 : this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
    }
}
