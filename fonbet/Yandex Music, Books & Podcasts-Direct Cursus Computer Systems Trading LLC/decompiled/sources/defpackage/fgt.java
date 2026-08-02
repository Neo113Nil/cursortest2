package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fgt implements fht {
    public final String a;
    public final boolean b;

    public fgt(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgt)) {
            return false;
        }
        fgt fgtVar = (fgt) obj;
        return Intrinsics.d(this.a, fgtVar.a) && this.b == fgtVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return v3w.e("Placeholder(title=", this.a, ", isLoading=", ")", this.b);
    }
}
