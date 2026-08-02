package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xik implements ajk {
    public final i3n a;
    public final boolean b;

    public xik(e3n e3nVar) {
        this.a = e3nVar;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xik)) {
            return false;
        }
        xik xikVar = (xik) obj;
        return Intrinsics.d(this.a, xikVar.a) && this.b == xikVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(blockState=" + this.a + ", isPromoCodeAvailable=" + this.b + ")";
    }

    public xik(i3n i3nVar, boolean z) {
        this.a = i3nVar;
        this.b = z;
    }
}
