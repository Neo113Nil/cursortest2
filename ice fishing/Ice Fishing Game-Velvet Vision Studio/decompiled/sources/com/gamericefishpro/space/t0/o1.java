package com.gamericefishpro.space.t0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {
    public final r0 a;

    public o1(Function0 function0) {
        this.a = new r0(function0);
    }

    public abstract com.gamericefishpro.space.n.p a(Object obj);

    public v2 b() {
        return this.a;
    }

    public final v2 c(com.gamericefishpro.space.n.p pVar, v2 v2Var) {
        h0 h0Var;
        v2 v2Var2 = null;
        v2Var2 = null;
        v2Var2 = null;
        v2Var2 = null;
        v2Var2 = null;
        v2Var2 = null;
        if (v2Var instanceof h0) {
            if (pVar.b) {
                h0Var = (h0) v2Var;
                h0Var.a.setValue(pVar.b());
            }
        } else if (v2Var instanceof u2) {
            if ((pVar.a || pVar.f != null) && !pVar.b) {
                u2 u2Var = (u2) v2Var;
                if (Intrinsics.a(pVar.b(), u2Var.a)) {
                    v2Var2 = u2Var;
                }
            }
        } else if (v2Var instanceof b0) {
            pVar.getClass();
        }
        if (v2Var2 != null) {
            v2Var2 = h0Var;
            return v2Var2;
        }
        if (!pVar.b) {
            v2Var2 = h0Var;
            return new u2(pVar.b());
        }
        Object obj = pVar.f;
        m2 m2Var = (m2) pVar.e;
        if (m2Var == null) {
            v2Var2 = h0Var;
            m2Var = f.z;
        }
        v2Var2 = h0Var;
        return new h0(new f1(obj, m2Var));
    }
}
