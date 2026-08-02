package com.yandex.plus.pay.graphql.analytics;

import defpackage.eta;
import defpackage.h0o;
import defpackage.o3o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final h0o a;
    public final o3o b;
    public final long c;

    public a(h0o h0oVar, o3o o3oVar, long j) {
        this.a = h0oVar;
        this.b = o3oVar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && this.c == aVar.c;
    }

    public final int hashCode() {
        h0o h0oVar = this.a;
        int hashCode = (h0oVar == null ? 0 : h0oVar.hashCode()) * 31;
        o3o o3oVar = this.b;
        return Long.hashCode(this.c) + ((hashCode + (o3oVar != null ? o3oVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractionInfo(requestBody=");
        sb.append(this.a);
        sb.append(", responseBody=");
        sb.append(this.b);
        sb.append(", timestamp=");
        return eta.g(sb, this.c, ')');
    }
}
