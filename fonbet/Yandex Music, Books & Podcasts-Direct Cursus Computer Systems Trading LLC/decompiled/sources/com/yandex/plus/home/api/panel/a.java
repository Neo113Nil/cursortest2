package com.yandex.plus.home.api.panel;

import defpackage.f1d;

/* loaded from: classes5.dex */
public final class a extends e {
    public final Throwable a;

    public a(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a.equals(((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("Error(debugMessage=, cause="), this.a, ')');
    }
}
