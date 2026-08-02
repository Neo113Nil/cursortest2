package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mx7 {
    public final b7q a;
    public final zvs b;
    public final g7q c;

    public mx7(b7q b7qVar, zvs zvsVar, g7q g7qVar) {
        this.a = b7qVar;
        this.b = zvsVar;
        this.c = g7qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx7)) {
            return false;
        }
        mx7 mx7Var = (mx7) obj;
        return this.a.equals(mx7Var.a) && Intrinsics.d(this.b, mx7Var.b) && Intrinsics.d(this.c, mx7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zvs zvsVar = this.b;
        int hashCode2 = (hashCode + (zvsVar == null ? 0 : zvsVar.a.hashCode())) * 31;
        g7q g7qVar = this.c;
        return hashCode2 + (g7qVar != null ? g7qVar.hashCode() : 0);
    }

    public final String toString() {
        return "DepBox(playerDi=" + this.a + ", trackId=" + this.b + ", stateHolder=" + this.c + ")";
    }
}
