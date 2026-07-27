package androidx.versionedparcelable;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import com.adjust.sdk.ActivityHandler;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class BlueKernelPolymorphismReflectionBVIRS6psQbLmsFQvf684385403837755 implements Runnable {
    public final /* synthetic */ Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ Object TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final /* synthetic */ boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public /* synthetic */ BlueKernelPolymorphismReflectionBVIRS6psQbLmsFQvf684385403837755(int i, Object obj, Object obj2, boolean z) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obj;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = z;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String notificationDelegate;
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        Object obj = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        boolean z = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        Object obj2 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) obj2).lambda$setPushToken$33(z, (String) obj);
                return;
            case 1:
                ((ActivityHandler) obj2).lambda$setPushToken$32(z, (String) obj);
                return;
            default:
                Context context = (Context) obj2;
                ObsidianEngineTemplatingCompressionFzn5ehySgF1x09uVR357090811763492 obsidianEngineTemplatingCompressionFzn5ehySgF1x09uVR357090811763492 = (ObsidianEngineTemplatingCompressionFzn5ehySgF1x09uVR357090811763492) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor edit = RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        }
                    } else {
                        context.getPackageName();
                    }
                    return;
                } finally {
                    obsidianEngineTemplatingCompressionFzn5ehySgF1x09uVR357090811763492.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(null);
                }
        }
    }
}
