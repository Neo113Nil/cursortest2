package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class i4 implements p4 {

    @NotNull
    public static final h4 Companion = new h4();
    public final String a;

    public /* synthetic */ i4(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            u7g.V(i, 1, g4.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4) && Intrinsics.d(this.a, ((i4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("NotNull(argName="), this.a, ')');
    }

    public i4(String str) {
        this.a = str;
    }
}
