package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rm2 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public rm2(String str, int i, int i2, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm2)) {
            return false;
        }
        rm2 rm2Var = (rm2) obj;
        return Intrinsics.d(this.a, rm2Var.a) && this.b == rm2Var.b && this.c == rm2Var.c && Intrinsics.d(this.d, rm2Var.d) && this.e.equals(rm2Var.e);
    }

    public final int hashCode() {
        int a = f1d.a(this.c, f1d.a(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        return this.e.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder l = f1d.l(this.b, "BannerEntity(title=", this.a, ", titleColor=", ", backgroundColor=");
        l.append(this.c);
        l.append(", imageUrl=");
        l.append(this.d);
        l.append(", deeplink=");
        return su4.o(l, this.e, ")");
    }
}
