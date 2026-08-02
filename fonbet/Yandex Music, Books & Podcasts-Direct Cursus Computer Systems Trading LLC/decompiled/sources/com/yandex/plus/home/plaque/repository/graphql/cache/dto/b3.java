package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class b3 implements p4 {

    @NotNull
    public static final a3 Companion = new a3();
    public final String a;

    public /* synthetic */ b3(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            u7g.V(i, 1, z2.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3) && Intrinsics.d(this.a, ((b3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("Bool(argName="), this.a, ')');
    }

    public b3(String str) {
        this.a = str;
    }
}
