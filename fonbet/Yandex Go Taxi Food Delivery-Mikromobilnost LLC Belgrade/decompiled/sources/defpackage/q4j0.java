package defpackage;

import androidx.media3.common.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class q4j0 extends s4j0 implements pgg {
    public final x7q0 y;

    public q4j0(a aVar, List list, x7q0 x7q0Var, ArrayList arrayList) {
        super(aVar, list, x7q0Var, arrayList);
        this.y = x7q0Var;
    }

    @Override // defpackage.pgg
    public final long C() {
        return this.y.d;
    }

    @Override // defpackage.pgg
    public final w6i0 G(long j) {
        return this.y.h(j, this);
    }

    @Override // defpackage.pgg
    public final boolean P() {
        return this.y.i();
    }

    @Override // defpackage.pgg
    public final long R(long j, long j2) {
        return this.y.b(j, j2);
    }

    @Override // defpackage.s4j0
    public final String a() {
        return null;
    }

    @Override // defpackage.s4j0
    public final pgg b() {
        return this;
    }

    @Override // defpackage.s4j0
    public final w6i0 c() {
        return null;
    }

    @Override // defpackage.pgg
    public final long f(long j) {
        return this.y.g(j);
    }

    @Override // defpackage.pgg
    public final long h(long j, long j2) {
        return this.y.e(j, j2);
    }

    @Override // defpackage.pgg
    public final long i(long j, long j2) {
        return this.y.c(j, j2);
    }

    @Override // defpackage.pgg
    public final long j(long j, long j2) {
        x7q0 x7q0Var = this.y;
        if (x7q0Var.f != null) {
            return -9223372036854775807L;
        }
        long b = x7q0Var.b(j, j2) + x7q0Var.c(j, j2);
        return (x7q0Var.e(b, j) + x7q0Var.g(b)) - x7q0Var.i;
    }

    @Override // defpackage.pgg
    public final long t(long j, long j2) {
        return this.y.f(j, j2);
    }

    @Override // defpackage.pgg
    public final long x(long j) {
        return this.y.d(j);
    }
}
