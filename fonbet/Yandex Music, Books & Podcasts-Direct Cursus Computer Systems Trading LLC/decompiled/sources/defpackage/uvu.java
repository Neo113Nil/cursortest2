package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class uvu {
    public final s9p a;
    public final String b;

    public uvu(s9p s9pVar, String str) {
        s9pVar.getClass();
        str.getClass();
        this.a = s9pVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvu)) {
            return false;
        }
        uvu uvuVar = (uvu) obj;
        return Intrinsics.d(this.a, uvuVar.a) && Intrinsics.d(this.b, uvuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "WavePlaybackData(seeds=" + this.a + ", contextName=" + this.b + ")";
    }
}
