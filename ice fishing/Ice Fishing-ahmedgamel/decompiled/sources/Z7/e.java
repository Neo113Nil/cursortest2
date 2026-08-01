package Z7;

/* loaded from: classes2.dex */
public final class e extends h {

    /* renamed from: w, reason: collision with root package name */
    public static final e f4209w;

    static {
        int i = k.f4217c;
        int i6 = k.f4218d;
        long j6 = k.f4219e;
        String str = k.f4215a;
        e eVar = new e();
        eVar.f4211v = new c(i, i6, str, j6);
        f4209w = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // S7.AbstractC0402u
    public final String toString() {
        return "Dispatchers.Default";
    }
}
