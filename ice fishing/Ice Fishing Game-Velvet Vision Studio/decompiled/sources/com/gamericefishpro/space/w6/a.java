package com.gamericefishpro.space.w6;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a c;
    public static final a d;
    public final boolean a;
    public final Throwable b;

    static {
        if (h.v) {
            d = null;
            c = null;
        } else {
            d = new a(null, false);
            c = new a(null, true);
        }
    }

    public a(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
