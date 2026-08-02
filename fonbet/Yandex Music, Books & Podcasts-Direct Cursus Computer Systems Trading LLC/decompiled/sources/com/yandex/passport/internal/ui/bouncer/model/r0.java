package com.yandex.passport.internal.ui.bouncer.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r0 implements w0 {
    public final com.yandex.passport.common.core.f a;

    public r0(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.d(this.a, ((r0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return com.appsflyer.internal.k.n(new StringBuilder("Relogin(uid="), this.a, ')');
    }
}
