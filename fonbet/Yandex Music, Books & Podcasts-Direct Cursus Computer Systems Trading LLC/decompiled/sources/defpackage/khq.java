package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class khq {
    public final po6 a;
    public final mqs b;

    public khq(po6 po6Var, mqs mqsVar) {
        po6Var.getClass();
        mqsVar.getClass();
        this.a = po6Var;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khq)) {
            return false;
        }
        khq khqVar = (khq) obj;
        return Intrinsics.d(this.a, khqVar.a) && Intrinsics.d(this.b, khqVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimilarTrackItem(uiData=" + this.a + ", track=" + this.b + ")";
    }
}
