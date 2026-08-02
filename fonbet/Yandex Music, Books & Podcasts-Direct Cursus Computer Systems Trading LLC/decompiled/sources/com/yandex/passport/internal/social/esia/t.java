package com.yandex.passport.internal.social.esia;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class t implements v {
    public final boolean a;

    public t(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.a == ((t) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("IsWaitingForEsiaCallback(isWaitingForEsiaCallback="), this.a, ')');
    }
}
