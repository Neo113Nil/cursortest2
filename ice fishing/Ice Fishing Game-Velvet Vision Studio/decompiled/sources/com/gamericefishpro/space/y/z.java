package com.gamericefishpro.space.y;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.gamericefishpro.space.h2.c2;
import com.gamericefishpro.space.h2.j1;
import com.gamericefishpro.space.h2.t1;
import com.gamericefishpro.space.h2.x1;
import com.gamericefishpro.space.i2.z1;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.pi.g1;
import com.gamericefishpro.space.pi.s1;
import com.gamericefishpro.space.w.m1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class z extends com.gamericefishpro.space.h2.j implements t1, com.gamericefishpro.space.z1.b, x1, c2, com.gamericefishpro.space.h2.h, j1, com.gamericefishpro.space.y1.c {
    public static final c c0 = new c();
    public com.gamericefishpro.space.b0.i J;
    public boolean K;
    public com.gamericefishpro.space.o2.h L;
    public boolean M;
    public Function0 N;
    public final g0 O;
    public q0 P;
    public com.gamericefishpro.space.h2.i Q;
    public com.gamericefishpro.space.b0.k R;
    public com.gamericefishpro.space.b0.f S;
    public final com.gamericefishpro.space.t.z T;
    public long U;
    public com.gamericefishpro.space.b0.k V;
    public com.gamericefishpro.space.b0.i W;
    public boolean X;
    public com.gamericefishpro.space.u6.c Y;
    public s1 Z;
    public final c a0;
    public com.gamericefishpro.space.b2.m b0;

    public z(com.gamericefishpro.space.b0.i iVar, boolean z, boolean z2, com.gamericefishpro.space.o2.h hVar, Function0 function0) {
        this.J = iVar;
        this.K = z;
        this.L = hVar;
        this.M = z2;
        this.N = function0;
        this.O = new g0(iVar, new g1(1, this, z.class, "onFocusChange", "onFocusChange(Z)V", 0, 2));
        int i = com.gamericefishpro.space.t.o.a;
        this.T = new com.gamericefishpro.space.t.z(6);
        this.U = 0L;
        com.gamericefishpro.space.b0.i iVar2 = this.J;
        this.W = iVar2;
        this.X = iVar2 == null;
        this.a0 = c0;
    }

    @Override // com.gamericefishpro.space.h2.j1
    public final void E() {
        if (this.K) {
            com.gamericefishpro.space.h2.k.p(this, new a(this, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void E0() {
        com.gamericefishpro.space.b0.i iVar = this.J;
        com.gamericefishpro.space.t.z zVar = this.T;
        if (iVar != null) {
            com.gamericefishpro.space.b0.k kVar = this.R;
            if (kVar != null) {
                iVar.b(new com.gamericefishpro.space.b0.j(kVar));
            }
            com.gamericefishpro.space.b0.k kVar2 = this.V;
            if (kVar2 != null) {
                iVar.b(new com.gamericefishpro.space.b0.j(kVar2));
            }
            com.gamericefishpro.space.b0.f fVar = this.S;
            if (fVar != null) {
                iVar.b(new com.gamericefishpro.space.b0.g(fVar));
            }
            Object[] objArr = zVar.c;
            long[] jArr = zVar.a;
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
                                iVar.b(new com.gamericefishpro.space.b0.j((com.gamericefishpro.space.b0.k) objArr[(i << 3) + i3]));
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
        }
        this.R = null;
        this.V = null;
        this.S = null;
        zVar.a();
    }

    public final void F0(boolean z) {
        com.gamericefishpro.space.b0.i iVar = this.J;
        if (iVar != null) {
            s1 s1Var = this.Z;
            com.gamericefishpro.space.th.a aVar = null;
            if (s1Var == null || !s1Var.b()) {
                com.gamericefishpro.space.b0.k kVar = z ? this.V : this.R;
                if (kVar != null) {
                    com.gamericefishpro.space.b0.j jVar = new com.gamericefishpro.space.b0.j(kVar);
                    com.gamericefishpro.space.pi.d1 d1Var = (com.gamericefishpro.space.pi.d1) ((com.gamericefishpro.space.ui.c) o0()).d.j(com.gamericefishpro.space.pi.u.e);
                    com.gamericefishpro.space.pi.a0.u(o0(), null, new com.gamericefishpro.space.db.d(iVar, jVar, d1Var != null ? d1Var.n(new b(0, iVar, jVar)) : null, aVar, 17), 3);
                }
            } else {
                s1 s1Var2 = this.Z;
                if (s1Var2 != null) {
                    s1Var2.c(null);
                }
            }
            if (z) {
                this.V = null;
            } else {
                this.R = null;
            }
        }
    }

    public final void G0(boolean z, long j) {
        com.gamericefishpro.space.b0.i iVar = this.J;
        if (iVar != null) {
            s1 s1Var = this.Z;
            if (s1Var == null || !s1Var.b()) {
                com.gamericefishpro.space.b0.k kVar = z ? this.V : this.R;
                if (kVar != null) {
                    com.gamericefishpro.space.pi.a0.u(o0(), null, new e(kVar, iVar, (com.gamericefishpro.space.th.a) null), 3);
                }
            } else {
                s1Var.c(null);
                com.gamericefishpro.space.pi.a0.u(o0(), null, new d(s1Var, j, iVar, null, 0), 3);
            }
            if (z) {
                this.V = null;
            } else {
                this.R = null;
            }
        }
    }

    public final void H0(boolean z, long j) {
        com.gamericefishpro.space.b0.i iVar = this.J;
        if (iVar != null) {
            com.gamericefishpro.space.b0.k kVar = new com.gamericefishpro.space.b0.k(j);
            com.gamericefishpro.space.ei.w wVar = new com.gamericefishpro.space.ei.w();
            com.gamericefishpro.space.h2.k.v(this, com.gamericefishpro.space.z.y0.I, new m1(4, wVar));
            if (!wVar.d) {
                int i = a0.b;
                ViewParent parent = com.gamericefishpro.space.h2.k.u(this).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
                if (z) {
                    this.V = kVar;
                } else {
                    this.R = kVar;
                }
                com.gamericefishpro.space.pi.a0.u(o0(), null, new e(iVar, kVar, (com.gamericefishpro.space.th.a) null), 3);
                return;
            }
            this.Z = com.gamericefishpro.space.pi.a0.u(o0(), null, new f(iVar, kVar, z, this, null), 3);
        }
    }

    public final void I0() {
        if (this.Q != null) {
            return;
        }
        q0 q0Var = this.K ? this.P : null;
        if (q0Var != null) {
            if (this.J == null) {
                this.J = new com.gamericefishpro.space.b0.i();
            }
            this.O.F0(this.J);
            com.gamericefishpro.space.b0.i iVar = this.J;
            Intrinsics.b(iVar);
            com.gamericefishpro.space.h2.i iVarA = q0Var.a(iVar);
            A0(iVarA);
            this.Q = iVarA;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    public final void J0(com.gamericefishpro.space.b0.i iVar, boolean z, boolean z2, com.gamericefishpro.space.o2.h hVar, Function0 function0) {
        boolean z3;
        boolean z4;
        com.gamericefishpro.space.h2.i iVar2;
        if (Intrinsics.a(this.W, iVar)) {
            z3 = false;
        } else {
            E0();
            this.W = iVar;
            this.J = iVar;
            z3 = true;
        }
        if (this.K != z) {
            this.K = z;
            if (z) {
                E();
            }
            z3 = true;
        }
        boolean z5 = this.M;
        g0 g0Var = this.O;
        if (z5 != z2) {
            if (z2) {
                A0(g0Var);
            } else {
                B0(g0Var);
                E0();
            }
            com.gamericefishpro.space.h2.k.l(this);
            this.M = z2;
        }
        if (!Intrinsics.a(this.L, hVar)) {
            this.L = hVar;
            com.gamericefishpro.space.h2.k.l(this);
        }
        this.N = function0;
        boolean z6 = this.X;
        com.gamericefishpro.space.b0.i iVar3 = this.W;
        if (z6 != (iVar3 == null)) {
            boolean z7 = iVar3 == null;
            this.X = z7;
            z4 = (z7 || this.Q != null) ? z3 : true;
        }
        if (z4 && ((iVar2 = this.Q) != null || !this.X)) {
            if (iVar2 != null) {
                B0(iVar2);
            }
            this.Q = null;
            I0();
        }
        g0Var.F0(this.J);
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final void L(com.gamericefishpro.space.o2.w wVar) {
        com.gamericefishpro.space.o2.h hVar = this.L;
        if (hVar != null) {
            com.gamericefishpro.space.o2.u.a(wVar, hVar.a);
        }
        a aVar = new a(this, 1);
        com.gamericefishpro.space.ki.d[] dVarArr = com.gamericefishpro.space.o2.u.a;
        wVar.b(com.gamericefishpro.space.o2.k.b, new com.gamericefishpro.space.o2.a(null, aVar));
        if (this.M) {
            this.O.L(wVar);
        } else {
            wVar.b(com.gamericefishpro.space.o2.s.i, Unit.a);
        }
        D0(wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // com.gamericefishpro.space.z1.b
    public final boolean P(KeyEvent keyEvent) {
        boolean z;
        int iNumberOfTrailingZeros;
        Object obj;
        I0();
        long jH = com.gamericefishpro.space.i.a.h(keyEvent.getKeyCode());
        boolean z2 = this.M;
        com.gamericefishpro.space.t.z zVar = this.T;
        com.gamericefishpro.space.th.a aVar = null;
        int i = 1;
        if (z2 && a4.D(keyEvent) == 2 && q.k(keyEvent)) {
            if (!zVar.b(jH)) {
                com.gamericefishpro.space.b0.k kVar = new com.gamericefishpro.space.b0.k(this.U);
                zVar.f(jH, kVar);
                if (this.J == null) {
                    return true;
                }
                com.gamericefishpro.space.pi.a0.u(o0(), null, new g(this, kVar, aVar, 2), 3);
                return true;
            }
        } else if (this.M && a4.D(keyEvent) == 1 && q.k(keyEvent)) {
            zVar.getClass();
            int iHashCode = Long.hashCode(jH) * (-862048943);
            int i2 = iHashCode ^ (iHashCode << 16);
            int i3 = i2 & 127;
            int i4 = zVar.d;
            int i5 = (i2 >>> 7) & i4;
            int i6 = 0;
            loop0: while (true) {
                long[] jArr = zVar.a;
                int i7 = i5 >> 3;
                int i8 = (i5 & 7) << 3;
                z = i;
                long j = (((-i8) >> 63) & (jArr[i7 + i] << (64 - i8))) | (jArr[i7] >>> i8);
                long j2 = (((long) i3) * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j4 != 0) {
                    iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                    long j5 = j3;
                    if (zVar.b[iNumberOfTrailingZeros] == jH) {
                        break loop0;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                if ((j & ((~j) << 6) & j3) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i6 += 8;
                i5 = (i5 + i6) & i4;
                i = z ? 1 : 0;
            }
            if (iNumberOfTrailingZeros >= 0) {
                zVar.e--;
                long[] jArr2 = zVar.a;
                int i9 = zVar.d;
                int i10 = iNumberOfTrailingZeros >> 3;
                int i11 = (iNumberOfTrailingZeros & 7) << 3;
                long j6 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
                jArr2[i10] = j6;
                jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j6;
                Object[] objArr = zVar.c;
                obj = objArr[iNumberOfTrailingZeros];
                objArr[iNumberOfTrailingZeros] = null;
            } else {
                obj = null;
            }
            com.gamericefishpro.space.b0.k kVar2 = (com.gamericefishpro.space.b0.k) obj;
            if (kVar2 != null) {
                if (this.J != null) {
                    com.gamericefishpro.space.pi.a0.u(o0(), null, new g(this, kVar2, aVar, 3), 3);
                }
                this.N.invoke();
            }
            if (kVar2 != null) {
                return z;
            }
            return false;
        }
        return false;
    }

    @Override // com.gamericefishpro.space.h2.t1
    public final void X() {
        com.gamericefishpro.space.b0.f fVar;
        com.gamericefishpro.space.b0.i iVar = this.J;
        if (iVar != null && (fVar = this.S) != null) {
            iVar.b(new com.gamericefishpro.space.b0.g(fVar));
        }
        this.S = null;
        if (this.b0 != null) {
            this.b0 = null;
            F0(false);
        }
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final boolean a0() {
        return true;
    }

    @Override // com.gamericefishpro.space.y1.c
    public final void h(com.gamericefishpro.space.f1.z zVar, com.gamericefishpro.space.b2.i iVar) {
        ArrayList arrayList = (ArrayList) zVar.b;
        I0();
        if (this.M) {
            if (this.Y == null) {
                com.gamericefishpro.space.u6.c cVar = new com.gamericefishpro.space.u6.c();
                cVar.d = this;
                this.Y = cVar;
            }
            com.gamericefishpro.space.u6.c cVar2 = this.Y;
            if (cVar2 != null) {
                Function0 function0 = this.N;
                z zVar2 = (z) cVar2.d;
                int i = 0;
                if (iVar != com.gamericefishpro.space.b2.i.e) {
                    if (iVar != com.gamericefishpro.space.b2.i.i || ((com.gamericefishpro.space.y1.b) cVar2.e) == null) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        com.gamericefishpro.space.y1.b bVar = (com.gamericefishpro.space.y1.b) arrayList.get(i);
                        if (bVar.i && !bVar.equals((com.gamericefishpro.space.y1.b) cVar2.e)) {
                            cVar2.s();
                            return;
                        }
                        i++;
                    }
                    return;
                }
                com.gamericefishpro.space.y1.b bVar2 = (com.gamericefishpro.space.y1.b) cVar2.e;
                if (bVar2 == null) {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        com.gamericefishpro.space.y1.b bVar3 = (com.gamericefishpro.space.y1.b) arrayList.get(i2);
                        if (!bVar3.h && bVar3.d) {
                            com.gamericefishpro.space.y1.b bVar4 = (com.gamericefishpro.space.y1.b) arrayList.get(0);
                            cVar2.e = bVar4;
                            zVar2.H0(true, bVar4.c);
                            bVar4.i = true;
                            return;
                        }
                    }
                    return;
                }
                long j = bVar2.c;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    com.gamericefishpro.space.y1.b bVar5 = (com.gamericefishpro.space.y1.b) arrayList.get(i3);
                    if (bVar5.h && bVar5.d) {
                        if (Math.abs(com.gamericefishpro.space.n1.b.c(com.gamericefishpro.space.n1.b.d(((com.gamericefishpro.space.y1.b) arrayList.get(0)).c, j))) > ((z1) com.gamericefishpro.space.h2.k.h(zVar2, com.gamericefishpro.space.i2.b1.s)).b()) {
                            cVar2.s();
                            return;
                        }
                        return;
                    }
                }
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    com.gamericefishpro.space.y1.b bVar6 = (com.gamericefishpro.space.y1.b) arrayList.get(i4);
                    if (bVar6.i || !bVar6.h || bVar6.d) {
                        int size5 = arrayList.size();
                        while (i < size5) {
                            if (((com.gamericefishpro.space.y1.b) arrayList.get(i)).i) {
                                cVar2.s();
                                return;
                            }
                            i++;
                        }
                        return;
                    }
                }
                ((com.gamericefishpro.space.y1.b) arrayList.get(0)).i = true;
                zVar2.G0(true, j);
                function0.invoke();
                cVar2.e = null;
            }
        }
    }

    @Override // com.gamericefishpro.space.h2.c2
    public final Object i() {
        return this.a0;
    }

    @Override // com.gamericefishpro.space.h2.t1
    public final void p(com.gamericefishpro.space.b2.h hVar, com.gamericefishpro.space.b2.i iVar, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.U = (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        I0();
        com.gamericefishpro.space.th.a aVar = null;
        if (this.M && iVar == com.gamericefishpro.space.b2.i.e) {
            int i = hVar.c;
            if (i == 4) {
                com.gamericefishpro.space.pi.a0.u(o0(), null, new h(this, aVar, 0), 3);
            } else if (i == 5) {
                com.gamericefishpro.space.pi.a0.u(o0(), null, new h(this, aVar, 1), 3);
            }
        }
        if (iVar != com.gamericefishpro.space.b2.i.e) {
            if (iVar != com.gamericefishpro.space.b2.i.i || this.b0 == null) {
                return;
            }
            List list = hVar.a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                com.gamericefishpro.space.b2.m mVar = (com.gamericefishpro.space.b2.m) list.get(i2);
                if (mVar.b() && !mVar.equals(this.b0)) {
                    this.b0 = null;
                    F0(false);
                    return;
                }
            }
            return;
        }
        com.gamericefishpro.space.b2.m mVar2 = this.b0;
        if (mVar2 == null) {
            if (com.gamericefishpro.space.z.s1.c(hVar, true)) {
                com.gamericefishpro.space.b2.m mVar3 = (com.gamericefishpro.space.b2.m) hVar.a.get(0);
                mVar3.a();
                this.b0 = mVar3;
                if (this.M) {
                    H0(false, mVar3.c);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = hVar.a;
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            com.gamericefishpro.space.b2.m mVar4 = (com.gamericefishpro.space.b2.m) list2.get(i3);
            if (!((mVar4.b() || !mVar4.h || mVar4.d) ? false : true)) {
                long jS = com.gamericefishpro.space.h2.k.s(this).S.S(((z1) com.gamericefishpro.space.h2.k.h(this, com.gamericefishpro.space.i2.b1.s)).c());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jS & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jS >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32);
                int size3 = list2.size();
                int i4 = 0;
                while (i4 < size3) {
                    com.gamericefishpro.space.b2.m mVar5 = (com.gamericefishpro.space.b2.m) list2.get(i4);
                    if (!mVar5.b()) {
                        int i5 = mVar5.i == 1 ? 1 : 0;
                        long j3 = mVar5.c;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                        float f = i5;
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) * f;
                        int i6 = size3;
                        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) * f;
                        if (!((fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4))) {
                            i4++;
                            size3 = i6;
                        }
                    }
                    this.b0 = null;
                    F0(false);
                    return;
                }
                return;
            }
        }
        ((com.gamericefishpro.space.b2.m) list2.get(0)).a();
        if (this.M) {
            G0(false, mVar2.c);
            this.N.invoke();
        }
        this.b0 = null;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        E();
        if (!this.X) {
            I0();
        }
        if (this.M) {
            A0(this.O);
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        E0();
        if (this.W == null) {
            this.J = null;
        }
        com.gamericefishpro.space.h2.i iVar = this.Q;
        if (iVar != null) {
            B0(iVar);
        }
        this.Q = null;
    }

    @Override // com.gamericefishpro.space.y1.c
    public final void u() {
        com.gamericefishpro.space.u6.c cVar = this.Y;
        if (cVar != null) {
            cVar.s();
        }
    }

    public void D0(com.gamericefishpro.space.o2.w wVar) {
    }
}
