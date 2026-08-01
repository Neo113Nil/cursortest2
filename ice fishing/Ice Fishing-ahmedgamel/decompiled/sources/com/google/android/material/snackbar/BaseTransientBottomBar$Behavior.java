package com.google.android.material.snackbar;

import E3.e;
import G3.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final e f36059h;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e();
        this.f35827e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f35828f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f35826d = 0;
        this.f36059h = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, B.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f36059h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (G3.e.f1071u == null) {
                    G3.e.f1071u = new G3.e();
                }
                synchronized (G3.e.f1071u.f1072n) {
                }
            }
        } else if (coordinatorLayout.o((int) motionEvent.getX(), (int) motionEvent.getY(), view)) {
            if (G3.e.f1071u == null) {
                G3.e.f1071u = new G3.e();
            }
            synchronized (G3.e.f1071u.f1072n) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f36059h.getClass();
        return view instanceof c;
    }
}
