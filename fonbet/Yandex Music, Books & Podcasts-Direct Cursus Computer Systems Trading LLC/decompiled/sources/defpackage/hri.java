package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hri implements kri {
    public final cvl a;
    public final mqs b;

    public hri(cvl cvlVar, mqs mqsVar) {
        cvlVar.getClass();
        this.a = cvlVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hri)) {
            return false;
        }
        hri hriVar = (hri) obj;
        return Intrinsics.d(this.a, hriVar.a) && this.b.equals(hriVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistItem(playlist=" + this.a + ", track=" + this.b + ")";
    }
}
