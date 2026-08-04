package com.gamericefishpro.space.y5;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public g(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
        Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
        this.a = referenceTable;
        this.b = onDelete;
        this.c = onUpdate;
        this.d = columnNames;
        this.e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Intrinsics.a(this.a, gVar.a) && Intrinsics.a(this.b, gVar.b) && Intrinsics.a(this.c, gVar.c) && Intrinsics.a(this.d, gVar.d)) {
            return Intrinsics.a(this.e, gVar.e);
        }
        return false;
    }

    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        com.gamericefishpro.space.mi.h.b(CollectionsKt.A(CollectionsKt.H(this.d), ",", null, null, null, 62));
        com.gamericefishpro.space.mi.h.b("},");
        Unit unit = Unit.a;
        sb.append(unit);
        sb.append("\n            |   referenceColumnNames = {");
        com.gamericefishpro.space.mi.h.b(CollectionsKt.A(CollectionsKt.H(this.e), ",", null, null, null, 62));
        com.gamericefishpro.space.mi.h.b(" }");
        sb.append(unit);
        sb.append("\n            |}\n        ");
        return com.gamericefishpro.space.mi.h.b(com.gamericefishpro.space.mi.h.d(sb.toString()));
    }
}
