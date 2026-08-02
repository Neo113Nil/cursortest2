package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fg {
    public final String a;
    public final y8 b;

    public fg(String str, y8 y8Var) {
        str.getClass();
        y8Var.getClass();
        this.a = str;
        this.b = y8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg)) {
            return false;
        }
        fg fgVar = (fg) obj;
        return Intrinsics.areEqual(this.a, fgVar.a) && Intrinsics.areEqual(this.b, fgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.a + ", pushClickEvent=" + this.b + ")";
    }
}
