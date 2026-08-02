package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.g4;
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
public final class a0 {

    @NotNull
    public static final z Companion = new z();
    public static final arf[] c = {btf.a(bwf.b, new g4(18)), null};
    public final BigDecimal a;
    public final String b;

    public /* synthetic */ a0(int i, BigDecimal bigDecimal, String str) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, y.a.getDescriptor());
            throw null;
        }
        this.a = bigDecimal;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.a, a0Var.a) && Intrinsics.d(this.b, a0Var.b);
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
