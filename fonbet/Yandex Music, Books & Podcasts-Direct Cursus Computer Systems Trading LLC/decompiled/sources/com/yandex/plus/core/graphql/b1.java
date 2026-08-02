package com.yandex.plus.core.graphql;

import defpackage.fx6;
import defpackage.jqi;
import defpackage.kwj;
import defpackage.q7g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.uj;

/* loaded from: classes4.dex */
public final class b1 implements jqi {
    public final q7g a;
    public final q7g b;

    public b1(q7g q7gVar, q7g q7gVar2) {
        this.a = q7gVar;
        this.b = q7gVar2;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.s0 s0Var = com.yandex.plus.core.graphql.adapter.s0.a;
        tj tjVar = uj.a;
        return new qhj(s0Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "4c715c1dc016d91467c4de2ed7ed7a7ac2d432c41fc3adde7a04a42ff4be75d1";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "mutation InviteToFamily($email: String, $phone: String) { invite: inviteToFamily(invitation: { email: $email phone: $phone } ) { inviteId inviteUrl } }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        q7g q7gVar = this.a;
        if (q7gVar instanceof kwj) {
            r7fVar.Z("email");
            uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar);
        }
        q7g q7gVar2 = this.b;
        if (q7gVar2 instanceof kwj) {
            r7fVar.Z("phone");
            uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.a.equals(b1Var.a) && this.b.equals(b1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "InviteToFamily";
    }

    public final String toString() {
        return "InviteToFamilyMutation(email=" + this.a + ", phone=" + this.b + ')';
    }
}
