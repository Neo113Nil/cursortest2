package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class l {
    public final ArrayList a;

    public l(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.a.equals(((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k5r.o(new StringBuilder("FormattedText(items="), this.a, ')');
    }
}
