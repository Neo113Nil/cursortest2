package com.yandex.passport.internal.usecase.authorize;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements s {
    public final com.yandex.passport.internal.entities.f a;
    public final String b;
    public final com.yandex.passport.internal.credentials.e c;
    public final com.yandex.passport.internal.analytics.a d;
    public final com.yandex.passport.common.core.b e;

    public d(com.yandex.passport.internal.entities.f fVar, String str, com.yandex.passport.internal.credentials.e eVar, com.yandex.passport.internal.analytics.a aVar) {
        fVar.getClass();
        eVar.getClass();
        aVar.getClass();
        this.a = fVar;
        this.b = str;
        this.c = eVar;
        this.d = aVar;
        this.e = com.yandex.plus.core.network.api.utils.a.L(fVar.a);
    }

    @Override // com.yandex.passport.internal.usecase.authorize.s
    public final com.yandex.passport.common.core.b a() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.s
    public final com.yandex.passport.internal.analytics.a b() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.usecase.authorize.s
    public final long c() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && Intrinsics.d(this.b, dVar.b) && Intrinsics.d(this.c, dVar.c) && Intrinsics.d(this.d, dVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Params(code=" + this.a + ", codeVerifier=" + this.b + ", credentialsProvider=" + this.c + ", analyticsFromValue=" + this.d + ", socialCode=null)";
    }
}
