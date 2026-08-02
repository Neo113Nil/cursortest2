package defpackage;

/* loaded from: classes10.dex */
public final class snz extends xlz {
    public int a;
    public final /* synthetic */ rnz b;

    public snz(rnz rnzVar) {
        this.b = rnzVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.j();
    }

    @Override // defpackage.xlz
    public final long nextLong() {
        int i = this.a;
        this.a = i + 1;
        return this.b.g(i);
    }
}
