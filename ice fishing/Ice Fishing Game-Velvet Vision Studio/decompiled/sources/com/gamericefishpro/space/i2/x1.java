package com.gamericefishpro.space.i2;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x1(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.d) {
            case 4:
                com.gamericefishpro.space.na.p pVar = (com.gamericefishpro.space.na.p) this.e;
                AccessibilityManager accessibilityManager = pVar.M;
                if (pVar.N != null && accessibilityManager != null && pVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(pVar.N);
                    break;
                }
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.o1.e eVar = (com.gamericefishpro.space.o1.e) this.e;
                Context context = view.getContext();
                if (!eVar.d) {
                    context.getApplicationContext().registerComponentCallbacks(eVar.e);
                    eVar.d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a aVar = (a) this.e;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                Iterator it = com.gamericefishpro.space.li.j.c(aVar.getParent(), com.gamericefishpro.space.d4.n0.B).iterator();
                while (true) {
                    z = false;
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            Intrinsics.checkNotNullParameter(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    p2 p2Var = aVar.i;
                    if (p2Var != null) {
                        p2Var.a();
                    }
                    aVar.i = null;
                    aVar.requestLayout();
                }
                break;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                ((com.gamericefishpro.space.pi.s1) this.e).c(null);
                break;
            case 2:
                com.gamericefishpro.space.m.f fVar = (com.gamericefishpro.space.m.f) this.e;
                ViewTreeObserver viewTreeObserver = fVar.Q;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.Q = view.getViewTreeObserver();
                    }
                    fVar.Q.removeGlobalOnLayoutListener(fVar.B);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                com.gamericefishpro.space.m.r rVar = (com.gamericefishpro.space.m.r) this.e;
                ViewTreeObserver viewTreeObserver2 = rVar.H;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        rVar.H = view.getViewTreeObserver();
                    }
                    rVar.H.removeGlobalOnLayoutListener(rVar.B);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                com.gamericefishpro.space.na.p pVar = (com.gamericefishpro.space.na.p) this.e;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = pVar.N;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = pVar.M) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.o1.e eVar = (com.gamericefishpro.space.o1.e) this.e;
                Context context = view.getContext();
                if (eVar.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(eVar.e);
                    eVar.d = false;
                }
                break;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.e;
                com.gamericefishpro.space.v9.a aVar2 = hideBottomViewOnScrollBehavior.h;
                if (aVar2 != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.e;
                com.gamericefishpro.space.v9.a aVar3 = hideViewOnScrollBehavior.c;
                if (aVar3 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(aVar3);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }
}
