package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class k1 {

    @NotNull
    public static final j1 Companion = new j1();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ k1(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, i1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Intrinsics.d(this.a, k1Var.a) && Intrinsics.d(this.b, k1Var.b) && Intrinsics.d(this.c, k1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int c = k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return c + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Theme(backgroundColor=");
        sb.append(this.a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", textColor=");
        return dfi.i(sb, this.c, ')');
    }
}
