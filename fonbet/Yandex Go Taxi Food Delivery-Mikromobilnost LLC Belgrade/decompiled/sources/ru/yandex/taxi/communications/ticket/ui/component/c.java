package ru.yandex.taxi.communications.ticket.ui.component;

import androidx.compose.runtime.f;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import defpackage.aii0;
import defpackage.atz;
import defpackage.b8i0;
import defpackage.bts;
import defpackage.byk0;
import defpackage.did;
import defpackage.f530;
import defpackage.ffb1;
import defpackage.fid;
import defpackage.h3z0;
import defpackage.i3z0;
import defpackage.k0;
import defpackage.ljs0;
import defpackage.mhe;
import defpackage.mja1;
import defpackage.nsz;
import defpackage.oz40;
import defpackage.pvi0;
import defpackage.sls;
import defpackage.unr0;
import defpackage.v0b1;
import defpackage.w01;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwg;
import defpackage.xrl;
import defpackage.ymb1;
import defpackage.yrz;
import defpackage.ywy;
import defpackage.zpn;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;
import ru.yandex.taxi.communications.api.dto.ticket.h;

/* loaded from: classes5.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(TicketTopAsset ticketTopAsset, f530 f530Var, float f, sls slsVar, fid fidVar, int i) {
        int i2;
        int i3;
        boolean z;
        Object Q;
        boolean k;
        Object Q2;
        int intValue;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-514776611);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(ticketTopAsset) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.b(f) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            LottieCompositionResultImpl f2 = com.airbnb.lottie.compose.a.f(new atz(ticketTopAsset.a), btsVar, 0);
            h hVar = ticketTopAsset.c;
            TicketTopAsset.TicketTopAssetReplayMode ticketTopAssetReplayMode = hVar != null ? hVar.a : null;
            int i4 = ticketTopAssetReplayMode == null ? -1 : i3z0.b[ticketTopAssetReplayMode.ordinal()];
            if (i4 != -1) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        w511.b();
                        return;
                    } else {
                        Integer num = hVar.b;
                        intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                    }
                }
                i3 = intValue;
                boolean z2 = false;
                yrz c = com.airbnb.lottie.compose.a.c((nsz) f2.getValue(), false, false, false, 0.0f, i3, btsVar, 958);
                nsz nszVar = (nsz) f2.getValue();
                boolean k2 = btsVar.k(f2);
                if ((i2 & 7168) == 2048) {
                    z2 = true;
                }
                z = k2 | z2;
                Q = btsVar.Q();
                Object obj = did.a;
                if (!z || Q == obj) {
                    Q = new TicketTopAssetViewKt$LottieTopAssetView$1$1(slsVar, f2, null);
                    btsVar.o0(Q);
                }
                zpn.e(btsVar, (wls) Q, nszVar);
                nsz nszVar2 = (nsz) f2.getValue();
                k = btsVar.k(c);
                Q2 = btsVar.Q();
                if (!k || Q2 == obj) {
                    Q2 = new b8i0(c, 2);
                    btsVar.o0(Q2);
                }
                com.airbnb.lottie.compose.a.a(nszVar2, (sls) Q2, ljs0.e(ljs0.c(f530Var, 1.0f), f), false, false, false, false, null, false, null, null, null, false, false, null, null, false, btsVar, 0, 0, 131064);
                btsVar = btsVar;
            }
            i3 = 1;
            boolean z22 = false;
            yrz c2 = com.airbnb.lottie.compose.a.c((nsz) f2.getValue(), false, false, false, 0.0f, i3, btsVar, 958);
            nsz nszVar3 = (nsz) f2.getValue();
            boolean k22 = btsVar.k(f2);
            if ((i2 & 7168) == 2048) {
            }
            z = k22 | z22;
            Q = btsVar.Q();
            Object obj2 = did.a;
            if (!z) {
            }
            Q = new TicketTopAssetViewKt$LottieTopAssetView$1$1(slsVar, f2, null);
            btsVar.o0(Q);
            zpn.e(btsVar, (wls) Q, nszVar3);
            nsz nszVar22 = (nsz) f2.getValue();
            k = btsVar.k(c2);
            Q2 = btsVar.Q();
            if (!k) {
            }
            Q2 = new b8i0(c2, 2);
            btsVar.o0(Q2);
            com.airbnb.lottie.compose.a.a(nszVar22, (sls) Q2, ljs0.e(ljs0.c(f530Var, 1.0f), f), false, false, false, false, null, false, null, null, null, false, false, null, null, false, btsVar, 0, 0, 131064);
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xrl(ticketTopAsset, f530Var, f, slsVar, i, 3);
        }
    }

    public static final void b(f530 f530Var, TicketTopAsset ticketTopAsset, float f, byk0 byk0Var, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-495365883);
        int i2 = i | (btsVar.e(ticketTopAsset) ? 32 : 16) | (btsVar.b(f) ? 256 : 128) | (btsVar.k(byk0Var) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Boolean bool = (Boolean) oz40Var.getValue();
            bool.getClass();
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = new TicketTopAssetViewKt$TicketTopAssetView$1$1(slsVar, oz40Var, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, bool);
            TicketTopAsset.TicketTopAssetType ticketTopAssetType = ticketTopAsset.b;
            String str = ticketTopAsset.a;
            int i3 = i3z0.a[ticketTopAssetType.ordinal()];
            if (i3 == 1) {
                btsVar.e0(62968608);
                boolean k = btsVar.k(str);
                Object Q3 = btsVar.Q();
                if (k || Q3 == obj) {
                    Q3 = mja1.b(str, null, 6);
                    btsVar.o0(Q3);
                }
                pvi0 pvi0Var = (pvi0) Q3;
                ywy ywyVar = (ywy) ffb1.f(pvi0Var, btsVar, 0).getValue();
                boolean k2 = btsVar.k(ywyVar);
                Object Q4 = btsVar.Q();
                if (k2 || Q4 == obj) {
                    Q4 = new TicketTopAssetViewKt$TicketTopAssetView$2$1(ywyVar, oz40Var, null);
                    btsVar.o0(Q4);
                }
                zpn.e(btsVar, (wls) Q4, ywyVar);
                v0b1.a(pvi0Var, ymb1.l(ljs0.e(ljs0.c(f530Var, 1.0f), f), byk0Var), null, wwg.S(1326205388, true, new k0(f, 5), btsVar), wwg.S(57535309, true, new k0(f, 6), btsVar), null, null, mhe.d, 0.0f, 0, btsVar, 12610944, 864);
                btsVar.t(false);
            } else {
                if (i3 != 2) {
                    throw unr0.y(694766994, btsVar, false);
                }
                btsVar.e0(63694597);
                f530 l = ymb1.l(f530Var, byk0Var);
                Object Q5 = btsVar.Q();
                if (Q5 == obj) {
                    Q5 = new w01(29, oz40Var);
                    btsVar.o0(Q5);
                }
                a(ticketTopAsset, l, f, (sls) Q5, btsVar, ((i2 >> 3) & 14) | HProv.ALG_TYPE_SECURECHANNEL | (i2 & 896));
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new h3z0(f530Var, ticketTopAsset, f, byk0Var, slsVar, i);
        }
    }
}
