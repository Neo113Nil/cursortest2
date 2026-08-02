package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class a0 implements c0 {
    public final boolean a;

    public a0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.a == ((a0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("IsChallengePassed(isChallengePassed="), this.a, ')');
    }
}
