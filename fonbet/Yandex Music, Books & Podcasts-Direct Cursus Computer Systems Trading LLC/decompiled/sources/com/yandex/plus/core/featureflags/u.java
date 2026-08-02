package com.yandex.plus.core.featureflags;

import defpackage.f1d;
import java.util.Map;

/* loaded from: classes4.dex */
public final class u {
    public final Object a;

    public u(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.a.equals(((u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.j(new StringBuilder("FeatureFlagsConfiguration(values="), this.a, ')');
    }
}
