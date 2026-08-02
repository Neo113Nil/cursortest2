package com.yandex.passport.internal.usecase.authorize;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements s {
    public final com.yandex.passport.internal.entities.t a;
    public final com.yandex.passport.common.core.b b;
    public final com.yandex.passport.internal.analytics.a c;

    public j(com.yandex.passport.internal.entities.t tVar) {
        tVar.getClass();
        this.a = tVar;
        this.b = com.yandex.plus.core.network.api.utils.a.L(tVar.b);
        this.c = com.yandex.passport.internal.analytics.a.t;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.s
    public final com.yandex.passport.common.core.b a() {
        return this.b;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.s
    public final com.yandex.passport.internal.analytics.a b() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.s
    public final long c() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.a, ((j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Params(trackId=" + this.a + ", socialCode=null)";
    }
}
