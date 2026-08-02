package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class duh {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final Set e;

    public duh(String str, String str2, int i, String str3, Set set) {
        str.getClass();
        set.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duh)) {
            return false;
        }
        duh duhVar = (duh) obj;
        return Intrinsics.d(this.a, duhVar.a) && this.b.equals(duhVar.b) && this.c == duhVar.c && Intrinsics.d(this.d, duhVar.d) && Intrinsics.d(this.e, duhVar.e);
    }

    public final int hashCode() {
        int a = f1d.a(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return this.e.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("CallerPackageInfo(name=", this.a, ", packageName=", this.b, ", uid=");
        m.append(this.c);
        m.append(", signature=");
        m.append(this.d);
        m.append(", permissions=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
