package N2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import d3.AbstractC4461a;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f1910h;
    public static PendingIntent i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f1911j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f1913b;

    /* renamed from: c, reason: collision with root package name */
    public final p f1914c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f1915d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f1917f;

    /* renamed from: g, reason: collision with root package name */
    public g f1918g;

    /* renamed from: a, reason: collision with root package name */
    public final s.k f1912a = new s.k();

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f1916e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f1913b = context;
        this.f1914c = new p(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f1915d = scheduledThreadPoolExecutor;
    }

    public final l3.m a(Bundle bundle) {
        String num;
        synchronized (b.class) {
            int i4 = f1910h;
            f1910h = i4 + 1;
            num = Integer.toString(i4);
        }
        l3.h hVar = new l3.h();
        synchronized (this.f1912a) {
            this.f1912a.put(num, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f1914c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f1913b;
        synchronized (b.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC4461a.f37181a);
                }
                intent.putExtra("app", i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + com.anythink.expressad.foundation.g.a.bU);
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f1916e);
        if (this.f1917f != null || this.f1918g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f1917f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f1918g.f1925n;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            hVar.f38870a.a(h.f1927v, new b3.e(8, this, num, this.f1915d.schedule(new G0.c(3, hVar), 30L, TimeUnit.SECONDS)));
            return hVar.f38870a;
        }
        if (this.f1914c.b() == 2) {
            this.f1913b.sendBroadcast(intent);
        } else {
            this.f1913b.startService(intent);
        }
        hVar.f38870a.a(h.f1927v, new b3.e(8, this, num, this.f1915d.schedule(new G0.c(3, hVar), 30L, TimeUnit.SECONDS)));
        return hVar.f38870a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f1912a) {
            try {
                l3.h hVar = (l3.h) this.f1912a.remove(str);
                if (hVar != null) {
                    hVar.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
