package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.xplat.common.c;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.delivery.cancel.data.OrderCancelApi;

/* loaded from: classes11.dex */
public abstract class y891 {
    public static final void a(o9j o9jVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1276856734);
        int i2 = (btsVar.e(o9jVar) ? 4 : 2) | i;
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = o9jVar.x;
                btsVar.o0(Q);
            }
            List list = (List) Q;
            f530 b = m4m0.b(ljs0.c, ((el51) btsVar.m(gl51.a)).c(), qke.q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
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
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            boolean e = btsVar.e(list) | btsVar.e(o9jVar);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new t8j(i3, list, o9jVar);
                btsVar.o0(Q2);
            }
            b2q0.b(null, 6.0f, 0L, true, false, list, (tls) Q2, btsVar, 3120, 21);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tbb(o9jVar, i, 25);
        }
    }

    public static final void b(o1q0 o1q0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(700217719);
        int i2 = (btsVar.e(o1q0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (o1q0Var instanceof m1q0) {
            btsVar.e0(-469959493);
            cf91.a((m1q0) o1q0Var, null, tlsVar, btsVar, ((i2 << 3) & 896) | (i2 & 14));
            btsVar.t(false);
        } else if (o1q0Var instanceof l1q0) {
            btsVar.e0(-469844266);
            re91.c((l1q0) o1q0Var, null, btsVar, i2 & 14);
            btsVar.t(false);
        } else {
            btsVar.e0(-1400627397);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mjf(o1q0Var, tlsVar, i, 15);
        }
    }

    public static iho c(String str, wj00 wj00Var) {
        lhn lhnVar = new lhn(wj00Var.b);
        bzd0 bzd0Var = jho.b;
        bzd0Var.b = c.a(1) + bzd0Var.b;
        lhnVar.b(o450.a() + bzd0Var.b, "eventus_id");
        lhnVar.c("event_name", str);
        return new iho(str, lhnVar);
    }

    public static final void d(kvj0 kvj0Var) {
        try {
            smw0.v(kvj0Var);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static OrderCancelApi e(t0k0 t0k0Var) {
        return (OrderCancelApi) t0k0Var.b(OrderCancelApi.class);
    }
}
