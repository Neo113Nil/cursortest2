package com.gamericefishpro.space.l4;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public final com.gamericefishpro.space.si.n0 a;

    public d0() {
        this.a = com.gamericefishpro.space.si.e0.b(v0.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void a(com.gamericefishpro.space.s5.d0 d0Var, com.gamericefishpro.space.vh.c cVar) {
        com.gamericefishpro.space.s5.k kVar;
        if (cVar instanceof com.gamericefishpro.space.s5.k) {
            kVar = (com.gamericefishpro.space.s5.k) cVar;
            int i = kVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.i = i - Integer.MIN_VALUE;
            } else {
                kVar = new com.gamericefishpro.space.s5.k(this, cVar);
            }
        } else {
            kVar = new com.gamericefishpro.space.s5.k(this, cVar);
        }
        Object obj = kVar.d;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = kVar.i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            throw new com.gamericefishpro.space.oh.e();
        }
        com.gamericefishpro.space.wa.b.P(obj);
        kVar.i = 1;
        this.a.a(d0Var, kVar);
    }

    public u0 b() {
        return (u0) this.a.getValue();
    }

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
    public void c(Set tableIds) {
        com.gamericefishpro.space.si.n0 n0Var;
        Object value;
        int[] iArr;
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        do {
            n0Var = this.a;
            value = n0Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = tableIds.contains(Integer.valueOf(i)) ? iArr2[i] + 1 : iArr2[i];
            }
            com.gamericefishpro.space.d6.a aVar = com.gamericefishpro.space.ti.c.b;
            if (value == null) {
                value = aVar;
            }
        } while (!n0Var.j(value, iArr));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
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
    public void d(u0 newState) {
        com.gamericefishpro.space.si.n0 n0Var;
        Object value;
        Object obj;
        Intrinsics.checkNotNullParameter(newState, "newState");
        do {
            n0Var = this.a;
            value = n0Var.getValue();
            u0 u0Var = (u0) value;
            if (u0Var instanceof p0 ? true : Intrinsics.a(u0Var, v0.b)) {
                obj = u0Var;
                obj = newState;
            } else if (u0Var instanceof d) {
                if (newState.a > u0Var.a) {
                    obj = u0Var;
                    obj = newState;
                }
            } else if (!(u0Var instanceof n0)) {
                obj = u0Var;
                throw new com.gamericefishpro.space.oh.k();
            }
            obj = u0Var;
            obj = u0Var;
            com.gamericefishpro.space.d6.a aVar = com.gamericefishpro.space.ti.c.b;
            if (value == null) {
                value = aVar;
            }
            if (obj == null) {
                obj = aVar;
            }
        } while (!n0Var.j(value, obj));
    }

    public d0(int i) {
        this.a = com.gamericefishpro.space.si.e0.b(new int[i]);
    }
}
