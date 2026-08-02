package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class gv implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ gv(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (!oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    oq5Var.S();
                } else {
                    if (this.b != 0) {
                        return Unit.a;
                    }
                    u1g.l(oq5Var, d.e(vci.a, 24));
                }
                return Unit.a;
            default:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                ga6 ga6Var = (ga6) obj3;
                mfhVar.getClass();
                ffhVar.getClass();
                int i = ga6.i(ga6Var.a);
                int i2 = this.b;
                int i3 = i + i2;
                int h = ga6.h(ga6Var.a) + i2;
                if (!((h >= 0) & (i3 >= 0))) {
                    ume.a("width and height must be >= 0");
                }
                long h2 = ia6.h(i3, i3, h, h);
                return mfh.m0(mfhVar, ga6.i(h2), ga6.h(h2), new zj(ffhVar.M(h2), 4));
        }
    }
}
