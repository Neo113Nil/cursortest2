package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public final /* synthetic */ class xwb0 implements zls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;

    public /* synthetic */ xwb0(float f, boolean z) {
        this.c = f;
        this.b = z;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.a;
        final float f = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                cjs0 cjs0Var = (cjs0) obj2;
                jb2 jb2Var = gyb0.a;
                ((jb2) ((rq90) obj)).d(gyb0.a(Float.intBitsToFloat((int) (cjs0Var.a >> 32)), Float.intBitsToFloat((int) (cjs0Var.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), f, z));
                return zy11.a;
            default:
                k kVar = (k) obj;
                x910 x910Var = (x910) obj2;
                n8e n8eVar = (n8e) obj3;
                if (z) {
                    long j2 = n8eVar.a;
                    j = p8e.a(n8e.j(j2), n8e.h(j2), n8e.k(j2), n8e.i(j2));
                } else {
                    j = n8eVar.a;
                }
                final o l0 = x910Var.l0(j);
                final int i2 = z ? l0.b : l0.a;
                final int i3 = z ? l0.a : l0.b;
                return kVar.w(i2, i3, b.f(), new tls() { // from class: twk0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        o oVar = o.this;
                        o.a.x((o.a) obj4, oVar, (i2 - oVar.a) / 2, (i3 - oVar.b) / 2, new yo1(f, 7), 4);
                        return zy11.a;
                    }
                });
        }
    }

    public /* synthetic */ xwb0(boolean z, float f) {
        this.b = z;
        this.c = f;
    }
}
