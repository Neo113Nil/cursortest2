package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yow extends zow {
    public final h4q a;
    public final long b;

    public yow(h4q h4qVar, long j) {
        h4qVar.getClass();
        this.a = h4qVar;
        this.b = j;
    }

    @Override // defpackage.zow
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yow)) {
            return false;
        }
        yow yowVar = (yow) obj;
        return Intrinsics.d(this.a, yowVar.a) && this.b == yowVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return ouj.m("Speed(", this.a.a, ")");
    }
}
