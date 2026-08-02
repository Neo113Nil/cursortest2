package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import defpackage.k5r;

/* loaded from: classes4.dex */
public final class ap {
    public final String a;
    public final String b;
    public final String c;

    public ap(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return this.a.equals(apVar.a) && this.b.equals(apVar.b) && this.c.equals(apVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnTextIconProperties(id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", fallbackText=");
        return dfi.i(sb, this.c, ')');
    }
}
