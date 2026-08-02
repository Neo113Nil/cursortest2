package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class qhd {
    public static final qhd f = new qhd(null, rhd.e, null, null, null);
    public final String a;
    public final rhd b;
    public final String c;
    public final String d;
    public final String e;

    public qhd(String str, rhd rhdVar, String str2, String str3, String str4) {
        this.a = str;
        this.b = rhdVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean a(qhd qhdVar) {
        qhdVar.getClass();
        String str = null;
        String str2 = this.a;
        if (str2 == null || StringsKt.U(str2)) {
            str2 = null;
        }
        String str3 = qhdVar.a;
        if (str3 != null && !StringsKt.U(str3)) {
            str = str3;
        }
        return Intrinsics.d(str2, str) && this.b == qhdVar.b && Intrinsics.d(this.e, qhdVar.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhd)) {
            return false;
        }
        qhd qhdVar = (qhd) obj;
        return Intrinsics.d(this.a, qhdVar.a) && this.b == qhdVar.b && Intrinsics.d(this.c, qhdVar.c) && Intrinsics.d(this.d, qhdVar.d) && Intrinsics.d(this.e, qhdVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlagolEntityPreview(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", typeRaw=");
        su4.v(sb, this.c, ", description=", this.d, ", radioSessionId=");
        return su4.o(sb, this.e, ")");
    }
}
