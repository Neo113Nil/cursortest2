package com.yandex.passport.internal.autologin.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m {
    public final com.yandex.passport.internal.properties.g a;
    public final com.yandex.passport.internal.account.f b;

    public m(com.yandex.passport.internal.properties.g gVar, com.yandex.passport.internal.account.f fVar) {
        gVar.getClass();
        fVar.getClass();
        this.a = gVar;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.a, mVar.a) && Intrinsics.d(this.b, mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoLoginWithAccountParams(properties=" + this.a + ", account=" + this.b + ')';
    }
}
