package com.gamericefishpro.space.o2;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.x1;
import com.gamericefishpro.space.t.h0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final com.gamericefishpro.space.n1.c a = new com.gamericefishpro.space.n1.c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Code duplicated, block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    public static final o a(f0 f0Var, boolean z) {
        com.gamericefishpro.space.h1.l lVar = f0Var.Z.f;
        com.gamericefishpro.space.h2.i iVar = null;
        if ((lVar.v & 8) != 0) {
            loop0: while (lVar != null) {
                if ((lVar.i & 8) == 0) {
                    if ((lVar.v & 8) != 0) {
                        break;
                        break;
                    }
                    lVar = lVar.y;
                } else {
                    com.gamericefishpro.space.h1.l lVarE = lVar;
                    com.gamericefishpro.space.v0.e eVar = null;
                    while (lVarE != null) {
                        if (lVarE instanceof x1) {
                            iVar = lVarE;
                            break loop0;
                        }
                        if ((lVarE.i & 8) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                            int i = 0;
                            for (com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar2 != null; lVar2 = lVar2.y) {
                                if ((lVar2.i & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        lVarE = lVar2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                        }
                                        if (lVarE != null) {
                                            eVar.b(lVarE);
                                            lVarE = null;
                                        }
                                        eVar.b(lVar2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                    }
                    if ((lVar.v & 8) != 0) {
                        break;
                    }
                    lVar = lVar.y;
                }
            }
        }
        Intrinsics.b(iVar);
        com.gamericefishpro.space.h1.l lVar3 = ((com.gamericefishpro.space.h1.l) ((x1) iVar)).d;
        l lVarX = f0Var.x();
        if (lVarX == null) {
            lVarX = new l();
        }
        return new o(lVar3, z, f0Var, lVarX);
    }

    public static final com.gamericefishpro.space.t.w b(q qVar, Function1 function1) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            o oVarA = qVar.a();
            f0 f0Var = oVarA.c;
            if (f0Var.I() && f0Var.H()) {
                com.gamericefishpro.space.t.w wVar = new com.gamericefishpro.space.t.w(48);
                com.gamericefishpro.space.m.d dVar = new com.gamericefishpro.space.m.d(16);
                com.gamericefishpro.space.c3.j jVarD = com.gamericefishpro.space.b9.a.D(oVarA.g());
                ((Region) dVar.e).set(jVarD.a, jVarD.b, jVarD.c, jVarD.d);
                c(dVar, oVarA, wVar, function1, oVarA, new com.gamericefishpro.space.m.d(16));
                return wVar;
            }
            com.gamericefishpro.space.t.w wVar2 = com.gamericefishpro.space.t.m.a;
            Intrinsics.c(wVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return wVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(com.gamericefishpro.space.m.d dVar, o oVar, com.gamericefishpro.space.t.w wVar, Function1 function1, o oVar2, com.gamericefishpro.space.m.d dVar2) {
        com.gamericefishpro.space.n1.c cVarE1;
        f0 f0Var;
        o oVar3 = oVar;
        int i = oVar3.g;
        com.gamericefishpro.space.m.d dVar3 = dVar2;
        Region region = (Region) dVar3.e;
        f0 f0Var2 = oVar2.c;
        int i2 = oVar2.g;
        boolean z = (f0Var2.I() && f0Var2.H()) ? false : true;
        com.gamericefishpro.space.m.d dVar4 = dVar;
        Region region2 = (Region) dVar4.e;
        if (!region2.isEmpty() || i2 == i) {
            if (!z || oVar2.e) {
                com.gamericefishpro.space.h2.i iVarF = oVar2.f();
                if (iVarF == null) {
                    cVarE1 = f0Var2.Z.c.e1();
                } else {
                    com.gamericefishpro.space.h1.l lVar = ((com.gamericefishpro.space.h1.l) iVarF).d;
                    Object objG = oVar2.d.d.g(k.b);
                    if (objG == null) {
                        objG = null;
                    }
                    boolean z2 = objG != null;
                    if (!lVar.d.G) {
                        cVarE1 = com.gamericefishpro.space.n1.c.e;
                    } else if (z2) {
                        cVarE1 = com.gamericefishpro.space.h2.k.q(lVar, 8).e1();
                    } else {
                        f1 f1VarQ = com.gamericefishpro.space.h2.k.q(lVar, 8);
                        cVarE1 = com.gamericefishpro.space.f2.x.h(f1VarQ).z(f1VarQ, true);
                    }
                }
                com.gamericefishpro.space.c3.j jVarD = com.gamericefishpro.space.b9.a.D(cVarE1);
                region.set(jVarD.a, jVarD.b, jVarD.c, jVarD.d);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (oVar2.e) {
                        o oVarL = oVar2.l();
                        wVar.h(i2, new p(oVar2, com.gamericefishpro.space.b9.a.D((oVarL == null || (f0Var = oVarL.c) == null || !f0Var.I()) ? a : oVarL.g())));
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            wVar.h(i2, new p(oVar2, new com.gamericefishpro.space.c3.j(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                wVar.h(i2, new p(oVar2, new com.gamericefishpro.space.c3.j(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = o.j(4, oVar2);
                int size = listJ.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) function1.invoke(listJ.get(size))).booleanValue()) {
                        c(dVar4, oVar3, wVar, function1, (o) listJ.get(size), dVar3);
                    }
                    size--;
                    dVar4 = dVar;
                    oVar3 = oVar;
                    dVar3 = dVar2;
                }
                if (f(oVar2)) {
                    region2.op(jVarD.a, jVarD.b, jVarD.c, jVarD.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(l lVar, v vVar) {
        Object objG = lVar.d.g(vVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final boolean e(o oVar) {
        f1 f1VarD = oVar.d();
        l lVar = oVar.d;
        if (f1VarD != null ? f1VarD.S0() : false) {
            return true;
        }
        v vVar = s.a;
        if (lVar.d.c(s.p)) {
            return true;
        }
        return lVar.d.c(s.o);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean f(o oVar) {
        if (!e(oVar)) {
            l lVar = oVar.d;
            if (lVar.i) {
                return true;
            }
            h0 h0Var = lVar.d;
            Object[] objArr = h0Var.b;
            Object[] objArr2 = h0Var.c;
            long[] jArr = h0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((v) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }
}
