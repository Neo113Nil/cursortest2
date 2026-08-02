package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yel {
    public final zel a;
    public final vbn b;

    public yel(zel zelVar, vbn vbnVar) {
        vbnVar.getClass();
        this.a = zelVar;
        this.b = vbnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yel)) {
            return false;
        }
        yel yelVar = (yel) obj;
        return this.a.equals(yelVar.a) && Intrinsics.d(this.b, yelVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AppState(conditions=" + this.a + ", snapshot=" + this.b + ")";
    }
}
