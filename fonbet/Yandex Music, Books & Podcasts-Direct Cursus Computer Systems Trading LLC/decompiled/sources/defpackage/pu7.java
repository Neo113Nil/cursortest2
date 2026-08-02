package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pu7 {
    public final List a;
    public final String b;

    public pu7(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu7)) {
            return false;
        }
        pu7 pu7Var = (pu7) obj;
        return this.a.equals(pu7Var.a) && Intrinsics.d(this.b, pu7Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeferredFragmentIdentifier(path=");
        sb.append(this.a);
        sb.append(", label=");
        return dfi.i(sb, this.b, ')');
    }
}
