package com.google.android.material.behavior;

import B.b;
import O.X;
import P.f;
import W.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.anythink.basead.exoplayer.h.o;
import java.util.WeakHashMap;
import l.C4648e;
import n3.C4756a;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public e f35823a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35824b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35825c;

    /* renamed from: d, reason: collision with root package name */
    public int f35826d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f35827e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f35828f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C4756a f35829g = new C4756a(this);

    @Override // B.b
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z3 = this.f35824b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z3 = coordinatorLayout.o((int) motionEvent.getX(), (int) motionEvent.getY(), view);
            this.f35824b = z3;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f35824b = false;
        }
        if (z3) {
            if (this.f35823a == null) {
                this.f35823a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f35829g);
            }
            if (!this.f35825c && this.f35823a.r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = X.f2054a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            X.l(o.f7742d, view);
            X.i(0, view);
            if (r(view)) {
                X.m(view, f.f2400l, new C4648e(3, this));
            }
        }
        return false;
    }

    @Override // B.b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f35823a == null) {
            return false;
        }
        if (this.f35825c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f35823a.k(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
