package R2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class r implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public final c3.e f2850A;

    /* renamed from: n, reason: collision with root package name */
    public final I0.j f2852n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f2853u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f2854v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f2855w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f2856x = false;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicInteger f2857y = new AtomicInteger(0);

    /* renamed from: z, reason: collision with root package name */
    public boolean f2858z = false;

    /* renamed from: B, reason: collision with root package name */
    public final Object f2851B = new Object();

    public r(Looper looper, I0.j jVar) {
        this.f2852n = jVar;
        this.f2850A = new c3.e(looper, this, 0);
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
        P2.i iVar = (P2.i) message.obj;
        synchronized (this.f2851B) {
            try {
                if (this.f2856x && ((Q2.v) this.f2852n.f1291u).a() && this.f2853u.contains(iVar)) {
                    iVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
