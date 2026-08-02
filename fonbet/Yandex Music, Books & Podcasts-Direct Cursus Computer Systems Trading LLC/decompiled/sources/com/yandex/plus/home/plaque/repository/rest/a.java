package com.yandex.plus.home.plaque.repository.rest;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final Long a;
    public final boolean b;
    public final String c;

    public a(Long l, boolean z, String str) {
        this.a = l;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && this.b == aVar.b && Intrinsics.d(this.c, aVar.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int e = k5r.e((l == null ? 0 : l.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(userId=");
        sb.append(this.a);
        sb.append(", isLightTheme=");
        sb.append(this.b);
        sb.append(", subscriptionState=");
        return dfi.i(sb, this.c, ')');
    }
}
