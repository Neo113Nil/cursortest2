package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k6 {
    public final String a;
    public final h6 b;
    public final List c;
    public final ArrayList d;

    public k6(String str, h6 h6Var, List list, ArrayList arrayList) {
        this.a = str;
        this.b = h6Var;
        this.c = list;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return Intrinsics.d(this.a, k6Var.a) && Intrinsics.d(this.b, k6Var.b) && Intrinsics.d(this.c, k6Var.c) && this.d.equals(k6Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        h6 h6Var = this.b;
        int hashCode2 = (hashCode + (h6Var == null ? 0 : h6Var.hashCode())) * 31;
        List list = this.c;
        return this.d.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Popup(textColor=");
        sb.append(this.a);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", commonOverlays=");
        sb.append(this.c);
        sb.append(", buttons=");
        return k5r.o(sb, this.d, ')');
    }
}
