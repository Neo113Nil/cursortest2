package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class br5 {
    public final String a;
    public final String b;
    public final String c;
    public final jyr d = btf.b(new k5(25, this));

    public br5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br5)) {
            return false;
        }
        br5 br5Var = (br5) obj;
        return Intrinsics.d(this.a, br5Var.a) && Intrinsics.d(this.b, br5Var.b) && Intrinsics.d(this.c, br5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return (String) this.d.getValue();
    }
}
