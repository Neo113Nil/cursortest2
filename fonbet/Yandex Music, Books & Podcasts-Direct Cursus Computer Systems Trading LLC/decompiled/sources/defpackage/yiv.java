package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yiv implements bjv {
    public final jjv a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final o43 g;
    public final u9b h;
    public final int i;

    public yiv(jjv jjvVar, String str, String str2, String str3, String str4, String str5, o43 o43Var, u9b u9bVar, int i) {
        this.a = jjvVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = o43Var;
        this.h = u9bVar;
        this.i = i;
    }

    @Override // defpackage.bjv
    public final jjv a() {
        return this.a;
    }

    @Override // defpackage.bjv
    public final int b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yiv)) {
            return false;
        }
        yiv yivVar = (yiv) obj;
        return this.a.equals(yivVar.a) && this.b.equals(yivVar.b) && Intrinsics.d(this.c, yivVar.c) && this.d.equals(yivVar.d) && this.e.equals(yivVar.e) && Intrinsics.d(this.f, yivVar.f) && this.g.equals(yivVar.g) && this.h.equals(yivVar.h) && this.i == yivVar.i;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int c2 = k5r.c(k5r.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        return Integer.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + ((c2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoLink(style=");
        sb.append(this.a);
        sb.append(", feedbackId=");
        sb.append(this.b);
        sb.append(", descriptionWheelItem=");
        su4.v(sb, this.c, ", id=", this.d, ", title=");
        su4.v(sb, this.e, ", description=", this.f, ", action=");
        sb.append(this.g);
        sb.append(", cover=");
        sb.append(this.h);
        sb.append(", color=");
        return f1d.i(sb, this.i, ")");
    }
}
