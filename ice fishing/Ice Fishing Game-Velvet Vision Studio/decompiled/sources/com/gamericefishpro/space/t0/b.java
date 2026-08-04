package com.gamericefishpro.space.t0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i {
    public final int f;

    public b(int i) {
        this.f = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f == this.f;
    }

    public final int hashCode() {
        return this.f * 31;
    }
}
