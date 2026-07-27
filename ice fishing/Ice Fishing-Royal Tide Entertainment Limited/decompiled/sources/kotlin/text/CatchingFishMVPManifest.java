package kotlin.text;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class CatchingFishMVPManifest {
    public final CatchingFishReduxLifecycle CatchingFishCoroutine;
    public final CatchingFishBiometricRoom CatchingFishParcelableFAB;
    public final CatchingFishBundleGradle CatchingFishReduxKtor = new CatchingFishBundleGradle(2);
    public final CatchingFishViewMockk CatchingFishSnackbar;

    public CatchingFishMVPManifest(CatchingFishBiometricRoom catchingFishBiometricRoom, CatchingFishViewMockk catchingFishViewMockk, CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom) {
        this.CatchingFishParcelableFAB = catchingFishBiometricRoom;
        this.CatchingFishSnackbar = catchingFishViewMockk;
        this.CatchingFishCoroutine = catchingFishLayoutGsonRoom;
    }

    public final CatchingFishMVIGraphQLHilt CatchingFishParcelableFAB() {
        return new CatchingFishMVIGraphQLHilt(this.CatchingFishSnackbar, false, this.CatchingFishParcelableFAB, new CatchingFishMVPMotionLayout());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishSnackbar(CatchingFishBiometricRoom catchingFishBiometricRoom, CatchingFishMVPMotionLayout catchingFishMVPMotionLayout) {
        String str;
        boolean z;
        boolean z2;
        AutofillValue forText;
        CatchingFishBundleGradle catchingFishBundleGradle = this.CatchingFishReduxKtor;
        Object[] objArr = catchingFishBundleGradle.CatchingFishParcelableFAB;
        int i = catchingFishBundleGradle.CatchingFishSnackbar;
        for (int i2 = 0; i2 < i; i2++) {
            CatchingFishDataStoreMVVM catchingFishDataStoreMVVM = (CatchingFishDataStoreMVVM) objArr[i2];
            CatchingFishMVIWidget catchingFishMVIWidget = catchingFishDataStoreMVVM.CatchingFishViewModelScope;
            CatchingFishGradleCameraX catchingFishGradleCameraX = catchingFishDataStoreMVVM.CatchingFishCoroutine;
            CatchingFishViewPagerMockk catchingFishViewPagerMockk = catchingFishDataStoreMVVM.CatchingFishParcelableFAB;
            CatchingFishMVPMotionLayout CatchingFish = catchingFishBiometricRoom.CatchingFish();
            int i3 = catchingFishBiometricRoom.CatchingFishDaggerWebsocket;
            String str2 = null;
            if (catchingFishMVPMotionLayout != null) {
                Object CatchingFishViewModelScope = catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCardViewRealm);
                if (CatchingFishViewModelScope == null) {
                    CatchingFishViewModelScope = null;
                }
                CatchingFishWebsocketDagger catchingFishWebsocketDagger = (CatchingFishWebsocketDagger) CatchingFishViewModelScope;
                if (catchingFishWebsocketDagger != null) {
                    str = catchingFishWebsocketDagger.CatchingFishDaggerWebsocket;
                    if (CatchingFish != null) {
                        Object CatchingFishViewModelScope2 = CatchingFish.CatchingFishReduxKtor.CatchingFishViewModelScope(CatchingFishServiceMVI.CatchingFishCardViewRealm);
                        if (CatchingFishViewModelScope2 == null) {
                            CatchingFishViewModelScope2 = null;
                        }
                        CatchingFishWebsocketDagger catchingFishWebsocketDagger2 = (CatchingFishWebsocketDagger) CatchingFishViewModelScope2;
                        if (catchingFishWebsocketDagger2 != null) {
                            str2 = catchingFishWebsocketDagger2.CatchingFishDaggerWebsocket;
                        }
                    }
                    if (str != str2) {
                        if (str == null) {
                            catchingFishViewPagerMockk.CatchingFishStateLiveData(catchingFishGradleCameraX, i3, true);
                        } else if (str2 == null) {
                            catchingFishViewPagerMockk.CatchingFishStateLiveData(catchingFishGradleCameraX, i3, false);
                        } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp((CatchingFishExoPlayerHilt) CatchingFishViewMVIMVVM.CatchingFishCloudMessaging(CatchingFish, CatchingFishServiceMVI.CatchingFishRoomDatabase), CatchingFishMVPExoPlayer.CatchingFishDaggerWebsocket)) {
                            forText = AutofillValue.forText(str2.toString());
                            ((AutofillManager) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket).notifyValueChanged(catchingFishGradleCameraX, i3, forText);
                        }
                    }
                    z = catchingFishMVPMotionLayout == null && catchingFishMVPMotionLayout.CatchingFishReduxKtor.CatchingFishSnackbar(CatchingFishServiceMVI.CatchingFishStateLiveData);
                    z2 = CatchingFish == null && CatchingFish.CatchingFishReduxKtor.CatchingFishSnackbar(CatchingFishServiceMVI.CatchingFishStateLiveData);
                    if (z != z2) {
                        if (z2) {
                            catchingFishMVIWidget.CatchingFishParcelableFAB(i3);
                        } else {
                            catchingFishMVIWidget.CatchingFishDaggerWebsocket(i3);
                        }
                    }
                }
            }
            str = null;
            if (CatchingFish != null) {
            }
            if (str != str2) {
            }
            if (catchingFishMVPMotionLayout == null) {
            }
            if (CatchingFish == null) {
            }
            if (z != z2) {
            }
        }
    }
}
