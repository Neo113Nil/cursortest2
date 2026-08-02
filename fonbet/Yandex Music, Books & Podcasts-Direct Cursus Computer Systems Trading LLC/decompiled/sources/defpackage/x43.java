package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x43 {
    public final cvo a;
    public final int b;

    public x43(cvo cvoVar, int i, int i2) {
        i = (i2 & 2) != 0 ? 0 : i;
        cvoVar.getClass();
        this.a = cvoVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x43)) {
            return false;
        }
        x43 x43Var = (x43) obj;
        return Intrinsics.d(this.a, x43Var.a) && this.b == x43Var.b;
    }

    public final int hashCode() {
        return f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BlockDynamicAnalyticsPayload(screenInfo=" + this.a + ", objectsCount=" + this.b + ", tabInfo=null)";
    }
}
