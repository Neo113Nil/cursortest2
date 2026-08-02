package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class rg8 {
    public final fau0 a;
    public final ok8 b;
    public final fso c;
    public final lof d;
    public final int e;
    public final int f;

    public rg8(fau0 fau0Var, ok8 ok8Var, fso fsoVar, lof lofVar, int i, int i2) {
        this.a = fau0Var;
        this.b = ok8Var;
        this.c = fsoVar;
        this.d = lofVar;
        this.e = i;
        this.f = i2;
    }

    public static rg8 a(rg8 rg8Var, fau0 fau0Var, ok8 ok8Var, fso fsoVar, lof lofVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            fau0Var = rg8Var.a;
        }
        fau0 fau0Var2 = fau0Var;
        if ((i3 & 2) != 0) {
            ok8Var = rg8Var.b;
        }
        ok8 ok8Var2 = ok8Var;
        if ((i3 & 4) != 0) {
            fsoVar = rg8Var.c;
        }
        fso fsoVar2 = fsoVar;
        if ((i3 & 8) != 0) {
            lofVar = rg8Var.d;
        }
        lof lofVar2 = lofVar;
        if ((i3 & 16) != 0) {
            i = rg8Var.e;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = rg8Var.f;
        }
        rg8Var.getClass();
        return new rg8(fau0Var2, ok8Var2, fsoVar2, lofVar2, i4, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg8)) {
            return false;
        }
        rg8 rg8Var = (rg8) obj;
        return this.a.equals(rg8Var.a) && this.b.equals(rg8Var.b) && this.c.equals(rg8Var.c) && this.d.equals(rg8Var.d) && this.e == rg8Var.e && this.f == rg8Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + oyr.b(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardInputState(step=");
        sb.append(this.a);
        sb.append(", cardNumberField=");
        sb.append(this.b);
        sb.append(", expiryDateField=");
        sb.append(this.c);
        sb.append(", cvvField=");
        sb.append(this.d);
        sb.append(", networkImageRes=");
        return ly3.k(this.e, this.f, ", securityCodeStringRes=", Extension.C_BRAKE, sb);
    }
}
