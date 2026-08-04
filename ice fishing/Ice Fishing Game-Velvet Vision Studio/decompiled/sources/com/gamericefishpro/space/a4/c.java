package com.gamericefishpro.space.a4;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.MainActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ KeyEvent.Callback e;

    public c(d dVar, MainActivity mainActivity) {
        this.e = mainActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (b.C(view2)) {
                    SplashScreenView child = b.s(view2);
                    Intrinsics.checkNotNullParameter(child, "child");
                    WindowInsets windowInsetsBuild = a.g().build();
                    Intrinsics.checkNotNullExpressionValue(windowInsetsBuild, "Builder().build()");
                    Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    if (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                        rect.isEmpty();
                    }
                    ((ViewGroup) ((MainActivity) this.e).getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
                break;
            default:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) this.e).J;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                }
                break;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.e;
                coordinatorLayout.p(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.J;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                }
                break;
        }
    }

    public c(CoordinatorLayout coordinatorLayout) {
        this.e = coordinatorLayout;
    }

    private final void a(View view, View view2) {
    }
}
