package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pr6 implements rr6 {
    public final cvl a;
    public final boolean b;

    public pr6(cvl cvlVar, boolean z) {
        cvlVar.getClass();
        this.a = cvlVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr6)) {
            return false;
        }
        pr6 pr6Var = (pr6) obj;
        return Intrinsics.d(this.a, pr6Var.a) && this.b == pr6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Completed(playlist=" + this.a + ", isNewPlaylist=" + this.b + ")";
    }
}
