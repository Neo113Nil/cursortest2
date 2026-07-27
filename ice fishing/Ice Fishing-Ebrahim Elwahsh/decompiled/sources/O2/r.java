package O2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class r implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public final Z2.e f2457A;

    /* renamed from: n, reason: collision with root package name */
    public final I0.j f2459n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f2460u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f2461v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f2462w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f2463x = false;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicInteger f2464y = new AtomicInteger(0);

    /* renamed from: z, reason: collision with root package name */
    public boolean f2465z = false;

    /* renamed from: B, reason: collision with root package name */
    public final Object f2458B = new Object();

    public r(Looper looper, I0.j jVar) {
        this.f2459n = jVar;
        this.f2457A = new Z2.e(looper, this, 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i);
            Log.wtf("GmsClientEvents", sb.toString(), new Exception());
            return false;
        }
        M2.i iVar = (M2.i) message.obj;
        synchronized (this.f2458B) {
            try {
                if (this.f2463x && ((N2.v) this.f2459n.f1233u).a() && this.f2460u.contains(iVar)) {
                    iVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
