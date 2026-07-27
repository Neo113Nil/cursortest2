package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.catchingfish.fishcatcherpro.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.text.CatchingFishHiltMVPToast;
import kotlin.text.CatchingFishJUnitToastKtor;
import kotlin.text.CatchingFishRobolectricRoom;
import kotlin.text.CatchingFishStateLiveData;
import kotlin.text.CatchingFishToastWidget;
import kotlin.text.CatchingFishWebSocketGson;

@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CatchingFishJUnitToastKtor {
    public ViewPropertyAnimator CatchingFishCloudMessaging;
    public int CatchingFishCoroutine;
    public TimeInterpolator CatchingFishDaggerWebsocket;
    public TimeInterpolator CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public CatchingFishWebSocketGson CatchingFishViewModelFAB;
    public AccessibilityManager CatchingFishViewModelScope;
    public final LinkedHashSet CatchingFishParcelableFAB = new LinkedHashSet();
    public int CatchingFishWorkManager = 0;
    public final boolean CatchingFishLayout = true;
    public int CatchingFishFragmentHandler = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public boolean CatchingFishAnimationMockk(View view, int i, int i2) {
        return i == 2;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishCloudMessaging(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                CatchingFishNavigation(view);
                return;
            }
            return;
        }
        if (this.CatchingFishFragmentHandler == 1) {
            return;
        }
        if (this.CatchingFishLayout && (accessibilityManager = this.CatchingFishViewModelScope) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.CatchingFishCloudMessaging;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.CatchingFishFragmentHandler = 1;
        Iterator it = this.CatchingFishParcelableFAB.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.CatchingFishCloudMessaging = view.animate().translationY(this.CatchingFishWorkManager).setInterpolator(this.CatchingFishDaggerWebsocket).setDuration(this.CatchingFishCoroutine).setListener(new CatchingFishStateLiveData(3, this));
    }

    public final void CatchingFishNavigation(View view) {
        if (this.CatchingFishFragmentHandler == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.CatchingFishCloudMessaging;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.CatchingFishFragmentHandler = 2;
        Iterator it = this.CatchingFishParcelableFAB.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.CatchingFishCloudMessaging = view.animate().translationY(0).setInterpolator(this.CatchingFishReduxKtor).setDuration(this.CatchingFishSnackbar).setListener(new CatchingFishStateLiveData(3, this));
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public boolean CatchingFishViewModelScope(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.CatchingFishWorkManager = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.CatchingFishSnackbar = CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(view.getContext(), R.attr.motionDurationLong2, 225);
        this.CatchingFishCoroutine = CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.CatchingFishReduxKtor = CatchingFishHiltMVPToast.CatchingFishCustomView(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, CatchingFishRobolectricRoom.CatchingFishReduxKtor);
        this.CatchingFishDaggerWebsocket = CatchingFishHiltMVPToast.CatchingFishCustomView(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, CatchingFishRobolectricRoom.CatchingFishCoroutine);
        if (this.CatchingFishViewModelScope == null) {
            this.CatchingFishViewModelScope = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.CatchingFishViewModelScope;
        if (accessibilityManager == null || this.CatchingFishViewModelFAB != null) {
            return false;
        }
        CatchingFishWebSocketGson catchingFishWebSocketGson = new CatchingFishWebSocketGson(this, view, 0);
        this.CatchingFishViewModelFAB = catchingFishWebSocketGson;
        accessibilityManager.addTouchExplorationStateChangeListener(catchingFishWebSocketGson);
        view.addOnAttachStateChangeListener(new CatchingFishToastWidget(5, this));
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
