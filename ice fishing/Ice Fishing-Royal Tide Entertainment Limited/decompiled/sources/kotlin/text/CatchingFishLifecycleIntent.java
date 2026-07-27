package kotlin.text;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishLifecycleIntent implements View.OnTouchListener {
    public static final int CatchingFishCoroutineFlow = ViewConfiguration.getTapTimeout();
    public boolean CatchingFish;
    public boolean CatchingFishAnimationMockk;
    public final int CatchingFishCloudMessaging;
    public final AccelerateInterpolator CatchingFishDaggerWebsocket;
    public final float[] CatchingFishEspressoTesting;
    public final int CatchingFishFragmentHandler;
    public final CatchingFishCameraXOkHttp CatchingFishJetpackCompose;
    public final float[] CatchingFishLayout;
    public boolean CatchingFishNavigation;
    public final float[] CatchingFishOkHttp;
    public final CatchingFishJUnitDaggerHilt CatchingFishReduxKtor;
    public boolean CatchingFishRoomDatabase;
    public boolean CatchingFishStateLiveData;
    public final float[] CatchingFishUnitTesting;
    public final float[] CatchingFishViewModelFAB;
    public CatchingFishGsonRealm CatchingFishViewModelScope;
    public final CatchingFishCameraXOkHttp CatchingFishWorkManager;

    public CatchingFishLifecycleIntent(CatchingFishCameraXOkHttp catchingFishCameraXOkHttp) {
        CatchingFishJUnitDaggerHilt catchingFishJUnitDaggerHilt = new CatchingFishJUnitDaggerHilt();
        catchingFishJUnitDaggerHilt.CatchingFishDaggerWebsocket = Long.MIN_VALUE;
        catchingFishJUnitDaggerHilt.CatchingFishViewModelScope = -1L;
        catchingFishJUnitDaggerHilt.CatchingFishWorkManager = 0L;
        this.CatchingFishReduxKtor = catchingFishJUnitDaggerHilt;
        this.CatchingFishDaggerWebsocket = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.CatchingFishViewModelFAB = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.CatchingFishLayout = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.CatchingFishEspressoTesting = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.CatchingFishOkHttp = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.CatchingFishUnitTesting = fArr5;
        this.CatchingFishWorkManager = catchingFishCameraXOkHttp;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.CatchingFishFragmentHandler = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.CatchingFishCloudMessaging = CatchingFishCoroutineFlow;
        catchingFishJUnitDaggerHilt.CatchingFishParcelableFAB = 500;
        catchingFishJUnitDaggerHilt.CatchingFishSnackbar = 500;
        this.CatchingFishJetpackCompose = catchingFishCameraXOkHttp;
    }

    public static float CatchingFishSnackbar(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public final float CatchingFishCoroutine(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.CatchingFishFragmentHandler;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.CatchingFishNavigation && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final boolean CatchingFishDaggerWebsocket() {
        CatchingFishCameraXOkHttp catchingFishCameraXOkHttp;
        int count;
        CatchingFishJUnitDaggerHilt catchingFishJUnitDaggerHilt = this.CatchingFishReduxKtor;
        float f = catchingFishJUnitDaggerHilt.CatchingFishReduxKtor;
        int abs = (int) (f / Math.abs(f));
        Math.abs(catchingFishJUnitDaggerHilt.CatchingFishCoroutine);
        if (abs != 0 && (count = (catchingFishCameraXOkHttp = this.CatchingFishJetpackCompose).getCount()) != 0) {
            int childCount = catchingFishCameraXOkHttp.getChildCount();
            int firstVisiblePosition = catchingFishCameraXOkHttp.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && catchingFishCameraXOkHttp.getChildAt(0).getTop() >= 0)) : !(i >= count && catchingFishCameraXOkHttp.getChildAt(childCount - 1).getBottom() <= catchingFishCameraXOkHttp.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float CatchingFishParcelableFAB(int i, float f, float f2, float f3) {
        float f4;
        float interpolation;
        float CatchingFishSnackbar = CatchingFishSnackbar(this.CatchingFishViewModelFAB[i] * f2, 0.0f, this.CatchingFishLayout[i]);
        float CatchingFishCoroutine = CatchingFishCoroutine(f2 - f, CatchingFishSnackbar) - CatchingFishCoroutine(f, CatchingFishSnackbar);
        AccelerateInterpolator accelerateInterpolator = this.CatchingFishDaggerWebsocket;
        if (CatchingFishCoroutine < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-CatchingFishCoroutine);
        } else {
            if (CatchingFishCoroutine <= 0.0f) {
                f4 = 0.0f;
                if (f4 != 0.0f) {
                    return 0.0f;
                }
                float f5 = this.CatchingFishEspressoTesting[i];
                float f6 = this.CatchingFishOkHttp[i];
                float f7 = this.CatchingFishUnitTesting[i];
                float f8 = f5 * f3;
                return f4 > 0.0f ? CatchingFishSnackbar(f4 * f8, f6, f7) : -CatchingFishSnackbar((-f4) * f8, f6, f7);
            }
            interpolation = accelerateInterpolator.getInterpolation(CatchingFishCoroutine);
        }
        f4 = CatchingFishSnackbar(interpolation, -1.0f, 1.0f);
        if (f4 != 0.0f) {
        }
    }

    public final void CatchingFishReduxKtor() {
        int i = 0;
        if (this.CatchingFishStateLiveData) {
            this.CatchingFishNavigation = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        CatchingFishJUnitDaggerHilt catchingFishJUnitDaggerHilt = this.CatchingFishReduxKtor;
        int i2 = (int) (currentAnimationTimeMillis - catchingFishJUnitDaggerHilt.CatchingFishDaggerWebsocket);
        int i3 = catchingFishJUnitDaggerHilt.CatchingFishSnackbar;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        catchingFishJUnitDaggerHilt.CatchingFishLayout = i;
        catchingFishJUnitDaggerHilt.CatchingFishViewModelFAB = catchingFishJUnitDaggerHilt.CatchingFishParcelableFAB(currentAnimationTimeMillis);
        catchingFishJUnitDaggerHilt.CatchingFishViewModelScope = currentAnimationTimeMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.CatchingFish) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = 3;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                CatchingFishReduxKtor();
                return false;
            }
            this.CatchingFishRoomDatabase = true;
            this.CatchingFishAnimationMockk = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            CatchingFishCameraXOkHttp catchingFishCameraXOkHttp = this.CatchingFishWorkManager;
            float CatchingFishParcelableFAB = CatchingFishParcelableFAB(0, x, width, catchingFishCameraXOkHttp.getWidth());
            float CatchingFishParcelableFAB2 = CatchingFishParcelableFAB(1, motionEvent.getY(), view.getHeight(), catchingFishCameraXOkHttp.getHeight());
            CatchingFishJUnitDaggerHilt catchingFishJUnitDaggerHilt = this.CatchingFishReduxKtor;
            catchingFishJUnitDaggerHilt.CatchingFishCoroutine = CatchingFishParcelableFAB;
            catchingFishJUnitDaggerHilt.CatchingFishReduxKtor = CatchingFishParcelableFAB2;
            if (!this.CatchingFishNavigation && CatchingFishDaggerWebsocket()) {
                if (this.CatchingFishViewModelScope == null) {
                    this.CatchingFishViewModelScope = new CatchingFishGsonRealm(i2, this);
                }
                this.CatchingFishNavigation = true;
                this.CatchingFishStateLiveData = true;
                if (this.CatchingFishAnimationMockk || (i = this.CatchingFishCloudMessaging) <= 0) {
                    this.CatchingFishViewModelScope.run();
                } else {
                    CatchingFishGsonRealm catchingFishGsonRealm = this.CatchingFishViewModelScope;
                    long j = i;
                    WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    catchingFishCameraXOkHttp.postOnAnimationDelayed(catchingFishGsonRealm, j);
                }
                this.CatchingFishAnimationMockk = true;
            }
        }
        return false;
    }
}
