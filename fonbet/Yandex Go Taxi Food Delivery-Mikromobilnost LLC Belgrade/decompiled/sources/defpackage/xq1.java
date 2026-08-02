package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes10.dex */
public final /* synthetic */ class xq1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xq1(float f, a aVar, int i) {
        this.a = 0;
        this.b = f;
        this.c = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cr1.b(f, (a) obj3, (fid) obj, vng.O(391));
                return zy11Var;
            case 1:
                a aVar = (a) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    f530 a = ljs0.a(c530.a, f, 56.0f);
                    z910 d = pi6.d(x4c.y, false);
                    int S = cma1.S(btsVar);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, a);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar, S, wlsVar);
                    }
                    qje.W(btsVar, d.d, d2);
                    nnm.p(0, aVar, btsVar, true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                tx40 tx40Var = (tx40) obj3;
                float floatValue = ((Float) obj2).floatValue();
                byk0 byk0Var = yos0.a;
                tx40Var.setFloatValue(y6i0.c(tx40Var.getFloatValue() + floatValue, 0.0f, f));
                return zy11Var;
        }
    }

    public /* synthetic */ xq1(float f, Object obj, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
    }
}
