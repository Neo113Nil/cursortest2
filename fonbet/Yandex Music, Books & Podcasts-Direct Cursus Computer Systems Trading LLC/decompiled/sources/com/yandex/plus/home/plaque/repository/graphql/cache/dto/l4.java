package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class l4 implements p4 {

    @NotNull
    public static final k4 Companion = new k4();
    public static final arf[] b = {btf.a(bwf.b, new h0(24))};
    public final List a;

    public /* synthetic */ l4(List list, int i) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            u7g.V(i, 1, j4.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4) && Intrinsics.d(this.a, ((l4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return eta.h(new StringBuilder("AllOf(predicates="), this.a, ')');
    }

    public l4(ArrayList arrayList) {
        this.a = arrayList;
    }
}
