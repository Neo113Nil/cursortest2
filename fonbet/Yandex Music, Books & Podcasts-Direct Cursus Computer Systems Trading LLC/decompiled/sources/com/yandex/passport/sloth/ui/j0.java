package com.yandex.passport.sloth.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 implements k0 {
    public final com.yandex.passport.sloth.ui.error.e a;

    public j0(com.yandex.passport.sloth.ui.error.e eVar) {
        this.a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.a, ((j0) obj).a);
    }

    public final int hashCode() {
        com.yandex.passport.sloth.ui.error.e eVar = this.a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "SetZeroPageState(state=" + this.a + ')';
    }
}
