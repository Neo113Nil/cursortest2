package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 implements m0 {
    public final com.yandex.passport.internal.properties.u a;
    public final com.yandex.passport.internal.ui.challenge.logout.d b;

    public l0(com.yandex.passport.internal.properties.u uVar, com.yandex.passport.internal.ui.challenge.logout.d dVar) {
        uVar.getClass();
        this.a = uVar;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.a, l0Var.a) && this.b == l0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Logout(properties=" + this.a + ", behaviour=" + this.b + ')';
    }
}
