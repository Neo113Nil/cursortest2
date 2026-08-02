package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c84 {
    public final List a;
    public final vyb b;
    public final boolean c;
    public final boolean d;

    public c84(List list, vyb vybVar, boolean z, boolean z2) {
        list.getClass();
        this.a = list;
        this.b = vybVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c84)) {
            return false;
        }
        c84 c84Var = (c84) obj;
        return Intrinsics.d(this.a, c84Var.a) && Intrinsics.d(this.b, c84Var.b) && this.c == c84Var.c && this.d == c84Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vyb vybVar = this.b;
        return Boolean.hashCode(this.d) + k5r.e((hashCode + (vybVar == null ? 0 : vybVar.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CastPickerUiState(items=");
        sb.append(this.a);
        sb.append(", explanation=");
        sb.append(this.b);
        sb.append(", isFeedbackButtonVisible=");
        return v3w.g(sb, this.c, ", isEasyLoginKPButtonVisible=", this.d, ")");
    }
}
