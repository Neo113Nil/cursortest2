package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s01 implements t01 {
    public final String a;
    public final String b;
    public final u9b c;
    public final u51 d;

    public s01(String str, String str2, u9b u9bVar, u51 u51Var) {
        this.a = str;
        this.b = str2;
        this.c = u9bVar;
        this.d = u51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s01)) {
            return false;
        }
        s01 s01Var = (s01) obj;
        return this.a.equals(s01Var.a) && Intrinsics.d(this.b, s01Var.b) && this.c.equals(s01Var.c) && this.d.equals(s01Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Success(title=", this.a, ", subtitle=", this.b, ", cover=");
        m.append(this.c);
        m.append(", artist=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
