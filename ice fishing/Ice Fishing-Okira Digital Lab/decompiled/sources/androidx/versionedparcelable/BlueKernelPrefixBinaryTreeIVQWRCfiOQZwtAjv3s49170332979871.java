package androidx.versionedparcelable;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.PackageFactory;
import com.adjust.sdk.ReferrerDetails;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlueKernelPrefixBinaryTreeIVQWRCfiOQZwtAjv3s49170332979871 implements Runnable {
    public final /* synthetic */ Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ Object TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final /* synthetic */ Object YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ BlueKernelPrefixBinaryTreeIVQWRCfiOQZwtAjv3s49170332979871(Context context, LunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102 lunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102, CountDownLatch countDownLatch) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 3;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = context;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = lunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        int i;
        ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).sendInstallReferrerI((ReferrerDetails) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, (String) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                return;
            case 1:
                ((Handler) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).post(new NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745(11, this, ((AsyncTaskExecutor) this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).doInBackground((Object[]) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119)));
                return;
            case 2:
                SdkClickHandler sdkClickHandler = (SdkClickHandler) this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                weakReference = sdkClickHandler.activityHandlerWeakRef;
                IActivityHandler iActivityHandler = (IActivityHandler) weakReference.get();
                if (iActivityHandler == null) {
                    return;
                }
                sdkClickHandler.sendSdkClick(PackageFactory.buildPreinstallSdkClickPackage((String) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, (String) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager()));
                return;
            default:
                LunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102 lunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102 = (LunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                Intent intent = lunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = lunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = lunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                    Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt("google.product_id", valueOf.intValue());
                    }
                    Context context = (Context) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                    bundle.putBoolean("supports_message_handled", true);
                    NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(context);
                    synchronized (ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834) {
                        i = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                        ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i + 1;
                    }
                    CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(new ObsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290(i, 2, bundle, 0));
                }
                CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(BlueKernelSemaphoreResolverCFqSes8q5vvwmq0fe167308262945643.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, new NovaLayerTokenSerializationMtFeChHdbu8AhIvxRC58915843344368((CountDownLatch) this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333));
                return;
        }
    }

    public /* synthetic */ BlueKernelPrefixBinaryTreeIVQWRCfiOQZwtAjv3s49170332979871(Object obj, Object obj2, Object obj3, int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = obj;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obj2;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = obj3;
    }

    public BlueKernelPrefixBinaryTreeIVQWRCfiOQZwtAjv3s49170332979871(SdkClickHandler sdkClickHandler, String str, String str2) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 2;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = sdkClickHandler;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = str;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = str2;
    }
}
