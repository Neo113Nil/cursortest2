package l6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import g7.o;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import s.q0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static int f4164h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f4165i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f4166j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f4168b;

    /* renamed from: c, reason: collision with root package name */
    public final m f4169c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4170d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f4172f;

    /* renamed from: g, reason: collision with root package name */
    public f f4173g;

    /* renamed from: a, reason: collision with root package name */
    public final q0 f4167a = new q0(0);

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f4171e = new Messenger(new c(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f4168b = context;
        this.f4169c = new m(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f4170d = scheduledThreadPoolExecutor;
    }

    public final o a(Bundle bundle) {
        String num;
        synchronized (a.class) {
            int i10 = f4164h;
            f4164h = i10 + 1;
            num = Integer.toString(i10);
        }
        g7.h hVar = new g7.h();
        synchronized (this.f4167a) {
            this.f4167a.put(num, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f4169c.r() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f4168b;
        synchronized (a.class) {
            try {
                if (f4165i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f4165i = PendingIntent.getBroadcast(context, 0, intent2, z6.a.f9158a);
                }
                intent.putExtra("app", f4165i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f4171e);
        if (this.f4172f != null || this.f4173g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f4172f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f4173g.f4177g;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            hVar.f2537a.a(n.f4205g, new a5.c(this, num, this.f4170d.schedule(new b4.g(4, hVar), 30L, TimeUnit.SECONDS)));
            return hVar.f2537a;
        }
        if (this.f4169c.r() == 2) {
            this.f4168b.sendBroadcast(intent);
        } else {
            this.f4168b.startService(intent);
        }
        hVar.f2537a.a(n.f4205g, new a5.c(this, num, this.f4170d.schedule(new b4.g(4, hVar), 30L, TimeUnit.SECONDS)));
        return hVar.f2537a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f4167a) {
            try {
                g7.h hVar = (g7.h) this.f4167a.remove(str);
                if (hVar != null) {
                    hVar.a(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
