package com.gamericefishpro.space.o;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.a.a {
    public static volatile b d;
    public static final a e = new a(0);
    public final d c = new d();

    public static b M() {
        if (d != null) {
            return d;
        }
        synchronized (b.class) {
            try {
                if (d == null) {
                    d = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }
}
