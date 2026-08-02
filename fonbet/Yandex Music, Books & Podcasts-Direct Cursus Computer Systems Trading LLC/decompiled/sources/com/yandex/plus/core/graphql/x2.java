package com.yandex.plus.core.graphql;

import defpackage.dfi;
import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class x2 {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;

    public x2(ArrayList arrayList, ArrayList arrayList2, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return this.a == x2Var.a && this.b.equals(x2Var.b) && this.c.equals(x2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dfi.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Family(capacity=");
        sb.append(this.a);
        sb.append(", invitations=");
        sb.append(this.b);
        sb.append(", members=");
        return k5r.o(sb, this.c, ')');
    }
}
