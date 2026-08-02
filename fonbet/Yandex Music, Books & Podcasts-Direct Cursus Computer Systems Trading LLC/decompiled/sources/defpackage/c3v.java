package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c3v {
    public final String a;
    public final m3v b;
    public final boolean c;

    public c3v(m3v m3vVar, String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = m3vVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3v)) {
            return false;
        }
        c3v c3vVar = (c3v) obj;
        return Intrinsics.d(this.a, c3vVar.a) && this.b == c3vVar.b && this.c == c3vVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WaveScreenQueueInfo(description=");
        sb.append(this.a);
        sb.append(", waveType=");
        sb.append(this.b);
        sb.append(", isPlaying=");
        return ouj.r(sb, this.c, ")");
    }
}
