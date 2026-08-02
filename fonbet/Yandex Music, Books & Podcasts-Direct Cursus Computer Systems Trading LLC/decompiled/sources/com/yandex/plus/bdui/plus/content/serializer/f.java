package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.eta;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements com.yandex.plus.bdui.plus.content.f {
    public final String a;
    public final long b;

    public f(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && this.b == fVar.b;
    }

    @Override // com.yandex.plus.bdui.plus.content.g
    public final String getName() {
        return this.a;
    }

    @Override // com.yandex.plus.bdui.plus.content.g
    public final Object getValue() {
        return Long.valueOf(this.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleLongParam(name=");
        sb.append(this.a);
        sb.append(", value=");
        return eta.g(sb, this.b, ')');
    }
}
