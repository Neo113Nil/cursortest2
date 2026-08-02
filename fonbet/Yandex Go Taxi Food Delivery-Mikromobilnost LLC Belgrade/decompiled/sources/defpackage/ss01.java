package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ss01 {
    public final stz0 a;
    public final rbv b;
    public final qc70 c;
    public final wty0 d;
    public final wty0 e;
    public final String f;
    public final Text g;
    public final q451 h;

    public /* synthetic */ ss01(stz0 stz0Var, rbv rbvVar, qc70 qc70Var, wty0 wty0Var, wty0 wty0Var2, String str, Text.Resource resource, int i) {
        this(stz0Var, rbvVar, qc70Var, wty0Var, wty0Var2, str, (i & 64) != 0 ? null : resource, (q451) null);
    }

    public final Text a() {
        return this.g;
    }

    public final q451 b() {
        return this.h;
    }

    public final String c() {
        return this.f;
    }

    public final wty0 d() {
        return this.e;
    }

    public final rbv e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss01)) {
            return false;
        }
        ss01 ss01Var = (ss01) obj;
        return jl40.l(this.a, ss01Var.a) && jl40.l(this.b, ss01Var.b) && jl40.l(this.c, ss01Var.c) && jl40.l(this.d, ss01Var.d) && jl40.l(this.e, ss01Var.e) && jl40.l(this.f, ss01Var.f) && jl40.l(this.g, ss01Var.g) && jl40.l(this.h, ss01Var.h);
    }

    public final qc70 f() {
        return this.c;
    }

    public final wty0 g() {
        return this.d;
    }

    public final stz0 h() {
        return this.a;
    }

    public final int hashCode() {
        int b = unr0.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ly3.c(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.f);
        Text text = this.g;
        int hashCode = (b + (text == null ? 0 : text.hashCode())) * 31;
        q451 q451Var = this.h;
        return hashCode + (q451Var != null ? q451Var.hashCode() : 0);
    }

    public final String toString() {
        return "TransferResultViewState(toolbar=" + this.a + ", recipientBankIcon=" + this.b + ", statusViewState=" + this.c + ", titleViewDetails=" + this.d + ", messageViewDetails=" + this.e + ", comment=" + this.f + ", actionButtonText=" + this.g + ", autoTopupWidgetState=" + this.h + Extension.C_BRAKE;
    }

    public ss01(stz0 stz0Var, rbv rbvVar, qc70 qc70Var, wty0 wty0Var, wty0 wty0Var2, String str, Text text, q451 q451Var) {
        this.a = stz0Var;
        this.b = rbvVar;
        this.c = qc70Var;
        this.d = wty0Var;
        this.e = wty0Var2;
        this.f = str;
        this.g = text;
        this.h = q451Var;
    }
}
