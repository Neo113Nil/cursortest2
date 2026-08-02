package com.yandex.passport.sloth.data;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w extends o0 implements q {
    public final String b;
    public final com.yandex.passport.common.core.f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.yandex.passport.common.core.f fVar, String str) {
        super(k.AuthQrWithoutQr);
        fVar.getClass();
        this.b = str;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.b, wVar.b) && Intrinsics.d(this.c, wVar.c);
    }

    @Override // com.yandex.passport.sloth.data.q
    public final com.yandex.passport.common.core.f getUid() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthQrWithoutQr(url=");
        com.appsflyer.internal.k.y(sb, this.b, ", uid=");
        return com.appsflyer.internal.k.n(sb, this.c, ')');
    }
}
