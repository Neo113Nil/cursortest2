package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class e3 implements p4 {

    @NotNull
    public static final d3 Companion = new d3();
    public final boolean a;

    public /* synthetic */ e3(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            u7g.V(i, 1, c3.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3) && this.a == ((e3) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("BooleanLiteral(value="), this.a, ')');
    }

    public e3(boolean z) {
        this.a = z;
    }
}
