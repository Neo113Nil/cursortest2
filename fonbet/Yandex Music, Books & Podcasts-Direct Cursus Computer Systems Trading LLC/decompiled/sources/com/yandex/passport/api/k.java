package com.yandex.passport.api;

import defpackage.ouj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return Intrinsics.d(this.a, ((k) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ouj.k(')', "KPassportToken(value=", this.a);
    }
}
