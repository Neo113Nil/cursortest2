package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bh5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bh5(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh5)) {
            return false;
        }
        bh5 bh5Var = (bh5) obj;
        return Intrinsics.d(this.a, bh5Var.a) && Intrinsics.d(this.b, bh5Var.b) && Intrinsics.d(this.c, bh5Var.c) && Intrinsics.d(this.d, bh5Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return ouj.q(f1d.m("Theme(titleColor=", this.a, ", subtitleColor=", this.b, ", bgColor="), this.c, ", bgUrl=", this.d, ")");
    }
}
