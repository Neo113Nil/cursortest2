package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d70 {
    public final String a;
    public final c70 b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    public d70(String str, c70 c70Var, String str2, int i, int i2, String str3) {
        str.getClass();
        c70Var.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = c70Var;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d70)) {
            return false;
        }
        d70 d70Var = (d70) obj;
        return Intrinsics.d(this.a, d70Var.a) && this.b == d70Var.b && Intrinsics.d(this.c, d70Var.c) && this.d == d70Var.d && this.e == d70Var.e && Intrinsics.d(this.f, d70Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f1d.a(this.e, f1d.a(this.d, k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final String toString() {
        return "AnalyticsBlockEntity(id=" + this.a + ", type=" + this.b + ", title=" + this.c + ", xIndex=" + this.d + ", yIndex=" + this.e + ", uuid=" + this.f + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d70(String str, c70 c70Var, String str2, int i, String str3) {
        this(str, c70Var, str2, i, 0, str3);
        str.getClass();
        c70Var.getClass();
        str2.getClass();
        str3.getClass();
    }
}
