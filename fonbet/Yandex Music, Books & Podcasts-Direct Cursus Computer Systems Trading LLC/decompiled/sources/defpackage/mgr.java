package defpackage;

/* loaded from: classes5.dex */
public final class mgr implements sg2 {
    public static final mgr c;
    public long a;
    public long b;

    static {
        long j = -1;
        c = new mgr(j, j);
    }

    public mgr() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.sg2
    public long a() {
        return this.a;
    }

    @Override // defpackage.sg2
    public long b() {
        return this.b;
    }

    public /* synthetic */ mgr(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public mgr(int i, long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
