package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wbk {
    public final String a;
    public final String b;
    public final String c;

    public wbk(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbk)) {
            return false;
        }
        wbk wbkVar = (wbk) obj;
        return this.a.equals(wbkVar.a) && Intrinsics.d(this.b, wbkVar.b) && Intrinsics.d(this.c, wbkVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return su4.o(f1d.m("PayCardContentUiData(artwork=", this.a, ", title=", this.b, ", description="), this.c, ")");
    }
}
