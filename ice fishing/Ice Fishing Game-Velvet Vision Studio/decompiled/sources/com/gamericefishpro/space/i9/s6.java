package com.gamericefishpro.space.i9;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s6 {
    public final Unsafe a;

    public s6(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract void a(Object obj, long j, byte b);

    public abstract boolean b(long j, Object obj);

    public abstract void c(Object obj, long j, boolean z);

    public abstract float d(long j, Object obj);

    public abstract void e(Object obj, long j, float f);

    public abstract double f(long j, Object obj);

    public abstract void g(Object obj, long j, double d);
}
