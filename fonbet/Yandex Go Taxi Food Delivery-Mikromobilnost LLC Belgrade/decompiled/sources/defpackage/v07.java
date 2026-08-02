package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final /* synthetic */ class v07 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yre b;
    public final /* synthetic */ m3u0 c;

    public /* synthetic */ v07(yre yreVar, m3u0 m3u0Var, int i) {
        this.a = i;
        this.b = yreVar;
        this.c = m3u0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m3u0 m3u0Var = this.c;
        yre yreVar = this.b;
        switch (i) {
            case 0:
                qam qamVar = (qam) obj;
                float e = yreVar.e(qamVar.c(), qamVar);
                qam.g0(qamVar, ((ldc) m3u0Var.getValue()).a, 0L, 0L, (Float.floatToRawIntBits(e) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(e)), null, 246);
                break;
            default:
                qam qamVar2 = (qam) obj;
                float e2 = yreVar.e(qamVar2.c(), qamVar2);
                qam.g0(qamVar2, ((ldc) m3u0Var.getValue()).a, 0L, 0L, (Float.floatToRawIntBits(e2) << 32) | (Float.floatToRawIntBits(e2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null, 246);
                break;
        }
        return zy11Var;
    }
}
