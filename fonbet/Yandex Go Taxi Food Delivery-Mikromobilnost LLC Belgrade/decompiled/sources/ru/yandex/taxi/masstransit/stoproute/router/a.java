package ru.yandex.taxi.masstransit.stoproute.router;

import androidx.compose.animation.g;
import androidx.compose.runtime.f;
import com.google.ar.core.ImageMetadata;
import defpackage.bgd;
import defpackage.bms;
import defpackage.bpb1;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.ger;
import defpackage.k340;
import defpackage.o430;
import defpackage.oz40;
import defpackage.sp5;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.xfd;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xfd xfdVar = (xfd) obj;
        k340 k340Var = (k340) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        ComposableSingletons$MtStopRouteRouterKt composableSingletons$MtStopRouteRouterKt = ComposableSingletons$MtStopRouteRouterKt.a;
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? ((bts) fidVar).k(k340Var) : fidVar.e(k340Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(i & 1, (i & 147) != 146);
        zy11 zy11Var = zy11.a;
        if (!V) {
            btsVar.Y();
            return zy11Var;
        }
        wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 48, 0, 8189);
        int a2 = ger.a(a, 292.0f, true, btsVar, 432, 12);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = f.j(Boolean.TRUE);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        boolean k = btsVar.k(a) | btsVar.c(a2);
        Object Q2 = btsVar.Q();
        if (k || Q2 == o430Var) {
            Q2 = new ComposableSingletons$MtStopRouteRouterKt$lambda$832771474$1$1$1(a, a2, oz40Var, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, zy11Var);
        g.e(((Boolean) oz40Var.getValue()).booleanValue(), null, null, null, null, wwg.S(-1946068038, true, new sp5(20, a, xfdVar), btsVar), btsVar, ImageMetadata.EDGE_MODE, 30);
        bpb1.b(k340Var, ((bgd) xfdVar).a, a, null, btsVar, 8 | ((i >> 3) & 14));
        return zy11Var;
    }
}
