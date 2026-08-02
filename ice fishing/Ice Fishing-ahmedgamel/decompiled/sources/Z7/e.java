package Z7;

/* loaded from: classes2.dex */
public final class e extends h {

    /* renamed from: w, reason: collision with root package name */
    public static final e f4187w;

    static {
        int i = k.f4195c;
        int i4 = k.f4196d;
        long j6 = k.f4197e;
        String str = k.f4193a;
        e eVar = new e();
        eVar.f4189v = new c(i, i4, str, j6);
        f4187w = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // S7.AbstractC0406u
    public final String toString() {
        return "Dispatchers.Default";
    }
}
