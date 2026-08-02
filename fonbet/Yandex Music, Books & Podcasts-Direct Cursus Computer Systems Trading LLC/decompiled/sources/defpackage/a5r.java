package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a5r {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final y4r e;
    public final y4r f;
    public final y4r g;
    public final String h;
    public final z4r i;
    public final x4r j;
    public final z4r k;
    public final String l;

    public a5r(String str, String str2, String str3, String str4, y4r y4rVar, y4r y4rVar2, y4r y4rVar3, String str5, z4r z4rVar, x4r x4rVar, z4r z4rVar2, String str6) {
        eta.r(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = y4rVar;
        this.f = y4rVar2;
        this.g = y4rVar3;
        this.h = str5;
        this.i = z4rVar;
        this.j = x4rVar;
        this.k = z4rVar2;
        this.l = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5r)) {
            return false;
        }
        a5r a5rVar = (a5r) obj;
        return Intrinsics.d(this.a, a5rVar.a) && Intrinsics.d(this.b, a5rVar.b) && Intrinsics.d(this.c, a5rVar.c) && Intrinsics.d(this.d, a5rVar.d) && this.e.equals(a5rVar.e) && this.f.equals(a5rVar.f) && this.g.equals(a5rVar.g) && this.h.equals(a5rVar.h) && this.i.equals(a5rVar.i) && this.j == a5rVar.j && this.k.equals(a5rVar.k) && Intrinsics.d(this.l, a5rVar.l);
    }

    public final int hashCode() {
        int hashCode = (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + k5r.c((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31, 31, this.h)) * 31)) * 31)) * 31;
        String str = this.l;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m = f1d.m("SpecialBlockUiData(id=", this.a, ", title=", this.b, ", subtitle=");
        su4.v(m, this.c, ", buttonTitle=", this.d, ", buttonColor=");
        m.append(this.e);
        m.append(", textColor=");
        m.append(this.f);
        m.append(", buttonTextColor=");
        m.append(this.g);
        m.append(", action=");
        m.append(this.h);
        m.append(", imageUrl=");
        m.append(this.i);
        m.append(", contentGravity=");
        m.append(this.j);
        m.append(", bgImageUrl=");
        m.append(this.k);
        m.append(", advDisclaimer=");
        m.append(this.l);
        m.append(")");
        return m.toString();
    }
}
