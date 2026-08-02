package com.yandex.passport.data.network;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i9 implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.common.account.a a;
    public final String b;
    public final com.yandex.passport.data.models.g c;

    public i9(com.yandex.passport.common.account.a aVar, String str, com.yandex.passport.data.models.g gVar) {
        aVar.getClass();
        this.a = aVar;
        this.b = str;
        this.c = gVar;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9)) {
            return false;
        }
        i9 i9Var = (i9) obj;
        return Intrinsics.d(this.a, i9Var.a) && this.b.equals(i9Var.b) && this.c.equals(i9Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Params(masterToken=" + this.a + ", installId=" + this.b + ", environment=" + this.c + ')';
    }
}
