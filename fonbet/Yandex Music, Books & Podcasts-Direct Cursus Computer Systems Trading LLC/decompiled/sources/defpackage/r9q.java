package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r9q implements s9q {
    public final iow a;
    public final List b;
    public final c5b c;

    public r9q(iow iowVar, List list) {
        list.getClass();
        this.a = iowVar;
        this.b = list;
        this.c = c5b.a;
    }

    @Override // defpackage.f5q
    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9q)) {
            return false;
        }
        r9q r9qVar = (r9q) obj;
        return this.a == r9qVar.a && Intrinsics.d(this.b, r9qVar.b);
    }

    @Override // defpackage.f5q
    public final String getDescription() {
        return "";
    }

    @Override // defpackage.u3q
    public final /* bridge */ /* synthetic */ a0q getId() {
        return y9q.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return dfi.c(this.b.size(), "VariousEntity(size=", ")");
    }

    @Override // defpackage.f5q, defpackage.u3q
    public final /* bridge */ /* synthetic */ aaq getId() {
        return y9q.a;
    }
}
