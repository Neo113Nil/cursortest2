package com.yandex.plus.core.featureflags;

import defpackage.vz1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v {
    public final Set a;

    public v(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.a, ((v) obj).a);
    }

    public final int hashCode() {
        Set set = this.a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public final String toString() {
        return vz1.v(new StringBuilder("FeatureFlagsExperiments(flags="), this.a, ')');
    }
}
