package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zsi implements eti {
    public final raj a;
    public final oq b;
    public final mqs c;

    public zsi(raj rajVar, oq oqVar, mqs mqsVar) {
        this.a = rajVar;
        this.b = oqVar;
        this.c = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsi)) {
            return false;
        }
        zsi zsiVar = (zsi) obj;
        return this.a.equals(zsiVar.a) && this.b.equals(zsiVar.b) && Intrinsics.d(this.c, zsiVar.c);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b.a);
        mqs mqsVar = this.c;
        return c + (mqsVar == null ? 0 : mqsVar.a.hashCode());
    }

    public final String toString() {
        return "Book(uiData=" + this.a + ", album=" + this.b + ", track=" + this.c + ")";
    }
}
