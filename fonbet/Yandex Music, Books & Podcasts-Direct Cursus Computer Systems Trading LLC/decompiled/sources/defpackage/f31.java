package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f31 implements g31 {
    public final String a;
    public final Integer b;
    public final tdl c;

    public f31(String str, Integer num, tdl tdlVar) {
        str.getClass();
        this.a = str;
        this.b = num;
        this.c = tdlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f31)) {
            return false;
        }
        f31 f31Var = (f31) obj;
        return Intrinsics.d(this.a, f31Var.a) && Intrinsics.d(this.b, f31Var.b) && this.c.equals(f31Var.c);
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
