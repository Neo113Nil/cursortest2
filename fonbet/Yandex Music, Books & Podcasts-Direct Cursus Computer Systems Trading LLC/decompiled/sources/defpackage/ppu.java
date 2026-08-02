package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class ppu {
    public static final float a = 156;

    public static final void a(final xpu xpuVar, Function0 function0, hq5 hq5Var, int i) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(817377381);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(xpuVar) : oq5Var.h(xpuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        vci vciVar = vci.a;
        if (i3 == 0) {
            i2 |= oq5Var.f(vciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci d = d.d(vciVar, 1.0f);
            final int i4 = 0;
            final int i5 = 1;
            s7g.k(ild.C(2048054705, new Function2() { // from class: opu
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i4;
                    xpu xpuVar2 = xpuVar;
                    switch (i6) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    break;
                                }
                            }
                            qhi.b(xpuVar2.a, qmu.a, d.m(a.m(vci.a, 4), ppu.a), false, hq5Var2, 432, 8);
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var3;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    break;
                                }
                            }
                            q7g.u(0, hq5Var3, null, rvf.N(R.string.wave_for_two_invitation_title, new Object[]{xpuVar2.b}, hq5Var3));
                    }
                    return Unit.a;
                }
            }, oq5Var), ild.C(-1028632974, new Function2() { // from class: opu
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    xpu xpuVar2 = xpuVar;
                    switch (i6) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    break;
                                }
                            }
                            qhi.b(xpuVar2.a, qmu.a, d.m(a.m(vci.a, 4), ppu.a), false, hq5Var2, 432, 8);
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var3;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    break;
                                }
                            }
                            q7g.u(0, hq5Var3, null, rvf.N(R.string.wave_for_two_invitation_title, new Object[]{xpuVar2.b}, hq5Var3));
                    }
                    return Unit.a;
                }
            }, oq5Var), x97.f, ild.C(1407926260, new k0r(27, xpuVar, function0), oq5Var), d, false, x97.h, oq5Var, 12586422, 96);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new npu(xpuVar, function0, i);
        }
    }
}
