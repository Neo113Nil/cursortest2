package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class nrh extends MediaRouter.Callback {
    public final xtk a;

    public nrh(xtk xtkVar) {
        this.a = xtkVar;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        xtk xtkVar = this.a;
        if (xtkVar.i(routeInfo)) {
            xtkVar.t();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        xtk xtkVar = this.a;
        xtkVar.getClass();
        if (buk.n(routeInfo) != null || (j = xtkVar.j(routeInfo)) < 0) {
            return;
        }
        ztk ztkVar = (ztk) xtkVar.q.get(j);
        String str = ztkVar.b;
        CharSequence name = ztkVar.a.getName(xtkVar.a);
        cqh cqhVar = new cqh(str, name != null ? name.toString() : "");
        xtkVar.p(ztkVar, cqhVar);
        ztkVar.c = cqhVar.b();
        xtkVar.t();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        xtk xtkVar = this.a;
        int j = xtkVar.j(routeInfo);
        if (j >= 0) {
            ztk ztkVar = (ztk) xtkVar.q.get(j);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != ztkVar.c.a.getInt("presentationDisplayId", -1)) {
                dqh dqhVar = ztkVar.c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (dqhVar == null) {
                    xq0.x("descriptor must not be null");
                    return;
                }
                Bundle bundle = new Bundle(dqhVar.a);
                ArrayList c = dqhVar.c();
                ArrayList b = dqhVar.b();
                HashSet a = dqhVar.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                ztkVar.c = new dqh(bundle);
                xtkVar.t();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        xtk xtkVar = this.a;
        xtkVar.getClass();
        if (buk.n(routeInfo) != null || (j = xtkVar.j(routeInfo)) < 0) {
            return;
        }
        xtkVar.q.remove(j);
        xtkVar.t();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        irh irhVar;
        xtk xtkVar = this.a;
        if (routeInfo != xtkVar.j.getSelectedRoute(8388611)) {
            return;
        }
        auk n = buk.n(routeInfo);
        if (n != null) {
            n.a.l();
            return;
        }
        int j = xtkVar.j(routeInfo);
        if (j >= 0) {
            ztk ztkVar = (ztk) xtkVar.q.get(j);
            yld yldVar = xtkVar.i;
            String str = ztkVar.b;
            yldVar.a.removeMessages(262);
            hrh d = yldVar.d(yldVar.s);
            if (d != null) {
                Iterator it = d.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        irhVar = null;
                        break;
                    } else {
                        irhVar = (irh) it.next();
                        if (irhVar.b.equals(str)) {
                            break;
                        }
                    }
                }
                if (irhVar != null) {
                    irhVar.l();
                }
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int j;
        xtk xtkVar = this.a;
        xtkVar.getClass();
        if (buk.n(routeInfo) != null || (j = xtkVar.j(routeInfo)) < 0) {
            return;
        }
        ztk ztkVar = (ztk) xtkVar.q.get(j);
        int volume = routeInfo.getVolume();
        if (volume != ztkVar.c.a.getInt("volume")) {
            dqh dqhVar = ztkVar.c;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (dqhVar == null) {
                xq0.x("descriptor must not be null");
                return;
            }
            Bundle bundle = new Bundle(dqhVar.a);
            ArrayList c = dqhVar.c();
            ArrayList b = dqhVar.b();
            HashSet a = dqhVar.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
            ztkVar.c = new dqh(bundle);
            xtkVar.t();
        }
    }
}
