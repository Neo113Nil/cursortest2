package com.yandex.plus.adapter.auth.passport.api;

import defpackage.eta;

/* loaded from: classes4.dex */
public final class a extends com.yandex.passport.internal.ui.a {
    public final long b;

    public a(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.b == ((a) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return eta.g(new StringBuilder("Login(userId="), this.b, ')');
    }
}
