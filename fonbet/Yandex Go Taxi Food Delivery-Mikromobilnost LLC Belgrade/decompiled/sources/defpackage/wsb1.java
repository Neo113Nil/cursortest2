package defpackage;

import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.CounterSize;

/* loaded from: classes5.dex */
public abstract class wsb1 {
    public static final void a(mze mzeVar, final tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1109661537);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(mzeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            final w0f w0fVar = mzeVar.d;
            f530 j = an91.j(ljs0.c(c530.a, 1.0f), mzeVar.e);
            String str = w0fVar.a;
            CounterSize counterSize = CounterSize.M;
            boolean z = w0fVar.b;
            boolean z2 = w0fVar.c;
            int i3 = i2 & 112;
            boolean k = (i3 == 32) | btsVar.k(w0fVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            Object obj = Q;
            if (k || Q == o430Var) {
                sls slsVar = new sls() { // from class: jze
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = r3;
                        zy11 zy11Var = zy11.a;
                        w0f w0fVar2 = w0fVar;
                        tls tlsVar2 = tlsVar;
                        switch (i4) {
                            case 0:
                                tlsVar2.invoke(w0fVar2.d);
                                break;
                            default:
                                tlsVar2.invoke(w0fVar2.e);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(slsVar);
                obj = slsVar;
            }
            sls slsVar2 = (sls) obj;
            int i4 = (btsVar.k(w0fVar) ? 1 : 0) | (i3 == 32 ? 1 : 0);
            Object Q2 = btsVar.Q();
            Object obj2 = Q2;
            if (i4 != 0 || Q2 == o430Var) {
                final int i5 = 1;
                sls slsVar3 = new sls() { // from class: jze
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i42 = i5;
                        zy11 zy11Var = zy11.a;
                        w0f w0fVar2 = w0fVar;
                        tls tlsVar2 = tlsVar;
                        switch (i42) {
                            case 0:
                                tlsVar2.invoke(w0fVar2.d);
                                break;
                            default:
                                tlsVar2.invoke(w0fVar2.e);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(slsVar3);
                obj2 = slsVar3;
            }
            rsb1.a(j, str, slsVar2, (sls) obj2, z, z2, 0L, 0L, counterSize, btsVar, 100663296, 192);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(mzeVar, tlsVar, i, 7);
        }
    }

    public static final void b(h460 h460Var, d360 d360Var, boolean z, wls wlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-982302111);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(h460Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(d360Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(wlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 112;
            int i4 = i2 << 3;
            zsb1.d(h460Var.a, d360Var, false, z, wlsVar, btsVar, i3 | (i4 & 7168) | (i4 & HProv.ALG_CLASS_ALL), 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(h460Var, d360Var, z, wlsVar, i, 18);
        }
    }

    public static final String c(p39 p39Var) {
        return a.X(scc.g(p39Var.a, p39Var.b, p39Var.c), " ", null, null, null, 62);
    }
}
