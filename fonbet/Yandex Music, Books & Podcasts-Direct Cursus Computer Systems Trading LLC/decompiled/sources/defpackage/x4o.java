package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class x4o {

    @NotNull
    public static final w4o Companion = new w4o();
    public final String a;
    public final String b;

    public /* synthetic */ x4o(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4o)) {
            return false;
        }
        x4o x4oVar = (x4o) obj;
        return Intrinsics.d(this.a, x4oVar.a) && Intrinsics.d(this.b, x4oVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetricContext(key=");
        sb.append(this.a);
        sb.append(", value=");
        return dfi.i(sb, this.b, ')');
    }
}
