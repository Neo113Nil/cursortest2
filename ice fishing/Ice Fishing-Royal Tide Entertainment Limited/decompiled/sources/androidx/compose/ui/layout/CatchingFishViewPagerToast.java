package androidx.compose.ui.layout;

import kotlin.text.CatchingFishBundleAnimation;
import kotlin.text.CatchingFishFABDataStore;
import kotlin.text.CatchingFishFluxMVIContext;
import kotlin.text.CatchingFishJUnitCustomView;
import kotlin.text.CatchingFishLayoutGsonRoom;
import kotlin.text.CatchingFishRealmMVP;
import kotlin.text.CatchingFishToastHiltBundle;
import kotlin.text.CatchingFishViewReduxIntent;
import kotlin.text.CatchingFishXMLLayoutRoom;

/* loaded from: classes.dex */
public abstract class CatchingFishViewPagerToast {
    public static final CatchingFishLayoutGsonRoom CatchingFishCoroutine;
    public static final CatchingFishLayoutGsonRoom CatchingFishParcelableFAB;
    public static final CatchingFishRealmMVP[] CatchingFishSnackbar;

    static {
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom = new CatchingFishLayoutGsonRoom(8);
        CatchingFishRealmMVP.CatchingFishParcelableFAB.getClass();
        CatchingFishViewReduxIntent catchingFishViewReduxIntent = CatchingFishFluxMVIContext.CatchingFishViewModelScope;
        catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(1, catchingFishViewReduxIntent);
        CatchingFishViewReduxIntent catchingFishViewReduxIntent2 = CatchingFishFluxMVIContext.CatchingFishWorkManager;
        catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(2, catchingFishViewReduxIntent2);
        CatchingFishViewReduxIntent catchingFishViewReduxIntent3 = CatchingFishFluxMVIContext.CatchingFishSnackbar;
        catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(4, catchingFishViewReduxIntent3);
        CatchingFishViewReduxIntent catchingFishViewReduxIntent4 = CatchingFishFluxMVIContext.CatchingFishReduxKtor;
        catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(8, catchingFishViewReduxIntent4);
        CatchingFishViewReduxIntent catchingFishViewReduxIntent5 = CatchingFishFluxMVIContext.CatchingFishViewModelFAB;
        catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(16, catchingFishViewReduxIntent5);
        CatchingFishViewReduxIntent catchingFishViewReduxIntent6 = CatchingFishFluxMVIContext.CatchingFishDaggerWebsocket;
        catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(32, catchingFishViewReduxIntent6);
        CatchingFishViewReduxIntent catchingFishViewReduxIntent7 = CatchingFishFluxMVIContext.CatchingFishLayout;
        catchingFishLayoutGsonRoom.CatchingFishViewModelFAB(64, catchingFishViewReduxIntent7);
        CatchingFishParcelableFAB = catchingFishLayoutGsonRoom;
        CatchingFishSnackbar = new CatchingFishRealmMVP[]{catchingFishViewReduxIntent, catchingFishViewReduxIntent2, catchingFishViewReduxIntent3, catchingFishViewReduxIntent7, catchingFishViewReduxIntent5, catchingFishViewReduxIntent6, catchingFishViewReduxIntent4, CatchingFishFluxMVIContext.CatchingFishFragmentHandler, CatchingFishFluxMVIContext.CatchingFishCoroutine};
        CatchingFishLayoutGsonRoom catchingFishLayoutGsonRoom2 = new CatchingFishLayoutGsonRoom(7);
        catchingFishLayoutGsonRoom2.CatchingFishViewModelFAB(1, catchingFishViewReduxIntent);
        catchingFishLayoutGsonRoom2.CatchingFishViewModelFAB(2, catchingFishViewReduxIntent2);
        catchingFishLayoutGsonRoom2.CatchingFishViewModelFAB(4, catchingFishViewReduxIntent3);
        catchingFishLayoutGsonRoom2.CatchingFishViewModelFAB(16, catchingFishViewReduxIntent5);
        catchingFishLayoutGsonRoom2.CatchingFishViewModelFAB(64, catchingFishViewReduxIntent7);
        catchingFishLayoutGsonRoom2.CatchingFishViewModelFAB(32, catchingFishViewReduxIntent6);
        catchingFishLayoutGsonRoom2.CatchingFishViewModelFAB(8, catchingFishViewReduxIntent4);
        CatchingFishCoroutine = catchingFishLayoutGsonRoom2;
    }

    public static final void CatchingFishParcelableFAB(CatchingFishFABDataStore catchingFishFABDataStore, CatchingFishJUnitCustomView catchingFishJUnitCustomView, long j, int i, int i2) {
        if (CatchingFishToastHiltBundle.CatchingFishJetpackCompose(j, -1L)) {
            return;
        }
        catchingFishFABDataStore.CatchingFishParcelableFAB(catchingFishJUnitCustomView.CatchingFishSnackbar(), (int) ((j >>> 48) & 65535));
        catchingFishFABDataStore.CatchingFishParcelableFAB(catchingFishJUnitCustomView.CatchingFishReduxKtor(), (int) ((j >>> 32) & 65535));
        catchingFishFABDataStore.CatchingFishParcelableFAB(catchingFishJUnitCustomView.CatchingFishCoroutine(), i - ((int) ((j >>> 16) & 65535)));
        catchingFishFABDataStore.CatchingFishParcelableFAB(catchingFishJUnitCustomView.CatchingFishParcelableFAB(), i2 - ((int) (j & 65535)));
    }

    public static final CatchingFishBundleAnimation CatchingFishSnackbar(CatchingFishXMLLayoutRoom catchingFishXMLLayoutRoom) {
        return new RulerProviderModifierElement(catchingFishXMLLayoutRoom);
    }
}
