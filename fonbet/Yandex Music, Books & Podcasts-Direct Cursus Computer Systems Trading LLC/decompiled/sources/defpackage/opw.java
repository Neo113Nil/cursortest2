package defpackage;

/* loaded from: classes4.dex */
public final class opw extends spw {
    public final int a;
    public final long b;
    public final long c;
    public final long d;

    public opw(long j, long j2, int i, long j3) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // defpackage.spw
    public final long a() {
        return this.d;
    }

    public final String toString() {
        return "Prev(at=" + this.a + ", since=" + this.b + "/" + this.c + ")";
    }
}
