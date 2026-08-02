package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 implements m0 {
    public final com.yandex.passport.internal.properties.u a;

    public j0(com.yandex.passport.internal.properties.u uVar) {
        uVar.getClass();
        this.a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.a, ((j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Delete(properties=" + this.a + ')';
    }
}
