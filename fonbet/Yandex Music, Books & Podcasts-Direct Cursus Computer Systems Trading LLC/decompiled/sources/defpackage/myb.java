package defpackage;

/* loaded from: classes5.dex */
public final class myb {
    public final j7a a;
    public final long b;

    public myb(j7a j7aVar, long j) {
        this.a = j7aVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myb)) {
            return false;
        }
        myb mybVar = (myb) obj;
        return this.a.equals(mybVar.a) && nsa.e(this.b, mybVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        msa msaVar = nsa.b;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return "CacheEntry(data=" + this.a + ", expireTime=" + ((Object) nsa.t(this.b)) + ')';
    }
}
