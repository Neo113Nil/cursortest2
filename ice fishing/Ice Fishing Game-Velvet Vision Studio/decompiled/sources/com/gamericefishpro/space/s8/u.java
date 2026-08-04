package com.gamericefishpro.space.s8;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class u {
    public static final u c = new u(true, null, null);
    public final boolean a;
    public final Throwable b;

    public u(boolean z, String str, Exception exc) {
        this.a = z;
        this.b = exc;
    }

    public static u b(String str) {
        return new u(false, str, null);
    }

    public static u c(String str, Exception exc) {
        return new u(false, str, exc);
    }

    public void a() {
    }
}
