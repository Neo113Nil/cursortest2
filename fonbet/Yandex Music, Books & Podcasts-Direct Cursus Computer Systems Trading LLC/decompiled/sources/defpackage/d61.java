package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d61 implements e61 {
    public final String a;
    public final Integer b;
    public final udl c;

    public d61(String str, Integer num, udl udlVar) {
        this.a = str;
        this.b = num;
        this.c = udlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d61)) {
            return false;
        }
        d61 d61Var = (d61) obj;
        return this.a.equals(d61Var.a) && Intrinsics.d(this.b, d61Var.b) && this.c.equals(d61Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "Success(title=" + this.a + ", colorInt=" + this.b + ", informer=" + this.c + ")";
    }
}
