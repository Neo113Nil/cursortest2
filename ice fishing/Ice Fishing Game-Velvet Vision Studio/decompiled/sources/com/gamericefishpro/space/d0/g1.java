package com.gamericefishpro.space.d0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {
    public static final h0 a = new h0(f0.e, 1.0f);
    public static final h0 b = new h0(f0.d, 1.0f);
    public static final h0 c;
    public static final o1 d;
    public static final o1 e;

    static {
        f0 f0Var = f0.i;
        c = new h0(f0Var, 1.0f);
        com.gamericefishpro.space.h1.e eVar = com.gamericefishpro.space.h1.b.w;
        int i = 0;
        d = new o1(f0Var, new n1(i, eVar), eVar);
        com.gamericefishpro.space.h1.e eVar2 = com.gamericefishpro.space.h1.b.d;
        e = new o1(f0Var, new n1(i, eVar2), eVar2);
    }

    public static com.gamericefishpro.space.h1.m a(com.gamericefishpro.space.h1.m mVar) {
        return mVar.c(b);
    }

    public static final com.gamericefishpro.space.h1.m b(com.gamericefishpro.space.h1.m mVar, float f) {
        return mVar.c(f == 1.0f ? a : new h0(f0.e, f));
    }

    public static final com.gamericefishpro.space.h1.m d(com.gamericefishpro.space.h1.m mVar, float f) {
        return mVar.c(new f1(0.0f, f, 0.0f, f, 5));
    }

    public static final com.gamericefishpro.space.h1.m e(com.gamericefishpro.space.h1.m mVar, float f, float f2) {
        return mVar.c(new f1(f, f2, f, f2, false));
    }

    public static final com.gamericefishpro.space.h1.m f(com.gamericefishpro.space.h1.m mVar, float f) {
        return mVar.c(new f1(f, f, f, f, true));
    }

    public static final com.gamericefishpro.space.h1.m g(com.gamericefishpro.space.h1.m mVar, float f) {
        return mVar.c(new f1(f, 0.0f, f, 0.0f, 10));
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
    public static com.gamericefishpro.space.h1.m h(com.gamericefishpro.space.h1.m mVar) {
        o1 o1Var;
        com.gamericefishpro.space.h1.e eVar = com.gamericefishpro.space.h1.b.w;
        if (eVar.equals(eVar)) {
            o1Var = d;
        } else {
            o1Var = eVar.equals(com.gamericefishpro.space.h1.b.d) ? e : new o1(f0.i, new n1(0, eVar), eVar);
        }
        return mVar.c(o1Var);
    }
}
