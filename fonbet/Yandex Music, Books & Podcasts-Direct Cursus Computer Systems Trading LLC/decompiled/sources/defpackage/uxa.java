package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uxa {
    public final String a;
    public final String b;
    public final String c;
    public final gxa d;

    public uxa(String str, String str2, String str3, gxa gxaVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gxaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxa)) {
            return false;
        }
        uxa uxaVar = (uxa) obj;
        return Intrinsics.d(this.a, uxaVar.a) && Intrinsics.d(this.b, uxaVar.b) && Intrinsics.d(this.c, uxaVar.c) && Intrinsics.d(this.d, uxaVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        gxa gxaVar = this.d;
        return hashCode3 + (gxaVar != null ? gxaVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Simple(title=", this.a, ", subtitle=", this.b, ", imageUrl=");
        m.append(this.c);
        m.append(", action=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
