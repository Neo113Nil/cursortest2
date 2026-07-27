package androidx.versionedparcelable;

import android.os.Trace;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class EmeraldStackFactoryMiddlewareWPnhmB1lmzYEfwCUxq97902723632670 implements Runnable {
    public final /* synthetic */ HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ EmeraldStackFactoryMiddlewareWPnhmB1lmzYEfwCUxq97902723632670(HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                JadeCircuitControllerDecryptionCLBca4YFBlkR7REKI286794020989828 jadeCircuitControllerDecryptionCLBca4YFBlkR7REKI286794020989828 = heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!jadeCircuitControllerDecryptionCLBca4YFBlkR7REKI286794020989828.isEmpty()) {
                    try {
                        ((IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990) jadeCircuitControllerDecryptionCLBca4YFBlkR7REKI286794020989828.removeLast()).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            default:
                heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.EmeraldStackLoaderAbstractionHRq33CtSZcBRBw7SHL45995961054503 = false;
                MotionEvent motionEvent = heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.SolarMeshDependencyDispatcherWJN9UQGtFe9ThAxDFw29230788515080;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.WhiteFieldImmutableCoordinatorGiu9UiW0aWWBajhGmH37956619666367(motionEvent);
                    return;
                } else {
                    GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
        }
    }
}
