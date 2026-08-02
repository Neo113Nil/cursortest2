package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.j;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class x6b1 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1477539182);
        if (btsVar.V(i & 1, i != 0)) {
            dk91.a(2.0f, 390, 0, ((el51) btsVar.m(gl51.a)).n(), btsVar, an91.m(c530.a, 16.0f, 0.0f, 2));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new w9u(i, 20);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
    
        if (r8 == r6) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(v1f v1fVar, yur yurVar, sls slsVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        Object obj;
        Object obj2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(463752518);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(v1fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(yurVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            String str = v1fVar.a;
            gzv gzvVar = v1fVar.b;
            dur durVar = (dur) btsVar.m(j.i);
            boolean k = btsVar.k(gzvVar);
            Object Q = btsVar.Q();
            Object obj3 = did.a;
            if (k || Q == obj3) {
                String str2 = gzvVar.a;
                int i3 = gzvVar.b;
                obj = obj3;
                Q = f.j(new hoy0(str2, eja1.c(i3, i3), 4));
                btsVar.o0(Q);
            } else {
                obj = obj3;
            }
            hoy0 hoy0Var = (hoy0) ((oz40) Q).getValue();
            boolean z = (i2 & 7168) == 2048;
            Object Q2 = btsVar.Q();
            int i4 = 5;
            if (z) {
                obj2 = obj;
            } else {
                obj2 = obj;
            }
            Q2 = new adp(i4, tlsVar);
            btsVar.o0(Q2);
            tls tlsVar2 = (tls) Q2;
            f530 b = gi91.b(ljs0.c(an91.o(c530.a, 0.0f, 0.0f, 16.0f, 0.0f, 11), 1.0f), yurVar);
            int i5 = 0;
            a S = wwg.S(-302402671, true, new fzv(str, i5), btsVar);
            lkx lkxVar = new lkx(i5, i4, 7, 112);
            boolean e = btsVar.e(durVar) | ((i2 & 896) == 256);
            Object Q3 = btsVar.Q();
            if (e || Q3 == obj2) {
                Q3 = new mgu(8, durVar, slsVar);
                btsVar.o0(Q3);
            }
            xjx xjxVar = new xjx(62, (tls) Q3);
            long j = ldc.l;
            dmh d = tlb1.d(0L, 0L, j, j, 0L, 0L, btsVar, 14155782, 2097055);
            btsVar = btsVar;
            tlb1.a(0, 12582912, 24960, 233336, btsVar, tlsVar2, null, S, null, xjxVar, lkxVar, b, null, null, d, hoy0Var, null, null, false, false, true);
            a(btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(v1fVar, yurVar, slsVar, tlsVar, i, 2);
        }
    }

    public static final void c(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-163269246);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            ymb1.e(str, an91.o(c530.a, 0.0f, 2.0f, 0.0f, 0.0f, 13), ((el51) btsVar2.m(gl51.a)).o(), null, lzr.D, null, 0L, 0L, 0L, null, 0, false, 1, null, null, btsVar, (i2 & 14) | 24624, HProv.ALG_TYPE_SECURECHANNEL, 57320);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 1);
        }
    }

    public static final void d(o4q0 o4q0Var, boolean z, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-837282044);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? btsVar.k(o4q0Var) : btsVar.e(o4q0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i5 = 1;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = i4 != 0 ? false : z;
            if (o4q0Var instanceof c1q0) {
                btsVar.e0(1700868087);
                b1q0.a((c1q0) o4q0Var, wwg.S(-1760094768, true, new gj90(i5, tlsVar), btsVar), null, btsVar, (i3 & 14) | 48);
                btsVar.t(false);
            } else if (o4q0Var instanceof zlq0) {
                btsVar.e0(1701299142);
                a9b1.b((zlq0) o4q0Var, tlsVar, null, z2, btsVar, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 6) & 7168));
                btsVar.t(false);
            } else if (o4q0Var instanceof t0f) {
                btsVar.e0(1701464837);
                zsb1.b((t0f) o4q0Var, tlsVar, null, z2, btsVar, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 6) & 7168));
                btsVar.t(false);
            } else if (o4q0Var instanceof x9q0) {
                btsVar.e0(1701795173);
                k7b1.a((x9q0) o4q0Var, tlsVar, null, z2, btsVar, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 6) & 7168));
                z = z2;
                btsVar.t(false);
            } else {
                z = z2;
                if (o4q0Var instanceof c311) {
                    btsVar.e0(1702083349);
                    vtb1.a((c311) o4q0Var, tlsVar, null, btsVar, ((i3 >> 3) & 112) | (i3 & 14));
                    btsVar.t(false);
                } else {
                    if (!(o4q0Var instanceof el1)) {
                        throw unr0.y(-1469154216, btsVar, false);
                    }
                    btsVar.e0(1702277657);
                    bqa1.a(null, (el1) o4q0Var, tlsVar, btsVar, (i3 & 896) | ((i3 << 3) & 112), 1);
                    btsVar = btsVar;
                    btsVar.t(false);
                }
            }
            z = z2;
        } else {
            btsVar.Y();
        }
        boolean z3 = z;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new or1(o4q0Var, z3, tlsVar, i, i2);
        }
    }

    public static final Object e(es5 es5Var, gly0 gly0Var, Continuation continuation) {
        fyc b = gwk0.b();
        es5Var.d(new fs5(b));
        Object s = b.s(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
