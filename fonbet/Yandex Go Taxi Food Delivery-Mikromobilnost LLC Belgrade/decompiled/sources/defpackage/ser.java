package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class ser implements nhe {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ser) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    @Override // defpackage.nhe
    public final long j(long j, long j2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        int i = blm0.a;
        return floatToRawIntBits;
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
