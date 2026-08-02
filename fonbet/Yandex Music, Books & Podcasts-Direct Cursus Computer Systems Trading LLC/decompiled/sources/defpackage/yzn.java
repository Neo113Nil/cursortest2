package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class yzn extends a0o implements o97 {
    public final zap f;

    public yzn(dsc dscVar, List list, zap zapVar, ArrayList arrayList) {
        super(dscVar, list, zapVar, arrayList);
        this.f = zapVar;
    }

    @Override // defpackage.o97
    public final boolean G() {
        return this.f.i();
    }

    @Override // defpackage.o97
    public final long H() {
        return this.f.d;
    }

    @Override // defpackage.o97
    public final long J(long j, long j2) {
        return this.f.b(j, j2);
    }

    @Override // defpackage.a0o
    public final String a() {
        return null;
    }

    @Override // defpackage.o97
    public final long c(long j) {
        return this.f.g(j);
    }

    @Override // defpackage.a0o
    public final whn d() {
        return null;
    }

    @Override // defpackage.o97
    public final long f(long j, long j2) {
        return this.f.e(j, j2);
    }

    @Override // defpackage.o97
    public final long i(long j, long j2) {
        return this.f.c(j, j2);
    }

    @Override // defpackage.o97
    public final long j(long j, long j2) {
        zap zapVar = this.f;
        if (zapVar.f != null) {
            return -9223372036854775807L;
        }
        long b = zapVar.b(j, j2) + zapVar.c(j, j2);
        return (zapVar.e(b, j) + zapVar.g(b)) - zapVar.i;
    }

    @Override // defpackage.o97
    public final whn k(long j) {
        return this.f.h(this, j);
    }

    @Override // defpackage.o97
    public final long p(long j, long j2) {
        return this.f.f(j, j2);
    }

    @Override // defpackage.o97
    public final long z(long j) {
        return this.f.d(j);
    }

    @Override // defpackage.a0o
    public final o97 b() {
        return this;
    }
}
