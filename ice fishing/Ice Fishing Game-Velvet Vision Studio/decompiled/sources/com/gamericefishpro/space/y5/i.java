package com.gamericefishpro.space.y5;

import com.gamericefishpro.space.fa.m;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.ph.g0;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final String a;
    public final Object b;
    public final Set c;
    public final Set d;

    public i(String name, Map columns, AbstractSet foreignKeys, AbstractSet abstractSet) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.a = name;
        this.b = columns;
        this.c = foreignKeys;
        this.d = abstractSet;
    }

    public static final i a(com.gamericefishpro.space.e6.c database, String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return d5.R(new com.gamericefishpro.space.v5.a(database), tableName);
    }

    public final boolean equals(Object obj) {
        Set set;
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.a.equals(iVar.a) || !this.b.equals(iVar.b) || !Intrinsics.a(this.c, iVar.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = iVar.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        Collection collectionI;
        Intrinsics.checkNotNullParameter(this, "<this>");
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(com.gamericefishpro.space.u6.f.v(CollectionsKt.I(this.b.values(), new m(7))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(com.gamericefishpro.space.u6.f.v(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        if (set == null || (collectionI = CollectionsKt.I(set, new m(8))) == null) {
            collectionI = g0.d;
        }
        sb.append(com.gamericefishpro.space.u6.f.v(collectionI));
        sb.append("\n            |}\n        ");
        return com.gamericefishpro.space.mi.h.d(sb.toString());
    }
}
