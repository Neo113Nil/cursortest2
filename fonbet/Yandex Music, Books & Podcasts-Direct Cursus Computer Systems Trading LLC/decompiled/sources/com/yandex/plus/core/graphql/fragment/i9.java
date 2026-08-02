package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class i9 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public i9(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9)) {
            return false;
        }
        i9 i9Var = (i9) obj;
        return this.a.equals(i9Var.a) && this.b.equals(i9Var.b) && this.c.equals(i9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutFragment(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", sectionGroups=");
        return k5r.o(sb, this.c, ')');
    }
}
