package com.google.android.material.snackbar;

import I0.j;
import I3.c;
import O2.i;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final i f36827h;

    public BaseTransientBottomBar$Behavior() {
        i iVar = new i(5);
        this.f36595e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f36596f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f36594d = 0;
        this.f36827h = iVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, B.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f36827h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (j.f1288v == null) {
                    j.f1288v = new j(8);
                }
                synchronized (j.f1288v.f1291u) {
                }
            }
        } else if (coordinatorLayout.o((int) motionEvent.getX(), (int) motionEvent.getY(), view)) {
            if (j.f1288v == null) {
                j.f1288v = new j(8);
            }
            synchronized (j.f1288v.f1291u) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f36827h.getClass();
        return view instanceof c;
    }
}
