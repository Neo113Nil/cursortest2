package R2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2762g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static I f2763h;
    public static HandlerThread i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2764a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f2765b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c3.e f2766c;

    /* renamed from: d, reason: collision with root package name */
    public final U2.a f2767d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2768e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2769f;

    public I(Context context, Looper looper) {
        H h3 = new H(this);
        this.f2765b = context.getApplicationContext();
        c3.e eVar = new c3.e(looper, h3, 3);
        Looper.getMainLooper();
        this.f2766c = eVar;
        this.f2767d = U2.a.a();
        this.f2768e = com.anythink.basead.exoplayer.f.f7973a;
        this.f2769f = 300000L;
    }

    public static I a(Context context) {
        synchronized (f2762g) {
            try {
                if (f2763h == null) {
                    f2763h = new I(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2763h;
    }

    public final O2.b b(F f2, B b9, String str, Executor executor) {
        O2.b bVar;
        HashMap hashMap = this.f2764a;
        synchronized (hashMap) {
            try {
                G g9 = (G) hashMap.get(f2);
                if (executor == null) {
                    executor = null;
                }
                if (g9 == null) {
                    g9 = new G(this, f2);
                    g9.f2754n.put(b9, b9);
                    bVar = g9.a(str, executor);
                    hashMap.put(f2, g9);
                } else {
                    this.f2766c.removeMessages(0, f2);
                    if (g9.f2754n.containsKey(b9)) {
                        String f9 = f2.toString();
                        StringBuilder sb = new StringBuilder(f9.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(f9);
                        throw new IllegalStateException(sb.toString());
                    }
                    g9.f2754n.put(b9, b9);
                    int i4 = g9.f2755u;
                    if (i4 == 1) {
                        b9.onServiceConnected(g9.f2759y, g9.f2757w);
                    } else if (i4 == 2) {
                        bVar = g9.a(str, executor);
                    }
                    bVar = null;
                }
                if (g9.f2756v) {
                    return O2.b.f2254y;
                }
                if (bVar == null) {
                    bVar = new O2.b(-1, null, null);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z6) {
        F f2 = new F(str, z6);
        w.i(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f2764a;
        synchronized (hashMap) {
            try {
                G g9 = (G) hashMap.get(f2);
                if (g9 == null) {
                    String f9 = f2.toString();
                    StringBuilder sb = new StringBuilder(f9.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(f9);
                    throw new IllegalStateException(sb.toString());
                }
                if (!g9.f2754n.containsKey(serviceConnection)) {
                    String f10 = f2.toString();
                    StringBuilder sb2 = new StringBuilder(f10.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(f10);
                    throw new IllegalStateException(sb2.toString());
                }
                g9.f2754n.remove(serviceConnection);
                if (g9.f2754n.isEmpty()) {
                    this.f2766c.sendMessageDelayed(this.f2766c.obtainMessage(0, f2), this.f2768e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
