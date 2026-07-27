package kotlin.text;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class CatchingFishGsonXMLLayout implements CatchingFishFirebaseRealm {
    public static final CatchingFishIntentDagger CatchingFishSpannableWidget = new CatchingFishIntentDagger();
    public float CatchingFish;
    public int CatchingFishAnimationMockk;
    public boolean CatchingFishCloudMessaging;
    public final CatchingFishManifestPayPal CatchingFishCoroutine;
    public long CatchingFishCoroutineFlow;
    public float CatchingFishDaggerHiltFAB;
    public final Resources CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public long CatchingFishFragmentHandler;
    public long CatchingFishJetpackCompose;
    public int CatchingFishLayout;
    public float CatchingFishNavigation;
    public boolean CatchingFishOkHttp;
    public final CatchingFishMVPFluxHilt CatchingFishReduxKtor;
    public boolean CatchingFishRoomDatabase;
    public final CatchingFishWidgetAppCompat CatchingFishSnackbar;
    public float CatchingFishStateLiveData;
    public int CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public Paint CatchingFishViewModelScope;
    public final Rect CatchingFishWorkManager;

    public CatchingFishGsonXMLLayout(CatchingFishWidgetAppCompat catchingFishWidgetAppCompat) {
        CatchingFishManifestPayPal catchingFishManifestPayPal = new CatchingFishManifestPayPal();
        CatchingFishEspressoMoshi catchingFishEspressoMoshi = new CatchingFishEspressoMoshi();
        this.CatchingFishSnackbar = catchingFishWidgetAppCompat;
        this.CatchingFishCoroutine = catchingFishManifestPayPal;
        CatchingFishMVPFluxHilt catchingFishMVPFluxHilt = new CatchingFishMVPFluxHilt(catchingFishWidgetAppCompat, catchingFishManifestPayPal, catchingFishEspressoMoshi);
        this.CatchingFishReduxKtor = catchingFishMVPFluxHilt;
        this.CatchingFishDaggerWebsocket = catchingFishWidgetAppCompat.getResources();
        this.CatchingFishWorkManager = new Rect();
        catchingFishWidgetAppCompat.addView(catchingFishMVPFluxHilt);
        catchingFishMVPFluxHilt.setClipBounds(null);
        this.CatchingFishFragmentHandler = 0L;
        View.generateViewId();
        this.CatchingFishUnitTesting = 3;
        this.CatchingFishAnimationMockk = 0;
        this.CatchingFishStateLiveData = 1.0f;
        this.CatchingFishNavigation = 1.0f;
        this.CatchingFish = 1.0f;
        long j = CatchingFishToastFragment.CatchingFishSnackbar;
        this.CatchingFishJetpackCompose = j;
        this.CatchingFishCoroutineFlow = j;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final float CatchingFish() {
        return 0.0f;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishAnimationMockk(int i) {
        this.CatchingFishUnitTesting = i;
        Paint paint = this.CatchingFishViewModelScope;
        if (paint == null) {
            paint = new Paint();
            this.CatchingFishViewModelScope = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(CatchingFishAdMobFAB.CatchingFishLayoutInflater(i)));
        CatchingFishGradleManifest();
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishCameraXIntent(long j) {
        long j2 = 9223372034707292159L & j;
        CatchingFishMVPFluxHilt catchingFishMVPFluxHilt = this.CatchingFishReduxKtor;
        if (j2 != 9205357640488583168L) {
            this.CatchingFishRoomDatabase = false;
            catchingFishMVPFluxHilt.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            catchingFishMVPFluxHilt.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                catchingFishMVPFluxHilt.resetPivot();
                return;
            }
            this.CatchingFishRoomDatabase = true;
            catchingFishMVPFluxHilt.setPivotX(((int) (this.CatchingFishFragmentHandler >> 32)) / 2.0f);
            catchingFishMVPFluxHilt.setPivotY(((int) (this.CatchingFishFragmentHandler & 4294967295L)) / 2.0f);
        }
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishCardViewRealm(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.CatchingFishCoroutineFlow = j;
            this.CatchingFishReduxKtor.setOutlineSpotShadowColor(CatchingFishFirebaseDagger.CatchingFishStateFlow(j));
        }
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final Matrix CatchingFishCardViewView() {
        return this.CatchingFishReduxKtor.getMatrix();
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishCloudMessaging(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.CatchingFishJetpackCompose = j;
            this.CatchingFishReduxKtor.setOutlineAmbientShadowColor(CatchingFishFirebaseDagger.CatchingFishStateFlow(j));
        }
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishCoroutine() {
        this.CatchingFishReduxKtor.setRotationX(0.0f);
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishCoroutineFlow(boolean z) {
        boolean z2 = false;
        this.CatchingFishOkHttp = z && !this.CatchingFishEspressoTesting;
        this.CatchingFishCloudMessaging = true;
        if (z && this.CatchingFishEspressoTesting) {
            z2 = true;
        }
        this.CatchingFishReduxKtor.setClipToOutline(z2);
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishCustomView(int i, int i2, long j) {
        boolean CatchingFish = CatchingFishRobolectricHilt.CatchingFish(this.CatchingFishFragmentHandler, j);
        CatchingFishMVPFluxHilt catchingFishMVPFluxHilt = this.CatchingFishReduxKtor;
        if (CatchingFish) {
            int i3 = this.CatchingFishViewModelFAB;
            if (i3 != i) {
                catchingFishMVPFluxHilt.offsetLeftAndRight(i - i3);
            }
            int i4 = this.CatchingFishLayout;
            if (i4 != i2) {
                catchingFishMVPFluxHilt.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.CatchingFishOkHttp || catchingFishMVPFluxHilt.getClipToOutline()) {
                this.CatchingFishCloudMessaging = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            catchingFishMVPFluxHilt.layout(i, i2, i + i5, i2 + i6);
            this.CatchingFishFragmentHandler = j;
            if (this.CatchingFishRoomDatabase) {
                catchingFishMVPFluxHilt.setPivotX(i5 / 2.0f);
                catchingFishMVPFluxHilt.setPivotY(i6 / 2.0f);
            }
        }
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishLayout = i2;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final int CatchingFishDagger() {
        return this.CatchingFishUnitTesting;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final int CatchingFishDaggerHiltFAB() {
        return this.CatchingFishAnimationMockk;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final float CatchingFishDaggerWebsocket() {
        return this.CatchingFishNavigation;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final float CatchingFishEspressoMockk() {
        return this.CatchingFishDaggerHiltFAB;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishEspressoTesting(Outline outline, long j) {
        CatchingFishMVPFluxHilt catchingFishMVPFluxHilt = this.CatchingFishReduxKtor;
        catchingFishMVPFluxHilt.CatchingFishViewModelFAB = outline;
        catchingFishMVPFluxHilt.invalidateOutline();
        if ((this.CatchingFishOkHttp || catchingFishMVPFluxHilt.getClipToOutline()) && outline != null) {
            catchingFishMVPFluxHilt.setClipToOutline(true);
            if (this.CatchingFishOkHttp) {
                this.CatchingFishOkHttp = false;
                this.CatchingFishCloudMessaging = true;
            }
        }
        this.CatchingFishEspressoTesting = outline != null;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final float CatchingFishFragmentFactory() {
        return 0.0f;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final long CatchingFishFragmentHandler() {
        return this.CatchingFishCoroutineFlow;
    }

    public final void CatchingFishGradleManifest() {
        int i = this.CatchingFishAnimationMockk;
        if (i != 1 && this.CatchingFishUnitTesting == 3) {
            CatchingFishPayPalLiveData(i);
        } else {
            CatchingFishPayPalLiveData(1);
        }
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishGsonAppCompat(int i) {
        this.CatchingFishAnimationMockk = i;
        CatchingFishGradleManifest();
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final long CatchingFishHandler() {
        return this.CatchingFishJetpackCompose;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishJetpackCompose() {
        this.CatchingFishReduxKtor.setTranslationX(0.0f);
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final float CatchingFishJobScheduler() {
        return 0.0f;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishLayout() {
        this.CatchingFishReduxKtor.setRotationY(0.0f);
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishMVPRobolectric(CatchingFishOkHttpFlux catchingFishOkHttpFlux, CatchingFishGradleMVPKtor catchingFishGradleMVPKtor, CatchingFishHiltMVI catchingFishHiltMVI, CatchingFishMVVM catchingFishMVVM) {
        CatchingFishMVPFluxHilt catchingFishMVPFluxHilt = this.CatchingFishReduxKtor;
        ViewParent parent = catchingFishMVPFluxHilt.getParent();
        CatchingFishWidgetAppCompat catchingFishWidgetAppCompat = this.CatchingFishSnackbar;
        if (parent == null) {
            catchingFishWidgetAppCompat.addView(catchingFishMVPFluxHilt);
        }
        catchingFishMVPFluxHilt.CatchingFishFragmentHandler = catchingFishOkHttpFlux;
        catchingFishMVPFluxHilt.CatchingFishCloudMessaging = catchingFishGradleMVPKtor;
        catchingFishMVPFluxHilt.CatchingFishEspressoTesting = catchingFishMVVM;
        catchingFishMVPFluxHilt.CatchingFishOkHttp = catchingFishHiltMVI;
        if (catchingFishMVPFluxHilt.isAttachedToWindow()) {
            catchingFishMVPFluxHilt.setVisibility(4);
            catchingFishMVPFluxHilt.setVisibility(0);
            try {
                CatchingFishManifestPayPal catchingFishManifestPayPal = this.CatchingFishCoroutine;
                CatchingFishIntentDagger catchingFishIntentDagger = CatchingFishSpannableWidget;
                CatchingFishRoom catchingFishRoom = catchingFishManifestPayPal.CatchingFishParcelableFAB;
                Canvas canvas = catchingFishRoom.CatchingFishParcelableFAB;
                catchingFishRoom.CatchingFishParcelableFAB = catchingFishIntentDagger;
                catchingFishWidgetAppCompat.CatchingFishParcelableFAB(catchingFishRoom, catchingFishMVPFluxHilt, catchingFishMVPFluxHilt.getDrawingTime());
                catchingFishManifestPayPal.CatchingFishParcelableFAB.CatchingFishParcelableFAB = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishMutableLiveData(float f) {
        this.CatchingFishReduxKtor.setCameraDistance(f * this.CatchingFishDaggerWebsocket.getDisplayMetrics().densityDpi);
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishNavigation() {
        this.CatchingFishReduxKtor.setElevation(0.0f);
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishOkHttp() {
        Paint paint = this.CatchingFishViewModelScope;
        if (paint == null) {
            paint = new Paint();
            this.CatchingFishViewModelScope = paint;
        }
        paint.setColorFilter(null);
        CatchingFishGradleManifest();
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final float CatchingFishParcelableFAB() {
        return this.CatchingFishStateLiveData;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final CatchingFishFluxIntent CatchingFishParcelableFlux() {
        return null;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishPayPal(float f) {
        this.CatchingFish = f;
        this.CatchingFishReduxKtor.setScaleY(f);
    }

    public final void CatchingFishPayPalLiveData(int i) {
        CatchingFishMVPFluxHilt catchingFishMVPFluxHilt = this.CatchingFishReduxKtor;
        boolean z = true;
        if (i == 1) {
            catchingFishMVPFluxHilt.setLayerType(2, this.CatchingFishViewModelScope);
        } else if (i == 2) {
            catchingFishMVPFluxHilt.setLayerType(0, this.CatchingFishViewModelScope);
            z = false;
        } else {
            catchingFishMVPFluxHilt.setLayerType(0, this.CatchingFishViewModelScope);
        }
        catchingFishMVPFluxHilt.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishReduxKtor(float f) {
        this.CatchingFishStateLiveData = f;
        this.CatchingFishReduxKtor.setAlpha(f);
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishRoomDatabase() {
        this.CatchingFishSnackbar.removeViewInLayout(this.CatchingFishReduxKtor);
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final float CatchingFishSensorManager() {
        return this.CatchingFish;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishSnackbar(CatchingFishOkHttpHandler catchingFishOkHttpHandler) {
        Rect rect;
        boolean z = this.CatchingFishCloudMessaging;
        CatchingFishMVPFluxHilt catchingFishMVPFluxHilt = this.CatchingFishReduxKtor;
        if (z) {
            if ((this.CatchingFishOkHttp || catchingFishMVPFluxHilt.getClipToOutline()) && !this.CatchingFishEspressoTesting) {
                rect = this.CatchingFishWorkManager;
                rect.left = 0;
                rect.top = 0;
                rect.right = catchingFishMVPFluxHilt.getWidth();
                rect.bottom = catchingFishMVPFluxHilt.getHeight();
            } else {
                rect = null;
            }
            catchingFishMVPFluxHilt.setClipBounds(rect);
        }
        if (CatchingFishLayout.CatchingFishParcelableFAB(catchingFishOkHttpHandler).isHardwareAccelerated()) {
            this.CatchingFishSnackbar.CatchingFishParcelableFAB(catchingFishOkHttpHandler, catchingFishMVPFluxHilt, catchingFishMVPFluxHilt.getDrawingTime());
        }
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final float CatchingFishSpannableWidget() {
        return 0.0f;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final float CatchingFishStateLiveData() {
        return this.CatchingFishReduxKtor.getCameraDistance() / this.CatchingFishDaggerWebsocket.getDisplayMetrics().densityDpi;
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishUnitTesting(float f) {
        this.CatchingFishNavigation = f;
        this.CatchingFishReduxKtor.setScaleX(f);
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishViewModelFAB(float f) {
        this.CatchingFishDaggerHiltFAB = f;
        this.CatchingFishReduxKtor.setRotation(f);
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final void CatchingFishViewModelScope() {
        this.CatchingFishReduxKtor.setTranslationY(0.0f);
    }

    @Override // kotlin.text.CatchingFishFirebaseRealm
    public final float CatchingFishWorkManager() {
        return 0.0f;
    }
}
