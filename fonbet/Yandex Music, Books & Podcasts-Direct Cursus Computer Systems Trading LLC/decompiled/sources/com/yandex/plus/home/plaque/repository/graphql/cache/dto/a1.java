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
public final class a1 implements k1 {

    @NotNull
    public static final z0 Companion = new z0();
    public static final arf[] c = {null, btf.a(bwf.b, new h0(5))};
    public final String a;
    public final List b;

    public /* synthetic */ a1(String str, List list, int i) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, y0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.a, a1Var.a) && Intrinsics.d(this.b, a1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Container(metaColor=");
        sb.append(this.a);
        sb.append(", items=");
        return eta.h(sb, this.b, ')');
    }

    public a1(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }
}
