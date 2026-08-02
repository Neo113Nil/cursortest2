package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public final /* synthetic */ class xo1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3u0 b;

    public /* synthetic */ xo1(m3u0 m3u0Var, int i) {
        this.a = i;
        this.b = m3u0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m3u0 m3u0Var = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                ((m2k0) obj).b(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 2:
                ((m2k0) obj).q(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 3:
                qam qamVar = (qam) obj;
                long j = ((ldc) m3u0Var.getValue()).a;
                float w0 = qamVar.w0(8.0f);
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(w0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float w02 = qamVar.w0(16.0f);
                qam.g0(qamVar, j, floatToRawIntBits, 0L, (Float.floatToRawIntBits(w02) << 32) | (Float.floatToRawIntBits(w02) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null, 244);
                break;
            case 4:
                ((m2k0) obj).G(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 5:
                ((m2k0) obj).G(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 6:
                x9d x9dVar = x9d.a;
                ((m2k0) obj).b(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 7:
                x9d x9dVar2 = x9d.a;
                ((m2k0) obj).b(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 8:
                ((m2k0) obj).q(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 9:
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                k28 k28Var = c1yVar.a;
                float floatValue = ((Number) m3u0Var.getValue()).floatValue();
                if (floatValue < 1.0f) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (k28Var.c() >> 32)) * floatValue;
                    qam.t(c1yVar, zoy0.A(scc.g(new ldc(ldc.b), new ldc(ldc.l)), intBitsToFloat - (Float.intBitsToFloat((int) (k28Var.c() >> 32)) * 0.3f), intBitsToFloat, 8), 0L, 0L, 0.0f, null, 6, 62);
                    break;
                }
                break;
            case 10:
                ((m2k0) obj).b(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 11:
                m2k0 m2k0Var = (m2k0) obj;
                m2k0Var.D(Float.intBitsToFloat((int) (((wu60) m3u0Var.getValue()).a >> 32)) - (Float.intBitsToFloat((int) (m2k0Var.J >> 32)) / 2.0f));
                m2k0Var.G((m2k0Var.K.getDensity() * 8.0f) + ((m2k0Var.K.getDensity() * 6.0f) / 2.0f) + (Float.intBitsToFloat((int) (((wu60) m3u0Var.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (m2k0Var.J & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                break;
            case 12:
                m2k0 m2k0Var2 = (m2k0) obj;
                m2k0Var2.u(((Number) m3u0Var.getValue()).floatValue());
                m2k0Var2.v(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 13:
                m2k0 m2k0Var3 = (m2k0) obj;
                m2k0Var3.D(Float.intBitsToFloat((int) (m2k0Var3.J >> 32)) * 0.3f * (-((Number) m3u0Var.getValue()).floatValue()));
                break;
            case 14:
                ((m2k0) obj).b(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 15:
                m2k0 m2k0Var4 = (m2k0) obj;
                m2k0Var4.u(((Number) m3u0Var.getValue()).floatValue());
                m2k0Var4.v(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 16:
                ((m2k0) obj).b(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 17:
                break;
            case 18:
                ((m2k0) obj).q(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 19:
                ((m2k0) obj).q(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 20:
                ((m2k0) obj).D(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 21:
                qam.z((qam) obj, ((ldc) m3u0Var.getValue()).a, 0.0f, 0L, 0.0f, null, 0, HProv.PP_DELETE_SAVED_PASSWD);
                break;
            case 22:
                ((m2k0) obj).b(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 23:
                ((m2k0) obj).b(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 24:
                ((m2k0) obj).D(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 25:
                ((m2k0) obj).D(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 26:
                ((m2k0) obj).b(((Number) m3u0Var.getValue()).floatValue());
                break;
            case 27:
                ((m2k0) obj).b(((Number) m3u0Var.getValue()).floatValue());
                break;
            default:
                ((m2k0) obj).b(((Number) m3u0Var.getValue()).floatValue());
                break;
        }
        return zy11Var;
    }
}
