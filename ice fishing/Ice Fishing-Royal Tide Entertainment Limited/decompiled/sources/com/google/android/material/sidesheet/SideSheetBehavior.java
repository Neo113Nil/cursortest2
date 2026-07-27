package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.text.CatchingFishBundleContext;
import kotlin.text.CatchingFishCameraXHandler;
import kotlin.text.CatchingFishContextGraphQL;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishEspressoTesting;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishFluxBiometric;
import kotlin.text.CatchingFishFluxGraphQL;
import kotlin.text.CatchingFishFragmentMVVM;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishJUnitToastKtor;
import kotlin.text.CatchingFishKtorMVI;
import kotlin.text.CatchingFishLayoutManifest;
import kotlin.text.CatchingFishMVPLiveData;
import kotlin.text.CatchingFishMVPView;
import kotlin.text.CatchingFishMVVMMoshi;
import kotlin.text.CatchingFishParcelableMockk;
import kotlin.text.CatchingFishSnackbarPicasso;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CatchingFishJUnitToastKtor {
    public VelocityTracker CatchingFish;
    public int CatchingFishAnimationMockk;
    public final float CatchingFishCloudMessaging;
    public final ColorStateList CatchingFishCoroutine;
    public final LinkedHashSet CatchingFishCoroutineFlow;
    public final CatchingFishMVVMMoshi CatchingFishDaggerHiltFAB;
    public final CatchingFishFluxGraphQL CatchingFishDaggerWebsocket;
    public int CatchingFishEspressoTesting;
    public boolean CatchingFishFragmentHandler;
    public int CatchingFishJetpackCompose;
    public CatchingFishCameraXHandler CatchingFishLayout;
    public final int CatchingFishNavigation;
    public int CatchingFishOkHttp;
    public CatchingFishHiltMVPToast CatchingFishParcelableFAB;
    public final CatchingFishFragmentMVVM CatchingFishReduxKtor;
    public WeakReference CatchingFishRoomDatabase;
    public final CatchingFishContextGraphQL CatchingFishSnackbar;
    public WeakReference CatchingFishStateLiveData;
    public int CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public final boolean CatchingFishViewModelScope;
    public final float CatchingFishWorkManager;

    public SideSheetBehavior() {
        this.CatchingFishDaggerWebsocket = new CatchingFishFluxGraphQL(this);
        this.CatchingFishViewModelScope = true;
        this.CatchingFishViewModelFAB = 5;
        this.CatchingFishCloudMessaging = 0.1f;
        this.CatchingFishNavigation = -1;
        this.CatchingFishCoroutineFlow = new LinkedHashSet();
        this.CatchingFishDaggerHiltFAB = new CatchingFishMVVMMoshi(this, 1);
    }

    public final boolean CatchingFish() {
        if (this.CatchingFishLayout != null) {
            return this.CatchingFishViewModelScope || this.CatchingFishViewModelFAB == 1;
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishCoroutine(CatchingFishMVPView catchingFishMVPView) {
        this.CatchingFishStateLiveData = null;
        this.CatchingFishLayout = null;
    }

    public final void CatchingFishCoroutineFlow() {
        View view;
        WeakReference weakReference = this.CatchingFishStateLiveData;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        CatchingFishFABCameraX.CatchingFishFragmentHandler(view, 262144);
        CatchingFishFABCameraX.CatchingFishViewModelFAB(view, 0);
        CatchingFishFABCameraX.CatchingFishFragmentHandler(view, 1048576);
        CatchingFishFABCameraX.CatchingFishViewModelFAB(view, 0);
        final int i = 5;
        if (this.CatchingFishViewModelFAB != 5) {
            CatchingFishFABCameraX.CatchingFishCloudMessaging(view, CatchingFishBundleContext.CatchingFishEspressoTesting, new CatchingFishFluxBiometric() { // from class: kotlin.text.CatchingFishCameraXPayPal
                @Override // kotlin.text.CatchingFishFluxBiometric
                public final boolean CatchingFishSnackbar(View view2) {
                    int i2 = i;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    WeakReference weakReference2 = sideSheetBehavior.CatchingFishStateLiveData;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.CatchingFishNavigation(i2);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.CatchingFishStateLiveData.get();
                    CatchingFishMVVMGson catchingFishMVVMGson = new CatchingFishMVVMGson(i2, 1, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(catchingFishMVVMGson);
                        return true;
                    }
                    catchingFishMVVMGson.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.CatchingFishViewModelFAB != 3) {
            CatchingFishFABCameraX.CatchingFishCloudMessaging(view, CatchingFishBundleContext.CatchingFishFragmentHandler, new CatchingFishFluxBiometric() { // from class: kotlin.text.CatchingFishCameraXPayPal
                @Override // kotlin.text.CatchingFishFluxBiometric
                public final boolean CatchingFishSnackbar(View view2) {
                    int i22 = i2;
                    if (i22 == 1 || i22 == 2) {
                        throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder("STATE_"), i22 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    WeakReference weakReference2 = sideSheetBehavior.CatchingFishStateLiveData;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.CatchingFishNavigation(i22);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.CatchingFishStateLiveData.get();
                    CatchingFishMVVMGson catchingFishMVVMGson = new CatchingFishMVVMGson(i22, 1, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(catchingFishMVVMGson);
                        return true;
                    }
                    catchingFishMVVMGson.run();
                    return true;
                }
            });
        }
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishDaggerWebsocket() {
        this.CatchingFishStateLiveData = null;
        this.CatchingFishLayout = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.CatchingFishUnitTesting(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        CatchingFishNavigation(2);
        r2.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishJetpackCompose(View view, int i, boolean z) {
        int CatchingFishUnitTesting;
        if (i == 3) {
            CatchingFishUnitTesting = this.CatchingFishParcelableFAB.CatchingFishUnitTesting();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Invalid state to get outer edge offset: ", i));
            }
            CatchingFishUnitTesting = this.CatchingFishParcelableFAB.CatchingFishAnimationMockk();
        }
        CatchingFishCameraXHandler catchingFishCameraXHandler = this.CatchingFishLayout;
        if (catchingFishCameraXHandler != null) {
            if (!z) {
                int top = view.getTop();
                catchingFishCameraXHandler.CatchingFishNavigation = view;
                catchingFishCameraXHandler.CatchingFishCoroutine = -1;
                boolean CatchingFishViewModelFAB = catchingFishCameraXHandler.CatchingFishViewModelFAB(CatchingFishUnitTesting, top, 0, 0);
                if (!CatchingFishViewModelFAB && catchingFishCameraXHandler.CatchingFishParcelableFAB == 0 && catchingFishCameraXHandler.CatchingFishNavigation != null) {
                    catchingFishCameraXHandler.CatchingFishNavigation = null;
                }
            }
        }
        CatchingFishNavigation(i);
    }

    public final void CatchingFishNavigation(int i) {
        View view;
        if (this.CatchingFishViewModelFAB == i) {
            return;
        }
        this.CatchingFishViewModelFAB = i;
        WeakReference weakReference = this.CatchingFishStateLiveData;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.CatchingFishViewModelFAB == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.CatchingFishCoroutineFlow.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        CatchingFishCoroutineFlow();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishOkHttp(View view, Parcelable parcelable) {
        int i = ((CatchingFishLayoutManifest) parcelable).CatchingFishWorkManager;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.CatchingFishViewModelFAB = i;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishRoomDatabase(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.CatchingFishViewModelFAB == 1 && actionMasked == 0) {
            return true;
        }
        if (CatchingFish()) {
            this.CatchingFishLayout.CatchingFishLayout(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.CatchingFish) != null) {
            velocityTracker.recycle();
            this.CatchingFish = null;
        }
        if (this.CatchingFish == null) {
            this.CatchingFish = VelocityTracker.obtain();
        }
        this.CatchingFish.addMovement(motionEvent);
        if (CatchingFish() && actionMasked == 2 && !this.CatchingFishFragmentHandler && CatchingFish()) {
            float abs = Math.abs(this.CatchingFishJetpackCompose - motionEvent.getX());
            CatchingFishCameraXHandler catchingFishCameraXHandler = this.CatchingFishLayout;
            if (abs > catchingFishCameraXHandler.CatchingFishSnackbar) {
                catchingFishCameraXHandler.CatchingFishSnackbar(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.CatchingFishFragmentHandler;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final Parcelable CatchingFishUnitTesting(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new CatchingFishLayoutManifest(this);
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishViewModelFAB(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishViewModelScope(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.CatchingFishStateLiveData;
        CatchingFishContextGraphQL catchingFishContextGraphQL = this.CatchingFishSnackbar;
        int i4 = 0;
        if (weakReference == null) {
            this.CatchingFishStateLiveData = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(context, R.attr.motionDurationMedium2, 300);
            CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(context, R.attr.motionDurationShort3, 150);
            CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (catchingFishContextGraphQL != null) {
                view.setBackground(catchingFishContextGraphQL);
                float f = this.CatchingFishWorkManager;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                catchingFishContextGraphQL.CatchingFishOkHttp(f);
            } else {
                ColorStateList colorStateList = this.CatchingFishCoroutine;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i5 = this.CatchingFishViewModelFAB == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            CatchingFishCoroutineFlow();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (CatchingFishFABCameraX.CatchingFishDaggerWebsocket(view) == null) {
                CatchingFishFABCameraX.CatchingFishUnitTesting(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((CatchingFishMVPView) view.getLayoutParams()).CatchingFishCoroutine, i) == 3 ? 1 : 0;
        CatchingFishHiltMVPToast catchingFishHiltMVPToast = this.CatchingFishParcelableFAB;
        if (catchingFishHiltMVPToast == null || catchingFishHiltMVPToast.CatchingFishCoroutineFlow() != i6) {
            CatchingFishMVPView catchingFishMVPView = null;
            CatchingFishFragmentMVVM catchingFishFragmentMVVM = this.CatchingFishReduxKtor;
            if (i6 == 0) {
                this.CatchingFishParcelableFAB = new CatchingFishParcelableMockk(this, i3);
                if (catchingFishFragmentMVVM != null) {
                    WeakReference weakReference2 = this.CatchingFishStateLiveData;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof CatchingFishMVPView)) {
                        catchingFishMVPView = (CatchingFishMVPView) view3.getLayoutParams();
                    }
                    if (catchingFishMVPView == null || ((ViewGroup.MarginLayoutParams) catchingFishMVPView).rightMargin <= 0) {
                        CatchingFishKtorMVI CatchingFishWorkManager = catchingFishFragmentMVVM.CatchingFishWorkManager();
                        CatchingFishWorkManager.CatchingFishWorkManager = new CatchingFishEspressoTesting(0.0f);
                        CatchingFishWorkManager.CatchingFishViewModelScope = new CatchingFishEspressoTesting(0.0f);
                        CatchingFishFragmentMVVM CatchingFishParcelableFAB = CatchingFishWorkManager.CatchingFishParcelableFAB();
                        if (catchingFishContextGraphQL != null) {
                            catchingFishContextGraphQL.setShapeAppearanceModel(CatchingFishParcelableFAB);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0 or 1.");
                }
                this.CatchingFishParcelableFAB = new CatchingFishParcelableMockk(this, i4);
                if (catchingFishFragmentMVVM != null) {
                    WeakReference weakReference3 = this.CatchingFishStateLiveData;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof CatchingFishMVPView)) {
                        catchingFishMVPView = (CatchingFishMVPView) view2.getLayoutParams();
                    }
                    if (catchingFishMVPView == null || ((ViewGroup.MarginLayoutParams) catchingFishMVPView).leftMargin <= 0) {
                        CatchingFishKtorMVI CatchingFishWorkManager2 = catchingFishFragmentMVVM.CatchingFishWorkManager();
                        CatchingFishWorkManager2.CatchingFishDaggerWebsocket = new CatchingFishEspressoTesting(0.0f);
                        CatchingFishWorkManager2.CatchingFishViewModelFAB = new CatchingFishEspressoTesting(0.0f);
                        CatchingFishFragmentMVVM CatchingFishParcelableFAB2 = CatchingFishWorkManager2.CatchingFishParcelableFAB();
                        if (catchingFishContextGraphQL != null) {
                            catchingFishContextGraphQL.setShapeAppearanceModel(CatchingFishParcelableFAB2);
                        }
                    }
                }
            }
        }
        if (this.CatchingFishLayout == null) {
            this.CatchingFishLayout = new CatchingFishCameraXHandler(coordinatorLayout.getContext(), coordinatorLayout, this.CatchingFishDaggerHiltFAB);
        }
        int CatchingFish = this.CatchingFishParcelableFAB.CatchingFish(view);
        coordinatorLayout.CatchingFishStateLiveData(view, i);
        this.CatchingFishOkHttp = coordinatorLayout.getWidth();
        this.CatchingFishUnitTesting = this.CatchingFishParcelableFAB.CatchingFishJetpackCompose(coordinatorLayout);
        this.CatchingFishEspressoTesting = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.CatchingFishAnimationMockk = marginLayoutParams != null ? this.CatchingFishParcelableFAB.CatchingFishSnackbar(marginLayoutParams) : 0;
        int i7 = this.CatchingFishViewModelFAB;
        if (i7 == 1 || i7 == 2) {
            i4 = CatchingFish - this.CatchingFishParcelableFAB.CatchingFish(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.CatchingFishViewModelFAB);
            }
            i4 = this.CatchingFishParcelableFAB.CatchingFishAnimationMockk();
        }
        WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        view.offsetLeftAndRight(i4);
        if (this.CatchingFishRoomDatabase == null && (i2 = this.CatchingFishNavigation) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.CatchingFishRoomDatabase = new WeakReference(findViewById);
        }
        Iterator it = this.CatchingFishCoroutineFlow.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishWorkManager(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        CatchingFishCameraXHandler catchingFishCameraXHandler;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && CatchingFishFABCameraX.CatchingFishDaggerWebsocket(view) == null) || !this.CatchingFishViewModelScope) {
            this.CatchingFishFragmentHandler = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.CatchingFish) != null) {
            velocityTracker.recycle();
            this.CatchingFish = null;
        }
        if (this.CatchingFish == null) {
            this.CatchingFish = VelocityTracker.obtain();
        }
        this.CatchingFish.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.CatchingFishJetpackCompose = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.CatchingFishFragmentHandler) {
            this.CatchingFishFragmentHandler = false;
            return false;
        }
        return (this.CatchingFishFragmentHandler || (catchingFishCameraXHandler = this.CatchingFishLayout) == null || !catchingFishCameraXHandler.CatchingFishAnimationMockk(motionEvent)) ? false : true;
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.CatchingFishDaggerWebsocket = new CatchingFishFluxGraphQL(this);
        this.CatchingFishViewModelScope = true;
        this.CatchingFishViewModelFAB = 5;
        this.CatchingFishCloudMessaging = 0.1f;
        this.CatchingFishNavigation = -1;
        this.CatchingFishCoroutineFlow = new LinkedHashSet();
        this.CatchingFishDaggerHiltFAB = new CatchingFishMVVMMoshi(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishSnackbarPicasso.CatchingFishCardViewRealm);
        if (obtainStyledAttributes.hasValue(3)) {
            this.CatchingFishCoroutine = CatchingFishDaggerBiometric.CatchingFishNavigation(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.CatchingFishReduxKtor = CatchingFishFragmentMVVM.CatchingFishSnackbar(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).CatchingFishParcelableFAB();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.CatchingFishNavigation = resourceId;
            WeakReference weakReference = this.CatchingFishRoomDatabase;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.CatchingFishRoomDatabase = null;
            WeakReference weakReference2 = this.CatchingFishStateLiveData;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        CatchingFishFragmentMVVM catchingFishFragmentMVVM = this.CatchingFishReduxKtor;
        if (catchingFishFragmentMVVM != null) {
            CatchingFishContextGraphQL catchingFishContextGraphQL = new CatchingFishContextGraphQL(catchingFishFragmentMVVM);
            this.CatchingFishSnackbar = catchingFishContextGraphQL;
            catchingFishContextGraphQL.CatchingFishCloudMessaging(context);
            ColorStateList colorStateList = this.CatchingFishCoroutine;
            if (colorStateList != null) {
                this.CatchingFishSnackbar.CatchingFishUnitTesting(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.CatchingFishSnackbar.setTint(typedValue.data);
            }
        }
        this.CatchingFishWorkManager = obtainStyledAttributes.getDimension(2, -1.0f);
        this.CatchingFishViewModelScope = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
