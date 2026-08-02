package com.yandex.plus.home.datasource.openapi.models;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class g1 implements i1 {

    @NotNull
    public static final f1 Companion = new f1();
    public final String a;

    public /* synthetic */ g1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            u7g.V(i, 1, e1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && Intrinsics.d(this.a, ((g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("NetworkCornerHalfModel(type="), this.a, ')');
    }
}
