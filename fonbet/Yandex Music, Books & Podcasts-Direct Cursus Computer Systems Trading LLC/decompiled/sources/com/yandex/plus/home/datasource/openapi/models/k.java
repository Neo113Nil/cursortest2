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
public final class k implements d6 {

    @NotNull
    public static final j Companion = new j();
    public static final arf[] c = {null, btf.a(bwf.b, new com.yandex.plus.core.graphql.daily.progress.s(23))};
    public final String a;
    public final List b;

    public /* synthetic */ k(String str, List list, int i) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, i.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.a, kVar.a) && Intrinsics.d(this.b, kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkAllOfPredicateModel(type=");
        sb.append(this.a);
        sb.append(", predicateIndexes=");
        return eta.h(sb, this.b, ')');
    }
}
