package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements c0 {
    public final String a;

    public z(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.c0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.a, ((z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("JustInteract(actionContext="), this.a, ')');
    }
}
