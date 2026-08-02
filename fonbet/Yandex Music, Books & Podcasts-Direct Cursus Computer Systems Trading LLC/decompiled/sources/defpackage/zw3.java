package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zw3 {
    public final String a;
    public final String b;
    public final ox6 c;

    public zw3(String str, String str2, ox6 ox6Var) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = ox6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw3)) {
            return false;
        }
        zw3 zw3Var = (zw3) obj;
        return Intrinsics.d(this.a, zw3Var.a) && Intrinsics.d(this.b, zw3Var.b) && Intrinsics.d(this.c, zw3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ox6 ox6Var = this.c;
        return hashCode2 + (ox6Var != null ? ox6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("CardModel(backgroundUrl=", this.a, ", backgroundImageDescription=", this.b, ", bottomButtonContent=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
