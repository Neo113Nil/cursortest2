package c0;

import P0.q;
import a0.InterfaceC0084a;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import h1.C0239i;
import i1.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class k implements InterfaceC0084a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile k f2654c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f2655d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final i f2656a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2657b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f2656a = iVar;
        if (iVar != null) {
            iVar.h(new Z0.i(14, this));
        }
    }

    @Override // a0.InterfaceC0084a
    public final void a(q qVar) {
        synchronized (f2655d) {
            try {
                if (this.f2656a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f2657b.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar.f2652b == qVar) {
                        arrayList.add(jVar);
                    }
                }
                this.f2657b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((j) it2.next()).f2651a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f2657b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((j) it3.next()).f2651a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    i iVar = this.f2656a;
                    if (iVar != null) {
                        iVar.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a0.InterfaceC0084a
    public final void b(Context context, N.c cVar, q qVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        C0239i c0239i = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        r rVar = r.f3416a;
        if (activity != null) {
            ReentrantLock reentrantLock = f2655d;
            reentrantLock.lock();
            try {
                i iVar = this.f2656a;
                if (iVar == null) {
                    qVar.accept(new Z.j(rVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f2657b;
                boolean z2 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((j) it.next()).f2651a.equals(activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                j jVar = new j(activity, cVar, qVar);
                copyOnWriteArrayList.add(jVar);
                if (z2) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((j) obj).f2651a)) {
                                break;
                            }
                        }
                    }
                    j jVar2 = (j) obj;
                    Z.j jVar3 = jVar2 != null ? jVar2.f2653c : null;
                    if (jVar3 != null) {
                        jVar.f2653c = jVar3;
                        jVar.f2652b.accept(jVar3);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        iVar.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new h(iVar, activity));
                    }
                }
                reentrantLock.unlock();
                c0239i = C0239i.f3393a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c0239i == null) {
            qVar.accept(new Z.j(rVar));
        }
    }
}
