package P2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2441g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static I f2442h;
    public static HandlerThread i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2443a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f2444b;

    /* renamed from: c, reason: collision with root package name */
    public volatile a3.e f2445c;

    /* renamed from: d, reason: collision with root package name */
    public final S2.a f2446d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2447e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2448f;

    public I(Context context, Looper looper) {
        H h9 = new H(this);
        this.f2444b = context.getApplicationContext();
        a3.e eVar = new a3.e(looper, h9, 2);
        Looper.getMainLooper();
        this.f2445c = eVar;
        this.f2446d = S2.a.a();
        this.f2447e = com.anythink.basead.exoplayer.f.f7187a;
        this.f2448f = 300000L;
    }

    public static I a(Context context) {
        synchronized (f2441g) {
            try {
                if (f2442h == null) {
                    f2442h = new I(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2442h;
    }

    public final M2.b b(F f3, B b9, String str, Executor executor) {
        M2.b bVar;
        HashMap hashMap = this.f2443a;
        synchronized (hashMap) {
            try {
                G g4 = (G) hashMap.get(f3);
                if (executor == null) {
                    executor = null;
                }
                if (g4 == null) {
                    g4 = new G(this, f3);
                    g4.f2433n.put(b9, b9);
                    bVar = g4.a(str, executor);
                    hashMap.put(f3, g4);
                } else {
                    this.f2445c.removeMessages(0, f3);
                    if (g4.f2433n.containsKey(b9)) {
                        String f9 = f3.toString();
                        StringBuilder sb = new StringBuilder(f9.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(f9);
                        throw new IllegalStateException(sb.toString());
                    }
                    g4.f2433n.put(b9, b9);
                    int i6 = g4.f2434u;
                    if (i6 == 1) {
                        b9.onServiceConnected(g4.f2438y, g4.f2436w);
                    } else if (i6 == 2) {
                        bVar = g4.a(str, executor);
                    }
                    bVar = null;
                }
                if (g4.f2435v) {
                    return M2.b.f1828y;
                }
                if (bVar == null) {
                    bVar = new M2.b(-1, null, null);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z3) {
        F f3 = new F(str, z3);
        w.i(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f2443a;
        synchronized (hashMap) {
            try {
                G g4 = (G) hashMap.get(f3);
                if (g4 == null) {
                    String f9 = f3.toString();
                    StringBuilder sb = new StringBuilder(f9.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(f9);
                    throw new IllegalStateException(sb.toString());
                }
                if (!g4.f2433n.containsKey(serviceConnection)) {
                    String f10 = f3.toString();
                    StringBuilder sb2 = new StringBuilder(f10.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(f10);
                    throw new IllegalStateException(sb2.toString());
                }
                g4.f2433n.remove(serviceConnection);
                if (g4.f2433n.isEmpty()) {
                    this.f2445c.sendMessageDelayed(this.f2445c.obtainMessage(0, f3), this.f2447e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
