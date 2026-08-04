package com.gamericefishpro.space.h0;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final com.gamericefishpro.space.t.h0 a;
    public com.gamericefishpro.space.f1.z b;
    public final com.gamericefishpro.space.t.i0 c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final com.gamericefishpro.space.h1.m i;

    public w() {
        long[] jArr = com.gamericefishpro.space.t.p0.a;
        this.a = new com.gamericefishpro.space.t.h0();
        com.gamericefishpro.space.t.i0 i0Var = com.gamericefishpro.space.t.q0.a;
        this.c = new com.gamericefishpro.space.t.i0();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new t(this);
    }

    public static int e(int[] iArr, e0 e0Var) {
        int i = e0Var.i();
        int iG = e0Var.g() + i;
        int iMax = 0;
        while (i < iG) {
            int iE = e0Var.e() + iArr[i];
            iArr[i] = iE;
            iMax = Math.max(iMax, iE);
            i++;
        }
        return iMax;
    }

    public final void a(int i, Object obj) {
        com.gamericefishpro.space.m5.a.s(this.a.g(obj));
    }

    public final long b() {
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        com.gamericefishpro.space.m5.a.s(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0090 A[EDGE_INSN: B:108:0x0090->B:33:0x0090 BREAK  A[LOOP:2: B:21:0x0058->B:32:0x008d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d A[LOOP:2: B:21:0x0058->B:32:0x008d, LOOP_END] */
    public final void c(int i, int i2, ArrayList arrayList, com.gamericefishpro.space.f1.z zVar, com.gamericefishpro.space.g1.b bVar, boolean z, int i3, boolean z2, int i4, int i5) throws Throwable {
        Throwable th;
        int i6;
        com.gamericefishpro.space.f1.z zVar2 = this.b;
        this.b = zVar;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            e0 e0Var = (e0) arrayList.get(i7);
            int iB = e0Var.b();
            for (int i8 = 0; i8 < iB; i8++) {
                e0Var.h(i8);
            }
        }
        com.gamericefishpro.space.t.h0 h0Var = this.a;
        if (h0Var.i()) {
            d();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr = h0Var.b;
        long[] jArr = h0Var.a;
        int length = jArr.length - 2;
        com.gamericefishpro.space.t.i0 i0Var = this.c;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j = jArr[i9];
                int i10 = i9;
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i9 = i10 + 1;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    long j2 = j;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j2 & 255) < 128) {
                            i0Var.a(objArr[(i10 << 3) + i12]);
                        }
                        j2 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i9 = i10 + 1;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            e0 e0Var2 = (e0) arrayList.get(i13);
            i0Var.l(e0Var2.getKey());
            int iB2 = e0Var2.b();
            for (int i14 = 0; i14 < iB2; i14++) {
                e0Var2.h(i14);
            }
            com.gamericefishpro.space.m5.a.s(h0Var.k(e0Var2.getKey()));
            Unit unit = Unit.a;
        }
        int[] iArr = new int[i3];
        Throwable th2 = null;
        ArrayList arrayList2 = this.e;
        ArrayList arrayList3 = this.d;
        if (z3 && zVar2 != null) {
            if (arrayList3.isEmpty()) {
                i6 = 0;
            } else {
                if (arrayList3.size() > 1) {
                    com.gamericefishpro.space.ph.b0.k(arrayList3, new v(zVar2, 2));
                }
                if (arrayList3.size() > 0) {
                    e0 e0Var3 = (e0) arrayList3.get(0);
                    e(iArr, e0Var3);
                    Object objG = h0Var.g(e0Var3.getKey());
                    Intrinsics.b(objG);
                    com.gamericefishpro.space.m5.a.s(objG);
                    e0Var3.f(0);
                    throw null;
                }
                i6 = 0;
                com.gamericefishpro.space.ph.u.j(iArr, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    com.gamericefishpro.space.ph.b0.k(arrayList2, new v(zVar2, i6));
                }
                if (arrayList2.size() > 0) {
                    e0 e0Var4 = (e0) arrayList2.get(i6);
                    e(iArr, e0Var4);
                    Object objG2 = h0Var.g(e0Var4.getKey());
                    Intrinsics.b(objG2);
                    com.gamericefishpro.space.m5.a.s(objG2);
                    e0Var4.f(i6);
                    throw null;
                }
                com.gamericefishpro.space.ph.u.j(iArr, i6);
            }
        }
        Object[] objArr2 = i0Var.b;
        long[] jArr2 = i0Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i15 = 0;
            while (true) {
                long j3 = jArr2[i15];
                th = th2;
                long[] jArr3 = jArr2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j3 & 255) < 128) {
                            com.gamericefishpro.space.m5.a.s(h0Var.g(objArr2[(i15 << 3) + i17]));
                        }
                        j3 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                }
                if (i15 == length2) {
                    break;
                }
                i15++;
                th2 = th;
                jArr2 = jArr3;
            }
        } else {
            th = null;
        }
        ArrayList arrayList4 = this.f;
        if (!arrayList4.isEmpty()) {
            if (arrayList4.size() > 1) {
                com.gamericefishpro.space.ph.b0.k(arrayList4, new v(zVar, 3));
            }
            if (arrayList4.size() > 0) {
                e0 e0Var5 = (e0) arrayList4.get(0);
                Object objG3 = h0Var.g(e0Var5.getKey());
                Intrinsics.b(objG3);
                com.gamericefishpro.space.m5.a.s(objG3);
                e(iArr, e0Var5);
                if (!z) {
                    throw th;
                }
                ((e0) CollectionsKt.w(arrayList)).f(0);
                throw th;
            }
            com.gamericefishpro.space.ph.u.j(iArr, 0);
        }
        ArrayList arrayList5 = this.g;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > 1) {
                com.gamericefishpro.space.ph.b0.k(arrayList5, new v(zVar, 1));
            }
            if (arrayList5.size() > 0) {
                e0 e0Var6 = (e0) arrayList5.get(0);
                Object objG4 = h0Var.g(e0Var6.getKey());
                Intrinsics.b(objG4);
                com.gamericefishpro.space.m5.a.s(objG4);
                e(iArr, e0Var6);
                throw th;
            }
        }
        Intrinsics.checkNotNullParameter(arrayList4, "<this>");
        Collections.reverse(arrayList4);
        Unit unit2 = Unit.a;
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        i0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[LOOP:0: B:7:0x0013->B:18:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[EDGE_INSN: B:22:0x004d->B:19:0x004d BREAK  A[LOOP:0: B:7:0x0013->B:18:0x004a], SYNTHETIC] */
    public final void d() {
        com.gamericefishpro.space.t.h0 h0Var = this.a;
        if (h0Var.j()) {
            Object[] objArr = h0Var.c;
            long[] jArr = h0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                com.gamericefishpro.space.m5.a.s(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            h0Var.a();
        }
    }
}
