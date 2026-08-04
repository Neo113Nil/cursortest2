package com.gamericefishpro.space.g0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final int a;

    public a(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        com.gamericefishpro.space.c0.a.a("Provided count should be larger than zero");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}
