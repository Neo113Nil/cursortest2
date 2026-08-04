package com.gamericefishpro.space.f2;

import android.os.Handler;
import android.view.ViewGroup;
import com.gamericefishpro.space.h2.d2;
import com.gamericefishpro.space.i2.r2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements com.gamericefishpro.space.t0.j {
    public final b0 A;
    public final y B;
    public final com.gamericefishpro.space.t.h0 C;
    public final i1 D;
    public final com.gamericefishpro.space.t.h0 E;
    public final com.gamericefishpro.space.v0.e F;
    public int G;
    public int H;
    public final String I;
    public final com.gamericefishpro.space.h2.f0 d;
    public com.gamericefishpro.space.t0.u e;
    public j1 i;
    public int v;
    public int w;
    public final com.gamericefishpro.space.t.h0 y;
    public final com.gamericefishpro.space.t.h0 z;

    public h0(com.gamericefishpro.space.h2.f0 f0Var, j1 j1Var) {
        this.d = f0Var;
        this.i = j1Var;
        long[] jArr = com.gamericefishpro.space.t.p0.a;
        this.y = new com.gamericefishpro.space.t.h0();
        this.z = new com.gamericefishpro.space.t.h0();
        this.A = new b0(this);
        this.B = new y(this);
        this.C = new com.gamericefishpro.space.t.h0();
        this.D = new i1();
        this.E = new com.gamericefishpro.space.t.h0();
        this.F = new com.gamericefishpro.space.v0.e(new Object[16]);
        this.I = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void a(h0 h0Var, Object obj) {
        com.gamericefishpro.space.h2.f0 f0Var = h0Var.d;
        h0Var.h();
        com.gamericefishpro.space.h2.f0 f0Var2 = (com.gamericefishpro.space.h2.f0) h0Var.C.k(obj);
        if (f0Var2 != null) {
            if (h0Var.H <= 0) {
                com.gamericefishpro.space.e2.a.b("No pre-composed items to dispose");
            }
            int i = ((com.gamericefishpro.space.v0.b) f0Var.o()).d.i(f0Var2);
            if (i < ((com.gamericefishpro.space.v0.b) f0Var.o()).d.i - h0Var.H) {
                com.gamericefishpro.space.e2.a.b("Item is not in pre-composed item range");
            }
            h0Var.G++;
            h0Var.H--;
            z zVar = (z) h0Var.y.g(f0Var2);
            if (zVar != null) {
                c(zVar);
            }
            int i2 = (((com.gamericefishpro.space.v0.b) f0Var.o()).d.i - h0Var.H) - h0Var.G;
            h0Var.j(i, i2);
            h0Var.g(i2);
        }
        if (h0Var.F.h(obj)) {
            com.gamericefishpro.space.h2.f0.V(f0Var, true, 6);
        }
    }

    public static void c(z zVar) {
        com.gamericefishpro.space.t.i0 i0Var;
        com.gamericefishpro.space.t0.i1 i1Var = zVar.f;
        if (i1Var != null) {
            i1Var.h.set(com.gamericefishpro.space.t0.j1.e);
            com.gamericefishpro.space.u6.q qVar = i1Var.k;
            if (((com.gamericefishpro.space.t.i0) qVar.d).h()) {
                i0Var = (com.gamericefishpro.space.t.i0) qVar.d;
                com.gamericefishpro.space.t.i0 i0Var2 = com.gamericefishpro.space.t.q0.a;
                qVar.d = new com.gamericefishpro.space.t.i0();
                ((com.gamericefishpro.space.v0.e) qVar.c).g();
            } else {
                i0Var = null;
            }
            qVar.b();
            com.gamericefishpro.space.t0.x xVar = i1Var.a;
            xVar.J = null;
            if (i0Var != null) {
                xVar.N.k = i0Var;
                xVar.P = 2;
            }
            zVar.f = null;
            com.gamericefishpro.space.t0.x xVar2 = zVar.c;
            if (xVar2 != null) {
                xVar2.m();
            }
            zVar.c = null;
        }
    }

    public final void b(z zVar, boolean z) {
        com.gamericefishpro.space.t0.i1 i1Var = zVar.f;
        if (i1Var != null) {
            com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
            Function1 function1E = gVarE != null ? gVarE.e() : null;
            com.gamericefishpro.space.f1.g gVarH = com.gamericefishpro.space.f1.v.h(gVarE);
            try {
                com.gamericefishpro.space.h2.f0 f0Var = this.d;
                f0Var.K = true;
                if (z) {
                    while (!i1Var.c()) {
                        try {
                            i1Var.e(new com.gamericefishpro.space.bb.s(11));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                i1Var.a();
                zVar.f = null;
                Unit unit = Unit.a;
                f0Var.K = false;
                com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
            } catch (Throwable th2) {
                com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // com.gamericefishpro.space.t0.j
    public final void d() {
        com.gamericefishpro.space.t0.x xVar;
        com.gamericefishpro.space.h2.f0 f0Var = this.d;
        f0Var.K = true;
        com.gamericefishpro.space.t.h0 h0Var = this.y;
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
                        if ((255 & j) < 128 && (xVar = ((z) objArr[(i << 3) + i3]).c) != null) {
                            xVar.m();
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
        f0Var.P();
        Unit unit = Unit.a;
        f0Var.K = false;
        h0Var.a();
        this.z.a();
        this.H = 0;
        this.G = 0;
        this.C.a();
        h();
    }

    @Override // com.gamericefishpro.space.t0.j
    public final void e() {
        i(true);
    }

    public final e1 f(Object obj) {
        return !this.d.H() ? new e0() : new f0(this, obj);
    }

    public final void g(int i) {
        boolean z;
        boolean z2 = false;
        this.G = 0;
        List listO = this.d.o();
        com.gamericefishpro.space.v0.b bVar = (com.gamericefishpro.space.v0.b) listO;
        int i2 = (bVar.d.i - this.H) - 1;
        if (i <= i2) {
            this.D.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.y.g((com.gamericefishpro.space.h2.f0) bVar.get(i3));
                    Intrinsics.b(objG);
                    ((com.gamericefishpro.space.t.e0) this.D.e).a(((z) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.i.c(this.D);
            com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
            Function1 function1E = gVarE != null ? gVarE.e() : null;
            com.gamericefishpro.space.f1.g gVarH = com.gamericefishpro.space.f1.v.h(gVarE);
            z = false;
            while (i2 >= i) {
                try {
                    com.gamericefishpro.space.h2.f0 f0Var = (com.gamericefishpro.space.h2.f0) ((com.gamericefishpro.space.v0.b) listO).get(i2);
                    Object objG2 = this.y.g(f0Var);
                    Intrinsics.b(objG2);
                    z zVar = (z) objG2;
                    Object obj = zVar.a;
                    if (((com.gamericefishpro.space.t.e0) this.D.e).c(obj)) {
                        this.G++;
                        if (((Boolean) zVar.g.getValue()).booleanValue()) {
                            com.gamericefishpro.space.h2.j0 j0Var = f0Var.a0;
                            com.gamericefishpro.space.h2.v0 v0Var = j0Var.p;
                            com.gamericefishpro.space.h2.d0 d0Var = com.gamericefishpro.space.h2.d0.i;
                            v0Var.E = d0Var;
                            com.gamericefishpro.space.h2.r0 r0Var = j0Var.q;
                            if (r0Var != null) {
                                r0Var.C = d0Var;
                            }
                            l(zVar, false);
                            if (zVar.h) {
                                z = true;
                            }
                        }
                    } else {
                        com.gamericefishpro.space.h2.f0 f0Var2 = this.d;
                        f0Var2.K = true;
                        this.y.k(f0Var);
                        com.gamericefishpro.space.t0.x xVar = zVar.c;
                        if (xVar != null) {
                            xVar.m();
                        }
                        this.d.Q(i2, 1);
                        Unit unit = Unit.a;
                        f0Var2.K = false;
                    }
                    this.z.k(obj);
                    i2--;
                } catch (Throwable th) {
                    com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                    throw th;
                }
            }
            Unit unit2 = Unit.a;
            com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
        } else {
            z = false;
        }
        if (z) {
            synchronized (com.gamericefishpro.space.f1.p.c) {
                com.gamericefishpro.space.t.i0 i0Var = com.gamericefishpro.space.f1.p.j.h;
                if (i0Var != null && i0Var.h()) {
                    z2 = true;
                }
            }
            if (z2) {
                com.gamericefishpro.space.f1.p.a();
            }
        }
        h();
    }

    public final void h() {
        int i = ((com.gamericefishpro.space.v0.b) this.d.o()).d.i;
        com.gamericefishpro.space.t.h0 h0Var = this.y;
        if (h0Var.e != i) {
            com.gamericefishpro.space.e2.a.a("Inconsistency between the count of nodes tracked by the state (" + h0Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.G) - this.H < 0) {
            StringBuilder sbK = com.gamericefishpro.space.m5.a.k(i, "Incorrect state. Total children ", ". Reusable children ");
            sbK.append(this.G);
            sbK.append(". Precomposed children ");
            sbK.append(this.H);
            com.gamericefishpro.space.e2.a.a(sbK.toString());
        }
        com.gamericefishpro.space.t.h0 h0Var2 = this.C;
        if (h0Var2.e == this.H) {
            return;
        }
        com.gamericefishpro.space.e2.a.a("Incorrect state. Precomposed children " + this.H + ". Map size " + h0Var2.e);
    }

    public final void i(boolean z) {
        this.H = 0;
        this.C.a();
        List listO = this.d.o();
        int i = ((com.gamericefishpro.space.v0.b) listO).d.i;
        if (this.G != i) {
            this.G = i;
            com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
            Function1 function1E = gVarE != null ? gVarE.e() : null;
            com.gamericefishpro.space.f1.g gVarH = com.gamericefishpro.space.f1.v.h(gVarE);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    com.gamericefishpro.space.h2.f0 f0Var = (com.gamericefishpro.space.h2.f0) ((com.gamericefishpro.space.v0.b) listO).get(i2);
                    z zVar = (z) this.y.g(f0Var);
                    if (zVar != null && ((Boolean) zVar.g.getValue()).booleanValue()) {
                        com.gamericefishpro.space.h2.j0 j0Var = f0Var.a0;
                        com.gamericefishpro.space.h2.v0 v0Var = j0Var.p;
                        com.gamericefishpro.space.h2.d0 d0Var = com.gamericefishpro.space.h2.d0.i;
                        v0Var.E = d0Var;
                        com.gamericefishpro.space.h2.r0 r0Var = j0Var.q;
                        if (r0Var != null) {
                            r0Var.C = d0Var;
                        }
                        l(zVar, z);
                        zVar.a = x.a;
                    }
                } catch (Throwable th) {
                    com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                    throw th;
                }
            }
            Unit unit = Unit.a;
            com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
            this.z.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        com.gamericefishpro.space.h2.f0 f0Var = this.d;
        f0Var.K = true;
        f0Var.L(i, i2, 1);
        Unit unit = Unit.a;
        f0Var.K = false;
    }

    public final void k(Object obj, Function2 function2, boolean z) {
        com.gamericefishpro.space.h2.f0 f0Var = this.d;
        if (f0Var.H()) {
            h();
            if (this.z.c(obj)) {
                return;
            }
            this.E.k(obj);
            com.gamericefishpro.space.t.h0 h0Var = this.C;
            Object objG = h0Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((com.gamericefishpro.space.v0.b) f0Var.o()).d.i(objG), ((com.gamericefishpro.space.v0.b) f0Var.o()).d.i);
                    this.H++;
                } else {
                    int i = ((com.gamericefishpro.space.v0.b) f0Var.o()).d.i;
                    com.gamericefishpro.space.h2.f0 f0Var2 = new com.gamericefishpro.space.h2.f0(2);
                    f0Var.K = true;
                    f0Var.B(i, f0Var2);
                    Unit unit = Unit.a;
                    f0Var.K = false;
                    this.H++;
                    objG = f0Var2;
                }
                h0Var.m(obj, objG);
            }
            m((com.gamericefishpro.space.h2.f0) objG, obj, z, function2);
        }
    }

    public final void l(z zVar, boolean z) {
        com.gamericefishpro.space.t0.x xVar;
        if (z || !zVar.h) {
            zVar.g = com.gamericefishpro.space.t0.i.v(Boolean.FALSE);
        } else {
            zVar.g.setValue(Boolean.FALSE);
        }
        if (zVar.f != null) {
            c(zVar);
            return;
        }
        if (z) {
            com.gamericefishpro.space.t0.x xVar2 = zVar.c;
            if (xVar2 != null) {
                xVar2.l();
                return;
            }
            return;
        }
        com.gamericefishpro.space.h2.m1 outOfFrameExecutor = ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.i0.a(this.d)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (zVar.h || (xVar = zVar.c) == null) {
                return;
            }
            xVar.l();
            return;
        }
        com.gamericefishpro.space.a2.b bVar = new com.gamericefishpro.space.a2.b(2, zVar);
        com.gamericefishpro.space.i2.t tVar = (com.gamericefishpro.space.i2.t) outOfFrameExecutor;
        com.gamericefishpro.space.ph.r rVar = tVar.A;
        boolean zIsEmpty = rVar.isEmpty();
        rVar.addLast(bVar);
        if (zIsEmpty) {
            Handler handler = tVar.getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(tVar.B);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010f, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x010c, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x011b, B:76:0x0125), top: B:79:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010f, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x010c, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x011b, B:76:0x0125), top: B:79:0x0076 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(com.gamericefishpro.space.h2.f0 f0Var, Object obj, boolean z, Function2 function2) {
        boolean z2;
        com.gamericefishpro.space.t0.x xVar;
        com.gamericefishpro.space.t.h0 h0Var = this.y;
        Object objG = h0Var.g(f0Var);
        Object obj2 = objG;
        if (objG == null) {
            com.gamericefishpro.space.b1.h hVar = g.a;
            z zVar = new z();
            zVar.a = obj;
            zVar.b = hVar;
            zVar.c = null;
            zVar.g = com.gamericefishpro.space.t0.i.v(Boolean.TRUE);
            h0Var.m(f0Var, zVar);
            obj2 = zVar;
        }
        z zVar2 = (z) obj2;
        int i = 0;
        boolean z3 = zVar2.b != function2;
        if (zVar2.f != null) {
            if (z3) {
                c(zVar2);
            } else if (z) {
                return;
            } else {
                b(zVar2, true);
            }
        }
        com.gamericefishpro.space.t0.x xVar2 = zVar2.c;
        if (xVar2 != null) {
            synchronized (xVar2.v) {
                z2 = xVar2.G.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || zVar2.d) {
            zVar2.b = function2;
            if (zVar2.f != null) {
                com.gamericefishpro.space.e2.a.a("new subcompose call while paused composition is still active");
            }
            com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
            Function1 function1E = gVarE != null ? gVarE.e() : null;
            com.gamericefishpro.space.f1.g gVarH = com.gamericefishpro.space.f1.v.h(gVarE);
            try {
                com.gamericefishpro.space.h2.f0 f0Var2 = this.d;
                f0Var2.K = true;
                com.gamericefishpro.space.t0.x xVar3 = zVar2.c;
                com.gamericefishpro.space.t0.u uVar = this.e;
                if (uVar == null) {
                    com.gamericefishpro.space.e2.a.c("parent composition reference not set");
                    throw new com.gamericefishpro.space.oh.e();
                }
                if (xVar3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = r2.a;
                        xVar = new com.gamericefishpro.space.t0.x(uVar, new d2(f0Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = r2.a;
                        xVar = new com.gamericefishpro.space.t0.x(uVar, new d2(f0Var));
                    }
                    xVar3 = xVar;
                } else {
                    if (xVar3.P == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams3 = r2.a;
                            xVar = new com.gamericefishpro.space.t0.x(uVar, new d2(f0Var));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = r2.a;
                            xVar = new com.gamericefishpro.space.t0.x(uVar, new d2(f0Var));
                        }
                        xVar3 = xVar;
                    }
                }
                zVar2.c = xVar3;
                Function2 hVar2 = zVar2.b;
                if (((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.i0.a(this.d)).getOutOfFrameExecutor() != null) {
                    zVar2.h = false;
                } else {
                    zVar2.h = true;
                    hVar2 = new com.gamericefishpro.space.b1.h(1524156494, new g0(i, zVar2, hVar2), true);
                }
                if (z) {
                    if (zVar2.e) {
                        xVar3.i();
                        xVar3.q();
                        zVar2.f = xVar3.k(true, hVar2);
                    } else {
                        zVar2.f = xVar3.k(xVar3.i(), hVar2);
                    }
                } else if (zVar2.e) {
                    xVar3.i();
                    xVar3.q();
                    com.gamericefishpro.space.t0.r rVar = xVar3.O;
                    rVar.z = 100;
                    rVar.y = true;
                    xVar3.Q = hVar2;
                    xVar3.d.a(xVar3, hVar2);
                    rVar.u();
                } else {
                    xVar3.B(hVar2);
                }
                zVar2.e = false;
                Unit unit = Unit.a;
                f0Var2.K = false;
                com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                zVar2.d = false;
            } catch (Throwable th) {
                com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                throw th;
            }
        }
    }

    public final com.gamericefishpro.space.h2.f0 n(Object obj) {
        com.gamericefishpro.space.t.h0 h0Var;
        int i;
        if (this.G == 0) {
            return null;
        }
        com.gamericefishpro.space.v0.b bVar = (com.gamericefishpro.space.v0.b) this.d.o();
        int i2 = bVar.d.i - this.H;
        int i3 = i2 - this.G;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            h0Var = this.y;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = h0Var.g((com.gamericefishpro.space.h2.f0) bVar.get(i5));
            Intrinsics.b(objG);
            if (Intrinsics.a(((z) objG).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objG2 = h0Var.g((com.gamericefishpro.space.h2.f0) bVar.get(i4));
                Intrinsics.b(objG2);
                z zVar = (z) objG2;
                Object obj2 = zVar.a;
                if (obj2 == x.a || this.i.e(obj, obj2)) {
                    zVar.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.G--;
        com.gamericefishpro.space.h2.f0 f0Var = (com.gamericefishpro.space.h2.f0) bVar.get(i3);
        Object objG3 = h0Var.g(f0Var);
        Intrinsics.b(objG3);
        z zVar2 = (z) objG3;
        zVar2.g = com.gamericefishpro.space.t0.i.v(Boolean.TRUE);
        zVar2.e = true;
        zVar2.d = true;
        return f0Var;
    }
}
