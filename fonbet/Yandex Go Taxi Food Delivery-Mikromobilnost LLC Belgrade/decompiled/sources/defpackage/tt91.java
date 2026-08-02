package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class tt91 {
    public static final int[] a = {R.attr.state_pressed};
    public static final int[] b = {R.attr.state_focused};
    public static final int[] c = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] w = {R.attr.state_selected};
    public static mgv x;

    public static final void b(long j, String str, a aVar, f530 f530Var, fqm fqmVar, String str2, fid fidVar, int i) {
        int i2;
        String str3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-108689352);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.d(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= btsVar.k(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(f530Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(fqmVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.k(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.k(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar.e(null) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        int i3 = i2;
        if ((i3 & 4793491) == 4793490 && btsVar.E()) {
            btsVar.Y();
        } else {
            qnm qnmVar = qnm.a;
            qnm.c.getClass();
            f530 b2 = m4m0.b(f530Var, j, cyk0.c(16.0f));
            btsVar.e0(1849434622);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new c0m(23);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            f530 k = an91.k(fnq0.b(b2, true, (tls) Q), 16.0f);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            aVar.invoke(btsVar, Integer.valueOf((i3 >> 6) & 14));
            x2y x2yVar = new x2y(1.0f, true);
            qnm.d.getClass();
            f530 o2 = an91.o(x2yVar, 12.0f, 2.0f, 0.0f, 0.0f, 12);
            sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            long g0 = qnm.c(btsVar).g0();
            ety0 e = ltm.b(btsVar).e(btsVar);
            c530 c530Var = c530.a;
            f530 c2 = ljs0.c(c530Var, 1.0f);
            btsVar.e0(1849434622);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new c0m(24);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            int i4 = 4;
            vqy0.c(str3, fnq0.b(c2, false, (tls) Q2), g0, 0L, null, 0L, null, 0L, 2, false, 0, 0, e, btsVar, (i3 >> 3) & 14, 384, 126968);
            btsVar = btsVar;
            btsVar.e0(1406299523);
            if (str2 != null) {
                long h0 = qnm.c(btsVar).h0();
                ety0 g = ltm.b(btsVar).g(btsVar);
                f530 c3 = ljs0.c(an91.o(c530Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f);
                btsVar.e0(1849434622);
                Object Q3 = btsVar.Q();
                if (Q3 == o430Var) {
                    Q3 = new c0m(25);
                    btsVar.o0(Q3);
                }
                btsVar.t(false);
                c530Var = c530Var;
                vqy0.c(str2, fnq0.b(c3, false, (tls) Q3), h0, 0L, null, 0L, null, 0L, 2, false, 0, 0, g, btsVar, (i3 >> 18) & 14, 384, 126968);
                btsVar = btsVar;
            }
            btsVar.t(false);
            btsVar.e0(1406317909);
            if (fqmVar != null) {
                oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
                xab1.a(null, null, wwg.S(-1256988998, true, new bab(i4, fqmVar), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 7);
            }
            btsVar.t(false);
            btsVar.t(true);
            btsVar.e0(465345511);
            btsVar.t(false);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new om9(j, str, aVar, f530Var, fqmVar, str2, i);
        }
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        int[] iArr = b;
        return new ColorStateList(new int[][]{w, iArr, StateSet.NOTHING}, new int[]{d(colorStateList, c), d(colorStateList, iArr), d(colorStateList, a)});
    }

    public static int d(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return lhc.f(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList e(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    public static boolean f(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
