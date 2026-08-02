package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class kph extends arh {
    public final MediaRouter2 i;
    public final awc j;
    public final ArrayMap k;
    public final MediaRouter2$RouteCallback l;
    public final jph m;
    public final fph n;
    public final dk7 o;
    public ArrayList p;
    public final ArrayMap q;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public kph(Context context, awc awcVar) {
        super(context, null);
        this.k = new ArrayMap();
        this.m = new jph(this);
        this.n = new fph(this);
        this.p = new ArrayList();
        this.q = new ArrayMap();
        this.i = MediaRouter2.getInstance(context);
        this.j = awcVar;
        this.o = new dk7(new Handler(Looper.getMainLooper()), 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.l = new iph(this, 1);
        } else {
            this.l = new iph(this, 0);
        }
    }

    public static Messenger i(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String k(zqh zqhVar) {
        MediaRouter2.RoutingController routingController;
        if ((zqhVar instanceof gph) && (routingController = ((gph) zqhVar).g) != null) {
            return routingController.getId();
        }
        return null;
    }

    @Override // defpackage.arh
    public final yqh c(String str) {
        Iterator it = this.k.entrySet().iterator();
        while (it.hasNext()) {
            gph gphVar = (gph) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, gphVar.f)) {
                return gphVar;
            }
        }
        return null;
    }

    @Override // defpackage.arh
    public final zqh d(String str) {
        return new hph((String) this.q.get(str), null);
    }

    @Override // defpackage.arh
    public final zqh e(String str, String str2) {
        String str3 = (String) this.q.get(str);
        for (gph gphVar : this.k.values()) {
            if (TextUtils.equals(str2, gphVar.p())) {
                return new hph(str3, gphVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new hph(str3, null);
    }

    @Override // defpackage.arh
    public final void f(fqh fqhVar) {
        ArrayList<String> arrayList;
        crh crhVar;
        RouteDiscoveryPreference build;
        String str;
        int i = krh.c == null ? 0 : krh.c().B;
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.l;
        fph fphVar = this.n;
        jph jphVar = this.m;
        if (i <= 0) {
            this.i.unregisterRouteCallback(mediaRouter2$RouteCallback);
            this.i.unregisterTransferCallback(jphVar);
            this.i.unregisterControllerCallback(fphVar);
            return;
        }
        mrh mrhVar = krh.c().u;
        boolean z = mrhVar == null ? false : mrhVar.c;
        if (fqhVar == null) {
            fqhVar = new fqh(crh.c, false);
        }
        fqhVar.a();
        ArrayList c = fqhVar.b.c();
        if (!z) {
            c.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!c.contains("android.media.intent.category.LIVE_AUDIO")) {
            c.add("android.media.intent.category.LIVE_AUDIO");
        }
        if (c.isEmpty()) {
            arrayList = null;
        } else {
            Iterator it = c.iterator();
            arrayList = null;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 == null) {
                    xq0.x("category must not be null");
                    return;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList == null) {
            crhVar = crh.c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            crhVar = new crh(bundle, arrayList);
        }
        boolean b = fqhVar.b();
        if (crhVar == null) {
            xq0.x("selector must not be null");
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("selector", crhVar.a);
        bundle2.putBoolean("activeScan", b);
        MediaRouter2 mediaRouter2 = this.i;
        crhVar.a();
        if (crhVar.b.contains(null)) {
            build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        } else {
            boolean z2 = bundle2.getBoolean("activeScan");
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = crhVar.c().iterator();
            while (it2.hasNext()) {
                str = (String) it2.next();
                str.getClass();
                switch (str) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str = "android.media.route.feature.LIVE_VIDEO";
                        break;
                }
                arrayList2.add(str);
            }
            build = new RouteDiscoveryPreference.Builder(arrayList2, z2).build();
        }
        dk7 dk7Var = this.o;
        mediaRouter2.registerRouteCallback(dk7Var, mediaRouter2$RouteCallback, build);
        this.i.registerTransferCallback(dk7Var, jphVar);
        this.i.registerControllerCallback(dk7Var, fphVar);
    }

    public final MediaRoute2Info j(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            MediaRoute2Info c = dlh.c(it.next());
            if (TextUtils.equals(c.getId(), str)) {
                return c;
            }
        }
        return null;
    }

    public final void l() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator<MediaRoute2Info> it = this.i.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info c = dlh.c(it.next());
            if (c != null && !arraySet.contains(c) && !c.isSystemRoute()) {
                arraySet.add(c);
                arrayList.add(c);
            }
        }
        if (arrayList.equals(this.p)) {
            return;
        }
        this.p = arrayList;
        ArrayMap arrayMap = this.q;
        arrayMap.clear();
        Iterator it2 = this.p.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info c2 = dlh.c(it2.next());
            Bundle extras = c2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + c2);
            } else {
                arrayMap.put(c2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.p.iterator();
        while (it3.hasNext()) {
            MediaRoute2Info c3 = dlh.c(it3.next());
            dqh R = qdq.R(c3);
            if (c3 != null) {
                arrayList2.add(R);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                dqh dqhVar = (dqh) it4.next();
                if (dqhVar == null) {
                    xq0.x("route must not be null");
                    return;
                } else {
                    if (arrayList3.contains(dqhVar)) {
                        xq0.x("route descriptor already added");
                        return;
                    }
                    arrayList3.add(dqhVar);
                }
            }
        }
        g(new bz2(arrayList3, true));
    }

    public final void m(MediaRouter2.RoutingController routingController) {
        cqh cqhVar;
        gph gphVar = (gph) this.k.get(routingController);
        if (gphVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList o = qdq.o(selectedRoutes);
        dqh R = qdq.R(dlh.c(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.a.getString(R.string.mr_dialog_default_group_name);
        dqh dqhVar = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    dqhVar = new dqh(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (dqhVar == null) {
            cqhVar = new cqh(routingController.getId(), string);
            Bundle bundle2 = cqhVar.a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            cqhVar = new cqh(dqhVar);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = cqhVar.a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        cqhVar.c.clear();
        cqhVar.a(R.b());
        ArrayList arrayList = cqhVar.b;
        arrayList.clear();
        if (!o.isEmpty()) {
            Iterator it = o.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (TextUtils.isEmpty(str)) {
                    xq0.x("groupMemberId must not be empty");
                    return;
                } else if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        dqh b = cqhVar.b();
        ArrayList o2 = qdq.o(routingController.getSelectableRoutes());
        ArrayList o3 = qdq.o(routingController.getDeselectableRoutes());
        bz2 bz2Var = this.g;
        if (bz2Var == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<dqh> list = (List) bz2Var.c;
        if (!list.isEmpty()) {
            for (dqh dqhVar2 : list) {
                String d = dqhVar2.d();
                arrayList2.add(new xqh(dqhVar2, o.contains(d) ? 3 : 1, o3.contains(d), o2.contains(d), true));
            }
        }
        gphVar.o = b;
        gphVar.l(b, arrayList2);
    }

    public final void n(String str) {
        MediaRoute2Info j = j(str);
        if (j != null) {
            this.i.transferTo(j);
            return;
        }
        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
    }
}
