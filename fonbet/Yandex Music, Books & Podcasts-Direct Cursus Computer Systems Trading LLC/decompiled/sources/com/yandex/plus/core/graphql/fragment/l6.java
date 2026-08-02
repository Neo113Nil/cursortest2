package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class l6 {
    public final ArrayList a;

    public l6(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6) && this.a.equals(((l6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k5r.o(new StringBuilder("DarkPopupConfigurationFragment(popups="), this.a, ')');
    }
}
