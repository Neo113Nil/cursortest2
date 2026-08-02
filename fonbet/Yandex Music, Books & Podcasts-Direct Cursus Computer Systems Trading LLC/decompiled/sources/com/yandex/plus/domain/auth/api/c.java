package com.yandex.plus.domain.auth.api;

import defpackage.eta;

/* loaded from: classes4.dex */
public final class c implements e {
    public final long a;

    public c(long j) {
        this.a = j;
    }

    @Override // com.yandex.plus.domain.auth.api.e
    public final String e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    @Override // com.yandex.plus.domain.auth.api.e
    public final Long getId() {
        return Long.valueOf(this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return eta.g(new StringBuilder("User.GettingToken(id="), this.a, ')');
    }
}
