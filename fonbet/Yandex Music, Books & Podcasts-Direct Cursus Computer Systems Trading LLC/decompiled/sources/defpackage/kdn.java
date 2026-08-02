package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kdn {
    public final String a;
    public final String b;
    public final String c;
    public final etq d;

    public kdn(String str, String str2, String str3, etq etqVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = etqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdn)) {
            return false;
        }
        kdn kdnVar = (kdn) obj;
        return this.a.equals(kdnVar.a) && Intrinsics.d(this.b, kdnVar.b) && this.c.equals(kdnVar.c) && this.d == kdnVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("QuizItem(title=", this.a, ", subtitle=", this.b, ", cover=");
        m.append(this.c);
        m.append(", coverType=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
