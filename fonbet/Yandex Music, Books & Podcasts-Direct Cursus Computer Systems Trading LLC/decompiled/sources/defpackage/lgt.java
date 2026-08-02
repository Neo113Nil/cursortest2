package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class lgt implements lht {
    public final String a;
    public final boolean b;

    public lgt(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgt)) {
            return false;
        }
        lgt lgtVar = (lgt) obj;
        return Intrinsics.d(this.a, lgtVar.a) && this.b == lgtVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("Placeholder(id=", this.a, ", isLoading=", ")", this.b);
    }
}
