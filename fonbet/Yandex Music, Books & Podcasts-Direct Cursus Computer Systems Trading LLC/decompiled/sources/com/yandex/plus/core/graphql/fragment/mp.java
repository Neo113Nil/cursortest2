package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class mp {
    public final String a;

    public mp(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mp) && this.a.equals(((mp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("OnFillWidth(__typename="), this.a, ')');
    }
}
