package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import defpackage.k5r;

/* loaded from: classes4.dex */
public final class tb {
    public final String a;
    public final String b;
    public final String c;

    public tb(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb)) {
            return false;
        }
        tb tbVar = (tb) obj;
        return this.a.equals(tbVar.a) && this.b.equals(tbVar.b) && this.c.equals(tbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DarkTheme(backgroundColor=");
        sb.append(this.a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", textColor=");
        return dfi.i(sb, this.c, ')');
    }
}
