package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xhj0 implements kij0, e6v, k1c {
    public final y4p a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public xhj0(y4p y4pVar, String str, boolean z, boolean z2) {
        this.a = y4pVar;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = y4pVar.a;
        String str2 = y4pVar.b;
        this.f = !(str2 == null || str2.length() == 0);
    }

    @Override // defpackage.k1c
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhj0)) {
            return false;
        }
        xhj0 xhj0Var = (xhj0) obj;
        return jl40.l(this.a, xhj0Var.a) && jl40.l(this.b, xhj0Var.b) && this.c == xhj0Var.c && this.d == xhj0Var.d;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // defpackage.k1c
    public final boolean isChecked() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtraPhone(state=");
        sb.append(this.a);
        sb.append(", trailAccessibilityTitle=");
        sb.append(this.b);
        sb.append(", isFirst=");
        return smw0.k(", isLast=", Extension.C_BRAKE, sb, this.c, this.d);
    }
}
