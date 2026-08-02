package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b4r implements Comparable {
    public static final jk9 v = jk9.SP;
    public final int a;
    public final int b;
    public final yq9 c;
    public final int d;
    public final String e;
    public final String f;
    public final Integer g;
    public final jk9 h;
    public final e09 i;
    public final Integer j;
    public final JSONObject k;
    public final Double l;
    public final Integer m;
    public final zdg n;
    public final e89 o;
    public final Integer p;
    public final rtp q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final e89 u;

    public b4r(int i, int i2, yq9 yq9Var, int i3, String str, String str2, Integer num, jk9 jk9Var, e09 e09Var, Integer num2, JSONObject jSONObject, Double d, Integer num3, zdg zdgVar, e89 e89Var, Integer num4, rtp rtpVar, Integer num5, Integer num6, Integer num7, e89 e89Var2) {
        this.a = i;
        this.b = i2;
        this.c = yq9Var;
        this.d = i3;
        this.e = str;
        this.f = str2;
        this.g = num;
        this.h = jk9Var;
        this.i = e09Var;
        this.j = num2;
        this.k = jSONObject;
        this.l = d;
        this.m = num3;
        this.n = zdgVar;
        this.o = e89Var;
        this.p = num4;
        this.q = rtpVar;
        this.r = num5;
        this.s = num6;
        this.t = num7;
        this.u = e89Var2;
    }

    public final b4r a(b4r b4rVar, int i, int i2) {
        yq9 yq9Var = b4rVar.c;
        if (yq9Var == null) {
            yq9Var = this.c;
        }
        yq9 yq9Var2 = yq9Var;
        int i3 = b4rVar.d;
        if (i3 == 0) {
            i3 = this.d;
        }
        int i4 = i3;
        String str = b4rVar.e;
        if (str == null) {
            str = this.e;
        }
        String str2 = str;
        String str3 = b4rVar.f;
        if (str3 == null) {
            str3 = this.f;
        }
        String str4 = str3;
        Integer num = b4rVar.g;
        if (num == null) {
            num = this.g;
        }
        Integer num2 = num;
        jk9 jk9Var = b4rVar.h;
        if (jk9Var == v) {
            jk9Var = this.h;
        }
        jk9 jk9Var2 = jk9Var;
        e09 e09Var = b4rVar.i;
        if (e09Var == null) {
            e09Var = this.i;
        }
        e09 e09Var2 = e09Var;
        Integer num3 = b4rVar.j;
        if (num3 == null) {
            num3 = this.j;
        }
        Integer num4 = num3;
        JSONObject jSONObject = b4rVar.k;
        if (jSONObject == null) {
            jSONObject = this.k;
        }
        JSONObject jSONObject2 = jSONObject;
        Double d = b4rVar.l;
        if (d == null) {
            d = this.l;
        }
        Double d2 = d;
        Integer num5 = b4rVar.m;
        if (num5 == null) {
            num5 = this.m;
        }
        Integer num6 = num5;
        zdg zdgVar = b4rVar.n;
        if (zdgVar == null) {
            zdgVar = this.n;
        }
        zdg zdgVar2 = zdgVar;
        e89 e89Var = b4rVar.o;
        if (e89Var == null) {
            e89Var = this.o;
        }
        e89 e89Var2 = e89Var;
        Integer num7 = b4rVar.p;
        if (num7 == null) {
            num7 = this.p;
        }
        Integer num8 = num7;
        rtp rtpVar = b4rVar.q;
        if (rtpVar == null) {
            rtpVar = this.q;
        }
        rtp rtpVar2 = rtpVar;
        Integer num9 = b4rVar.r;
        Integer num10 = num9 == null ? this.r : num9;
        Integer num11 = num9 != null ? b4rVar.s : this.s;
        Integer num12 = num9 != null ? b4rVar.t : this.t;
        e89 e89Var3 = b4rVar.u;
        if (e89Var3 == null) {
            e89Var3 = this.u;
        }
        return new b4r(i, i2, yq9Var2, i4, str2, str4, num2, jk9Var2, e09Var2, num4, jSONObject2, d2, num6, zdgVar2, e89Var2, num8, rtpVar2, num10, num11, num12, e89Var3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((b4r) obj).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4r)) {
            return false;
        }
        b4r b4rVar = (b4r) obj;
        return this.a == b4rVar.a && this.b == b4rVar.b && this.c == b4rVar.c && this.d == b4rVar.d && Intrinsics.d(this.e, b4rVar.e) && Intrinsics.d(this.f, b4rVar.f) && Intrinsics.d(this.g, b4rVar.g) && this.h == b4rVar.h && this.i == b4rVar.i && Intrinsics.d(this.j, b4rVar.j) && Intrinsics.d(this.k, b4rVar.k) && Intrinsics.d(this.l, b4rVar.l) && Intrinsics.d(this.m, b4rVar.m) && Intrinsics.d(this.n, b4rVar.n) && this.o == b4rVar.o && Intrinsics.d(this.p, b4rVar.p) && Intrinsics.d(this.q, b4rVar.q) && Intrinsics.d(this.r, b4rVar.r) && Intrinsics.d(this.s, b4rVar.s) && Intrinsics.d(this.t, b4rVar.t) && this.u == b4rVar.u;
    }

    public final int hashCode() {
        int a = f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
        yq9 yq9Var = this.c;
        int a2 = f1d.a(this.d, (a + (yq9Var == null ? 0 : yq9Var.hashCode())) * 31, 31);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.g;
        int hashCode3 = (this.h.hashCode() + ((hashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        e09 e09Var = this.i;
        int hashCode4 = (hashCode3 + (e09Var == null ? 0 : e09Var.hashCode())) * 31;
        Integer num2 = this.j;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        JSONObject jSONObject = this.k;
        int hashCode6 = (hashCode5 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        Double d = this.l;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.m;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        zdg zdgVar = this.n;
        int hashCode9 = (hashCode8 + (zdgVar == null ? 0 : zdgVar.hashCode())) * 31;
        e89 e89Var = this.o;
        int hashCode10 = (hashCode9 + (e89Var == null ? 0 : e89Var.hashCode())) * 31;
        Integer num4 = this.p;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        rtp rtpVar = this.q;
        int hashCode12 = (hashCode11 + (rtpVar == null ? 0 : rtpVar.hashCode())) * 31;
        Integer num5 = this.r;
        int hashCode13 = (hashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.s;
        int hashCode14 = (hashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.t;
        int hashCode15 = (hashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        e89 e89Var2 = this.u;
        return hashCode15 + (e89Var2 != null ? e89Var2.hashCode() : 0);
    }

    public final String toString() {
        return "SpanData(start=" + this.a + ", end=" + this.b + ", alignmentVertical=" + this.c + ", baselineOffset=" + this.d + ", fontFamily=" + this.e + ", fontFeatureSettings=" + this.f + ", fontSize=" + this.g + ", fontSizeUnit=" + this.h + ", fontWeight=" + this.i + ", fontWeightValue=" + this.j + ", fontVariationSettings=" + this.k + ", letterSpacing=" + this.l + ", lineHeight=" + this.m + ", mask=" + this.n + ", strike=" + this.o + ", textColor=" + this.p + ", textShadow=" + this.q + ", topOffset=" + this.r + ", topOffsetStart=" + this.s + ", topOffsetEnd=" + this.t + ", underline=" + this.u + ')';
    }
}
