package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kfj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final co6 e;
    public final long f;

    public kfj(String str, String str2, String str3, String str4, co6 co6Var, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        co6Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = co6Var;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfj)) {
            return false;
        }
        kfj kfjVar = (kfj) obj;
        return Intrinsics.d(this.a, kfjVar.a) && Intrinsics.d(this.b, kfjVar.b) && Intrinsics.d(this.c, kfjVar.c) && Intrinsics.d(this.d, kfjVar.d) && Intrinsics.d(this.e, kfjVar.e) && this.f == kfjVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + ((this.e.hashCode() + k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("NotificationMeta(title=", this.a, ", subtitle=", this.b, ", album=");
        su4.v(m, this.c, ", artist=", this.d, ", coverMeta=");
        m.append(this.e);
        m.append(", duration=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
