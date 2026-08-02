package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class usi implements xsi {
    public final oq a;
    public final mqs b;

    public usi(oq oqVar, mqs mqsVar) {
        this.a = oqVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usi)) {
            return false;
        }
        usi usiVar = (usi) obj;
        return this.a.equals(usiVar.a) && Intrinsics.d(this.b, usiVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        mqs mqsVar = this.b;
        return hashCode + (mqsVar == null ? 0 : mqsVar.a.hashCode());
    }

    public final String toString() {
        return "Album(album=" + this.a + ", track=" + this.b + ")";
    }
}
