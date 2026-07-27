package com.google.android.material.snackbar;

import C3.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import h4.c;

/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final e f36224h;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e();
        this.f35990e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f35991f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f35989d = 0;
        this.f36224h = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, B.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f36224h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (c.f38231w == null) {
                    c.f38231w = new c(3);
                }
                synchronized (c.f38231w.f38233u) {
                }
            }
        } else if (coordinatorLayout.o((int) motionEvent.getX(), (int) motionEvent.getY(), view)) {
            if (c.f38231w == null) {
                c.f38231w = new c(3);
            }
            synchronized (c.f38231w.f38233u) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f36224h.getClass();
        return view instanceof E3.c;
    }
}
