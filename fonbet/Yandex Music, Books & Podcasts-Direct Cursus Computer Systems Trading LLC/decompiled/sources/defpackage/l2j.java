package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import ru.yandex.video.m3.player.utils.network.NetworkType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class l2j {
    public static final ogp d = new ogp();
    public static volatile l2j e;
    public static final tf6 f;
    public final yjj a = new yjj();
    public final mm6 b;
    public volatile NetworkType c;

    static {
        b43 b43Var = new b43(rre.f, 9);
        wqr n = a4g.n();
        dq7 dq7Var = ca8.a;
        f = gld.e(e.c(n, mn7.d).plus(b43Var));
    }

    public l2j(Context context, mm6 mm6Var) {
        this.b = mm6Var;
        context.registerReceiver(new l83(15, this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public static NetworkType b(Context context) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = e(context);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            Log.d("YP:NetworkTypeProvider", fob.b(a));
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        NetworkType networkType = (NetworkType) t7oVar;
        return networkType == null ? NetworkType.NETWORK_TYPE_UNKNOWN : networkType;
    }

    public static NetworkType e(Context context) {
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return NetworkType.NETWORK_TYPE_UNKNOWN;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return NetworkType.NETWORK_TYPE_UNKNOWN;
            }
            if (!activeNetworkInfo.isConnected()) {
                return NetworkType.NETWORK_TYPE_OFFLINE;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return NetworkType.NETWORK_TYPE_WIFI;
                }
                if (type != 4 && type != 5) {
                    return type != 6 ? type != 9 ? NetworkType.NETWORK_TYPE_OTHER : NetworkType.NETWORK_TYPE_ETHERNET : NetworkType.NETWORK_TYPE_4G;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 20:
                    if (Build.VERSION.SDK_INT < 29) {
                        break;
                    } else {
                        break;
                    }
            }
            return NetworkType.NETWORK_TYPE_UNKNOWN;
        } catch (SecurityException unused) {
            return NetworkType.NETWORK_TYPE_UNKNOWN;
        }
    }

    public final void a(lzi lziVar) {
        HashSet u0;
        Object t7oVar;
        lziVar.getClass();
        this.a.a(lziVar);
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((lzi) next).a(d());
                t7oVar = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
    }

    public final NetworkType c(Context context) {
        context.getClass();
        NetworkType networkType = this.c;
        if (networkType != null) {
            return networkType;
        }
        return (NetworkType) x97.D(g.a, new rlg(this, context, (Continuation) null, 12));
    }

    public final NetworkType d() {
        NetworkType networkType = this.c;
        return networkType == null ? NetworkType.NETWORK_TYPE_UNKNOWN : networkType;
    }
}
