package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ek6;
import defpackage.k5r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class O4 {

    @NotNull
    public final ek6 a;

    public O4(@NotNull ek6 ek6Var) {
        ek6Var.getClass();
        this.a = ek6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O4)) {
            return false;
        }
        ek6 ek6Var = ((O4) obj).a;
        if (!ek6Var.a.equals(this.a.a) || !ek6Var.d.equals(this.a.d) || !ek6Var.e.equals(this.a.e)) {
            return false;
        }
        boolean z = ek6Var.f;
        ek6 ek6Var2 = this.a;
        return z == ek6Var2.f && ek6Var.i == ek6Var2.i;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(527, 31, this.a.a), 31, this.a.d), 31, this.a.e);
        ek6 ek6Var = this.a;
        return ((c + (!ek6Var.f ? 1 : 0)) * 31) + (!ek6Var.i ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        return "IdentifiableCookie(cookie=" + this.a + ")";
    }
}
