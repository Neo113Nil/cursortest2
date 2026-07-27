package L2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import b3.AbstractC0516a;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f1621h;
    public static PendingIntent i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f1622j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f1624b;

    /* renamed from: c, reason: collision with root package name */
    public final o f1625c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f1626d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f1628f;

    /* renamed from: g, reason: collision with root package name */
    public g f1629g;

    /* renamed from: a, reason: collision with root package name */
    public final s.k f1623a = new s.k();

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f1627e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f1624b = context;
        this.f1625c = new o(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f1626d = scheduledThreadPoolExecutor;
    }

    public final j3.m a(Bundle bundle) {
        String num;
        synchronized (b.class) {
            int i6 = f1621h;
            f1621h = i6 + 1;
            num = Integer.toString(i6);
        }
        j3.h hVar = new j3.h();
        synchronized (this.f1623a) {
            this.f1623a.put(num, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f1625c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f1624b;
        synchronized (b.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC0516a.f5414a);
                }
                intent.putExtra("app", i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + com.anythink.expressad.foundation.g.a.bU);
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f1627e);
        if (this.f1628f != null || this.f1629g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f1628f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f1629g.f1636n;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            hVar.f38358a.a(h.f1638v, new Z2.e(8, this, num, this.f1626d.schedule(new G0.c(3, hVar), 30L, TimeUnit.SECONDS)));
            return hVar.f38358a;
        }
        if (this.f1625c.b() == 2) {
            this.f1624b.sendBroadcast(intent);
        } else {
            this.f1624b.startService(intent);
        }
        hVar.f38358a.a(h.f1638v, new Z2.e(8, this, num, this.f1626d.schedule(new G0.c(3, hVar), 30L, TimeUnit.SECONDS)));
        return hVar.f38358a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f1623a) {
            try {
                j3.h hVar = (j3.h) this.f1623a.remove(str);
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
