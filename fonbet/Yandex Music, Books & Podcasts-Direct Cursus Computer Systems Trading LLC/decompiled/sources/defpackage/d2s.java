package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d2s {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public d2s(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2s)) {
            return false;
        }
        d2s d2sVar = (d2s) obj;
        if (Intrinsics.d(this.a, d2sVar.a) && Intrinsics.d(this.b, d2sVar.b) && Intrinsics.d(this.c, d2sVar.c) && Intrinsics.d(this.d, d2sVar.d)) {
            return Intrinsics.d(this.e, d2sVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.d(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return hlr.c(hlr.e("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + gdg.H(CollectionsKt.n0(this.d)) + "\n            |   referenceColumnNames = {" + gdg.G(CollectionsKt.n0(this.e)) + "\n            |}\n        "), "    ");
    }
}
