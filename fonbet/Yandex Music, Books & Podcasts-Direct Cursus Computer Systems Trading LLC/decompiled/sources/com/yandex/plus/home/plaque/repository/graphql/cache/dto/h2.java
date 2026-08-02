package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class h2 implements i2 {

    @NotNull
    public static final g2 Companion = new g2();
    public final String a;

    public /* synthetic */ h2(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            u7g.V(i, 1, f2.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2) && Intrinsics.d(this.a, ((h2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("StringValue(value="), this.a, ')');
    }

    public h2(String str) {
        str.getClass();
        this.a = str;
    }
}
