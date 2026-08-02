package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class v4 implements y4 {

    @NotNull
    public static final u4 Companion = new u4();
    public final int a;

    public /* synthetic */ v4(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            u7g.V(i, 1, t4.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4) && this.a == ((v4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("Fix(value="), this.a, ')');
    }

    public v4(int i) {
        this.a = i;
    }
}
