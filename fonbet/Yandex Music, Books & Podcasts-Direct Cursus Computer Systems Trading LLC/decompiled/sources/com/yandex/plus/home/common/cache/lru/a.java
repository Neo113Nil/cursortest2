package com.yandex.plus.home.common.cache.lru;

import com.yandex.plus.pay.repository.api.model.offers.p;
import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final long a;
    public final Object b;

    public a(long j, p pVar) {
        this.a = j;
        this.b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && Intrinsics.d(this.b, aVar.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheTimedValue(timestamp=");
        sb.append(this.a);
        sb.append(", value=");
        return f1d.j(sb, this.b, ')');
    }
}
