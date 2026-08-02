package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements com.yandex.plus.bdui.plus.content.e {
    public final String a;
    public final double b;

    public e(String str, double d) {
        str.getClass();
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.a, eVar.a) && Double.compare(this.b, eVar.b) == 0;
    }

    @Override // com.yandex.plus.bdui.plus.content.g
    public final String getName() {
        return this.a;
    }

    @Override // com.yandex.plus.bdui.plus.content.g
    public final Object getValue() {
        return Double.valueOf(this.b);
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleDoubleParam(name=");
        sb.append(this.a);
        sb.append(", value=");
        return k5r.n(sb, this.b, ')');
    }
}
