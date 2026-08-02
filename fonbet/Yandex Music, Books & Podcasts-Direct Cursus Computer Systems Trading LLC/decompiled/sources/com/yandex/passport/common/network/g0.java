package com.yandex.passport.common.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class g0 implements h0 {

    @NotNull
    public static final f0 Companion = new f0();
    public static final arf[] c = {btf.a(bwf.b, new com.yandex.passport.api.exception.l(6)), null};
    public final List a;
    public final String b;

    public /* synthetic */ g0(String str, List list, int i) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, e0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    @Override // com.yandex.passport.common.network.h0
    public final c a() {
        return new c(this.a.toString(), null, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.a, g0Var.a) && Intrinsics.d(this.b, g0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StringErrorResponse(errors=");
        sb.append(this.a);
        sb.append(", requestId=");
        return dfi.i(sb, this.b, ')');
    }
}
