package defpackage;

/* loaded from: classes5.dex */
public final class pyo extends qyo {
    public final long c;
    public final long d;

    public pyo(long j, long j2) {
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyo)) {
            return false;
        }
        pyo pyoVar = (pyo) obj;
        return this.c == pyoVar.c && this.d == pyoVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SCT timestamp, ");
        sb.append(this.c);
        sb.append(", is greater than the log server validity, ");
        return eta.g(sb, this.d, '.');
    }
}
