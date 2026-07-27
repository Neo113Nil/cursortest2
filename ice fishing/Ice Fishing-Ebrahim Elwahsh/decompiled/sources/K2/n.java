package K2;

import O2.w;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.InterfaceC3858rh;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;
import java.util.function.Supplier;
import t2.C;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static n f1603e;

    /* renamed from: a, reason: collision with root package name */
    public int f1604a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1605b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1606c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1607d;

    public n(InterfaceC3858rh interfaceC3858rh) {
        this.f1606c = interfaceC3858rh.getLayoutParams();
        ViewParent parent = interfaceC3858rh.getParent();
        this.f1605b = interfaceC3858rh.g0();
        if (!(parent instanceof ViewGroup)) {
            throw new s2.h("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f1607d = viewGroup;
        this.f1604a = viewGroup.indexOfChild(interfaceC3858rh.b0());
        viewGroup.removeView(interfaceC3858rh.b0());
        interfaceC3858rh.d1(true);
    }

    public static synchronized n c(Context context) {
        n nVar;
        synchronized (n.class) {
            try {
                if (f1603e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new T2.a("MessengerIpcClient", 0)));
                    n nVar2 = new n();
                    nVar2.f1607d = new k(nVar2);
                    nVar2.f1604a = 1;
                    nVar2.f1606c = unconfigurableScheduledExecutorService;
                    nVar2.f1605b = context.getApplicationContext();
                    f1603e = nVar2;
                }
                nVar = f1603e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    public Object a() {
        int i = this.f1604a;
        ArrayList arrayList = (ArrayList) this.f1605b;
        if (i < arrayList.size()) {
            int i4 = this.f1604a;
            this.f1604a = i4 + 1;
            return arrayList.get(i4);
        }
        Object obj = ((Supplier) this.f1606c).get();
        arrayList.add(obj);
        this.f1604a++;
        return obj;
    }

    public Looper b() {
        Looper looper;
        Object obj = this.f1607d;
        synchronized (obj) {
            try {
                if (this.f1604a != 0) {
                    w.i((HandlerThread) this.f1605b, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f1605b) == null) {
                    C.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f1605b = handlerThread;
                    handlerThread.start();
                    this.f1606c = new Z2.e(((HandlerThread) this.f1605b).getLooper(), 3);
                    C.k("Looper thread started.");
                } else {
                    C.k("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f1604a++;
                looper = ((HandlerThread) this.f1605b).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public synchronized h3.n d(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(lVar.toString()));
            }
            if (!((k) this.f1607d).d(lVar)) {
                k kVar = new k(this);
                this.f1607d = kVar;
                kVar.d(lVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lVar.f1599b.f38206a;
    }

    public n(Supplier supplier, Consumer consumer) {
        this.f1605b = new ArrayList();
        this.f1606c = supplier;
        this.f1607d = consumer;
    }
}
