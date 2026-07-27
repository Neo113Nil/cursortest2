package kotlin.text;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishFABExoPlayer {
    public static final CatchingFishRoomMockkRealm CatchingFishParcelableFAB = new CatchingFishRoomMockkRealm(CatchingFishDataStoreJUnit.CatchingFishWorkManager);
    public static final CatchingFishReduxDagger CatchingFishSnackbar = new CatchingFishReduxDagger(CatchingFishDataStoreJUnit.CatchingFishViewModelScope);
    public static final CatchingFishRoomMockkRealm CatchingFishCoroutine = new CatchingFishRoomMockkRealm();
    public static final CatchingFishReduxDagger CatchingFishReduxKtor = new CatchingFishReduxDagger(CatchingFishDataStoreJUnit.CatchingFishViewModelFAB);
    public static final CatchingFishReduxDagger CatchingFishDaggerWebsocket = new CatchingFishReduxDagger(CatchingFishDataStoreJUnit.CatchingFishLayout);
    public static final CatchingFishReduxDagger CatchingFishWorkManager = new CatchingFishReduxDagger(CatchingFishDataStoreJUnit.CatchingFishFragmentHandler);

    public static final void CatchingFishParcelableFAB(CatchingFishGradleCameraX catchingFishGradleCameraX, CatchingFishMockkView catchingFishMockkView, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, int i) {
        CatchingFishMockkManifest catchingFishMockkManifest;
        boolean areAllPrimitivesSupported;
        LinkedHashMap linkedHashMap;
        boolean z;
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(-520299287);
        int i2 = 4;
        int i3 = (catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishGradleCameraX) ? 4 : 2) | i | (catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishMockkView) ? 32 : 16);
        if (catchingFishSharedFlowMVI.CatchingFishDagger(i3 & 1, (i3 & 19) != 18)) {
            Context context = catchingFishGradleCameraX.getContext();
            Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            Object obj = CatchingFishGsonOkHttp.CatchingFishParcelableFAB;
            if (CatchingFishPayPalService == obj) {
                CatchingFishPayPalService = CatchingFishLayoutRoom.CatchingFishGsonAppCompat(new Configuration(context.getResources().getConfiguration()));
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService);
            }
            CatchingFishMockkManifest catchingFishMockkManifest2 = (CatchingFishMockkManifest) CatchingFishPayPalService;
            Object CatchingFishPayPalService2 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishPayPalService2 == obj) {
                CatchingFishPayPalService2 = new CatchingFishMVVM(i2, catchingFishMockkManifest2);
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService2);
            }
            catchingFishGradleCameraX.setConfigurationChangeObserver((CatchingFishServiceHandler) CatchingFishPayPalService2);
            Object CatchingFishPayPalService3 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishPayPalService3 == obj) {
                CatchingFishPayPalService3 = new CatchingFishCustomViewHilt();
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService3);
            }
            CatchingFishCustomViewHilt catchingFishCustomViewHilt = (CatchingFishCustomViewHilt) CatchingFishPayPalService3;
            CatchingFishWidgetAdMob viewTreeOwners = catchingFishGradleCameraX.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            CatchingFishJUnitLiveData catchingFishJUnitLiveData = viewTreeOwners.CatchingFishSnackbar;
            Object CatchingFishPayPalService4 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishPayPalService4 == obj) {
                Object parent = catchingFishGradleCameraX.getParent();
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = CatchingFishFirebaseHilt.class.getSimpleName() + ':' + str;
                CatchingFishViewModelIntent CatchingFishParcelableFAB2 = catchingFishJUnitLiveData.CatchingFishParcelableFAB();
                Bundle CatchingFishDaggerWebsocket2 = CatchingFishParcelableFAB2.CatchingFishDaggerWebsocket(str2);
                if (CatchingFishDaggerWebsocket2 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : CatchingFishDaggerWebsocket2.keySet()) {
                        ArrayList parcelableArrayList = CatchingFishDaggerWebsocket2.getParcelableArrayList(str3);
                        CatchingFishFirebaseDagger.CatchingFishStateLiveData(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str3, parcelableArrayList);
                        catchingFishMockkManifest2 = catchingFishMockkManifest2;
                    }
                } else {
                    linkedHashMap = null;
                }
                catchingFishMockkManifest = catchingFishMockkManifest2;
                CatchingFishReduxDagger catchingFishReduxDagger = CatchingFishRoomGson.CatchingFishParcelableFAB;
                CatchingFishMVPDaggerHilt catchingFishMVPDaggerHilt = new CatchingFishMVPDaggerHilt(linkedHashMap);
                try {
                    CatchingFishParcelableFAB2.CatchingFishCardViewRealm(str2, new CatchingFishViewCardView(1, catchingFishMVPDaggerHilt));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                Object catchingFishMVPFragment = new CatchingFishMVPFragment(catchingFishMVPDaggerHilt, new CatchingFishFirebaseToast(z, CatchingFishParcelableFAB2, str2));
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(catchingFishMVPFragment);
                CatchingFishPayPalService4 = catchingFishMVPFragment;
            } else {
                catchingFishMockkManifest = catchingFishMockkManifest2;
            }
            Object obj2 = (CatchingFishMVPFragment) CatchingFishPayPalService4;
            boolean CatchingFishViewModelScope = catchingFishSharedFlowMVI.CatchingFishViewModelScope(obj2);
            Object CatchingFishPayPalService5 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishViewModelScope || CatchingFishPayPalService5 == obj) {
                CatchingFishPayPalService5 = new CatchingFishMVVM(5, obj2);
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService5);
            }
            CatchingFishXMLLayoutGlide.CatchingFishSnackbar(CatchingFishRealmContext.CatchingFishParcelableFAB, (CatchingFishServiceHandler) CatchingFishPayPalService5, catchingFishSharedFlowMVI);
            Object CatchingFishPayPalService6 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishPayPalService6 == obj) {
                if (Build.VERSION.SDK_INT >= 31) {
                    areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
                    if (areAllPrimitivesSupported) {
                        catchingFishGradleCameraX.getView();
                        CatchingFishPayPalService6 = new CatchingFishFluxWebSocket();
                        catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService6);
                    }
                }
                CatchingFishPayPalService6 = new CatchingFishFluxWebSocket();
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService6);
            }
            CatchingFishMockkGson catchingFishMockkGson = (CatchingFishMockkGson) CatchingFishPayPalService6;
            Configuration configuration = (Configuration) catchingFishMockkManifest.getValue();
            Object CatchingFishPayPalService7 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishPayPalService7 == obj) {
                CatchingFishPayPalService7 = new CatchingFishIntentEspresso();
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService7);
            }
            CatchingFishIntentEspresso catchingFishIntentEspresso = (CatchingFishIntentEspresso) CatchingFishPayPalService7;
            Object CatchingFishPayPalService8 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            Object obj3 = CatchingFishPayPalService8;
            if (CatchingFishPayPalService8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object CatchingFishPayPalService9 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishPayPalService9 == obj) {
                CatchingFishPayPalService9 = new CatchingFishGlideGoogleMaps(configuration3, catchingFishIntentEspresso);
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService9);
            }
            CatchingFishGlideGoogleMaps catchingFishGlideGoogleMaps = (CatchingFishGlideGoogleMaps) CatchingFishPayPalService9;
            boolean CatchingFishViewModelScope2 = catchingFishSharedFlowMVI.CatchingFishViewModelScope(context);
            Object CatchingFishPayPalService10 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishViewModelScope2 || CatchingFishPayPalService10 == obj) {
                CatchingFishPayPalService10 = new CatchingFishOkHttpRedux(0, context, catchingFishGlideGoogleMaps);
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService10);
            }
            CatchingFishXMLLayoutGlide.CatchingFishSnackbar(catchingFishIntentEspresso, (CatchingFishServiceHandler) CatchingFishPayPalService10, catchingFishSharedFlowMVI);
            Object CatchingFishPayPalService11 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishPayPalService11 == obj) {
                CatchingFishPayPalService11 = new CatchingFishKtorRoom();
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService11);
            }
            CatchingFishKtorRoom catchingFishKtorRoom = (CatchingFishKtorRoom) CatchingFishPayPalService11;
            Object CatchingFishPayPalService12 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishPayPalService12 == obj) {
                CatchingFishPayPalService12 = new CatchingFishGraphQL(catchingFishKtorRoom);
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService12);
            }
            CatchingFishGraphQL catchingFishGraphQL = (CatchingFishGraphQL) CatchingFishPayPalService12;
            boolean CatchingFishViewModelScope3 = catchingFishSharedFlowMVI.CatchingFishViewModelScope(context);
            Object CatchingFishPayPalService13 = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishViewModelScope3 || CatchingFishPayPalService13 == obj) {
                CatchingFishPayPalService13 = new CatchingFishOkHttpRedux(1, context, catchingFishGraphQL);
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(CatchingFishPayPalService13);
            }
            CatchingFishXMLLayoutGlide.CatchingFishSnackbar(catchingFishKtorRoom, (CatchingFishServiceHandler) CatchingFishPayPalService13, catchingFishSharedFlowMVI);
            CatchingFishStripeAPILayout catchingFishStripeAPILayout = CatchingFishGradleLiveData.CatchingFishDaggerHiltFAB;
            CatchingFishAdMobFAB.CatchingFishCoroutine(new CatchingFishServiceGraphQL[]{CatchingFishParcelableFAB.CatchingFishParcelableFAB((Configuration) catchingFishMockkManifest.getValue()), CatchingFishSnackbar.CatchingFishParcelableFAB(context), CatchingFishRealmService.CatchingFishParcelableFAB.CatchingFishParcelableFAB(viewTreeOwners.CatchingFishParcelableFAB), CatchingFishOkHttpWidget.CatchingFishParcelableFAB.CatchingFishParcelableFAB(catchingFishJUnitLiveData), CatchingFishRoomGson.CatchingFishParcelableFAB.CatchingFishParcelableFAB(obj2), CatchingFishWorkManager.CatchingFishParcelableFAB(catchingFishGradleCameraX.getView()), CatchingFishReduxKtor.CatchingFishParcelableFAB(catchingFishIntentEspresso), CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(catchingFishKtorRoom), catchingFishStripeAPILayout.CatchingFishParcelableFAB(Boolean.valueOf(((Boolean) catchingFishSharedFlowMVI.CatchingFishLayout(catchingFishStripeAPILayout)).booleanValue() | catchingFishGradleCameraX.getScrollCaptureInProgress$ui_release())), CatchingFishGradleLiveData.CatchingFishEspressoTesting.CatchingFishParcelableFAB(catchingFishMockkGson)}, CatchingFishBiometricBundle.CatchingFishMutableLiveData(1059770793, new CatchingFishLayoutToolbar(catchingFishGradleCameraX, catchingFishCustomViewHilt, catchingFishMockkView), catchingFishSharedFlowMVI), catchingFishSharedFlowMVI, 56);
        } else {
            catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
        }
        CatchingFishHiltFAB CatchingFishRoomDatabase = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase != null) {
            CatchingFishRoomDatabase.CatchingFishReduxKtor = new CatchingFishWidgetCardView(catchingFishGradleCameraX, catchingFishMockkView, i, 0);
        }
    }

    public static final void CatchingFishSnackbar(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
