package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishDataStoreDagger implements CatchingFishReduxGson {
    public final /* synthetic */ CatchingFishMVIFragment CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishDataStoreDagger(CatchingFishMVIFragment catchingFishMVIFragment, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishMVIFragment;
    }

    @Override // kotlin.text.CatchingFishReduxGson
    public final double CatchingFishCoroutine(double d) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return CatchingFishOkHttpFAB.CatchingFishViewModelFAB(this.CatchingFishDaggerWebsocket.CatchingFishCloudMessaging.CatchingFishCoroutine(d), r10.CatchingFishDaggerWebsocket, r10.CatchingFishWorkManager);
            default:
                return this.CatchingFishDaggerWebsocket.CatchingFishUnitTesting.CatchingFishCoroutine(CatchingFishOkHttpFAB.CatchingFishViewModelFAB(d, r0.CatchingFishDaggerWebsocket, r0.CatchingFishWorkManager));
        }
    }
}
