package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class e2 implements i2 {

    @NotNull
    public static final d2 Companion = new d2();
    public final int a;

    public /* synthetic */ e2(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            u7g.V(i, 1, c2.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && this.a == ((e2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("IntValue(value="), this.a, ')');
    }

    public e2(int i) {
        this.a = i;
    }
}
