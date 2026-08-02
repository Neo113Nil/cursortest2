package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class wu00 {
    public final vu00 a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final Long f;
    public final Long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Map k;

    public wu00(vu00 vu00Var, String str, Integer num, String str2, String str3, Long l, Long l2, Long l3, Long l4, Long l5, Map map) {
        this.a = vu00Var;
        this.b = str;
        this.c = num;
        this.d = str2;
        this.e = str3;
        this.f = l;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.j = l5;
        this.k = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!wu00.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        wu00 wu00Var = (wu00) obj;
        return jl40.l(this.a, wu00Var.a) && jl40.l(this.b, wu00Var.b) && jl40.l(this.c, wu00Var.c) && jl40.l(this.d, wu00Var.d) && jl40.l(this.e, wu00Var.e) && jl40.l(this.f, wu00Var.f) && jl40.l(this.g, wu00Var.g) && jl40.l(this.h, wu00Var.h) && jl40.l(this.i, wu00Var.i) && jl40.l(this.j, wu00Var.j) && jl40.l(this.k, wu00Var.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.c;
        int intValue = (hashCode2 + (num != null ? num.intValue() : 0)) * 31;
        String str2 = this.d;
        int hashCode3 = (intValue + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Long l = this.f;
        int hashCode5 = (hashCode4 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.g;
        int hashCode6 = (hashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.h;
        int hashCode7 = (hashCode6 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.i;
        int hashCode8 = (hashCode7 + (l4 != null ? l4.hashCode() : 0)) * 31;
        Long l5 = this.j;
        return this.k.hashCode() + ((hashCode8 + (l5 != null ? l5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapiRequestDetails(request=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", responseCode=");
        tse0.w(this.c, ", message=", this.d, ", xRequestId=", sb);
        sb.append(this.e);
        sb.append(", startedAtMillis=");
        sb.append(this.f);
        sb.append(", finishedAtMillis=");
        sb.append(this.g);
        sb.append(", requestDurationInMillis=");
        sb.append(this.h);
        sb.append(", parseDurationInMillis=");
        sb.append(this.i);
        sb.append(", totalDurationInMillis=");
        sb.append(this.j);
        sb.append(", additional=");
        return b64.r(sb, this.k, Extension.C_BRAKE);
    }

    public /* synthetic */ wu00(vu00 vu00Var, String str, Integer num, String str2, String str3, Long l, Long l2, Long l3, Long l4, Long l5) {
        this(vu00Var, str, num, str2, str3, l, l2, l3, l4, l5, b.f());
    }
}
