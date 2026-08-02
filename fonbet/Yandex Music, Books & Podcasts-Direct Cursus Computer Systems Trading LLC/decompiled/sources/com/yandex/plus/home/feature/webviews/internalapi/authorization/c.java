package com.yandex.plus.home.feature.webviews.internalapi.authorization;

import defpackage.eta;

/* loaded from: classes5.dex */
public final class c implements d {
    public final long a;

    public c(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return eta.g(new StringBuilder("Success(userId="), this.a, ')');
    }
}
