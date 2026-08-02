package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class ke7 extends md {

    @NotNull
    public static final je7 Companion = new je7();
    public final String a;
    public final String b;
    public final String c;

    public ke7(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, ie7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ke7.class != obj.getClass()) {
            return false;
        }
        ke7 ke7Var = (ke7) obj;
        return Intrinsics.d(this.a, ke7Var.a) && Intrinsics.d(this.b, ke7Var.b) && Intrinsics.d(this.c, ke7Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int c = k5r.c((str != null ? str.hashCode() : 0) * 31, 31, this.b);
        String str2 = this.c;
        return c + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return su4.o(f1d.m("DebugAction(type=", this.a, ", message=", this.b, ", details="), this.c, ")");
    }

    public ke7(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
