package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vyb {
    public final String a;
    public final String b;
    public final String c;

    public vyb(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyb)) {
            return false;
        }
        vyb vybVar = (vyb) obj;
        return Intrinsics.d(this.a, vybVar.a) && Intrinsics.d(this.b, vybVar.b) && Intrinsics.d(this.c, vybVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return su4.o(f1d.m("ExplanationUiState(iconRes=null, title=", this.a, ", subtitle=", this.b, ", buttonText="), this.c, ")");
    }
}
