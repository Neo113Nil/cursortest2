package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hir extends hdg {
    public final String d;
    public final boolean e;

    public hir(String str, boolean z) {
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.hdg
    public final String X() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hir)) {
            return false;
        }
        hir hirVar = (hir) obj;
        return Intrinsics.d(this.d, hirVar.d) && this.e == hirVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BooleanStoredValue(name=");
        sb.append(this.d);
        sb.append(", value=");
        return dfi.j(sb, this.e, ')');
    }
}
