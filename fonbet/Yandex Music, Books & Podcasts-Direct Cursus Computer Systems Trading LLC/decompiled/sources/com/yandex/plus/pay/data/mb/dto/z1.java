package com.yandex.plus.pay.data.mb.dto;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class z1 {

    @NotNull
    public static final y1 Companion = new y1();
    public final long a;
    public final String b;

    public /* synthetic */ z1(String str, int i, long j) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, x1.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.a == z1Var.a && Intrinsics.d(this.b, z1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureDto(end=");
        sb.append(this.a);
        sb.append(", feature=");
        return dfi.i(sb, this.b, ')');
    }
}
