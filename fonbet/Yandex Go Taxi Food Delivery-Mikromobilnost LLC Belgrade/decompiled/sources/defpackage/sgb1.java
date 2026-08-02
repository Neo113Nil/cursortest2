package defpackage;

import android.util.Log;
import androidx.compose.animation.core.b;
import androidx.compose.runtime.internal.a;
import com.yandex.go.design.compose.slot.SlotSize;

/* loaded from: classes11.dex */
public abstract class sgb1 {
    public static int a = 3;

    public static final void a(viu0 viu0Var, tls tlsVar, boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1403224115);
        int i2 = i | (btsVar.k(viu0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.a(z) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = viu0Var.b;
            p5l0 p5l0Var = viu0Var.d;
            m3u0 b = b.b(z2 ? -180.0f : 0.0f, sb2.K(200, 0, null, 6), null, null, btsVar, 48, 28);
            boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new gyt0(3, tlsVar, viu0Var);
                btsVar.o0(Q);
            }
            f530 b2 = q791.b(c530.a, null, null, false, null, new awk0(0), (sls) Q, 12);
            SlotSize slotSize = SlotSize.XS;
            a S = wwg.S(-1086805923, true, new w7o0(26, viu0Var), btsVar);
            a S2 = wwg.S(-611639166, true, new ays0(5, viu0Var, b), btsVar);
            btsVar = btsVar;
            ydb1.a(b2, S, S2, null, null, null, slotSize, false, btsVar, 1573296, 184);
            if (!z || p5l0Var == null) {
                btsVar.e0(534060783);
                btsVar.t(false);
            } else {
                btsVar.e0(534016577);
                r5l0.a(p5l0Var, null, btsVar, 0);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(viu0Var, tlsVar, z, i, 29);
        }
    }

    public static void b(long j, ef90 ef90Var, g001[] g001VarArr) {
        int i;
        while (true) {
            if (ef90Var.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (ef90Var.a() == 0) {
                    i = -1;
                    break;
                }
                int y = ef90Var.y();
                i2 += y;
                if (y != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (ef90Var.a() == 0) {
                    i3 = -1;
                    break;
                }
                int y2 = ef90Var.y();
                i3 += y2;
                if (y2 != 255) {
                    break;
                }
            }
            int i4 = ef90Var.b + i3;
            if (i3 == -1 || i3 > ef90Var.a()) {
                lk91.j("Skipping remainder of malformed SEI NAL unit.");
                i4 = ef90Var.c;
            } else if (i == 4 && i3 >= 8) {
                int y3 = ef90Var.y();
                int E = ef90Var.E();
                int k = E == 49 ? ef90Var.k() : 0;
                int y4 = ef90Var.y();
                if (E == 47) {
                    ef90Var.L(1);
                }
                boolean z = y3 == 181 && (E == 49 || E == 47) && y4 == 3;
                if (E == 49) {
                    z &= k == 1195456820;
                }
                if (z) {
                    c(j, ef90Var, g001VarArr);
                }
            }
            ef90Var.K(i4);
        }
    }

    public static void c(long j, ef90 ef90Var, g001[] g001VarArr) {
        int y = ef90Var.y();
        if ((y & 64) != 0) {
            ef90Var.L(1);
            int i = (y & 31) * 3;
            int i2 = ef90Var.b;
            for (g001 g001Var : g001VarArr) {
                ef90Var.K(i2);
                g001Var.a(ef90Var, i, 0);
                d6z.x(j != -9223372036854775807L);
                g001Var.c(j, 1, i, 0, null);
            }
        }
    }

    public static void d(String str, String str2) {
        if (g(6, str)) {
            Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (g(6, str)) {
            Log.e(str, str2, th);
        }
    }

    public static void f(String str, String str2) {
        if (g(4, str)) {
            Log.i(str, str2);
        }
    }

    public static boolean g(int i, String str) {
        return a <= i || Log.isLoggable(str, i);
    }
}
