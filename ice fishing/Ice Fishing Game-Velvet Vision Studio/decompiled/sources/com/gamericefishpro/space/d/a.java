package com.gamericefishpro.space.d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public a(com.gamericefishpro.space.j5.b navigationEvent) {
        Intrinsics.checkNotNullParameter(navigationEvent, "navigationEvent");
        float f = navigationEvent.c;
        float f2 = navigationEvent.d;
        float f3 = navigationEvent.b;
        int i = navigationEvent.a;
        long j = navigationEvent.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
