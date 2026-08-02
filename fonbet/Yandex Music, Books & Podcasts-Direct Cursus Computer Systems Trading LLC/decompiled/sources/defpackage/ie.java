package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ie {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public ie(String str, String str2, String str3, String str4, String str5, boolean z) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie)) {
            return false;
        }
        ie ieVar = (ie) obj;
        return this.a.equals(ieVar.a) && this.b.equals(ieVar.b) && Intrinsics.d(this.c, ieVar.c) && Intrinsics.d(this.d, ieVar.d) && this.e.equals(ieVar.e) && this.f == ieVar.f;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + k5r.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ActionBarButtonUiData(id=", this.a, ", title=", this.b, ", coverUrl=");
        su4.v(m, this.c, ", deeplink=", this.d, ", anchorId=");
        m.append(this.e);
        m.append(", hasNotification=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
