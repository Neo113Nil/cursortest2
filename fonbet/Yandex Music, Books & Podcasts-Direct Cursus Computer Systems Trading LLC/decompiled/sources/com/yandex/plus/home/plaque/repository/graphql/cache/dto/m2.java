package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class m2 implements q2 {

    @NotNull
    public static final l2 Companion = new l2();
    public final int a;

    public /* synthetic */ m2(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            u7g.V(i, 1, k2.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2) && this.a == ((m2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("IntValue(value="), this.a, ')');
    }

    public m2(int i) {
        this.a = i;
    }
}
