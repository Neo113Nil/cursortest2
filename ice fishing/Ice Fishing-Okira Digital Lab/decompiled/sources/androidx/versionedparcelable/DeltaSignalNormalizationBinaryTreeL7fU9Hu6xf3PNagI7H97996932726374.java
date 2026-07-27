package androidx.versionedparcelable;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class DeltaSignalNormalizationBinaryTreeL7fU9Hu6xf3PNagI7H97996932726374 implements DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865 {
    public final /* synthetic */ CosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public /* synthetic */ DeltaSignalNormalizationBinaryTreeL7fU9Hu6xf3PNagI7H97996932726374(CosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415 cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415;
    }

    @Override // androidx.versionedparcelable.DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865
    public final Object UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(Object obj) {
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i2 = 2;
        AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133 axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133 = AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        CosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415 cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990 ironMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990 = (IronMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990) obj;
                View view = cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    ironMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RapidLogicResponseInterpreterXi1kwiUFGePhdxdJe315407794803317(ironMatrixChannelRepositoryIvDj9K48YedSIPZdCQ56534941073990, 2));
                    }
                }
                return axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133;
            case 1:
                ActionMode actionMode = cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133;
            case 2:
                ActionMode actionMode2 = cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133;
            default:
                cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                return new NovaLayerAliasNormalizationYgmlRhMMlCYxnwULPa31295697995241(i2, cosmicForgeMiddlewareDispatcherKkRYqWZuKhMDCofZot23829413931415);
        }
    }
}
