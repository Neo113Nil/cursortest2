package ru.yandex.taxi.sdc.router;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.sdc.api.SdcRouteSelectionAction$ScreenType;
import defpackage.b7p0;
import defpackage.b8r;
import defpackage.bj70;
import defpackage.bvf0;
import defpackage.c4r0;
import defpackage.cdc;
import defpackage.ck31;
import defpackage.ffx;
import defpackage.fif;
import defpackage.jst;
import defpackage.lmp0;
import defpackage.npb;
import defpackage.oi70;
import defpackage.pte0;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.qlp0;
import defpackage.qmp0;
import defpackage.rg7;
import defpackage.tse;
import defpackage.wp2;
import defpackage.ynv0;
import defpackage.yp2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class e {
    public final tse a;
    public final fif b;
    public final c4r0 c;
    public final b8r d;
    public final com.yandex.go.route.interactor.c e;
    public final com.yandex.go.route.interactor.b f;
    public final pte0 g;
    public final qlp0 h;
    public final yp2 i;
    public final ck31 j;
    public final n0 k;
    public final n0 l;
    public final r0 m;
    public final n0 n;
    public final n0 o;
    public pzt0 p;

    public e(tse tseVar, fif fifVar, c4r0 c4r0Var, b8r b8rVar, com.yandex.go.route.interactor.c cVar, com.yandex.go.route.interactor.b bVar, pte0 pte0Var, qlp0 qlp0Var, yp2 yp2Var, ck31 ck31Var) {
        this.a = tseVar;
        this.b = fifVar;
        this.c = c4r0Var;
        this.d = b8rVar;
        this.e = cVar;
        this.f = bVar;
        this.g = pte0Var;
        this.h = qlp0Var;
        this.i = yp2Var;
        this.j = ck31Var;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.k = ffx.b(0, 1, bufferOverflow);
        this.l = ffx.b(0, 1, bufferOverflow);
        this.m = bvf0.c(null);
        this.n = ffx.b(0, 1, bufferOverflow);
        this.o = ffx.b(0, 1, bufferOverflow);
    }

    public final bj70 a(rg7 rg7Var) {
        String str = rg7Var.c;
        String str2 = rg7Var.b;
        Integer S = q5z.S(str);
        if (S == null) {
            return null;
        }
        int intValue = S.intValue();
        Integer S2 = q5z.S(str2);
        if (S2 == null) {
            return null;
        }
        int intValue2 = S2.intValue();
        AppColor$Palette appColor$Palette = AppColor$Palette.Control;
        yp2 yp2Var = this.i;
        wp2 a = yp2Var.a(str, appColor$Palette);
        return new bj70(new oi70(new cdc(intValue), a), new cdc(intValue2), yp2Var.a(str2, AppColor$Palette.TextOnControl));
    }

    public final void b(lmp0 lmp0Var, lmp0 lmp0Var2, boolean z, ynv0 ynv0Var, String str) {
        String str2 = lmp0Var.b;
        String str3 = lmp0Var.c;
        rg7 rg7Var = lmp0Var.d;
        qmp0 qmp0Var = new qmp0(str2, str3, rg7Var.a, a(rg7Var), z, ynv0Var, new b7p0(3, this), new npb(this, lmp0Var, lmp0Var2, ynv0Var, str, 7), new SdcRouteSelectionRouterImpl$showSourcePicker$3(0, this, e.class, "clear", "clear()V", 0));
        r0 r0Var = this.m;
        r0Var.getClass();
        r0Var.m(null, qmp0Var);
    }

    public final void c(String str, String str2, ArrayList arrayList, ynv0 ynv0Var) {
        Object obj;
        Object obj2;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((lmp0) obj).a == SdcRouteSelectionAction$ScreenType.SOURCE) {
                    break;
                }
            }
        }
        lmp0 lmp0Var = (lmp0) obj;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (((lmp0) obj2).a == SdcRouteSelectionAction$ScreenType.DESTINATION) {
                    break;
                }
            }
        }
        lmp0 lmp0Var2 = (lmp0) obj2;
        if (lmp0Var == null || lmp0Var2 == null) {
            jst.e.w(new IllegalStateException("Shortcut doesn't contain info for source or destination screen"));
            return;
        }
        pzt0 pzt0Var = this.p;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.p = com.yandex.go.coroutines.b.g(this.a, null, null, new SdcRouteSelectionRouterImpl$startRouteSelection$1(this, str, str2, lmp0Var, lmp0Var2, ynv0Var, null), 3);
    }
}
