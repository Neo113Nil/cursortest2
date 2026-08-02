package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fzc {
    public final String a;
    public final boolean b;

    public fzc(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzc)) {
            return false;
        }
        fzc fzcVar = (fzc) obj;
        return Intrinsics.d(this.a, fzcVar.a) && this.b == fzcVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(24026391) + k5r.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return v3w.e("FunnelSettings(userId=", this.a, ", subscribed=", ", appVersionCode=24026391)", this.b);
    }
}
