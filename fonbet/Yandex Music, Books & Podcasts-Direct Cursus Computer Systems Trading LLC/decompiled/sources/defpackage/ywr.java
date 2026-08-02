package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ywr {
    public final long a;
    public final String b;

    public ywr(long j, String str) {
        str.getClass();
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywr)) {
            return false;
        }
        ywr ywrVar = (ywr) obj;
        return this.a == ywrVar.a && Intrinsics.d(this.b, ywrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Lyric(time=" + this.a + ", line=" + this.b + ")";
    }
}
