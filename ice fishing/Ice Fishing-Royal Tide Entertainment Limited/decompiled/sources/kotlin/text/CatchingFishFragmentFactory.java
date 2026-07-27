package kotlin.text;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.presentation.info.GameInfoActivity;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;
import com.catchingfish.fishcatcherpro.presentation.menu.MenuGameActivity;
import com.catchingfish.fishcatcherpro.presentation.play.PlayActivity;
import com.catchingfish.fishcatcherpro.presentation.settings.SettingsMusicActivity;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishFragmentFactory implements CatchingFishServiceHandler {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishFragmentFactory(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    private final Object CatchingFishViewModelScope(Object obj) {
        CatchingFishOkHttpStripeAPI catchingFishOkHttpStripeAPI = (CatchingFishOkHttpStripeAPI) ((CatchingFishServiceHandler) this.CatchingFishDaggerWebsocket).CatchingFishFragmentHandler((CatchingFishReduxSpannable) obj);
        synchronized (CatchingFishIntentBundle.CatchingFishCoroutine) {
            CatchingFishIntentBundle.CatchingFishReduxKtor = CatchingFishIntentBundle.CatchingFishReduxKtor.CatchingFishWorkManager(catchingFishOkHttpStripeAPI.CatchingFishViewModelScope());
        }
        return catchingFishOkHttpStripeAPI;
    }

    private final Object CatchingFishWorkManager(Object obj) {
        CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt = (CatchingFishMVIHandlerHilt) this.CatchingFishDaggerWebsocket;
        Throwable th = (Throwable) obj;
        CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
        cancellationException.initCause(th);
        synchronized (catchingFishMVIHandlerHilt.CatchingFishSnackbar) {
            try {
                CatchingFishRoomViewGson catchingFishRoomViewGson = catchingFishMVIHandlerHilt.CatchingFishCoroutine;
                if (catchingFishRoomViewGson != null) {
                    CatchingFishHandlerAndroidX catchingFishHandlerAndroidX = catchingFishMVIHandlerHilt.CatchingFishJetpackCompose;
                    CatchingFishContextAndroidX catchingFishContextAndroidX = CatchingFishContextAndroidX.CatchingFishDaggerWebsocket;
                    catchingFishHandlerAndroidX.getClass();
                    catchingFishHandlerAndroidX.CatchingFishFragmentHandler(null, catchingFishContextAndroidX);
                    catchingFishRoomViewGson.CatchingFishCoroutine(cancellationException);
                    catchingFishMVIHandlerHilt.CatchingFishRoomDatabase = null;
                    catchingFishRoomViewGson.CatchingFishStateLiveData(new CatchingFishKtorBundleKtor(3, catchingFishMVIHandlerHilt, th));
                } else {
                    catchingFishMVIHandlerHilt.CatchingFishReduxKtor = cancellationException;
                    CatchingFishHandlerAndroidX catchingFishHandlerAndroidX2 = catchingFishMVIHandlerHilt.CatchingFishJetpackCompose;
                    CatchingFishContextAndroidX catchingFishContextAndroidX2 = CatchingFishContextAndroidX.CatchingFishReduxKtor;
                    catchingFishHandlerAndroidX2.getClass();
                    catchingFishHandlerAndroidX2.CatchingFishFragmentHandler(null, catchingFishContextAndroidX2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        CatchingFishMoshiAdMobRealm catchingFishMoshiAdMobRealm;
        Object remove;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return obj == ((CatchingFishFirebase) this.CatchingFishDaggerWebsocket) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                CatchingFishWidget catchingFishWidget = (CatchingFishWidget) this.CatchingFishDaggerWebsocket;
                Map.Entry entry = (Map.Entry) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(entry, "it");
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == catchingFishWidget ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != catchingFishWidget ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                CatchingFishReduxAdMob catchingFishReduxAdMob = (CatchingFishReduxAdMob) this.CatchingFishDaggerWebsocket;
                CatchingFishToastCameraX catchingFishToastCameraX = (CatchingFishToastCameraX) obj;
                CatchingFishFragmentToolbar catchingFishFragmentToolbar = catchingFishToastCameraX.CatchingFishSnackbar;
                int i = catchingFishToastCameraX.CatchingFishCoroutine;
                CatchingFishToastCameraX catchingFishToastCameraX2 = new CatchingFishToastCameraX(null, catchingFishFragmentToolbar, i, catchingFishToastCameraX.CatchingFishReduxKtor, catchingFishToastCameraX.CatchingFishDaggerWebsocket);
                CatchingFishViewModelIntent catchingFishViewModelIntent = catchingFishReduxAdMob.CatchingFishParcelableFAB;
                synchronized (((CatchingFishMVPExoPlayer) catchingFishViewModelIntent.CatchingFishDaggerWebsocket)) {
                    try {
                        catchingFishMoshiAdMobRealm = (CatchingFishMoshiAdMobRealm) ((CatchingFishGsonIntent) catchingFishViewModelIntent.CatchingFishWorkManager).CatchingFishWorkManager(catchingFishToastCameraX2);
                        if (catchingFishMoshiAdMobRealm != null) {
                            if (!catchingFishMoshiAdMobRealm.CatchingFishDaggerWebsocket) {
                                CatchingFishGsonIntent catchingFishGsonIntent = (CatchingFishGsonIntent) catchingFishViewModelIntent.CatchingFishWorkManager;
                                synchronized (((CatchingFishGradleMVVM) catchingFishGsonIntent.CatchingFishViewModelScope)) {
                                    CatchingFishViewPagerMockk catchingFishViewPagerMockk = (CatchingFishViewPagerMockk) catchingFishGsonIntent.CatchingFishWorkManager;
                                    catchingFishViewPagerMockk.getClass();
                                    remove = ((LinkedHashMap) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket).remove(catchingFishToastCameraX2);
                                    if (remove != null) {
                                        catchingFishGsonIntent.CatchingFishCoroutine--;
                                    }
                                }
                            }
                        }
                        try {
                            catchingFishReduxAdMob.CatchingFishSnackbar.getClass();
                            catchingFishMoshiAdMobRealm = new CatchingFishMoshiAdMobRealm(((CatchingFishMockkService) catchingFishReduxAdMob.CatchingFishCoroutine.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket(catchingFishFragmentToolbar, i));
                            synchronized (((CatchingFishMVPExoPlayer) catchingFishViewModelIntent.CatchingFishDaggerWebsocket)) {
                                if (((CatchingFishGsonIntent) catchingFishViewModelIntent.CatchingFishWorkManager).CatchingFishWorkManager(catchingFishToastCameraX2) == null && catchingFishMoshiAdMobRealm.CatchingFishDaggerWebsocket) {
                                    ((CatchingFishGsonIntent) catchingFishViewModelIntent.CatchingFishWorkManager).CatchingFishFragmentHandler(catchingFishToastCameraX2, catchingFishMoshiAdMobRealm);
                                }
                            }
                        } catch (Exception e) {
                            throw new IllegalStateException("Could not load font", e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return catchingFishMoshiAdMobRealm.CatchingFishReduxKtor;
            case 3:
                GameInfoActivity gameInfoActivity = (GameInfoActivity) this.CatchingFishDaggerWebsocket;
                int i2 = GameInfoActivity.CatchingFishPayPalService;
                CatchingFishFirebaseDagger.CatchingFishNavigation((CatchingFishViewPagerRealm) obj, "$this$addCallback");
                ((CatchingFishBundleAndroidX) gameInfoActivity.CatchingFishJobScheduler.getValue()).CatchingFishParcelableFAB.getClass();
                gameInfoActivity.startActivity(new Intent(gameInfoActivity, (Class<?>) MenuGameActivity.class));
                gameInfoActivity.finish();
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 4:
                CatchingFishCameraXAndroidX catchingFishCameraXAndroidX = (CatchingFishCameraXAndroidX) this.CatchingFishDaggerWebsocket;
                CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI = (CatchingFishDaggerHiltMVI) obj;
                CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux = CatchingFishCameraXAndroidX.CatchingFishCoroutine;
                long j = 0;
                for (Map.Entry entry2 : catchingFishDaggerHiltMVI.CatchingFishParcelableFAB().entrySet()) {
                    if (entry2.getValue() instanceof Set) {
                        CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux2 = (CatchingFishXMLLayoutRedux) entry2.getKey();
                        Set set = (Set) entry2.getValue();
                        String CatchingFishSnackbar = catchingFishCameraXAndroidX.CatchingFishSnackbar(System.currentTimeMillis());
                        if (set.contains(CatchingFishSnackbar)) {
                            Object[] objArr = {CatchingFishSnackbar};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                throw new IllegalArgumentException("duplicate element: " + obj2);
                            }
                            catchingFishDaggerHiltMVI.CatchingFishReduxKtor(catchingFishXMLLayoutRedux2, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            catchingFishDaggerHiltMVI.CatchingFishCoroutine(catchingFishXMLLayoutRedux2);
                        }
                    }
                }
                if (j == 0) {
                    catchingFishDaggerHiltMVI.CatchingFishCoroutine(catchingFishXMLLayoutRedux);
                } else {
                    catchingFishDaggerHiltMVI.CatchingFishReduxKtor(catchingFishXMLLayoutRedux, Long.valueOf(j));
                }
                return null;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                CatchingFishFluxMVI catchingFishFluxMVI = (CatchingFishFluxMVI) this.CatchingFishDaggerWebsocket;
                Context context = (Context) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(context, "it");
                String str = catchingFishFluxMVI.CatchingFishParcelableFAB;
                LinkedHashSet linkedHashSet = CatchingFishSnackbarService.CatchingFishParcelableFAB;
                CatchingFishFirebaseDagger.CatchingFishNavigation(str, "sharedPreferencesName");
                CatchingFishFirebaseDagger.CatchingFishNavigation(linkedHashSet, "keysToMigrate");
                return CatchingFishGsonCardView.CatchingFishFragmentFactory(new CatchingFishStripeAPIGlide(context, str, CatchingFishPayPalBundle.CatchingFishParcelableFAB, new CatchingFishPayPalAsyncTask(linkedHashSet, null), new CatchingFishToastFABView(3, null)));
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                CatchingFishMockkView catchingFishMockkView = (CatchingFishMockkView) this.CatchingFishDaggerWebsocket;
                Context context2 = (Context) obj;
                CatchingFishFirebaseDagger.CatchingFishNavigation(context2, "context");
                FrameLayout frameLayout = new FrameLayout(context2);
                WebView webView = new WebView(context2);
                frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
                catchingFishMockkView.CatchingFishDaggerWebsocket(frameLayout, webView);
                return frameLayout;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                MainActivity mainActivity = (MainActivity) this.CatchingFishDaggerWebsocket;
                int i3 = MainActivity.CatchingFishHandler;
                CatchingFishFirebaseDagger.CatchingFishNavigation((CatchingFishViewPagerRealm) obj, "$this$addCallback");
                ((CatchingFishViewWidgetFAB) mainActivity.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket).CatchingFishViewModelFAB(100);
                CatchingFishEspressoPayPal catchingFishEspressoPayPal = mainActivity.CatchingFishCardViewRealm;
                WebView CatchingFishLayout = catchingFishEspressoPayPal.CatchingFishLayout();
                if (CatchingFishLayout == null) {
                    mainActivity.finish();
                } else if (CatchingFishLayout.canGoBack()) {
                    CatchingFishLayout.goBack();
                } else {
                    FrameLayout frameLayout2 = (FrameLayout) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket;
                    if ((frameLayout2 != null ? frameLayout2.getChildCount() : 0) == 1) {
                        mainActivity.finish();
                    } else {
                        FrameLayout frameLayout3 = (FrameLayout) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket;
                        if (frameLayout3 != null) {
                            frameLayout3.removeView(CatchingFishLayout);
                        }
                        CatchingFishLayout.destroy();
                    }
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                ((CatchingFishManifestAdMob) this.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket(null);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 9:
                PlayActivity playActivity = (PlayActivity) this.CatchingFishDaggerWebsocket;
                int i4 = PlayActivity.CatchingFishMVVMAppCompat;
                CatchingFishFirebaseDagger.CatchingFishNavigation((CatchingFishViewPagerRealm) obj, "$this$addCallback");
                playActivity.CatchingFishStateLiveData();
                ((CatchingFishBundleAndroidX) playActivity.CatchingFishCameraXIntent.getValue()).CatchingFishParcelableFAB.getClass();
                playActivity.startActivity(new Intent(playActivity, (Class<?>) MenuGameActivity.class));
                playActivity.finish();
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 10:
                ((CatchingFishLayoutStripeAPI) this.CatchingFishDaggerWebsocket).CatchingFishCoroutineFlow(obj);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 11:
                return CatchingFishWorkManager(obj);
            case 12:
                CatchingFishMotionLayout catchingFishMotionLayout = (CatchingFishMotionLayout) this.CatchingFishDaggerWebsocket;
                CatchingFishFirebaseDagger.CatchingFishNavigation(obj, "it");
                return catchingFishMotionLayout.CatchingFishParcelableFAB();
            case 13:
                SettingsMusicActivity settingsMusicActivity = (SettingsMusicActivity) this.CatchingFishDaggerWebsocket;
                int i5 = SettingsMusicActivity.CatchingFishSensorManager;
                CatchingFishFirebaseDagger.CatchingFishNavigation((CatchingFishViewPagerRealm) obj, "$this$addCallback");
                settingsMusicActivity.CatchingFishUnitTesting().CatchingFishParcelableFAB.getClass();
                settingsMusicActivity.startActivity(new Intent(settingsMusicActivity, (Class<?>) MenuGameActivity.class));
                settingsMusicActivity.finish();
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 14:
                return CatchingFishViewModelScope(obj);
            case 15:
                CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) this.CatchingFishDaggerWebsocket;
                if (obj instanceof CatchingFishRetrofitPayPal) {
                    ((CatchingFishRetrofitPayPal) obj).CatchingFishWorkManager(4);
                }
                catchingFishServiceBundle.CatchingFishParcelableFAB(obj);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                CatchingFishViewMVPAndroidX catchingFishViewMVPAndroidX = (CatchingFishViewMVPAndroidX) this.CatchingFishDaggerWebsocket;
                synchronized (catchingFishViewMVPAndroidX.CatchingFishViewModelScope) {
                    CatchingFishHandlerRedux catchingFishHandlerRedux = catchingFishViewMVPAndroidX.CatchingFishLayout;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(catchingFishHandlerRedux);
                    Object obj3 = catchingFishHandlerRedux.CatchingFishSnackbar;
                    CatchingFishFirebaseDagger.CatchingFishAnimationMockk(obj3);
                    int i6 = catchingFishHandlerRedux.CatchingFishReduxKtor;
                    CatchingFishJUnitService catchingFishJUnitService = catchingFishHandlerRedux.CatchingFishCoroutine;
                    if (catchingFishJUnitService == null) {
                        catchingFishJUnitService = new CatchingFishJUnitService();
                        catchingFishHandlerRedux.CatchingFishCoroutine = catchingFishJUnitService;
                        catchingFishHandlerRedux.CatchingFishWorkManager.CatchingFishOkHttp(obj3, catchingFishJUnitService);
                    }
                    catchingFishHandlerRedux.CatchingFishCoroutine(obj, i6, obj3, catchingFishJUnitService);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }

    public /* synthetic */ CatchingFishFragmentFactory(CatchingFishManifestAdMob catchingFishManifestAdMob, CatchingFishContextMoshi catchingFishContextMoshi) {
        this.CatchingFishReduxKtor = 8;
        this.CatchingFishDaggerWebsocket = catchingFishManifestAdMob;
    }
}
