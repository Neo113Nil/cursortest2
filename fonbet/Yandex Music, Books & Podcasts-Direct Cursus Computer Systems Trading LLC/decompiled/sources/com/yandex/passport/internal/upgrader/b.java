package com.yandex.passport.internal.upgrader;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final com.yandex.passport.internal.ui.account_upgrade.l a;

    public b(com.yandex.passport.internal.ui.account_upgrade.l lVar) {
        lVar.getClass();
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Params(upgraderExtras=" + this.a + ')';
    }
}
