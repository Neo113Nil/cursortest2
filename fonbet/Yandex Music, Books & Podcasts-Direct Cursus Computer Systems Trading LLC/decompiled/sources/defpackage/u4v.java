package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u4v implements v4v {
    public final s9p a;
    public final boolean b;

    public u4v(s9p s9pVar, boolean z) {
        s9pVar.getClass();
        this.a = s9pVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4v)) {
            return false;
        }
        u4v u4vVar = (u4v) obj;
        return Intrinsics.d(this.a, u4vVar.a) && this.b == u4vVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Seeds(seeds=" + this.a + ", interactive=" + this.b + ")";
    }
}
