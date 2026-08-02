package com.yandex.plus.core.graphql;

import defpackage.fx6;
import defpackage.j8g;
import defpackage.jwj;
import defpackage.kwj;
import defpackage.pj;
import defpackage.q7g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.s6n;
import defpackage.tj;
import defpackage.uj;
import defpackage.vgj;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class u0 implements s6n {
    public final q7g a;
    public final q7g b;

    public u0(q7g q7gVar, q7g q7gVar2) {
        this.a = q7gVar;
        this.b = q7gVar2;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.m0 m0Var = com.yandex.plus.core.graphql.adapter.m0.a;
        tj tjVar = uj.a;
        return new qhj(m0Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "c847d08ad236977abf01218f14d5e3c2e529bfbde67462cbb005f3c12c1bd250";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query Experiments($locationInput: LocationInput, $params: Map_String_ObjectScalar, $testIds: [Long!]) { experiments(location: $locationInput, params: $params, testIds: $testIds) { testIds triggeredTestIds triggeredExperimentSet { flags testId } } }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        r7fVar.getClass();
        fx6Var.getClass();
        q7g q7gVar = this.a;
        if (q7gVar instanceof kwj) {
            r7fVar.Z("params");
            pj e = fx6Var.e(com.yandex.plus.core.graphql.type.z.b);
            tj tjVar = uj.a;
            if (e instanceof vgj) {
                xq0.q("The adapter is already nullable");
                return;
            }
            Object obj = ((kwj) q7gVar).f;
            if (obj == null) {
                r7fVar.B0();
            } else {
                e.a(r7fVar, fx6Var, obj);
            }
        }
        q7g q7gVar2 = this.b;
        if (q7gVar2 instanceof kwj) {
            r7fVar.Z("testIds");
            pj e2 = fx6Var.e(com.yandex.plus.core.graphql.type.z.a);
            tj tjVar2 = uj.a;
            j8g j8gVar = new j8g(e2, 0);
            Object obj2 = ((kwj) q7gVar2).f;
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                j8gVar.a(r7fVar, fx6Var, obj2);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        Object obj2 = jwj.f;
        return obj2.equals(obj2) && this.a.equals(u0Var.a) && this.b.equals(u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + com.appsflyer.internal.k.a(this.a, jwj.f.hashCode() * 31, 31);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "Experiments";
    }

    public final String toString() {
        return "ExperimentsQuery(locationInput=" + jwj.f + ", params=" + this.a + ", testIds=" + this.b + ')';
    }
}
