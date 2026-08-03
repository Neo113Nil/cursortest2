package fd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: j, reason: collision with root package name */
    public static final e f2379j;

    static {
        int i10 = l.f2388c;
        int i11 = l.f2389d;
        long j3 = l.f2390e;
        String str = l.f2386a;
        e eVar = new e();
        eVar.f2381i = new c(i10, i11, j3, str);
        f2379j = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // yc.u
    public final String toString() {
        return "Dispatchers.Default";
    }
}
