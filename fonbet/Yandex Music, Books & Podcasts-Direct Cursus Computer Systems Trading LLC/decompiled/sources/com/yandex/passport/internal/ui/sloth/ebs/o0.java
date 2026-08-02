package com.yandex.passport.internal.ui.sloth.ebs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 implements q0 {
    public final com.yandex.passport.common.ebs.a a;

    public o0(com.yandex.passport.common.ebs.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && Intrinsics.d(this.a, ((o0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowBiometricVerificationSdk(properties=" + this.a + ')';
    }
}
