package com.yandex.plus.pay.data.mb.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class i3 {

    @NotNull
    public static final f3 Companion = new f3();
    public static final arf[] e = {null, btf.a(bwf.b, new c1(13)), null, null};
    public final String a;
    public final h3 b;
    public final String c;
    public final String d;

    public /* synthetic */ i3(int i, String str, h3 h3Var, String str2, String str3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, e3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = h3Var;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return Intrinsics.d(this.a, i3Var.a) && this.b == i3Var.b && Intrinsics.d(this.c, i3Var.c) && Intrinsics.d(this.d, i3Var.d);
    }

    public final int hashCode() {
        int c = k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(key=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", data=");
        sb.append(this.c);
        sb.append(", link=");
        return dfi.i(sb, this.d, ')');
    }
}
