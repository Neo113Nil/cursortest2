package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class t1u {
    public final s9p a;
    public final String b;

    public t1u(s9p s9pVar, String str) {
        s9pVar.getClass();
        str.getClass();
        this.a = s9pVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1u)) {
            return false;
        }
        t1u t1uVar = (t1u) obj;
        return Intrinsics.d(this.a, t1uVar.a) && Intrinsics.d(this.b, t1uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "VibePlaybackData(seeds=" + this.a + ", contextName=" + this.b + ")";
    }
}
