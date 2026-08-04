package com.gamericefishpro.space.k0;

import com.gamericefishpro.space.c3.l;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.o1.c0;
import com.gamericefishpro.space.o1.d0;
import com.gamericefishpro.space.o1.k0;
import com.gamericefishpro.space.o1.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements k0 {
    public final a a;
    public final a b;
    public final a c;
    public final a d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public static d b(d dVar, a aVar, a aVar2, a aVar3, a aVar4, int i) {
        if ((i & 1) != 0) {
            aVar = dVar.a;
        }
        if ((i & 2) != 0) {
            aVar2 = dVar.b;
        }
        if ((i & 4) != 0) {
            aVar3 = dVar.c;
        }
        if ((i & 8) != 0) {
            aVar4 = dVar.d;
        }
        dVar.getClass();
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    @Override // com.gamericefishpro.space.o1.k0
    public final o a(long j, l lVar, com.gamericefishpro.space.c3.c cVar) {
        float fA = this.a.a(j, cVar);
        float fA2 = this.b.a(j, cVar);
        float fA3 = this.c.a(j, cVar);
        float fA4 = this.d.a(j, cVar);
        float fB = com.gamericefishpro.space.n1.e.b(j);
        float f = fA + fA4;
        if (f > fB) {
            float f2 = fB / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fB) {
            float f4 = fB / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            com.gamericefishpro.space.c0.a.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new c0(d5.h(0L, j));
        }
        com.gamericefishpro.space.n1.c cVarH = d5.h(0L, j);
        l lVar2 = l.d;
        float f5 = lVar == lVar2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (lVar == lVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f6 = lVar == lVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (lVar != lVar2) {
            fA4 = fA3;
        }
        return new d0(new com.gamericefishpro.space.n1.d(cVarH.a, cVarH.b, cVarH.c, cVarH.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.a, dVar.a) && Intrinsics.a(this.b, dVar.b) && Intrinsics.a(this.c, dVar.c) && Intrinsics.a(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
