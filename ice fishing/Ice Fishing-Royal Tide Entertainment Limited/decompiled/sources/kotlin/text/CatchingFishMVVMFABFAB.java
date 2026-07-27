package kotlin.text;

import android.os.Build;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class CatchingFishMVVMFABFAB implements CatchingFishFABGlide {
    public CatchingFishSpannableAdMob CatchingFish;
    public boolean CatchingFishCoroutineFlow;
    public final CatchingFishHandlerSnackbar CatchingFishDaggerWebsocket;
    public float[] CatchingFishEspressoTesting;
    public boolean CatchingFishFragmentHandler;
    public boolean CatchingFishJetpackCompose;
    public long CatchingFishLayout;
    public boolean CatchingFishOkHttp;
    public CatchingFishHiltMVI CatchingFishReduxKtor;
    public int CatchingFishRoomDatabase;
    public CatchingFishJUnitGlide CatchingFishViewModelFAB;
    public CatchingFishMockkView CatchingFishViewModelScope;
    public final CatchingFishGradleCameraX CatchingFishWorkManager;
    public final float[] CatchingFishCloudMessaging = CatchingFishOkHttpFAB.CatchingFishEspressoTesting();
    public CatchingFishOkHttpFlux CatchingFishUnitTesting = CatchingFishGsonCardView.CatchingFishSnackbar();
    public CatchingFishGradleMVPKtor CatchingFishAnimationMockk = CatchingFishGradleMVPKtor.CatchingFishReduxKtor;
    public final CatchingFishEspressoMoshi CatchingFishStateLiveData = new CatchingFishEspressoMoshi();
    public long CatchingFishNavigation = CatchingFishFABView.CatchingFishParcelableFAB;
    public boolean CatchingFishDaggerHiltFAB = true;
    public final CatchingFishMVVM CatchingFishSpannableWidget = new CatchingFishMVVM(12, this);

    public CatchingFishMVVMFABFAB(CatchingFishHiltMVI catchingFishHiltMVI, CatchingFishHandlerSnackbar catchingFishHandlerSnackbar, CatchingFishGradleCameraX catchingFishGradleCameraX, CatchingFishMockkView catchingFishMockkView, CatchingFishJUnitGlide catchingFishJUnitGlide) {
        this.CatchingFishReduxKtor = catchingFishHiltMVI;
        this.CatchingFishDaggerWebsocket = catchingFishHandlerSnackbar;
        this.CatchingFishWorkManager = catchingFishGradleCameraX;
        this.CatchingFishViewModelScope = catchingFishMockkView;
        this.CatchingFishViewModelFAB = catchingFishJUnitGlide;
        long j = Integer.MAX_VALUE;
        this.CatchingFishLayout = (j & 4294967295L) | (j << 32);
    }

    public final long CatchingFishCoroutine(long j, boolean z) {
        float[] CatchingFishSnackbar;
        if (z) {
            CatchingFishSnackbar = CatchingFishParcelableFAB();
            if (CatchingFishSnackbar == null) {
                return 9187343241974906880L;
            }
        } else {
            CatchingFishSnackbar = CatchingFishSnackbar();
        }
        return this.CatchingFishDaggerHiltFAB ? j : CatchingFishOkHttpFAB.CatchingFishJobScheduler(CatchingFishSnackbar, j);
    }

    public final void CatchingFishDaggerWebsocket(long j) {
        if (CatchingFishRobolectricHilt.CatchingFish(j, this.CatchingFishLayout)) {
            return;
        }
        CatchingFishGradleCameraX catchingFishGradleCameraX = this.CatchingFishWorkManager;
        if (catchingFishGradleCameraX.CatchingFishLayout) {
            catchingFishGradleCameraX.CatchingFishSensorManager(-4.0f);
        }
        this.CatchingFishLayout = j;
        invalidate();
    }

    public final float[] CatchingFishParcelableFAB() {
        float[] fArr = this.CatchingFishEspressoTesting;
        if (fArr == null) {
            fArr = CatchingFishOkHttpFAB.CatchingFishEspressoTesting();
            this.CatchingFishEspressoTesting = fArr;
        }
        if (this.CatchingFishCoroutineFlow) {
            this.CatchingFishCoroutineFlow = false;
            float[] CatchingFishSnackbar = CatchingFishSnackbar();
            if (this.CatchingFishDaggerHiltFAB) {
                return CatchingFishSnackbar;
            }
            if (!CatchingFishGsonCardView.CatchingFishMVPRobolectric(CatchingFishSnackbar, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final void CatchingFishReduxKtor(long j) {
        CatchingFishGradleCameraX catchingFishGradleCameraX = this.CatchingFishWorkManager;
        if (catchingFishGradleCameraX.CatchingFishLayout) {
            catchingFishGradleCameraX.CatchingFishSensorManager(-4.0f);
        }
        CatchingFishHiltMVI catchingFishHiltMVI = this.CatchingFishReduxKtor;
        if (!CatchingFishFirebaseDagger.CatchingFishCardViewView(catchingFishHiltMVI.CatchingFishJetpackCompose, j)) {
            catchingFishHiltMVI.CatchingFishJetpackCompose = j;
            catchingFishHiltMVI.CatchingFishParcelableFAB.CatchingFishCustomView((int) (j >> 32), (int) (j & 4294967295L), catchingFishHiltMVI.CatchingFishCoroutineFlow);
        }
        if (Build.VERSION.SDK_INT < 26) {
            catchingFishGradleCameraX.invalidate();
            return;
        }
        ViewParent parent = catchingFishGradleCameraX.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(catchingFishGradleCameraX, catchingFishGradleCameraX);
        }
    }

    public final float[] CatchingFishSnackbar() {
        boolean z = this.CatchingFishJetpackCompose;
        float[] fArr = this.CatchingFishCloudMessaging;
        if (z) {
            CatchingFishHiltMVI catchingFishHiltMVI = this.CatchingFishReduxKtor;
            long j = catchingFishHiltMVI.CatchingFishDaggerHiltFAB;
            CatchingFishFirebaseRealm catchingFishFirebaseRealm = catchingFishHiltMVI.CatchingFishParcelableFAB;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = CatchingFishOkHttpFAB.CatchingFishParcelableFlux(CatchingFishXMLLayoutGlide.CatchingFishCameraXIntent(this.CatchingFishLayout));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float CatchingFish = catchingFishFirebaseRealm.CatchingFish();
            float CatchingFishWorkManager = catchingFishFirebaseRealm.CatchingFishWorkManager();
            float CatchingFishSpannableWidget = catchingFishFirebaseRealm.CatchingFishSpannableWidget();
            float CatchingFishFragmentFactory = catchingFishFirebaseRealm.CatchingFishFragmentFactory();
            float CatchingFishEspressoMockk = catchingFishFirebaseRealm.CatchingFishEspressoMockk();
            float CatchingFishDaggerWebsocket = catchingFishFirebaseRealm.CatchingFishDaggerWebsocket();
            float CatchingFishSensorManager = catchingFishFirebaseRealm.CatchingFishSensorManager();
            double d = CatchingFishSpannableWidget * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = -sin;
            float f2 = (CatchingFishWorkManager * cos) - (1.0f * sin);
            float f3 = (1.0f * cos) + (CatchingFishWorkManager * sin);
            double d2 = CatchingFishFragmentFactory * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d2);
            float cos2 = (float) Math.cos(d2);
            float f4 = -sin2;
            float f5 = sin * sin2;
            float f6 = sin * cos2;
            float f7 = cos * sin2;
            float f8 = cos * cos2;
            float f9 = (f3 * sin2) + (CatchingFish * cos2);
            float f10 = (f3 * cos2) + ((-CatchingFish) * sin2);
            double d3 = CatchingFishEspressoMockk * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d3);
            float cos3 = (float) Math.cos(d3);
            float f11 = -sin3;
            float f12 = (cos3 * f5) + (f11 * cos2);
            float f13 = ((f5 * sin3) + (cos2 * cos3)) * CatchingFishDaggerWebsocket;
            float f14 = sin3 * cos * CatchingFishDaggerWebsocket;
            float f15 = ((sin3 * f6) + (cos3 * f4)) * CatchingFishDaggerWebsocket;
            float f16 = f12 * CatchingFishSensorManager;
            float f17 = cos * cos3 * CatchingFishSensorManager;
            float f18 = ((cos3 * f6) + (f11 * f4)) * CatchingFishSensorManager;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -intBitsToFloat;
                fArr[12] = ((f13 * f22) - (intBitsToFloat2 * f16)) + f9 + intBitsToFloat;
                fArr[13] = ((f14 * f22) - (intBitsToFloat2 * f17)) + f2 + intBitsToFloat2;
                fArr[14] = ((f22 * f15) - (intBitsToFloat2 * f18)) + f10;
                fArr[15] = 1.0f;
            }
            this.CatchingFishJetpackCompose = false;
            this.CatchingFishDaggerHiltFAB = CatchingFishViewMVIMVVM.CatchingFishAnimationMockk(fArr);
        }
        return fArr;
    }

    public final void CatchingFishWorkManager() {
        if (this.CatchingFishOkHttp) {
            if (this.CatchingFishNavigation != CatchingFishFABView.CatchingFishParcelableFAB && !CatchingFishRobolectricHilt.CatchingFish(this.CatchingFishReduxKtor.CatchingFishCoroutineFlow, this.CatchingFishLayout)) {
                CatchingFishHiltMVI catchingFishHiltMVI = this.CatchingFishReduxKtor;
                float CatchingFishParcelableFAB = CatchingFishFABView.CatchingFishParcelableFAB(this.CatchingFishNavigation) * ((int) (this.CatchingFishLayout >> 32));
                float CatchingFishSnackbar = CatchingFishFABView.CatchingFishSnackbar(this.CatchingFishNavigation) * ((int) (this.CatchingFishLayout & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(CatchingFishSnackbar) & 4294967295L) | (Float.floatToRawIntBits(CatchingFishParcelableFAB) << 32);
                if (!CatchingFishToolbarMVIMVVM.CatchingFishParcelableFAB(catchingFishHiltMVI.CatchingFishDaggerHiltFAB, floatToRawIntBits)) {
                    catchingFishHiltMVI.CatchingFishDaggerHiltFAB = floatToRawIntBits;
                    catchingFishHiltMVI.CatchingFishParcelableFAB.CatchingFishCameraXIntent(floatToRawIntBits);
                }
            }
            CatchingFishHiltMVI catchingFishHiltMVI2 = this.CatchingFishReduxKtor;
            CatchingFishOkHttpFlux catchingFishOkHttpFlux = this.CatchingFishUnitTesting;
            CatchingFishGradleMVPKtor catchingFishGradleMVPKtor = this.CatchingFishAnimationMockk;
            long j = this.CatchingFishLayout;
            long j2 = catchingFishHiltMVI2.CatchingFishCoroutineFlow;
            CatchingFishFirebaseRealm catchingFishFirebaseRealm = catchingFishHiltMVI2.CatchingFishParcelableFAB;
            if (!CatchingFishRobolectricHilt.CatchingFish(j2, j)) {
                catchingFishHiltMVI2.CatchingFishCoroutineFlow = j;
                long j3 = catchingFishHiltMVI2.CatchingFishJetpackCompose;
                catchingFishFirebaseRealm.CatchingFishCustomView((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (catchingFishHiltMVI2.CatchingFishLayout == 9205357640488583168L) {
                    catchingFishHiltMVI2.CatchingFishViewModelScope = true;
                    catchingFishHiltMVI2.CatchingFishParcelableFAB();
                }
            }
            catchingFishHiltMVI2.CatchingFishSnackbar = catchingFishOkHttpFlux;
            catchingFishHiltMVI2.CatchingFishCoroutine = catchingFishGradleMVPKtor;
            catchingFishHiltMVI2.CatchingFishReduxKtor = this.CatchingFishSpannableWidget;
            catchingFishFirebaseRealm.CatchingFishMVPRobolectric(catchingFishOkHttpFlux, catchingFishGradleMVPKtor, catchingFishHiltMVI2, catchingFishHiltMVI2.CatchingFishDaggerWebsocket);
            if (this.CatchingFishOkHttp) {
                this.CatchingFishOkHttp = false;
                this.CatchingFishWorkManager.CatchingFishCoroutineFlow(this, false);
            }
        }
    }

    @Override // kotlin.text.CatchingFishFABGlide
    public final void invalidate() {
        if (this.CatchingFishOkHttp || this.CatchingFishFragmentHandler) {
            return;
        }
        CatchingFishGradleCameraX catchingFishGradleCameraX = this.CatchingFishWorkManager;
        catchingFishGradleCameraX.invalidate();
        if (true != this.CatchingFishOkHttp) {
            this.CatchingFishOkHttp = true;
            catchingFishGradleCameraX.CatchingFishCoroutineFlow(this, true);
        }
    }
}
