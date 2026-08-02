package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class ro5 implements jt1 {
    public final float a;

    public ro5(float f) {
        this.a = f;
    }

    @Override // defpackage.jt1
    public final long a(long j, long j2, LayoutDirection layoutDirection) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        float f = ((int) (j3 >> 32)) / 2.0f;
        float f2 = ((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f;
        return (Math.round(f2 * 0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Math.round((1.0f + this.a) * f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro5) && Float.compare(this.a, ((ro5) obj).a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return uw51.i(new StringBuilder("BiasAbsoluteAlignment(horizontalBias="), this.a, ", verticalBias=-1.0)");
    }
}
