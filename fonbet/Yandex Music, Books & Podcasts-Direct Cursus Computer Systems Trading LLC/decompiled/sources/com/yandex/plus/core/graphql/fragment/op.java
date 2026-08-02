package com.yandex.plus.core.graphql.fragment;

import defpackage.vz1;

/* loaded from: classes4.dex */
public final class op {
    public final int a;

    public op(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof op) && this.a == ((op) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("OnFixWidth(fix="), this.a, ')');
    }
}
