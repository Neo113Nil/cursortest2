package com.yandex.passport.internal.ui.social;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends t {
    public final com.yandex.passport.internal.l a;

    public p(com.yandex.passport.internal.l lVar) {
        lVar.getClass();
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.a, ((p) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccountData(account=" + this.a + ')';
    }
}
