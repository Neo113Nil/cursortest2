package kotlin.text;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class CatchingFishViewModelFlux extends CatchingFishAndroidX {
    public final /* synthetic */ CatchingFishBiometricRoom CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishGradleCameraX CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishGradleCameraX CatchingFishWorkManager;

    public CatchingFishViewModelFlux(CatchingFishGradleCameraX catchingFishGradleCameraX, CatchingFishBiometricRoom catchingFishBiometricRoom, CatchingFishGradleCameraX catchingFishGradleCameraX2) {
        this.CatchingFishReduxKtor = catchingFishGradleCameraX;
        this.CatchingFishDaggerWebsocket = catchingFishBiometricRoom;
        this.CatchingFishWorkManager = catchingFishGradleCameraX2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4.intValue() == r8.getSemanticsOwner().CatchingFishParcelableFAB().CatchingFishViewModelScope) goto L19;
     */
    @Override // kotlin.text.CatchingFishAndroidX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishReduxKtor(View view, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
        this.CatchingFishParcelableFAB.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CatchingFishGradleCameraX catchingFishGradleCameraX = this.CatchingFishReduxKtor;
        CatchingFishFABViewModel catchingFishFABViewModel = catchingFishGradleCameraX.CatchingFishDaggerHiltFAB;
        if (catchingFishFABViewModel.CatchingFishCoroutineFlow()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        CatchingFishBiometricRoom catchingFishBiometricRoom = this.CatchingFishDaggerWebsocket;
        CatchingFishBiometricRoom CatchingFishRoomDatabase = catchingFishBiometricRoom.CatchingFishRoomDatabase();
        while (true) {
            if (CatchingFishRoomDatabase == null) {
                CatchingFishRoomDatabase = null;
                break;
            } else if (CatchingFishRoomDatabase.CatchingFishJobScheduler.CatchingFishViewModelFAB(8)) {
                break;
            } else {
                CatchingFishRoomDatabase = CatchingFishRoomDatabase.CatchingFishRoomDatabase();
            }
        }
        Integer valueOf = CatchingFishRoomDatabase != null ? Integer.valueOf(CatchingFishRoomDatabase.CatchingFishDaggerWebsocket) : null;
        if (valueOf != null) {
        }
        valueOf = -1;
        int intValue = valueOf.intValue();
        catchingFishViewJUnitJUnit.CatchingFishSnackbar = intValue;
        CatchingFishGradleCameraX catchingFishGradleCameraX2 = this.CatchingFishWorkManager;
        accessibilityNodeInfo.setParent(catchingFishGradleCameraX2, intValue);
        int i = catchingFishBiometricRoom.CatchingFishDaggerWebsocket;
        int CatchingFishReduxKtor = catchingFishFABViewModel.CatchingFishCardViewView.CatchingFishReduxKtor(i);
        if (CatchingFishReduxKtor != -1) {
            CatchingFishHiltBundle CatchingFishGsonAppCompat = CatchingFishKtorViewModel.CatchingFishGsonAppCompat(catchingFishGradleCameraX.getAndroidViewsHandler$ui_release(), CatchingFishReduxKtor);
            if (CatchingFishGsonAppCompat != null) {
                accessibilityNodeInfo.setTraversalBefore(CatchingFishGsonAppCompat);
            } else {
                accessibilityNodeInfo.setTraversalBefore(catchingFishGradleCameraX2, CatchingFishReduxKtor);
            }
            CatchingFishGradleCameraX.CatchingFishParcelableFAB(catchingFishGradleCameraX, i, accessibilityNodeInfo, catchingFishFABViewModel.CatchingFishCustomView);
        }
        int CatchingFishReduxKtor2 = catchingFishFABViewModel.CatchingFishMVPRobolectric.CatchingFishReduxKtor(i);
        if (CatchingFishReduxKtor2 != -1) {
            CatchingFishHiltBundle CatchingFishGsonAppCompat2 = CatchingFishKtorViewModel.CatchingFishGsonAppCompat(catchingFishGradleCameraX.getAndroidViewsHandler$ui_release(), CatchingFishReduxKtor2);
            if (CatchingFishGsonAppCompat2 != null) {
                accessibilityNodeInfo.setTraversalAfter(CatchingFishGsonAppCompat2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(catchingFishGradleCameraX2, CatchingFishReduxKtor2);
            }
            CatchingFishGradleCameraX.CatchingFishParcelableFAB(catchingFishGradleCameraX, i, accessibilityNodeInfo, catchingFishFABViewModel.CatchingFishFragmentFactory);
        }
    }
}
