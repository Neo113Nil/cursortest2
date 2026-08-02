package com.yandex.passport.internal.usecase.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 {
    public final com.yandex.passport.internal.entities.k a;

    public f0(com.yandex.passport.internal.entities.k kVar) {
        kVar.getClass();
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.a, ((f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Params(filter=" + this.a + ')';
    }
}
