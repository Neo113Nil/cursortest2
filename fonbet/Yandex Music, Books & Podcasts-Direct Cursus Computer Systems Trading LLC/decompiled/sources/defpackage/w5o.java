package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class w5o {

    @NotNull
    public static final u5o Companion = new u5o();
    public static final arf[] c = {null, btf.a(bwf.b, new e5o(3))};
    public final String a;
    public final v5o b;

    public /* synthetic */ w5o(int i, String str, v5o v5oVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = v5oVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5o)) {
            return false;
        }
        w5o w5oVar = (w5o) obj;
        return Intrinsics.d(this.a, w5oVar.a) && this.b == w5oVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        v5o v5oVar = this.b;
        return hashCode + (v5oVar != null ? v5oVar.hashCode() : 0);
    }

    public final String toString() {
        return "Balance(amount=" + this.a + ", currency=" + this.b + ')';
    }
}
