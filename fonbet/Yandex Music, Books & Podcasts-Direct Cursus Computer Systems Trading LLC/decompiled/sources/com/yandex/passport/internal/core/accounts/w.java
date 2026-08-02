package com.yandex.passport.internal.core.accounts;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w extends com.yandex.plus.core.network.api.utils.a {
    public final com.yandex.passport.common.core.f a;

    public w(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.appsflyer.internal.k.n(new StringBuilder("AccountUid(uid="), this.a, ')');
    }
}
