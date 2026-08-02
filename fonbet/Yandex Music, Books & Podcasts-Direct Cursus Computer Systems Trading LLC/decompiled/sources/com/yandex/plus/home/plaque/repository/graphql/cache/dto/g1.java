package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class g1 implements k1 {

    @NotNull
    public static final f1 Companion = new f1();
    public final String a;
    public final j1 b;

    public /* synthetic */ g1(int i, String str, j1 j1Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, e1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.d(this.a, g1Var.a) && Intrinsics.d(this.b, g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Link(link=" + this.a + ", description=" + this.b + ')';
    }

    public g1(String str, j1 j1Var) {
        this.a = str;
        this.b = j1Var;
    }
}
