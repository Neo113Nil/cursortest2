package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mir extends hdg {
    public final String d;
    public final String e;

    public mir(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.hdg
    public final String X() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mir)) {
            return false;
        }
        mir mirVar = (mir) obj;
        return Intrinsics.d(this.d, mirVar.d) && Intrinsics.d(this.e, mirVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StringStoredValue(name=");
        sb.append(this.d);
        sb.append(", value=");
        return dfi.i(sb, this.e, ')');
    }
}
