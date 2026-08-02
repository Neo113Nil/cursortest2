package com.yandex.passport.internal.ui.router;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y implements b0 {
    public final com.yandex.passport.internal.properties.l a;

    public y(com.yandex.passport.internal.properties.l lVar) {
        lVar.getClass();
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AuthInWebView(loginProperties=" + this.a + ')';
    }
}
