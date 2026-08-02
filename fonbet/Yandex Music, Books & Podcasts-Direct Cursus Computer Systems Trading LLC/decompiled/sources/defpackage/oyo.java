package defpackage;

/* loaded from: classes5.dex */
public final class oyo extends qyo {
    public final long c;
    public final long d;

    public oyo(long j, long j2) {
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyo)) {
            return false;
        }
        oyo oyoVar = (oyo) obj;
        return this.c == oyoVar.c && this.d == oyoVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SCT timestamp, ");
        sb.append(this.c);
        sb.append(", is in the future, current timestamp is ");
        return eta.g(sb, this.d, '.');
    }
}
