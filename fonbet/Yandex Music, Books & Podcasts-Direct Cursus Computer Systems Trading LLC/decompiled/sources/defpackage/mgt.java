package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mgt implements zgt {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public mgt(String str, String str2, String str3, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgt)) {
            return false;
        }
        mgt mgtVar = (mgt) obj;
        return Intrinsics.d(this.a, mgtVar.a) && Intrinsics.d(this.b, mgtVar.b) && this.c == mgtVar.c && Intrinsics.d(this.d, mgtVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Success(text=", this.a, ", buttonText=", this.b, ", isPlusButton=");
        m.append(this.c);
        m.append(", deeplink=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
