package com.yandex.plus.core.coroutines.extensions.flow;

import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final Object a;
    public final Object b;

    public b(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowHistory(previous=");
        sb.append(this.a);
        sb.append(", current=");
        return f1d.j(sb, this.b, ')');
    }
}
