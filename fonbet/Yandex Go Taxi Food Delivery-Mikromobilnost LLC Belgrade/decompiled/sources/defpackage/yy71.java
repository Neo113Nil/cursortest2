package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.yandex.yx_platform_api.InternetConnectionStreamHandler;
import yads.lj0;
import yads.mn2;
import yads.nn2;
import yads.pn2;

/* loaded from: classes7.dex */
public final class yy71 {
    public static final mn2 h = new mn2(1);
    public final lj0 a;
    public final CopyOnWriteArraySet b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public List g;

    public yy71(Context context, wu81 wu81Var, i191 i191Var) {
        context.getApplicationContext();
        this.d = true;
        this.g = Collections.EMPTY_LIST;
        this.b = new CopyOnWriteArraySet();
        Handler v = rf71.v(new j7m(4, this));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        lj0 lj0Var = new lj0(handlerThread, wu81Var, i191Var, v, this.d);
        this.a = lj0Var;
        a681 a681Var = new a681(context, new gp51(23, this));
        a681Var.g.post(new jy31(29, a681Var));
        IntentFilter intentFilter = new IntentFilter();
        mn2 mn2Var = a681Var.c;
        int i = mn2Var.b & 1;
        Context context2 = a681Var.a;
        if (i != 0) {
            if (rf71.a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                connectivityManager.getClass();
                pn2 pn2Var = new pn2(a681Var);
                a681Var.f = pn2Var;
                connectivityManager.registerDefaultNetworkCallback(pn2Var);
            } else {
                intentFilter.addAction(InternetConnectionStreamHandler.CONNECTIVITY_ACTION);
            }
        }
        if ((mn2Var.b & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((4 & mn2Var.b) != 0) {
            if (rf71.a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((mn2Var.b & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        context2.registerReceiver(new nn2(a681Var), intentFilter, null, a681Var.d);
        int i2 = a681Var.e;
        this.e = i2;
        this.c = 1;
        lj0Var.obtainMessage(0, i2, 0).sendToTarget();
    }

    public final boolean a() {
        boolean z;
        if (!this.d && this.e != 0) {
            for (int i = 0; i < this.g.size(); i++) {
                if (((pg71) this.g.get(i)).b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = this.f != z;
        this.f = z;
        return z2;
    }
}
