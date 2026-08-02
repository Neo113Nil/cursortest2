package com.yandex.passport.data.network;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class j2 {

    @NotNull
    public static final i2 Companion = new i2();
    public final String a;
    public final n2 b;

    public /* synthetic */ j2(int i, String str, n2 n2Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, h2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = n2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return Intrinsics.d(this.a, j2Var.a) && Intrinsics.d(this.b, j2Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Experiment(handler=" + this.a + ", passport=" + this.b + ')';
    }
}
