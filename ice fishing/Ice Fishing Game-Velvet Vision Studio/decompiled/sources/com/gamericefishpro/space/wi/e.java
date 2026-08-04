package com.gamericefishpro.space.wi;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h {
    public static final e v;

    static {
        int i = k.c;
        int i2 = k.d;
        long j = k.e;
        String str = k.a;
        e eVar = new e();
        eVar.i = new c(str, i, i2, j);
        v = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.gamericefishpro.space.pi.t
    public final String toString() {
        return "Dispatchers.Default";
    }
}
