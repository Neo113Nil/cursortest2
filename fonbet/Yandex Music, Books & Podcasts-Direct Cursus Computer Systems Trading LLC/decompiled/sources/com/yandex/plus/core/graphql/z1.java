package com.yandex.plus.core.graphql;

import defpackage.k5r;
import defpackage.q6n;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class z1 implements q6n {
    public final ArrayList a;
    public final ArrayList b;

    public z1(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.a.equals(z1Var.a) && this.b.equals(z1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(sections=");
        sb.append(this.a);
        sb.append(", darkSections=");
        return k5r.o(sb, this.b, ')');
    }
}
