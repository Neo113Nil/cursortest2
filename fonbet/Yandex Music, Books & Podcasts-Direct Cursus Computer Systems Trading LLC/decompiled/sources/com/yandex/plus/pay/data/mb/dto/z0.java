package com.yandex.plus.pay.data.mb.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();
    public static final arf[] c = {btf.a(bwf.b, new com.yandex.plus.pay.data.acquisition.dto.f(28)), null};
    public final BigDecimal a;
    public final String b;

    public /* synthetic */ z0(int i, BigDecimal bigDecimal, String str) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, x0.a.getDescriptor());
            throw null;
        }
        this.a = bigDecimal;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.d(this.a, z0Var.a) && Intrinsics.d(this.b, z0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Price(amount=");
        sb.append(this.a);
        sb.append(", currency=");
        return dfi.i(sb, this.b, ')');
    }
}
