package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public abstract class vkq0 {
    public static final pj2 a = new pj2(Float.NaN, Float.NaN);
    public static final gl11 b = new gl11(new tyo0(26), new tyo0(27));
    public static final long c;
    public static final twt0 d;

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        c = floatToRawIntBits;
        d = new twt0(3, new wu60(floatToRawIntBits));
    }
}
