package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class x61 extends n351 implements ion {
    public final String c;
    public final CharSequence d;
    public final boolean e;
    public final dty0 f;
    public final hts0 g;
    public final jvs0 h;
    public final x2s i;
    public final haq0 j;
    public final l690 k;
    public final String l;

    public x61(String str, CharSequence charSequence, boolean z, dty0 dty0Var, hts0 hts0Var, jvs0 jvs0Var, x2s x2sVar, haq0 haq0Var, l690 l690Var, String str2) {
        super("address-selector-item", false, 14);
        this.c = str;
        this.d = charSequence;
        this.e = z;
        this.f = dty0Var;
        this.g = hts0Var;
        this.h = jvs0Var;
        this.i = x2sVar;
        this.j = haq0Var;
        this.k = l690Var;
        this.l = str2;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x61)) {
            return false;
        }
        x61 x61Var = (x61) obj;
        return jl40.l(this.c, x61Var.c) && jl40.l(this.d, x61Var.d) && this.e == x61Var.e && jl40.l(this.f, x61Var.f) && jl40.l(this.g, x61Var.g) && jl40.l(this.h, x61Var.h) && jl40.l(this.i, x61Var.i) && this.j.equals(x61Var.j) && this.k.equals(x61Var.k) && jl40.l(this.l, x61Var.l);
    }

    public final int hashCode() {
        String str = this.c;
        int e = unr0.e(smw0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.d), 31, this.e);
        dty0 dty0Var = this.f;
        int hashCode = (e + (dty0Var == null ? 0 : dty0Var.hashCode())) * 31;
        hts0 hts0Var = this.g;
        int hashCode2 = (hashCode + (hts0Var == null ? 0 : hts0Var.hashCode())) * 31;
        jvs0 jvs0Var = this.h;
        int hashCode3 = (hashCode2 + (jvs0Var == null ? 0 : jvs0Var.hashCode())) * 31;
        x2s x2sVar = this.i;
        int hashCode4 = (this.k.hashCode() + ((this.j.hashCode() + ((hashCode3 + (x2sVar == null ? 0 : x2sVar.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.l;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.d, "AddressSelectorModel(address=", this.c, ", description=", ", descriptionFirst=");
        t.append(this.e);
        t.append(", addressStyle=");
        t.append(this.f);
        t.append(", lead=");
        t.append(this.g);
        t.append(", trail=");
        t.append(this.h);
        t.append(", onShownAnalyticsData=");
        t.append(this.i);
        t.append(", widgetAction=");
        t.append(this.j);
        t.append(", paddings=");
        t.append(this.k);
        t.append(", id=");
        t.append(this.l);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
