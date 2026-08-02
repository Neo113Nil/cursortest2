package com.yandex.plus.core.graphql;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class c0 {
    public final String a;

    public c0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.a.equals(((c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("Benefit(text="), this.a, ')');
    }
}
