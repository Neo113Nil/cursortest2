package com.yandex.passport.sloth;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z implements h0 {
    public final com.yandex.passport.common.core.f a;

    public z(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.a, ((z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.appsflyer.internal.k.n(new StringBuilder("DeleteAccountAuth(uid="), this.a, ')');
    }
}
