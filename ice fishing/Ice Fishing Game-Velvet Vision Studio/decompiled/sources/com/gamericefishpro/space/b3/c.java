package com.gamericefishpro.space.b3;

import com.gamericefishpro.space.oh.w;
import com.gamericefishpro.space.oh.x;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {
    public final long a;

    public c(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        com.gamericefishpro.space.w2.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // com.gamericefishpro.space.b3.o
    public final float a() {
        return com.gamericefishpro.space.o1.s.e(this.a);
    }

    @Override // com.gamericefishpro.space.b3.o
    public final long b() {
        return this.a;
    }

    @Override // com.gamericefishpro.space.b3.o
    public final com.gamericefishpro.space.o1.o c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && com.gamericefishpro.space.o1.s.d(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        int i = com.gamericefishpro.space.o1.s.h;
        w wVar = x.d;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) com.gamericefishpro.space.o1.s.j(this.a)) + ')';
    }
}
