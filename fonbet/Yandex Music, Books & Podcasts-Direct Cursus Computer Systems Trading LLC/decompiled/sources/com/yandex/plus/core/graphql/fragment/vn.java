package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class vn {
    public final String a;
    public final ArrayList b;

    public vn(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn)) {
            return false;
        }
        vn vnVar = (vn) obj;
        return this.a.equals(vnVar.a) && this.b.equals(vnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnServiceSpecificCrossAction(type=");
        sb.append(this.a);
        sb.append(", params=");
        return k5r.o(sb, this.b, ')');
    }
}
