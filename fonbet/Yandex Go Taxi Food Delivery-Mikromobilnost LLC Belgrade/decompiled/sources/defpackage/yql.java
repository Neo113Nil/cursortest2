package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final /* synthetic */ class yql implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;

    public /* synthetic */ yql(float f, long j, int i) {
        this.a = i;
        this.c = f;
        this.b = j;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = this.c;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                qam qamVar = (qam) obj;
                float w0 = qamVar.w0(f);
                float w02 = qamVar.w0(f) / 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(w02) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32));
                float w03 = qamVar.w0(f) / 2.0f;
                qamVar.h(this.b, floatToRawIntBits, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(w03) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), w0, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
                break;
            case 1:
                qam qamVar2 = (qam) obj;
                long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar2.c() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar2.c() >> 32));
                float intBitsToFloat3 = Float.intBitsToFloat((int) (qamVar2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                qamVar2.h(this.b, floatToRawIntBits2, (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), this.c, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
                break;
            case 2:
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                if (f > 0.0f) {
                    qam.t0(c1yVar, ldc.b(this.b, 0.5f * f, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, HProv.PP_DELETE_SAVED_PASSWD);
                    break;
                }
                break;
            default:
                qam qamVar3 = (qam) obj;
                float w04 = qamVar3.w0(f);
                qam.g0(qamVar3, this.b, 0L, 0L, (Float.floatToRawIntBits(w04) << 32) | (Float.floatToRawIntBits(w04) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null, 246);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ yql(long j, float f, int i) {
        this.a = i;
        this.b = j;
        this.c = f;
    }
}
