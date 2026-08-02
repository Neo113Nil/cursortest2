package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w3h {
    public final long a;
    public final String b;

    public w3h(long j, String str) {
        str.getClass();
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3h)) {
            return false;
        }
        w3h w3hVar = (w3h) obj;
        return this.a == w3hVar.a && Intrinsics.d(this.b, w3hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Lyric(time=" + this.a + ", line=" + this.b + ")";
    }
}
