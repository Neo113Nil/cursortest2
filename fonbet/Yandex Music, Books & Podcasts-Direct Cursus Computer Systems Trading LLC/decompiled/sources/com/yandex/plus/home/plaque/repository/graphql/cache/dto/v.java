package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class v implements x {

    @NotNull
    public static final u Companion = new u();
    public static final arf[] c = {btf.a(bwf.b, new com.yandex.plus.home.graphql.configuration.a(16)), null};
    public final List a;
    public final s b;

    public /* synthetic */ v(int i, List list, s sVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, t.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.a, vVar.a) && Intrinsics.d(this.b, vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RadialGradient(colors=" + this.a + ", centralPoint=" + this.b + ')';
    }

    public v(ArrayList arrayList, s sVar) {
        this.a = arrayList;
        this.b = sVar;
    }
}
