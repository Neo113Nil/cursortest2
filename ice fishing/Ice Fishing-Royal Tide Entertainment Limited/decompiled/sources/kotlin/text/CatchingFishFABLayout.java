package kotlin.text;

import com.adjust.sdk.Adjust;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.UUID;

/* loaded from: classes.dex */
public final class CatchingFishFABLayout {
    public final CatchingFishServiceHilt CatchingFishCoroutine;
    public final CatchingFishBundleGlide CatchingFishParcelableFAB;
    public final CatchingFishMoshiFluxMoshi CatchingFishReduxKtor;
    public final CatchingFishMVPExoPlayer CatchingFishSnackbar;

    public CatchingFishFABLayout(CatchingFishBundleGlide catchingFishBundleGlide, CatchingFishMVPExoPlayer catchingFishMVPExoPlayer, CatchingFishServiceHilt catchingFishServiceHilt, CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi) {
        this.CatchingFishParcelableFAB = catchingFishBundleGlide;
        this.CatchingFishSnackbar = catchingFishMVPExoPlayer;
        this.CatchingFishCoroutine = catchingFishServiceHilt;
        this.CatchingFishReduxKtor = catchingFishMoshiFluxMoshi;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishParcelableFAB(CatchingFishStateFlowGson catchingFishStateFlowGson) {
        CatchingFishFragmentAdMob catchingFishFragmentAdMob;
        int i;
        CatchingFishFABLayout catchingFishFABLayout;
        FirebaseMessaging firebaseMessaging;
        String str;
        CatchingFishFABLayout catchingFishFABLayout2;
        Object CatchingFishNavigation;
        String str2;
        String str3;
        Object CatchingFishNavigation2;
        String str4;
        String str5;
        Object CatchingFishNavigation3;
        String str6;
        String str7;
        String str8;
        String str9;
        if (catchingFishStateFlowGson instanceof CatchingFishFragmentAdMob) {
            catchingFishFragmentAdMob = (CatchingFishFragmentAdMob) catchingFishStateFlowGson;
            int i2 = catchingFishFragmentAdMob.CatchingFishOkHttp;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                catchingFishFragmentAdMob.CatchingFishOkHttp = i2 - Integer.MIN_VALUE;
                Object obj = catchingFishFragmentAdMob.CatchingFishCloudMessaging;
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                i = catchingFishFragmentAdMob.CatchingFishOkHttp;
                int i3 = 1;
                if (i != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    CatchingFishBundleGlide catchingFishBundleGlide = this.CatchingFishParcelableFAB;
                    catchingFishFragmentAdMob.CatchingFishViewModelScope = this;
                    catchingFishFragmentAdMob.CatchingFishOkHttp = 1;
                    CatchingFishKtorMockk catchingFishKtorMockk = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishFragmentAdMob));
                    catchingFishKtorMockk.CatchingFish();
                    UUID randomUUID = UUID.randomUUID();
                    UUID randomUUID2 = UUID.randomUUID();
                    StringBuilder sb = new StringBuilder();
                    sb.append(randomUUID);
                    sb.append(randomUUID2);
                    Adjust.getGoogleAdId((MainActivity) catchingFishBundleGlide.CatchingFishDaggerWebsocket, new CatchingFishAsyncTaskDagger(catchingFishKtorMockk, sb.toString(), catchingFishBundleGlide, i3));
                    obj = catchingFishKtorMockk.CatchingFishNavigation();
                    if (obj != catchingFishXMLLayoutMockk) {
                        catchingFishFABLayout = this;
                    }
                    return catchingFishXMLLayoutMockk;
                }
                if (i != 1) {
                    if (i == 2) {
                        str = catchingFishFragmentAdMob.CatchingFishViewModelFAB;
                        catchingFishFABLayout2 = (CatchingFishFABLayout) catchingFishFragmentAdMob.CatchingFishViewModelScope;
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        String str10 = (String) obj;
                        CatchingFishServiceHilt catchingFishServiceHilt = catchingFishFABLayout2.CatchingFishCoroutine;
                        catchingFishFragmentAdMob.CatchingFishViewModelScope = catchingFishFABLayout2;
                        catchingFishFragmentAdMob.CatchingFishViewModelFAB = str;
                        catchingFishFragmentAdMob.CatchingFishLayout = str10;
                        catchingFishFragmentAdMob.CatchingFishOkHttp = 3;
                        CatchingFishKtorMockk catchingFishKtorMockk2 = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishFragmentAdMob));
                        catchingFishKtorMockk2.CatchingFish();
                        int i4 = 0;
                        Adjust.getGooglePlayInstallReferrer((MainActivity) catchingFishServiceHilt.CatchingFishDaggerWebsocket, new CatchingFishBundleGlide(27, new CatchingFishAdMob(i4, catchingFishKtorMockk2), new CatchingFishUnitTesting(i4, catchingFishKtorMockk2)));
                        CatchingFishNavigation = catchingFishKtorMockk2.CatchingFishNavigation();
                        if (CatchingFishNavigation != catchingFishXMLLayoutMockk) {
                            String str11 = str;
                            str2 = str10;
                            obj = CatchingFishNavigation;
                            str3 = str11;
                            String str12 = (String) obj;
                            CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi = catchingFishFABLayout2.CatchingFishReduxKtor;
                            catchingFishFragmentAdMob.CatchingFishViewModelScope = catchingFishFABLayout2;
                            catchingFishFragmentAdMob.CatchingFishViewModelFAB = str3;
                            catchingFishFragmentAdMob.CatchingFishLayout = str2;
                            catchingFishFragmentAdMob.CatchingFishFragmentHandler = str12;
                            catchingFishFragmentAdMob.CatchingFishOkHttp = 4;
                            CatchingFishKtorMockk catchingFishKtorMockk3 = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishFragmentAdMob));
                            catchingFishKtorMockk3.CatchingFish();
                            Adjust.getAdid(new CatchingFishToolbarHandler(catchingFishKtorMockk3));
                            CatchingFishNavigation2 = catchingFishKtorMockk3.CatchingFishNavigation();
                            if (CatchingFishNavigation2 != catchingFishXMLLayoutMockk) {
                            }
                        }
                        return catchingFishXMLLayoutMockk;
                    }
                    if (i == 3) {
                        str2 = catchingFishFragmentAdMob.CatchingFishLayout;
                        str3 = catchingFishFragmentAdMob.CatchingFishViewModelFAB;
                        catchingFishFABLayout2 = (CatchingFishFABLayout) catchingFishFragmentAdMob.CatchingFishViewModelScope;
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        String str122 = (String) obj;
                        CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi2 = catchingFishFABLayout2.CatchingFishReduxKtor;
                        catchingFishFragmentAdMob.CatchingFishViewModelScope = catchingFishFABLayout2;
                        catchingFishFragmentAdMob.CatchingFishViewModelFAB = str3;
                        catchingFishFragmentAdMob.CatchingFishLayout = str2;
                        catchingFishFragmentAdMob.CatchingFishFragmentHandler = str122;
                        catchingFishFragmentAdMob.CatchingFishOkHttp = 4;
                        CatchingFishKtorMockk catchingFishKtorMockk32 = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishFragmentAdMob));
                        catchingFishKtorMockk32.CatchingFish();
                        Adjust.getAdid(new CatchingFishToolbarHandler(catchingFishKtorMockk32));
                        CatchingFishNavigation2 = catchingFishKtorMockk32.CatchingFishNavigation();
                        if (CatchingFishNavigation2 != catchingFishXMLLayoutMockk) {
                            String str13 = str2;
                            str4 = str122;
                            obj = CatchingFishNavigation2;
                            str5 = str13;
                            String str14 = (String) obj;
                            CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi3 = catchingFishFABLayout2.CatchingFishReduxKtor;
                            catchingFishFragmentAdMob.CatchingFishViewModelScope = str3;
                            catchingFishFragmentAdMob.CatchingFishViewModelFAB = str5;
                            catchingFishFragmentAdMob.CatchingFishLayout = str4;
                            catchingFishFragmentAdMob.CatchingFishFragmentHandler = str14;
                            catchingFishFragmentAdMob.CatchingFishOkHttp = 5;
                            CatchingFishKtorMockk catchingFishKtorMockk4 = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishFragmentAdMob));
                            catchingFishKtorMockk4.CatchingFish();
                            Adjust.getAttribution(new CatchingFishOkHttpAppCompat(catchingFishKtorMockk4));
                            CatchingFishNavigation3 = catchingFishKtorMockk4.CatchingFishNavigation();
                            if (CatchingFishNavigation3 != catchingFishXMLLayoutMockk) {
                            }
                        }
                        return catchingFishXMLLayoutMockk;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str15 = catchingFishFragmentAdMob.CatchingFishFragmentHandler;
                        String str16 = catchingFishFragmentAdMob.CatchingFishLayout;
                        String str17 = catchingFishFragmentAdMob.CatchingFishViewModelFAB;
                        String str18 = (String) catchingFishFragmentAdMob.CatchingFishViewModelScope;
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        str6 = str16;
                        str7 = str17;
                        str9 = str15;
                        str8 = str18;
                        return new CatchingFishMVIRedux(str8, str7, str6, str9, (String) obj);
                    }
                    str4 = catchingFishFragmentAdMob.CatchingFishFragmentHandler;
                    str5 = catchingFishFragmentAdMob.CatchingFishLayout;
                    str3 = catchingFishFragmentAdMob.CatchingFishViewModelFAB;
                    catchingFishFABLayout2 = (CatchingFishFABLayout) catchingFishFragmentAdMob.CatchingFishViewModelScope;
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    String str142 = (String) obj;
                    CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi32 = catchingFishFABLayout2.CatchingFishReduxKtor;
                    catchingFishFragmentAdMob.CatchingFishViewModelScope = str3;
                    catchingFishFragmentAdMob.CatchingFishViewModelFAB = str5;
                    catchingFishFragmentAdMob.CatchingFishLayout = str4;
                    catchingFishFragmentAdMob.CatchingFishFragmentHandler = str142;
                    catchingFishFragmentAdMob.CatchingFishOkHttp = 5;
                    CatchingFishKtorMockk catchingFishKtorMockk42 = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishFragmentAdMob));
                    catchingFishKtorMockk42.CatchingFish();
                    Adjust.getAttribution(new CatchingFishOkHttpAppCompat(catchingFishKtorMockk42));
                    CatchingFishNavigation3 = catchingFishKtorMockk42.CatchingFishNavigation();
                    if (CatchingFishNavigation3 != catchingFishXMLLayoutMockk) {
                        str6 = str4;
                        str7 = str5;
                        str8 = str3;
                        str9 = str142;
                        obj = CatchingFishNavigation3;
                        return new CatchingFishMVIRedux(str8, str7, str6, str9, (String) obj);
                    }
                    return catchingFishXMLLayoutMockk;
                }
                catchingFishFABLayout = (CatchingFishFABLayout) catchingFishFragmentAdMob.CatchingFishViewModelScope;
                CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                String str19 = (String) obj;
                CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = catchingFishFABLayout.CatchingFishSnackbar;
                catchingFishFragmentAdMob.CatchingFishViewModelScope = catchingFishFABLayout;
                catchingFishFragmentAdMob.CatchingFishViewModelFAB = str19;
                catchingFishFragmentAdMob.CatchingFishOkHttp = 2;
                CatchingFishKtorMockk catchingFishKtorMockk5 = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishFragmentAdMob));
                catchingFishKtorMockk5.CatchingFish();
                CatchingFishMVPMVPViewModel catchingFishMVPMVPViewModel = FirebaseMessaging.CatchingFishCloudMessaging;
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(com.google.firebase.CatchingFishPagingLibrary.CatchingFishSnackbar());
                }
                firebaseMessaging.getClass();
                CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = new CatchingFishAndroidXPayPal();
                firebaseMessaging.CatchingFishWorkManager.execute(new CatchingFishEspressoFlux(10, firebaseMessaging, catchingFishAndroidXPayPal));
                CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = catchingFishAndroidXPayPal.CatchingFishParcelableFAB;
                CatchingFishViewPagerMockk catchingFishViewPagerMockk = new CatchingFishViewPagerMockk(9, catchingFishKtorMockk5);
                catchingFishWorkManagerMVP.getClass();
                catchingFishWorkManagerMVP.CatchingFishSnackbar.CatchingFishSnackbar(new CatchingFishEspressoContext(CatchingFishReduxMockk.CatchingFishParcelableFAB, catchingFishViewPagerMockk));
                catchingFishWorkManagerMVP.CatchingFishUnitTesting();
                Object CatchingFishNavigation4 = catchingFishKtorMockk5.CatchingFishNavigation();
                if (CatchingFishNavigation4 != catchingFishXMLLayoutMockk) {
                    CatchingFishFABLayout catchingFishFABLayout3 = catchingFishFABLayout;
                    str = str19;
                    obj = CatchingFishNavigation4;
                    catchingFishFABLayout2 = catchingFishFABLayout3;
                    String str102 = (String) obj;
                    CatchingFishServiceHilt catchingFishServiceHilt2 = catchingFishFABLayout2.CatchingFishCoroutine;
                    catchingFishFragmentAdMob.CatchingFishViewModelScope = catchingFishFABLayout2;
                    catchingFishFragmentAdMob.CatchingFishViewModelFAB = str;
                    catchingFishFragmentAdMob.CatchingFishLayout = str102;
                    catchingFishFragmentAdMob.CatchingFishOkHttp = 3;
                    CatchingFishKtorMockk catchingFishKtorMockk22 = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishFragmentAdMob));
                    catchingFishKtorMockk22.CatchingFish();
                    int i42 = 0;
                    Adjust.getGooglePlayInstallReferrer((MainActivity) catchingFishServiceHilt2.CatchingFishDaggerWebsocket, new CatchingFishBundleGlide(27, new CatchingFishAdMob(i42, catchingFishKtorMockk22), new CatchingFishUnitTesting(i42, catchingFishKtorMockk22)));
                    CatchingFishNavigation = catchingFishKtorMockk22.CatchingFishNavigation();
                    if (CatchingFishNavigation != catchingFishXMLLayoutMockk) {
                    }
                }
                return catchingFishXMLLayoutMockk;
            }
        }
        catchingFishFragmentAdMob = new CatchingFishFragmentAdMob(this, catchingFishStateFlowGson);
        Object obj2 = catchingFishFragmentAdMob.CatchingFishCloudMessaging;
        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
        i = catchingFishFragmentAdMob.CatchingFishOkHttp;
        int i32 = 1;
        if (i != 0) {
        }
        String str192 = (String) obj2;
        CatchingFishMVPExoPlayer catchingFishMVPExoPlayer2 = catchingFishFABLayout.CatchingFishSnackbar;
        catchingFishFragmentAdMob.CatchingFishViewModelScope = catchingFishFABLayout;
        catchingFishFragmentAdMob.CatchingFishViewModelFAB = str192;
        catchingFishFragmentAdMob.CatchingFishOkHttp = 2;
        CatchingFishKtorMockk catchingFishKtorMockk52 = new CatchingFishKtorMockk(1, CatchingFishBiometricBundle.CatchingFishParcelableFlux(catchingFishFragmentAdMob));
        catchingFishKtorMockk52.CatchingFish();
        CatchingFishMVPMVPViewModel catchingFishMVPMVPViewModel2 = FirebaseMessaging.CatchingFishCloudMessaging;
        synchronized (FirebaseMessaging.class) {
        }
    }
}
