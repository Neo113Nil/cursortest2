package com.google.android.material.behavior;

import B.b;
import O.X;
import P.f;
import W.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.anythink.basead.exoplayer.h.o;
import h.C4543G;
import java.util.WeakHashMap;
import p3.C4836a;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public e f36591a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f36592b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36593c;

    /* renamed from: d, reason: collision with root package name */
    public int f36594d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f36595e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f36596f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C4836a f36597g = new C4836a(this);

    @Override // B.b
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z6 = this.f36592b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z6 = coordinatorLayout.o((int) motionEvent.getX(), (int) motionEvent.getY(), view);
            this.f36592b = z6;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f36592b = false;
        }
        if (z6) {
            if (this.f36591a == null) {
                this.f36591a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f36597g);
            }
            if (!this.f36593c && this.f36591a.r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = X.f2142a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            X.l(o.f8528d, view);
            X.i(0, view);
            if (r(view)) {
                X.m(view, f.f2331l, new C4543G(this));
            }
        }
        return false;
    }

    @Override // B.b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f36591a == null) {
            return false;
        }
        if (this.f36593c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f36591a.k(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
