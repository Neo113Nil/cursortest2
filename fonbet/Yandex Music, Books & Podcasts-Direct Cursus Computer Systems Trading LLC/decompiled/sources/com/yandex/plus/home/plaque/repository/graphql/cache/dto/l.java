package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();
    public final String a;
    public final Integer b;
    public final double c;

    public /* synthetic */ l(int i, String str, Integer num, double d) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, j.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = num;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.a, lVar.a) && Intrinsics.d(this.b, lVar.b) && Double.compare(this.c, lVar.c) == 0;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Double.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorDto(color=");
        sb.append(this.a);
        sb.append(", opacity=");
        sb.append(this.b);
        sb.append(", position=");
        return k5r.n(sb, this.c, ')');
    }

    public l(String str, Integer num, double d) {
        this.a = str;
        this.b = num;
        this.c = d;
    }
}
