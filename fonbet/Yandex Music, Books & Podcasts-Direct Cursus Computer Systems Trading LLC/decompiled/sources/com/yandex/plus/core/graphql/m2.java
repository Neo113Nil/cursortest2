package com.yandex.plus.core.graphql;

import defpackage.fx6;
import defpackage.jqi;
import defpackage.k5r;
import defpackage.kwj;
import defpackage.q7g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.uj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m2 implements jqi {
    public final com.yandex.plus.core.graphql.type.t0 a;
    public final String b;
    public final q7g c;

    public m2(com.yandex.plus.core.graphql.type.t0 t0Var, String str, q7g q7gVar) {
        t0Var.getClass();
        str.getClass();
        this.a = t0Var;
        this.b = str;
        this.c = q7gVar;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.u1 u1Var = com.yandex.plus.core.graphql.adapter.u1.a;
        tj tjVar = uj.a;
        return new qhj(u1Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "798eed9f4fa6be945412a2141a870fc64525c7ba5af81ef7477e9569351ff962";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "mutation ReportPlaqueSeen($targetingInput: TargetingInput!, $plaqueId: String!, $context: String) { plaqueSeen(input: { plaqueId: $plaqueId context: $context targeting: $targetingInput } ) }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        r7fVar.Z("targetingInput");
        com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.A;
        tj tjVar = uj.a;
        r7fVar.j();
        aVar.a(r7fVar, fx6Var, this.a);
        r7fVar.p();
        r7fVar.Z("plaqueId");
        uj.a.a(r7fVar, fx6Var, this.b);
        q7g q7gVar = this.c;
        if (q7gVar instanceof kwj) {
            r7fVar.Z("context");
            uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return Intrinsics.d(this.a, m2Var.a) && Intrinsics.d(this.b, m2Var.b) && this.c.equals(m2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "ReportPlaqueSeen";
    }

    public final String toString() {
        return "ReportPlaqueSeenMutation(targetingInput=" + this.a + ", plaqueId=" + this.b + ", context=" + this.c + ')';
    }
}
