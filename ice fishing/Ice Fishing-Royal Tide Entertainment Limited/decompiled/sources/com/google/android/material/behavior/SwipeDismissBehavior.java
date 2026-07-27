package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.text.CatchingFishBundleContext;
import kotlin.text.CatchingFishCameraXHandler;
import kotlin.text.CatchingFishEspressoPayPal;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishJUnitToastKtor;
import kotlin.text.CatchingFishPicassoFragment;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CatchingFishJUnitToastKtor {
    public boolean CatchingFishCoroutine;
    public CatchingFishCameraXHandler CatchingFishParcelableFAB;
    public boolean CatchingFishSnackbar;
    public int CatchingFishReduxKtor = 2;
    public float CatchingFishDaggerWebsocket = 0.0f;
    public float CatchingFishWorkManager = 0.5f;
    public final CatchingFishPicassoFragment CatchingFishViewModelScope = new CatchingFishPicassoFragment(this);

    public boolean CatchingFishNavigation(View view) {
        return true;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishRoomDatabase(View view, MotionEvent motionEvent) {
        if (this.CatchingFishParcelableFAB == null) {
            return false;
        }
        if (this.CatchingFishCoroutine && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.CatchingFishParcelableFAB.CatchingFishLayout(motionEvent);
        return true;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishViewModelScope(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            CatchingFishFABCameraX.CatchingFishFragmentHandler(view, 1048576);
            CatchingFishFABCameraX.CatchingFishViewModelFAB(view, 0);
            if (CatchingFishNavigation(view)) {
                CatchingFishFABCameraX.CatchingFishCloudMessaging(view, CatchingFishBundleContext.CatchingFishEspressoTesting, new CatchingFishEspressoPayPal(9, this));
            }
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public boolean CatchingFishWorkManager(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.CatchingFishSnackbar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.CatchingFishUnitTesting(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.CatchingFishSnackbar = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.CatchingFishSnackbar = false;
        }
        if (z) {
            if (this.CatchingFishParcelableFAB == null) {
                this.CatchingFishParcelableFAB = new CatchingFishCameraXHandler(coordinatorLayout.getContext(), coordinatorLayout, this.CatchingFishViewModelScope);
            }
            if (!this.CatchingFishCoroutine && this.CatchingFishParcelableFAB.CatchingFishAnimationMockk(motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
