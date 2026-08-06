package p0;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import s0.C1045a;

/* renamed from: p0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002B {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f8332g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static C1002B f8333h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f8334i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8335a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f8336b;

    /* renamed from: c, reason: collision with root package name */
    public volatile A0.a f8337c;

    /* renamed from: d, reason: collision with root package name */
    public final C1045a f8338d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8339e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8340f;

    public C1002B(Context context, Looper looper) {
        C1001A c1001a = new C1001A(this);
        this.f8336b = context.getApplicationContext();
        A0.a aVar = new A0.a(looper, c1001a);
        Looper.getMainLooper();
        this.f8337c = aVar;
        this.f8338d = C1045a.a();
        this.f8339e = 5000L;
        this.f8340f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z2) {
        C1028y c1028y = new C1028y(str, z2);
        AbstractC1021r.d(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8335a) {
            try {
                ServiceConnectionC1029z serviceConnectionC1029z = (ServiceConnectionC1029z) this.f8335a.get(c1028y);
                if (serviceConnectionC1029z == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(c1028y.toString()));
                }
                if (!serviceConnectionC1029z.f8425a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(c1028y.toString()));
                }
                serviceConnectionC1029z.f8425a.remove(serviceConnection);
                if (serviceConnectionC1029z.f8425a.isEmpty()) {
                    this.f8337c.sendMessageDelayed(this.f8337c.obtainMessage(0, c1028y), this.f8339e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(C1028y c1028y, ServiceConnectionC1024u serviceConnectionC1024u, String str) {
        boolean z2;
        synchronized (this.f8335a) {
            try {
                ServiceConnectionC1029z serviceConnectionC1029z = (ServiceConnectionC1029z) this.f8335a.get(c1028y);
                if (serviceConnectionC1029z == null) {
                    serviceConnectionC1029z = new ServiceConnectionC1029z(this, c1028y);
                    serviceConnectionC1029z.f8425a.put(serviceConnectionC1024u, serviceConnectionC1024u);
                    serviceConnectionC1029z.a(str, null);
                    this.f8335a.put(c1028y, serviceConnectionC1029z);
                } else {
                    this.f8337c.removeMessages(0, c1028y);
                    if (serviceConnectionC1029z.f8425a.containsKey(serviceConnectionC1024u)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(c1028y.toString()));
                    }
                    serviceConnectionC1029z.f8425a.put(serviceConnectionC1024u, serviceConnectionC1024u);
                    int i2 = serviceConnectionC1029z.f8426b;
                    if (i2 == 1) {
                        serviceConnectionC1024u.onServiceConnected(serviceConnectionC1029z.f8430f, serviceConnectionC1029z.f8428d);
                    } else if (i2 == 2) {
                        serviceConnectionC1029z.a(str, null);
                    }
                }
                z2 = serviceConnectionC1029z.f8427c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }
}
