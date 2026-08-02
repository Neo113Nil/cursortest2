package com.yandex.plus.home.api.panel;

import defpackage.dfi;

/* loaded from: classes5.dex */
public final class d extends e {
    public final boolean a;

    public d(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("Success(hasShortcuts="), this.a, ')');
    }
}
