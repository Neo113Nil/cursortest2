package com.yandex.plus.core.graphql.fragment;

import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yg {
    public final List a;

    public yg(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg) && Intrinsics.d(this.a, ((yg) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return eta.h(new StringBuilder("PlaqueMetric(metrics="), this.a, ')');
    }
}
