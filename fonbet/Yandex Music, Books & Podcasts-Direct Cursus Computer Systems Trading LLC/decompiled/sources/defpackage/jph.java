package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class jph extends MediaRouter2$TransferCallback {
    public final /* synthetic */ kph a;

    public jph(kph kphVar) {
        this.a = kphVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        kph kphVar = this.a;
        zqh zqhVar = (zqh) kphVar.k.remove(routingController);
        if (zqhVar == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
            return;
        }
        yld yldVar = (yld) kphVar.j.a;
        if (zqhVar != yldVar.e) {
            int i = yld.F;
            return;
        }
        irh c = yldVar.c();
        if (yldVar.e() != c) {
            yldVar.j(c, 2);
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        irh irhVar;
        this.a.k.remove(routingController);
        if (routingController2 == this.a.i.getSystemController()) {
            yld yldVar = (yld) this.a.j.a;
            irh c = yldVar.c();
            if (yldVar.e() != c) {
                yldVar.j(c, 3);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        String id = dlh.c(selectedRoutes.get(0)).getId();
        this.a.k.put(routingController2, new gph(this.a, routingController2, id));
        yld yldVar2 = (yld) this.a.j.a;
        Iterator it = yldVar2.j.iterator();
        while (true) {
            if (!it.hasNext()) {
                irhVar = null;
                break;
            }
            irhVar = (irh) it.next();
            if (irhVar.c() == yldVar2.r && TextUtils.equals(id, irhVar.b)) {
                break;
            }
        }
        if (irhVar == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
        } else {
            yldVar2.j(irhVar, 3);
        }
        this.a.m(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
