package defpackage;

import androidx.lifecycle.compose.a;

/* loaded from: classes15.dex */
public abstract class r9x {
    public static final void a(String str, String str2, String str3, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        j9x j9xVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1127720818);
        if ((((btsVar2.k(str) ? 4 : 2) | i | (btsVar2.k(str2) ? 32 : 16) | (btsVar2.k(str3) ? 256 : 128) | (btsVar2.e(slsVar) ? 2048 : 1024) | 8192) & 9363) == 9362 && btsVar2.E()) {
            btsVar2.Y();
            aii0 v = btsVar2.v();
            if (v != null) {
                v.d = new wzr(str, str2, str3, slsVar, i, 9);
                return;
            }
            return;
        }
        btsVar2.a0();
        if ((i & 1) == 0 || btsVar2.C()) {
            btsVar2.e0(-897180073);
            rs31 b = jjo.b(btsVar2);
            hs31 a = jjo.a(btsVar2);
            btsVar2.e0(544794079);
            boolean e = btsVar2.e(a);
            Object Q = btsVar2.Q();
            if (e || Q == did.a) {
                Q = new w4(a, 15);
                btsVar2.o0(Q);
            }
            btsVar2.t(false);
            btsVar = btsVar2;
            yr31 G = ooc.G(qoi0.a(j9x.class), b, null, vfc.h(j9x.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            btsVar.t(false);
            j9xVar = (j9x) G;
        } else {
            btsVar2.Y();
            btsVar = btsVar2;
            j9xVar = null;
        }
        btsVar.u();
        a.c(j9xVar.w, null, btsVar, 0, 7);
        btsVar.m(q1z.a).getClass();
        ny61.u();
    }
}
