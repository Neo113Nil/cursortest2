package com.gamericefishpro.space.y5;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public h(String name, boolean z, List columns, List orders) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.a = name;
        this.b = z;
        this.c = columns;
        this.d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                orders.add("ASC");
            }
        }
        this.d = orders;
    }

    public final boolean equals(Object obj) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = hVar.a;
        if (this.b != hVar.b || !Intrinsics.a(this.c, hVar.c) || !Intrinsics.a(this.d, hVar.d)) {
            return false;
        }
        String str2 = this.a;
        return kotlin.text.d.j(str2, "index_") ? kotlin.text.d.j(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((((kotlin.text.d.j(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        com.gamericefishpro.space.mi.h.b(CollectionsKt.A(this.c, ",", null, null, null, 62));
        com.gamericefishpro.space.mi.h.b("},");
        Unit unit = Unit.a;
        sb.append(unit);
        sb.append("\n            |   orders = {");
        com.gamericefishpro.space.mi.h.b(CollectionsKt.A(this.d, ",", null, null, null, 62));
        com.gamericefishpro.space.mi.h.b(" }");
        sb.append(unit);
        sb.append("\n            |}\n        ");
        return com.gamericefishpro.space.mi.h.b(com.gamericefishpro.space.mi.h.d(sb.toString()));
    }
}
