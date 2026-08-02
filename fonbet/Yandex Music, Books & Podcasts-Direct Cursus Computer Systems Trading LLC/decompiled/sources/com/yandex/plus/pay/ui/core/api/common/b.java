package com.yandex.plus.pay.ui.core.api.common;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {
    public final long a;
    public final String b;
    public final boolean c;
    public final String d;

    public b(long j, String str, String str2, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && Intrinsics.d(this.b, bVar.b) && this.c == bVar.c && Intrinsics.d(this.d, bVar.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int e = k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayUserState(id=");
        sb.append(this.a);
        sb.append(", login=");
        sb.append(this.b);
        sb.append(", hasPlus=");
        sb.append(this.c);
        sb.append(", avatarUrl=");
        return dfi.i(sb, this.d, ')');
    }
}
