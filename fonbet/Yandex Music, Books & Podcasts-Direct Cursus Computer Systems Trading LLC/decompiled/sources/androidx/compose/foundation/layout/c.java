package androidx.compose.foundation.layout;

import defpackage.b2c;
import defpackage.dh3;
import defpackage.dnr;
import defpackage.g40;
import defpackage.ga6;
import defpackage.jx7;
import defpackage.yci;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements dh3 {
    public final jx7 a;
    public final long b;

    public c(dnr dnrVar, long j) {
        this.a = dnrVar;
        this.b = j;
    }

    @Override // defpackage.dh3
    public final yci a(yci yciVar, g40 g40Var) {
        return yciVar.f(new BoxChildDataElement(g40Var, false));
    }

    @Override // defpackage.dh3
    public final yci b(yci yciVar) {
        return yciVar.f(new BoxChildDataElement(b2c.f, true));
    }

    public final float c() {
        long j = this.b;
        if (!ga6.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.c0(ga6.h(j));
    }

    public final float d() {
        long j = this.b;
        if (!ga6.e(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.c0(ga6.i(j));
    }

    public final float e() {
        return this.a.c0(ga6.k(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && ga6.c(this.b, cVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) ga6.m(this.b)) + ')';
    }
}
