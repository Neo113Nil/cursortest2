package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ljv {
    public final String a;
    public final boolean b;
    public final qo6 c;
    public final String d;
    public final int e;
    public final Integer f;
    public final jzb g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final String l;

    public ljv(String str, boolean z, qo6 qo6Var, String str2, int i, Integer num, jzb jzbVar, boolean z2, boolean z3, String str3, boolean z4, String str4) {
        str2.getClass();
        this.a = str;
        this.b = z;
        this.c = qo6Var;
        this.d = str2;
        this.e = i;
        this.f = num;
        this.g = jzbVar;
        this.h = z2;
        this.i = z3;
        this.j = str3;
        this.k = z4;
        this.l = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljv)) {
            return false;
        }
        ljv ljvVar = (ljv) obj;
        return Intrinsics.d(this.a, ljvVar.a) && this.b == ljvVar.b && this.c == ljvVar.c && Intrinsics.d(this.d, ljvVar.d) && this.e == ljvVar.e && Intrinsics.d(this.f, ljvVar.f) && this.g == ljvVar.g && this.h == ljvVar.h && this.i == ljvVar.i && Intrinsics.d(this.j, ljvVar.j) && this.k == ljvVar.k && this.l.equals(ljvVar.l);
    }

    public final int hashCode() {
        String str = this.a;
        int a = f1d.a(this.e, k5r.c((this.c.hashCode() + k5r.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31, 31, this.d), 31);
        Integer num = this.f;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        jzb jzbVar = this.g;
        int e = k5r.e(k5r.e((hashCode + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31, 31, this.h), 31, this.i);
        String str2 = this.j;
        return this.l.hashCode() + k5r.e((e + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder h = v3w.h("WheelItemUiData(imageUrl=", this.a, ", isLink=", ", coverType=", this.b);
        h.append(this.c);
        h.append(", title=");
        h.append(this.d);
        h.append(", color=");
        h.append(this.e);
        h.append(", coverColor=");
        h.append(this.f);
        h.append(", explicitType=");
        h.append(this.g);
        h.append(", isAccentTextColor=");
        h.append(this.h);
        h.append(", hasWaveForTwoBackgroundImage=");
        h.append(this.i);
        h.append(", description=");
        h.append(this.j);
        h.append(", withRippleShader=");
        h.append(this.k);
        h.append(", contentDescription=");
        h.append(this.l);
        h.append(")");
        return h.toString();
    }
}
