package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

/* loaded from: classes4.dex */
public final class k0 implements m0 {
    public final Exception a;

    public k0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.a.equals(((k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Exception(throwable=" + this.a + ')';
    }
}
