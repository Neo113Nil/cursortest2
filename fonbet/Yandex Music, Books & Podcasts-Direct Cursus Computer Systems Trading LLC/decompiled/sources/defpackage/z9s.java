package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z9s {
    public final String a;
    public final int b;
    public final int c;
    public final jk9 d;
    public final String e;
    public final e09 f;
    public final Integer g;
    public final Integer h;
    public final int i;
    public final int j;

    public z9s(String str, int i, int i2, jk9 jk9Var, String str2, e09 e09Var, Integer num, Integer num2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = jk9Var;
        this.e = str2;
        this.f = e09Var;
        this.g = num;
        this.h = num2;
        this.i = i3;
        this.j = str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9s)) {
            return false;
        }
        z9s z9sVar = (z9s) obj;
        return Intrinsics.d(this.a, z9sVar.a) && this.b == z9sVar.b && this.c == z9sVar.c && this.d == z9sVar.d && Intrinsics.d(this.e, z9sVar.e) && this.f == z9sVar.f && Intrinsics.d(this.g, z9sVar.g) && Intrinsics.d(this.h, z9sVar.h) && this.i == z9sVar.i;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + f1d.a(this.c, f1d.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        e09 e09Var = this.f;
        int hashCode3 = (hashCode2 + (e09Var == null ? 0 : e09Var.hashCode())) * 31;
        Integer num = this.g;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        return Integer.hashCode(this.i) + ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextData(text=");
        sb.append(this.a);
        sb.append(", fontSize=");
        sb.append(this.b);
        sb.append(", fontSizeValue=");
        sb.append(this.c);
        sb.append(", fontSizeUnit=");
        sb.append(this.d);
        sb.append(", fontFamily=");
        sb.append(this.e);
        sb.append(", fontWeight=");
        sb.append(this.f);
        sb.append(", fontWeightValue=");
        sb.append(this.g);
        sb.append(", lineHeight=");
        sb.append(this.h);
        sb.append(", textColor=");
        return vz1.r(sb, this.i, ')');
    }
}
