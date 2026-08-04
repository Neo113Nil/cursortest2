package com.gamericefishpro.space.v;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.ei.l implements com.gamericefishpro.space.di.c {
    public final /* synthetic */ com.gamericefishpro.space.f1.u d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ q i;
    public final /* synthetic */ com.gamericefishpro.space.b1.h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.gamericefishpro.space.f1.u uVar, Object obj, q qVar, com.gamericefishpro.space.b1.h hVar) {
        super(3);
        this.d = uVar;
        this.e = obj;
        this.i = qVar;
        this.v = hVar;
    }

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
    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        u uVar = (u) obj;
        com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? rVar.f(uVar) : rVar.h(uVar) ? 4 : 2;
        }
        if (rVar.S(iIntValue & 1, (iIntValue & 19) != 18)) {
            com.gamericefishpro.space.f1.u uVar2 = this.d;
            boolean zF = rVar.f(uVar2);
            Object obj4 = this.e;
            boolean zH = zF | rVar.h(obj4);
            q qVar = this.i;
            boolean zH2 = zH | rVar.h(qVar);
            Object objP = rVar.P();
            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
            if (zH2 || objP == fVar) {
                objP = new com.gamericefishpro.space.f3.f(uVar2, obj4, qVar, 3);
                rVar.k0(objP);
            }
            com.gamericefishpro.space.t0.i.d(uVar, (Function1) objP, rVar);
            com.gamericefishpro.space.t.h0 h0Var = qVar.d;
            Intrinsics.c(uVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            h0Var.m(obj4, ((v) uVar).a);
            Object objP2 = rVar.P();
            if (objP2 == fVar) {
                objP2 = new k();
                rVar.k0(objP2);
            }
            this.v.c((k) objP2, obj4, rVar, 0);
        } else {
            rVar.V();
        }
        return Unit.a;
    }
}
