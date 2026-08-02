package com.yandex.passport.data.network;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z9 {
    public final String a;
    public final String b;
    public final String c;
    public final com.yandex.passport.data.models.w d;

    public z9(String str, String str2, String str3, com.yandex.passport.data.models.w wVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj;
        return Intrinsics.d(this.a, z9Var.a) && Intrinsics.d(this.b, z9Var.b) && Intrinsics.d(this.c, z9Var.c) && this.d.equals(z9Var.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "RegisterPhonishResult(status=" + this.a + ", masterToken=" + this.b + ", clientToken=" + this.c + ", userInfo=" + this.d + ')';
    }
}
