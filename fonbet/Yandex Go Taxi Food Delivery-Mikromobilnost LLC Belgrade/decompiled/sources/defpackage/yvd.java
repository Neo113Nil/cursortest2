package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final /* synthetic */ class yvd implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long w;

    public /* synthetic */ yvd(float f, float f2, long j) {
        this.b = f;
        this.w = j;
        this.c = f2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                qam qamVar = (qam) obj;
                float f = this.b;
                float f2 = f / 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32)) - f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - f;
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float f3 = this.c;
                qam.g0(qamVar, this.w, floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), new jvu0(0, 0, 30, f, 0.0f), 224);
                break;
            default:
                qam qamVar2 = (qam) obj;
                qam.z(qamVar2, this.w, this.b, qamVar2.P(), this.c, null, 0, 112);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ yvd(long j, float f, float f2, float f3) {
        this.b = f;
        this.c = f2;
        this.w = j;
    }
}
