package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class eh {
    public final boolean a;

    public eh(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh) && this.a == ((eh) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("BooleanLiteralPredicate(value="), this.a, ')');
    }
}
