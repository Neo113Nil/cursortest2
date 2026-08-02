package defpackage;

import androidx.compose.foundation.text.selection.j;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final /* synthetic */ class zqe implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ zqe(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zii0 zii0Var;
        oay oayVar;
        rzx c;
        char c2;
        long j;
        float f;
        rzx c3;
        dry0 dry0Var;
        rzx c4;
        dry0 dry0Var2;
        rzx c5;
        rzx c6;
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                return new w50(10, jVar);
            case 1:
                jVar.s();
                return zy11.a;
            default:
                rzx rzxVar = (rzx) obj;
                oay oayVar2 = jVar.d;
                if (oayVar2 != null) {
                    if (oayVar2.p) {
                        oayVar2 = null;
                    }
                    if (oayVar2 != null) {
                        iv60 iv60Var = jVar.b;
                        long j2 = jVar.o().b;
                        int i2 = asy0.c;
                        int r = iv60Var.r((int) (j2 >> 32));
                        int r2 = jVar.b.r((int) (jVar.o().b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        oay oayVar3 = jVar.d;
                        long j3 = 0;
                        long v = (oayVar3 == null || (c6 = oayVar3.c()) == null) ? 0L : c6.v(jVar.m(true));
                        oay oayVar4 = jVar.d;
                        if (oayVar4 != null && (c5 = oayVar4.c()) != null) {
                            j3 = c5.v(jVar.m(false));
                        }
                        oay oayVar5 = jVar.d;
                        float f2 = 0.0f;
                        if (oayVar5 == null || (c4 = oayVar5.c()) == null) {
                            c2 = ' ';
                            j = j3;
                            f = 0.0f;
                        } else {
                            ery0 d = oayVar2.d();
                            c2 = ' ';
                            j = j3;
                            f = Float.intBitsToFloat((int) (c4.v((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((d == null || (dry0Var2 = d.a) == null) ? 0.0f : dry0Var2.c(r).b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        }
                        oay oayVar6 = jVar.d;
                        if (oayVar6 != null && (c3 = oayVar6.c()) != null) {
                            ery0 d2 = oayVar2.d();
                            f2 = Float.intBitsToFloat((int) (c3.v((Float.floatToRawIntBits(0.0f) << c2) | (Float.floatToRawIntBits((d2 == null || (dry0Var = d2.a) == null) ? 0.0f : dry0Var.c(r2).b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                        }
                        int i3 = (int) (v >> c2);
                        int i4 = (int) (j >> c2);
                        zii0Var = new zii0(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(f, f2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (oayVar2.a.g.getDensity() * 25.0f) + Math.max(Float.intBitsToFloat((int) (v & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                        oayVar = jVar.d;
                        if (oayVar != null || (c = oayVar.c()) == null) {
                            return null;
                        }
                        return p4a1.e(zii0Var, c, rzxVar);
                    }
                }
                zii0Var = zii0.e;
                oayVar = jVar.d;
                if (oayVar != null) {
                }
                return null;
        }
    }
}
