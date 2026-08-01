package com.google.android.material.snackbar;

import B.b;
import S0.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final e f2584h;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(8);
        this.e = Math.min(Math.max(RecyclerView.f2111C0, 0.1f), 1.0f);
        this.f2364f = Math.min(Math.max(RecyclerView.f2111C0, 0.6f), 1.0f);
        this.f2363d = 0;
        this.f2584h = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, B.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f2584h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (b.f8c == null) {
                    b.f8c = new b(14);
                }
                synchronized (b.f8c.f10b) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (b.f8c == null) {
                b.f8c = new b(14);
            }
            synchronized (b.f8c.f10b) {
            }
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean v(View view) {
        this.f2584h.getClass();
        return view instanceof U0.b;
    }
}
