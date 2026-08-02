package com.yandex.plus.pay.data.mb.dto;

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
public final class b0 {

    @NotNull
    public static final s Companion = new s();
    public static final arf[] c = {null, btf.a(bwf.b, new com.yandex.plus.pay.data.acquisition.dto.f(22))};
    public final String a;
    public final List b;

    public /* synthetic */ b0(String str, List list, int i) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, r.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.a, b0Var.a) && Intrinsics.d(this.b, b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegalInfo(text=");
        sb.append(this.a);
        sb.append(", items=");
        return eta.h(sb, this.b, ')');
    }
}
