package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;

    public xf(String str, String str2, String str3, String str4, Integer num, Integer num2) {
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
        if (!(obj instanceof xf)) {
            return false;
        }
        xf xfVar = (xf) obj;
        return Intrinsics.d(this.a, xfVar.a) && Intrinsics.d(this.b, xfVar.b) && Intrinsics.d(this.c, xfVar.c) && this.d.equals(xfVar.d) && Intrinsics.d(this.e, xfVar.e) && Intrinsics.d(this.f, xfVar.f);
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
        return "PlaqueImageProperty(color=" + this.a + ", metaColor=" + this.b + ", verticalAlignment=" + this.c + ", imageTag=" + this.d + ", width=" + this.e + ", height=" + this.f + ')';
    }
}
