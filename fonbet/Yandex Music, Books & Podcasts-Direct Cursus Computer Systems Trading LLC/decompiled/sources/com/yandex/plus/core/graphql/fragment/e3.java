package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e3 {
    public final String a;
    public final f3 b;

    public e3(String str, f3 f3Var) {
        str.getClass();
        this.a = str;
        this.b = f3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return Intrinsics.d(this.a, e3Var.a) && Intrinsics.d(this.b, e3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f3 f3Var = this.b;
        return hashCode + (f3Var == null ? 0 : f3Var.hashCode());
    }

    public final String toString() {
        return "Item(__typename=" + this.a + ", onTextProperties=" + this.b + ')';
    }
}
