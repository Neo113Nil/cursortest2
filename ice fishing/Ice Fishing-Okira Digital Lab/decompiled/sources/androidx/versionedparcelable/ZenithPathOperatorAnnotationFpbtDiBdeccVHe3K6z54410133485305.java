package androidx.versionedparcelable;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class ZenithPathOperatorAnnotationFpbtDiBdeccVHe3K6z54410133485305 {
    public static Method AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public static long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public static final float ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            ObsidianEngineLambdaValidationGvCNBIpXin5KgPbxID14685439027799.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
                }
            }
            float sqrt = (float) Math.sqrt(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952 = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD240895789664952 / fArr11[i14];
        }
    }

    public static final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253 whiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253, LunarNodeContainerTranspilerUeHVHt0YTG8XVlwlWG66133359911627 lunarNodeContainerTranspilerUeHVHt0YTG8XVlwlWG66133359911627, long j) {
        ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394 zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394 = (ZenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394) whiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394.getClass();
        VertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785 vertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785 = (VertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785) zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        VertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785 vertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG608120870337852 = (VertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785) zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        boolean CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(lunarNodeContainerTranspilerUeHVHt0YTG8XVlwlWG66133359911627);
        long j2 = lunarNodeContainerTranspilerUeHVHt0YTG8XVlwlWG66133359911627.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170) {
            KryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629[] kryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629Arr = vertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG608120870337852.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            Arrays.fill(kryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629Arr, 0, kryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629Arr.length, (Object) null);
            vertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG608120870337852.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = 0;
            KryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629[] kryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629Arr2 = vertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            Arrays.fill(kryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629Arr2, 0, kryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629Arr2.length, (Object) null);
            vertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = 0;
            zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0L;
        }
        if (!RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(lunarNodeContainerTranspilerUeHVHt0YTG8XVlwlWG66133359911627)) {
            List list = lunarNodeContainerTranspilerUeHVHt0YTG8XVlwlWG66133359911627.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
            if (list == null) {
                list = GoldenVectorLoaderRegistryZGq5hhbhblpJ1mpgXV59878749628960.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                JadeCircuitContextResolverA0hcyiaqtaQ2cFRmqO33905895439569 jadeCircuitContextResolverA0hcyiaqtaQ2cFRmqO33905895439569 = (JadeCircuitContextResolverA0hcyiaqtaQ2cFRmqO33905895439569) list.get(i);
                zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(jadeCircuitContextResolverA0hcyiaqtaQ2cFRmqO33905895439569.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, PhotonFrameComponentSyntaxUW2Lgll6pE19cl0yDr49750320649121.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(jadeCircuitContextResolverA0hcyiaqtaQ2cFRmqO33905895439569.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, j));
            }
            zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(j2, PhotonFrameComponentSyntaxUW2Lgll6pE19cl0yDr49750320649121.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(lunarNodeContainerTranspilerUeHVHt0YTG8XVlwlWG66133359911627.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111, j));
        }
        if (RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(lunarNodeContainerTranspilerUeHVHt0YTG8XVlwlWG66133359911627) && j2 - zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 > 40) {
            KryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629[] kryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629Arr3 = vertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG608120870337852.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            Arrays.fill(kryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629Arr3, 0, kryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629Arr3.length, (Object) null);
            vertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG608120870337852.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = 0;
            KryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629[] kryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629Arr4 = vertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            Arrays.fill(kryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629Arr4, 0, kryptonFlowParserTokenUtW8E1Q5tReuq2Aiby78791953963629Arr4.length, (Object) null);
            vertexLinkImmutableCallbackQqyk8UF8bcTZuV4mYG60812087033785.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = 0;
            zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0L;
        }
        zenithPathRegistryGenericJRl0VoLgF5niyT6qLC44138647668394.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = j2;
    }

    public static boolean RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867() {
        if (Build.VERSION.SDK_INT >= 29) {
            return TitanCloudImmutableDebuggerESa2DtaVjPPPe2XY2Y88868124048459.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        }
        try {
            if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == null) {
                ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.invoke(null, Long.valueOf(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
