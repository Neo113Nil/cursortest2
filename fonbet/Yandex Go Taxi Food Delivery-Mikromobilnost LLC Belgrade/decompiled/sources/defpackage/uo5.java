package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class uo5 implements jt1 {
    public final float a;
    public final float b;

    public uo5(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.jt1
    public final long a(long j, long j2, LayoutDirection layoutDirection) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f3 = this.a;
        if (layoutDirection != layoutDirection2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo5)) {
            return false;
        }
        uo5 uo5Var = (uo5) obj;
        return Float.compare(this.a, uo5Var.a) == 0 && Float.compare(this.b, uo5Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return n.n(sb, this.b, ')');
    }
}
