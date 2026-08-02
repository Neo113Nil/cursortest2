package defpackage;

/* loaded from: classes.dex */
public final class pcn {
    public final onh a;
    public final long b;
    public final long c;

    public pcn(onh onhVar, long j, long j2) {
        this.a = onhVar;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcn)) {
            return false;
        }
        pcn pcnVar = (pcn) obj;
        return this.b == pcnVar.b && this.a.equals(pcnVar.a) && this.c == pcnVar.c;
    }

    public final int hashCode() {
        long j = this.b;
        int hashCode = (this.a.hashCode() + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        long j2 = this.c;
        return hashCode + ((int) ((j2 >>> 32) ^ j2));
    }
}
