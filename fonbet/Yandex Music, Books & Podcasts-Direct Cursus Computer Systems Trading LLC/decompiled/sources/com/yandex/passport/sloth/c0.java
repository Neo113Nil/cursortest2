package com.yandex.passport.sloth;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 implements h0 {
    public final com.yandex.passport.common.core.f a;

    public c0(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.a, ((c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.appsflyer.internal.k.n(new StringBuilder("Relogin(uid="), this.a, ')');
    }
}
