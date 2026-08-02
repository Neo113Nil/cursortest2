package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zhj0 implements kij0, e6v, k1c {
    public final g9w a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public zhj0(g9w g9wVar, String str, boolean z, boolean z2) {
        this.a = g9wVar;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = g9wVar.a;
        this.f = g9wVar.d;
    }

    @Override // defpackage.k1c
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhj0)) {
            return false;
        }
        zhj0 zhj0Var = (zhj0) obj;
        return jl40.l(this.a, zhj0Var.a) && jl40.l(this.b, zhj0Var.b) && this.c == zhj0Var.c && this.d == zhj0Var.d;
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
        StringBuilder sb = new StringBuilder("IntercityContact(state=");
        sb.append(this.a);
        sb.append(", trailAccessibilityTitle=");
        sb.append(this.b);
        sb.append(", isFirst=");
        return smw0.k(", isLast=", Extension.C_BRAKE, sb, this.c, this.d);
    }
}
