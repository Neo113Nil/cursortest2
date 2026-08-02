package com.yandex.plus.acquisition.sdk.pay.common.api;

import defpackage.dfi;
import defpackage.k5r;

/* loaded from: classes4.dex */
public final class i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public i(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b) && this.c.equals(iVar.c) && this.d.equals(iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompositeProductTexts(name=");
        sb.append(this.a);
        sb.append(", introductoryText=");
        sb.append(this.b);
        sb.append(", priceText=");
        sb.append(this.c);
        sb.append(", iconLink=");
        return dfi.i(sb, this.d, ')');
    }
}
