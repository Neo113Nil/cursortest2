package ru.yandex.taxi.masstransit.trains.schedule.uicomponents;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.i43;
import defpackage.jeb1;
import defpackage.kyh0;
import defpackage.l690;
import defpackage.ljs0;
import defpackage.o430;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.p91;
import defpackage.pi6;
import defpackage.qje;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.ss;
import defpackage.t1m0;
import defpackage.tls;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public abstract class a {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(752962778);
        if (btsVar.V(i & 1, i != 0)) {
            f530 k = an91.k(ljs0.c, 16.0f);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            jeb1.f(ohb1.e(btsVar, kyh0.mt_empty_schedules_text), null, AppColor$Palette.TextMinor, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, 384, 0, 16250);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t1m0(i);
        }
    }

    public static final void b(List list, androidx.compose.foundation.lazy.b bVar, int i, f530 f530Var, tls tlsVar, fid fidVar, int i2) {
        int i3;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1297762455);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.k(bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.c(i) ? 256 : 128;
        }
        int i4 = i3 | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
            float H = ((fwi) btsVar.m(j.h)).H(i) + 12.0f;
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z = (i5 == 32) | (i6 == 4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new ScheduleItemsKt$ScheduleItems$2$1(bVar, list, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            l690 l690Var = new l690(16.0f, H, 16.0f, 12.0f);
            i43 i43Var = new i43(8.0f, true, new quz(11));
            boolean z2 = (i6 == 4) | ((57344 & i4) == 16384);
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new ss(list, tlsVar, 3);
                btsVar.o0(Q2);
            }
            int i7 = i5 | ((i4 >> 9) & 14) | HProv.ALG_CLASS_DATA_ENCRYPT;
            c530 c530Var = c530.a;
            adb1.a(c530Var, bVar, l690Var, i43Var, null, null, false, null, (tls) Q2, btsVar, i7, 488);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new p91(list, bVar, i, f530Var2, tlsVar, i2);
        }
    }
}
