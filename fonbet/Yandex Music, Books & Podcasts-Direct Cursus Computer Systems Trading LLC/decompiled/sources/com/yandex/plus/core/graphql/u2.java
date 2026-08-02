package com.yandex.plus.core.graphql;

import com.connectsdk.device.ConnectableDevice;
import defpackage.dfi;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.s6n;
import defpackage.tj;
import defpackage.uj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u2 implements s6n {
    public final String a;

    public u2(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.z1 z1Var = com.yandex.plus.core.graphql.adapter.z1.a;
        tj tjVar = uj.a;
        return new qhj(z1Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "f9e34192e3411f0da1b741ad6eedbfab9d843ee5b2efd88518d1e45811d17219";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query UserAvatar($id: ID!) { user(id: $id) { id avatar { __typename ...avatar } } }  fragment avatar on Avatar { empty passportAvatarId }";
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
        return (obj instanceof u2) && Intrinsics.d(this.a, ((u2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.nuj
    public final String name() {
        return "UserAvatar";
    }

    public final String toString() {
        return dfi.i(new StringBuilder("UserAvatarQuery(id="), this.a, ')');
    }
}
