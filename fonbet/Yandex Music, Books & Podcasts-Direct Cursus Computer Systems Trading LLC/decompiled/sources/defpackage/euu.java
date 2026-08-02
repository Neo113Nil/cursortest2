package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class euu {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public euu(String str, String str2, String str3, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euu)) {
            return false;
        }
        euu euuVar = (euu) obj;
        return Intrinsics.d(this.a, euuVar.a) && Intrinsics.d(this.b, euuVar.b) && Intrinsics.d(this.c, euuVar.c) && d85.c(this.d, euuVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.d) + hashCode3;
    }

    public final String toString() {
        return ouj.q(f1d.m("WaveListItemUiData(title=", this.a, ", subtitle=", this.b, ", coverUrl="), this.c, ", coverBackgroundColor=", d85.i(this.d), ")");
    }
}
