package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sfr implements tfr {
    public final rv8 a;

    public sfr(rv8 rv8Var) {
        rv8Var.getClass();
        this.a = rv8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfr) && Intrinsics.d(this.a, ((sfr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(divData=" + this.a + ")";
    }
}
