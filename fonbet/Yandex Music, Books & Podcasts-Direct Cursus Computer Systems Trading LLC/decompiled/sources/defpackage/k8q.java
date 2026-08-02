package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k8q {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final j8q e;
    public final ArrayList f;
    public final boolean g;
    public final boolean h;

    public k8q(String str, String str2, String str3, ArrayList arrayList, j8q j8qVar, ArrayList arrayList2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = j8qVar;
        this.f = arrayList2;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8q)) {
            return false;
        }
        k8q k8qVar = (k8q) obj;
        return this.a.equals(k8qVar.a) && this.b.equals(k8qVar.b) && this.c.equals(k8qVar.c) && Intrinsics.d(this.d, k8qVar.d) && Intrinsics.d(this.e, k8qVar.e) && this.f.equals(k8qVar.f) && this.g == k8qVar.g && this.h == k8qVar.h;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        List list = this.d;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        j8q j8qVar = this.e;
        return Boolean.hashCode(this.h) + k5r.e(dfi.b(this.f, (hashCode + (j8qVar != null ? j8qVar.a.hashCode() : 0)) * 31, 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder m = f1d.m("SharedSearchResult(query=", this.a, ", text=", this.b, ", searchRequestId=");
        m.append(this.c);
        m.append(", filters=");
        m.append(this.d);
        m.append(", misspell=");
        m.append(this.e);
        m.append(", items=");
        m.append(this.f);
        m.append(", hasMore=");
        return v3w.g(m, this.g, ", hasBestResults=", this.h, ")");
    }
}
