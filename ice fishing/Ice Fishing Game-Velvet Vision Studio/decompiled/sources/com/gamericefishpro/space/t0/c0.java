package com.gamericefishpro.space.t0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends com.gamericefishpro.space.f1.e0 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public com.gamericefishpro.space.t.c0 e;
    public Object f;
    public int g;

    public c0(long j) {
        super(j);
        com.gamericefishpro.space.t.c0 c0Var = com.gamericefishpro.space.t.m0.a;
        Intrinsics.c(c0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.e = c0Var;
        this.f = h;
    }

    @Override // com.gamericefishpro.space.f1.e0
    public final void a(com.gamericefishpro.space.f1.e0 e0Var) {
        Intrinsics.c(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        c0 c0Var = (c0) e0Var;
        this.e = c0Var.e;
        this.f = c0Var.f;
        this.g = c0Var.g;
    }

    @Override // com.gamericefishpro.space.f1.e0
    public final com.gamericefishpro.space.f1.e0 b(long j) {
        return new c0(j);
    }

    public final boolean c(d0 d0Var, com.gamericefishpro.space.f1.g gVar) {
        boolean z;
        boolean z2;
        Object obj = com.gamericefishpro.space.f1.p.c;
        synchronized (obj) {
            z = true;
            z2 = (this.c == gVar.g() && this.d == gVar.h()) ? false : true;
        }
        if (this.f == h || (z2 && this.g != d(d0Var, gVar))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = gVar.g();
            this.d = gVar.h();
            Unit unit = Unit.a;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d6 A[LOOP:4: B:48:0x00d4->B:49:0x00d6, LOOP_END] */
    public final int d(d0 d0Var, com.gamericefishpro.space.f1.g gVar) throws Throwable {
        com.gamericefishpro.space.t.c0 c0Var;
        int iIdentityHashCode;
        Object[] objArr;
        int i;
        int i2;
        long[] jArr;
        int i3;
        int i4;
        int i5;
        com.gamericefishpro.space.f1.e0 e0VarG;
        synchronized (com.gamericefishpro.space.f1.p.c) {
            c0Var = this.e;
        }
        int i6 = 7;
        if (c0Var.e == 0) {
            return 7;
        }
        com.gamericefishpro.space.v0.e eVarO = i.o();
        Object[] objArr2 = eVarO.d;
        int i7 = eVarO.i;
        for (int i8 = 0; i8 < i7; i8++) {
            ((com.gamericefishpro.space.f1.w) objArr2[i8]).b();
        }
        try {
            Object[] objArr3 = c0Var.b;
            int[] iArr = c0Var.c;
            long[] jArr2 = c0Var.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i9 = 0;
                while (true) {
                    long j = jArr2[i9];
                    if ((((~j) << i6) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j & 255) < 128) {
                                int i13 = (i9 << 3) + i12;
                                Object obj = objArr3[i13];
                                i4 = i6;
                                int i14 = iArr[i13];
                                i5 = i10;
                                com.gamericefishpro.space.f1.c0 c0Var2 = (com.gamericefishpro.space.f1.c0) obj;
                                if (i14 == 1) {
                                    if (c0Var2 instanceof d0) {
                                        try {
                                            d0 d0Var2 = (d0) c0Var2;
                                            e0VarG = d0Var2.g((c0) com.gamericefishpro.space.f1.p.i(d0Var2.v, gVar), gVar, false, d0Var2.e);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr4 = eVarO.d;
                                            int i15 = eVarO.i;
                                            for (int i16 = 0; i16 < i15; i16++) {
                                                ((com.gamericefishpro.space.f1.w) objArr4[i16]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        e0VarG = com.gamericefishpro.space.f1.p.i(c0Var2.c(), gVar);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(e0VarG)) * 31) + Long.hashCode(e0VarG.a);
                                }
                            } else {
                                i4 = i6;
                                i5 = i10;
                            }
                            j >>= i5;
                            i12++;
                            i6 = i4;
                            jArr2 = jArr2;
                            i10 = i5;
                        }
                        jArr = jArr2;
                        i3 = i6;
                        if (i11 != i10) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                        i3 = i6;
                    }
                    if (i9 != length) {
                        i9++;
                        i6 = i3;
                        jArr2 = jArr;
                    } else {
                        i6 = iIdentityHashCode;
                    }
                }
                Unit unit = Unit.a;
                objArr = eVarO.d;
                i = eVarO.i;
                for (i2 = 0; i2 < i; i2++) {
                    ((com.gamericefishpro.space.f1.w) objArr[i2]).a();
                }
                return iIdentityHashCode;
            }
            iIdentityHashCode = i6;
            Unit unit2 = Unit.a;
            objArr = eVarO.d;
            i = eVarO.i;
            while (i2 < i) {
                ((com.gamericefishpro.space.f1.w) objArr[i2]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
