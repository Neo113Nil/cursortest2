package com.yandex.plus.divkit.impl;

import defpackage.rv8;

/* loaded from: classes4.dex */
public final class l {
    public final rv8 a;

    public l(rv8 rv8Var) {
        this.a = rv8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.a.equals(((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlusDiv3212DataImpl(divData=" + this.a + ')';
    }
}
