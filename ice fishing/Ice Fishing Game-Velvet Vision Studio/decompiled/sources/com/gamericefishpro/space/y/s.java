package com.gamericefishpro.space.y;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public com.gamericefishpro.space.o1.f a = null;
    public com.gamericefishpro.space.o1.b b = null;
    public com.gamericefishpro.space.q1.b c = null;
    public com.gamericefishpro.space.o1.h d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.a(this.a, sVar.a) && Intrinsics.a(this.b, sVar.b) && Intrinsics.a(this.c, sVar.c) && Intrinsics.a(this.d, sVar.d);
    }

    public final int hashCode() {
        com.gamericefishpro.space.o1.f fVar = this.a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        com.gamericefishpro.space.o1.b bVar = this.b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        com.gamericefishpro.space.q1.b bVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        com.gamericefishpro.space.o1.h hVar = this.d;
        return iHashCode3 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
