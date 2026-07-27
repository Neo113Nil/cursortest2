package kotlin.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishToastDataStore extends CatchingFishGsonCardView {
    public final /* synthetic */ int CatchingFishCoroutineFlow;

    @Override // kotlin.text.CatchingFishGsonCardView
    public CatchingFishMVPUnitTesting CatchingFishViewModelFAB(Context context, Looper looper, CatchingFishViewWorkManager catchingFishViewWorkManager, Object obj, CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP, CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP2) {
        switch (this.CatchingFishCoroutineFlow) {
            case 2:
                return new CatchingFishFluxRoomDagger(context, looper, 449, catchingFishViewWorkManager, catchingFishAdMobDaggerMVP, catchingFishAdMobDaggerMVP2);
            case 3:
                return new CatchingFishToolbarGraphQL(context, looper, catchingFishViewWorkManager, (CatchingFishBundleHandler) obj, catchingFishAdMobDaggerMVP, catchingFishAdMobDaggerMVP2);
            default:
                return super.CatchingFishViewModelFAB(context, looper, catchingFishViewWorkManager, obj, catchingFishAdMobDaggerMVP, catchingFishAdMobDaggerMVP2);
        }
    }

    @Override // kotlin.text.CatchingFishGsonCardView
    public CatchingFishMVPUnitTesting CatchingFishViewModelScope(Context context, Looper looper, CatchingFishViewWorkManager catchingFishViewWorkManager, Object obj, CatchingFishJUnitPicasso catchingFishJUnitPicasso, CatchingFishHandlerBundle catchingFishHandlerBundle) {
        switch (this.CatchingFishCoroutineFlow) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                catchingFishViewWorkManager.getClass();
                Integer num = (Integer) catchingFishViewWorkManager.CatchingFishLayout;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new CatchingFishWidgetRetrofit(context, looper, catchingFishViewWorkManager, bundle, catchingFishJUnitPicasso, catchingFishHandlerBundle);
            case 1:
                throw CatchingFishMVPLiveData.CatchingFishLayout(obj);
            default:
                return super.CatchingFishViewModelScope(context, looper, catchingFishViewWorkManager, obj, catchingFishJUnitPicasso, catchingFishHandlerBundle);
        }
    }
}
