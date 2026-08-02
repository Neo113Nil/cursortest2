package com.yandex.passport.internal.ui.sloth.ebs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 implements q0 {
    public final com.yandex.passport.common.core.d a;

    public p0(com.yandex.passport.common.core.d dVar) {
        dVar.getClass();
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Intrinsics.d(this.a, ((p0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "ShowInitializationCryptoSdk(jwt=" + this.a + ')';
    }
}
