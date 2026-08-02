package defpackage;

/* loaded from: classes4.dex */
public final class jpw extends mpw {
    public final int a;
    public final int b;
    public final long c;

    public jpw(long j, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    @Override // defpackage.spw
    public final long a() {
        return this.c;
    }

    public final String toString() {
        return dfi.f("Edit.Mode(from=", this.a, this.b, ", to=", ")");
    }
}
