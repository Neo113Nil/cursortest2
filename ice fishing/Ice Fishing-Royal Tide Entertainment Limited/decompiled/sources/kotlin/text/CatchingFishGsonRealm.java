package kotlin.text;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.InstallReferrer;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.scheduler.TimerCycle;
import com.adjust.sdk.scheduler.TimerOnce;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishGsonRealm implements Runnable {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishGsonRealm(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        ILogger iLogger;
        String str;
        Runnable runnable;
        ILogger iLogger2;
        String str2;
        Runnable runnable2;
        CatchingFishToast catchingFishToast;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFluxRedux catchingFishFluxRedux = (CatchingFishFluxRedux) this.CatchingFishDaggerWebsocket;
                OnAdidReadListener onAdidReadListener = catchingFishFluxRedux.CatchingFishDaggerWebsocket.getOnAdidReadListener();
                if (onAdidReadListener != null) {
                    onAdidReadListener.onAdidRead(null);
                }
                catchingFishFluxRedux.CatchingFishDaggerWebsocket.setOnAdidReadListener(null);
                return;
            case 1:
                CatchingFishFluxRedux catchingFishFluxRedux2 = (CatchingFishFluxRedux) this.CatchingFishDaggerWebsocket;
                OnAttributionReadListener onAttributionReadListener = catchingFishFluxRedux2.CatchingFishDaggerWebsocket.getOnAttributionReadListener();
                if (onAttributionReadListener != null) {
                    onAttributionReadListener.onAttributionRead(null);
                }
                catchingFishFluxRedux2.CatchingFishDaggerWebsocket.setOnAttributionReadListener(null);
                return;
            case 2:
                CatchingFishGradleCameraX catchingFishGradleCameraX = (CatchingFishGradleCameraX) this.CatchingFishDaggerWebsocket;
                catchingFishGradleCameraX.removeCallbacks(this);
                MotionEvent motionEvent = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                if (motionEvent != null) {
                    boolean z2 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z2) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i2 = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    CatchingFishGradleCameraX catchingFishGradleCameraX2 = (CatchingFishGradleCameraX) this.CatchingFishDaggerWebsocket;
                    catchingFishGradleCameraX2.CatchingFishJobScheduler(motionEvent, i2, catchingFishGradleCameraX2.CatchingFishStateFlowIntent, false);
                    return;
                }
                return;
            case 3:
                CatchingFishLifecycleIntent catchingFishLifecycleIntent = (CatchingFishLifecycleIntent) this.CatchingFishDaggerWebsocket;
                CatchingFishCameraXOkHttp catchingFishCameraXOkHttp = catchingFishLifecycleIntent.CatchingFishWorkManager;
                CatchingFishJUnitDaggerHilt catchingFishJUnitDaggerHilt = catchingFishLifecycleIntent.CatchingFishReduxKtor;
                if (catchingFishLifecycleIntent.CatchingFishNavigation) {
                    if (catchingFishLifecycleIntent.CatchingFishStateLiveData) {
                        catchingFishLifecycleIntent.CatchingFishStateLiveData = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        catchingFishJUnitDaggerHilt.CatchingFishDaggerWebsocket = currentAnimationTimeMillis;
                        catchingFishJUnitDaggerHilt.CatchingFishViewModelScope = -1L;
                        catchingFishJUnitDaggerHilt.CatchingFishWorkManager = currentAnimationTimeMillis;
                        catchingFishJUnitDaggerHilt.CatchingFishViewModelFAB = 0.5f;
                    }
                    if ((catchingFishJUnitDaggerHilt.CatchingFishViewModelScope > 0 && AnimationUtils.currentAnimationTimeMillis() > catchingFishJUnitDaggerHilt.CatchingFishViewModelScope + catchingFishJUnitDaggerHilt.CatchingFishLayout) || !catchingFishLifecycleIntent.CatchingFishDaggerWebsocket()) {
                        catchingFishLifecycleIntent.CatchingFishNavigation = false;
                        return;
                    }
                    if (catchingFishLifecycleIntent.CatchingFishRoomDatabase) {
                        catchingFishLifecycleIntent.CatchingFishRoomDatabase = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        catchingFishCameraXOkHttp.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (catchingFishJUnitDaggerHilt.CatchingFishWorkManager == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float CatchingFishParcelableFAB = catchingFishJUnitDaggerHilt.CatchingFishParcelableFAB(currentAnimationTimeMillis2);
                    long j = currentAnimationTimeMillis2 - catchingFishJUnitDaggerHilt.CatchingFishWorkManager;
                    catchingFishJUnitDaggerHilt.CatchingFishWorkManager = currentAnimationTimeMillis2;
                    catchingFishLifecycleIntent.CatchingFishJetpackCompose.scrollListBy((int) (j * ((CatchingFishParcelableFAB * 4.0f) + ((-4.0f) * CatchingFishParcelableFAB * CatchingFishParcelableFAB)) * catchingFishJUnitDaggerHilt.CatchingFishReduxKtor));
                    WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    catchingFishCameraXOkHttp.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                CatchingFishFluxGraphQL catchingFishFluxGraphQL = (CatchingFishFluxGraphQL) this.CatchingFishDaggerWebsocket;
                catchingFishFluxGraphQL.CatchingFishCoroutine = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) catchingFishFluxGraphQL.CatchingFishDaggerWebsocket;
                CatchingFishCameraXHandler catchingFishCameraXHandler = bottomSheetBehavior.CatchingFishGradleManifest;
                if (catchingFishCameraXHandler != null && catchingFishCameraXHandler.CatchingFishWorkManager()) {
                    catchingFishFluxGraphQL.CatchingFishParcelableFAB(catchingFishFluxGraphQL.CatchingFishSnackbar);
                    return;
                } else {
                    if (bottomSheetBehavior.CatchingFishPayPalLiveData == 2) {
                        bottomSheetBehavior.CatchingFishMVPRobolectric(catchingFishFluxGraphQL.CatchingFishSnackbar);
                        return;
                    }
                    return;
                }
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                CatchingFishMVIHilt catchingFishMVIHilt = (CatchingFishMVIHilt) this.CatchingFishDaggerWebsocket;
                catchingFishMVIHilt.CatchingFishSnackbar.endViewTransition(catchingFishMVIHilt.CatchingFishCoroutine);
                catchingFishMVIHilt.CatchingFishReduxKtor.CatchingFishCoroutine();
                return;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                CatchingFishPayPalMVP catchingFishPayPalMVP = (CatchingFishPayPalMVP) this.CatchingFishDaggerWebsocket;
                catchingFishPayPalMVP.CatchingFishAnimation.onDismiss(catchingFishPayPalMVP.CatchingFishDaggerMVVM);
                return;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                CatchingFishCameraXOkHttp catchingFishCameraXOkHttp2 = (CatchingFishCameraXOkHttp) this.CatchingFishDaggerWebsocket;
                catchingFishCameraXOkHttp2.CatchingFishAnimationMockk = null;
                catchingFishCameraXOkHttp2.drawableStateChanged();
                return;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                CatchingFishGsonNavigation catchingFishGsonNavigation = (CatchingFishGsonNavigation) this.CatchingFishDaggerWebsocket;
                ValueAnimator valueAnimator = catchingFishGsonNavigation.CatchingFishCardViewRealm;
                int i3 = catchingFishGsonNavigation.CatchingFishPayPal;
                if (i3 != 1) {
                    i = 2;
                    if (i3 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                catchingFishGsonNavigation.CatchingFishPayPal = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 9:
                ((CatchingFishToastSharedFlow) this.CatchingFishDaggerWebsocket).CatchingFishGsonAppCompat(true);
                return;
            case 10:
                ((InstallReferrer) this.CatchingFishDaggerWebsocket).startConnection();
                return;
            case 11:
                RecyclerView recyclerView = (RecyclerView) this.CatchingFishDaggerWebsocket;
                CatchingFishFluxAppCompat catchingFishFluxAppCompat = recyclerView.CatchingFishCameraXIntent;
                if (catchingFishFluxAppCompat != null) {
                    CatchingFishGsonUnitTesting catchingFishGsonUnitTesting = (CatchingFishGsonUnitTesting) catchingFishFluxAppCompat;
                    long j2 = catchingFishGsonUnitTesting.CatchingFishReduxKtor;
                    ArrayList arrayList = catchingFishGsonUnitTesting.CatchingFishViewModelFAB;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = catchingFishGsonUnitTesting.CatchingFishFragmentHandler;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = catchingFishGsonUnitTesting.CatchingFishCloudMessaging;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = catchingFishGsonUnitTesting.CatchingFishLayout;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            CatchingFishPayPalCardView catchingFishPayPalCardView = (CatchingFishPayPalCardView) obj;
                            View view = catchingFishPayPalCardView.CatchingFishParcelableFAB;
                            boolean z3 = isEmpty4;
                            ViewPropertyAnimator animate = view.animate();
                            catchingFishGsonUnitTesting.CatchingFishRoomDatabase.add(catchingFishPayPalCardView);
                            animate.setDuration(j2).alpha(0.0f).setListener(new CatchingFishToastAndroidX(catchingFishGsonUnitTesting, catchingFishPayPalCardView, animate, view)).start();
                            isEmpty4 = z3;
                            size = size;
                            arrayList = arrayList;
                        }
                        boolean z4 = isEmpty4;
                        arrayList.clear();
                        if (!isEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            catchingFishGsonUnitTesting.CatchingFishOkHttp.add(arrayList5);
                            arrayList2.clear();
                            CatchingFishGradleAnimation catchingFishGradleAnimation = new CatchingFishGradleAnimation(catchingFishGsonUnitTesting, arrayList5, 0);
                            if (isEmpty) {
                                catchingFishGradleAnimation.run();
                            } else {
                                View view2 = ((CatchingFishMVIFlux) arrayList5.get(0)).CatchingFishParcelableFAB.CatchingFishParcelableFAB;
                                WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                                view2.postOnAnimationDelayed(catchingFishGradleAnimation, j2);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            catchingFishGsonUnitTesting.CatchingFishUnitTesting.add(arrayList6);
                            arrayList3.clear();
                            CatchingFishGradleAnimation catchingFishGradleAnimation2 = new CatchingFishGradleAnimation(catchingFishGsonUnitTesting, arrayList6, 1);
                            if (isEmpty) {
                                catchingFishGradleAnimation2.run();
                            } else {
                                View view3 = ((CatchingFishMVPGradle) arrayList6.get(0)).CatchingFishParcelableFAB.CatchingFishParcelableFAB;
                                WeakHashMap weakHashMap3 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                                view3.postOnAnimationDelayed(catchingFishGradleAnimation2, j2);
                            }
                        }
                        if (!z4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            catchingFishGsonUnitTesting.CatchingFishEspressoTesting.add(arrayList7);
                            arrayList4.clear();
                            CatchingFishGradleAnimation catchingFishGradleAnimation3 = new CatchingFishGradleAnimation(catchingFishGsonUnitTesting, arrayList7, 2);
                            if (!isEmpty || !isEmpty2 || !isEmpty3) {
                                if (isEmpty) {
                                    j2 = 0;
                                }
                                long max = Math.max(!isEmpty2 ? catchingFishGsonUnitTesting.CatchingFishDaggerWebsocket : 0L, !isEmpty3 ? catchingFishGsonUnitTesting.CatchingFishWorkManager : 0L) + j2;
                                z = false;
                                View view4 = ((CatchingFishPayPalCardView) arrayList7.get(0)).CatchingFishParcelableFAB;
                                WeakHashMap weakHashMap4 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                                view4.postOnAnimationDelayed(catchingFishGradleAnimation3, max);
                                recyclerView.CatchingFishFirebase = z;
                                return;
                            }
                            catchingFishGradleAnimation3.run();
                        }
                        z = false;
                        recyclerView.CatchingFishFirebase = z;
                        return;
                    }
                }
                z = false;
                recyclerView.CatchingFishFirebase = z;
                return;
            case 12:
                ((SdkClickHandler) this.CatchingFishDaggerWebsocket).sendNextSdkClickI();
                return;
            case 13:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.CatchingFishDaggerWebsocket;
                if (searchView$SearchAutoComplete.CatchingFishLayout) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.CatchingFishLayout = false;
                    return;
                }
                return;
            case 14:
                ((StaggeredGridLayoutManager) this.CatchingFishDaggerWebsocket).CatchingFishCameraX();
                return;
            case 15:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.CatchingFishDaggerWebsocket).CatchingFishWorkManager.CatchingFishFragmentHandler;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 16:
                TimerCycle timerCycle = (TimerCycle) this.CatchingFishDaggerWebsocket;
                iLogger = timerCycle.logger;
                str = timerCycle.name;
                iLogger.verbose("%s fired", str);
                runnable = timerCycle.command;
                runnable.run();
                return;
            case 17:
                TimerOnce timerOnce = (TimerOnce) this.CatchingFishDaggerWebsocket;
                iLogger2 = timerOnce.logger;
                str2 = timerOnce.name;
                iLogger2.verbose("%s fired", str2);
                runnable2 = timerOnce.command;
                runnable2.run();
                timerOnce.waitingTask = null;
                return;
            case 18:
                ActionMenuView actionMenuView = ((Toolbar) this.CatchingFishDaggerWebsocket).CatchingFishReduxKtor;
                if (actionMenuView == null || (catchingFishToast = actionMenuView.CatchingFishSpannableWidget) == null) {
                    return;
                }
                catchingFishToast.CatchingFishEspressoTesting();
                return;
            case 19:
                ((CatchingFishCameraXHandler) this.CatchingFishDaggerWebsocket).CatchingFishOkHttp(0);
                return;
            case 20:
                ((CatchingFishAdMobDaggerMVP) this.CatchingFishDaggerWebsocket).CatchingFishSnackbar();
                return;
            case 21:
                CatchingFishAdMobDaggerMVP catchingFishAdMobDaggerMVP = (CatchingFishAdMobDaggerMVP) ((CatchingFishEspressoPayPal) this.CatchingFishDaggerWebsocket).CatchingFishDaggerWebsocket;
                ((com.google.android.gms.common.internal.CatchingFishPagingLibrary) catchingFishAdMobDaggerMVP.CatchingFishOkHttp).CatchingFishDaggerWebsocket(catchingFishAdMobDaggerMVP.CatchingFishOkHttp.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 22:
                ((CatchingFishRobolectricMVI) this.CatchingFishDaggerWebsocket).CatchingFish.CatchingFishSnackbar(new ConnectionResult(4, null, null));
                return;
            case 23:
                throw null;
            case 24:
                CatchingFishFluxMockk catchingFishFluxMockk = (CatchingFishFluxMockk) this.CatchingFishDaggerWebsocket;
                synchronized (catchingFishFluxMockk.CatchingFishParcelableFAB) {
                    try {
                        if (catchingFishFluxMockk.CatchingFishSnackbar()) {
                            String.valueOf(catchingFishFluxMockk.CatchingFishFragmentHandler).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                            catchingFishFluxMockk.CatchingFishReduxKtor();
                            if (catchingFishFluxMockk.CatchingFishSnackbar()) {
                                catchingFishFluxMockk.CatchingFishCoroutine = 1;
                                catchingFishFluxMockk.CatchingFishDaggerWebsocket();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 25:
                ((CatchingFishAndroidXPayPal) this.CatchingFishDaggerWebsocket).CatchingFishSnackbar(new IOException("TIMEOUT"));
                return;
            default:
                CatchingFishEspressoContext catchingFishEspressoContext = (CatchingFishEspressoContext) this.CatchingFishDaggerWebsocket;
                synchronized (catchingFishEspressoContext.CatchingFishWorkManager) {
                    try {
                        CatchingFishSpannableFAB catchingFishSpannableFAB = (CatchingFishSpannableFAB) catchingFishEspressoContext.CatchingFishViewModelScope;
                        if (catchingFishSpannableFAB != null) {
                            catchingFishSpannableFAB.CatchingFishParcelableFAB();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public CatchingFishGsonRealm(CatchingFishGsonOkHttpHilt catchingFishGsonOkHttpHilt, CatchingFishRoomManifest catchingFishRoomManifest) {
        this.CatchingFishReduxKtor = 23;
        Objects.requireNonNull(catchingFishGsonOkHttpHilt);
        this.CatchingFishDaggerWebsocket = catchingFishRoomManifest;
    }

    public CatchingFishGsonRealm(CatchingFishRobolectricMVI catchingFishRobolectricMVI) {
        this.CatchingFishReduxKtor = 22;
        Objects.requireNonNull(catchingFishRobolectricMVI);
        this.CatchingFishDaggerWebsocket = catchingFishRobolectricMVI;
    }
}
