package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ m0(String str, int i, String str2, String str3) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, k0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.a, m0Var.a) && Intrinsics.d(this.b, m0Var.b) && Intrinsics.d(this.c, m0Var.c);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Analytics(batchId=");
        sb.append(this.a);
        sb.append(", positionId=");
        sb.append(this.b);
        sb.append(", placeId=");
        return dfi.i(sb, this.c, ')');
    }
}
