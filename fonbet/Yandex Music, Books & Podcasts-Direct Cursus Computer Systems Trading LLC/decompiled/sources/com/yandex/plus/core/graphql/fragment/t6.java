package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t6 {
    public final List a;
    public final String b;
    public final com.yandex.plus.core.graphql.type.i0 c;

    public t6(List list, String str, com.yandex.plus.core.graphql.type.i0 i0Var) {
        this.a = list;
        this.b = str;
        this.c = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return Intrinsics.d(this.a, t6Var.a) && this.b.equals(t6Var.b) && this.c == t6Var.c;
    }

    public final int hashCode() {
        List list = this.a;
        return this.c.hashCode() + k5r.c((list == null ? 0 : list.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "DarkSectionFragment(shortcuts=" + this.a + ", id=" + this.b + ", viewType=" + this.c + ')';
    }
}
