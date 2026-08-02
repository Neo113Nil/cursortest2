package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j3m extends k3m {
    public final String a;
    public final List b;
    public final boolean c;

    public j3m(String str, List list, boolean z) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static j3m b(j3m j3mVar, ArrayList arrayList, boolean z, int i) {
        String str = j3mVar.a;
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = j3mVar.b;
        }
        j3mVar.getClass();
        str.getClass();
        return new j3m(str, arrayList2, z);
    }

    @Override // defpackage.k3m
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3m)) {
            return false;
        }
        j3m j3mVar = (j3m) obj;
        return Intrinsics.d(this.a, j3mVar.a) && this.b.equals(j3mVar.b) && this.c == j3mVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(ouj.v("Success(screenTitle=", this.a, ", tracks=", ", hasUnsavedChanges=", this.b), this.c, ")");
    }
}
