package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class io6 {
    public final po6 a;
    public final mqs b;

    public io6(po6 po6Var, mqs mqsVar) {
        mqsVar.getClass();
        this.a = po6Var;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io6)) {
            return false;
        }
        io6 io6Var = (io6) obj;
        return this.a.equals(io6Var.a) && Intrinsics.d(this.b, io6Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CoverTrackItem(uiData=" + this.a + ", track=" + this.b + ")";
    }
}
