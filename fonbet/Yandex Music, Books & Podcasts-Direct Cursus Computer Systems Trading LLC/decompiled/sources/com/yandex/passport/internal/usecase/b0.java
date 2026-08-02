package com.yandex.passport.internal.usecase;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 extends com.yandex.passport.internal.ui.a {
    public final com.yandex.passport.common.core.f b;

    public b0(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.b, ((b0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return com.appsflyer.internal.k.n(new StringBuilder("AccountUid(uid="), this.b, ')');
    }
}
