package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o7g extends p7g {
    public final String a;
    public final hds b;

    public /* synthetic */ o7g(String str, hds hdsVar, int i) {
        this(str, (i & 2) != 0 ? null : hdsVar);
    }

    @Override // defpackage.p7g
    public final hds a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7g)) {
            return false;
        }
        o7g o7gVar = (o7g) obj;
        return Intrinsics.d(this.a, o7gVar.a) && Intrinsics.d(this.b, o7gVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hds hdsVar = this.b;
        return (hashCode + (hdsVar != null ? hdsVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return dfi.i(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }

    public o7g(String str, hds hdsVar) {
        this.a = str;
        this.b = hdsVar;
    }
}
