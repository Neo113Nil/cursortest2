package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class x {

    @NotNull
    public static final v Companion = new v();
    public static final arf[] c = {null, btf.a(bwf.b, new com.yandex.plus.core.graphql.daily.progress.s(25))};
    public final BigDecimal a;
    public final w b;

    public /* synthetic */ x(int i, BigDecimal bigDecimal, w wVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, u.a.getDescriptor());
            throw null;
        }
        this.a = bigDecimal;
        this.b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.a, xVar.a) && this.b == xVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkBalanceModel(amount=" + this.a + ", currency=" + this.b + ')';
    }
}
