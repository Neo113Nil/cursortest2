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
public final class x2 implements y2 {

    @NotNull
    public static final w2 Companion = new w2();
    public static final arf[] b = {btf.a(bwf.b, new h0(15))};
    public final Set a;

    public /* synthetic */ x2(int i, Set set) {
        if (1 == (i & 1)) {
            this.a = set;
        } else {
            u7g.V(i, 1, v2.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2) && Intrinsics.d(this.a, ((x2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vz1.v(new StringBuilder("StringSet(value="), this.a, ')');
    }

    public x2(Set set) {
        set.getClass();
        this.a = set;
    }
}
