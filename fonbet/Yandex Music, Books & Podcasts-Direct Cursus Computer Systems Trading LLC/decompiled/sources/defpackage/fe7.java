package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class fe7 extends md {

    @NotNull
    public static final ee7 Companion = new ee7();
    public static final arf[] d = {btf.a(bwf.b, new cp5(28)), null, null};
    public final md a;
    public final String b;
    public final int c;

    public fe7(int i, md mdVar, String str, int i2) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, de7.a.getDescriptor());
            throw null;
        }
        this.a = mdVar;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe7)) {
            return false;
        }
        fe7 fe7Var = (fe7) obj;
        return Intrinsics.d(this.a, fe7Var.a) && Intrinsics.d(this.b, fe7Var.b) && this.c == fe7Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebounceAction(action=");
        sb.append(this.a);
        sb.append(", debounceId=");
        sb.append(this.b);
        sb.append(", debounceMillis=");
        return vz1.r(sb, this.c, ')');
    }
}
