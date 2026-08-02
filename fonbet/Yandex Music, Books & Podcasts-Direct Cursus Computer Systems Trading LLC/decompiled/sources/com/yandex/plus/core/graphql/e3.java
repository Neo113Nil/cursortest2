package com.yandex.plus.core.graphql;

import defpackage.ern;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.s6n;
import defpackage.tj;
import defpackage.uj;

/* loaded from: classes4.dex */
public final class e3 implements s6n {
    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.h2 h2Var = com.yandex.plus.core.graphql.adapter.h2.a;
        tj tjVar = uj.a;
        return new qhj(h2Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "6fd2b53cdf170ecaf338a6b098d4cb683561c6af9edb7c4e8e15fc4897cb4780";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query UserSyncStatus { userSyncStatus { status } }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == e3.class;
    }

    public final int hashCode() {
        return ern.a(e3.class).hashCode();
    }

    @Override // defpackage.nuj
    public final String name() {
        return "UserSyncStatus";
    }
}
