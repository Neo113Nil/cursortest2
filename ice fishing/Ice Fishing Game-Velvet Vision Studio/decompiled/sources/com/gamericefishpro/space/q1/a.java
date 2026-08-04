package com.gamericefishpro.space.q1;

import com.gamericefishpro.space.c3.l;
import com.gamericefishpro.space.o1.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public com.gamericefishpro.space.c3.c a;
    public l b;
    public q c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.a, aVar.a) && this.b == aVar.b && Intrinsics.a(this.c, aVar.c) && com.gamericefishpro.space.n1.e.a(this.d, aVar.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) com.gamericefishpro.space.n1.e.d(this.d)) + ')';
    }
}
