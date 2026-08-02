package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class iwu {
    public final s9p a;
    public final xku b;

    public iwu(s9p s9pVar, xku xkuVar) {
        s9pVar.getClass();
        this.a = s9pVar;
        this.b = xkuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwu)) {
            return false;
        }
        iwu iwuVar = (iwu) obj;
        return Intrinsics.d(this.a, iwuVar.a) && this.b == iwuVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveInfo(seeds=" + this.a + ", waveType=" + this.b + ")";
    }
}
