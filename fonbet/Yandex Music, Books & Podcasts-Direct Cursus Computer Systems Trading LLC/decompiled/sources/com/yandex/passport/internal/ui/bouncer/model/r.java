package com.yandex.passport.internal.ui.bouncer.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements k0 {
    public final com.yandex.passport.internal.properties.l a;

    public r(com.yandex.passport.internal.properties.l lVar) {
        lVar.getClass();
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.a, ((r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LoadAccounts(loginProperties=" + this.a + ')';
    }
}
