package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class pe7 extends kb6 {

    @NotNull
    public static final oe7 Companion = new oe7();
    public final String a;
    public final String b;

    public pe7(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, ne7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pe7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        pe7 pe7Var = (pe7) obj;
        return Intrinsics.d(this.a, pe7Var.a) && Intrinsics.d(this.b, pe7Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return hrg.s("DebugContent(message='", this.a, "', details=", this.b, ")");
    }

    public pe7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
