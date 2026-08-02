package com.yandex.passport.internal.ui.router;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z implements b0 {
    public final com.yandex.passport.internal.properties.l a;

    public z(com.yandex.passport.internal.properties.l lVar) {
        lVar.getClass();
        this.a = lVar;
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
        return "Bouncer(loginProperties=" + this.a + ')';
    }
}
