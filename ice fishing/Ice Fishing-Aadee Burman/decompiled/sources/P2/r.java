package P2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class r implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public final a3.e f2529A;

    /* renamed from: n, reason: collision with root package name */
    public final F1.a f2531n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f2532u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f2533v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f2534w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f2535x = false;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicInteger f2536y = new AtomicInteger(0);

    /* renamed from: z, reason: collision with root package name */
    public boolean f2537z = false;

    /* renamed from: B, reason: collision with root package name */
    public final Object f2530B = new Object();

    public r(Looper looper, F1.a aVar) {
        this.f2531n = aVar;
        this.f2529A = new a3.e(looper, this, 0);
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
        N2.i iVar = (N2.i) message.obj;
        synchronized (this.f2530B) {
            try {
                if (this.f2535x && ((O2.w) this.f2531n.f903u).a() && this.f2532u.contains(iVar)) {
                    iVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
