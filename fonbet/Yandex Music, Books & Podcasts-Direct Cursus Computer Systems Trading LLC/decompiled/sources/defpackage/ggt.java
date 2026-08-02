package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ggt implements ght {
    public final String a;
    public final boolean b;

    public ggt(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggt)) {
            return false;
        }
        ggt ggtVar = (ggt) obj;
        return Intrinsics.d(this.a, ggtVar.a) && this.b == ggtVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return v3w.e("Placeholder(title=", this.a, ", isLoading=", ")", this.b);
    }
}
