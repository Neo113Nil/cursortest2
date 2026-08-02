package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class r0 implements s0 {

    @NotNull
    public static final q0 Companion = new q0();
    public final int a;

    public /* synthetic */ r0(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            u7g.V(i, 1, p0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && this.a == ((r0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("Fix(value="), this.a, ')');
    }

    public r0(int i) {
        this.a = i;
    }
}
