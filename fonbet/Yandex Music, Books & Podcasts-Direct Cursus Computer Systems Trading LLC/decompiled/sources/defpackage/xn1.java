package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xn1 {
    public final String a;
    public final v9b b;
    public final v9b c;
    public final String d;
    public final String e;
    public final boolean f;

    public xn1(String str, v9b v9bVar, v9b v9bVar2, String str2, String str3, boolean z) {
        str.getClass();
        this.a = str;
        this.b = v9bVar;
        this.c = v9bVar2;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn1)) {
            return false;
        }
        xn1 xn1Var = (xn1) obj;
        return Intrinsics.d(this.a, xn1Var.a) && Intrinsics.d(this.b, xn1Var.b) && Intrinsics.d(this.c, xn1Var.c) && Intrinsics.d(this.d, xn1Var.d) && Intrinsics.d(this.e, xn1Var.e) && this.f == xn1Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v9b v9bVar = this.b;
        int hashCode2 = (hashCode + (v9bVar == null ? 0 : v9bVar.hashCode())) * 31;
        v9b v9bVar2 = this.c;
        int hashCode3 = (hashCode2 + (v9bVar2 == null ? 0 : v9bVar2.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ArtistsInfoUiData(name=" + this.a + ", darkThemeCoverUiData=" + this.b + ", lightThemeCoverUiData=" + this.c + ", description=" + this.d + ", countListeners=" + this.e + ", isLiked=" + this.f + ")";
    }
}
