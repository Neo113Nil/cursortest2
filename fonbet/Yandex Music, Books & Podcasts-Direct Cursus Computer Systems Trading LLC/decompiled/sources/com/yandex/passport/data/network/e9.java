package com.yandex.passport.data.network;

import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e9 {
    public final String a;
    public final String b;
    public final long c;
    public final c9 d;

    public e9(String str, String str2, long j, c9 c9Var) {
        c9Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = c9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9)) {
            return false;
        }
        e9 e9Var = (e9) obj;
        return this.a.equals(e9Var.a) && Intrinsics.d(this.b, e9Var.b) && com.yandex.passport.common.time.a.e(this.c, e9Var.c) && Intrinsics.d(this.d, e9Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + tlm.c(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ResponseWrapper(body=" + this.a + ", eTag=" + this.b + ", retrievalTime=" + ((Object) com.yandex.passport.common.time.a.g(this.c)) + ", response=" + this.d + ')';
    }
}
