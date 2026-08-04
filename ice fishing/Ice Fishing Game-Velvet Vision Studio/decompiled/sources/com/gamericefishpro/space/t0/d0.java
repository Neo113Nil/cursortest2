package com.gamericefishpro.space.t0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends com.gamericefishpro.space.f1.d0 implements s2 {
    public final Function0 e;
    public final m2 i;
    public c0 v = new c0(com.gamericefishpro.space.f1.p.j().g());

    public d0(Function0 function0, f fVar) {
        this.e = function0;
        this.i = fVar;
    }

    @Override // com.gamericefishpro.space.f1.c0
    public final com.gamericefishpro.space.f1.e0 c() {
        return this.v;
    }

    @Override // com.gamericefishpro.space.f1.c0
    public final void d(com.gamericefishpro.space.f1.e0 e0Var) {
        Intrinsics.c(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.v = (c0) e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00a3 A[EDGE_INSN: B:101:0x00a3->B:31:0x00a3 BREAK  A[LOOP:1: B:16:0x0049->B:30:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x009e, LOOP_END, TryCatch #2 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x005c, B:20:0x0068, B:22:0x0072, B:24:0x008a, B:26:0x0090, B:30:0x009e, B:31:0x00a3), top: B:95:0x0023 }] */
    public final c0 g(c0 c0Var, com.gamericefishpro.space.f1.g gVar, boolean z, Function0 function0) {
        m2 m2Var;
        int i;
        c0 c0Var2 = c0Var;
        if (c0Var2.c(this, gVar)) {
            if (z) {
                com.gamericefishpro.space.v0.e eVarO = i.o();
                Object[] objArr = eVarO.d;
                int i2 = eVarO.i;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((com.gamericefishpro.space.f1.w) objArr[i3]).b();
                }
                try {
                    com.gamericefishpro.space.t.c0 c0Var3 = c0Var2.e;
                    com.gamericefishpro.space.a8.c cVar = n2.a;
                    com.gamericefishpro.space.b1.i iVar = (com.gamericefishpro.space.b1.i) cVar.get();
                    if (iVar == null) {
                        iVar = new com.gamericefishpro.space.b1.i();
                        cVar.B(iVar);
                    }
                    int i4 = iVar.a;
                    Object[] objArr2 = c0Var3.b;
                    int[] iArr = c0Var3.c;
                    long[] jArr = c0Var3.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        i = i6;
                                        com.gamericefishpro.space.f1.c0 c0Var4 = (com.gamericefishpro.space.f1.c0) objArr2[i9];
                                        iVar.a = i4 + iArr[i9];
                                        Function1 function1E = gVar.e();
                                        if (function1E != null) {
                                            function1E.invoke(c0Var4);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    iVar.a = i4;
                    Unit unit = Unit.a;
                } finally {
                    Object[] objArr3 = eVarO.d;
                    int i10 = eVarO.i;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((com.gamericefishpro.space.f1.w) objArr3[i11]).a();
                    }
                }
            }
            return c0Var2;
        }
        com.gamericefishpro.space.t.c0 c0Var5 = new com.gamericefishpro.space.t.c0();
        com.gamericefishpro.space.a8.c cVar2 = n2.a;
        com.gamericefishpro.space.b1.i iVar2 = (com.gamericefishpro.space.b1.i) cVar2.get();
        if (iVar2 == null) {
            iVar2 = new com.gamericefishpro.space.b1.i();
            cVar2.B(iVar2);
        }
        int i12 = iVar2.a;
        com.gamericefishpro.space.v0.e eVarO2 = i.o();
        Object[] objArr4 = eVarO2.d;
        int i13 = eVarO2.i;
        for (int i14 = 0; i14 < i13; i14++) {
            ((com.gamericefishpro.space.f1.w) objArr4[i14]).b();
        }
        try {
            iVar2.a = i12 + 1;
            Object objJ = com.gamericefishpro.space.f1.v.j(new com.gamericefishpro.space.d0.c1(this, iVar2, c0Var5, i12), function0);
            iVar2.a = i12;
            Object[] objArr5 = eVarO2.d;
            int i15 = eVarO2.i;
            for (int i16 = 0; i16 < i15; i16++) {
                ((com.gamericefishpro.space.f1.w) objArr5[i16]).a();
            }
            Object obj = com.gamericefishpro.space.f1.p.c;
            synchronized (obj) {
                try {
                    com.gamericefishpro.space.f1.g gVarJ = com.gamericefishpro.space.f1.p.j();
                    Object obj2 = c0Var2.f;
                    if (obj2 == c0.h || (m2Var = this.i) == null || !m2Var.a(objJ, obj2)) {
                        c0 c0Var6 = this.v;
                        synchronized (obj) {
                            com.gamericefishpro.space.f1.e0 e0VarM = com.gamericefishpro.space.f1.p.m(c0Var6, this);
                            e0VarM.a(c0Var6);
                            e0VarM.a = gVarJ.g();
                            c0Var2 = (c0) e0VarM;
                            c0Var2.e = c0Var5;
                            c0Var2.g = c0Var2.d(this, gVarJ);
                            c0Var2.f = objJ;
                        }
                        return c0Var2;
                    }
                    c0Var2.e = c0Var5;
                    c0Var2.g = c0Var2.d(this, gVarJ);
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.gamericefishpro.space.b1.i iVar3 = (com.gamericefishpro.space.b1.i) n2.a.get();
            if (iVar3 == null || iVar3.a != 0) {
                return c0Var2;
            }
            com.gamericefishpro.space.f1.p.j().m();
            synchronized (obj) {
                com.gamericefishpro.space.f1.g gVarJ2 = com.gamericefishpro.space.f1.p.j();
                c0Var2.c = gVarJ2.g();
                c0Var2.d = gVarJ2.h();
                Unit unit2 = Unit.a;
                return c0Var2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = eVarO2.d;
            int i17 = eVarO2.i;
            for (int i18 = 0; i18 < i17; i18++) {
                ((com.gamericefishpro.space.f1.w) objArr6[i18]).a();
            }
            throw th2;
        }
    }

    @Override // com.gamericefishpro.space.t0.s2
    public final Object getValue() {
        Function1 function1E = com.gamericefishpro.space.f1.p.j().e();
        if (function1E != null) {
            function1E.invoke(this);
        }
        com.gamericefishpro.space.f1.g gVarJ = com.gamericefishpro.space.f1.p.j();
        return g((c0) com.gamericefishpro.space.f1.p.i(this.v, gVarJ), gVarJ, true, this.e).f;
    }

    public final c0 h() {
        com.gamericefishpro.space.f1.g gVarJ = com.gamericefishpro.space.f1.p.j();
        return g((c0) com.gamericefishpro.space.f1.p.i(this.v, gVarJ), gVarJ, false, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        c0 c0Var = (c0) com.gamericefishpro.space.f1.p.h(this.v);
        sb.append(c0Var.c(this, com.gamericefishpro.space.f1.p.j()) ? String.valueOf(c0Var.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
