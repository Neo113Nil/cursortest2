package com.yandex.plus.bdui.plus.auth;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class d implements f {
    public final Throwable a;

    public d(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a.equals(((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("Error(error="), this.a, ')');
    }
}
