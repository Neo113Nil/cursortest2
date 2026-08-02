package com.yandex.plus.home.plaque.repository.api.model;

import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {
    public final List a;
    public final List b;

    public d(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && Intrinsics.d(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueConfiguration(conditionalPlaques=");
        sb.append(this.a);
        sb.append(", defaultPlaques=");
        return eta.h(sb, this.b, ')');
    }
}
