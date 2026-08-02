package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class z1x implements a2x {
    public static final y1x Companion = new y1x();
    public static final i3y[] i = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(21)), null, null, null, null, null, null};
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;

    public /* synthetic */ z1x(int i2, String str, List list, String str2, String str3, String str4, Integer num, String str5, String str6) {
        if (255 != (i2 & 255)) {
            qje.Z(i2, 255, x1x.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = str5;
        this.h = str6;
    }

    public final String a() {
        return this.c;
    }

    public final Integer b() {
        return this.f;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.h;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1x)) {
            return false;
        }
        z1x z1xVar = (z1x) obj;
        return jl40.l(this.a, z1xVar.a) && jl40.l(this.b, z1xVar.b) && jl40.l(this.c, z1xVar.c) && jl40.l(this.d, z1xVar.d) && jl40.l(this.e, z1xVar.e) && jl40.l(this.f, z1xVar.f) && jl40.l(this.g, z1xVar.g) && jl40.l(this.h, z1xVar.h);
    }

    public final String f() {
        return this.a;
    }

    public final List g() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(text=");
        sb.append(this.a);
        sb.append(", textDecoration=");
        sb.append(this.b);
        sb.append(", color=");
        sb.append(this.c);
        sb.append(", metaColor=");
        sb.append(this.d);
        sb.append(", metaStyle=");
        sb.append(this.e);
        sb.append(", fontSize=");
        sb.append(this.f);
        sb.append(", fontStyle=");
        sb.append(this.g);
        sb.append(", fontWeight=");
        return b64.p(sb, this.h, ')');
    }

    public z1x(String str, List list, String str2, String str3, String str4, Integer num, String str5, String str6) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = str5;
        this.h = str6;
    }
}
