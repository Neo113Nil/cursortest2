package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class y551 implements vm10 {
    public final to5 a;
    public final int b;

    public y551(to5 to5Var, int i) {
        this.a = to5Var;
        this.b = i;
    }

    @Override // defpackage.vm10
    public final int a(f6w f6wVar, long j, int i) {
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        int i3 = this.b;
        return i >= i2 - (i3 * 2) ? xvz.a(i2 - i, 2.0f, 1.0f) : y6i0.d(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y551)) {
            return false;
        }
        y551 y551Var = (y551) obj;
        return this.a.equals(y551Var.a) && this.b == y551Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return oyr.s(sb, this.b, ')');
    }
}
