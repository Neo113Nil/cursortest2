package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class orl {
    public static final ov6 a = new ov6(0.2f, 0.0f, 0.8f, 1.0f);
    public static final qs5 b = new qs5(new ufl(24));

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i, final int i2, long j, hq5 hq5Var, yci yciVar, final boolean z) {
        int i3;
        yci yciVar2;
        long j2;
        yci yciVar3;
        sdr sdrVar;
        boolean f;
        Object K;
        final yci yciVar4;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1354366419);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && oq5Var.e(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            if ((i3 & 147) == 146 || !oq5Var.z()) {
                oq5Var.U();
                if ((i & 1) != 0 || oq5Var.y()) {
                    yciVar3 = i4 == 0 ? vci.a : yciVar2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j2 = ((dq0) oq5Var.j(eq0.a)).a.h;
                    }
                } else {
                    oq5Var.S();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    yciVar3 = yciVar2;
                }
                oq5Var.q();
                sdrVar = (sdr) oq5Var.j(b);
                Object obj = gq5.a;
                if (sdrVar == null) {
                    oq5Var.Z(-1006920418);
                    if (z) {
                        oq5Var.Z(-1006898625);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-1006838919);
                        Object K2 = oq5Var.K();
                        if (K2 == obj) {
                            K2 = tlm.h(1.0f, oq5Var);
                        }
                        sdrVar = (poi) K2;
                        oq5Var.p(false);
                    }
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-1006753359);
                    Object K3 = oq5Var.K();
                    if (K3 == obj) {
                        K3 = vq2.a(1.0f);
                        oq5Var.k0(K3);
                    }
                    fk0 fk0Var = (fk0) K3;
                    Boolean valueOf = Boolean.valueOf(z);
                    boolean h = ((i3 & 14) == 4) | oq5Var.h(fk0Var);
                    Object K4 = oq5Var.K();
                    if (h || K4 == obj) {
                        K4 = new z11(fk0Var, z, (Continuation) null, 15);
                        oq5Var.k0(K4);
                    }
                    gld.w(oq5Var, valueOf, (Function2) K4);
                    sdrVar = fk0Var.c;
                    oq5Var.p(false);
                }
                yci d = a.d(d.m(yciVar3, 12), 1.0f);
                f = oq5Var.f(sdrVar);
                K = oq5Var.K();
                if (!f || K == obj) {
                    K = new xp(sdrVar, 15);
                    oq5Var.k0(K);
                }
                ug3.a(androidx.compose.ui.platform.a.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(d, (Function1) K), j2, ugo.a), "playing_indicator"), oq5Var, 0);
                yciVar4 = yciVar3;
            } else {
                oq5Var.S();
                yciVar4 = yciVar2;
            }
            final long j3 = j2;
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: nrl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        orl.a(rvf.R(i | 1), i2, j3, (hq5) obj2, yciVar4, z);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
        }
        oq5Var.U();
        if ((i & 1) != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 4) != 0) {
        }
        oq5Var.q();
        sdrVar = (sdr) oq5Var.j(b);
        Object obj2 = gq5.a;
        if (sdrVar == null) {
        }
        yci d2 = a.d(d.m(yciVar3, 12), 1.0f);
        f = oq5Var.f(sdrVar);
        K = oq5Var.K();
        if (!f) {
        }
        K = new xp(sdrVar, 15);
        oq5Var.k0(K);
        ug3.a(androidx.compose.ui.platform.a.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(d2, (Function1) K), j2, ugo.a), "playing_indicator"), oq5Var, 0);
        yciVar4 = yciVar3;
        final long j32 = j2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void b(wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1070621025);
        if ((i & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            etn.l(b.a(fgq.s(fgq.D("playingIndicatorInfinite", oq5Var, 0), 1.0f, 0.6f, weo.C(weo.S(250, 0, a, 2), jyn.b, 0L, 4), "playingIndicatorScale", oq5Var, 29112, 0)), ild.C(1451623263, new y61(wn5Var, 22), oq5Var), oq5Var, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new y61(i, 23, wn5Var);
        }
    }

    public static final yci c(yci yciVar, boolean z, long j, oq5 oq5Var) {
        yciVar.getClass();
        boolean g = oq5Var.g(z) | oq5Var.e(j);
        Object K = oq5Var.K();
        if (g || K == gq5.a) {
            K = new mrl(0, j, z);
            oq5Var.k0(K);
        }
        return androidx.compose.ui.draw.a.b(yciVar, (Function1) K);
    }
}
