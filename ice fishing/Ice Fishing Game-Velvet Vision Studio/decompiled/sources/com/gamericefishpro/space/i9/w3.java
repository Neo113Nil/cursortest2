package com.gamericefishpro.space.i9;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w3 {
    public static final com.gamericefishpro.space.b8.k a;

    static {
        com.gamericefishpro.space.b8.k kVar;
        Uri uri = x3.a;
        synchronized (y3.class) {
            try {
                if (y3.a == null) {
                    com.gamericefishpro.space.b8.k kVar2 = new com.gamericefishpro.space.b8.k();
                    synchronized (y3.class) {
                        if (y3.a != null) {
                            throw new IllegalStateException("init() already called");
                        }
                        y3.a = kVar2;
                    }
                }
                kVar = y3.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        a = kVar;
    }
}
