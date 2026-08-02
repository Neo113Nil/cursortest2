package com.yandex.passport.internal.usecase.authorize;

import defpackage.eta;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements s {
    public final com.yandex.passport.internal.entities.h a;
    public final com.yandex.passport.internal.analytics.a b;
    public final String c;
    public final long d;
    public final com.yandex.passport.common.core.b e;

    public a(com.yandex.passport.internal.entities.h hVar, com.yandex.passport.internal.analytics.a aVar, String str, long j) {
        hVar.getClass();
        aVar.getClass();
        this.a = hVar;
        this.b = aVar;
        this.c = str;
        this.d = j;
        this.e = com.yandex.plus.core.network.api.utils.a.L(hVar.a);
    }

    @Override // com.yandex.passport.internal.usecase.authorize.s
    public final com.yandex.passport.common.core.b a() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.s
    public final com.yandex.passport.internal.analytics.a b() {
        return this.b;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.s
    public final long c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && this.d == aVar.d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Long.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(cookie=");
        sb.append(this.a);
        sb.append(", analyticsFromValue=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", socialCode=null, locationId=");
        return eta.g(sb, this.d, ')');
    }
}
