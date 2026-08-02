package com.yandex.passport.sloth.data;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 extends o0 implements q {
    public final String b;
    public final com.yandex.passport.common.core.f c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(String str, com.yandex.passport.common.core.f fVar, String str2) {
        super(k.PayUrl);
        fVar.getClass();
        str2.getClass();
        this.b = str;
        this.c = fVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.b, d0Var.b) && Intrinsics.d(this.c, d0Var.c) && Intrinsics.d(this.d, d0Var.d);
    }

    @Override // com.yandex.passport.sloth.data.q
    public final com.yandex.passport.common.core.f getUid() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.appsflyer.internal.k.d(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PayUrl(url=");
        com.appsflyer.internal.k.y(sb, this.b, ", uid=");
        sb.append(this.c);
        sb.append(", paySessionId=");
        return dfi.i(sb, this.d, ')');
    }
}
