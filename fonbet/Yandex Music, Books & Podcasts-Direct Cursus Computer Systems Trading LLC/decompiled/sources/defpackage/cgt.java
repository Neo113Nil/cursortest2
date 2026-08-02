package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cgt extends cht {
    public final String a;
    public final boolean b;

    public cgt(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgt)) {
            return false;
        }
        cgt cgtVar = (cgt) obj;
        return Intrinsics.d(this.a, cgtVar.a) && this.b == cgtVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return v3w.e("Placeholder(blockTitle=", this.a, ", isLoading=", ")", this.b);
    }
}
