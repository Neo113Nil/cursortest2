package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xpu implements bqu {
    public final String a;
    public final String b;
    public final boolean c;

    public xpu(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpu)) {
            return false;
        }
        xpu xpuVar = (xpu) obj;
        return Intrinsics.d(this.a, xpuVar.a) && this.b.equals(xpuVar.b) && this.c == xpuVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(f1d.m("Invitation(avatarUrl=", this.a, ", name=", this.b, ", isJoiningInProgress="), this.c, ")");
    }
}
