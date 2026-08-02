package defpackage;

/* loaded from: classes9.dex */
public final class sjh extends mom0 {
    public static final sjh c = new sjh(otx0.c, otx0.d, otx0.a, otx0.e);

    @Override // defpackage.jse
    public final jse P(int i) {
        cma1.n(i);
        return i >= otx0.c ? this : super.P(i);
    }

    @Override // defpackage.mom0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.jse
    public final String toString() {
        return "Dispatchers.Default";
    }
}
