package com.yandex.passport.internal.core.accounts;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v extends com.yandex.plus.core.network.api.utils.a {
    public final com.yandex.passport.internal.l a;

    public v(com.yandex.passport.internal.l lVar) {
        lVar.getClass();
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.a, ((v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Account(account=" + this.a + ')';
    }
}
