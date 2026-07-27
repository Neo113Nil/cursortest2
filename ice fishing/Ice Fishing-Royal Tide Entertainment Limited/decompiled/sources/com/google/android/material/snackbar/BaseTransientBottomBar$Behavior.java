package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import kotlin.text.CatchingFishFABFlux;
import kotlin.text.CatchingFishIntentCameraX;
import kotlin.text.CatchingFishMoshiFluxMoshi;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final CatchingFishMoshiFluxMoshi CatchingFishViewModelFAB;

    public BaseTransientBottomBar$Behavior() {
        CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi = new CatchingFishMoshiFluxMoshi(14);
        this.CatchingFishDaggerWebsocket = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.CatchingFishWorkManager = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishViewModelFAB = catchingFishMoshiFluxMoshi;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean CatchingFishNavigation(View view) {
        this.CatchingFishViewModelFAB.getClass();
        return view instanceof CatchingFishIntentCameraX;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishWorkManager(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.CatchingFishViewModelFAB.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (CatchingFishFABFlux.CatchingFishDaggerWebsocket == null) {
                    CatchingFishFABFlux.CatchingFishDaggerWebsocket = new CatchingFishFABFlux();
                }
                synchronized (CatchingFishFABFlux.CatchingFishDaggerWebsocket.CatchingFishReduxKtor) {
                }
            }
        } else if (coordinatorLayout.CatchingFishUnitTesting(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (CatchingFishFABFlux.CatchingFishDaggerWebsocket == null) {
                CatchingFishFABFlux.CatchingFishDaggerWebsocket = new CatchingFishFABFlux();
            }
            synchronized (CatchingFishFABFlux.CatchingFishDaggerWebsocket.CatchingFishReduxKtor) {
            }
        }
        return super.CatchingFishWorkManager(coordinatorLayout, view, motionEvent);
    }
}
