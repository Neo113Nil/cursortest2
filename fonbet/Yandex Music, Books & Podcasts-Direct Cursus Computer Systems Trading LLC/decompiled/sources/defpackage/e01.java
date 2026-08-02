package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e01 {
    public final u51 a;
    public final String b;
    public final u9b c;
    public final p43 d;

    public e01(u51 u51Var, String str, u9b u9bVar, p43 p43Var) {
        this.a = u51Var;
        this.b = str;
        this.c = u9bVar;
        this.d = p43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e01)) {
            return false;
        }
        e01 e01Var = (e01) obj;
        return this.a.equals(e01Var.a) && Intrinsics.d(this.b, e01Var.b) && this.c.equals(e01Var.c) && Intrinsics.d(this.d, e01Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        p43 p43Var = this.d;
        return hashCode2 + (p43Var != null ? p43Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "ArtistAboutBlockData(artist=" + this.a + ", description=" + this.b + ", cover=" + this.c + ", analytics=" + this.d + ")";
    }
}
