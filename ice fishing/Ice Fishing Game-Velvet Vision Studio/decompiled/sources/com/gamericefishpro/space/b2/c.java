package com.gamericefishpro.space.b2;

import com.gamericefishpro.space.i9.g4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final com.gamericefishpro.space.f2.u a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final com.gamericefishpro.space.t.d0 f = new com.gamericefishpro.space.t.d0();
    public final g g = new g();
    public final com.gamericefishpro.space.t.z h = new com.gamericefishpro.space.t.z(10);

    public c(com.gamericefishpro.space.f2.u uVar) {
        this.a = uVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa A[LOOP:2: B:38:0x00a1->B:52:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff A[EDGE_INSN: B:61:0x00ff->B:53:0x00ff BREAK  A[LOOP:2: B:38:0x00a1->B:52:0x00fa], SYNTHETIC] */
    public final void a(long j, List list, boolean z) {
        com.gamericefishpro.space.t.z zVar;
        f fVar;
        Object objD;
        Object obj;
        int size = list.size();
        g gVar = this.g;
        g gVar2 = gVar;
        boolean z2 = true;
        int i = 0;
        while (true) {
            zVar = this.h;
            if (i >= size) {
                break;
            }
            com.gamericefishpro.space.h1.l lVar = (com.gamericefishpro.space.h1.l) list.get(i);
            if (lVar.G) {
                lVar.F = new b(0, this, lVar);
                if (z2) {
                    com.gamericefishpro.space.v0.e eVar = gVar2.a;
                    Object[] objArr = eVar.d;
                    int i2 = eVar.i;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (Intrinsics.a(((f) obj).c, lVar)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    fVar = (f) obj;
                    if (fVar != null) {
                        fVar.i = true;
                        fVar.d.a(j);
                        if (z) {
                            Object objD2 = zVar.d(j);
                            if (objD2 == null) {
                                objD2 = new com.gamericefishpro.space.t.d0();
                                zVar.f(j, objD2);
                            }
                            ((com.gamericefishpro.space.t.d0) objD2).a(fVar);
                        }
                    } else {
                        z2 = false;
                        fVar = new f(lVar);
                        fVar.d.a(j);
                        if (z) {
                            objD = zVar.d(j);
                            if (objD == null) {
                                objD = new com.gamericefishpro.space.t.d0();
                                zVar.f(j, objD);
                            }
                            ((com.gamericefishpro.space.t.d0) objD).a(fVar);
                        }
                        gVar2.a.b(fVar);
                    }
                } else {
                    fVar = new f(lVar);
                    fVar.d.a(j);
                    if (z) {
                        objD = zVar.d(j);
                        if (objD == null) {
                            objD = new com.gamericefishpro.space.t.d0();
                            zVar.f(j, objD);
                        }
                        ((com.gamericefishpro.space.t.d0) objD).a(fVar);
                    }
                    gVar2.a.b(fVar);
                }
                gVar2 = fVar;
            }
            i++;
        }
        if (z) {
            long[] jArr = zVar.b;
            Object[] objArr2 = zVar.c;
            long[] jArr2 = zVar.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr2[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i4 != length) {
                            break;
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr[i8];
                                com.gamericefishpro.space.t.d0 d0Var = (com.gamericefishpro.space.t.d0) objArr2[i8];
                                com.gamericefishpro.space.v0.e eVar2 = gVar.a;
                                Object[] objArr3 = eVar2.d;
                                int i9 = eVar2.i;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((f) objArr3[i10]).f(j3, d0Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                        }
                        if (i6 != i5) {
                            break;
                        } else if (i4 != length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
        zVar.a();
    }

    public final boolean b(g4 g4Var, boolean z) {
        com.gamericefishpro.space.t.q qVar = (com.gamericefishpro.space.t.q) g4Var.b;
        com.gamericefishpro.space.f2.u uVar = this.a;
        g gVar = this.g;
        boolean zA = gVar.a(qVar, uVar, g4Var, z);
        com.gamericefishpro.space.v0.e eVar = gVar.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = eVar.d;
        int i = eVar.i;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((f) objArr[i2]).e(g4Var, z) || z3;
        }
        Object[] objArr2 = eVar.d;
        int i3 = eVar.i;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((f) objArr2[i4]).d(g4Var) || z4;
        }
        gVar.b(g4Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            com.gamericefishpro.space.t.d0 d0Var = this.f;
            int i5 = d0Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((com.gamericefishpro.space.h1.l) d0Var.f(i6));
            }
            d0Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            gVar.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        g gVar = this.g;
        com.gamericefishpro.space.v0.e eVar = gVar.a;
        Object[] objArr = eVar.d;
        int i = eVar.i;
        for (int i2 = 0; i2 < i; i2++) {
            ((f) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            gVar.a.g();
        }
    }

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
    public final void d(com.gamericefishpro.space.h1.l lVar) {
        if (this.b) {
            this.e = true;
            this.f.a(lVar);
            return;
        }
        g gVar = this.g;
        com.gamericefishpro.space.t.d0 d0Var = gVar.b;
        d0Var.d();
        d0Var.a(gVar);
        while (d0Var.i()) {
            g gVar2 = (g) d0Var.k(d0Var.b - 1);
            int i = 0;
            while (true) {
                com.gamericefishpro.space.v0.e eVar = gVar2.a;
                if (i < eVar.i) {
                    f fVar = (f) eVar.d[i];
                    if (Intrinsics.a(fVar.c, lVar)) {
                        gVar2.a.k(fVar);
                        fVar.c();
                    } else {
                        d0Var.a(fVar);
                        i++;
                    }
                }
            }
        }
    }
}
