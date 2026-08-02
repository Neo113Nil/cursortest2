package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class rho {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final rnj c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public g7x g;
    public final ciq a = new ciq(0);
    public final Messenger e = new Messenger(new q0x(this, Looper.getMainLooper()));

    public rho(Context context) {
        this.b = context;
        this.c = new rnj(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final onx a(Bundle bundle) {
        String num;
        synchronized (rho.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        i8s i8sVar = new i8s();
        synchronized (this.a) {
            this.a.put(num, i8sVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.y() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (rho.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, uzw.a);
                }
                intent.putExtra("app", i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.g.a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            i8sVar.a.b(f48.d, new z6u(7, this, num, this.d.schedule(new k0x(0, i8sVar), 30L, TimeUnit.SECONDS)));
            return i8sVar.a;
        }
        int y = this.c.y();
        Context context2 = this.b;
        if (y == 2) {
            context2.sendBroadcast(intent);
        } else {
            context2.startService(intent);
        }
        i8sVar.a.b(f48.d, new z6u(7, this, num, this.d.schedule(new k0x(0, i8sVar), 30L, TimeUnit.SECONDS)));
        return i8sVar.a;
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.a) {
            try {
                i8s i8sVar = (i8s) this.a.remove(str);
                if (i8sVar != null) {
                    i8sVar.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
