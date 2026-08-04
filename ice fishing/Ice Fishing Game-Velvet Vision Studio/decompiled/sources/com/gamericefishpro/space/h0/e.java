package com.gamericefishpro.space.h0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.gamericefishpro.space.h1.l {
    public com.gamericefishpro.space.p2.d H;
    public final /* synthetic */ f I;

    public e(f fVar) {
        this.I = fVar;
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
    public final void A0() {
        com.gamericefishpro.space.d0.q0 q0Var = new com.gamericefishpro.space.d0.q0(14, this, this.I);
        com.gamericefishpro.space.h2.f0 f0VarS = com.gamericefishpro.space.h2.k.s(this);
        int i = f0VarS.e;
        com.gamericefishpro.space.p2.b rectManager = ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.i0.a(f0VarS)).getRectManager();
        com.gamericefishpro.space.p2.e eVar = rectManager.b;
        eVar.getClass();
        com.gamericefishpro.space.t.w wVar = eVar.a;
        com.gamericefishpro.space.p2.d dVar = new com.gamericefishpro.space.p2.d(eVar, i, this, q0Var);
        Object objB = wVar.b(i);
        if (objB == null) {
            wVar.h(i, dVar);
            objB = dVar;
        }
        com.gamericefishpro.space.p2.d dVar2 = (com.gamericefishpro.space.p2.d) objB;
        if (dVar2 != dVar) {
            while (true) {
                com.gamericefishpro.space.p2.d dVar3 = dVar2.d;
                if (dVar3 == null) {
                    break;
                } else {
                    dVar2 = dVar3;
                }
            }
            dVar2.d = dVar;
        }
        if (com.gamericefishpro.space.h2.k.s(this.d).A) {
            rectManager.a.k(i, true);
        }
        rectManager.d = true;
        rectManager.i();
        this.H = dVar;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        f fVar = this.I;
        fVar.a = this;
        if (fVar.b != null) {
            A0();
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        f fVar = this.I;
        if (fVar.a == this) {
            fVar.a = null;
        }
        com.gamericefishpro.space.p2.d dVar = this.H;
        if (dVar != null) {
            dVar.b();
        }
        this.H = null;
    }
}
