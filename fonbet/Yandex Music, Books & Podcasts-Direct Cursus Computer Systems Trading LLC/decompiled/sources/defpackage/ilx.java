package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ilx {
    public static final Object g = new Object();
    public static ilx h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile fsn c;
    public final r66 d;
    public final long e;
    public final long f;

    public ilx(Context context, Looper looper) {
        ucd ucdVar = new ucd(3, this);
        this.b = context.getApplicationContext();
        fsn fsnVar = new fsn(looper, ucdVar);
        Looper.getMainLooper();
        this.c = fsnVar;
        this.d = r66.a();
        this.e = 5000L;
        this.f = 300000L;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        eix eixVar = new eix(str, z);
        y1g.H(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                xix xixVar = (xix) this.a.get(eixVar);
                if (xixVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(eixVar.toString()));
                }
                if (!xixVar.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(eixVar.toString()));
                }
                xixVar.a.remove(serviceConnection);
                if (xixVar.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, eixVar), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(eix eixVar, r8x r8xVar, String str) {
        boolean z;
        synchronized (this.a) {
            try {
                xix xixVar = (xix) this.a.get(eixVar);
                if (xixVar == null) {
                    xixVar = new xix(this, eixVar);
                    xixVar.a.put(r8xVar, r8xVar);
                    xixVar.a(str, null);
                    this.a.put(eixVar, xixVar);
                } else {
                    this.c.removeMessages(0, eixVar);
                    if (xixVar.a.containsKey(r8xVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(eixVar.toString()));
                    }
                    xixVar.a.put(r8xVar, r8xVar);
                    int i2 = xixVar.b;
                    if (i2 == 1) {
                        r8xVar.onServiceConnected(xixVar.f, xixVar.d);
                    } else if (i2 == 2) {
                        xixVar.a(str, null);
                    }
                }
                z = xixVar.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
