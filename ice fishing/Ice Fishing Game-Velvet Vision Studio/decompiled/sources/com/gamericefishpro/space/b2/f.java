package com.gamericefishpro.space.b2;

import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.t1;
import com.gamericefishpro.space.i9.g4;
import com.gamericefishpro.space.ph.g0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    public final com.gamericefishpro.space.h1.l c;
    public final com.gamericefishpro.space.c2.c d;
    public final com.gamericefishpro.space.t.q e;
    public f1 f;
    public h g;
    public boolean h;
    public boolean i;
    public boolean j;

    public f(com.gamericefishpro.space.h1.l lVar) {
        this.c = lVar;
        com.gamericefishpro.space.c2.c cVar = new com.gamericefishpro.space.c2.c();
        cVar.e = new long[2];
        this.d = cVar;
        this.e = new com.gamericefishpro.space.t.q(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.gamericefishpro.space.b2.g
    public final boolean a(com.gamericefishpro.space.t.q qVar, com.gamericefishpro.space.f2.u uVar, g4 g4Var, boolean z) {
        com.gamericefishpro.space.t.q qVar2;
        com.gamericefishpro.space.c2.c cVar;
        Object obj;
        boolean z2;
        boolean z3;
        h hVar;
        int i;
        int i2;
        boolean z4;
        boolean zA = super.a(qVar, uVar, g4Var, z);
        ?? E = this.c;
        boolean z5 = true;
        if (E.G) {
            ?? eVar = 0;
            while (E != 0) {
                if (E instanceof t1) {
                    this.f = com.gamericefishpro.space.h2.k.q((t1) E, 16);
                } else if ((E.i & 16) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                    com.gamericefishpro.space.h1.l lVar = ((com.gamericefishpro.space.h2.j) E).I;
                    int i3 = 0;
                    while (lVar != null) {
                        if ((lVar.i & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                E = E;
                                eVar = eVar;
                                eVar = eVar;
                                E = lVar;
                            } else {
                                if (eVar == 0) {
                                    eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                }
                                if (E != 0) {
                                    eVar.b(E);
                                    E = 0;
                                }
                                eVar.b(lVar);
                            }
                        } else {
                            E = E;
                            eVar = eVar;
                        }
                        lVar = lVar.y;
                        E = E;
                        eVar = eVar;
                    }
                    if (i3 == 1) {
                        E = E;
                        eVar = eVar;
                    } else {
                        E = E;
                        eVar = eVar;
                    }
                }
                E = com.gamericefishpro.space.h2.k.e(eVar);
            }
            if (this.f != null) {
                int iG = qVar.g();
                int i4 = 0;
                while (true) {
                    qVar2 = this.e;
                    cVar = this.d;
                    if (i4 >= iG) {
                        break;
                    }
                    long jD = qVar.d(i4);
                    m mVar = (m) qVar.h(i4);
                    if (cVar.b(jD)) {
                        boolean z6 = z5;
                        long j = mVar.g;
                        List list = mVar.k;
                        long j2 = mVar.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z4 = z6;
                            ArrayList arrayList = new ArrayList((list == null ? g0.d : list).size());
                            if (list == null) {
                                list = g0.d;
                            }
                            int size = list.size();
                            int i5 = 0;
                            while (i5 < size) {
                                int i6 = size;
                                a aVar = (a) list.get(i5);
                                long j3 = jD;
                                List list2 = list;
                                long j4 = aVar.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = aVar.a;
                                    f1 f1Var = this.f;
                                    Intrinsics.b(f1Var);
                                    arrayList.add(new a(j5, f1Var.k(uVar, j4), aVar.c));
                                }
                                i5++;
                                list = list2;
                                size = i6;
                                jD = j3;
                                mVar = mVar;
                            }
                            long j6 = jD;
                            f1 f1Var2 = this.f;
                            Intrinsics.b(f1Var2);
                            long jK = f1Var2.k(uVar, j);
                            f1 f1Var3 = this.f;
                            Intrinsics.b(f1Var3);
                            m mVar2 = new m(mVar.a, mVar.b, f1Var3.k(uVar, j2), mVar.d, mVar.e, mVar.f, jK, mVar.h, mVar.i, arrayList, mVar.j, mVar.l);
                            m mVar3 = mVar.o;
                            if (mVar3 == null) {
                                mVar3 = mVar;
                            }
                            mVar2.o = mVar3;
                            m mVar4 = mVar.o;
                            if (mVar4 != null) {
                                mVar = mVar4;
                            }
                            mVar2.o = mVar;
                            qVar2.e(j6, mVar2);
                        } else {
                            z4 = z6;
                        }
                    } else {
                        z4 = z5;
                    }
                    i4++;
                    z5 = z4;
                    iG = iG;
                    zA = zA;
                }
                boolean z7 = zA;
                boolean z8 = z5;
                if (qVar2.g() == 0) {
                    cVar.d = 0;
                    this.a.g();
                    return z8;
                }
                int i7 = cVar.d;
                while (true) {
                    i7--;
                    if (-1 >= i7) {
                        break;
                    }
                    if (qVar.c(((long[]) cVar.e)[i7]) < 0 && i7 < (i2 = cVar.d)) {
                        int i8 = i2 - 1;
                        int i9 = i7;
                        while (i9 < i8) {
                            long[] jArr = (long[]) cVar.e;
                            int i10 = i9 + 1;
                            jArr[i9] = jArr[i10];
                            i9 = i10;
                        }
                        cVar.d--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(qVar2.g());
                int iG2 = qVar2.g();
                for (int i11 = 0; i11 < iG2; i11++) {
                    arrayList2.add(qVar2.h(i11));
                }
                h hVar2 = new h(arrayList2, g4Var);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i12);
                    if (g4Var.a(((m) obj).a)) {
                        break;
                    }
                    i12++;
                }
                m mVar5 = (m) obj;
                if (mVar5 != null) {
                    boolean z9 = mVar5.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z9 || mVar5.h)) {
                            f1 f1Var4 = this.f;
                            Intrinsics.b(f1Var4);
                            long j7 = f1Var4.i;
                            long j8 = mVar5.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i13 = (int) (j7 >> 32);
                            this.i = !((fIntBitsToFloat2 > ((float) ((int) (j7 & 4294967295L))) ? z8 : false) | (fIntBitsToFloat > ((float) i13) ? z8 : false) | (fIntBitsToFloat < 0.0f ? z8 : false) | (fIntBitsToFloat2 < 0.0f ? z8 : false));
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z10 = this.i;
                    boolean z11 = this.h;
                    if (z10 == z11 || !((i = hVar2.c) == 3 || i == 4 || i == 5)) {
                        int i14 = hVar2.c;
                        if (i14 == 4 && z11 && !this.j) {
                            hVar2.c = 3;
                        } else if (i14 == 5 && z10 && z9) {
                            hVar2.c = 3;
                        }
                    } else {
                        hVar2.c = z10 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z7 && hVar2.c == 3 && (hVar = this.g) != null) {
                    ?? r1 = hVar.a;
                    int size3 = r1.size();
                    ?? r5 = hVar2.a;
                    if (size3 != r5.size()) {
                        z3 = z8;
                        break;
                    }
                    int size4 = r5.size();
                    ?? r6 = z2;
                    while (true) {
                        if (r6 >= size4) {
                            z3 = z2;
                            break;
                        }
                        if (!com.gamericefishpro.space.n1.b.b(((m) r1.get(r6)).c, ((m) r5.get(r6)).c)) {
                            z3 = z8;
                            break;
                        }
                        r6++;
                    }
                } else {
                    z3 = z8;
                    break;
                }
                this.g = hVar2;
                return z3;
            }
        }
        return true;
    }

    @Override // com.gamericefishpro.space.b2.g
    public final void b(g4 g4Var) {
        super.b(g4Var);
        h hVar = this.g;
        if (hVar == null) {
            return;
        }
        this.h = this.i;
        List list = hVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) list.get(i);
            boolean z = mVar.d;
            long j = mVar.a;
            boolean zA = g4Var.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.e(j);
            }
        }
        this.i = false;
        this.j = hVar.c == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        com.gamericefishpro.space.v0.e eVar = this.a;
        Object[] objArr = eVar.d;
        int i = eVar.i;
        for (int i2 = 0; i2 < i; i2++) {
            ((f) objArr[i2]).c();
        }
        ?? E = this.c;
        ?? eVar2 = 0;
        while (E != 0) {
            if (E instanceof t1) {
                ((t1) E).X();
            } else if ((E.i & 16) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                com.gamericefishpro.space.h1.l lVar = ((com.gamericefishpro.space.h2.j) E).I;
                int i3 = 0;
                E = E;
                eVar2 = eVar2;
                while (lVar != null) {
                    if ((lVar.i & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            eVar2 = eVar2;
                            E = lVar;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                            }
                            if (E != 0) {
                                eVar2.b(E);
                                E = 0;
                            }
                            eVar2.b(lVar);
                        }
                    }
                    lVar = lVar.y;
                    E = E;
                    eVar2 = eVar2;
                }
                if (i3 == 1) {
                }
            }
            E = com.gamericefishpro.space.h2.k.e(eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(g4 g4Var) {
        com.gamericefishpro.space.t.q qVar = this.e;
        boolean z = false;
        z = false;
        if (qVar.g() != 0) {
            com.gamericefishpro.space.h1.l lVar = this.c;
            if (lVar.G) {
                h hVar = this.g;
                Intrinsics.b(hVar);
                f1 f1Var = this.f;
                Intrinsics.b(f1Var);
                long j = f1Var.i;
                ?? E = lVar;
                ?? eVar = 0;
                while (E != 0) {
                    if (E instanceof t1) {
                        ((t1) E).p(hVar, i.i, j);
                    } else if ((E.i & 16) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                        com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
                        int i = 0;
                        while (lVar2 != null) {
                            if ((lVar2.i & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    E = E;
                                    eVar = eVar;
                                    eVar = eVar;
                                    E = lVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                    }
                                    if (E != 0) {
                                        eVar.b(E);
                                        E = 0;
                                    }
                                    eVar.b(lVar2);
                                }
                            } else {
                                E = E;
                                eVar = eVar;
                            }
                            lVar2 = lVar2.y;
                            E = E;
                            eVar = eVar;
                        }
                        if (i == 1) {
                            E = E;
                            eVar = eVar;
                        } else {
                            E = E;
                            eVar = eVar;
                        }
                    }
                    E = com.gamericefishpro.space.h2.k.e(eVar);
                }
                if (lVar.G) {
                    com.gamericefishpro.space.v0.e eVar2 = this.a;
                    Object[] objArr = eVar2.d;
                    int i2 = eVar2.i;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((f) objArr[i3]).d(g4Var);
                    }
                }
                z = true;
            }
        }
        b(g4Var);
        qVar.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(g4 g4Var, boolean z) {
        if (this.e.g() == 0) {
            return false;
        }
        ?? E = this.c;
        if (!E.G) {
            return false;
        }
        h hVar = this.g;
        Intrinsics.b(hVar);
        f1 f1Var = this.f;
        Intrinsics.b(f1Var);
        long j = f1Var.i;
        ?? E2 = E;
        ?? eVar = 0;
        while (E2 != 0) {
            if (E2 instanceof t1) {
                ((t1) E2).p(hVar, i.d, j);
            } else if ((E2.i & 16) != 0 && (E2 instanceof com.gamericefishpro.space.h2.j)) {
                com.gamericefishpro.space.h1.l lVar = ((com.gamericefishpro.space.h2.j) E2).I;
                int i = 0;
                while (lVar != null) {
                    if ((lVar.i & 16) != 0) {
                        i++;
                        if (i == 1) {
                            E2 = E2;
                            eVar = eVar;
                            eVar = eVar;
                            E2 = lVar;
                        } else {
                            if (eVar == 0) {
                                eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                            }
                            if (E2 != 0) {
                                eVar.b(E2);
                                E2 = 0;
                            }
                            eVar.b(lVar);
                        }
                    } else {
                        E2 = E2;
                        eVar = eVar;
                    }
                    lVar = lVar.y;
                    E2 = E2;
                    eVar = eVar;
                }
                if (i == 1) {
                    E2 = E2;
                    eVar = eVar;
                } else {
                    E2 = E2;
                    eVar = eVar;
                }
            }
            E2 = com.gamericefishpro.space.h2.k.e(eVar);
        }
        if (E.G) {
            com.gamericefishpro.space.v0.e eVar2 = this.a;
            Object[] objArr = eVar2.d;
            int i2 = eVar2.i;
            for (int i3 = 0; i3 < i2; i3++) {
                f fVar = (f) objArr[i3];
                Intrinsics.b(this.f);
                fVar.e(g4Var, z);
            }
        }
        if (E.G) {
            ?? eVar3 = 0;
            while (E != 0) {
                if (E instanceof t1) {
                    ((t1) E).p(hVar, i.e, j);
                } else if ((E.i & 16) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                    com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
                    int i4 = 0;
                    while (lVar2 != null) {
                        if ((lVar2.i & 16) != 0) {
                            i4++;
                            if (i4 == 1) {
                                E = E;
                                eVar3 = eVar3;
                                eVar3 = eVar3;
                                E = lVar2;
                            } else {
                                if (eVar3 == 0) {
                                    eVar3 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                }
                                if (E != 0) {
                                    eVar3.b(E);
                                    E = 0;
                                }
                                eVar3.b(lVar2);
                            }
                        } else {
                            E = E;
                            eVar3 = eVar3;
                        }
                        lVar2 = lVar2.y;
                        E = E;
                        eVar3 = eVar3;
                    }
                    if (i4 == 1) {
                        E = E;
                        eVar3 = eVar3;
                    } else {
                        E = E;
                        eVar3 = eVar3;
                    }
                }
                E = com.gamericefishpro.space.h2.k.e(eVar3);
            }
        }
        return true;
    }

    public final void f(long j, com.gamericefishpro.space.t.d0 d0Var) {
        com.gamericefishpro.space.c2.c cVar = this.d;
        if (cVar.b(j) && d0Var.g(this) < 0) {
            cVar.e(j);
            this.e.f(j);
        }
        com.gamericefishpro.space.v0.e eVar = this.a;
        Object[] objArr = eVar.d;
        int i = eVar.i;
        for (int i2 = 0; i2 < i; i2++) {
            ((f) objArr[i2]).f(j, d0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
