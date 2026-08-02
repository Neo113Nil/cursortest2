package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class uh6 implements xh6 {
    public final cvl a;
    public final mqs b;

    public uh6(cvl cvlVar, mqs mqsVar) {
        cvlVar.getClass();
        this.a = cvlVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh6)) {
            return false;
        }
        uh6 uh6Var = (uh6) obj;
        return Intrinsics.d(this.a, uh6Var.a) && this.b.equals(uh6Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistItem(playlist=" + this.a + ", track=" + this.b + ")";
    }
}
