package com.yandex.plus.divkit.api;

import defpackage.eta;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements p {
    public final String a;
    public final long b;

    public m(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.a, mVar.a) && this.b == mVar.b;
    }

    @Override // com.yandex.plus.divkit.api.p
    public final String getName() {
        return this.a;
    }

    @Override // com.yandex.plus.divkit.api.p
    public final Object getValue() {
        return Long.valueOf(this.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Long(name=");
        sb.append(this.a);
        sb.append(", value=");
        return eta.g(sb, this.b, ')');
    }
}
