package androidx.window.layout;

import Z.C0072u;
import Z.ViewOnAttachStateChangeListenerC0076y;
import android.app.Activity;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class u implements v {

    /* renamed from: c, reason: collision with root package name */
    public static volatile u f2252c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f2253d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final r f2254a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2255b = new CopyOnWriteArrayList();

    public u(r rVar) {
        this.f2254a = rVar;
        if (rVar == null) {
            return;
        }
        rVar.h(new s(this));
    }

    @Override // androidx.window.layout.v
    public final void a(Activity activity, i0.d dVar, C0072u c0072u) {
        Object obj;
        WindowManager.LayoutParams attributes;
        ReentrantLock reentrantLock = f2253d;
        reentrantLock.lock();
        try {
            r rVar = this.f2254a;
            if (rVar == null) {
                c0072u.accept(new z(u1.o.f4473a));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2255b;
            boolean z2 = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((t) it.next()).f2249a.equals(activity)) {
                        z2 = true;
                        break;
                    }
                }
            }
            t tVar = new t(activity, dVar, c0072u);
            copyOnWriteArrayList.add(tVar);
            z zVar = null;
            r8 = null;
            IBinder iBinder = null;
            if (z2) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (activity.equals(((t) obj).f2249a)) {
                            break;
                        }
                    }
                }
                t tVar2 = (t) obj;
                if (tVar2 != null) {
                    zVar = tVar2.f2251c;
                }
                if (zVar != null) {
                    tVar.f2251c = zVar;
                    tVar.f2250b.accept(zVar);
                }
            } else {
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    rVar.g(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0076y(rVar, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.v
    public final void b(N.a aVar) {
        D1.i.e(aVar, "callback");
        synchronized (f2253d) {
            try {
                if (this.f2254a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f2255b.iterator();
                while (it.hasNext()) {
                    t tVar = (t) it.next();
                    if (tVar.f2250b == aVar) {
                        arrayList.add(tVar);
                    }
                }
                this.f2255b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((t) it2.next()).f2249a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f2255b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((t) it3.next()).f2249a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    r rVar = this.f2254a;
                    if (rVar != null) {
                        rVar.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
