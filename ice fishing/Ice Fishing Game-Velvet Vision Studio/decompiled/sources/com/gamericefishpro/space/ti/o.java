package com.gamericefishpro.space.ti;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ com.gamericefishpro.space.vh.i A;
    public final /* synthetic */ com.gamericefishpro.space.si.f B;
    public com.gamericefishpro.space.ri.i d;
    public byte[] e;
    public int i;
    public int v;
    public int w;
    public /* synthetic */ Object y;
    public final /* synthetic */ com.gamericefishpro.space.si.e[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(com.gamericefishpro.space.di.c cVar, com.gamericefishpro.space.si.f fVar, com.gamericefishpro.space.th.a aVar, com.gamericefishpro.space.si.e[] eVarArr) {
        super(2, aVar);
        this.z = eVarArr;
        this.A = (com.gamericefishpro.space.vh.i) cVar;
        this.B = fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.gamericefishpro.space.di.c, com.gamericefishpro.space.vh.i] */
    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        o oVar = new o(this.A, this.B, aVar, this.z);
        oVar.y = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd A[DONT_INVERT, EDGE_INSN: B:33:0x00bd->B:19:0x007e BREAK  A[LOOP:0: B:26:0x009e->B:39:?]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:26:0x009e->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.gamericefishpro.space.di.c, com.gamericefishpro.space.vh.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d3 -> B:19:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.ti.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
