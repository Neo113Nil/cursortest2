package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0g {
    public final q0g a;
    public final String b;
    public final long c;

    public p0g(q0g q0gVar, String str, long j) {
        str.getClass();
        this.a = q0gVar;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0g)) {
            return false;
        }
        p0g p0gVar = (p0g) obj;
        return this.a == p0gVar.a && Intrinsics.d(this.b, p0gVar.b) && this.c == p0gVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoClipLikeOperation(type=");
        sb.append(this.a);
        sb.append(", videoClipId=");
        sb.append(this.b);
        sb.append(", timestampMills=");
        return hrg.m(this.c, ")", sb);
    }
}
