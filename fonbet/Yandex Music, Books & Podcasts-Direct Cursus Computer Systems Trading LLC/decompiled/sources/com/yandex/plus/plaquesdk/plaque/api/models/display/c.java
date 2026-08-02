package com.yandex.plus.plaquesdk.plaque.api.models.display;

import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class c implements j {
    public final ArrayList a;

    public c(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a.equals(((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k5r.o(new StringBuilder("Combined(simpleBackgrounds="), this.a, ')');
    }
}
