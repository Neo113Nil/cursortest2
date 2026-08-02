package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n3 implements o3 {
    public final String a;
    public final kbj b;
    public final String c;
    public final lt d;
    public final mwk e;

    public n3(String str, kbj kbjVar, String str2, lt ltVar, mwk mwkVar) {
        kbjVar.getClass();
        str2.getClass();
        ltVar.getClass();
        this.a = str;
        this.b = kbjVar;
        this.c = str2;
        this.d = ltVar;
        this.e = mwkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return Intrinsics.d(this.a, n3Var.a) && Intrinsics.d(this.b, n3Var.b) && Intrinsics.d(this.c, n3Var.c) && Intrinsics.d(this.d, n3Var.d) && this.e.equals(n3Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        return this.e.hashCode() + ((this.d.hashCode() + k5r.c((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "Success(title=" + this.a + ", uiData=" + this.b + ", description=" + this.c + ", albumDomainItem=" + this.d + ", playable=" + this.e + ")";
    }
}
