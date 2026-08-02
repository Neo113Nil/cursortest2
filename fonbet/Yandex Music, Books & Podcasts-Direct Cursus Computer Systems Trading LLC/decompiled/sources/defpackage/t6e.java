package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t6e {
    public final String a;
    public final String b;

    public t6e(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6e)) {
            return false;
        }
        t6e t6eVar = (t6e) obj;
        return Intrinsics.d(this.a, t6eVar.a) && Intrinsics.d(this.b, t6eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpHeader(name=");
        sb.append(this.a);
        sb.append(", value=");
        return dfi.i(sb, this.b, ')');
    }
}
