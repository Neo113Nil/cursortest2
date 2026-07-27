package kotlin.text;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishHiltSharedFlow implements CatchingFishMockkAsyncTask {
    public final /* synthetic */ CatchingFishFABDagger CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishHiltSharedFlow(CatchingFishFABDagger catchingFishFABDagger, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishFABDagger;
    }

    @Override // kotlin.text.CatchingFishMockkAsyncTask
    public final Object CatchingFishWorkManager(CatchingFishViewWorkManager catchingFishViewWorkManager) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new CatchingFishXMLLayoutAdMob((Context) catchingFishViewWorkManager.CatchingFishParcelableFAB(Context.class), ((com.google.firebase.CatchingFishPagingLibrary) catchingFishViewWorkManager.CatchingFishParcelableFAB(com.google.firebase.CatchingFishPagingLibrary.class)).CatchingFishCoroutine(), catchingFishViewWorkManager.CatchingFishSnackbar(CatchingFishFABDagger.CatchingFishParcelableFAB(CatchingFishMVPExoPlayer.class)), catchingFishViewWorkManager.CatchingFishReduxKtor(CatchingFishStripeAPIMVPMVI.class), (Executor) catchingFishViewWorkManager.CatchingFishWorkManager(this.CatchingFishDaggerWebsocket));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.CatchingFishDaggerWebsocket, catchingFishViewWorkManager);
                return lambda$getComponents$0;
        }
    }
}
