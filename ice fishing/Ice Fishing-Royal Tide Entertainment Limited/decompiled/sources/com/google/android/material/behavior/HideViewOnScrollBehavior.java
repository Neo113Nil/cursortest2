package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.catchingfish.fishcatcherpro.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.text.CatchingFishBundleHilt;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishJUnitToastKtor;
import kotlin.text.CatchingFishMVPView;
import kotlin.text.CatchingFishRobolectricRoom;
import kotlin.text.CatchingFishStateLiveData;
import kotlin.text.CatchingFishToastWidget;
import kotlin.text.CatchingFishWebSocketGson;

/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends CatchingFishJUnitToastKtor {
    public ViewPropertyAnimator CatchingFishCloudMessaging;
    public CatchingFishWebSocketGson CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public CatchingFishFirebaseDagger CatchingFishParcelableFAB;
    public AccessibilityManager CatchingFishSnackbar;
    public TimeInterpolator CatchingFishViewModelFAB;
    public TimeInterpolator CatchingFishViewModelScope;
    public int CatchingFishWorkManager;
    public final LinkedHashSet CatchingFishReduxKtor = new LinkedHashSet();
    public int CatchingFishLayout = 0;
    public int CatchingFishFragmentHandler = 2;

    public HideViewOnScrollBehavior() {
    }

    public final void CatchingFish(View view) {
        if (this.CatchingFishFragmentHandler == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.CatchingFishCloudMessaging;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.CatchingFishFragmentHandler = 2;
        Iterator it = this.CatchingFishReduxKtor.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.CatchingFishParcelableFAB.getClass();
        this.CatchingFishCloudMessaging = this.CatchingFishParcelableFAB.CatchingFishSensorManager(view, 0).setInterpolator(this.CatchingFishViewModelScope).setDuration(this.CatchingFishDaggerWebsocket).setListener(new CatchingFishStateLiveData(4, this));
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishAnimationMockk(View view, int i, int i2) {
        return i == 2;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishCloudMessaging(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                CatchingFish(view);
                return;
            }
            return;
        }
        if (this.CatchingFishFragmentHandler == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.CatchingFishSnackbar;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.CatchingFishCloudMessaging;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.CatchingFishFragmentHandler = 1;
            Iterator it = this.CatchingFishReduxKtor.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.CatchingFishCloudMessaging = this.CatchingFishParcelableFAB.CatchingFishSensorManager(view, this.CatchingFishLayout).setInterpolator(this.CatchingFishViewModelFAB).setDuration(this.CatchingFishWorkManager).setListener(new CatchingFishStateLiveData(4, this));
        }
    }

    public final void CatchingFishNavigation(int i) {
        CatchingFishFirebaseDagger catchingFishFirebaseDagger = this.CatchingFishParcelableFAB;
        if (catchingFishFirebaseDagger == null || catchingFishFirebaseDagger.CatchingFishPayPalService() != i) {
            if (i == 0) {
                this.CatchingFishParcelableFAB = new CatchingFishBundleHilt(2);
                return;
            }
            if (i == 1) {
                this.CatchingFishParcelableFAB = new CatchingFishBundleHilt(0);
            } else {
                if (i == 2) {
                    this.CatchingFishParcelableFAB = new CatchingFishBundleHilt(1);
                    return;
                }
                throw new IllegalArgumentException("Invalid view edge position value: " + i + ". Must be 0, 1 or 2.");
            }
        }
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishViewModelScope(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.CatchingFishSnackbar == null) {
            this.CatchingFishSnackbar = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.CatchingFishSnackbar;
        if (accessibilityManager != null && this.CatchingFishCoroutine == null) {
            CatchingFishWebSocketGson catchingFishWebSocketGson = new CatchingFishWebSocketGson(this, view, 1);
            this.CatchingFishCoroutine = catchingFishWebSocketGson;
            accessibilityManager.addTouchExplorationStateChangeListener(catchingFishWebSocketGson);
            view.addOnAttachStateChangeListener(new CatchingFishToastWidget(6, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((CatchingFishMVPView) view.getLayoutParams()).CatchingFishCoroutine;
        if (i2 == 80 || i2 == 81) {
            CatchingFishNavigation(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            CatchingFishNavigation((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.CatchingFishLayout = this.CatchingFishParcelableFAB.CatchingFishMutableLiveData(view, marginLayoutParams);
        this.CatchingFishDaggerWebsocket = CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(view.getContext(), R.attr.motionDurationLong2, 225);
        this.CatchingFishWorkManager = CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.CatchingFishViewModelScope = CatchingFishHiltMVPToast.CatchingFishCustomView(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, CatchingFishRobolectricRoom.CatchingFishReduxKtor);
        this.CatchingFishViewModelFAB = CatchingFishHiltMVPToast.CatchingFishCustomView(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, CatchingFishRobolectricRoom.CatchingFishCoroutine);
        return false;
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
