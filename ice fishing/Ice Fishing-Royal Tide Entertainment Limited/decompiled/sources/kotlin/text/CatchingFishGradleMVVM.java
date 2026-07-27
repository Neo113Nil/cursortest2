package kotlin.text;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class CatchingFishGradleMVVM implements CatchingFishMockkAsyncTask, CatchingFishGlidePayPal, CatchingFishWidgetViewPager, CatchingFishReduxIntent, CatchingFishHiltCustomView, CatchingFishPicassoFirebase, CatchingFishFluxToolbar, CatchingFishAdMobLayout, CatchingFishGsonViewPager, CatchingFishEspressoToast {
    public static final CatchingFishGradleMVVM CatchingFish;
    public static final CatchingFishGradleMVVM CatchingFishAnimationMockk;
    public static final CatchingFishGradleMVVM CatchingFishCoroutineFlow;
    public static final /* synthetic */ CatchingFishGradleMVVM CatchingFishDaggerHiltFAB;
    public static final CatchingFishGradleMVVM CatchingFishJetpackCompose;
    public static final /* synthetic */ CatchingFishGradleMVVM CatchingFishNavigation;
    public static final /* synthetic */ CatchingFishGradleMVVM CatchingFishRoomDatabase;
    public static final CatchingFishGradleMVVM CatchingFishStateLiveData;
    public static final CatchingFishGradleMVVM CatchingFishUnitTesting;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public static final CatchingFishReduxAndroidX CatchingFishDaggerWebsocket = new CatchingFishReduxAndroidX(-1.0f, -1.0f);
    public static final CatchingFishReduxAndroidX CatchingFishWorkManager = new CatchingFishReduxAndroidX(0.0f, -1.0f);
    public static final CatchingFishReduxAndroidX CatchingFishViewModelScope = new CatchingFishReduxAndroidX(1.0f, -1.0f);
    public static final CatchingFishReduxAndroidX CatchingFishViewModelFAB = new CatchingFishReduxAndroidX(-1.0f, 0.0f);
    public static final CatchingFishReduxAndroidX CatchingFishLayout = new CatchingFishReduxAndroidX(0.0f, 0.0f);
    public static final CatchingFishReduxAndroidX CatchingFishFragmentHandler = new CatchingFishReduxAndroidX(1.0f, 0.0f);
    public static final CatchingFishReduxAndroidX CatchingFishCloudMessaging = new CatchingFishReduxAndroidX(-1.0f, 1.0f);
    public static final CatchingFishReduxAndroidX CatchingFishEspressoTesting = new CatchingFishReduxAndroidX(0.0f, 1.0f);
    public static final CatchingFishReduxAndroidX CatchingFishOkHttp = new CatchingFishReduxAndroidX(1.0f, 1.0f);

    static {
        new CatchingFishMVVMGoogleMaps(-1.0f);
        new CatchingFishMVVMGoogleMaps(0.0f);
        new CatchingFishJUnitDagger(-1.0f);
        new CatchingFishJUnitDagger(0.0f);
        CatchingFishUnitTesting = new CatchingFishGradleMVVM(2);
        CatchingFishAnimationMockk = new CatchingFishGradleMVVM(3);
        CatchingFishStateLiveData = new CatchingFishGradleMVVM(4);
        CatchingFishRoomDatabase = new CatchingFishGradleMVVM(5);
        CatchingFishNavigation = new CatchingFishGradleMVVM(6);
        CatchingFish = new CatchingFishGradleMVVM(7);
        CatchingFishJetpackCompose = new CatchingFishGradleMVVM(8);
        CatchingFishCoroutineFlow = new CatchingFishGradleMVVM(9);
        CatchingFishDaggerHiltFAB = new CatchingFishGradleMVVM(10);
    }

    public /* synthetic */ CatchingFishGradleMVVM(int i) {
        this.CatchingFishReduxKtor = i;
    }

    public static boolean CatchingFishViewModelScope(String str) {
        return CatchingFishRoomMVVMWidget.CatchingFishMutableLiveData(str, "pay.google.com") || CatchingFishRoomMVVMWidget.CatchingFishMutableLiveData(str, "payments.google.com") || CatchingFishRoomMVVMWidget.CatchingFishMutableLiveData(str, "wallet.google.com");
    }

    @Override // kotlin.text.CatchingFishAdMobLayout
    public long CatchingFishCoroutine(long j, long j2) {
        float CatchingFishViewModelScope2 = CatchingFishXMLLayoutGlide.CatchingFishViewModelScope(j, j2);
        long floatToRawIntBits = (Float.floatToRawIntBits(CatchingFishViewModelScope2) << 32) | (4294967295L & Float.floatToRawIntBits(CatchingFishViewModelScope2));
        int i = CatchingFishPicassoAndroidX.CatchingFishParcelableFAB;
        return floatToRawIntBits;
    }

    @Override // kotlin.text.CatchingFishReduxIntent
    public CatchingFishWorkManagerMVP CatchingFishDaggerWebsocket(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = CatchingFishGlideAdMobMVI.CatchingFishViewModelFAB;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? CatchingFishViewMVIMVVM.CatchingFishDaggerWebsocket(bundle) : CatchingFishViewMVIMVVM.CatchingFishDaggerWebsocket(null);
    }

    public void CatchingFishLayout(Object obj, CatchingFishMoshiJUnitKtor catchingFishMoshiJUnitKtor) {
        CatchingFishJUnitSharedFlow CatchingFishParcelableFAB;
        Map CatchingFishParcelableFAB2 = ((CatchingFishDaggerHiltMVI) obj).CatchingFishParcelableFAB();
        CatchingFishViewModelMVP CatchingFishUnitTesting2 = CatchingFishStripeAPIFlux.CatchingFishUnitTesting();
        for (Map.Entry entry : CatchingFishParcelableFAB2.entrySet()) {
            CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux = (CatchingFishXMLLayoutRedux) entry.getKey();
            Object value = entry.getValue();
            String str = catchingFishXMLLayoutRedux.CatchingFishParcelableFAB;
            if (value instanceof Boolean) {
                CatchingFishRealmGson CatchingFishCustomView = CatchingFishMoshiSpannable.CatchingFishCustomView();
                boolean booleanValue = ((Boolean) value).booleanValue();
                CatchingFishCustomView.CatchingFishCoroutine();
                CatchingFishMoshiSpannable.CatchingFishRoomDatabase((CatchingFishMoshiSpannable) CatchingFishCustomView.CatchingFishDaggerWebsocket, booleanValue);
                CatchingFishParcelableFAB = CatchingFishCustomView.CatchingFishParcelableFAB();
            } else if (value instanceof Float) {
                CatchingFishRealmGson CatchingFishCustomView2 = CatchingFishMoshiSpannable.CatchingFishCustomView();
                float floatValue = ((Number) value).floatValue();
                CatchingFishCustomView2.CatchingFishCoroutine();
                CatchingFishMoshiSpannable.CatchingFishNavigation((CatchingFishMoshiSpannable) CatchingFishCustomView2.CatchingFishDaggerWebsocket, floatValue);
                CatchingFishParcelableFAB = CatchingFishCustomView2.CatchingFishParcelableFAB();
            } else if (value instanceof Double) {
                CatchingFishRealmGson CatchingFishCustomView3 = CatchingFishMoshiSpannable.CatchingFishCustomView();
                double doubleValue = ((Number) value).doubleValue();
                CatchingFishCustomView3.CatchingFishCoroutine();
                CatchingFishMoshiSpannable.CatchingFishAnimationMockk((CatchingFishMoshiSpannable) CatchingFishCustomView3.CatchingFishDaggerWebsocket, doubleValue);
                CatchingFishParcelableFAB = CatchingFishCustomView3.CatchingFishParcelableFAB();
            } else if (value instanceof Integer) {
                CatchingFishRealmGson CatchingFishCustomView4 = CatchingFishMoshiSpannable.CatchingFishCustomView();
                int intValue = ((Number) value).intValue();
                CatchingFishCustomView4.CatchingFishCoroutine();
                CatchingFishMoshiSpannable.CatchingFish((CatchingFishMoshiSpannable) CatchingFishCustomView4.CatchingFishDaggerWebsocket, intValue);
                CatchingFishParcelableFAB = CatchingFishCustomView4.CatchingFishParcelableFAB();
            } else if (value instanceof Long) {
                CatchingFishRealmGson CatchingFishCustomView5 = CatchingFishMoshiSpannable.CatchingFishCustomView();
                long longValue = ((Number) value).longValue();
                CatchingFishCustomView5.CatchingFishCoroutine();
                CatchingFishMoshiSpannable.CatchingFishEspressoTesting((CatchingFishMoshiSpannable) CatchingFishCustomView5.CatchingFishDaggerWebsocket, longValue);
                CatchingFishParcelableFAB = CatchingFishCustomView5.CatchingFishParcelableFAB();
            } else if (value instanceof String) {
                CatchingFishRealmGson CatchingFishCustomView6 = CatchingFishMoshiSpannable.CatchingFishCustomView();
                CatchingFishCustomView6.CatchingFishCoroutine();
                CatchingFishMoshiSpannable.CatchingFishOkHttp((CatchingFishMoshiSpannable) CatchingFishCustomView6.CatchingFishDaggerWebsocket, (String) value);
                CatchingFishParcelableFAB = CatchingFishCustomView6.CatchingFishParcelableFAB();
            } else if (value instanceof Set) {
                CatchingFishRealmGson CatchingFishCustomView7 = CatchingFishMoshiSpannable.CatchingFishCustomView();
                CatchingFishJUnitNavigation CatchingFishAnimationMockk2 = CatchingFishMVPFirebase.CatchingFishAnimationMockk();
                CatchingFishFirebaseDagger.CatchingFishStateLiveData(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                CatchingFishAnimationMockk2.CatchingFishCoroutine();
                CatchingFishMVPFirebase.CatchingFishEspressoTesting((CatchingFishMVPFirebase) CatchingFishAnimationMockk2.CatchingFishDaggerWebsocket, (Set) value);
                CatchingFishCustomView7.CatchingFishCoroutine();
                CatchingFishMoshiSpannable.CatchingFishUnitTesting((CatchingFishMoshiSpannable) CatchingFishCustomView7.CatchingFishDaggerWebsocket, (CatchingFishMVPFirebase) CatchingFishAnimationMockk2.CatchingFishParcelableFAB());
                CatchingFishParcelableFAB = CatchingFishCustomView7.CatchingFishParcelableFAB();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                CatchingFishRealmGson CatchingFishCustomView8 = CatchingFishMoshiSpannable.CatchingFishCustomView();
                byte[] bArr = (byte[]) value;
                CatchingFishCameraXRealm catchingFishCameraXRealm = CatchingFishCameraXRealm.CatchingFishWorkManager;
                CatchingFishCameraXRealm CatchingFishCoroutine = CatchingFishCameraXRealm.CatchingFishCoroutine(bArr, 0, bArr.length);
                CatchingFishCustomView8.CatchingFishCoroutine();
                CatchingFishMoshiSpannable.CatchingFishStateLiveData((CatchingFishMoshiSpannable) CatchingFishCustomView8.CatchingFishDaggerWebsocket, CatchingFishCoroutine);
                CatchingFishParcelableFAB = CatchingFishCustomView8.CatchingFishParcelableFAB();
            }
            CatchingFishUnitTesting2.getClass();
            str.getClass();
            CatchingFishUnitTesting2.CatchingFishCoroutine();
            CatchingFishStripeAPIFlux.CatchingFishEspressoTesting((CatchingFishStripeAPIFlux) CatchingFishUnitTesting2.CatchingFishDaggerWebsocket).put(str, (CatchingFishMoshiSpannable) CatchingFishParcelableFAB);
        }
        CatchingFishStripeAPIFlux catchingFishStripeAPIFlux = (CatchingFishStripeAPIFlux) CatchingFishUnitTesting2.CatchingFishParcelableFAB();
        int CatchingFishParcelableFAB3 = catchingFishStripeAPIFlux.CatchingFishParcelableFAB(null);
        Logger logger = CatchingFishViewSnackbar.CatchingFishCardViewRealm;
        if (CatchingFishParcelableFAB3 > 4096) {
            CatchingFishParcelableFAB3 = 4096;
        }
        CatchingFishViewSnackbar catchingFishViewSnackbar = new CatchingFishViewSnackbar(catchingFishMoshiJUnitKtor, CatchingFishParcelableFAB3);
        catchingFishStripeAPIFlux.CatchingFishSnackbar(catchingFishViewSnackbar);
        if (catchingFishViewSnackbar.CatchingFishParcelableFlux > 0) {
            catchingFishViewSnackbar.CatchingFishRetrofitMVI();
        }
    }

    @Override // kotlin.text.CatchingFishFluxToolbar
    public byte[] CatchingFishParcelableFAB(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // kotlin.text.CatchingFishEspressoToast
    public void CatchingFishReduxKtor(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
    }

    @Override // kotlin.text.CatchingFishWidgetViewPager
    public boolean CatchingFishSnackbar(Object obj, Object obj2) {
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, obj2);
    }

    public CatchingFishDaggerHiltMVI CatchingFishViewModelFAB(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            CatchingFishStripeAPIFlux CatchingFishAnimationMockk2 = CatchingFishStripeAPIFlux.CatchingFishAnimationMockk(fileInputStream);
            CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI = new CatchingFishDaggerHiltMVI(false);
            CatchingFishViewServiceFlux[] catchingFishViewServiceFluxArr = (CatchingFishViewServiceFlux[]) Arrays.copyOf(new CatchingFishViewServiceFlux[0], 0);
            CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishViewServiceFluxArr, "pairs");
            catchingFishDaggerHiltMVI.CatchingFishSnackbar();
            if (catchingFishViewServiceFluxArr.length > 0) {
                CatchingFishViewServiceFlux catchingFishViewServiceFlux = catchingFishViewServiceFluxArr[0];
                throw null;
            }
            Map CatchingFishOkHttp2 = CatchingFishAnimationMockk2.CatchingFishOkHttp();
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(CatchingFishOkHttp2, "preferencesProto.preferencesMap");
            for (Map.Entry entry : CatchingFishOkHttp2.entrySet()) {
                String str = (String) entry.getKey();
                CatchingFishMoshiSpannable catchingFishMoshiSpannable = (CatchingFishMoshiSpannable) entry.getValue();
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(str, "name");
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(catchingFishMoshiSpannable, "value");
                int CatchingFishMVPRobolectric = catchingFishMoshiSpannable.CatchingFishMVPRobolectric();
                switch (CatchingFishMVPRobolectric == 0 ? -1 : CatchingFishViewPagerHilt.CatchingFishParcelableFAB[CatchingFishMVPLiveData.CatchingFishParcelableFlux(CatchingFishMVPRobolectric)]) {
                    case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                        throw new CatchingFishPayPalExoPlayer("Value case is null.", null);
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    default:
                        throw new CatchingFishBiometricView();
                    case 1:
                        catchingFishDaggerHiltMVI.CatchingFishDaggerWebsocket(new CatchingFishXMLLayoutRedux(str), Boolean.valueOf(catchingFishMoshiSpannable.CatchingFishJetpackCompose()));
                        break;
                    case 2:
                        catchingFishDaggerHiltMVI.CatchingFishDaggerWebsocket(new CatchingFishXMLLayoutRedux(str), Float.valueOf(catchingFishMoshiSpannable.CatchingFishParcelableFlux()));
                        break;
                    case 3:
                        catchingFishDaggerHiltMVI.CatchingFishDaggerWebsocket(new CatchingFishXMLLayoutRedux(str), Double.valueOf(catchingFishMoshiSpannable.CatchingFishSpannableWidget()));
                        break;
                    case 4:
                        catchingFishDaggerHiltMVI.CatchingFishDaggerWebsocket(new CatchingFishXMLLayoutRedux(str), Integer.valueOf(catchingFishMoshiSpannable.CatchingFishGsonAppCompat()));
                        break;
                    case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                        catchingFishDaggerHiltMVI.CatchingFishDaggerWebsocket(new CatchingFishXMLLayoutRedux(str), Long.valueOf(catchingFishMoshiSpannable.CatchingFishCardViewRealm()));
                        break;
                    case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                        CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux = new CatchingFishXMLLayoutRedux(str);
                        String CatchingFishPayPal = catchingFishMoshiSpannable.CatchingFishPayPal();
                        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(CatchingFishPayPal, "value.string");
                        catchingFishDaggerHiltMVI.CatchingFishDaggerWebsocket(catchingFishXMLLayoutRedux, CatchingFishPayPal);
                        break;
                    case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                        CatchingFishXMLLayoutRedux CatchingFishJUnitRealm = CatchingFishOkHttpFAB.CatchingFishJUnitRealm(str);
                        CatchingFishManifestRedux CatchingFishUnitTesting2 = catchingFishMoshiSpannable.CatchingFishCardViewView().CatchingFishUnitTesting();
                        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(CatchingFishUnitTesting2, "value.stringSet.stringsList");
                        catchingFishDaggerHiltMVI.CatchingFishDaggerWebsocket(CatchingFishJUnitRealm, CatchingFishCameraXCameraX.CatchingFishCustomViewJUnit(CatchingFishUnitTesting2));
                        break;
                    case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                        CatchingFishXMLLayoutRedux catchingFishXMLLayoutRedux2 = new CatchingFishXMLLayoutRedux(str);
                        CatchingFishCameraXRealm CatchingFishCoroutineFlow2 = catchingFishMoshiSpannable.CatchingFishCoroutineFlow();
                        int size = CatchingFishCoroutineFlow2.size();
                        if (size == 0) {
                            bArr = CatchingFishFirebaseBundle.CatchingFishSnackbar;
                        } else {
                            byte[] bArr2 = new byte[size];
                            CatchingFishCoroutineFlow2.CatchingFishDaggerWebsocket(bArr2, size);
                            bArr = bArr2;
                        }
                        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(bArr, "value.bytes.toByteArray()");
                        catchingFishDaggerHiltMVI.CatchingFishDaggerWebsocket(catchingFishXMLLayoutRedux2, bArr);
                        break;
                    case 9:
                        throw new CatchingFishPayPalExoPlayer("Value not set.", null);
                }
            }
            return new CatchingFishDaggerHiltMVI(new LinkedHashMap(catchingFishDaggerHiltMVI.CatchingFishParcelableFAB()), true);
        } catch (CatchingFishKtorMVPAndroidX e) {
            throw new CatchingFishPayPalExoPlayer("Unable to parse preferences proto.", e);
        }
    }

    @Override // kotlin.text.CatchingFishMockkAsyncTask
    public Object CatchingFishWorkManager(CatchingFishViewWorkManager catchingFishViewWorkManager) {
        Object CatchingFishWorkManager2 = catchingFishViewWorkManager.CatchingFishWorkManager(new CatchingFishFABDagger(CatchingFishManifestCameraX.class, Executor.class));
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(CatchingFishWorkManager2, "get(...)");
        return new CatchingFishGradleMVP((Executor) CatchingFishWorkManager2);
    }

    public boolean equals(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case 3:
                return obj == this;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.CatchingFishReduxKtor) {
            case 3:
                return -1;
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.CatchingFishReduxKtor) {
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                return "StructuralEqualityPolicy";
            case 16:
                return "Empty";
            default:
                return super.toString();
        }
    }

    public CatchingFishGradleMVVM(View view) {
        this.CatchingFishReduxKtor = 28;
        if (Build.VERSION.SDK_INT >= 30) {
            new CatchingFishAnimationRoom(view);
        } else {
            new CatchingFishWidgetContext(view);
        }
    }

    public CatchingFishGradleMVVM() {
        this.CatchingFishReduxKtor = 14;
        new CatchingFishGsonIntent(16);
        long[] jArr = CatchingFishViewPayPal.CatchingFishParcelableFAB;
        new CatchingFishPayPalService();
    }
}
