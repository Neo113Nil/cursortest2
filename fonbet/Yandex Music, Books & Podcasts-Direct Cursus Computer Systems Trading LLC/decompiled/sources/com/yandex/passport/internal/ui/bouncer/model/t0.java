package com.yandex.passport.internal.ui.bouncer.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t0 implements w0 {
    public final String a;

    public t0(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.d(this.a, ((t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SamlSsoRequest(authUrl=" + ((Object) com.yandex.passport.common.url.b.m(this.a)) + ')';
    }
}
