package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.eta;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class w0 {

    @NotNull
    public static final v0 Companion = new v0();
    public static final arf[] d = {null, null, btf.a(bwf.b, new f(12))};
    public final String a;
    public final String b;
    public final List c;

    public w0(int i, String str, String str2, List list) {
        if (2 != (i & 2)) {
            u7g.V(i, 2, o0.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = c5b.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.d(this.a, w0Var.a) && Intrinsics.d(this.b, w0Var.b) && Intrinsics.d(this.c, w0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Legals(oneClickDisclaimer=");
        sb.append(this.a);
        sb.append(", format=");
        sb.append(this.b);
        sb.append(", arguments=");
        return eta.h(sb, this.c, ')');
    }
}
