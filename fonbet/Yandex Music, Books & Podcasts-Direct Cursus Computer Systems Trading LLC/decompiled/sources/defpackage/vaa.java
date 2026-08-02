package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vaa {
    public final oq4 a;
    public final int b;
    public final String c;
    public final bb6 d;
    public final Boolean e;

    public vaa(oq4 oq4Var, int i, String str, bb6 bb6Var, Boolean bool) {
        this.a = oq4Var;
        this.b = i;
        this.c = str;
        this.d = bb6Var;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaa)) {
            return false;
        }
        vaa vaaVar = (vaa) obj;
        return this.a == vaaVar.a && this.b == vaaVar.b && this.c.equals(vaaVar.c) && this.d == vaaVar.d && Intrinsics.d(this.e, vaaVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + k5r.c(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31;
        Boolean bool = this.e;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "DownloadInfo(codec=" + this.a + ", bitrate=" + this.b + ", url=" + this.c + ", container=" + this.d + ", gain=" + this.e + ")";
    }
}
