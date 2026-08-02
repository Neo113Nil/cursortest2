package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class u5 {
    public final ArrayList a;

    public u5(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5) && this.a.equals(((u5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k5r.o(new StringBuilder("DarkLayoutFragment(sectionGroups="), this.a, ')');
    }
}
