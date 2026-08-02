package com.yandex.passport.internal.rotation;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final com.yandex.passport.common.account.a a;
    public final com.yandex.passport.internal.credentials.f b;

    public b(com.yandex.passport.common.account.a aVar, com.yandex.passport.internal.credentials.f fVar) {
        aVar.getClass();
        fVar.getClass();
        this.a = aVar;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RotationMasterToken(masterToken=" + this.a + ", masterCredentials=" + this.b + ')';
    }
}
