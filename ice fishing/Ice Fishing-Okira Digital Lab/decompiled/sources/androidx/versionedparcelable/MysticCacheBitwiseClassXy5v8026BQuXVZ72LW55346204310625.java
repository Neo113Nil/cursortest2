package androidx.versionedparcelable;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625 {
    public static final /* synthetic */ int[] ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static ClassCastException BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static void CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(long j, StringBuilder sb, String str) {
        sb.append((Object) GoldenVectorAbstractionProtocolEKVA1LdyMjXz4lDg5E34897787669736.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(j));
        sb.append(str);
    }

    public static HashMap CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(Class cls, SolarMeshCompilerInterfaceOvZr3KsXiWsuckCB8f53722212725747 solarMeshCompilerInterfaceOvZr3KsXiWsuckCB8f53722212725747) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, solarMeshCompilerInterfaceOvZr3KsXiWsuckCB8f53722212725747);
        return hashMap;
    }

    public static Map EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(int i, int i2, ObsidianEngineMonitorTemplatingANOqFYGC9WhTljMTLt16936794921923 obsidianEngineMonitorTemplatingANOqFYGC9WhTljMTLt16936794921923) {
        return (obsidianEngineMonitorTemplatingANOqFYGC9WhTljMTLt16936794921923.hashCode() + i) * i2;
    }

    public static String NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static /* synthetic */ boolean ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static String ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(int i, int i2, int i3, int i4, int i5) {
        DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i);
        DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i2);
        DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i3);
        DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i4);
        DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i5);
    }

    public static int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static /* synthetic */ void RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(Object obj) {
        if (obj == null) {
            return;
        }
        GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
    }

    public static /* synthetic */ void SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static UltraBufferFunctionJITAF9AGpQgDRIajSFahZ15441904171927 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(String str) {
        ObsidianEngineLambdaValidationGvCNBIpXin5KgPbxID14685439027799.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(str);
        return new UltraBufferFunctionJITAF9AGpQgDRIajSFahZ15441904171927();
    }

    public static String UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(String str, int i) {
        return str + i;
    }

    public static /* synthetic */ int XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static String ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }
}
