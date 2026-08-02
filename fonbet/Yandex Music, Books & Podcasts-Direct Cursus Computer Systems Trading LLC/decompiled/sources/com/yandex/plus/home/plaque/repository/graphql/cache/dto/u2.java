package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class u2 implements y2 {

    @NotNull
    public static final t2 Companion = new t2();
    public static final arf[] b = {btf.a(bwf.b, new h0(14))};
    public final Set a;

    public /* synthetic */ u2(int i, Set set) {
        if (1 == (i & 1)) {
            this.a = set;
        } else {
            u7g.V(i, 1, s2.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2) && Intrinsics.d(this.a, ((u2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vz1.v(new StringBuilder("Ints(value="), this.a, ')');
    }

    public u2(Set set) {
        set.getClass();
        this.a = set;
    }
}
