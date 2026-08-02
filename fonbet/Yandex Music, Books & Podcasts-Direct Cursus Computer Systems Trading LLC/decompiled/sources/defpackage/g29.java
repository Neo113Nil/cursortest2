package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class g29 implements f29, yp8, p7t {
    public final /* synthetic */ zp8 a;
    public final /* synthetic */ q7t b;
    public jc8 c;
    public e23 d;
    public final ArrayList e;

    public g29() {
        zp8 zp8Var = new zp8();
        zp8Var.b = true;
        this.a = zp8Var;
        this.b = new q7t();
        this.e = new ArrayList();
    }

    public final void b(int i, int i2) {
        tp8 tp8Var = this.a.a;
        if (tp8Var != null) {
            tp8Var.h();
        }
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.b.d(view);
    }

    @Override // defpackage.p7t
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.a.g(e23Var, op8Var, view);
    }

    @Override // defpackage.f29
    public final e23 getBindingContext() {
        return this.d;
    }

    @Override // defpackage.f29
    public final jc8 getDiv() {
        return this.c;
    }

    @Override // defpackage.yp8
    public final tp8 getDivBorderDrawer() {
        return this.a.a;
    }

    @Override // defpackage.yp8
    public final boolean getNeedClipping() {
        return this.a.b;
    }

    @Override // defpackage.a0c
    public final List getSubscriptions() {
        return this.e;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.b.h(view);
    }

    @Override // defpackage.yp8
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.yp8
    public final void m() {
        this.a.m();
    }

    @Override // defpackage.f29
    public final void setBindingContext(e23 e23Var) {
        this.d = e23Var;
    }

    @Override // defpackage.f29
    public final void setDiv(jc8 jc8Var) {
        this.c = jc8Var;
    }

    @Override // defpackage.yp8
    public final void setNeedClipping(boolean z) {
        this.a.setNeedClipping(z);
    }
}
