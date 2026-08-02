package N2;

import R2.w;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.InterfaceC4084vh;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;
import java.util.function.Supplier;
import w2.z;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static o f1948e;

    /* renamed from: a, reason: collision with root package name */
    public int f1949a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1950b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1951c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1952d;

    public o(InterfaceC4084vh interfaceC4084vh) {
        this.f1951c = interfaceC4084vh.getLayoutParams();
        ViewParent parent = interfaceC4084vh.getParent();
        this.f1950b = interfaceC4084vh.d0();
        if (!(parent instanceof ViewGroup)) {
            throw new v2.h("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f1952d = viewGroup;
        this.f1949a = viewGroup.indexOfChild(interfaceC4084vh.V());
        viewGroup.removeView(interfaceC4084vh.V());
        interfaceC4084vh.g1(true);
    }

    public static synchronized o c(Context context) {
        o oVar;
        synchronized (o.class) {
            try {
                if (f1948e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new W2.a("MessengerIpcClient")));
                    o oVar2 = new o();
                    oVar2.f1952d = new l(oVar2);
                    oVar2.f1949a = 1;
                    oVar2.f1951c = unconfigurableScheduledExecutorService;
                    oVar2.f1950b = context.getApplicationContext();
                    f1948e = oVar2;
                }
                oVar = f1948e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public Object a() {
        int i = this.f1949a;
        ArrayList arrayList = (ArrayList) this.f1950b;
        if (i < arrayList.size()) {
            int i4 = this.f1949a;
            this.f1949a = i4 + 1;
            return arrayList.get(i4);
        }
        Object obj = ((Supplier) this.f1951c).get();
        arrayList.add(obj);
        this.f1949a++;
        return obj;
    }

    public Looper b() {
        Looper looper;
        Object obj = this.f1952d;
        synchronized (obj) {
            try {
                if (this.f1949a != 0) {
                    w.i((HandlerThread) this.f1950b, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f1950b) == null) {
                    z.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f1950b = handlerThread;
                    handlerThread.start();
                    this.f1951c = new c3.e(((HandlerThread) this.f1950b).getLooper(), 1);
                    z.k("Looper thread started.");
                } else {
                    z.k("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f1949a++;
                looper = ((HandlerThread) this.f1950b).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public synchronized l3.m d(m mVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(mVar.toString()));
            }
            if (!((l) this.f1952d).d(mVar)) {
                l lVar = new l(this);
                this.f1952d = lVar;
                lVar.d(mVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return mVar.f1944b.f38870a;
    }

    public o(Supplier supplier, Consumer consumer) {
        this.f1950b = new ArrayList();
        this.f1951c = supplier;
        this.f1952d = consumer;
    }
}
