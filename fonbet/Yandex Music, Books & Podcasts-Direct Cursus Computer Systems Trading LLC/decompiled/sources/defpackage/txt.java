package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class txt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public txt(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txt)) {
            return false;
        }
        txt txtVar = (txt) obj;
        return Intrinsics.d(this.a, txtVar.a) && Intrinsics.d(this.b, txtVar.b) && this.c.equals(txtVar.c) && Intrinsics.d(this.d, txtVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VariableModel(name=");
        sb.append(this.a);
        sb.append(", path=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", value=");
        return dfi.i(sb, this.d, ')');
    }
}
