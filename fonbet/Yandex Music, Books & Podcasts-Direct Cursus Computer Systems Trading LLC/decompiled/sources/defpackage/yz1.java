package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yz1 {
    public final z77 a;
    public final String b;

    public yz1(z77 z77Var, String str) {
        z77Var.getClass();
        str.getClass();
        this.a = z77Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz1)) {
            return false;
        }
        yz1 yz1Var = (yz1) obj;
        return Intrinsics.d(this.a, yz1Var.a) && Intrinsics.d(this.b, yz1Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthTokenRequestImpl(environment=");
        sb.append(this.a);
        sb.append(", userId=");
        return su4.o(sb, this.b, ", shouldRefreshToken=false)");
    }
}
