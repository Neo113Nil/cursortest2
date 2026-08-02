package com.yandex.plus.home.repository.api.model;

import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements d {
    public final Object a;

    public e(Object obj) {
        obj.getClass();
        this.a = obj;
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
        return f1d.j(new StringBuilder("Success(value="), this.a, ')');
    }
}
