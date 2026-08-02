package defpackage;

/* loaded from: classes5.dex */
public abstract class ysc implements n3r {
    public final n3r a;

    public ysc(n3r n3rVar) {
        n3rVar.getClass();
        this.a = n3rVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.n3r
    public long e0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        return this.a.e0(hi3Var, j);
    }

    @Override // defpackage.n3r
    public final vis i() {
        return this.a.i();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
