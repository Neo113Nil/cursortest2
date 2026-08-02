package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vvd {
    public final String a;
    public final String b;

    public vvd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvd)) {
            return false;
        }
        vvd vvdVar = (vvd) obj;
        return this.a.equals(vvdVar.a) && Intrinsics.d(this.b, vvdVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("HeaderUiState(title=", this.a, ", description=", this.b, ")");
    }
}
