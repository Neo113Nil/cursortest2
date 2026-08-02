package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes10.dex */
public final /* synthetic */ class xe5 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ a c;

    public /* synthetic */ xe5(String str, a aVar) {
        this.b = str;
        this.c = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.c;
        String str = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    boolean k = btsVar.k(str);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new h0(str, 15);
                        btsVar.o0(Q);
                    }
                    f530 b = fnq0.b(c530.a, false, (tls) Q);
                    z910 d = pi6.d(x4c.b, false);
                    int S = cma1.S(btsVar);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, b);
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
                num.getClass();
                ib51.a(str, aVar, fidVar, vng.O(49));
                return zy11Var;
        }
    }

    public /* synthetic */ xe5(String str, a aVar, int i) {
        this.b = str;
        this.c = aVar;
    }
}
