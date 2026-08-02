package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f2s {
    public final String a;
    public final Object b;
    public final Set c;
    public final Set d;

    public f2s(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2s)) {
            return false;
        }
        f2s f2sVar = (f2s) obj;
        if (!this.a.equals(f2sVar.a) || !this.b.equals(f2sVar.b) || !Intrinsics.d(this.c, f2sVar.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = f2sVar.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(gdg.w(CollectionsKt.o0(this.b.values(), new t1n(6))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(gdg.w(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        if (set == null || (collection = CollectionsKt.o0(set, new t1n(7))) == null) {
            collection = c5b.a;
        }
        sb.append(gdg.w(collection));
        sb.append("\n            |}\n        ");
        return hlr.e(sb.toString());
    }
}
