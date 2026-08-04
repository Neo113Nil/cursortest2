package com.gamericefishpro.space.d0;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends com.gamericefishpro.space.d4.o0 implements Runnable, com.gamericefishpro.space.d4.p, View.OnAttachStateChangeListener {
    public final m1 i;
    public boolean v;
    public boolean w;
    public com.gamericefishpro.space.d4.o1 y;

    public l0(m1 m1Var) {
        super(!m1Var.s ? 1 : 0);
        this.i = m1Var;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final void d(com.gamericefishpro.space.d4.x0 x0Var) {
        this.v = false;
        this.w = false;
        com.gamericefishpro.space.d4.o1 o1Var = this.y;
        if (x0Var.a.b() > 0 && o1Var != null) {
            com.gamericefishpro.space.d4.l1 l1Var = o1Var.a;
            m1 m1Var = this.i;
            m1Var.r.f(j.p(l1Var.g(8)));
            m1Var.q.f(j.p(l1Var.g(8)));
            m1.a(m1Var, o1Var);
        }
        this.y = null;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final void e() {
        this.v = true;
        this.w = true;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final com.gamericefishpro.space.d4.o1 f(com.gamericefishpro.space.d4.o1 o1Var, List list) {
        m1 m1Var = this.i;
        m1.a(m1Var, o1Var);
        return m1Var.s ? com.gamericefishpro.space.d4.o1.b : o1Var;
    }

    @Override // com.gamericefishpro.space.d4.o0
    public final com.gamericefishpro.space.u6.e g(com.gamericefishpro.space.d4.x0 x0Var, com.gamericefishpro.space.u6.e eVar) {
        this.v = false;
        return eVar;
    }

    @Override // com.gamericefishpro.space.d4.p
    public final com.gamericefishpro.space.d4.o1 l(View view, com.gamericefishpro.space.d4.o1 o1Var) {
        this.y = o1Var;
        m1 m1Var = this.i;
        j1 j1Var = m1Var.q;
        com.gamericefishpro.space.d4.l1 l1Var = o1Var.a;
        j1Var.f(j.p(l1Var.g(8)));
        if (this.v) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.w) {
            m1Var.r.f(j.p(l1Var.g(8)));
            m1.a(m1Var, o1Var);
        }
        return m1Var.s ? com.gamericefishpro.space.d4.o1.b : o1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.v) {
            this.v = false;
            this.w = false;
            com.gamericefishpro.space.d4.o1 o1Var = this.y;
            if (o1Var != null) {
                m1 m1Var = this.i;
                m1Var.r.f(j.p(o1Var.a.g(8)));
                m1.a(m1Var, o1Var);
                this.y = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
