package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q910 {
    public final stz0 a;
    public final rbv b;
    public final qc70 c;
    public final String d;
    public final String e;
    public final String f;
    public final YbButtonView.a g;
    public final s451 h;

    public q910(stz0 stz0Var, rbv rbvVar, qc70 qc70Var, String str, String str2, String str3, YbButtonView.a aVar, s451 s451Var) {
        this.a = stz0Var;
        this.b = rbvVar;
        this.c = qc70Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = aVar;
        this.h = s451Var;
    }

    public final String a() {
        return this.d;
    }

    public final YbButtonView.a b() {
        return this.g;
    }

    public final String c() {
        return this.f;
    }

    public final rbv d() {
        return this.b;
    }

    public final qc70 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q910)) {
            return false;
        }
        q910 q910Var = (q910) obj;
        return this.a.equals(q910Var.a) && this.b.equals(q910Var.b) && this.c.equals(q910Var.c) && jl40.l(this.d, q910Var.d) && jl40.l(this.e, q910Var.e) && jl40.l(this.f, q910Var.f) && jl40.l(this.g, q910Var.g) && jl40.l(this.h, q910Var.h);
    }

    public final String f() {
        return this.e;
    }

    public final stz0 g() {
        return this.a;
    }

    public final s451 h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ly3.c(this.b, this.a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int b = unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        YbButtonView.a aVar = this.g;
        int hashCode3 = (b + (aVar == null ? 0 : aVar.hashCode())) * 31;
        s451 s451Var = this.h;
        return hashCode3 + (s451Var != null ? s451Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Me2MeDebitResultViewState(toolbar=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", amount=");
        sb.append(this.d);
        sb.append(", title=");
        g8e.D(sb, this.e, ", description=", this.f, ", button=");
        sb.append(this.g);
        sb.append(", widget=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
