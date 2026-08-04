package com.gamericefishpro.space.f0;

import com.gamericefishpro.space.d0.n1;
import com.gamericefishpro.space.ei.e0;
import com.gamericefishpro.space.h0.j0;
import com.gamericefishpro.space.h0.l0;
import com.gamericefishpro.space.h0.m0;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.pi.s1;
import com.gamericefishpro.space.t0.f1;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.y.r0;
import com.gamericefishpro.space.z.k1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements k1 {
    public static final com.gamericefishpro.space.u6.c x;
    public final a a;
    public boolean b;
    public q c;
    public boolean d;
    public final s e;
    public final f1 f;
    public final com.gamericefishpro.space.b0.i g;
    public float h;
    public final com.gamericefishpro.space.c8.h i;
    public final boolean j;
    public f0 k;
    public final u l;
    public final com.gamericefishpro.space.h0.f m;
    public final com.gamericefishpro.space.h0.w n;
    public final com.gamericefishpro.space.h0.l o;
    public final m0 p;
    public final com.gamericefishpro.space.vb.c q;
    public final j0 r;
    public final v0 s;
    public final f1 t;
    public final f1 u;
    public final v0 v;
    public final com.gamericefishpro.space.u6.s w;

    static {
        com.gamericefishpro.space.d0.b bVar = new com.gamericefishpro.space.d0.b(3);
        com.gamericefishpro.space.d0.p pVar = new com.gamericefishpro.space.d0.p(22);
        n1 n1Var = new n1(1, bVar);
        e0.c(1, pVar);
        x = new com.gamericefishpro.space.u6.c(n1Var, pVar);
    }

    public w(int i, int i2) {
        a aVar = new a();
        aVar.a = -1;
        aVar.c = -1;
        this.a = aVar;
        this.e = new s(i, i2, 0);
        this.f = new f1(y.a, com.gamericefishpro.space.t0.f.v);
        this.g = new com.gamericefishpro.space.b0.i();
        this.i = new com.gamericefishpro.space.c8.h(new com.gamericefishpro.space.a7.c(4, this));
        this.j = true;
        this.l = new u(this, 0);
        this.m = new com.gamericefishpro.space.h0.f();
        this.n = new com.gamericefishpro.space.h0.w();
        this.o = new com.gamericefishpro.space.h0.l(0);
        this.p = new m0(new t(this, i));
        this.q = new com.gamericefishpro.space.vb.c(12, this);
        this.r = new j0();
        this.s = com.gamericefishpro.space.h0.n.h();
        Boolean bool = Boolean.FALSE;
        this.t = com.gamericefishpro.space.t0.i.v(bool);
        this.u = com.gamericefishpro.space.t0.i.v(bool);
        this.v = com.gamericefishpro.space.h0.n.h();
        this.w = new com.gamericefishpro.space.u6.s(3);
    }

    @Override // com.gamericefishpro.space.z.k1
    public final boolean a() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // com.gamericefishpro.space.z.k1
    public final boolean b() {
        return this.i.b();
    }

    @Override // com.gamericefishpro.space.z.k1
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r5.i.d(r6, r7, r0) == r1) goto L23;
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
        v vVar;
        Function2 function3;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i = vVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.w = i - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object obj = vVar.i;
        Object obj2 = com.gamericefishpro.space.uh.a.d;
        int i2 = vVar.w;
        if (i2 != 0) {
            if (i2 == 1) {
                Function2 function4 = (Function2) vVar.e;
                r0Var = vVar.d;
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
        if (this.f.getValue() == y.a) {
            vVar.d = r0Var;
            vVar.e = (com.gamericefishpro.space.vh.i) function2;
            vVar.w = 1;
            if (this.m.f(vVar) != obj2) {
            }
        }
        function3 = function2;
        function3 = function2;
        return obj2;
        function3 = function2;
        function3 = function2;
        function3 = function2;
        vVar.d = null;
        vVar.e = null;
        vVar.w = 2;
    }

    @Override // com.gamericefishpro.space.z.k1
    public final float e(float f) {
        return this.i.e(f);
    }

    public final void f(q qVar, boolean z, boolean z2) {
        List list = qVar.k;
        int i = qVar.n;
        int i2 = qVar.b;
        r rVar = qVar.a;
        this.p.e = list.size();
        com.gamericefishpro.space.u6.s sVar = this.w;
        s sVar2 = this.e;
        if (!z && this.b) {
            this.c = qVar;
            com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
            Function1 function1E = gVarE != null ? gVarE.e() : null;
            com.gamericefishpro.space.f1.g gVarH = com.gamericefishpro.space.f1.v.h(gVarE);
            try {
                if (((Number) ((com.gamericefishpro.space.w.j) sVar.i).e.getValue()).floatValue() != 0.0f && rVar != null && rVar.a == sVar2.b.g() && i2 == sVar2.c.g()) {
                    s1 s1Var = (s1) sVar.e;
                    if (s1Var != null) {
                        s1Var.c(null);
                    }
                    sVar.i = new com.gamericefishpro.space.w.j(com.gamericefishpro.space.w.c.j, Float.valueOf(0.0f), null, 60);
                }
                Unit unit = Unit.a;
                return;
            } finally {
                com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
            }
        }
        if (z) {
            this.b = true;
        }
        this.u.setValue(Boolean.valueOf(((rVar != null ? rVar.a : 0) == 0 && i2 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(qVar.c));
        this.h -= qVar.d;
        this.f.setValue(qVar);
        if (z2) {
            sVar2.getClass();
            if (!(((float) i2) >= 0.0f)) {
                com.gamericefishpro.space.c0.a.c("scrollOffset should be non-negative");
            }
            sVar2.c.h(i2);
        } else {
            r rVar2 = (r) CollectionsKt.firstOrNull(list);
            r rVar3 = (r) CollectionsKt.C(list);
            com.gamericefishpro.space.i.a.S("firstVisibleItem:index", rVar2 != null ? rVar2.a : -1L);
            com.gamericefishpro.space.i.a.S("lastVisibleItem:index", rVar3 != null ? rVar3.a : -1L);
            sVar2.getClass();
            sVar2.e = rVar != null ? rVar.g : null;
            if (sVar2.d || i > 0) {
                sVar2.d = true;
                if (!(((float) i2) >= 0.0f)) {
                    com.gamericefishpro.space.c0.a.c("scrollOffset should be non-negative");
                }
                sVar2.a(rVar != null ? rVar.a : 0, i2);
            }
            if (this.j) {
                a aVar = this.a;
                int i3 = aVar.a;
                boolean z3 = aVar.b;
                if (i3 != -1 && !list.isEmpty() && i3 != a.b(qVar, z3)) {
                    aVar.a = -1;
                    l0 l0Var = (l0) aVar.e;
                    if (l0Var != null) {
                        l0Var.cancel();
                    }
                    aVar.e = null;
                }
                int i4 = aVar.c;
                if (i4 != -1 && aVar.d != 0.0f && i4 != i && !list.isEmpty()) {
                    int iB = a.b(qVar, aVar.d < 0.0f);
                    if (iB >= 0 && iB < i) {
                        aVar.a = iB;
                        aVar.e = com.gamericefishpro.space.vb.c.s(this.q, iB);
                    }
                }
                aVar.c = i;
            }
        }
        if (z) {
            sVar.o(qVar.f, qVar.i, qVar.h);
        }
    }

    public final q g() {
        return (q) this.f.getValue();
    }

    public final void h(float f, q qVar) {
        l0 l0Var;
        l0 l0Var2;
        if (this.j) {
            List list = qVar.k;
            List list2 = qVar.k;
            boolean zIsEmpty = list.isEmpty();
            a aVar = this.a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iB = a.b(qVar, z);
                if (iB >= 0 && iB < qVar.n) {
                    if (iB != aVar.a) {
                        if (aVar.b != z) {
                            aVar.a = -1;
                            l0 l0Var3 = (l0) aVar.e;
                            if (l0Var3 != null) {
                                l0Var3.cancel();
                            }
                            aVar.e = null;
                        }
                        aVar.b = z;
                        aVar.a = iB;
                        aVar.e = com.gamericefishpro.space.vb.c.s(this.q, iB);
                    }
                    if (z) {
                        r rVar = (r) CollectionsKt.B(list2);
                        if (((rVar.j + rVar.k) + qVar.q) - qVar.m < (-f) && (l0Var2 = (l0) aVar.e) != null) {
                            l0Var2.a();
                        }
                    } else if (qVar.l - ((r) CollectionsKt.w(list2)).j < f && (l0Var = (l0) aVar.e) != null) {
                        l0Var.a();
                    }
                }
            }
            aVar.d = f;
        }
    }
}
