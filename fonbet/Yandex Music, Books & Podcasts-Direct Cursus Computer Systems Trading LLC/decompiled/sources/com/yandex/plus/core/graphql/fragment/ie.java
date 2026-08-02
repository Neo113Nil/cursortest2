package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ie {
    public final com.yandex.plus.core.graphql.type.i a;
    public final Integer b;

    public ie(com.yandex.plus.core.graphql.type.i iVar, Integer num) {
        this.a = iVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie)) {
            return false;
        }
        ie ieVar = (ie) obj;
        return this.a == ieVar.a && Intrinsics.d(this.b, ieVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PlaqueCorner(type=" + this.a + ", heightFix=" + this.b + ')';
    }
}
