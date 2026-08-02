package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class nz4 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fvf b;
    public final /* synthetic */ vm c;
    public final /* synthetic */ jz4 d;
    public final /* synthetic */ List e;

    public /* synthetic */ nz4(fvf fvfVar, vm vmVar, jz4 jz4Var, List list, int i) {
        this.b = fvfVar;
        this.c = vmVar;
        this.d = jz4Var;
        this.e = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var.K();
                    if (K == gq5.a) {
                        jz4 jz4Var = this.d;
                        jz4Var.getClass();
                        iz4 iz4Var = new iz4(jz4Var.a);
                        oq5Var.k0(iz4Var);
                        K = iz4Var;
                    }
                    irf.u(this.e, (iz4) K, a.a(d.c(vci.a, 1.0f), "collection_landing_content"), null, null, this.b, null, 0, null, ghh.C(this.c, androidx.compose.foundation.layout.a.c(0.0f, 16, 0.0f, 0.0f, 13)), 0.0f, 0, oq5Var, 432, 0, 3544);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                quj.b(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ nz4(List list, fvf fvfVar, vm vmVar, jz4 jz4Var) {
        this.e = list;
        this.b = fvfVar;
        this.c = vmVar;
        this.d = jz4Var;
    }
}
