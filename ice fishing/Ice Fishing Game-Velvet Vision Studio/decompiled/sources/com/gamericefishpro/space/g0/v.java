package com.gamericefishpro.space.g0;

import com.gamericefishpro.space.d0.n1;
import com.gamericefishpro.space.ei.e0;
import com.gamericefishpro.space.h0.j0;
import com.gamericefishpro.space.h0.l0;
import com.gamericefishpro.space.h0.m0;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.t0.f1;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.y.r0;
import com.gamericefishpro.space.z.k1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements k1 {
    public static final com.gamericefishpro.space.u6.c w;
    public final com.gamericefishpro.space.f0.a a;
    public boolean b;
    public l c;
    public final com.gamericefishpro.space.f0.s d;
    public final f1 e;
    public final com.gamericefishpro.space.b0.i f;
    public float g;
    public final com.gamericefishpro.space.c8.h h;
    public final boolean i;
    public f0 j;
    public final com.gamericefishpro.space.f0.u k;
    public final com.gamericefishpro.space.h0.f l;
    public final com.gamericefishpro.space.h0.w m;
    public final com.gamericefishpro.space.h0.l n;
    public final m0 o;
    public final com.gamericefishpro.space.vb.c p;
    public final j0 q;
    public final v0 r;
    public final v0 s;
    public final f1 t;
    public final f1 u;
    public final com.gamericefishpro.space.u6.s v;

    static {
        com.gamericefishpro.space.d0.b bVar = new com.gamericefishpro.space.d0.b(5);
        com.gamericefishpro.space.f5.q qVar = new com.gamericefishpro.space.f5.q(6);
        n1 n1Var = new n1(1, bVar);
        e0.c(1, qVar);
        w = new com.gamericefishpro.space.u6.c(n1Var, qVar);
    }

    public v(int i, int i2) {
        com.gamericefishpro.space.f0.a aVar = new com.gamericefishpro.space.f0.a();
        aVar.a = -1;
        aVar.e = new com.gamericefishpro.space.v0.e(new l0[16]);
        aVar.c = -1;
        this.a = aVar;
        this.d = new com.gamericefishpro.space.f0.s(i, i2, 1);
        this.e = new f1(w.a, com.gamericefishpro.space.t0.f.v);
        this.f = new com.gamericefishpro.space.b0.i();
        this.h = new com.gamericefishpro.space.c8.h(new com.gamericefishpro.space.a7.c(8, this));
        this.i = true;
        this.k = new com.gamericefishpro.space.f0.u(this, 1);
        this.l = new com.gamericefishpro.space.h0.f();
        this.m = new com.gamericefishpro.space.h0.w();
        this.n = new com.gamericefishpro.space.h0.l(0);
        this.o = new m0(new com.gamericefishpro.space.f1.s(i, 1, this));
        this.p = new com.gamericefishpro.space.vb.c(17, this);
        this.q = new j0();
        this.r = com.gamericefishpro.space.h0.n.h();
        this.s = com.gamericefishpro.space.h0.n.h();
        Boolean bool = Boolean.FALSE;
        this.t = com.gamericefishpro.space.t0.i.v(bool);
        this.u = com.gamericefishpro.space.t0.i.v(bool);
        this.v = new com.gamericefishpro.space.u6.s(3);
    }

    @Override // com.gamericefishpro.space.z.k1
    public final boolean a() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // com.gamericefishpro.space.z.k1
    public final boolean b() {
        return this.h.b();
    }

    @Override // com.gamericefishpro.space.z.k1
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r5.h.d(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // com.gamericefishpro.space.z.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(r0 r0Var, Function2 function2, com.gamericefishpro.space.vh.c cVar) {
        u uVar;
        Function2 function3;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i = uVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.w = i - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.i;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i2 = uVar.w;
        if (i2 != 0) {
            if (i2 == 1) {
                Function2 function4 = (Function2) uVar.e;
                r0Var = uVar.d;
                com.gamericefishpro.space.wa.b.P(obj);
                function3 = function4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        if (this.e.getValue() == w.a) {
            uVar.d = r0Var;
            uVar.e = (com.gamericefishpro.space.vh.i) function2;
            uVar.w = 1;
            if (this.l.f(uVar) != obj2) {
            }
        }
        function3 = function2;
        function3 = function2;
        return obj2;
        function3 = function2;
        function3 = function2;
        function3 = function2;
        uVar.d = null;
        uVar.e = null;
        uVar.w = 2;
    }

    @Override // com.gamericefishpro.space.z.k1
    public final float e(float f) {
        return this.h.e(f);
    }

    public final void f(l lVar, boolean z, boolean z2) {
        m mVar;
        m mVar2;
        List list = lVar.m;
        int i = lVar.p;
        int i2 = lVar.b;
        n nVar = lVar.a;
        this.o.e = list.size();
        if (!z && this.b) {
            this.c = lVar;
            return;
        }
        if (z) {
            this.b = true;
        }
        this.g -= lVar.d;
        this.e.setValue(lVar);
        this.u.setValue(Boolean.valueOf(((nVar != null ? nVar.a : 0) == 0 && i2 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(lVar.c));
        com.gamericefishpro.space.f0.s sVar = this.d;
        if (z2) {
            sVar.getClass();
            if (!(((float) i2) >= 0.0f)) {
                com.gamericefishpro.space.c0.a.c("scrollOffset should be non-negative");
            }
            sVar.c.h(i2);
        } else {
            sVar.getClass();
            sVar.e = (nVar == null || (mVar2 = (m) com.gamericefishpro.space.ph.v.q(nVar.b)) == null) ? null : mVar2.b;
            if (sVar.d || i > 0) {
                sVar.d = true;
                if (!(((float) i2) >= 0.0f)) {
                    com.gamericefishpro.space.c0.a.c("scrollOffset should be non-negative (" + i2 + ')');
                }
                sVar.a((nVar == null || (mVar = (m) com.gamericefishpro.space.ph.v.q(nVar.b)) == null) ? 0 : mVar.a, i2);
            }
            if (this.i) {
                com.gamericefishpro.space.f0.a aVar = this.a;
                com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) aVar.e;
                int i3 = aVar.a;
                boolean z3 = aVar.b;
                if (i3 != -1 && !list.isEmpty() && i3 != com.gamericefishpro.space.f0.a.c(lVar, z3)) {
                    aVar.a = -1;
                    Object[] objArr = eVar.d;
                    int i4 = eVar.i;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((l0) objArr[i5]).cancel();
                    }
                    eVar.g();
                }
                int i6 = aVar.c;
                if (i6 != -1 && aVar.d != 0.0f && i6 != i && !list.isEmpty()) {
                    int iC = com.gamericefishpro.space.f0.a.c(lVar, aVar.d < 0.0f);
                    int iA = com.gamericefishpro.space.f0.a.a(lVar, aVar.d < 0.0f);
                    if (iA >= 0 && iA < i && iC != aVar.a && iC >= 0) {
                        aVar.a = iC;
                        eVar.g();
                        eVar.d(eVar.i, this.p.r(iC));
                    }
                }
                aVar.c = i;
            }
        }
        if (z) {
            this.v.o(lVar.f, lVar.i, lVar.h);
        }
    }

    public final l g() {
        return (l) this.e.getValue();
    }

    public final void h(float f, l lVar) {
        if (this.i) {
            com.gamericefishpro.space.f0.a aVar = this.a;
            com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) aVar.e;
            if (!lVar.m.isEmpty()) {
                int i = 0;
                boolean z = f < 0.0f;
                int iC = com.gamericefishpro.space.f0.a.c(lVar, z);
                int iA = com.gamericefishpro.space.f0.a.a(lVar, z);
                if (iA >= 0) {
                    com.gamericefishpro.space.z.v0 v0Var = lVar.q;
                    List list = lVar.m;
                    if (iA < lVar.p) {
                        if (iC != aVar.a && iC >= 0) {
                            if (aVar.b != z) {
                                Object[] objArr = eVar.d;
                                int i2 = eVar.i;
                                for (int i3 = 0; i3 < i2; i3++) {
                                    ((l0) objArr[i3]).cancel();
                                }
                            }
                            aVar.b = z;
                            aVar.a = iC;
                            eVar.g();
                            eVar.d(eVar.i, this.p.r(iC));
                        }
                        if (z) {
                            m mVar = (m) CollectionsKt.B(list);
                            if (((com.gamericefishpro.space.a.a.z(mVar, v0Var) + ((int) (v0Var == com.gamericefishpro.space.z.v0.d ? mVar.n & 4294967295L : mVar.n >> 32))) + lVar.s) - lVar.o < (-f)) {
                                Object[] objArr2 = eVar.d;
                                int i4 = eVar.i;
                                while (i < i4) {
                                    ((l0) objArr2[i]).a();
                                    i++;
                                }
                            }
                        } else if (lVar.n - com.gamericefishpro.space.a.a.z((m) CollectionsKt.w(list), v0Var) < f) {
                            Object[] objArr3 = eVar.d;
                            int i5 = eVar.i;
                            while (i < i5) {
                                ((l0) objArr3[i]).a();
                                i++;
                            }
                        }
                    }
                }
            }
            aVar.d = f;
        }
    }
}
