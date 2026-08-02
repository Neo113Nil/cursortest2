package com.yandex.passport.api;

import defpackage.ouj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Intrinsics.d(this.a, ((f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ouj.k(')', "AdditionalActionRequest(rawValue=", this.a);
    }
}
