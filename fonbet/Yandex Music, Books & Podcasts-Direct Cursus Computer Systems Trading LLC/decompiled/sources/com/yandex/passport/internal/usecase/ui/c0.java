package com.yandex.passport.internal.usecase.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 {
    public final String a;
    public final com.yandex.passport.common.core.b b;
    public final com.yandex.passport.internal.entities.k c;

    public c0(String str, com.yandex.passport.common.core.b bVar, com.yandex.passport.internal.entities.k kVar) {
        str.getClass();
        bVar.getClass();
        kVar.getClass();
        this.a = str;
        this.b = bVar;
        this.c = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.a, c0Var.a) && this.b == c0Var.b && Intrinsics.d(this.c, c0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Params(parentName=" + this.a + ", parentEnvironment=" + this.b + ", filter=" + this.c + ')';
    }
}
