package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fj {
    public final ej a;
    public final Integer b;

    public fj(ej ejVar, Integer num) {
        this.a = ejVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj)) {
            return false;
        }
        fj fjVar = (fj) obj;
        return this.a.equals(fjVar.a) && Intrinsics.d(this.b, fjVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PlaqueTextWidget(text=" + this.a + ", lineHeight=" + this.b + ')';
    }
}
