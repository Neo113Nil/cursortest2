package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z6r {
    public final String a;
    public final rv8 b;
    public final long c;
    public final boolean d;

    public z6r(String str, rv8 rv8Var, long j, boolean z) {
        str.getClass();
        rv8Var.getClass();
        this.a = str;
        this.b = rv8Var;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6r)) {
            return false;
        }
        z6r z6rVar = (z6r) obj;
        return Intrinsics.d(this.a, z6rVar.a) && Intrinsics.d(this.b, z6rVar.b) && this.c == z6rVar.c && this.d == z6rVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + tlm.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "SplashScreenData(screenId=" + this.a + ", divData=" + this.b + ", duration=" + this.c + ", isVibrationEnabled=" + this.d + ")";
    }
}
