package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lk1 {
    public final po6 a;
    public final mqs b;

    public lk1(po6 po6Var, mqs mqsVar) {
        mqsVar.getClass();
        this.a = po6Var;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk1)) {
            return false;
        }
        lk1 lk1Var = (lk1) obj;
        return this.a.equals(lk1Var.a) && Intrinsics.d(this.b, lk1Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistTrackListItem(uiData=" + this.a + ", track=" + this.b + ")";
    }
}
