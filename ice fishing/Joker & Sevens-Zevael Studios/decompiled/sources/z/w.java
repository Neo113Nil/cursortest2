package z;

import android.os.Build;
import android.view.View;
import h3.a1;
import h3.x0;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w extends h3.z implements Runnable, h3.h, View.OnAttachStateChangeListener {

    /* renamed from: i, reason: collision with root package name */
    public final p0 f9035i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9036j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9037k;

    /* renamed from: l, reason: collision with root package name */
    public a1 f9038l;

    public w(p0 p0Var) {
        super(!p0Var.f9021r ? 1 : 0);
        this.f9035i = p0Var;
    }

    @Override // h3.h
    public final a1 a(View view, a1 a1Var) {
        this.f9038l = a1Var;
        p0 p0Var = this.f9035i;
        n0 n0Var = p0Var.f9019p;
        x0 x0Var = a1Var.f2745a;
        n0Var.f(u5.d.k(x0Var.f(8)));
        if (this.f9036j) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f9037k) {
            p0Var.f9020q.f(u5.d.k(x0Var.f(8)));
            p0.a(p0Var, a1Var);
        }
        return p0Var.f9021r ? a1.f2744b : a1Var;
    }

    @Override // h3.z
    public final void b(h3.i0 i0Var) {
        this.f9036j = false;
        this.f9037k = false;
        a1 a1Var = this.f9038l;
        if (i0Var.f2788a.b() != 0 && a1Var != null) {
            x0 x0Var = a1Var.f2745a;
            p0 p0Var = this.f9035i;
            p0Var.f9020q.f(u5.d.k(x0Var.f(8)));
            p0Var.f9019p.f(u5.d.k(x0Var.f(8)));
            p0.a(p0Var, a1Var);
        }
        this.f9038l = null;
    }

    @Override // h3.z
    public final void c() {
        this.f9036j = true;
        this.f9037k = true;
    }

    @Override // h3.z
    public final a1 d(a1 a1Var, List list) {
        p0 p0Var = this.f9035i;
        p0.a(p0Var, a1Var);
        return p0Var.f9021r ? a1.f2744b : a1Var;
    }

    @Override // h3.z
    public final x4.l e(h3.i0 i0Var, x4.l lVar) {
        this.f9036j = false;
        return lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9036j) {
            this.f9036j = false;
            this.f9037k = false;
            a1 a1Var = this.f9038l;
            if (a1Var != null) {
                p0 p0Var = this.f9035i;
                p0Var.f9020q.f(u5.d.k(a1Var.f2745a.f(8)));
                p0.a(p0Var, a1Var);
                this.f9038l = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
