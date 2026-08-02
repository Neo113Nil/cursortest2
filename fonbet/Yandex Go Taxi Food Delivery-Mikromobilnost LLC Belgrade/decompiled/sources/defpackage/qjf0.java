package defpackage;

import android.content.Context;
import android.util.TypedValue;
import androidx.compose.ui.draw.b;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.c;

/* loaded from: classes10.dex */
public final /* synthetic */ class qjf0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qjf0(float f, Object obj, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                r5c r5cVar = (r5c) obj2;
                cif0 cif0Var = new cif0(((Number) y6i0.h(Float.valueOf(f), r5cVar)).floatValue(), r5cVar);
                kgx[] kgxVarArr = f.a;
                g gVar = d.c;
                kgx kgxVar = f.a[1];
                ((mnq0) obj).a(gVar, cif0Var);
                return zy11Var;
            case 1:
                ((m2k0) obj).b(1.0f - y6i0.c(Math.abs(((Number) ((m3u0) obj2).getValue()).floatValue()) * f, 0.0f, 1.0f));
                return zy11Var;
            case 2:
                Context context = (Context) obj;
                RoundedBitmapDrawable a = a.a(context.getResources(), ((p71) ((q71) obj2)).a);
                a.setCircular(true);
                a.setCornerRadius(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
                return a;
            case 3:
                c cVar = (c) obj2;
                m2k0 m2k0Var = (m2k0) obj;
                m2k0Var.y(new q941(cVar.f.getFloatValue(), cVar.c(), f));
                m2k0Var.g(true);
                return zy11Var;
            case 4:
                xa6 xa6Var = (xa6) obj2;
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                k28 k28Var = c1yVar.a;
                if (!y7m.b(f, 0.0f)) {
                    float density = k28Var.getDensity() * f;
                    float intBitsToFloat = Float.intBitsToFloat((int) (k28Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - (density / 2.0f);
                    qam.p0(c1yVar, xa6Var.b, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (k28Var.c() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), density, 0.0f, 496);
                }
                return zy11Var;
            case 5:
                sls slsVar = (sls) obj2;
                rzx rzxVar = (rzx) obj;
                if (((int) (rzxVar.e() >> 32)) < f || ((int) (rzxVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) < f) {
                    slsVar.invoke();
                }
                return zy11Var;
            default:
                d190 d190Var = (d190) obj2;
                b bVar = (b) obj;
                return bVar.b(new lyw0(d190Var, bVar.getDensity() * d190Var.e, f + (bVar.getDensity() * d190Var.f), Float.intBitsToFloat((int) (bVar.a.c() >> 32)), bVar.getDensity() * d190Var.c, bVar.getDensity() * d190Var.d));
        }
    }

    public /* synthetic */ qjf0(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }
}
