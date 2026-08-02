package com.yandex.passport.internal.usecase;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class f0 implements i0 {
    public final boolean a;

    public f0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.a == ((f0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("Denied(causeNoInternet="), this.a, ')');
    }
}
