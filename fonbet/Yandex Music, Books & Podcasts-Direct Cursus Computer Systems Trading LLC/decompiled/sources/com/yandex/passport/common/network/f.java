package com.yandex.passport.common.network;

import com.yandex.passport.common.network.h0;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp(with = m.class)
/* loaded from: classes4.dex */
public final class f<E extends h0> extends i {

    @NotNull
    public static final e Companion = new e();
    public final h0 a;

    public f(h0 h0Var) {
        h0Var.getClass();
        this.a = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(errorResponse=" + this.a + ')';
    }
}
