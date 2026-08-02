package com.yandex.plus.home.plaque.repository.api.model;

import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class f implements s {
    public final ArrayList a;

    public f(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a.equals(((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k5r.o(new StringBuilder("AnyOf(predicates="), this.a, ')');
    }
}
