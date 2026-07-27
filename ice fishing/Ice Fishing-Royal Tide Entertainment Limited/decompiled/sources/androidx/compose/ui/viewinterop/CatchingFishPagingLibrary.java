package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishAppCompatWidget;
import kotlin.text.CatchingFishBiometricRoom;
import kotlin.text.CatchingFishBundleAnimation;
import kotlin.text.CatchingFishBundlePicasso;
import kotlin.text.CatchingFishFABExoPlayer;
import kotlin.text.CatchingFishFABMVP;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishFirebaseHilt;
import kotlin.text.CatchingFishGoogleMapsMVP;
import kotlin.text.CatchingFishGradleLiveData;
import kotlin.text.CatchingFishGradleMVPKtor;
import kotlin.text.CatchingFishGsonOkHttp;
import kotlin.text.CatchingFishHiltFAB;
import kotlin.text.CatchingFishJUnitGlide;
import kotlin.text.CatchingFishJUnitLiveData;
import kotlin.text.CatchingFishKtorNavigation;
import kotlin.text.CatchingFishLayoutGradleMVP;
import kotlin.text.CatchingFishLayoutRoomFAB;
import kotlin.text.CatchingFishLayoutToolbar;
import kotlin.text.CatchingFishLiveDataRoom;
import kotlin.text.CatchingFishMVI;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishOkHttpFAB;
import kotlin.text.CatchingFishOkHttpFlux;
import kotlin.text.CatchingFishOkHttpWidget;
import kotlin.text.CatchingFishRealmService;
import kotlin.text.CatchingFishReduxRetrofit;
import kotlin.text.CatchingFishRoomGson;
import kotlin.text.CatchingFishServiceHandler;
import kotlin.text.CatchingFishServiceToolbar;
import kotlin.text.CatchingFishSharedFlowMVI;
import kotlin.text.CatchingFishToastFlux;
import kotlin.text.CatchingFishUnitTestingFlux;
import kotlin.text.CatchingFishViewGradleFlux;
import kotlin.text.CatchingFishWidgetSnackbar;

/* loaded from: classes.dex */
public abstract class CatchingFishPagingLibrary {
    public static final CatchingFishReduxRetrofit CatchingFishCoroutine(CatchingFishBiometricRoom catchingFishBiometricRoom) {
        CatchingFishReduxRetrofit catchingFishReduxRetrofit = catchingFishBiometricRoom.CatchingFishRoomDatabase;
        if (catchingFishReduxRetrofit != null) {
            return catchingFishReduxRetrofit;
        }
        throw CatchingFishMVPLiveData.CatchingFish("Required value was null.");
    }

    public static final void CatchingFishParcelableFAB(CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishBundleAnimation catchingFishBundleAnimation, CatchingFishServiceHandler catchingFishServiceHandler2, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, int i) {
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(-1783766393);
        int i2 = (catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishServiceHandler) ? 4 : 2) | i | (catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(catchingFishBundleAnimation) ? 32 : 16) | (catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishServiceHandler2) ? 256 : 128);
        if (catchingFishSharedFlowMVI.CatchingFishDagger(i2 & 1, (i2 & 147) != 146)) {
            CatchingFishSnackbar(catchingFishServiceHandler, catchingFishBundleAnimation, catchingFishServiceHandler2, catchingFishSharedFlowMVI, ((i2 << 6) & 57344) | (i2 & 14) | 3072 | (i2 & 112));
        } else {
            catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
        }
        CatchingFishHiltFAB CatchingFishRoomDatabase = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase != null) {
            CatchingFishRoomDatabase.CatchingFishReduxKtor = new CatchingFishLayoutToolbar(catchingFishServiceHandler, catchingFishBundleAnimation, catchingFishServiceHandler2, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public static final void CatchingFishSnackbar(CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishBundleAnimation catchingFishBundleAnimation, CatchingFishServiceHandler catchingFishServiceHandler2, CatchingFishSharedFlowMVI catchingFishSharedFlowMVI, int i) {
        int i2;
        int i3;
        CatchingFishServiceHandler catchingFishServiceHandler3;
        CatchingFishGradleMVPKtor catchingFishGradleMVPKtor;
        CatchingFishKtorNavigation catchingFishKtorNavigation;
        CatchingFishToastFlux catchingFishToastFlux;
        CatchingFishJUnitLiveData catchingFishJUnitLiveData;
        ?? r8;
        Object catchingFishServiceToolbar;
        CatchingFishBundleAnimation catchingFishBundleAnimation2;
        CatchingFishOkHttpFlux catchingFishOkHttpFlux;
        CatchingFishMVI catchingFishMVI;
        CatchingFishGradleMVPKtor catchingFishGradleMVPKtor2;
        CatchingFishKtorNavigation catchingFishKtorNavigation2;
        CatchingFishToastFlux catchingFishToastFlux2;
        CatchingFishJUnitLiveData catchingFishJUnitLiveData2;
        CatchingFishMVI catchingFishMVI2 = CatchingFishMVI.CatchingFishOkHttp;
        catchingFishSharedFlowMVI.CatchingFishRecyclerView(-180024211);
        if ((i & 6) == 0) {
            i2 = (catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishServiceHandler) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(catchingFishBundleAnimation) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishMVI2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishServiceHandler2) ? 16384 : 8192;
        }
        if (catchingFishSharedFlowMVI.CatchingFishDagger(i4 & 1, (i4 & 9363) != 9362)) {
            int hashCode = Long.hashCode(catchingFishSharedFlowMVI.CatchingFishParcelable);
            CatchingFishBundleAnimation CatchingFishCoroutine = catchingFishBundleAnimation.CatchingFishCoroutine(FocusGroupPropertiesElement.CatchingFishParcelableFAB);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new CatchingFishAppCompatMVVM() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                @Override // kotlin.text.CatchingFishAppCompatMVVM
                public final /* bridge */ /* synthetic */ void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
                }

                @Override // kotlin.text.CatchingFishAppCompatMVVM
                public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
                    return new CatchingFishAppCompatWidget(7);
                }

                public final boolean equals(Object obj) {
                    return obj == this;
                }

                public final int hashCode() {
                    return 1739042953;
                }
            };
            CatchingFishBundleAnimation CatchingFishSensorManager = CatchingFishLayoutRoomFAB.CatchingFishSensorManager(catchingFishSharedFlowMVI, CatchingFishCoroutine.CatchingFishCoroutine(focusTargetNode$FocusTargetElement).CatchingFishCoroutine(FocusTargetPropertiesElement.CatchingFishParcelableFAB).CatchingFishCoroutine(focusTargetNode$FocusTargetElement));
            CatchingFishOkHttpFlux catchingFishOkHttpFlux2 = (CatchingFishOkHttpFlux) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishGradleLiveData.CatchingFishViewModelFAB);
            CatchingFishGradleMVPKtor catchingFishGradleMVPKtor3 = (CatchingFishGradleMVPKtor) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishGradleLiveData.CatchingFishUnitTesting);
            CatchingFishKtorNavigation CatchingFishCloudMessaging = catchingFishSharedFlowMVI.CatchingFishCloudMessaging();
            CatchingFishToastFlux catchingFishToastFlux3 = (CatchingFishToastFlux) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishRealmService.CatchingFishParcelableFAB);
            CatchingFishJUnitLiveData catchingFishJUnitLiveData3 = (CatchingFishJUnitLiveData) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishOkHttpWidget.CatchingFishParcelableFAB);
            catchingFishSharedFlowMVI.CatchingFishParcelable(1314800527);
            int i5 = i4 & 14;
            int hashCode2 = Long.hashCode(catchingFishSharedFlowMVI.CatchingFishParcelable);
            Context context = (Context) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishFABExoPlayer.CatchingFishSnackbar);
            catchingFishSharedFlowMVI.CatchingFishMotionLayout(206, CatchingFishUnitTestingFlux.CatchingFishDaggerWebsocket);
            if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater) {
                CatchingFishGoogleMapsMVP.CatchingFishParcelableFlux(catchingFishSharedFlowMVI.CatchingFishPayPalService);
            }
            Object CatchingFishCardViewRealm = catchingFishSharedFlowMVI.CatchingFishCardViewRealm();
            CatchingFishLayoutGradleMVP catchingFishLayoutGradleMVP = CatchingFishCardViewRealm instanceof CatchingFishLayoutGradleMVP ? (CatchingFishLayoutGradleMVP) CatchingFishCardViewRealm : null;
            if (catchingFishLayoutGradleMVP == null) {
                catchingFishGradleMVPKtor = catchingFishGradleMVPKtor3;
                catchingFishKtorNavigation = CatchingFishCloudMessaging;
                catchingFishToastFlux = catchingFishToastFlux3;
                catchingFishJUnitLiveData = catchingFishJUnitLiveData3;
                r8 = 1;
                CatchingFishLayoutGradleMVP catchingFishLayoutGradleMVP2 = new CatchingFishLayoutGradleMVP(new CatchingFishBundlePicasso(catchingFishSharedFlowMVI, catchingFishSharedFlowMVI.CatchingFishParcelable, catchingFishSharedFlowMVI.CatchingFishStateLiveData, catchingFishSharedFlowMVI.CatchingFishCardViewView, catchingFishSharedFlowMVI.CatchingFishViewModelScope.CatchingFishCoroutineFlow));
                catchingFishSharedFlowMVI.CatchingFishAndroidX(catchingFishLayoutGradleMVP2);
                catchingFishLayoutGradleMVP = catchingFishLayoutGradleMVP2;
            } else {
                catchingFishGradleMVPKtor = catchingFishGradleMVPKtor3;
                catchingFishKtorNavigation = CatchingFishCloudMessaging;
                catchingFishToastFlux = catchingFishToastFlux3;
                catchingFishJUnitLiveData = catchingFishJUnitLiveData3;
                r8 = 1;
            }
            CatchingFishBundlePicasso catchingFishBundlePicasso = catchingFishLayoutGradleMVP.CatchingFishReduxKtor;
            catchingFishBundlePicasso.CatchingFishWorkManager.setValue(catchingFishSharedFlowMVI.CatchingFishCloudMessaging());
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
            CatchingFishFirebaseHilt catchingFishFirebaseHilt = (CatchingFishFirebaseHilt) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishRoomGson.CatchingFishParcelableFAB);
            View view = (View) catchingFishSharedFlowMVI.CatchingFishLayout(CatchingFishFABExoPlayer.CatchingFishWorkManager);
            boolean CatchingFishViewModelScope = catchingFishSharedFlowMVI.CatchingFishViewModelScope(context) | ((((i5 & 14) ^ 6) > 4 && catchingFishSharedFlowMVI.CatchingFishDaggerWebsocket(catchingFishServiceHandler)) || (i5 & 6) == 4) | catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishBundlePicasso) | catchingFishSharedFlowMVI.CatchingFishViewModelScope(catchingFishFirebaseHilt) | catchingFishSharedFlowMVI.CatchingFishCoroutine(hashCode2) | catchingFishSharedFlowMVI.CatchingFishViewModelScope(view);
            Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
            if (CatchingFishViewModelScope || CatchingFishPayPalService == CatchingFishGsonOkHttp.CatchingFishParcelableFAB) {
                catchingFishBundleAnimation2 = CatchingFishSensorManager;
                catchingFishOkHttpFlux = catchingFishOkHttpFlux2;
                catchingFishMVI = catchingFishMVI2;
                catchingFishGradleMVPKtor2 = catchingFishGradleMVPKtor;
                catchingFishKtorNavigation2 = catchingFishKtorNavigation;
                catchingFishToastFlux2 = catchingFishToastFlux;
                catchingFishJUnitLiveData2 = catchingFishJUnitLiveData;
                i3 = i;
                catchingFishServiceToolbar = new CatchingFishServiceToolbar(context, catchingFishServiceHandler, catchingFishBundlePicasso, catchingFishFirebaseHilt, hashCode2, view);
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(catchingFishServiceToolbar);
            } else {
                i3 = i;
                catchingFishBundleAnimation2 = CatchingFishSensorManager;
                catchingFishOkHttpFlux = catchingFishOkHttpFlux2;
                catchingFishServiceToolbar = CatchingFishPayPalService;
                catchingFishGradleMVPKtor2 = catchingFishGradleMVPKtor;
                catchingFishKtorNavigation2 = catchingFishKtorNavigation;
                catchingFishToastFlux2 = catchingFishToastFlux;
                catchingFishJUnitLiveData2 = catchingFishJUnitLiveData;
                catchingFishMVI = catchingFishMVI2;
            }
            CatchingFishJUnitGlide catchingFishJUnitGlide = (CatchingFishJUnitGlide) catchingFishServiceToolbar;
            catchingFishSharedFlowMVI.CatchingFishGradleManifest(125, null, r8, null);
            catchingFishSharedFlowMVI.CatchingFishRoomDatabase = r8;
            if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater) {
                catchingFishSharedFlowMVI.CatchingFishFragmentHandler(catchingFishJUnitGlide);
            } else {
                catchingFishSharedFlowMVI.CatchingFishRedux();
            }
            CatchingFishFABMVP.CatchingFishSnackbar.getClass();
            CatchingFishOkHttpFAB.CatchingFishAppCompat(catchingFishKtorNavigation2, catchingFishSharedFlowMVI, CatchingFishWidgetSnackbar.CatchingFishReduxKtor);
            CatchingFishOkHttpFAB.CatchingFishAppCompat(catchingFishBundleAnimation2, catchingFishSharedFlowMVI, CatchingFishLiveDataRoom.CatchingFishViewModelFAB);
            CatchingFishOkHttpFAB.CatchingFishAppCompat(catchingFishOkHttpFlux, catchingFishSharedFlowMVI, CatchingFishLiveDataRoom.CatchingFishLayout);
            CatchingFishOkHttpFAB.CatchingFishAppCompat(catchingFishToastFlux2, catchingFishSharedFlowMVI, CatchingFishLiveDataRoom.CatchingFishFragmentHandler);
            CatchingFishOkHttpFAB.CatchingFishAppCompat(catchingFishJUnitLiveData2, catchingFishSharedFlowMVI, CatchingFishLiveDataRoom.CatchingFishCloudMessaging);
            CatchingFishOkHttpFAB.CatchingFishAppCompat(catchingFishGradleMVPKtor2, catchingFishSharedFlowMVI, CatchingFishLiveDataRoom.CatchingFishEspressoTesting);
            CatchingFishLiveDataRoom catchingFishLiveDataRoom = CatchingFishWidgetSnackbar.CatchingFishWorkManager;
            if (catchingFishSharedFlowMVI.CatchingFishLayoutInflater || !CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishSharedFlowMVI.CatchingFishPayPalService(), Integer.valueOf(hashCode))) {
                catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(Integer.valueOf(hashCode));
                catchingFishSharedFlowMVI.CatchingFishSnackbar(Integer.valueOf(hashCode), catchingFishLiveDataRoom);
            }
            catchingFishServiceHandler3 = catchingFishServiceHandler2;
            CatchingFishOkHttpFAB.CatchingFishAppCompat(catchingFishServiceHandler3, catchingFishSharedFlowMVI, CatchingFishLiveDataRoom.CatchingFishWorkManager);
            CatchingFishOkHttpFAB.CatchingFishAppCompat(catchingFishMVI, catchingFishSharedFlowMVI, CatchingFishLiveDataRoom.CatchingFishViewModelScope);
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(r8);
            catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
        } else {
            i3 = i;
            catchingFishServiceHandler3 = catchingFishServiceHandler2;
            catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
        }
        CatchingFishHiltFAB CatchingFishRoomDatabase = catchingFishSharedFlowMVI.CatchingFishRoomDatabase();
        if (CatchingFishRoomDatabase != null) {
            CatchingFishRoomDatabase.CatchingFishReduxKtor = new CatchingFishViewGradleFlux(catchingFishServiceHandler, catchingFishBundleAnimation, catchingFishServiceHandler3, i3);
        }
    }
}
