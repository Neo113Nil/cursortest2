package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class uim {
    public final String a;
    public final pxs b;
    public final gy1 c;

    public uim(String str, pxs pxsVar, gy1 gy1Var) {
        gy1Var.getClass();
        this.a = str;
        this.b = pxsVar;
        this.c = gy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uim)) {
            return false;
        }
        uim uimVar = (uim) obj;
        return Intrinsics.d(this.a, uimVar.a) && Intrinsics.d(this.b, uimVar.b) && this.c == uimVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        pxs pxsVar = this.b;
        return this.c.hashCode() + ((hashCode + (pxsVar != null ? pxsVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PreFetchMeta(trackTitle=" + this.a + ", loudnessMeta=" + this.b + ", audioResource=" + this.c + ")";
    }
}
