package L2;

import P2.w;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.InterfaceC4061vh;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;
import java.util.function.Supplier;
import u2.z;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static n f1658e;

    /* renamed from: a, reason: collision with root package name */
    public int f1659a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1660b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1661c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1662d;

    public n(InterfaceC4061vh interfaceC4061vh) {
        this.f1661c = interfaceC4061vh.getLayoutParams();
        ViewParent parent = interfaceC4061vh.getParent();
        this.f1660b = interfaceC4061vh.d0();
        if (!(parent instanceof ViewGroup)) {
            throw new t2.h("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f1662d = viewGroup;
        this.f1659a = viewGroup.indexOfChild(interfaceC4061vh.V());
        viewGroup.removeView(interfaceC4061vh.V());
        interfaceC4061vh.i1(true);
    }

    public static synchronized n c(Context context) {
        n nVar;
        synchronized (n.class) {
            try {
                if (f1658e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new U2.a("MessengerIpcClient")));
                    n nVar2 = new n();
                    nVar2.f1662d = new k(nVar2);
                    nVar2.f1659a = 1;
                    nVar2.f1661c = unconfigurableScheduledExecutorService;
                    nVar2.f1660b = context.getApplicationContext();
                    f1658e = nVar2;
                }
                nVar = f1658e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    public Object a() {
        int i = this.f1659a;
        ArrayList arrayList = (ArrayList) this.f1660b;
        if (i < arrayList.size()) {
            int i6 = this.f1659a;
            this.f1659a = i6 + 1;
            return arrayList.get(i6);
        }
        Object obj = ((Supplier) this.f1661c).get();
        arrayList.add(obj);
        this.f1659a++;
        return obj;
    }

    public Looper b() {
        Looper looper;
        Object obj = this.f1662d;
        synchronized (obj) {
            try {
                if (this.f1659a != 0) {
                    w.i((HandlerThread) this.f1660b, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f1660b) == null) {
                    z.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f1660b = handlerThread;
                    handlerThread.start();
                    this.f1661c = new a3.e(((HandlerThread) this.f1660b).getLooper(), 3);
                    z.k("Looper thread started.");
                } else {
                    z.k("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f1659a++;
                looper = ((HandlerThread) this.f1660b).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public synchronized j3.m d(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(lVar.toString()));
            }
            if (!((k) this.f1662d).d(lVar)) {
                k kVar = new k(this);
                this.f1662d = kVar;
                kVar.d(lVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lVar.f1654b.f38358a;
    }

    public n(Supplier supplier, Consumer consumer) {
        this.f1660b = new ArrayList();
        this.f1661c = supplier;
        this.f1662d = consumer;
    }
}
