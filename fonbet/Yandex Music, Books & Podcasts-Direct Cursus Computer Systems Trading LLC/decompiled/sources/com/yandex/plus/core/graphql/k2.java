package com.yandex.plus.core.graphql;

import defpackage.dfi;
import defpackage.fx6;
import defpackage.jqi;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.uj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k2 implements jqi {
    public final com.yandex.plus.core.graphql.type.t0 a;
    public final String b;

    public k2(com.yandex.plus.core.graphql.type.t0 t0Var, String str) {
        t0Var.getClass();
        str.getClass();
        this.a = t0Var;
        this.b = str;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.t1 t1Var = com.yandex.plus.core.graphql.adapter.t1.a;
        tj tjVar = uj.a;
        return new qhj(t1Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "14b60662631c6f79da1dba75dc7075c4e63bbe82bad841c4db22f7d2347a61fc";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "mutation ReportPlaqueClicked($targetingInput: TargetingInput!, $plaqueId: String!) { plaqueClicked(input: { plaqueId: $plaqueId targeting: $targetingInput } ) }";
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return Intrinsics.d(this.a, k2Var.a) && Intrinsics.d(this.b, k2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "ReportPlaqueClicked";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportPlaqueClickedMutation(targetingInput=");
        sb.append(this.a);
        sb.append(", plaqueId=");
        return dfi.i(sb, this.b, ')');
    }
}
