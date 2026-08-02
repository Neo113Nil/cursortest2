package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mk1 {
    public final po6 a;
    public final mqs b;

    public mk1(po6 po6Var, mqs mqsVar) {
        po6Var.getClass();
        mqsVar.getClass();
        this.a = po6Var;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk1)) {
            return false;
        }
        mk1 mk1Var = (mk1) obj;
        return Intrinsics.d(this.a, mk1Var.a) && Intrinsics.d(this.b, mk1Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistTrackUiData(uiData=" + this.a + ", track=" + this.b + ")";
    }
}
