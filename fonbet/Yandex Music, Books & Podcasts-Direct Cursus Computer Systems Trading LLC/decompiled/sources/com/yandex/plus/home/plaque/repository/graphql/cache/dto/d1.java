package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class d1 implements k1 {

    @NotNull
    public static final c1 Companion = new c1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;

    public /* synthetic */ d1(int i, String str, String str2, String str3, String str4, Integer num, Integer num2) {
        if (63 != (i & 63)) {
            u7g.V(i, 63, b1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Intrinsics.d(this.a, d1Var.a) && Intrinsics.d(this.b, d1Var.b) && Intrinsics.d(this.c, d1Var.c) && Intrinsics.d(this.d, d1Var.d) && Intrinsics.d(this.e, d1Var.e) && Intrinsics.d(this.f, d1Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int c = k5r.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        int hashCode3 = (c + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Image(color=" + this.a + ", metaColor=" + this.b + ", verticalAlignment=" + this.c + ", imageTag=" + this.d + ", width=" + this.e + ", height=" + this.f + ')';
    }

    public d1(String str, String str2, String str3, String str4, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = num2;
    }
}
