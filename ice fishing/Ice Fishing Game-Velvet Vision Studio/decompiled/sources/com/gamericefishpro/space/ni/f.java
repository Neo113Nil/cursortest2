package com.gamericefishpro.space.ni;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final f a = new f();
    public static final long b = System.nanoTime();

    public static long a() {
        return System.nanoTime() - b;
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
