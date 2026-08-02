package com.yandex.plus.home.datasource.openapi.models;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class u0 implements d6 {

    @NotNull
    public static final t0 Companion = new t0();
    public final String a;
    public final String b;
    public final j6 c;

    public /* synthetic */ u0(int i, String str, String str2, j6 j6Var) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, s0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.a, u0Var.a) && Intrinsics.d(this.b, u0Var.b) && Intrinsics.d(this.c, u0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "NetworkContainsPredicateModel(type=" + this.a + ", argName=" + this.b + ", primitiveArg=" + this.c + ')';
    }
}
