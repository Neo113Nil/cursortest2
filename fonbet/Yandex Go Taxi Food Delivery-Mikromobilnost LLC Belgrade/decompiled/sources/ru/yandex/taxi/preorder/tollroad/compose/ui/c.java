package ru.yandex.taxi.preorder.tollroad.compose.ui;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.l0;
import defpackage.lg6;
import defpackage.ls40;
import defpackage.luk0;
import defpackage.o430;
import defpackage.sls;
import defpackage.tls;
import defpackage.tx40;
import defpackage.up2;
import defpackage.v6k0;
import defpackage.vnf0;
import defpackage.vuz;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.ytk0;
import defpackage.zpn;
import java.util.WeakHashMap;

/* loaded from: classes14.dex */
public abstract class c {
    public static final void a(luk0 luk0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(673624838);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(luk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 896) == 256;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new v6k0(7, tlsVar);
                btsVar.o0(Q);
            }
            int i4 = i3;
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, (sls) Q, null, btsVar, 0, 0, 6143);
            int i5 = i4 >> 3;
            b(a, tlsVar, btsVar, i5 & 112);
            int i6 = i4 >> 6;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.f(0.0f);
                btsVar.o0(Q2);
            }
            tx40 tx40Var = (tx40) Q2;
            boolean z2 = (((i6 & 14) ^ 6) > 4 && btsVar.k(tlsVar)) || (i6 & 6) == 4;
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new lg6(new up2(up2.b), tx40Var, new v6k0(8, tlsVar));
                btsVar.o0(Q3);
            }
            androidx.compose.runtime.internal.a S = wwg.S(-1430050381, true, new ls40(luk0Var, a, tlsVar, 10), btsVar);
            androidx.compose.runtime.internal.a S2 = wwg.S(782539366, true, new l0(27, luk0Var, tlsVar), btsVar);
            int i7 = (i5 & 14) | 100663296;
            c530 c530Var = c530.a;
            com.yandex.go.design.compose.modal.bottomsheet.c.a(c530Var, a, (lg6) Q3, false, false, null, null, null, S, null, null, S2, btsVar, i7, 48, 1784);
            btsVar = btsVar;
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0((Object) luk0Var, f530Var2, tlsVar, i, 18);
        }
    }

    public static final void b(wg6 wg6Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2092134961);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(wg6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            int i3 = vuz.o(btsVar).g.e().b;
            int w0 = (int) fwiVar.w0(56.0f);
            Object[] objArr = {wg6Var, tlsVar, Integer.valueOf(i3), Integer.valueOf(w0)};
            boolean c = ((i2 & 14) == 4) | ((i2 & 112) == 32) | btsVar.c(i3) | btsVar.c(w0);
            Object Q = btsVar.Q();
            if (c || Q == did.a) {
                RoadsPaneKt$SendBottomSheetHeightChangedUiActionEffect$1$1 roadsPaneKt$SendBottomSheetHeightChangedUiActionEffect$1$1 = new RoadsPaneKt$SendBottomSheetHeightChangedUiActionEffect$1$1(wg6Var, tlsVar, i3, w0, null);
                btsVar.o0(roadsPaneKt$SendBottomSheetHeightChangedUiActionEffect$1$1);
                Q = roadsPaneKt$SendBottomSheetHeightChangedUiActionEffect$1$1;
            }
            zpn.h(objArr, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ytk0(wg6Var, tlsVar, i, 0);
        }
    }
}
