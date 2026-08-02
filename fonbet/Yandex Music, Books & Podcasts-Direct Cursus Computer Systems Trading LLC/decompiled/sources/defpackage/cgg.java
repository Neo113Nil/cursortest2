package defpackage;

/* loaded from: classes6.dex */
public final class cgg {
    public final long a;
    public final boolean b;

    public cgg(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgg)) {
            return false;
        }
        cgg cggVar = (cgg) obj;
        return this.a == cggVar.a && this.b == cggVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadedChunk(timestamp=");
        sb.append(this.a);
        sb.append(", isSuccessful=");
        return dfi.j(sb, this.b, ')');
    }
}
