package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cti implements eti {
    public final raj a;
    public final oq b;
    public final mqs c;

    public cti(raj rajVar, oq oqVar, mqs mqsVar) {
        mqsVar.getClass();
        this.a = rajVar;
        this.b = oqVar;
        this.c = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cti)) {
            return false;
        }
        cti ctiVar = (cti) obj;
        return this.a.equals(ctiVar.a) && this.b.equals(ctiVar.b) && Intrinsics.d(this.c, ctiVar.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "Podcast(uiData=" + this.a + ", album=" + this.b + ", track=" + this.c + ")";
    }
}
