package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p5t {
    public final String a;
    public final String b;
    public final String c;
    public final qo6 d;
    public final d85 e;
    public final boolean f;
    public final boolean g;
    public final Float h;

    public p5t(String str, String str2, String str3, qo6 qo6Var, d85 d85Var, boolean z, boolean z2, Float f) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qo6Var;
        this.e = d85Var;
        this.f = z;
        this.g = z2;
        this.h = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5t)) {
            return false;
        }
        p5t p5tVar = (p5t) obj;
        return this.a.equals(p5tVar.a) && Intrinsics.d(this.b, p5tVar.b) && this.c.equals(p5tVar.c) && this.d == p5tVar.d && Intrinsics.d(this.e, p5tVar.e) && this.f == p5tVar.f && this.g == p5tVar.g && Intrinsics.d(this.h, p5tVar.h);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.hashCode() + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        d85 d85Var = this.e;
        if (d85Var == null) {
            hashCode = 0;
        } else {
            long j = d85Var.a;
            met metVar = net.b;
            hashCode = Long.hashCode(j);
        }
        int e = k5r.e(k5r.e((hashCode2 + hashCode) * 31, 31, this.f), 31, this.g);
        Float f = this.h;
        return e + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("TrailerHeaderData(title=", this.a, ", entityName=", this.b, ", coverUrl=");
        m.append(this.c);
        m.append(", coverType=");
        m.append(this.d);
        m.append(", entityColor=");
        m.append(this.e);
        m.append(", isPlaying=");
        m.append(this.f);
        m.append(", shareable=");
        m.append(this.g);
        m.append(", personalColorHue=");
        m.append(this.h);
        m.append(")");
        return m.toString();
    }
}
