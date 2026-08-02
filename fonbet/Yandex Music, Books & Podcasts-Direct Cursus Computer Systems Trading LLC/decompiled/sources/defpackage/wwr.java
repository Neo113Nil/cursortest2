package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wwr {
    public final long a;
    public final String b;

    public wwr(long j, String str) {
        str.getClass();
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwr)) {
            return false;
        }
        wwr wwrVar = (wwr) obj;
        return this.a == wwrVar.a && Intrinsics.d(this.b, wwrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SyncLyricsLine(time=" + this.a + ", line=" + this.b + ")";
    }
}
