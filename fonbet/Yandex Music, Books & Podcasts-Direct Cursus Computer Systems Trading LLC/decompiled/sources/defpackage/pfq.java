package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class pfq implements bpv {
    public static volatile pfq c;
    public static final ReentrantLock d = new ReentrantLock();
    public final r0c a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public pfq(nfq nfqVar) {
        this.a = nfqVar;
        if (nfqVar != null) {
            nfqVar.d(new z6n(8, this));
        }
    }

    @Override // defpackage.bpv
    public final void a(Context context, gx0 gx0Var, rtc rtcVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        Unit unit = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = d;
            reentrantLock.lock();
            try {
                r0c r0cVar = this.a;
                if (r0cVar == null) {
                    rtcVar.accept(new uqv(c5b.a));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                boolean z = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((ofq) it.next()).a.equals(activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                ofq ofqVar = new ofq(activity, gx0Var, rtcVar);
                copyOnWriteArrayList.add(ofqVar);
                if (z) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((ofq) obj).a)) {
                                break;
                            }
                        }
                    }
                    ofq ofqVar2 = (ofq) obj;
                    uqv uqvVar = ofqVar2 != null ? ofqVar2.c : null;
                    if (uqvVar != null) {
                        ofqVar.c = uqvVar;
                        ofqVar.b.accept(uqvVar);
                    }
                } else {
                    nfq nfqVar = (nfq) r0cVar;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        nfqVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ac8(nfqVar, activity));
                    }
                }
                reentrantLock.unlock();
                unit = Unit.a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (unit == null) {
            rtcVar.accept(new uqv(c5b.a));
        }
    }

    @Override // defpackage.bpv
    public final void b(rtc rtcVar) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ofq ofqVar = (ofq) it.next();
                    if (ofqVar.b == rtcVar) {
                        arrayList.add(ofqVar);
                    }
                }
                this.b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((ofq) it2.next()).a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((ofq) it3.next()).a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    r0c r0cVar = this.a;
                    if (r0cVar != null) {
                        ((nfq) r0cVar).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
