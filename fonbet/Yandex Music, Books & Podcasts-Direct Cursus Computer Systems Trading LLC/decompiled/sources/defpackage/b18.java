package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b18 {
    public final String a;
    public final a18 b;
    public final String c;
    public final o84 d;
    public final boolean e;

    public b18(String str, a18 a18Var, String str2, o84 o84Var, boolean z) {
        str.getClass();
        this.a = str;
        this.b = a18Var;
        this.c = str2;
        this.d = o84Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b18)) {
            return false;
        }
        b18 b18Var = (b18) obj;
        return Intrinsics.d(this.a, b18Var.a) && this.b.equals(b18Var.b) && this.c.equals(b18Var.c) && this.d == b18Var.d && this.e == b18Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + k5r.c(f1d.a(this.b.a, this.a.hashCode() * 31, 31), 961, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceItemUiState(id=");
        sb.append(this.a);
        sb.append(", iconState=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=null, selectionStateStatus=");
        sb.append(this.d);
        sb.append(", isAvailable=");
        return ouj.r(sb, this.e, ")");
    }
}
