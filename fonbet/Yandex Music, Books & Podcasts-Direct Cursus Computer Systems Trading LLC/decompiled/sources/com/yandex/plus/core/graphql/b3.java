package com.yandex.plus.core.graphql;

import com.connectsdk.device.ConnectableDevice;
import defpackage.dfi;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.s6n;
import defpackage.tj;
import defpackage.uj;

/* loaded from: classes4.dex */
public final class b3 implements s6n {
    public final String a;

    public b3(String str) {
        this.a = str;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.c2 c2Var = com.yandex.plus.core.graphql.adapter.c2.a;
        tj tjVar = uj.a;
        return new qhj(c2Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "d759ec0e9ab34ae60e5c41b6982066047f0d6e79dd19835cdefc9f8458bf2035";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query User($id: ID!) { user(id: $id) { id avatar { __typename ...avatar } family { capacity invitations { __typename ...familyInvitation } members { __typename ...familyMember } } } }  fragment avatar on Avatar { empty passportAvatarId }  fragment familyInvitation on FamilyInvitation { id avatar { __typename ...avatar } }  fragment familyMember on User { id avatar { __typename ...avatar } }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        uj.a.a(r7fVar, fx6Var, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3) && this.a.equals(((b3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.nuj
    public final String name() {
        return "User";
    }

    public final String toString() {
        return dfi.i(new StringBuilder("UserQuery(id="), this.a, ')');
    }
}
