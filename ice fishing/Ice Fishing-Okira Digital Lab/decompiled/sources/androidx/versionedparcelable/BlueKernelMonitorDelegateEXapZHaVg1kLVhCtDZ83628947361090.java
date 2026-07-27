package androidx.versionedparcelable;

import android.animation.ValueAnimator;
import android.view.View;
import com.adjust.sdk.InstallReferrer;
import com.adjust.sdk.InstallReferrerReadListener;
import com.adjust.sdk.Util;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlueKernelMonitorDelegateEXapZHaVg1kLVhCtDZ83628947361090 implements Runnable {
    public final /* synthetic */ Object BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final /* synthetic */ Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 1;
    public final /* synthetic */ Object TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final /* synthetic */ Object YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public BlueKernelMonitorDelegateEXapZHaVg1kLVhCtDZ83628947361090(InstallReferrer installReferrer, Object obj, Method method, Object[] objArr) {
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = installReferrer;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obj;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = method;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InstallReferrerReadListener installReferrerReadListener;
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        Object obj = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        Object obj2 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        Object obj3 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        Object obj4 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                InstallReferrer installReferrer = (InstallReferrer) obj;
                try {
                    installReferrer.invokeI(obj4, (Method) obj3, (Object[]) obj2);
                    break;
                } catch (Throwable th) {
                    installReferrerReadListener = installReferrer.referrerCallback;
                    installReferrerReadListener.onFail(Util.formatString("invoke error (%s) thrown by (%s)", th.getMessage(), th.getClass().getCanonicalName()));
                    return;
                }
            default:
                DragonRouteEncryptionFunctionJ2BNn1e8kOcd7r6Ufp87565523347357.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339((View) obj4, (JadeCircuitHeuristicEngineVPAKLuqlnM72Vu7gdM41717747528743) obj3, (RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public BlueKernelMonitorDelegateEXapZHaVg1kLVhCtDZ83628947361090(View view, JadeCircuitHeuristicEngineVPAKLuqlnM72Vu7gdM41717747528743 jadeCircuitHeuristicEngineVPAKLuqlnM72Vu7gdM41717747528743, RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050 rapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050, ValueAnimator valueAnimator) {
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = view;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = jadeCircuitHeuristicEngineVPAKLuqlnM72Vu7gdM41717747528743;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = rapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050;
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = valueAnimator;
    }
}
