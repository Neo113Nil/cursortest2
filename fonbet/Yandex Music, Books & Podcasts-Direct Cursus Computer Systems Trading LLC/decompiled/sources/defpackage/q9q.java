package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class q9q implements s9q {
    public final iow a;
    public final cvl b;
    public final List c;
    public final String d;
    public final x9q e;
    public final String f;

    public q9q(iow iowVar, cvl cvlVar, List list, String str) {
        iowVar.getClass();
        cvlVar.getClass();
        list.getClass();
        this.a = iowVar;
        this.b = cvlVar;
        this.c = list;
        this.d = str;
        nvl g = cvlVar.g();
        String str2 = g.b;
        String str3 = g.a;
        this.e = (str == null || StringsKt.U(str)) ? new v9q(str3, str2) : new w9q(str3, str2, str);
        this.f = cvlVar.b;
    }

    @Override // defpackage.f5q
    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9q)) {
            return false;
        }
        q9q q9qVar = (q9q) obj;
        return this.a == q9qVar.a && Intrinsics.d(this.b, q9qVar.b) && Intrinsics.d(this.c, q9qVar.c) && Intrinsics.d(this.d, q9qVar.d);
    }

    @Override // defpackage.f5q
    public final String getDescription() {
        return this.f;
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.e;
    }

    public final int hashCode() {
        int d = k5r.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        cvl cvlVar = this.b;
        return hrg.s("PlaylistEntity(id=", cvlVar.e(), ", title=", cvlVar.b, ")");
    }

    @Override // defpackage.f5q, defpackage.u3q
    public final aaq getId() {
        return this.e;
    }
}
