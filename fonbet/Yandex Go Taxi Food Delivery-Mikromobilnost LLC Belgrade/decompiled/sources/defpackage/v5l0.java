package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a6l0;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.t5l0;
import defpackage.tfx;
import defpackage.tls;
import defpackage.w8f;
import defpackage.wls;
import defpackage.x5l0;
import defpackage.yt0;
import defpackage.zy11;

/* loaded from: classes5.dex */
public final /* synthetic */ class v5l0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5l0 b;

    public /* synthetic */ v5l0(x5l0 x5l0Var, int i) {
        this.a = i;
        this.b = x5l0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final x5l0 x5l0Var = this.b;
        int i2 = 1;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qti.a(x5l0Var.b, wwg.S(-1212549655, true, new v5l0(x5l0Var, i2), btsVar), btsVar, 56);
                    break;
                }
            case 1:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    xi91.a(wwg.S(-1208569632, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.screen_route_list.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            a6l0 a6l0Var = x5l0.this.c;
                            fid fidVar2 = (fid) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String obj5 = a6l0Var.toString();
                                yt0 yt0Var = new yt0((j2m0) btsVar3.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), a6l0Var, 20);
                                rs31 a = f5z.a(btsVar3);
                                if (a == null) {
                                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                a6l0 a6l0Var2 = (a6l0) ooc.G(qoi0.a(a6l0.class), a, obj5, yt0Var, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar3);
                                oz40 c = androidx.lifecycle.compose.a.c(a6l0Var2.A, null, btsVar3, 0, 7);
                                boolean e = btsVar3.e(a6l0Var2);
                                Object Q = btsVar3.Q();
                                o430 o430Var = did.a;
                                if (e || Q == o430Var) {
                                    RouteListScreen$getView$1$1$1$1$1$1$1 routeListScreen$getView$1$1$1$1$1$1$1 = new RouteListScreen$getView$1$1$1$1$1$1$1(2, a6l0Var2, a6l0.class, "onDestinationsChanged", "onDestinationsChanged(II)V", 0);
                                    btsVar3.o0(routeListScreen$getView$1$1$1$1$1$1$1);
                                    Q = routeListScreen$getView$1$1$1$1$1$1$1;
                                }
                                wls wlsVar = (wls) ((tfx) Q);
                                boolean e2 = btsVar3.e(a6l0Var2);
                                Object Q2 = btsVar3.Q();
                                if (e2 || Q2 == o430Var) {
                                    RouteListScreen$getView$1$1$1$1$1$2$1 routeListScreen$getView$1$1$1$1$1$2$1 = new RouteListScreen$getView$1$1$1$1$1$2$1(1, a6l0Var2, a6l0.class, "onDeleteButtonClick", "onDeleteButtonClick(I)V", 0);
                                    btsVar3.o0(routeListScreen$getView$1$1$1$1$1$2$1);
                                    Q2 = routeListScreen$getView$1$1$1$1$1$2$1;
                                }
                                tls tlsVar = (tls) ((tfx) Q2);
                                boolean e3 = btsVar3.e(a6l0Var2);
                                Object Q3 = btsVar3.Q();
                                if (e3 || Q3 == o430Var) {
                                    RouteListScreen$getView$1$1$1$1$1$3$1 routeListScreen$getView$1$1$1$1$1$3$1 = new RouteListScreen$getView$1$1$1$1$1$3$1(1, a6l0Var2, a6l0.class, "onAddressClick", "onAddressClick(I)V", 0);
                                    btsVar3.o0(routeListScreen$getView$1$1$1$1$1$3$1);
                                    Q3 = routeListScreen$getView$1$1$1$1$1$3$1;
                                }
                                tls tlsVar2 = (tls) ((tfx) Q3);
                                boolean e4 = btsVar3.e(a6l0Var2);
                                Object Q4 = btsVar3.Q();
                                if (e4 || Q4 == o430Var) {
                                    RouteListScreen$getView$1$1$1$1$1$4$1 routeListScreen$getView$1$1$1$1$1$4$1 = new RouteListScreen$getView$1$1$1$1$1$4$1(0, a6l0Var2, a6l0.class, "onDoneButtonClick", "onDoneButtonClick()V", 0);
                                    btsVar3.o0(routeListScreen$getView$1$1$1$1$1$4$1);
                                    Q4 = routeListScreen$getView$1$1$1$1$1$4$1;
                                }
                                t5l0.a(c, wlsVar, tlsVar, tlsVar2, (sls) ((tfx) Q4), btsVar3, 0);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar2), btsVar2, 6);
                    break;
                }
            default:
                bts btsVar3 = (bts) fidVar;
                if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    sb2.b(nnm.f(x5l0Var.b, btsVar3, qti.e), wwg.S(688134130, true, new v5l0(x5l0Var, r4 ? 1 : 0), btsVar3), btsVar3, 56);
                    break;
                }
        }
        return zy11Var;
    }
}
