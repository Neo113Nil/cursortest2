package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class b5 {

    @NotNull
    public static final a5 Companion = new a5();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ b5(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, z4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj;
        return Intrinsics.d(this.a, b5Var.a) && Intrinsics.d(this.b, b5Var.b) && Intrinsics.d(this.c, b5Var.c) && Intrinsics.d(this.d, b5Var.d) && Intrinsics.d(this.e, b5Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataDto(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", firstPaymentText=");
        sb.append(this.c);
        sb.append(", nextPaymentText=");
        sb.append(this.d);
        sb.append(", footerText=");
        return dfi.i(sb, this.e, ')');
    }
}
