package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n7g extends p7g {
    public final String a;
    public final hds b;

    public n7g(String str, hds hdsVar) {
        this.a = str;
        this.b = hdsVar;
    }

    @Override // defpackage.p7g
    public final hds a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7g)) {
            return false;
        }
        n7g n7gVar = (n7g) obj;
        return this.a.equals(n7gVar.a) && Intrinsics.d(this.b, n7gVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hds hdsVar = this.b;
        return (hashCode + (hdsVar != null ? hdsVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return dfi.i(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
    }
}
