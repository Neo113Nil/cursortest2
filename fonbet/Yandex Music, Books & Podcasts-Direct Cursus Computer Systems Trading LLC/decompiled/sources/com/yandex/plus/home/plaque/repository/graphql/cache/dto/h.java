package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class h implements i {

    @NotNull
    public static final g Companion = new g();
    public static final arf[] c = {null, btf.a(bwf.b, new com.yandex.plus.home.graphql.configuration.a(14))};
    public final String a;
    public final Map b;

    public /* synthetic */ h(String str, int i, Map map) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, f.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.a, hVar.a) && Intrinsics.d(this.b, hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSpecific(type=");
        sb.append(this.a);
        sb.append(", params=");
        return k5r.p(sb, this.b, ')');
    }

    public h(String str, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = linkedHashMap;
    }
}
