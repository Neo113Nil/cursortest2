package androidx.versionedparcelable;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ZenithPathModuleArrayKVJliIkrLm3EOk7hxQ81821033566458 extends DeltaSignalRequestImmutableHr9GZ9EeDD0yOxbEhq45606300837312 implements CrimsonRouteClosureStreamLDKBGK0WGM7XR6FfEA14518073230691 {
    public final Executor YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public ZenithPathModuleArrayKVJliIkrLm3EOk7hxQ81821033566458(Executor executor) {
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.versionedparcelable.CrimsonRouteClosureStreamLDKBGK0WGM7XR6FfEA14518073230691
    public final void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(long j, ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514) {
        Executor executor = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        boolean z = false;
        Object[] objArr = 0;
        if (scheduledExecutorService != null) {
            NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745 novaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745 = new NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745(21, this, arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514, z);
            ZenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893 zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893 = arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
            try {
                scheduledFuture = scheduledExecutorService.schedule(novaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983(new SolarMeshCoroutineResponseVxZoLJySMKCN5SfiJD11107695827477(objArr == true ? 1 : 0, scheduledFuture));
        } else {
            GoldenVectorDecoderTransportF0f8rGY3oSYuT3uqZU37931580297447.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(j, arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514);
        }
    }

    @Override // androidx.versionedparcelable.CrimsonRouteClosureStreamLDKBGK0WGM7XR6FfEA14518073230691
    public final PhotonFrameEncryptionBootstrapVc3TMC7O2k3VbHImZq68709810142411 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(long j, VertexLinkInheritanceConnectorEX6Q4SIGRdZPMdKQyz69486094761481 vertexLinkInheritanceConnectorEX6Q4SIGRdZPMdKQyz69486094761481, ZenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893 zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893) {
        Executor executor = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(vertexLinkInheritanceConnectorEX6Q4SIGRdZPMdKQyz69486094761481, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893, cancellationException);
            }
        }
        return scheduledFuture != null ? new EmeraldStackNormalizationDependencyOVZWSJQ3qbGzdUdEt174847983131668(scheduledFuture) : GoldenVectorDecoderTransportF0f8rGY3oSYuT3uqZU37931580297447.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(j, vertexLinkInheritanceConnectorEX6Q4SIGRdZPMdKQyz69486094761481, zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893);
    }

    @Override // androidx.versionedparcelable.NovaLayerParserBinaryCnV8ZDCcTz5xzAcd5514357026382260
    public final void YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(ZenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893 zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893, Runnable runnable) {
        try {
            this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893, cancellationException);
            ArcticByteAbstractionAbstractionCwGoYswepfbdyS41f075962546097832 arcticByteAbstractionAbstractionCwGoYswepfbdyS41f075962546097832 = ObsidianEnginePipelineProtocolL3Q6iCQCFLFRG5mqGi49988798613908.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            HeliosRuntimeWildcardFactoryKaQze5gpztxeDBVD2m39520774626083.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ZenithPathModuleArrayKVJliIkrLm3EOk7hxQ81821033566458) && ((ZenithPathModuleArrayKVJliIkrLm3EOk7hxQ81821033566458) obj).YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 == this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    }

    public final int hashCode() {
        return System.identityHashCode(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
    }

    @Override // androidx.versionedparcelable.NovaLayerParserBinaryCnV8ZDCcTz5xzAcd5514357026382260
    public final String toString() {
        return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.toString();
    }
}
