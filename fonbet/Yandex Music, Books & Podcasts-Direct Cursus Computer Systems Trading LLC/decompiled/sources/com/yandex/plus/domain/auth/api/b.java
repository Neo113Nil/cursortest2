package com.yandex.plus.domain.auth.api;

import defpackage.k5r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements e {
    public final long a;
    public final String b;
    public final boolean c;
    public final ArrayList d;

    public b(long j, String str, boolean z, ArrayList arrayList) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = arrayList;
    }

    @Override // com.yandex.plus.domain.auth.api.e
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && Intrinsics.d(this.b, bVar.b) && this.c == bVar.c && this.d.equals(bVar.d);
    }

    @Override // com.yandex.plus.domain.auth.api.e
    public final Long getId() {
        return Long.valueOf(this.a);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.e(k5r.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User.Authorized(id=");
        sb.append(this.a);
        sb.append(", isYandexEmployee=");
        sb.append(this.c);
        sb.append(", partitions=");
        return k5r.o(sb, this.d, ')');
    }
}
