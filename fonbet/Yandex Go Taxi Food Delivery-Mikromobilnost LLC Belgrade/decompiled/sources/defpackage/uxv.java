package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.draw.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final /* synthetic */ class uxv implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ txv c;

    public /* synthetic */ uxv(float f, txv txvVar) {
        this.b = f;
        this.c = txvVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        txv txvVar = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                float density = bVar.getDensity() * 2.0f;
                float density2 = !Float.isNaN(f) ? bVar.getDensity() * f : cjs0.c(bVar.a.c()) / 2.0f;
                float intBitsToFloat = Float.intBitsToFloat((int) (bVar.a.c() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & bVar.a.c()));
                float density3 = bVar.getDensity() * 3.0f;
                jb2 jb2Var = txvVar.a;
                boolean z = txvVar.e == density3;
                if (txvVar.b != density2 || txvVar.c != intBitsToFloat || txvVar.d != intBitsToFloat2 || z || txvVar.f != density) {
                    txvVar.b = density2;
                    txvVar.c = intBitsToFloat;
                    txvVar.d = intBitsToFloat2;
                    txvVar.e = density3;
                    txvVar.f = density;
                    if (!z) {
                        txvVar.g.a.setMaskFilter(new BlurMaskFilter(density3, BlurMaskFilter.Blur.NORMAL));
                    }
                    float f2 = density3 * 2.0f * 2.0f;
                    float abs = Math.abs(0.0f) + intBitsToFloat + f2;
                    float abs2 = Math.abs(density) + f2 + intBitsToFloat2;
                    jb2Var.p();
                    Path path = jb2Var.a;
                    float f3 = (-abs) / 2.0f;
                    jb2Var.m(f3, 0.0f);
                    float f4 = (-abs2) / 2.0f;
                    jb2Var.l(f3, f4);
                    float f5 = abs / 2.0f;
                    jb2Var.l(f5, f4);
                    float f6 = abs2 / 2.0f;
                    jb2Var.l(f5, f6);
                    jb2Var.l(f3, f6);
                    jb2Var.l(f3, 0.0f);
                    float f7 = (-intBitsToFloat) / 2.0f;
                    jb2Var.l(f7, 0.0f);
                    float f8 = intBitsToFloat2 / 2.0f;
                    float f9 = density2 * 2.0f;
                    float f10 = f8 - f9;
                    float f11 = f7 + f9;
                    if (jb2Var.b == null) {
                        jb2Var.b = new RectF();
                    }
                    jb2Var.b.set(f7, f10, f11, f8);
                    path.arcTo(jb2Var.b, 180.0f, -90.0f, false);
                    float f12 = intBitsToFloat / 2.0f;
                    float f13 = f12 - f9;
                    if (jb2Var.b == null) {
                        jb2Var.b = new RectF();
                    }
                    jb2Var.b.set(f13, f10, f12, f8);
                    path.arcTo(jb2Var.b, 90.0f, -90.0f, false);
                    float f14 = (-intBitsToFloat2) / 2.0f;
                    float f15 = f9 + f14;
                    if (jb2Var.b == null) {
                        jb2Var.b = new RectF();
                    }
                    jb2Var.b.set(f13, f14, f12, f15);
                    path.arcTo(jb2Var.b, 0.0f, -90.0f, false);
                    if (jb2Var.b == null) {
                        jb2Var.b = new RectF();
                    }
                    jb2Var.b.set(f7, f14, f11, f15);
                    path.arcTo(jb2Var.b, -90.0f, -90.0f, false);
                    jb2Var.l(f7, 0.0f);
                    jb2Var.g();
                    jb2Var.g();
                }
                return bVar.b(new uxv(density, txvVar));
            default:
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                k28 k28Var = c1yVar.a;
                i28 q = k28Var.b.q();
                float intBitsToFloat3 = Float.intBitsToFloat((int) (k28Var.c() >> 32)) / 2.0f;
                float intBitsToFloat4 = (Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & k28Var.c())) / 2.0f) + f;
                ((cot) k28Var.b.a).n(intBitsToFloat3, intBitsToFloat4);
                try {
                    q.p(txvVar.a, txvVar.g);
                    ((cot) k28Var.b.a).n(-intBitsToFloat3, -intBitsToFloat4);
                    return zy11.a;
                } catch (Throwable th) {
                    ((cot) k28Var.b.a).n(-intBitsToFloat3, -intBitsToFloat4);
                    throw th;
                }
        }
    }

    public /* synthetic */ uxv(txv txvVar, float f) {
        this.c = txvVar;
        this.b = f;
    }
}
