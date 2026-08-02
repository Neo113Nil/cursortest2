package com.yandex.passport.common.value;

import defpackage.ouj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public final String a;

    public /* synthetic */ a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.d(this.a, ((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ouj.k(')', "DeviceId(value=", this.a);
    }
}
