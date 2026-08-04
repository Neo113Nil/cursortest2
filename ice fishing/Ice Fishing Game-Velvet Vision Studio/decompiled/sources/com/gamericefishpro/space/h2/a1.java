package com.gamericefishpro.space.h2;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {
    public final f0 a;
    public final z0 b;
    public final q c;
    public f1 d;
    public final z1 e;
    public com.gamericefishpro.space.h1.l f;
    public com.gamericefishpro.space.v0.e g;
    public com.gamericefishpro.space.v0.e h;
    public final com.gamericefishpro.space.v0.e i;
    public y0 j;

    public a1(f0 f0Var) {
        this.a = f0Var;
        z0 z0Var = new z0();
        z0Var.v = -1;
        this.b = z0Var;
        q qVar = new q(f0Var);
        this.c = qVar;
        this.d = qVar;
        z1 z1Var = qVar.j0;
        this.e = z1Var;
        this.f = z1Var;
        this.i = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.m[16]);
    }

    public static final void a(a1 a1Var, com.gamericefishpro.space.h1.l lVar, f1 f1Var) {
        for (com.gamericefishpro.space.h1.l lVar2 = lVar.w; lVar2 != null; lVar2 = lVar2.w) {
            if (lVar2 == a1Var.b) {
                f0 f0VarV = a1Var.a.v();
                f1Var.J = f0VarV != null ? f0VarV.Z.c : null;
                a1Var.d = f1Var;
                return;
            } else {
                if ((lVar2.i & 2) != 0) {
                    return;
                }
                lVar2.z0(f1Var);
            }
        }
    }

    public static com.gamericefishpro.space.h1.l b(com.gamericefishpro.space.h1.k kVar, com.gamericefishpro.space.h1.l lVar) {
        com.gamericefishpro.space.h1.l lVarD;
        if (kVar instanceof w0) {
            lVarD = ((w0) kVar).d();
            lVarD.i = g1.f(lVarD);
        } else {
            b bVar = new b();
            bVar.i = g1.d(kVar);
            bVar.H = kVar;
            new HashSet();
            lVarD = bVar;
        }
        if (lVarD.G) {
            com.gamericefishpro.space.e2.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        lVarD.B = true;
        com.gamericefishpro.space.h1.l lVar2 = lVar.y;
        if (lVar2 != null) {
            lVar2.w = lVarD;
            lVarD.y = lVar2;
        }
        lVar.y = lVarD;
        lVarD.w = lVar;
        return lVarD;
    }

    public static com.gamericefishpro.space.h1.l c(com.gamericefishpro.space.h1.l lVar) {
        boolean z = lVar.G;
        if (z) {
            com.gamericefishpro.space.t.c0 c0Var = g1.a;
            if (!z) {
                com.gamericefishpro.space.e2.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            g1.a(lVar, -1, 2);
            lVar.x0();
            lVar.r0();
        }
        com.gamericefishpro.space.h1.l lVar2 = lVar.y;
        com.gamericefishpro.space.h1.l lVar3 = lVar.w;
        if (lVar2 != null) {
            lVar2.w = lVar3;
            lVar.y = null;
        }
        if (lVar3 != null) {
            lVar3.y = lVar2;
            lVar.w = null;
        }
        Intrinsics.b(lVar3);
        return lVar3;
    }

    public static void h(com.gamericefishpro.space.h1.k kVar, com.gamericefishpro.space.h1.k kVar2, com.gamericefishpro.space.h1.l lVar) {
        if ((kVar instanceof w0) && (kVar2 instanceof w0)) {
            Intrinsics.c(lVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((w0) kVar2).e(lVar);
            if (lVar.G) {
                g1.c(lVar);
                return;
            } else {
                lVar.C = true;
                return;
            }
        }
        if (!(lVar instanceof b)) {
            com.gamericefishpro.space.e2.a.b("Unknown Modifier.Node type");
            return;
        }
        b bVar = (b) lVar;
        boolean z = bVar.G;
        if (z) {
            if (!z) {
                com.gamericefishpro.space.e2.a.b("unInitializeModifier called on unattached node");
            }
            if ((bVar.i & 8) != 0) {
                ((com.gamericefishpro.space.i2.t) k.t(bVar)).C();
            }
        }
        bVar.H = kVar2;
        bVar.i = g1.d(kVar2);
        if (bVar.G) {
            bVar.A0(false);
        }
        if (lVar.G) {
            g1.c(lVar);
        } else {
            lVar.C = true;
        }
    }

    public final boolean d(int i) {
        return (i & this.f.v) != 0;
    }

    public final void e() {
        for (com.gamericefishpro.space.h1.l lVar = this.f; lVar != null; lVar = lVar.y) {
            lVar.w0();
            if (lVar.B) {
                com.gamericefishpro.space.t.c0 c0Var = g1.a;
                if (!lVar.G) {
                    com.gamericefishpro.space.e2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                g1.a(lVar, -1, 1);
            }
            if (lVar.C) {
                g1.c(lVar);
            }
            lVar.B = false;
            lVar.C = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0188  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x019e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void f(int r32, com.gamericefishpro.space.v0.e r33, com.gamericefishpro.space.v0.e r34, com.gamericefishpro.space.h1.l r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.h2.a1.f(int, com.gamericefishpro.space.v0.e, com.gamericefishpro.space.v0.e, com.gamericefishpro.space.h1.l, boolean):void");
    }

    public final void g() {
        f0 f0Var;
        x xVar;
        n1 n1Var;
        com.gamericefishpro.space.h1.l lVar = this.e.w;
        f1 f1Var = this.c;
        while (true) {
            f0Var = this.a;
            if (lVar == null) {
                break;
            }
            v vVarF = k.f(lVar);
            if (vVarF != null) {
                f1 f1Var2 = lVar.A;
                if (f1Var2 != null) {
                    xVar = (x) f1Var2;
                    v vVar = xVar.j0;
                    xVar.i1(vVarF);
                    if (vVar != lVar && (n1Var = xVar.e0) != null) {
                        ((com.gamericefishpro.space.i2.g1) n1Var).invalidate();
                    }
                } else {
                    xVar = new x(f0Var, vVarF);
                    lVar.z0(xVar);
                }
                f1Var.J = xVar;
                xVar.I = f1Var;
                f1Var = xVar;
            } else {
                lVar.z0(f1Var);
            }
            lVar = lVar.w;
        }
        f0 f0VarV = f0Var.v();
        f1Var.J = f0VarV != null ? f0VarV.Z.c : null;
        this.d = f1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        com.gamericefishpro.space.h1.l lVar = this.f;
        z1 z1Var = this.e;
        if (lVar == z1Var) {
            sb.append("]");
        } else {
            while (lVar != null && lVar != z1Var) {
                sb.append(String.valueOf(lVar));
                if (lVar.y == z1Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                lVar = lVar.y;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
