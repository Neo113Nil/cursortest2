package defpackage;

/* loaded from: classes4.dex */
public final class ppw extends spw {
    public final nyn a;
    public final long b;

    public ppw(nyn nynVar, long j) {
        this.a = nynVar;
        this.b = j;
    }

    @Override // defpackage.spw
    public final long a() {
        return this.b;
    }

    public final String toString() {
        return hrg.q("Repeat(", this.a.name(), ")");
    }
}
