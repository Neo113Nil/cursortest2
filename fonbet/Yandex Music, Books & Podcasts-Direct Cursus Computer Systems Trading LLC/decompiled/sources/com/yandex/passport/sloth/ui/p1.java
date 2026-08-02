package com.yandex.passport.sloth.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p1 {
    public final boolean a;
    public final com.yandex.passport.sloth.ui.error.e b;

    public p1(boolean z, com.yandex.passport.sloth.ui.error.e eVar) {
        this.a = z;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.a == p1Var.a && Intrinsics.d(this.b, p1Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        com.yandex.passport.sloth.ui.error.e eVar = this.b;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "State(isInitialUrlLoaded=" + this.a + ", zeroPageState=" + this.b + ')';
    }
}
