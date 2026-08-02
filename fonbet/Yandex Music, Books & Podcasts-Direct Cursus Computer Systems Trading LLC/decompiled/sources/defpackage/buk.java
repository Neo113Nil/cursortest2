package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class buk extends arh implements orh {
    public static final ArrayList s;
    public static final ArrayList t;
    public final yld i;
    public final MediaRouter j;
    public final nrh k;
    public final MediaRouter.VolumeCallback l;
    public final MediaRouter.RouteCategory m;
    public int n;
    public boolean o;
    public boolean p;
    public final ArrayList q;
    public final ArrayList r;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        s = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        t = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public buk(Context context, yld yldVar) {
        super(context, new qec(14, new ComponentName(ConstantDeviceInfo.APP_PLATFORM, buk.class.getName())));
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.i = yldVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.j = mediaRouter;
        this.k = new nrh((xtk) this);
        this.l = qrh.a(this);
        this.m = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        w();
    }

    public static auk n(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof auk) {
            return (auk) tag;
        }
        return null;
    }

    @Override // defpackage.orh
    public final void a(MediaRouter.RouteInfo routeInfo, int i) {
        auk n = n(routeInfo);
        if (n != null) {
            n.a.k(i);
        }
    }

    @Override // defpackage.orh
    public final void b(MediaRouter.RouteInfo routeInfo, int i) {
        auk n = n(routeInfo);
        if (n != null) {
            n.a.j(i);
        }
    }

    @Override // defpackage.arh
    public final zqh d(String str) {
        int k = k(str);
        if (k >= 0) {
            return new ytk(((ztk) this.q.get(k)).a);
        }
        return null;
    }

    @Override // defpackage.arh
    public final void f(fqh fqhVar) {
        boolean z;
        int i = 0;
        if (fqhVar != null) {
            fqhVar.a();
            ArrayList c = fqhVar.b.c();
            int size = c.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) c.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                i++;
            }
            z = fqhVar.b();
            i = i2;
        } else {
            z = false;
        }
        if (this.n == i && this.o == z) {
            return;
        }
        this.n = i;
        this.o = z;
        w();
    }

    public final boolean i(MediaRouter.RouteInfo routeInfo) {
        String format;
        String str;
        if (n(routeInfo) != null || j(routeInfo) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo m = m();
        Context context = this.a;
        if (m == routeInfo) {
            format = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = routeInfo.getName(context);
            format = String.format(locale, "ROUTE_%08x", Integer.valueOf((name != null ? name.toString() : "").hashCode()));
        }
        if (k(format) >= 0) {
            int i = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str = format + "_" + i;
                if (k(str) < 0) {
                    break;
                }
                i++;
            }
            format = str;
        }
        ztk ztkVar = new ztk(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        cqh cqhVar = new cqh(format, name2 != null ? name2.toString() : "");
        p(ztkVar, cqhVar);
        ztkVar.c = cqhVar.b();
        this.q.add(ztkVar);
        return true;
    }

    public final int j(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ztk) arrayList.get(i)).a == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    public final int k(String str) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ztk) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int l(irh irhVar) {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((auk) arrayList.get(i)).a == irhVar) {
                return i;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo m() {
        return this.j.getDefaultRoute();
    }

    public boolean o(ztk ztkVar) {
        return ztkVar.a.isConnecting();
    }

    public void p(ztk ztkVar, cqh cqhVar) {
        MediaRouter.RouteInfo routeInfo = ztkVar.a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            cqhVar.a(s);
        }
        if ((supportedTypes & 2) != 0) {
            cqhVar.a(t);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = cqhVar.a;
        Bundle bundle2 = cqhVar.a;
        bundle.putInt("playbackType", playbackType);
        bundle2.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle2.putInt("volume", routeInfo.getVolume());
        bundle2.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle2.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle2.putBoolean("isSystemRoute", (supportedTypes & 8388608) == 0);
        if (!routeInfo.isEnabled()) {
            bundle2.putBoolean("enabled", false);
        }
        if (o(ztkVar)) {
            bundle2.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle2.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle2.putString("status", description.toString());
        }
    }

    public final void q(irh irhVar) {
        arh c = irhVar.c();
        MediaRouter mediaRouter = this.j;
        if (c == this) {
            int j = j(mediaRouter.getSelectedRoute(8388611));
            if (j < 0 || !((ztk) this.q.get(j)).b.equals(irhVar.b)) {
                return;
            }
            irhVar.l();
            return;
        }
        MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.m);
        auk aukVar = new auk(irhVar, createUserRoute);
        createUserRoute.setTag(aukVar);
        createUserRoute.setVolumeCallback(this.l);
        x(aukVar);
        this.r.add(aukVar);
        mediaRouter.addUserRoute(createUserRoute);
    }

    public final void r(irh irhVar) {
        int l;
        if (irhVar.c() == this || (l = l(irhVar)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((auk) this.r.remove(l)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.j.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
        }
    }

    public final void s(irh irhVar) {
        if (irhVar.g()) {
            if (irhVar.c() != this) {
                int l = l(irhVar);
                if (l >= 0) {
                    u(((auk) this.r.get(l)).b);
                    return;
                }
                return;
            }
            int k = k(irhVar.b);
            if (k >= 0) {
                u(((ztk) this.q.get(k)).a);
            }
        }
    }

    public final void t() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.q;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            dqh dqhVar = ((ztk) arrayList2.get(i)).c;
            if (dqhVar == null) {
                xq0.x("route must not be null");
                return;
            } else {
                if (arrayList.contains(dqhVar)) {
                    xq0.x("route descriptor already added");
                    return;
                }
                arrayList.add(dqhVar);
            }
        }
        g(new bz2(arrayList, false));
    }

    public void u(MediaRouter.RouteInfo routeInfo) {
        this.j.selectRoute(8388611, routeInfo);
    }

    public void v() {
        boolean z = this.p;
        nrh nrhVar = this.k;
        MediaRouter mediaRouter = this.j;
        if (z) {
            mediaRouter.removeCallback(nrhVar);
        }
        this.p = true;
        mediaRouter.addCallback(this.n, nrhVar, (this.o ? 1 : 0) | 2);
    }

    public final void w() {
        v();
        MediaRouter mediaRouter = this.j;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z |= i((MediaRouter.RouteInfo) it.next());
        }
        if (z) {
            t();
        }
    }

    public void x(auk aukVar) {
        MediaRouter.UserRouteInfo userRouteInfo = aukVar.b;
        irh irhVar = aukVar.a;
        userRouteInfo.setName(irhVar.d);
        userRouteInfo.setPlaybackType(irhVar.l);
        userRouteInfo.setPlaybackStream(irhVar.m);
        userRouteInfo.setVolume(irhVar.p);
        userRouteInfo.setVolumeMax(irhVar.q);
        userRouteInfo.setVolumeHandling((!irhVar.e() || krh.h()) ? irhVar.o : 0);
        userRouteInfo.setDescription(irhVar.e);
    }
}
