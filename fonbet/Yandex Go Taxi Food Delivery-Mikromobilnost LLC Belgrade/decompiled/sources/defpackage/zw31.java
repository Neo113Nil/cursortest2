package defpackage;

import androidx.camera.core.j;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes10.dex */
public final class zw31 implements br7 {
    public final br7 a;
    public final cx31 b;
    public final dx31 c;
    public final ax31 w;

    public zw31(br7 br7Var, ax31 ax31Var, ykn0 ykn0Var) {
        this.a = br7Var;
        this.w = ax31Var;
        this.b = new cx31(br7Var.l(), ykn0Var);
        this.c = new dx31(br7Var.f());
    }

    @Override // defpackage.br7
    public final gq60 a() {
        return this.a.a();
    }

    @Override // defpackage.si21
    public final void e(j jVar) {
        tob1.b();
        this.w.e(jVar);
    }

    @Override // defpackage.br7
    public final ar7 f() {
        return this.c;
    }

    @Override // defpackage.br7
    public final void h(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.si21
    public final void k(j jVar) {
        tob1.b();
        this.w.k(jVar);
    }

    @Override // defpackage.br7
    public final qp7 l() {
        return this.b;
    }

    @Override // defpackage.br7
    public final void o(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.si21
    public final void p(j jVar) {
        tob1.b();
        this.w.p(jVar);
    }

    @Override // defpackage.br7
    public final boolean q() {
        return false;
    }

    @Override // defpackage.si21
    public final void r(j jVar) {
        tob1.b();
        this.w.r(jVar);
    }

    @Override // defpackage.br7
    public final euy release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
