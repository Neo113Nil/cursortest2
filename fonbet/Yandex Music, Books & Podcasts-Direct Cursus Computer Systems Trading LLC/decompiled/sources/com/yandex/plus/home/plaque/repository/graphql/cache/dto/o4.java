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
public final class o4 implements p4 {

    @NotNull
    public static final n4 Companion = new n4();
    public static final arf[] b = {btf.a(bwf.b, new h0(25))};
    public final List a;

    public /* synthetic */ o4(List list, int i) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            u7g.V(i, 1, m4.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4) && Intrinsics.d(this.a, ((o4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return eta.h(new StringBuilder("AnyOf(predicates="), this.a, ')');
    }

    public o4(ArrayList arrayList) {
        this.a = arrayList;
    }
}
