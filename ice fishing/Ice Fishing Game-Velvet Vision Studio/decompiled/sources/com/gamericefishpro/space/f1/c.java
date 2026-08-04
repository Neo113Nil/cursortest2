package com.gamericefishpro.space.f1;

import com.gamericefishpro.space.t.q0;
import com.gamericefishpro.space.t0.m1;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class c extends g {
    public static final int[] n = new int[0];
    public final Function1 e;
    public final Function1 f;
    public int g;
    public com.gamericefishpro.space.t.i0 h;
    public ArrayList i;
    public m j;
    public int[] k;
    public int l;
    public boolean m;

    public c(long j, m mVar, Function1 function1, Function1 function2) {
        super(j, mVar);
        this.e = function1;
        this.f = function2;
        this.j = m.w;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (p.c) {
            this.j = this.j.h(j);
            Unit unit = Unit.a;
        }
    }

    public void B(com.gamericefishpro.space.t.i0 i0Var) {
        this.h = i0Var;
    }

    public c C(Function1 function1, Function1 function2) throws Throwable {
        if (this.c) {
            m1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            m1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = p.c;
        synchronized (obj) {
            try {
                long j = p.e;
                long j2 = 1;
                p.e = j + j2;
                p.d = p.d.h(j);
                m mVarD = d();
                r(mVarD.h(j));
                try {
                    d dVar = new d(j, p.d(mVarD, g() + j2, j), p.k(function1, e(), true), p.l(function2, i()), this);
                    if (this.m || this.c) {
                        return dVar;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j3 = p.e;
                        p.e = j3 + j2;
                        s(j3);
                        p.d = p.d.h(g());
                        Unit unit = Unit.a;
                    }
                    r(p.d(d(), jG + j2, g()));
                    return dVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void b() {
        p.d = p.d.c(g()).b(this.j);
    }

    @Override // com.gamericefishpro.space.f1.g
    public void c() {
        if (this.c) {
            return;
        }
        super.c();
        l();
    }

    @Override // com.gamericefishpro.space.f1.g
    public boolean f() {
        return false;
    }

    @Override // com.gamericefishpro.space.f1.g
    public int h() {
        return this.g;
    }

    @Override // com.gamericefishpro.space.f1.g
    public Function1 i() {
        return this.f;
    }

    @Override // com.gamericefishpro.space.f1.g
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // com.gamericefishpro.space.f1.g
    public void l() {
        if (this.l <= 0) {
            m1.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        com.gamericefishpro.space.t.i0 i0VarX = x();
        if (i0VarX != null) {
            if (this.m) {
                m1.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = i0VarX.b;
            long[] jArr = i0VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (e0 e0VarC = ((c0) objArr[(i2 << 3) + i4]).c(); e0VarC != null; e0VarC = e0VarC.b) {
                                    long j2 = e0VarC.a;
                                    if (j2 == jG || CollectionsKt.t(this.j, Long.valueOf(j2))) {
                                        com.gamericefishpro.space.d0.p pVar = p.a;
                                        e0VarC.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // com.gamericefishpro.space.f1.g
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // com.gamericefishpro.space.f1.g
    public void n(c0 c0Var) {
        com.gamericefishpro.space.t.i0 i0VarX = x();
        if (i0VarX == null) {
            com.gamericefishpro.space.t.i0 i0Var = q0.a;
            i0VarX = new com.gamericefishpro.space.t.i0();
            B(i0VarX);
        }
        i0VarX.a(c0Var);
    }

    @Override // com.gamericefishpro.space.f1.g
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            p.u(this.k[i]);
        }
        o();
    }

    @Override // com.gamericefishpro.space.f1.g
    public void t(int i) {
        this.g = i;
    }

    @Override // com.gamericefishpro.space.f1.g
    public g u(Function1 function1) throws Throwable {
        if (this.c) {
            m1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            m1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = p.c;
        synchronized (obj) {
            try {
                long j = p.e;
                long j2 = 1;
                p.e = j + j2;
                p.d = p.d.h(j);
                try {
                    e eVar = new e(j, p.d(d(), jG + j2, j), p.k(function1, e(), true), this);
                    if (this.m || this.c) {
                        return eVar;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j3 = p.e;
                        p.e = j3 + j2;
                        s(j3);
                        p.d = p.d.h(g());
                        Unit unit = Unit.a;
                    }
                    r(p.d(d(), jG2 + j2, g()));
                    return eVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j;
        A(g());
        Unit unit = Unit.a;
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (p.c) {
            long j2 = p.e;
            j = 1;
            p.e = j2 + j;
            s(j2);
            p.d = p.d.h(g());
        }
        r(p.d(d(), jG + j, g()));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014d A[EDGE_INSN: B:102:0x014d->B:77:0x014d BREAK  A[LOOP:4: B:66:0x011e->B:76:0x014a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x010b A[Catch: all -> 0x0100, LOOP:2: B:48:0x00d8->B:60:0x010b, LOOP_END, TryCatch #0 {all -> 0x0100, blocks: (B:43:0x00bc, B:45:0x00cc, B:48:0x00d8, B:50:0x00e4, B:52:0x00ee, B:54:0x00f4, B:57:0x0103, B:63:0x0114, B:66:0x011e, B:68:0x0128, B:70:0x0132, B:72:0x0138, B:73:0x0142, B:76:0x014a, B:77:0x014d, B:79:0x0151, B:81:0x0158, B:82:0x0164, B:60:0x010b), top: B:90:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x014a A[Catch: all -> 0x0100, LOOP:4: B:66:0x011e->B:76:0x014a, LOOP_END, TryCatch #0 {all -> 0x0100, blocks: (B:43:0x00bc, B:45:0x00cc, B:48:0x00d8, B:50:0x00e4, B:52:0x00ee, B:54:0x00f4, B:57:0x0103, B:63:0x0114, B:66:0x011e, B:68:0x0128, B:70:0x0132, B:72:0x0138, B:73:0x0142, B:76:0x014a, B:77:0x014d, B:79:0x0151, B:81:0x0158, B:82:0x0164, B:60:0x010b), top: B:90:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0112 A[EDGE_INSN: B:97:0x0112->B:62:0x0112 BREAK  A[LOOP:2: B:48:0x00d8->B:60:0x010b], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.List] */
    public v w() {
        HashMap mapB;
        ?? r3;
        com.gamericefishpro.space.t.i0 i0Var;
        long j;
        long j2;
        com.gamericefishpro.space.t.i0 i0VarX = x();
        if (i0VarX != null) {
            long j3 = p.j.b;
            mapB = p.b(j3, this, p.d.c(j3));
        } else {
            mapB = null;
        }
        com.gamericefishpro.space.ph.g0 g0Var = com.gamericefishpro.space.ph.g0.d;
        synchronized (p.c) {
            try {
                p.c(this);
                if (i0VarX == null || i0VarX.d == 0) {
                    b();
                    b bVar = p.j;
                    com.gamericefishpro.space.t.i0 i0Var2 = bVar.h;
                    p.v(bVar, p.a);
                    if (i0Var2 == null || !i0Var2.h()) {
                        r3 = g0Var;
                        i0Var = null;
                    } else {
                        r3 = p.h;
                        i0Var = i0Var2;
                    }
                } else {
                    b bVar2 = p.j;
                    v vVarZ = z(p.e, i0VarX, mapB, p.d.c(bVar2.b));
                    if (!vVarZ.equals(j.b)) {
                        return vVarZ;
                    }
                    b();
                    i0Var = bVar2.h;
                    p.v(bVar2, p.a);
                    B(null);
                    bVar2.h = null;
                    r3 = p.h;
                }
                Unit unit = Unit.a;
                this.m = true;
                if (i0Var != null) {
                    com.gamericefishpro.space.v0.g gVar = new com.gamericefishpro.space.v0.g(i0Var);
                    if (!i0Var.g()) {
                        int size = r3.size();
                        for (int i = 0; i < size; i++) {
                            ((Function2) r3.get(i)).invoke(gVar, this);
                        }
                    }
                }
                if (i0VarX != null && i0VarX.h()) {
                    com.gamericefishpro.space.v0.g gVar2 = new com.gamericefishpro.space.v0.g(i0VarX);
                    int size2 = r3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((Function2) r3.get(i2)).invoke(gVar2, this);
                    }
                }
                synchronized (p.c) {
                    try {
                        p();
                        p.f();
                        if (i0Var != null) {
                            Object[] objArr = i0Var.b;
                            long[] jArr = i0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                p.q((c0) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 != length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (i0VarX != null) {
                            Object[] objArr2 = i0VarX.b;
                            long[] jArr2 = i0VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                p.q((c0) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                p.q((c0) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                        Unit unit2 = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return j.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.gamericefishpro.space.t.i0 x() {
        return this.h;
    }

    @Override // com.gamericefishpro.space.f1.g
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1 e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab A[LOOP:3: B:79:0x01a9->B:80:0x01ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final v z(long j, com.gamericefishpro.space.t.i0 i0Var, HashMap map, m mVar) {
        ArrayList arrayList;
        ArrayList arrayListF;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        c0 c0Var;
        e0 e0Var;
        m mVar2;
        Object[] objArr;
        long[] jArr;
        m mVar3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        e0 e0VarB;
        m mVarF = d().h(g()).f(this.j);
        Object[] objArr3 = i0Var.b;
        long[] jArr3 = i0Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListF = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            c0 c0Var2 = (c0) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            e0 e0VarC = c0Var2.c();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            e0 e0VarS = p.s(e0VarC, j, mVar);
                            if (e0VarS == null) {
                                mVar3 = mVarF;
                                arrayList4 = arrayListF;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListF;
                                j2 = j3;
                                e0 e0VarS2 = p.s(e0VarC, g(), mVarF);
                                if (e0VarS2 == null) {
                                    mVar3 = mVarF;
                                } else {
                                    mVar3 = mVarF;
                                    if (e0VarS2.a != 1 && !e0VarS.equals(e0VarS2)) {
                                        e0 e0VarS3 = p.s(e0VarC, g(), d());
                                        if (e0VarS3 == null) {
                                            p.r();
                                            throw null;
                                        }
                                        if (map == null || (e0VarB = (e0) map.get(e0VarS)) == null) {
                                            e0VarB = c0Var2.b(e0VarS2, e0VarS, e0VarS3);
                                        }
                                        if (e0VarB == null) {
                                            return new i(this);
                                        }
                                        if (!e0VarB.equals(e0VarS3)) {
                                            if (e0VarB.equals(e0VarS)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new Pair(c0Var2, e0VarS.b(g())));
                                                arrayListF = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayListF.add(c0Var2);
                                                arrayList2 = arrayList6;
                                            } else {
                                                arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList2.add(!e0VarB.equals(e0VarS2) ? new Pair(c0Var2, e0VarB) : new Pair(c0Var2, e0VarS2.b(g())));
                                            }
                                        }
                                        arrayListF = arrayList4;
                                    }
                                }
                            }
                            arrayList2 = arrayList5;
                            arrayListF = arrayList4;
                        } else {
                            mVar3 = mVarF;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        mVarF = mVar3;
                    }
                    mVar2 = mVarF;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    mVar2 = mVarF;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    mVarF = mVar2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    Pair pair = (Pair) arrayList2.get(i2);
                    c0Var = (c0) pair.d;
                    e0Var = (e0) pair.e;
                    e0Var.a = j;
                    synchronized (p.c) {
                        e0Var.b = c0Var.c();
                        c0Var.d(e0Var);
                        Unit unit = Unit.a;
                    }
                }
            }
            if (arrayListF != null) {
                size = arrayListF.size();
                for (i = 0; i < size; i++) {
                    i0Var.l((c0) arrayListF.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListF = CollectionsKt.F(arrayList3, arrayListF);
                }
                this.i = arrayListF;
            }
            return j.b;
        }
        arrayList = null;
        arrayListF = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                Pair pair2 = (Pair) arrayList2.get(i2);
                c0Var = (c0) pair2.d;
                e0Var = (e0) pair2.e;
                e0Var.a = j;
                synchronized (p.c) {
                    e0Var.b = c0Var.c();
                    c0Var.d(e0Var);
                    Unit unit2 = Unit.a;
                }
            }
        }
        if (arrayListF != null) {
            size = arrayListF.size();
            while (i < size) {
                i0Var.l((c0) arrayListF.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListF = CollectionsKt.F(arrayList3, arrayListF);
            }
            this.i = arrayListF;
        }
        return j.b;
    }
}
