package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class fd {
    public final ArrayList a;

    public fd(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd) && this.a.equals(((fd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k5r.o(new StringBuilder("Title(items="), this.a, ')');
    }
}
