package com.yandex.passport.data.network;

import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o8 implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;
    public final com.yandex.passport.common.account.a d;

    public o8(long j, com.yandex.passport.common.account.a aVar, com.yandex.passport.data.models.g gVar, String str) {
        str.getClass();
        aVar.getClass();
        this.a = gVar;
        this.b = j;
        this.c = str;
        this.d = aVar;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.d.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8)) {
            return false;
        }
        o8 o8Var = (o8) obj;
        return this.a.equals(o8Var.a) && this.b == o8Var.b && Intrinsics.d(this.c, o8Var.c) && Intrinsics.d(this.d, o8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(tlm.c(this.b, Integer.hashCode(this.a.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ", locationId=" + this.b + ", processTag=" + this.c + ", masterToken=" + this.d + ')';
    }
}
