package com.yandex.plus.pay.ui.yb.api;

import defpackage.my1;

/* loaded from: classes5.dex */
public final class b implements d {
    public final my1 a;

    public b(my1 my1Var) {
        this.a = my1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.a + ')';
    }
}
