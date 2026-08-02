package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class n implements d6 {

    @NotNull
    public static final m Companion = new m();
    public static final arf[] c = {null, btf.a(bwf.b, new com.yandex.plus.core.graphql.daily.progress.s(24))};
    public final String a;
    public final List b;

    public /* synthetic */ n(String str, List list, int i) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, l.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.a, nVar.a) && Intrinsics.d(this.b, nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkAnyOfPredicateModel(type=");
        sb.append(this.a);
        sb.append(", predicateIndexes=");
        return eta.h(sb, this.b, ')');
    }
}
