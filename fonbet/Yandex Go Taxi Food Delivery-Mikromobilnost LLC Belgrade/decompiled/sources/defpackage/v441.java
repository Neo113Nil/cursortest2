package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.yandex.taxi.orderforanother.v2.c;

/* loaded from: classes11.dex */
public final /* synthetic */ class v441 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v441(int i, int i2, f530 f530Var, Object obj) {
        this.a = i2;
        this.b = obj;
        this.c = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                e541 e541Var = (e541) obj4;
                tls tlsVar = (tls) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, c530.a);
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
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    boolean z = e541Var.b.a;
                    o430 o430Var = did.a;
                    if (z) {
                        btsVar.e0(1937805819);
                        float f = e541Var.b.b;
                        boolean k = btsVar.k(tlsVar);
                        Object Q = btsVar.Q();
                        if (k || Q == o430Var) {
                            Q = new fc01(21, tlsVar);
                            btsVar.o0(Q);
                        }
                        uob1.a(f, null, (sls) Q, btsVar, 0);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(1938005707);
                        btsVar.t(false);
                    }
                    int i2 = x441.a[e541Var.c.ordinal()];
                    if (i2 == 1) {
                        btsVar.e0(1938110611);
                        boolean k2 = btsVar.k(tlsVar);
                        Object Q2 = btsVar.Q();
                        if (k2 || Q2 == o430Var) {
                            Q2 = new fc01(22, tlsVar);
                            btsVar.o0(Q2);
                        }
                        xqa1.c(0, btsVar, (sls) Q2, null);
                        btsVar.t(false);
                    } else {
                        if (i2 != 2) {
                            throw unr0.y(2140727260, btsVar, false);
                        }
                        btsVar.e0(1938326309);
                        boolean k3 = btsVar.k(tlsVar);
                        Object Q3 = btsVar.Q();
                        if (k3 || Q3 == o430Var) {
                            Q3 = new fc01(23, tlsVar);
                            btsVar.o0(Q3);
                        }
                        jra1.e(0, btsVar, (sls) Q3, null);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                c.b((byi) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                c.d((itz0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 3:
                ql90 ql90Var = (ql90) obj4;
                f530 f530Var = (f530) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(1 & intValue2, (intValue2 & 3) != 2)) {
                    o4b1.b(mt71.m(ql90Var.b, 0, btsVar2), null, f530Var, null, null, 0.0f, null, btsVar2, 56, 120);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            default:
                zm51 zm51Var = (zm51) obj4;
                a aVar = (a) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(1 & intValue3, (intValue3 & 3) != 2)) {
                    wqy0.a(zm51Var.e, aVar, btsVar3, 0);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ v441(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
