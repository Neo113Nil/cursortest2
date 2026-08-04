package com.gamericefishpro.space.q0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final long a = com.gamericefishpro.space.o1.s.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return com.gamericefishpro.space.o1.s.d(this.a, ((t) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = com.gamericefishpro.space.o1.s.h;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) com.gamericefishpro.space.o1.s.j(this.a)) + ", rippleAlpha=null)";
    }
}
