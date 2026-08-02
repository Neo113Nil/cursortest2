package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class asj implements bf5 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final zrj e;
    public final ArrayList f;
    public final boolean g;
    public final boolean h;

    public asj(String str, String str2, String str3, ArrayList arrayList, zrj zrjVar, ArrayList arrayList2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = zrjVar;
        this.f = arrayList2;
        this.g = z;
        this.h = z2;
    }

    @Override // defpackage.bf5
    public final boolean a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asj)) {
            return false;
        }
        asj asjVar = (asj) obj;
        return this.a.equals(asjVar.a) && this.b.equals(asjVar.b) && this.c.equals(asjVar.c) && Intrinsics.d(this.d, asjVar.d) && Intrinsics.d(this.e, asjVar.e) && this.f.equals(asjVar.f) && this.g == asjVar.g && this.h == asjVar.h;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        List list = this.d;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        zrj zrjVar = this.e;
        return Boolean.hashCode(this.h) + k5r.e(dfi.b(this.f, (hashCode + (zrjVar != null ? zrjVar.a.hashCode() : 0)) * 31, 31), 31, this.g);
    }

    @Override // defpackage.bf5
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }

    public final String toString() {
        StringBuilder m = f1d.m("OnlineSearchResult(query=", this.a, ", text=", this.b, ", searchRequestId=");
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
