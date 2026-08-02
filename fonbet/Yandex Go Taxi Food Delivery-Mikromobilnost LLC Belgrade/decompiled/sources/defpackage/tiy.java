package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final class tiy extends zfr0 {
    public final LinearGradient c;
    public final Matrix d = new Matrix();

    public tiy(uiy uiyVar) {
        this.c = xab1.b(uiyVar.c, uiyVar.d, uiyVar.a, uiyVar.b, 0);
    }

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
