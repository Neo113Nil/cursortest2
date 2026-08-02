package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class d2 implements w0 {

    @NotNull
    public static final c2 Companion = new c2();
    public static final arf[] e = {null, null, null, btf.a(bwf.b, new k0(7))};
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ d2(int i, String str, String str2, String str3, List list) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, b2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return Intrinsics.d(this.a, d2Var.a) && Intrinsics.d(this.b, d2Var.b) && Intrinsics.d(this.c, d2Var.c) && Intrinsics.d(this.d, d2Var.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkEnabledContentDescriptionModel(type=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", actionText=");
        sb.append(this.c);
        sb.append(", templates=");
        return eta.h(sb, this.d, ')');
    }
}
