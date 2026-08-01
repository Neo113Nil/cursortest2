package com.google.android.datatransport;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class WinterFlowResolverBackend {
    public static final /* synthetic */ int[] WinterFlowRouterStructure = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int WinterFlowArrayNetwork(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static Map WinterFlowBandwidthObject(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ void WinterFlowBatchUI(Object obj) {
        if (obj == null) {
            return;
        }
        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
    }

    public static int WinterFlowCacheManagerAgent(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static void WinterFlowConcurrencyThread(int i, WinterFlowResolverLibrary winterFlowResolverLibrary, WinterFlowExceptionBackend winterFlowExceptionBackend, WinterFlowResolverLibrary winterFlowResolverLibrary2, WinterFlowServiceProviderBatch winterFlowServiceProviderBatch) {
        WinterFlowProtocolNetwork.WinterFlowSyntax(winterFlowExceptionBackend, winterFlowResolverLibrary, Integer.valueOf(i));
        WinterFlowProtocolNetwork.WinterFlowRouterRouter(winterFlowResolverLibrary2, winterFlowServiceProviderBatch);
    }

    public static /* synthetic */ int WinterFlowHookDataSource(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw null;
            }
        }
        return i2;
    }

    public static void WinterFlowOrchestrationSubsystem(int i, int i2, int i3, int i4, int i5) {
        WinterFlowServerManager.WinterFlowCacheManagerAgent(i);
        WinterFlowServerManager.WinterFlowCacheManagerAgent(i2);
        WinterFlowServerManager.WinterFlowCacheManagerAgent(i3);
        WinterFlowServerManager.WinterFlowCacheManagerAgent(i4);
        WinterFlowServerManager.WinterFlowCacheManagerAgent(i5);
    }

    public static String WinterFlowResponseEngine(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ int WinterFlowRouterAdapter(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static String WinterFlowRouterRouter(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static /* synthetic */ boolean WinterFlowRouterStructure(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ int[] WinterFlowSerializerStructure(int i) {
        int[] iArr = new int[i];
        System.arraycopy(WinterFlowRouterStructure, 0, iArr, 0, i);
        return iArr;
    }

    public static String WinterFlowServerProtocol(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static HashMap WinterFlowServiceUtility(Class cls, WinterFlowMapperLayer winterFlowMapperLayer) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, winterFlowMapperLayer);
        return hashMap;
    }

    public static void WinterFlowSingletonPlatform(long j, StringBuilder sb, String str) {
        sb.append((Object) WinterFlowInheritanceSubsystem.WinterFlowRouterRouter(j));
        sb.append(str);
    }

    public static String WinterFlowSyntax(String str, int i) {
        return str + i;
    }

    public static StringBuilder WinterFlowThreadListener(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static String WinterFlowTransactionAgent(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static int WinterFlowTransactionManagerStrategy(WinterFlowEncryptionServer winterFlowEncryptionServer, int i, int i2) {
        return (winterFlowEncryptionServer.hashCode() + i) * i2;
    }

    public static WinterFlowServerSystem WinterFlowUnitTestResponse(String str) {
        WinterFlowViewUtility.WinterFlowCacheManagerAgent(str);
        return new WinterFlowServerSystem();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void WinterFlowVariableBandwidth(WinterFlowConcurrencyLayer winterFlowConcurrencyLayer) {
        boolean isTerminated;
        if (winterFlowConcurrencyLayer instanceof AutoCloseable) {
            winterFlowConcurrencyLayer.close();
            return;
        }
        if (!(winterFlowConcurrencyLayer instanceof ExecutorService)) {
            if (winterFlowConcurrencyLayer instanceof TypedArray) {
                ((TypedArray) winterFlowConcurrencyLayer).recycle();
                return;
            } else if (winterFlowConcurrencyLayer instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) winterFlowConcurrencyLayer).release();
                return;
            } else {
                if (!(winterFlowConcurrencyLayer instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) winterFlowConcurrencyLayer).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) winterFlowConcurrencyLayer;
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

    public static int WinterFlowVariableVersionControl(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }
}
