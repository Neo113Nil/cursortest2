package p6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5562g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static d0 f5563h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f5564i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5565a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f5566b;

    /* renamed from: c, reason: collision with root package name */
    public volatile a7.c f5567c;

    /* renamed from: d, reason: collision with root package name */
    public final s6.a f5568d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5569e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5570f;

    public d0(Context context, Looper looper) {
        l6.i iVar = new l6.i(1, this);
        this.f5566b = context.getApplicationContext();
        a7.c cVar = new a7.c(looper, iVar);
        Looper.getMainLooper();
        this.f5567c = cVar;
        this.f5568d = s6.a.a();
        this.f5569e = 5000L;
        this.f5570f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z10) {
        b0 b0Var = new b0(str, z10);
        u.h(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f5565a) {
            try {
                c0 c0Var = (c0) this.f5565a.get(b0Var);
                if (c0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(b0Var.toString()));
                }
                if (!c0Var.f5548a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(b0Var.toString()));
                }
                c0Var.f5548a.remove(serviceConnection);
                if (c0Var.f5548a.isEmpty()) {
                    this.f5567c.sendMessageDelayed(this.f5567c.obtainMessage(0, b0Var), this.f5569e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(b0 b0Var, x xVar, String str) {
        boolean z10;
        synchronized (this.f5565a) {
            try {
                c0 c0Var = (c0) this.f5565a.get(b0Var);
                if (c0Var == null) {
                    c0Var = new c0(this, b0Var);
                    c0Var.f5548a.put(xVar, xVar);
                    c0Var.a(str, null);
                    this.f5565a.put(b0Var, c0Var);
                } else {
                    this.f5567c.removeMessages(0, b0Var);
                    if (c0Var.f5548a.containsKey(xVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(b0Var.toString()));
                    }
                    c0Var.f5548a.put(xVar, xVar);
                    int i10 = c0Var.f5549b;
                    if (i10 == 1) {
                        xVar.onServiceConnected(c0Var.f5553f, c0Var.f5551d);
                    } else if (i10 == 2) {
                        c0Var.a(str, null);
                    }
                }
                z10 = c0Var.f5550c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}
