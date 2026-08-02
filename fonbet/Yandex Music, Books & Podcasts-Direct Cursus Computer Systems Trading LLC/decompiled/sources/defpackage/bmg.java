package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class bmg {

    @NotNull
    public static final zlg Companion = new zlg();
    public static final arf[] d = {null, null, btf.a(bwf.b, new hjg(24))};
    public final String a;
    public final String b;
    public final amg c;

    public /* synthetic */ bmg(int i, String str, String str2, amg amgVar) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, ylg.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = amgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmg)) {
            return false;
        }
        bmg bmgVar = (bmg) obj;
        return Intrinsics.d(this.a, bmgVar.a) && Intrinsics.d(this.b, bmgVar.b) && this.c == bmgVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LocalPlusState(balance=" + this.a + ", currency=" + this.b + ", status=" + this.c + ')';
    }

    public bmg(String str, String str2, amg amgVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = amgVar;
    }
}
