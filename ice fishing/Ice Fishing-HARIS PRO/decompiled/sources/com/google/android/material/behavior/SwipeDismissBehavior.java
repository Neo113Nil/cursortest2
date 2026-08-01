package com.google.android.material.behavior;

import B.c;
import O.K;
import P.d;
import U.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import m0.C0298f;
import y0.C0378a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends c {

    /* renamed from: a, reason: collision with root package name */
    public e f2360a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2361b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2362c;

    /* renamed from: d, reason: collision with root package name */
    public int f2363d = 2;
    public float e = RecyclerView.f2111C0;

    /* renamed from: f, reason: collision with root package name */
    public float f2364f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0378a f2365g = new C0378a(this);

    @Override // B.c
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f2361b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2361b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2361b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f2360a == null) {
            this.f2360a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f2365g);
        }
        return !this.f2362c && this.f2360a.t(motionEvent);
    }

    @Override // B.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = K.f747a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            K.i(view, 1048576);
            K.g(view, 0);
            if (v(view)) {
                K.j(view, d.j, new C0298f(this));
            }
        }
        return false;
    }

    @Override // B.c
    public final boolean u(View view, MotionEvent motionEvent) {
        if (this.f2360a == null) {
            return false;
        }
        if (this.f2362c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2360a.m(motionEvent);
        return true;
    }

    public boolean v(View view) {
        return true;
    }
}
