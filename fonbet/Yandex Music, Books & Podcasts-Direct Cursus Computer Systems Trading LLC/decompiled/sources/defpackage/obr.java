package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class obr implements rzt {
    public final rzt a;
    public final long b;

    public obr(rzt rztVar, long j) {
        this.a = rztVar;
        this.b = j;
    }

    @Override // defpackage.rzt
    public final cn0 A(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        long j2 = this.b;
        return j < j2 ? cn0Var : this.a.A(j - j2, cn0Var, cn0Var2, cn0Var3);
    }

    @Override // defpackage.rzt
    public final boolean a() {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof obr)) {
            return false;
        }
        obr obrVar = (obr) obj;
        return obrVar.b == this.b && Intrinsics.d(obrVar.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.rzt
    public final long m(cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return this.a.m(cn0Var, cn0Var2, cn0Var3) + this.b;
    }

    @Override // defpackage.rzt
    public final cn0 x(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        long j2 = this.b;
        return j < j2 ? cn0Var3 : this.a.x(j - j2, cn0Var, cn0Var2, cn0Var3);
    }
}
