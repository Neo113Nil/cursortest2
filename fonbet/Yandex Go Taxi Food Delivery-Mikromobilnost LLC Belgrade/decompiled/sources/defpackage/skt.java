package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final class skt extends zfr0 {
    public final LinearGradient c = xab1.b((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), scc.g(new ldc(rzo.f(4294925389L)), new ldc(rzo.f(4293609119L)), new ldc(rzo.f(4286792175L))), scc.g(Float.valueOf(0.0f), Float.valueOf(0.4115f), Float.valueOf(1.0f)), 0);
    public final Matrix d = new Matrix();

    @Override // defpackage.zfr0
    public final Shader b(long j) {
        Matrix matrix = this.d;
        matrix.reset();
        matrix.postScale(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        LinearGradient linearGradient = this.c;
        linearGradient.setLocalMatrix(matrix);
        return linearGradient;
    }
}
