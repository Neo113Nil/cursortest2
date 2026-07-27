package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishGlideViewModel implements CatchingFishMoshiJUnitRoom {
    public final /* synthetic */ FirebaseMessaging CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishGlideViewModel(FirebaseMessaging firebaseMessaging, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = firebaseMessaging;
    }

    @Override // kotlin.text.CatchingFishMoshiJUnitRoom
    public final void CatchingFishSnackbar(Object obj) {
        boolean z;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishRoomView catchingFishRoomView = (CatchingFishRoomView) obj;
                if (!this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB() || catchingFishRoomView.CatchingFishViewModelFAB.CatchingFishParcelableFAB() == null) {
                    return;
                }
                synchronized (catchingFishRoomView) {
                    z = catchingFishRoomView.CatchingFishViewModelScope;
                }
                if (z) {
                    return;
                }
                catchingFishRoomView.CatchingFishWorkManager(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.CatchingFishDaggerWebsocket;
                CatchingFishFragmentJUnit catchingFishFragmentJUnit = (CatchingFishFragmentJUnit) obj;
                CatchingFishMVPMVPViewModel catchingFishMVPMVPViewModel = FirebaseMessaging.CatchingFishCloudMessaging;
                firebaseMessaging.getClass();
                if (catchingFishFragmentJUnit != null) {
                    CatchingFishDaggerBiometric.CatchingFishPayPal(catchingFishFragmentJUnit.CatchingFishReduxKtor);
                    firebaseMessaging.CatchingFishDaggerWebsocket();
                    return;
                }
                return;
        }
    }
}
