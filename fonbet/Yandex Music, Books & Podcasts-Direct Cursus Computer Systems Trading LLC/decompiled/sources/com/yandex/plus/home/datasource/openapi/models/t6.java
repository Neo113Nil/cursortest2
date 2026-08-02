package com.yandex.plus.home.datasource.openapi.models;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class t6 {

    @NotNull
    public static final s6 Companion = new s6();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ t6(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, r6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return Intrinsics.d(this.a, t6Var.a) && Intrinsics.d(this.b, t6Var.b) && Intrinsics.d(this.c, t6Var.c) && Intrinsics.d(this.d, t6Var.d) && Intrinsics.d(this.e, t6Var.e) && Intrinsics.d(this.f, t6Var.f) && Intrinsics.d(this.g, t6Var.g);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkRewardDtoModel(id=");
        sb.append(this.a);
        sb.append(", darkIconUrl=");
        sb.append(this.b);
        sb.append(", lightIconUrl=");
        sb.append(this.c);
        sb.append(", iconUrlPlaceholder=");
        sb.append(this.d);
        sb.append(", contentDescription=");
        sb.append(this.e);
        sb.append(", toolbarTitle=");
        sb.append(this.f);
        sb.append(", subtitle=");
        return dfi.i(sb, this.g, ')');
    }
}
