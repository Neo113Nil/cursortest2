package androidx.versionedparcelable;

import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ZenithPathSubroutinePipelineH4EFBpmpNdeHAZEgEZ36848472802822 extends SolarMeshConstructorConnectorRV4u3gudQVU41W4dp291425943411883 implements DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865 {
    public final /* synthetic */ int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ IronMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697 YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZenithPathSubroutinePipelineH4EFBpmpNdeHAZEgEZ36848472802822(IronMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697 ironMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697, int i) {
        super(1);
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = ironMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697;
    }

    @Override // androidx.versionedparcelable.DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865
    public final Object UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(Object obj) {
        boolean dispatchTouchEvent;
        int i = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133 axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133 = AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        IronMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697 ironMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                IronMatrixPostfixProxyB76qj378cWJmlJM44P91727932012442 ironMatrixPostfixProxyB76qj378cWJmlJM44P91727932012442 = (IronMatrixPostfixProxyB76qj378cWJmlJM44P91727932012442) obj;
                HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 = ironMatrixPostfixProxyB76qj378cWJmlJM44P91727932012442 instanceof HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 ? (HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921) ironMatrixPostfixProxyB76qj378cWJmlJM44P91727932012442 : null;
                if (heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 != null) {
                    heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.getAndroidViewsHandler$ui().removeViewInLayout(ironMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697);
                    ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(ironMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697));
                    ironMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697.setImportantForAccessibility(0);
                }
                ironMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697.removeAllViewsInLayout();
                return axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133;
            case 1:
                ironMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195 = (DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865) obj;
                return axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    case 1:
                    case 2:
                    case 3:
                    case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                    case 5:
                    case 6:
                        dispatchTouchEvent = ironMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = ironMatrixPrefixDebuggerClBlgSTk5RKlyELMmm45024717649697.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
