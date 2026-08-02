package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class tn {
    public final String a;

    public tn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tn) && this.a.equals(((tn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("OnDeeplinkCrossAction(deeplink="), this.a, ')');
    }
}
