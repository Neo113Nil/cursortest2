package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nk1 {
    public final po6 a;
    public final mqs b;

    public nk1(po6 po6Var, mqs mqsVar) {
        po6Var.getClass();
        mqsVar.getClass();
        this.a = po6Var;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk1)) {
            return false;
        }
        nk1 nk1Var = (nk1) obj;
        return Intrinsics.d(this.a, nk1Var.a) && Intrinsics.d(this.b, nk1Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistTrackUiData(uiData=" + this.a + ", track=" + this.b + ")";
    }
}
