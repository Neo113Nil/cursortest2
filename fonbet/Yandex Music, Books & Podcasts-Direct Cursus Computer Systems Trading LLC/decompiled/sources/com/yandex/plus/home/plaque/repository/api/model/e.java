package com.yandex.plus.home.plaque.repository.api.model;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements s {
    public final Collection a;

    public e(Collection collection) {
        collection.getClass();
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AllOf(predicates=" + this.a + ')';
    }
}
