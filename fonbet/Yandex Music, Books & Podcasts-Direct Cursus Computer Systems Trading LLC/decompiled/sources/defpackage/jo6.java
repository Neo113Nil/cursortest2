package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jo6 {
    public final ed5 a;
    public final mqs b;

    public jo6(ed5 ed5Var, mqs mqsVar) {
        ed5Var.getClass();
        this.a = ed5Var;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo6)) {
            return false;
        }
        jo6 jo6Var = (jo6) obj;
        return Intrinsics.d(this.a, jo6Var.a) && this.b.equals(jo6Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CoverTrackItem(uiData=" + this.a + ", track=" + this.b + ")";
    }
}
