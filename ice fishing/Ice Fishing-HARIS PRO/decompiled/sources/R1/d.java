package R1;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final d f1036d;

    static {
        int i = k.f1045c;
        int i2 = k.f1046d;
        long j = k.e;
        String str = k.f1043a;
        d dVar = new d();
        dVar.f1038c = new b(i, i2, j, str);
        f1036d = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // L1.AbstractC0015p
    public final String toString() {
        return "Dispatchers.Default";
    }
}
