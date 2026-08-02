package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.digits_input;

import androidx.compose.runtime.f;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.eja1;
import defpackage.fid;
import defpackage.g0;
import defpackage.hoy0;
import defpackage.o430;
import defpackage.osb1;
import defpackage.oz40;
import defpackage.tls;
import defpackage.u50;
import defpackage.vfc;
import defpackage.wls;
import defpackage.xjj;
import defpackage.yur;
import defpackage.zpn;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(xjj xjjVar, wls wlsVar, wls wlsVar2, wls wlsVar3, fid fidVar, int i) {
        int i2;
        wls wlsVar4;
        wls wlsVar5;
        xjj xjjVar2;
        bts btsVar;
        oz40 oz40Var;
        String str = xjjVar.c;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(118605440);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(xjjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(wlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            wlsVar4 = wlsVar2;
            i2 |= btsVar2.e(wlsVar4) ? 256 : 128;
        } else {
            wlsVar4 = wlsVar2;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            wlsVar5 = wlsVar3;
            i2 |= btsVar2.e(wlsVar5) ? 2048 : 1024;
        } else {
            wlsVar5 = wlsVar3;
        }
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean k = btsVar2.k(str);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                int length = str.length();
                Q = f.j(new hoy0(str, eja1.c(length, length), 4));
                btsVar2.o0(Q);
            }
            oz40 oz40Var2 = (oz40) Q;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object Q2 = btsVar2.Q();
            if (z || Q2 == o430Var) {
                u50 u50Var = new u50(wlsVar4, xjjVar, wlsVar5, wlsVar, oz40Var2, 9);
                xjjVar2 = xjjVar;
                oz40Var = oz40Var2;
                btsVar2.o0(u50Var);
                Q2 = u50Var;
            } else {
                oz40Var = oz40Var2;
                xjjVar2 = xjjVar;
            }
            tls tlsVar = (tls) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = vfc.g(btsVar2);
            }
            yur yurVar = (yur) Q3;
            btsVar2.e0(-1382427272);
            btsVar = btsVar2;
            osb1.a(xjjVar2.e, (hoy0) oz40Var.getValue(), yurVar, tlsVar, btsVar, 384);
            btsVar.t(false);
            Boolean valueOf = Boolean.valueOf(xjjVar2.d);
            boolean k2 = btsVar.k(oz40Var) | (i3 == 4);
            Object Q4 = btsVar.Q();
            if (k2 || Q4 == o430Var) {
                Q4 = new DigitsInputKt$DigitsInputContent$1$1(xjjVar2, yurVar, oz40Var, null);
                btsVar.o0(Q4);
            }
            zpn.e(btsVar, (wls) Q4, valueOf);
        } else {
            xjjVar2 = xjjVar;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(xjjVar2, wlsVar, wlsVar2, wlsVar3, i, 20);
        }
    }
}
