package defpackage;

/* loaded from: classes4.dex */
public final class kpw extends mpw {
    public final int a;
    public final long b;

    public kpw(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.spw
    public final long a() {
        return this.b;
    }

    public final String toString() {
        return dfi.c(this.a, "Edit.Remove(at=", ")");
    }
}
