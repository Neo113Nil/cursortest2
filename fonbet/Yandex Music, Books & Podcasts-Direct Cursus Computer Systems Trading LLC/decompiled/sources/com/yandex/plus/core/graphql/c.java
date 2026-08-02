package com.yandex.plus.core.graphql;

import defpackage.fx6;
import defpackage.jqi;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.uj;

/* loaded from: classes4.dex */
public final class c implements jqi {
    public final com.yandex.plus.core.graphql.type.c1 a;

    public c(com.yandex.plus.core.graphql.type.c1 c1Var) {
        this.a = c1Var;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.b bVar = com.yandex.plus.core.graphql.adapter.b.a;
        tj tjVar = uj.a;
        return new qhj(bVar, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "a806441ed933a420f0d8eef21205bd5f5082592caf126b4aa232077fac3bc89c";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "mutation ChangeMailingAdsAgreementStatus($status: VOLUNTARY_MAILING_AGREEMENT_STATUS!) { changeVoluntaryAgreementStatus(input: { status: $status } ) { status } }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        r7fVar.Z("status");
        r7fVar.m0(this.a.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.nuj
    public final String name() {
        return "ChangeMailingAdsAgreementStatus";
    }

    public final String toString() {
        return "ChangeMailingAdsAgreementStatusMutation(status=" + this.a + ')';
    }
}
