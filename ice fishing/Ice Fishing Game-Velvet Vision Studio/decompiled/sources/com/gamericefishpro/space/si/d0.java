package com.gamericefishpro.space.si;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class d0 extends com.gamericefishpro.space.ti.b implements e, f, com.gamericefishpro.space.ti.q {
    public Object[] A;
    public long B;
    public long C;
    public int D;
    public int E;
    public final int w;
    public final int y;
    public final com.gamericefishpro.space.ri.a z;

    public d0(int i, int i2, com.gamericefishpro.space.ri.a aVar) {
        this.w = i;
        this.y = i2;
        this.z = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.gamericefishpro.space.si.f] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.gamericefishpro.space.ti.b] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.gamericefishpro.space.si.d0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.gamericefishpro.space.si.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.gamericefishpro.space.ti.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.gamericefishpro.space.si.f0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.gamericefishpro.space.si.f0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ae -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:56:0x0092
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void k(com.gamericefishpro.space.si.d0 r8, com.gamericefishpro.space.si.f r9, com.gamericefishpro.space.th.a r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof com.gamericefishpro.space.si.c0
            if (r0 == 0) goto L13
            r0 = r10
            com.gamericefishpro.space.si.c0 r0 = (com.gamericefishpro.space.si.c0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            com.gamericefishpro.space.si.c0 r0 = new com.gamericefishpro.space.si.c0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.w
            com.gamericefishpro.space.uh.a r1 = com.gamericefishpro.space.uh.a.d
            int r2 = r0.z
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            com.gamericefishpro.space.pi.d1 r8 = r0.v
            com.gamericefishpro.space.si.f0 r9 = r0.i
            com.gamericefishpro.space.si.f r2 = r0.e
            com.gamericefishpro.space.si.d0 r5 = r0.d
            com.gamericefishpro.space.wa.b.P(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb4
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            com.gamericefishpro.space.pi.d1 r8 = r0.v
            com.gamericefishpro.space.si.f0 r9 = r0.i
            com.gamericefishpro.space.si.f r2 = r0.e
            com.gamericefishpro.space.si.d0 r5 = r0.d
            com.gamericefishpro.space.wa.b.P(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            com.gamericefishpro.space.si.f0 r9 = r0.i
            com.gamericefishpro.space.si.f r8 = r0.e
            com.gamericefishpro.space.si.d0 r2 = r0.d
            com.gamericefishpro.space.wa.b.P(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb4
        L5e:
            com.gamericefishpro.space.wa.b.P(r10)
            com.gamericefishpro.space.ti.d r10 = r8.c()
            com.gamericefishpro.space.si.f0 r10 = (com.gamericefishpro.space.si.f0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            com.gamericefishpro.space.pi.u r5 = com.gamericefishpro.space.pi.u.e     // Catch: java.lang.Throwable -> Lb1
            kotlin.coroutines.CoroutineContext$Element r2 = r2.j(r5)     // Catch: java.lang.Throwable -> Lb1
            com.gamericefishpro.space.pi.d1 r2 = (com.gamericefishpro.space.pi.d1) r2     // Catch: java.lang.Throwable -> Lb1
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.t(r9)     // Catch: java.lang.Throwable -> L38
            com.gamericefishpro.space.d6.a r6 = com.gamericefishpro.space.si.e0.a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.d = r5     // Catch: java.lang.Throwable -> L38
            r0.e = r2     // Catch: java.lang.Throwable -> L38
            r0.i = r9     // Catch: java.lang.Throwable -> L38
            r0.v = r8     // Catch: java.lang.Throwable -> L38
            r0.z = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.i(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r6 = r8.b()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.t()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r0.d = r5     // Catch: java.lang.Throwable -> L38
            r0.e = r2     // Catch: java.lang.Throwable -> L38
            r0.i = r9     // Catch: java.lang.Throwable -> L38
            r0.v = r8     // Catch: java.lang.Throwable -> L38
            r0.z = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.d(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb0:
            return
        Lb1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb4:
            r5.g(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.si.d0.k(com.gamericefishpro.space.si.d0, com.gamericefishpro.space.si.f, com.gamericefishpro.space.th.a):void");
    }

    @Override // com.gamericefishpro.space.si.e
    public final Object a(f fVar, com.gamericefishpro.space.th.a aVar) throws Throwable {
        k(this, fVar, aVar);
        return com.gamericefishpro.space.uh.a.d;
    }

    @Override // com.gamericefishpro.space.ti.q
    public final e b(CoroutineContext coroutineContext, int i, com.gamericefishpro.space.ri.a aVar) {
        return ((i == 0 || i == -3) && aVar == com.gamericefishpro.space.ri.a.d) ? this : new com.gamericefishpro.space.ti.g(this, coroutineContext, i, aVar);
    }

    @Override // com.gamericefishpro.space.si.f
    public final Object d(Object obj, com.gamericefishpro.space.th.a frame) {
        Throwable th;
        com.gamericefishpro.space.th.a[] aVarArrN;
        b0 b0Var;
        if (q(obj)) {
            return Unit.a;
        }
        com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        com.gamericefishpro.space.th.a[] aVarArrN2 = com.gamericefishpro.space.ti.c.a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                        hVar.resumeWith(Unit.a);
                        aVarArrN = n(aVarArrN2);
                        b0Var = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        b0Var = new b0(this, o() + ((long) (this.D + this.E)), obj, hVar);
                        m(b0Var);
                        this.E++;
                        if (this.y == 0) {
                            aVarArrN2 = n(aVarArrN2);
                        }
                        aVarArrN = aVarArrN2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (b0Var != null) {
                    hVar.v(new com.gamericefishpro.space.pi.e(2, b0Var));
                }
                for (com.gamericefishpro.space.th.a aVar : aVarArrN) {
                    if (aVar != null) {
                        com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
                        aVar.resumeWith(Unit.a);
                    }
                }
                Object objR = hVar.r();
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                if (objR == aVar2) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objR != aVar2) {
                    objR = Unit.a;
                }
                return objR == aVar2 ? objR : Unit.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // com.gamericefishpro.space.ti.b
    public final com.gamericefishpro.space.ti.d e() {
        f0 f0Var = new f0();
        f0Var.a = -1L;
        return f0Var;
    }

    @Override // com.gamericefishpro.space.ti.b
    public final com.gamericefishpro.space.ti.d[] f() {
        return new f0[2];
    }

    public final Object i(f0 f0Var, c0 frame) {
        com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        synchronized (this) {
            try {
                if (s(f0Var) < 0) {
                    f0Var.b = hVar;
                } else {
                    com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                    hVar.resumeWith(Unit.a);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objR = hVar.r();
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR == aVar ? objR : Unit.a;
    }

    public final void j() {
        if (this.y != 0 || this.E > 1) {
            Object[] objArr = this.A;
            Intrinsics.b(objArr);
            while (this.E > 0) {
                long jO = o();
                int i = this.D;
                int i2 = this.E;
                if (objArr[((int) ((jO + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != e0.a) {
                    return;
                }
                this.E = i2 - 1;
                e0.d(objArr, o() + ((long) (this.D + this.E)), null);
            }
        }
    }

    public final void l() {
        com.gamericefishpro.space.ti.d[] dVarArr;
        Object[] objArr = this.A;
        Intrinsics.b(objArr);
        e0.d(objArr, o(), null);
        this.D--;
        long jO = o() + 1;
        if (this.B < jO) {
            this.B = jO;
        }
        if (this.C < jO) {
            if (this.e != 0 && (dVarArr = this.d) != null) {
                for (com.gamericefishpro.space.ti.d dVar : dVarArr) {
                    if (dVar != null) {
                        f0 f0Var = (f0) dVar;
                        long j = f0Var.a;
                        if (j >= 0 && j < jO) {
                            f0Var.a = jO;
                        }
                    }
                }
            }
            this.C = jO;
        }
    }

    public final void m(Object obj) {
        int i = this.D + this.E;
        Object[] objArrP = this.A;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i >= objArrP.length) {
            objArrP = p(objArrP, i, objArrP.length * 2);
        }
        e0.d(objArrP, o() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.gamericefishpro.space.th.a[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final com.gamericefishpro.space.th.a[] n(com.gamericefishpro.space.th.a[] aVarArr) {
        com.gamericefishpro.space.ti.d[] dVarArr;
        f0 f0Var;
        com.gamericefishpro.space.pi.h hVar;
        int length = aVarArr.length;
        if (this.e != 0 && (dVarArr = this.d) != null) {
            int length2 = dVarArr.length;
            int i = 0;
            while (i < length2) {
                com.gamericefishpro.space.ti.d dVar = dVarArr[i];
                if (dVar == null || (hVar = (f0Var = (f0) dVar).b) == null || s(f0Var) < 0) {
                    aVarArr = aVarArr;
                } else {
                    if (length >= aVarArr.length) {
                        aVarArr = aVarArr;
                        aVarArr = aVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) aVarArr, Math.max(2, aVarArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        aVarArr = objArrCopyOf;
                    }
                    aVarArr = aVarArr;
                    aVarArr = aVarArr;
                    ((com.gamericefishpro.space.th.a[]) aVarArr)[length] = hVar;
                    f0Var.b = null;
                    length++;
                }
                i++;
                aVarArr = aVarArr;
            }
            aVarArr = aVarArr;
        }
        return (com.gamericefishpro.space.th.a[]) aVarArr;
    }

    public final long o() {
        return Math.min(this.C, this.B);
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.A = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jO;
                e0.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i;
        boolean z;
        com.gamericefishpro.space.th.a[] aVarArrN = com.gamericefishpro.space.ti.c.a;
        synchronized (this) {
            if (r(obj)) {
                aVarArrN = n(aVarArrN);
                z = true;
            } else {
                z = false;
            }
        }
        for (com.gamericefishpro.space.th.a aVar : aVarArrN) {
            if (aVar != null) {
                com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                aVar.resumeWith(Unit.a);
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    public final boolean r(Object obj) {
        int i;
        long jO;
        long j;
        int i2 = this.e;
        int i3 = this.w;
        if (i2 != 0) {
            int i4 = this.D;
            int i5 = this.y;
            if (i4 < i5 || this.C > this.B) {
                m(obj);
                i = this.D + 1;
                this.D = i;
                if (i > i5) {
                    l();
                }
                jO = o() + ((long) this.D);
                j = this.B;
                if (((int) (jO - j)) > i3) {
                    u(1 + j, this.C, o() + ((long) this.D), o() + ((long) this.D) + ((long) this.E));
                }
            } else {
                int iOrdinal = this.z.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    m(obj);
                    i = this.D + 1;
                    this.D = i;
                    if (i > i5) {
                        l();
                    }
                    jO = o() + ((long) this.D);
                    j = this.B;
                    if (((int) (jO - j)) > i3) {
                        u(1 + j, this.C, o() + ((long) this.D), o() + ((long) this.D) + ((long) this.E));
                    }
                } else if (iOrdinal != 2) {
                    throw new com.gamericefishpro.space.oh.k();
                }
            }
        } else if (i3 != 0) {
            m(obj);
            int i6 = this.D + 1;
            this.D = i6;
            if (i6 > i3) {
                l();
            }
            this.C = o() + ((long) this.D);
            return true;
        }
        return true;
    }

    public final long s(f0 f0Var) {
        long j = f0Var.a;
        if (j < o() + ((long) this.D)) {
            return j;
        }
        if (this.y <= 0 && j <= o() && this.E != 0) {
            return j;
        }
        return -1L;
    }

    public final Object t(f0 f0Var) {
        Object obj;
        com.gamericefishpro.space.th.a[] aVarArrV = com.gamericefishpro.space.ti.c.a;
        synchronized (this) {
            try {
                long jS = s(f0Var);
                if (jS < 0) {
                    obj = e0.a;
                } else {
                    long j = f0Var.a;
                    Object[] objArr = this.A;
                    Intrinsics.b(objArr);
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof b0) {
                        obj2 = ((b0) obj2).i;
                    }
                    f0Var.a = jS + 1;
                    Object obj3 = obj2;
                    aVarArrV = v(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (com.gamericefishpro.space.th.a aVar : aVarArrV) {
            if (aVar != null) {
                com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                aVar.resumeWith(Unit.a);
            }
        }
        return obj;
    }

    public final void u(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.A;
            Intrinsics.b(objArr);
            e0.d(objArr, jO, null);
        }
        this.B = j;
        this.C = j2;
        this.D = (int) (j3 - jMin);
        this.E = (int) (j4 - j3);
    }

    public final com.gamericefishpro.space.th.a[] v(long j) {
        long j2;
        long j3;
        com.gamericefishpro.space.th.a[] aVarArr;
        com.gamericefishpro.space.th.a[] aVarArr2;
        com.gamericefishpro.space.ti.d[] dVarArr;
        com.gamericefishpro.space.d6.a aVar = e0.a;
        com.gamericefishpro.space.th.a[] aVarArr3 = com.gamericefishpro.space.ti.c.a;
        if (j <= this.C) {
            long jO = o();
            long j4 = ((long) this.D) + jO;
            int i = this.y;
            if (i == 0 && this.E > 0) {
                j4++;
            }
            int i2 = 0;
            if (this.e != 0 && (dVarArr = this.d) != null) {
                for (com.gamericefishpro.space.ti.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j5 = ((f0) dVar).a;
                        if (j5 >= 0 && j5 < j4) {
                            j4 = j5;
                        }
                    }
                }
            }
            if (j4 > this.C) {
                long jO2 = o() + ((long) this.D);
                int iMin = this.e > 0 ? Math.min(this.E, i - ((int) (jO2 - j4))) : this.E;
                long j6 = ((long) this.E) + jO2;
                if (iMin > 0) {
                    j3 = 1;
                    Object[] objArr = this.A;
                    Intrinsics.b(objArr);
                    com.gamericefishpro.space.th.a[] aVarArr4 = new com.gamericefishpro.space.th.a[iMin];
                    long j7 = jO2;
                    while (true) {
                        if (jO2 >= j6) {
                            aVarArr2 = aVarArr4;
                            j2 = j4;
                            break;
                        }
                        aVarArr2 = aVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jO2)];
                        if (obj != aVar) {
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            b0 b0Var = (b0) obj;
                            int i3 = i2 + 1;
                            j2 = j4;
                            aVarArr2[i2] = b0Var.v;
                            e0.d(objArr, jO2, aVar);
                            e0.d(objArr, j7, b0Var.i);
                            j7++;
                            if (i3 >= iMin) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            j2 = j4;
                        }
                        jO2++;
                        aVarArr4 = aVarArr2;
                        j4 = j2;
                    }
                    jO2 = j7;
                    aVarArr = aVarArr2;
                } else {
                    j2 = j4;
                    j3 = 1;
                    aVarArr = aVarArr3;
                }
                int i4 = (int) (jO2 - jO);
                long j8 = this.e == 0 ? jO2 : j2;
                long jMax = Math.max(this.B, jO2 - ((long) Math.min(this.w, i4)));
                if (i == 0 && jMax < j6) {
                    Object[] objArr2 = this.A;
                    Intrinsics.b(objArr2);
                    if (Intrinsics.a(objArr2[((int) jMax) & (objArr2.length - 1)], aVar)) {
                        jO2 += j3;
                        jMax += j3;
                    }
                }
                u(jMax, j8, jO2, j6);
                j();
                return aVarArr.length == 0 ? aVarArr : n(aVarArr);
            }
        }
        return aVarArr3;
    }
}
