package com.yandex.plus.home.datasource.openapi.models;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class v2 implements h8 {

    @NotNull
    public static final u2 Companion = new u2();
    public final String a;

    public /* synthetic */ v2(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            u7g.V(i, 1, t2.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2) && Intrinsics.d(this.a, ((v2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("NetworkFitWidthTypeModel(type="), this.a, ')');
    }
}
