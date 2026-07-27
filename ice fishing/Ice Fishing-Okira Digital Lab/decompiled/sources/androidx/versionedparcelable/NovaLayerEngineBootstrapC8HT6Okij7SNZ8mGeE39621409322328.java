package androidx.versionedparcelable;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class NovaLayerEngineBootstrapC8HT6Okij7SNZ8mGeE39621409322328 implements CrimsonRouteSessionContextBJQ6WuxJaKo5lgzfv856252869975910 {
    public final /* synthetic */ Object ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final /* synthetic */ Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public /* synthetic */ NovaLayerEngineBootstrapC8HT6Okij7SNZ8mGeE39621409322328(int i, Object obj, Object obj2) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = obj;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = obj2;
    }

    @Override // androidx.versionedparcelable.CrimsonRouteSessionContextBJQ6WuxJaKo5lgzfv856252869975910
    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        boolean isTerminated;
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        Object obj = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        Object obj2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((NovaLayerAsyncVectorJzDfTDHM6bpE2nbZMG88363726068490) obj);
                return;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((CrimsonRouteControllerDelegateJicrwTNczrRHlWIU0Z12276159895305) obj);
                return;
            case 2:
                UltraBufferOverloadingVariableEyKXREItveNgPMwCVp69025848222876 ultraBufferOverloadingVariableEyKXREItveNgPMwCVp69025848222876 = (UltraBufferOverloadingVariableEyKXREItveNgPMwCVp69025848222876) obj2;
                TitanCloudDecoderObserverXTPQ8s25TWrr8CxfVO13379136997575 titanCloudDecoderObserverXTPQ8s25TWrr8CxfVO13379136997575 = (TitanCloudDecoderObserverXTPQ8s25TWrr8CxfVO13379136997575) obj;
                if (ultraBufferOverloadingVariableEyKXREItveNgPMwCVp69025848222876.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 != null) {
                    titanCloudDecoderObserverXTPQ8s25TWrr8CxfVO13379136997575.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119();
                    return;
                }
                if (ultraBufferOverloadingVariableEyKXREItveNgPMwCVp69025848222876.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == null) {
                    GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Unreachable");
                    return;
                }
                JadeCircuitAbstractionCryptographyWUMediXWHmM8K6hSWg48420148059183 jadeCircuitAbstractionCryptographyWUMediXWHmM8K6hSWg48420148059183 = titanCloudDecoderObserverXTPQ8s25TWrr8CxfVO13379136997575.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                ArrayList arrayList = jadeCircuitAbstractionCryptographyWUMediXWHmM8K6hSWg48420148059183.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                CopyOnWriteArrayList copyOnWriteArrayList = jadeCircuitAbstractionCryptographyWUMediXWHmM8K6hSWg48420148059183.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                Iterator it = copyOnWriteArrayList.iterator();
                it.getClass();
                while (true) {
                    int i2 = 0;
                    if (!it.hasNext()) {
                        copyOnWriteArrayList.clear();
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj3 = arrayList.get(i2);
                            i2++;
                            ((HeliosRuntimePacketSchedulerK4zUGlHUXSjTQCWrN058938422603063) obj3).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119();
                        }
                        arrayList.clear();
                        return;
                    }
                    AutoCloseable autoCloseable = (AutoCloseable) it.next();
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            while (!isTerminated) {
                                try {
                                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (i2 == 0) {
                                        executorService.shutdownNow();
                                        i2 = 1;
                                    }
                                }
                            }
                            if (i2 != 0) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof MediaDrm)) {
                            throw new IllegalArgumentException();
                        }
                        ((MediaDrm) autoCloseable).release();
                    }
                }
                break;
            case 3:
                ((KryptonFlowCallbackAliasVP2oo5OSwaw9qSDkGb73871738049231) obj2).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480((CrimsonRouteConnectorTranspilerKtRnmP8m0YfqwP2uYy31843995963298) obj);
                return;
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                ((AxiomCoreOperatorContainerNJWKZOi1q9JQNU5fPD34188073024151) obj2).YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(obj);
                return;
            case 5:
                ((AxiomCoreIteratorEncoderLc4iXlp5uGhrGMukIx85044665577145) obj2).NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.remove((AxiomCoreIteratorEncoderLc4iXlp5uGhrGMukIx85044665577145) obj);
                return;
            case 6:
                AxiomCoreIteratorEncoderLc4iXlp5uGhrGMukIx85044665577145 axiomCoreIteratorEncoderLc4iXlp5uGhrGMukIx85044665577145 = (AxiomCoreIteratorEncoderLc4iXlp5uGhrGMukIx85044665577145) obj2;
                KryptonFlowProtocolSerializationECvwp2VkmjSl2Q18tL99754472942840 kryptonFlowProtocolSerializationECvwp2VkmjSl2Q18tL99754472942840 = (KryptonFlowProtocolSerializationECvwp2VkmjSl2Q18tL99754472942840) ((SolarMeshRouterContextNd5ZMSCAsQiXjrhbw323820501743495) obj).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getValue();
                if (kryptonFlowProtocolSerializationECvwp2VkmjSl2Q18tL99754472942840 != null) {
                    axiomCoreIteratorEncoderLc4iXlp5uGhrGMukIx85044665577145.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.remove(kryptonFlowProtocolSerializationECvwp2VkmjSl2Q18tL99754472942840.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
                    return;
                }
                return;
            default:
                ZenithPathJITAlgorithmMqMvxYPDW3MaAB9zLv79391251965739 zenithPathJITAlgorithmMqMvxYPDW3MaAB9zLv79391251965739 = (ZenithPathJITAlgorithmMqMvxYPDW3MaAB9zLv79391251965739) obj2;
                View view = (View) obj;
                int i3 = zenithPathJITAlgorithmMqMvxYPDW3MaAB9zLv79391251965739.UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541 - 1;
                zenithPathJITAlgorithmMqMvxYPDW3MaAB9zLv79391251965739.UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541 = i3;
                if (i3 == 0) {
                    int i4 = ObsidianEngineRequestAggregationCJ9unXvWW6NxCxO6pK68779594472551.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    BlazePulseCallbackDelegateSXsdPLvHXsJZRs6z7F42641952180630.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(view, null);
                    ObsidianEngineRequestAggregationCJ9unXvWW6NxCxO6pK68779594472551.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(view, null);
                    view.removeOnAttachStateChangeListener(zenithPathJITAlgorithmMqMvxYPDW3MaAB9zLv79391251965739.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942);
                    return;
                }
                return;
        }
    }
}
