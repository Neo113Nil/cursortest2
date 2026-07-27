package androidx.versionedparcelable;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841 implements Executor {
    public static final Logger UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = Logger.getLogger(DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841.class.getName());
    public final Executor RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final ArrayDeque LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new ArrayDeque();
    public int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = 1;
    public long TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = 0;
    public final NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = new NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745(this);

    public DragonRouteJITAPIIuy08qFB4X7v8BbrLx63645637462841(Executor executor) {
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(executor);
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(runnable);
        synchronized (this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
            int i = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            if (i != 4 && i != 3) {
                long j = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                boolean z = true;
                GoldenVectorWorkerTranspilerGC6tDjoKz8eLQvy06325083993483197 goldenVectorWorkerTranspilerGC6tDjoKz8eLQvy06325083993483197 = new GoldenVectorWorkerTranspilerGC6tDjoKz8eLQvy06325083993483197(runnable, 1);
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.add(goldenVectorWorkerTranspilerGC6tDjoKz8eLQvy06325083993483197);
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = 2;
                try {
                    this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.execute(this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818);
                    if (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 != 2) {
                        return;
                    }
                    synchronized (this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                        try {
                            if (this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 == j && this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 == 2) {
                                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                        try {
                            int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                            if ((i2 != 1 && i2 != 2) || !this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.removeLastOccurrence(goldenVectorWorkerTranspilerGC6tDjoKz8eLQvy06325083993483197)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 + "}";
    }
}
