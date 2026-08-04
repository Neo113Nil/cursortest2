package com.gamericefishpro.space.w;

import com.gamericefishpro.space.t0.s2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements s2 {
    public final i1 d;
    public Function1 e;
    public com.gamericefishpro.space.ei.l i;
    public final /* synthetic */ f1 v;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(f1 f1Var, i1 i1Var, Function1 function1, Function1 function2) {
        this.v = f1Var;
        this.d = i1Var;
        this.e = function1;
        this.i = (com.gamericefishpro.space.ei.l) function2;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function1] */
    public final void b(g1 g1Var) {
        i1 i1Var = this.d;
        com.gamericefishpro.space.t0.f1 f1Var = i1Var.z;
        com.gamericefishpro.space.t0.f1 f1Var2 = i1Var.e;
        com.gamericefishpro.space.t0.b1 b1Var = i1Var.A;
        Object objInvoke = this.i.invoke(g1Var.c());
        if (this.v.c.g()) {
            i1Var.f(this.i.invoke(g1Var.a()), objInvoke, (u) this.e.invoke(g1Var));
            return;
        }
        u uVar = (u) this.e.invoke(g1Var);
        if (i1Var.B) {
            c1 c1Var = i1Var.y;
            if (Intrinsics.a(objInvoke, c1Var != null ? c1Var.c : null)) {
                return;
            }
        }
        if (Intrinsics.a(f1Var2.getValue(), objInvoke) && b1Var.g() == -1.0f) {
            return;
        }
        f1Var2.setValue(objInvoke);
        i1Var.i.setValue(uVar);
        i1Var.e(b1Var.g() == -3.0f ? objInvoke : i1Var.C.getValue(), !((Boolean) f1Var.getValue()).booleanValue());
        f1Var.setValue(Boolean.valueOf(b1Var.g() == -3.0f));
        if (b1Var.g() >= 0.0f) {
            i1Var.d(i1Var.b().b((long) (b1Var.g() * i1Var.b().c())));
        } else if (b1Var.g() == -3.0f) {
            i1Var.d(objInvoke);
        }
        i1Var.B = false;
        b1Var.h(-1.0f);
    }

    @Override // com.gamericefishpro.space.t0.s2
    public final Object getValue() {
        b(this.v.c.f());
        return this.d.C.getValue();
    }
}
