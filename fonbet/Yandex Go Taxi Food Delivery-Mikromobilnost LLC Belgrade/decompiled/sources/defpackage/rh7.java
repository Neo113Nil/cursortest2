package defpackage;

import com.yandex.messaging.telemost.domain.entities.CallHistoryData;
import com.yandex.messaging.ui.calllist.info.c;

/* loaded from: classes11.dex */
public abstract class rh7 {
    public static final void a(CallHistoryData callHistoryData, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(456775528);
        if ((((btsVar.k(callHistoryData) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16) | 128) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new q0v(callHistoryData, slsVar, i, 28);
                return;
            }
            return;
        }
        btsVar.a0();
        if ((i & 1) == 0 || btsVar.C()) {
            btsVar.e0(-897180073);
            rs31 b = jjo.b(btsVar);
            hs31 a = jjo.a(btsVar);
            btsVar.e0(544794079);
            boolean e = btsVar.e(a);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new w4(a, 3);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            yr31 G = ooc.G(qoi0.a(c.class), b, null, vfc.h(c.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        btsVar.u();
        btsVar.m(q1z.a).getClass();
        ny61.u();
    }
}
