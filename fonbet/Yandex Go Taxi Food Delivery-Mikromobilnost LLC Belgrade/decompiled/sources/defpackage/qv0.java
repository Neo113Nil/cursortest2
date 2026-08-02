package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qv0 {
    public final oo0 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final s9e g;
    public final List h;
    public final String i;

    public /* synthetic */ qv0(oo0 oo0Var, String str, String str2, String str3, String str4, String str5, s9e s9eVar, List list, int i) {
        this((i & 1) != 0 ? null : oo0Var, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? new s9e(0) : s9eVar, (i & 128) != 0 ? EmptyList.a : list, (String) null);
    }

    public static qv0 a(qv0 qv0Var, String str, String str2, String str3, String str4, String str5, s9e s9eVar, List list, int i) {
        oo0 oo0Var = qv0Var.a;
        if ((i & 2) != 0) {
            str = qv0Var.b;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = qv0Var.c;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = qv0Var.d;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = qv0Var.e;
        }
        String str9 = str4;
        String str10 = (i & 32) != 0 ? qv0Var.f : str5;
        s9e s9eVar2 = (i & 64) != 0 ? qv0Var.g : s9eVar;
        List list2 = (i & 128) != 0 ? qv0Var.h : list;
        String str11 = qv0Var.i;
        qv0Var.getClass();
        return new qv0(oo0Var, str6, str7, str8, str9, str10, s9eVar2, list2, str11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv0)) {
            return false;
        }
        qv0 qv0Var = (qv0) obj;
        return jl40.l(this.a, qv0Var.a) && jl40.l(this.b, qv0Var.b) && jl40.l(this.c, qv0Var.c) && jl40.l(this.d, qv0Var.d) && jl40.l(this.e, qv0Var.e) && jl40.l(this.f, qv0Var.f) && jl40.l(this.g, qv0Var.g) && jl40.l(this.h, qv0Var.h) && jl40.l(this.i, qv0Var.i);
    }

    public final int hashCode() {
        oo0 oo0Var = this.a;
        int c = unr0.c((this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b((oo0Var == null ? 0 : oo0Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h);
        String str = this.i;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressInfo(address=");
        sb.append(this.a);
        sb.append(", porch=");
        sb.append(this.b);
        sb.append(", apartment=");
        g8e.D(sb, this.c, ", floor=", this.d, ", comment=");
        g8e.D(sb, this.e, ", doorPhone=", this.f, ", contact=");
        sb.append(this.g);
        sb.append(", photoCommentItems=");
        sb.append(this.h);
        sb.append(", serverPointId=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }

    public qv0() {
        this((oo0) null, (String) null, (String) null, (String) null, (String) null, (String) null, (s9e) null, (List) null, 511);
    }

    public qv0(oo0 oo0Var, String str, String str2, String str3, String str4, String str5, s9e s9eVar, List list, String str6) {
        this.a = oo0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = s9eVar;
        this.h = list;
        this.i = str6;
    }
}
