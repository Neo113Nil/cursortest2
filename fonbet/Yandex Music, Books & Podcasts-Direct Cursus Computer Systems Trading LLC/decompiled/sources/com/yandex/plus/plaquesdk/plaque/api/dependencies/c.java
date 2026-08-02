package com.yandex.plus.plaquesdk.plaque.api.dependencies;

import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {
    public final String a;
    public final Object b;

    public c(Object obj, String str) {
        str.getClass();
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && Intrinsics.d(this.b, cVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueState(plaqueId=");
        sb.append(this.a);
        sb.append(", payload=");
        return f1d.j(sb, this.b, ')');
    }
}
