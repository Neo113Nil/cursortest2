package com.gamericefishpro.space.c8;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Closeable {
    public com.gamericefishpro.space.nh.a d;
    public com.gamericefishpro.space.e4.g e;
    public com.gamericefishpro.space.nh.a i;
    public com.gamericefishpro.space.j8.e v;
    public com.gamericefishpro.space.nh.a w;
    public com.gamericefishpro.space.nh.a y;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((com.gamericefishpro.space.j8.i) ((com.gamericefishpro.space.j8.d) this.w.get())).close();
    }
}
