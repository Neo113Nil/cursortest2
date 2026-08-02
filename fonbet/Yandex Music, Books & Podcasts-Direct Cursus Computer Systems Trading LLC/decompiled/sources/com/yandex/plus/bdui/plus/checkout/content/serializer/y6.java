package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class y6 {

    @NotNull
    public static final x6 Companion = new x6();
    public final String a;
    public final String b;

    public /* synthetic */ y6(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, w6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return Intrinsics.d(this.a, y6Var.a) && Intrinsics.d(this.b, y6Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconDto(light=");
        sb.append(this.a);
        sb.append(", dark=");
        return dfi.i(sb, this.b, ')');
    }
}
