package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.logistics.cargo_flow.route_selector.CargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2;
import com.yandex.go.logistics.cargo_flow.route_selector.CargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3;
import com.yandex.go.payments.shared.family.web.nativeapi.request.BackgroundState;
import com.yandex.go.payments.shared.family.web.nativeapi.response.Contact;
import com.yandex.go.payments.shared.family.web.nativeapi.response.Postcard;
import com.yandex.go.payments.shared.family.web.nativeapi.response.PostcardInfoResponse;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes13.dex */
public final class qu8 implements nlm, sdq0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable w;

    public /* synthetic */ qu8(int i, Serializable serializable, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = serializable;
    }

    @Override // defpackage.nlm
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                jst.e.getClass();
                break;
            case 1:
                brb.a((kbp) obj, (String) this.w, EmptyList.a);
                break;
            default:
                ((Ref$ObjectRef) obj).element = null;
                break;
        }
    }

    @Override // defpackage.nlm
    public void d(IOException iOException) {
        jst.e.k(iOException, "Error driving route");
        ((CargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3) this.w).invoke(iOException);
    }

    @Override // defpackage.nlm
    public void e(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (in91.d((DrivingRoute) obj)) {
                    break;
                }
            }
        }
        DrivingRoute drivingRoute = (DrivingRoute) obj;
        if (drivingRoute == null) {
            drivingRoute = (DrivingRoute) list.get(0);
        }
        CargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2 cargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2 = (CargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2) this.b;
        List list2 = ((d0l0) this.c).b;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(a.F(((Address) it2.next()).B()));
        }
        cargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2.invoke(new a4l0(drivingRoute, null, arrayList, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    @Override // defpackage.sdq0
    public void h() {
        ?? r3;
        int i = this.a;
        Serializable serializable = this.w;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                brb.a((kbp) obj, (String) serializable, scc.h(((Ref$ObjectRef) obj2).element));
                break;
            default:
                com.yandex.go.payments.shared.family.postcard.ui.a aVar = (com.yandex.go.payments.shared.family.postcard.ui.a) obj2;
                bgq0 bgq0Var = (bgq0) ((Ref$ObjectRef) obj).element;
                String str = (String) serializable;
                List list = aVar.G;
                int i2 = aVar.F;
                String str2 = ((BackgroundState) ((i2 < 0 || i2 >= list.size()) ? new BackgroundState(0) : list.get(i2))).a;
                if (!aVar.I) {
                    if (bgq0Var != null) {
                        List<bgq0> singletonList = Collections.singletonList(bgq0Var);
                        r3 = new ArrayList(tcc.n(singletonList, 10));
                        for (bgq0 bgq0Var2 : singletonList) {
                            String str3 = bgq0Var2.b;
                            String str4 = bgq0Var2.a;
                            if (evu0.J(str4)) {
                                str4 = null;
                            }
                            r3.add(new Contact(str3, str4));
                        }
                    } else {
                        r3 = EmptyList.a;
                    }
                    PostcardInfoResponse postcardInfoResponse = new PostcardInfoResponse(r3, new Postcard(str2, str));
                    jst.e.getClass();
                    aVar.I = true;
                    ugd0 ugd0Var = aVar.D;
                    if (ugd0Var != null) {
                        ugd0Var.invoke(postcardInfoResponse);
                    }
                    ((kfe0) aVar.Dg()).dismissView();
                    break;
                }
                break;
        }
    }
}
