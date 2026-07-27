package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.catchingfish.fishcatcherpro.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.text.CatchingFishAndroidX;
import kotlin.text.CatchingFishAppCompat;
import kotlin.text.CatchingFishBundleContext;
import kotlin.text.CatchingFishCameraXHandler;
import kotlin.text.CatchingFishCardViewGradle;
import kotlin.text.CatchingFishContextGraphQL;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishFluxGraphQL;
import kotlin.text.CatchingFishFragmentMVVM;
import kotlin.text.CatchingFishGlideFlux;
import kotlin.text.CatchingFishHiltLayout;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishJUnitToastKtor;
import kotlin.text.CatchingFishMVPEspressoRoom;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishMVPPayPalOkHttp;
import kotlin.text.CatchingFishMVPView;
import kotlin.text.CatchingFishMVVMMoshi;
import kotlin.text.CatchingFishRoomManifest;
import kotlin.text.CatchingFishServiceIntent;
import kotlin.text.CatchingFishSharedFlowToast;
import kotlin.text.CatchingFishSnackbarPicasso;
import kotlin.text.CatchingFishStripeAPIRealm;
import kotlin.text.CatchingFishViewModelIntent;
import kotlin.text.CatchingFishWebSocketToast;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CatchingFishJUnitToastKtor {
    public final boolean CatchingFish;
    public int CatchingFishAndroidX;
    public WeakReference CatchingFishAnimation;
    public final boolean CatchingFishAnimationMockk;
    public int CatchingFishAppCompat;
    public final boolean CatchingFishCameraXIntent;
    public boolean CatchingFishCardViewRealm;
    public final ValueAnimator CatchingFishCardViewView;
    public final int CatchingFishCloudMessaging;
    public final float CatchingFishCoroutine;
    public final boolean CatchingFishCoroutineFlow;
    public int CatchingFishCustomView;
    public final SparseIntArray CatchingFishCustomViewJUnit;
    public final boolean CatchingFishDagger;
    public int CatchingFishDaggerHiltFAB;
    public final CatchingFishMVVMMoshi CatchingFishDaggerMVVM;
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishDataStoreIntent;
    public boolean CatchingFishEspressoMockk;
    public final int CatchingFishEspressoTesting;
    public int CatchingFishFragmentFactory;
    public final ColorStateList CatchingFishFragmentHandler;
    public CatchingFishCameraXHandler CatchingFishGradleManifest;
    public final CatchingFishFragmentMVVM CatchingFishGsonAppCompat;
    public boolean CatchingFishHandler;
    public WeakReference CatchingFishJUnitRealm;
    public final boolean CatchingFishJetpackCompose;
    public int CatchingFishJobScheduler;
    public final CatchingFishContextGraphQL CatchingFishLayout;
    public int CatchingFishLayoutInflater;
    public final int CatchingFishMVPRobolectric;
    public final ArrayList CatchingFishMVVMAppCompat;
    public int CatchingFishMoshiDaggerHilt;
    public boolean CatchingFishMotionLayout;
    public final float CatchingFishMutableLiveData;
    public final boolean CatchingFishNavigation;
    public boolean CatchingFishNavigationGson;
    public int CatchingFishOkHttp;
    public boolean CatchingFishParcelable;
    public final int CatchingFishParcelableFAB;
    public final boolean CatchingFishParcelableFlux;
    public final CatchingFishFluxGraphQL CatchingFishPayPal;
    public int CatchingFishPayPalLiveData;
    public final float CatchingFishPayPalService;
    public final float CatchingFishRecyclerView;
    public HashMap CatchingFishRedux;
    public final int CatchingFishReduxKtor;
    public final boolean CatchingFishRoomDatabase;
    public boolean CatchingFishSensorManager;
    public boolean CatchingFishSnackbar;
    public int CatchingFishSpannableWidget;
    public int CatchingFishStateFlow;
    public final boolean CatchingFishStateLiveData;
    public VelocityTracker CatchingFishStripeAPI;
    public final boolean CatchingFishUnitTesting;
    public final int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public BottomSheetBehavior() {
        this.CatchingFishParcelableFAB = 0;
        this.CatchingFishSnackbar = true;
        this.CatchingFishCloudMessaging = -1;
        this.CatchingFishEspressoTesting = -1;
        this.CatchingFishPayPal = new CatchingFishFluxGraphQL(this);
        this.CatchingFishMutableLiveData = 0.5f;
        this.CatchingFishPayPalService = -1.0f;
        this.CatchingFishDagger = true;
        this.CatchingFishCameraXIntent = true;
        this.CatchingFishPayPalLiveData = 4;
        this.CatchingFishRecyclerView = 0.1f;
        this.CatchingFishMVVMAppCompat = new ArrayList();
        this.CatchingFishAndroidX = -1;
        this.CatchingFishCustomViewJUnit = new SparseIntArray();
        this.CatchingFishDaggerMVVM = new CatchingFishMVVMMoshi(this, 0);
    }

    public static View CatchingFishDaggerHiltFAB(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View CatchingFishDaggerHiltFAB = CatchingFishDaggerHiltFAB(viewGroup.getChildAt(i));
            if (CatchingFishDaggerHiltFAB != null) {
                return CatchingFishDaggerHiltFAB;
            }
        }
        return null;
    }

    public static int CatchingFishSpannableWidget(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float CatchingFish() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f2 = 0.0f;
        if (this.CatchingFishLayout != null && (weakReference = this.CatchingFishJUnitRealm) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.CatchingFishJUnitRealm.get();
            if (CatchingFishCardViewRealm() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                CatchingFishContextGraphQL catchingFishContextGraphQL = this.CatchingFishLayout;
                float[] fArr = catchingFishContextGraphQL.CatchingFishFragmentFactory;
                float CatchingFishParcelableFAB = fArr != null ? fArr[3] : catchingFishContextGraphQL.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(catchingFishContextGraphQL.CatchingFishViewModelScope());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f3 = radius2;
                    if (f3 > 0.0f && CatchingFishParcelableFAB > 0.0f) {
                        f = f3 / CatchingFishParcelableFAB;
                        CatchingFishContextGraphQL catchingFishContextGraphQL2 = this.CatchingFishLayout;
                        float[] fArr2 = catchingFishContextGraphQL2.CatchingFishFragmentFactory;
                        float CatchingFishParcelableFAB2 = fArr2 == null ? fArr2[0] : catchingFishContextGraphQL2.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.CatchingFishWorkManager.CatchingFishParcelableFAB(catchingFishContextGraphQL2.CatchingFishViewModelScope());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f4 = radius;
                            if (f4 > 0.0f && CatchingFishParcelableFAB2 > 0.0f) {
                                f2 = f4 / CatchingFishParcelableFAB2;
                            }
                        }
                        return Math.max(f, f2);
                    }
                }
                f = 0.0f;
                CatchingFishContextGraphQL catchingFishContextGraphQL22 = this.CatchingFishLayout;
                float[] fArr22 = catchingFishContextGraphQL22.CatchingFishFragmentFactory;
                if (fArr22 == null) {
                }
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishAnimationMockk(View view, int i, int i2) {
        this.CatchingFishLayoutInflater = 0;
        this.CatchingFishParcelable = false;
        return (i & 2) != 0;
    }

    public final boolean CatchingFishCardViewRealm() {
        WeakReference weakReference = this.CatchingFishJUnitRealm;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.CatchingFishJUnitRealm.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void CatchingFishCardViewView(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.CatchingFishSensorManager || i != 5) {
            int i2 = (i == 6 && this.CatchingFishSnackbar && CatchingFishGsonAppCompat(i) <= this.CatchingFishCustomView) ? 3 : i;
            WeakReference weakReference = this.CatchingFishJUnitRealm;
            if (weakReference == null || weakReference.get() == null) {
                CatchingFishMVPRobolectric(i);
                return;
            }
            View view = (View) this.CatchingFishJUnitRealm.get();
            CatchingFishServiceIntent catchingFishServiceIntent = new CatchingFishServiceIntent(this, view, i2);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                view.post(catchingFishServiceIntent);
            } else {
                catchingFishServiceIntent.run();
            }
        }
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishCoroutine(CatchingFishMVPView catchingFishMVPView) {
        this.CatchingFishJUnitRealm = null;
        this.CatchingFishGradleManifest = null;
    }

    public final void CatchingFishCoroutineFlow(int i) {
        if (((View) this.CatchingFishJUnitRealm.get()) != null) {
            ArrayList arrayList = this.CatchingFishMVVMAppCompat;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.CatchingFishJobScheduler;
            if (i <= i2 && i2 != CatchingFishParcelableFlux()) {
                CatchingFishParcelableFlux();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean CatchingFishCustomView(View view, float f) {
        if (this.CatchingFishEspressoMockk) {
            return true;
        }
        if (view.getTop() < this.CatchingFishJobScheduler) {
            return false;
        }
        return Math.abs(((f * this.CatchingFishRecyclerView) + ((float) view.getTop())) - ((float) this.CatchingFishJobScheduler)) / ((float) CatchingFishJetpackCompose()) > 0.5f;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishDaggerWebsocket() {
        this.CatchingFishJUnitRealm = null;
        this.CatchingFishGradleManifest = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.CatchingFishUnitTesting(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        CatchingFishMVPRobolectric(2);
        CatchingFishJobScheduler(r4, true);
        r2.CatchingFishPayPal.CatchingFishParcelableFAB(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishFragmentFactory(View view, int i, boolean z) {
        int CatchingFishGsonAppCompat = CatchingFishGsonAppCompat(i);
        CatchingFishCameraXHandler catchingFishCameraXHandler = this.CatchingFishGradleManifest;
        if (catchingFishCameraXHandler != null) {
            if (!z) {
                int left = view.getLeft();
                catchingFishCameraXHandler.CatchingFishNavigation = view;
                catchingFishCameraXHandler.CatchingFishCoroutine = -1;
                boolean CatchingFishViewModelFAB = catchingFishCameraXHandler.CatchingFishViewModelFAB(left, CatchingFishGsonAppCompat, 0, 0);
                if (!CatchingFishViewModelFAB && catchingFishCameraXHandler.CatchingFishParcelableFAB == 0 && catchingFishCameraXHandler.CatchingFishNavigation != null) {
                    catchingFishCameraXHandler.CatchingFishNavigation = null;
                }
            }
        }
        CatchingFishMVPRobolectric(i);
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishFragmentHandler(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.CatchingFishAnimation;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.CatchingFishDagger;
        boolean z2 = this.CatchingFishCameraXIntent;
        if (i2 > 0) {
            if (!this.CatchingFishParcelable && !z2 && view2 == view3 && view2.canScrollVertically(1)) {
                this.CatchingFishHandler = true;
                return;
            }
            if (i4 < CatchingFishParcelableFlux()) {
                int CatchingFishParcelableFlux = top - CatchingFishParcelableFlux();
                iArr[1] = CatchingFishParcelableFlux;
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                view.offsetTopAndBottom(-CatchingFishParcelableFlux);
                CatchingFishMVPRobolectric(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                view.offsetTopAndBottom(-i2);
                CatchingFishMVPRobolectric(1);
            }
        } else if (i2 < 0) {
            boolean canScrollVertically = view2.canScrollVertically(-1);
            if (!this.CatchingFishParcelable && !z2 && view2 == view3 && canScrollVertically) {
                this.CatchingFishHandler = true;
                return;
            }
            if (!canScrollVertically) {
                int i5 = this.CatchingFishJobScheduler;
                if (i4 > i5 && !this.CatchingFishSensorManager) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    WeakHashMap weakHashMap3 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    view.offsetTopAndBottom(-i6);
                    CatchingFishMVPRobolectric(4);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap4 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    view.offsetTopAndBottom(-i2);
                    CatchingFishMVPRobolectric(1);
                }
            }
        }
        CatchingFishCoroutineFlow(view.getTop());
        this.CatchingFishLayoutInflater = i2;
        this.CatchingFishParcelable = true;
        this.CatchingFishHandler = false;
    }

    public final int CatchingFishGsonAppCompat(int i) {
        if (i == 3) {
            return CatchingFishParcelableFlux();
        }
        if (i == 4) {
            return this.CatchingFishJobScheduler;
        }
        if (i == 5) {
            return this.CatchingFishStateFlow;
        }
        if (i == 6) {
            return this.CatchingFishFragmentFactory;
        }
        throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Invalid state to get top offset: ", i));
    }

    public final int CatchingFishJetpackCompose() {
        int i;
        return this.CatchingFishWorkManager ? Math.min(Math.max(this.CatchingFishViewModelScope, this.CatchingFishStateFlow - ((this.CatchingFishDataStoreIntent * 9) / 16)), this.CatchingFishAppCompat) + this.CatchingFishDaggerHiltFAB : (this.CatchingFishUnitTesting || this.CatchingFishAnimationMockk || (i = this.CatchingFishOkHttp) <= 0) ? this.CatchingFishDaggerWebsocket + this.CatchingFishDaggerHiltFAB : Math.max(this.CatchingFishDaggerWebsocket, i + this.CatchingFishViewModelFAB);
    }

    public final void CatchingFishJobScheduler(int i, boolean z) {
        CatchingFishContextGraphQL catchingFishContextGraphQL;
        if (i == 2) {
            return;
        }
        boolean z2 = this.CatchingFishPayPalLiveData == 3 && (this.CatchingFishParcelableFlux || CatchingFishCardViewRealm());
        if (this.CatchingFishCardViewRealm == z2 || (catchingFishContextGraphQL = this.CatchingFishLayout) == null) {
            return;
        }
        this.CatchingFishCardViewRealm = z2;
        ValueAnimator valueAnimator = this.CatchingFishCardViewView;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(catchingFishContextGraphQL.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler, z2 ? CatchingFish() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float CatchingFish = this.CatchingFishCardViewRealm ? CatchingFish() : 1.0f;
        CatchingFishMVPEspressoRoom catchingFishMVPEspressoRoom = catchingFishContextGraphQL.CatchingFishDaggerWebsocket;
        if (catchingFishMVPEspressoRoom.CatchingFishFragmentHandler != CatchingFish) {
            catchingFishMVPEspressoRoom.CatchingFishFragmentHandler = CatchingFish;
            catchingFishContextGraphQL.CatchingFishLayout = true;
            catchingFishContextGraphQL.CatchingFishFragmentHandler = true;
            catchingFishContextGraphQL.invalidateSelf();
        }
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishLayout(View view) {
        WeakReference weakReference = this.CatchingFishAnimation;
        return (weakReference == null || view != weakReference.get() || this.CatchingFishPayPalLiveData == 3 || this.CatchingFishHandler) ? false : true;
    }

    public final void CatchingFishMVPRobolectric(int i) {
        if (this.CatchingFishPayPalLiveData == i) {
            return;
        }
        this.CatchingFishPayPalLiveData = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.CatchingFishSensorManager;
        }
        WeakReference weakReference = this.CatchingFishJUnitRealm;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            CatchingFishPayPalService(true);
        } else if (i == 6 || i == 5 || i == 4) {
            CatchingFishPayPalService(false);
        }
        CatchingFishJobScheduler(i, true);
        ArrayList arrayList = this.CatchingFishMVVMAppCompat;
        if (arrayList.size() <= 0) {
            CatchingFishMutableLiveData();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void CatchingFishMutableLiveData() {
        View view;
        int i;
        WeakReference weakReference = this.CatchingFishJUnitRealm;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        CatchingFishFABCameraX.CatchingFishFragmentHandler(view, 524288);
        CatchingFishFABCameraX.CatchingFishViewModelFAB(view, 0);
        CatchingFishFABCameraX.CatchingFishFragmentHandler(view, 262144);
        CatchingFishFABCameraX.CatchingFishViewModelFAB(view, 0);
        CatchingFishFABCameraX.CatchingFishFragmentHandler(view, 1048576);
        CatchingFishFABCameraX.CatchingFishViewModelFAB(view, 0);
        SparseIntArray sparseIntArray = this.CatchingFishCustomViewJUnit;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            CatchingFishFABCameraX.CatchingFishFragmentHandler(view, i2);
            CatchingFishFABCameraX.CatchingFishViewModelFAB(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.CatchingFishSnackbar && this.CatchingFishPayPalLiveData != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            CatchingFishRoomManifest catchingFishRoomManifest = new CatchingFishRoomManifest(r5, this);
            ArrayList CatchingFishWorkManager = CatchingFishFABCameraX.CatchingFishWorkManager(view);
            int i3 = 0;
            while (true) {
                if (i3 >= CatchingFishWorkManager.size()) {
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        int[] iArr = CatchingFishFABCameraX.CatchingFishReduxKtor;
                        if (i4 >= 32 || i5 != -1) {
                            break;
                        }
                        int i6 = iArr[i4];
                        boolean z = true;
                        for (int i7 = 0; i7 < CatchingFishWorkManager.size(); i7++) {
                            z &= ((CatchingFishBundleContext) CatchingFishWorkManager.get(i7)).CatchingFishParcelableFAB() != i6;
                        }
                        if (z) {
                            i5 = i6;
                        }
                        i4++;
                    }
                    i = i5;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((CatchingFishBundleContext) CatchingFishWorkManager.get(i3)).CatchingFishParcelableFAB).getLabel())) {
                        i = ((CatchingFishBundleContext) CatchingFishWorkManager.get(i3)).CatchingFishParcelableFAB();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                CatchingFishBundleContext catchingFishBundleContext = new CatchingFishBundleContext(null, i, string, catchingFishRoomManifest, null);
                View.AccessibilityDelegate CatchingFishReduxKtor = CatchingFishFABCameraX.CatchingFishReduxKtor(view);
                CatchingFishAndroidX catchingFishAndroidX = CatchingFishReduxKtor == null ? null : CatchingFishReduxKtor instanceof CatchingFishAppCompat ? ((CatchingFishAppCompat) CatchingFishReduxKtor).CatchingFishParcelableFAB : new CatchingFishAndroidX(CatchingFishReduxKtor);
                if (catchingFishAndroidX == null) {
                    catchingFishAndroidX = new CatchingFishAndroidX();
                }
                CatchingFishFABCameraX.CatchingFishOkHttp(view, catchingFishAndroidX);
                CatchingFishFABCameraX.CatchingFishFragmentHandler(view, catchingFishBundleContext.CatchingFishParcelableFAB());
                CatchingFishFABCameraX.CatchingFishWorkManager(view).add(catchingFishBundleContext);
                CatchingFishFABCameraX.CatchingFishViewModelFAB(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.CatchingFishSensorManager) {
            int i8 = 5;
            if (this.CatchingFishPayPalLiveData != 5) {
                CatchingFishFABCameraX.CatchingFishCloudMessaging(view, CatchingFishBundleContext.CatchingFishEspressoTesting, new CatchingFishRoomManifest(i8, this));
            }
        }
        int i9 = this.CatchingFishPayPalLiveData;
        int i10 = 4;
        int i11 = 3;
        if (i9 == 3) {
            CatchingFishFABCameraX.CatchingFishCloudMessaging(view, CatchingFishBundleContext.CatchingFishCloudMessaging, new CatchingFishRoomManifest(this.CatchingFishSnackbar ? 4 : 6, this));
            return;
        }
        if (i9 == 4) {
            CatchingFishFABCameraX.CatchingFishCloudMessaging(view, CatchingFishBundleContext.CatchingFishFragmentHandler, new CatchingFishRoomManifest(this.CatchingFishSnackbar ? 3 : 6, this));
        } else {
            if (i9 != 6) {
                return;
            }
            CatchingFishFABCameraX.CatchingFishCloudMessaging(view, CatchingFishBundleContext.CatchingFishCloudMessaging, new CatchingFishRoomManifest(i10, this));
            CatchingFishFABCameraX.CatchingFishCloudMessaging(view, CatchingFishBundleContext.CatchingFishFragmentHandler, new CatchingFishRoomManifest(i11, this));
        }
    }

    public final void CatchingFishNavigation() {
        int CatchingFishJetpackCompose = CatchingFishJetpackCompose();
        if (this.CatchingFishSnackbar) {
            this.CatchingFishJobScheduler = Math.max(this.CatchingFishStateFlow - CatchingFishJetpackCompose, this.CatchingFishCustomView);
        } else {
            this.CatchingFishJobScheduler = this.CatchingFishStateFlow - CatchingFishJetpackCompose;
        }
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishOkHttp(View view, Parcelable parcelable) {
        CatchingFishHiltLayout catchingFishHiltLayout = (CatchingFishHiltLayout) parcelable;
        int i = this.CatchingFishParcelableFAB;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.CatchingFishDaggerWebsocket = catchingFishHiltLayout.CatchingFishViewModelScope;
            }
            if (i == -1 || (i & 2) == 2) {
                this.CatchingFishSnackbar = catchingFishHiltLayout.CatchingFishViewModelFAB;
            }
            if (i == -1 || (i & 4) == 4) {
                this.CatchingFishSensorManager = catchingFishHiltLayout.CatchingFishLayout;
            }
            if (i == -1 || (i & 8) == 8) {
                this.CatchingFishEspressoMockk = catchingFishHiltLayout.CatchingFishFragmentHandler;
            }
        }
        int i2 = catchingFishHiltLayout.CatchingFishWorkManager;
        if (i2 == 1 || i2 == 2) {
            this.CatchingFishPayPalLiveData = 4;
        } else {
            this.CatchingFishPayPalLiveData = i2;
        }
    }

    public final int CatchingFishParcelableFlux() {
        if (this.CatchingFishSnackbar) {
            return this.CatchingFishCustomView;
        }
        return Math.max(this.CatchingFishMVPRobolectric, this.CatchingFishNavigation ? 0 : this.CatchingFishSpannableWidget);
    }

    public final void CatchingFishPayPal(int i) {
        if (i == -1) {
            if (this.CatchingFishWorkManager) {
                return;
            } else {
                this.CatchingFishWorkManager = true;
            }
        } else {
            if (!this.CatchingFishWorkManager && this.CatchingFishDaggerWebsocket == i) {
                return;
            }
            this.CatchingFishWorkManager = false;
            this.CatchingFishDaggerWebsocket = Math.max(0, i);
        }
        CatchingFishSensorManager();
    }

    public final void CatchingFishPayPalService(boolean z) {
        WeakReference weakReference = this.CatchingFishJUnitRealm;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.CatchingFishRedux != null) {
                    return;
                } else {
                    this.CatchingFishRedux = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.CatchingFishJUnitRealm.get() && z) {
                    this.CatchingFishRedux.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.CatchingFishRedux = null;
        }
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishRoomDatabase(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.CatchingFishPayPalLiveData;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        CatchingFishCameraXHandler catchingFishCameraXHandler = this.CatchingFishGradleManifest;
        if (catchingFishCameraXHandler != null && (this.CatchingFishDagger || i == 1)) {
            catchingFishCameraXHandler.CatchingFishLayout(motionEvent);
        }
        if (actionMasked == 0) {
            this.CatchingFishMoshiDaggerHilt = -1;
            this.CatchingFishAndroidX = -1;
            VelocityTracker velocityTracker = this.CatchingFishStripeAPI;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.CatchingFishStripeAPI = null;
            }
        }
        if (this.CatchingFishStripeAPI == null) {
            this.CatchingFishStripeAPI = VelocityTracker.obtain();
        }
        this.CatchingFishStripeAPI.addMovement(motionEvent);
        if (this.CatchingFishGradleManifest != null && ((this.CatchingFishDagger || this.CatchingFishPayPalLiveData == 1) && actionMasked == 2 && !this.CatchingFishMotionLayout)) {
            float abs = Math.abs(this.CatchingFishAndroidX - motionEvent.getY());
            CatchingFishCameraXHandler catchingFishCameraXHandler2 = this.CatchingFishGradleManifest;
            if (abs > catchingFishCameraXHandler2.CatchingFishSnackbar) {
                catchingFishCameraXHandler2.CatchingFishSnackbar(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.CatchingFishMotionLayout;
    }

    public final void CatchingFishSensorManager() {
        View view;
        if (this.CatchingFishJUnitRealm != null) {
            CatchingFishNavigation();
            if (this.CatchingFishPayPalLiveData != 4 || (view = (View) this.CatchingFishJUnitRealm.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.CatchingFishFragmentFactory) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.CatchingFishCustomView) < java.lang.Math.abs(r5 - r3.CatchingFishJobScheduler)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.CatchingFishJobScheduler)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.CatchingFishJobScheduler)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.CatchingFishFragmentFactory) < java.lang.Math.abs(r5 - r3.CatchingFishJobScheduler)) goto L50;
     */
    @Override // kotlin.text.CatchingFishJUnitToastKtor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishStateLiveData(View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == CatchingFishParcelableFlux()) {
            CatchingFishMVPRobolectric(3);
            return;
        }
        WeakReference weakReference = this.CatchingFishAnimation;
        if (weakReference != null && view2 == weakReference.get() && this.CatchingFishParcelable) {
            if (this.CatchingFishLayoutInflater > 0) {
                if (!this.CatchingFishSnackbar) {
                }
                CatchingFishFragmentFactory(view, i2, false);
                this.CatchingFishParcelable = false;
            }
            if (this.CatchingFishSensorManager) {
                VelocityTracker velocityTracker = this.CatchingFishStripeAPI;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.CatchingFishCoroutine);
                    yVelocity = this.CatchingFishStripeAPI.getYVelocity(this.CatchingFishMoshiDaggerHilt);
                }
                if (CatchingFishCustomView(view, yVelocity)) {
                    i2 = 5;
                    CatchingFishFragmentFactory(view, i2, false);
                    this.CatchingFishParcelable = false;
                }
            }
            if (this.CatchingFishLayoutInflater == 0) {
                int top = view.getTop();
                if (!this.CatchingFishSnackbar) {
                    int i3 = this.CatchingFishFragmentFactory;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.CatchingFishSnackbar) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            CatchingFishFragmentFactory(view, i2, false);
            this.CatchingFishParcelable = false;
        }
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final Parcelable CatchingFishUnitTesting(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new CatchingFishHiltLayout(this);
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishViewModelFAB(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(CatchingFishSpannableWidget(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.CatchingFishCloudMessaging, marginLayoutParams.width), CatchingFishSpannableWidget(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.CatchingFishEspressoTesting, marginLayoutParams.height));
        return true;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishViewModelScope(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.CatchingFishJUnitRealm == null) {
            this.CatchingFishViewModelScope = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.CatchingFishUnitTesting || this.CatchingFishWorkManager) ? false : true;
            if (this.CatchingFishAnimationMockk || this.CatchingFishStateLiveData || this.CatchingFishRoomDatabase || this.CatchingFish || this.CatchingFishJetpackCompose || this.CatchingFishCoroutineFlow || z) {
                CatchingFishStripeAPIRealm catchingFishStripeAPIRealm = new CatchingFishStripeAPIRealm(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                CatchingFishCardViewGradle catchingFishCardViewGradle = new CatchingFishCardViewGradle();
                catchingFishCardViewGradle.CatchingFishParcelableFAB = paddingStart;
                catchingFishCardViewGradle.CatchingFishSnackbar = paddingEnd;
                catchingFishCardViewGradle.CatchingFishCoroutine = paddingBottom;
                CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(22, catchingFishStripeAPIRealm, catchingFishCardViewGradle);
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                CatchingFishGlideFlux.CatchingFishCoroutine(view, catchingFishViewModelIntent);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new CatchingFishMVPPayPalOkHttp());
                }
            }
            CatchingFishFABCameraX.CatchingFishAnimationMockk(view, new CatchingFishWebSocketToast(view));
            this.CatchingFishJUnitRealm = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(context, R.attr.motionDurationMedium2, 300);
            CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(context, R.attr.motionDurationShort3, 150);
            CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            CatchingFishContextGraphQL catchingFishContextGraphQL = this.CatchingFishLayout;
            if (catchingFishContextGraphQL != null) {
                view.setBackground(catchingFishContextGraphQL);
                float f = this.CatchingFishPayPalService;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                catchingFishContextGraphQL.CatchingFishOkHttp(f);
            } else {
                ColorStateList colorStateList = this.CatchingFishFragmentHandler;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            CatchingFishMutableLiveData();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.CatchingFishGradleManifest == null) {
            this.CatchingFishGradleManifest = new CatchingFishCameraXHandler(coordinatorLayout.getContext(), coordinatorLayout, this.CatchingFishDaggerMVVM);
        }
        int top = view.getTop();
        coordinatorLayout.CatchingFishStateLiveData(view, i);
        this.CatchingFishDataStoreIntent = coordinatorLayout.getWidth();
        this.CatchingFishStateFlow = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.CatchingFishAppCompat = height;
        int i2 = this.CatchingFishStateFlow;
        int i3 = i2 - height;
        int i4 = this.CatchingFishSpannableWidget;
        if (i3 < i4) {
            boolean z2 = this.CatchingFishNavigation;
            int i5 = this.CatchingFishEspressoTesting;
            if (z2) {
                if (i5 != -1) {
                    i2 = Math.min(i2, i5);
                }
                this.CatchingFishAppCompat = i2;
            } else {
                int i6 = i2 - i4;
                if (i5 != -1) {
                    i6 = Math.min(i6, i5);
                }
                this.CatchingFishAppCompat = i6;
            }
        }
        this.CatchingFishCustomView = Math.max(0, this.CatchingFishStateFlow - this.CatchingFishAppCompat);
        this.CatchingFishFragmentFactory = (int) ((1.0f - this.CatchingFishMutableLiveData) * this.CatchingFishStateFlow);
        CatchingFishNavigation();
        int i7 = this.CatchingFishPayPalLiveData;
        if (i7 == 3) {
            int CatchingFishParcelableFlux = CatchingFishParcelableFlux();
            WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            view.offsetTopAndBottom(CatchingFishParcelableFlux);
        } else if (i7 == 6) {
            int i8 = this.CatchingFishFragmentFactory;
            WeakHashMap weakHashMap3 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            view.offsetTopAndBottom(i8);
        } else if (this.CatchingFishSensorManager && i7 == 5) {
            int i9 = this.CatchingFishStateFlow;
            WeakHashMap weakHashMap4 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            view.offsetTopAndBottom(i9);
        } else if (i7 == 4) {
            int i10 = this.CatchingFishJobScheduler;
            WeakHashMap weakHashMap5 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            view.offsetTopAndBottom(i10);
        } else if (i7 == 1 || i7 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap6 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            view.offsetTopAndBottom(top2);
        }
        CatchingFishJobScheduler(this.CatchingFishPayPalLiveData, false);
        this.CatchingFishAnimation = new WeakReference(CatchingFishDaggerHiltFAB(view));
        ArrayList arrayList = this.CatchingFishMVVMAppCompat;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishWorkManager(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        CatchingFishCameraXHandler catchingFishCameraXHandler;
        if (!view.isShown() || !this.CatchingFishDagger) {
            this.CatchingFishMotionLayout = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.CatchingFishMoshiDaggerHilt = -1;
            this.CatchingFishAndroidX = -1;
            VelocityTracker velocityTracker = this.CatchingFishStripeAPI;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.CatchingFishStripeAPI = null;
            }
        }
        if (this.CatchingFishStripeAPI == null) {
            this.CatchingFishStripeAPI = VelocityTracker.obtain();
        }
        this.CatchingFishStripeAPI.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.CatchingFishAndroidX = y;
            if (this.CatchingFishPayPalLiveData != 2) {
                WeakReference weakReference = this.CatchingFishAnimation;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.CatchingFishUnitTesting(view2, x, y)) {
                    this.CatchingFishMoshiDaggerHilt = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.CatchingFishNavigationGson = true;
                }
            }
            this.CatchingFishMotionLayout = this.CatchingFishMoshiDaggerHilt == -1 && !coordinatorLayout.CatchingFishUnitTesting(view, x, this.CatchingFishAndroidX);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.CatchingFishNavigationGson = false;
            this.CatchingFishMoshiDaggerHilt = -1;
            if (this.CatchingFishMotionLayout) {
                this.CatchingFishMotionLayout = false;
                return false;
            }
        }
        if (this.CatchingFishMotionLayout || (catchingFishCameraXHandler = this.CatchingFishGradleManifest) == null || !catchingFishCameraXHandler.CatchingFishAnimationMockk(motionEvent)) {
            WeakReference weakReference2 = this.CatchingFishAnimation;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.CatchingFishMotionLayout || this.CatchingFishPayPalLiveData == 1 || coordinatorLayout.CatchingFishUnitTesting(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.CatchingFishGradleManifest == null || (i = this.CatchingFishAndroidX) == -1 || Math.abs(i - motionEvent.getY()) <= this.CatchingFishGradleManifest.CatchingFishSnackbar) {
                return false;
            }
        }
        return true;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.CatchingFishParcelableFAB = 0;
        this.CatchingFishSnackbar = true;
        this.CatchingFishCloudMessaging = -1;
        this.CatchingFishEspressoTesting = -1;
        this.CatchingFishPayPal = new CatchingFishFluxGraphQL(this);
        this.CatchingFishMutableLiveData = 0.5f;
        this.CatchingFishPayPalService = -1.0f;
        this.CatchingFishDagger = true;
        this.CatchingFishCameraXIntent = true;
        this.CatchingFishPayPalLiveData = 4;
        this.CatchingFishRecyclerView = 0.1f;
        this.CatchingFishMVVMAppCompat = new ArrayList();
        this.CatchingFishAndroidX = -1;
        this.CatchingFishCustomViewJUnit = new SparseIntArray();
        this.CatchingFishDaggerMVVM = new CatchingFishMVVMMoshi(this, i2);
        this.CatchingFishViewModelFAB = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishParcelableFAB);
        if (obtainStyledAttributes.hasValue(3)) {
            this.CatchingFishFragmentHandler = CatchingFishDaggerBiometric.CatchingFishNavigation(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.CatchingFishGsonAppCompat = CatchingFishFragmentMVVM.CatchingFishSnackbar(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).CatchingFishParcelableFAB();
        }
        CatchingFishFragmentMVVM catchingFishFragmentMVVM = this.CatchingFishGsonAppCompat;
        if (catchingFishFragmentMVVM != null) {
            CatchingFishContextGraphQL catchingFishContextGraphQL = new CatchingFishContextGraphQL(catchingFishFragmentMVVM);
            this.CatchingFishLayout = catchingFishContextGraphQL;
            catchingFishContextGraphQL.CatchingFishCloudMessaging(context);
            ColorStateList colorStateList = this.CatchingFishFragmentHandler;
            if (colorStateList != null) {
                this.CatchingFishLayout.CatchingFishUnitTesting(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.CatchingFishLayout.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(CatchingFish(), 1.0f);
        this.CatchingFishCardViewView = ofFloat;
        ofFloat.setDuration(500L);
        this.CatchingFishCardViewView.addUpdateListener(new CatchingFishSharedFlowToast(i2, this));
        this.CatchingFishPayPalService = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.CatchingFishCloudMessaging = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.CatchingFishEspressoTesting = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i = peekValue.data) == -1) {
            CatchingFishPayPal(i);
        } else {
            CatchingFishPayPal(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        if (this.CatchingFishSensorManager != z) {
            this.CatchingFishSensorManager = z;
            if (!z && this.CatchingFishPayPalLiveData == 5) {
                CatchingFishCardViewView(4);
            }
            CatchingFishMutableLiveData();
        }
        this.CatchingFishUnitTesting = obtainStyledAttributes.getBoolean(14, false);
        boolean z2 = obtainStyledAttributes.getBoolean(7, true);
        if (this.CatchingFishSnackbar != z2) {
            this.CatchingFishSnackbar = z2;
            if (this.CatchingFishJUnitRealm != null) {
                CatchingFishNavigation();
            }
            CatchingFishMVPRobolectric((this.CatchingFishSnackbar && this.CatchingFishPayPalLiveData == 6) ? 3 : this.CatchingFishPayPalLiveData);
            CatchingFishJobScheduler(this.CatchingFishPayPalLiveData, true);
            CatchingFishMutableLiveData();
        }
        this.CatchingFishEspressoMockk = obtainStyledAttributes.getBoolean(13, false);
        this.CatchingFishDagger = obtainStyledAttributes.getBoolean(4, true);
        this.CatchingFishCameraXIntent = obtainStyledAttributes.getBoolean(5, true);
        this.CatchingFishParcelableFAB = obtainStyledAttributes.getInt(11, 0);
        float f = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.CatchingFishMutableLiveData = f;
            if (this.CatchingFishJUnitRealm != null) {
                this.CatchingFishFragmentFactory = (int) ((1.0f - f) * this.CatchingFishStateFlow);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.CatchingFishMVPRobolectric = i3;
                    CatchingFishJobScheduler(this.CatchingFishPayPalLiveData, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.CatchingFishMVPRobolectric = dimensionPixelOffset;
                    CatchingFishJobScheduler(this.CatchingFishPayPalLiveData, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.CatchingFishReduxKtor = obtainStyledAttributes.getInt(12, 500);
            this.CatchingFishAnimationMockk = obtainStyledAttributes.getBoolean(18, false);
            this.CatchingFishStateLiveData = obtainStyledAttributes.getBoolean(19, false);
            this.CatchingFishRoomDatabase = obtainStyledAttributes.getBoolean(20, false);
            this.CatchingFishNavigation = obtainStyledAttributes.getBoolean(21, true);
            this.CatchingFish = obtainStyledAttributes.getBoolean(15, false);
            this.CatchingFishJetpackCompose = obtainStyledAttributes.getBoolean(16, false);
            this.CatchingFishCoroutineFlow = obtainStyledAttributes.getBoolean(17, false);
            this.CatchingFishParcelableFlux = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.CatchingFishCoroutine = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishCloudMessaging(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
