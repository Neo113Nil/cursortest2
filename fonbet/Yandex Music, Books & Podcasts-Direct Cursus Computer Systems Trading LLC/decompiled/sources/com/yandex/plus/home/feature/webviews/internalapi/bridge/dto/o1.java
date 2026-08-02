package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class o1 implements v1 {

    @NotNull
    public static final k1 Companion = new k1();
    public final String a;
    public final n1 b;

    public /* synthetic */ o1(int i, String str, n1 n1Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, j1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = n1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Intrinsics.d(this.a, o1Var.a) && Intrinsics.d(this.b, o1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        n1 n1Var = this.b;
        return hashCode + (n1Var != null ? n1Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "UserCardResponse(trackId=" + this.a + ", defaultCard=" + this.b + ')';
    }

    public o1(String str, n1 n1Var) {
        this.a = str;
        this.b = n1Var;
    }
}
