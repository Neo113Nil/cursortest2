package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pk extends wq {
    public static final pk encWxUiV2;
    public oh AvO7iQsrTN;

    static {
        int i = w71.X1lG3V04pd;
        int i2 = w71.xqGvceK5x;
        long j = w71.OOA6hdeuvCS;
        String str = w71.GWasM1elztuh;
        pk pkVar = new pk();
        pkVar.AvO7iQsrTN = new oh(i, i2, j, str);
        encWxUiV2 = pkVar;
    }

    @Override // defpackage.ih
    public final void OOA6hdeuvCS(gh ghVar, Runnable runnable) {
        oh.X1lG3V04pd(this.AvO7iQsrTN, runnable, 6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.ih
    public final String toString() {
        return "Dispatchers.Default";
    }
}
