package com.yandex.passport.internal.usecase;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends com.yandex.passport.internal.ui.a {
    public final com.yandex.passport.internal.l b;

    public a0(com.yandex.passport.internal.l lVar) {
        lVar.getClass();
        this.b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.b, ((a0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Account(account=" + this.b + ')';
    }
}
