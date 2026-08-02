package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class hox {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final yee b;
    public boolean g;
    public final Intent h;
    public fmp l;
    public h9x m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final wfx j = new wfx(1, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    public hox(Context context, yee yeeVar, Intent intent) {
        this.a = context;
        this.b = yeeVar;
        this.h = intent;
    }

    public static void b(hox hoxVar, bhx bhxVar) {
        h9x h9xVar = hoxVar.m;
        yee yeeVar = hoxVar.b;
        ArrayList arrayList = hoxVar.d;
        if (h9xVar != null || hoxVar.g) {
            if (!hoxVar.g) {
                bhxVar.run();
                return;
            } else {
                yeeVar.e("Waiting to bind to the service.", new Object[0]);
                arrayList.add(bhxVar);
                return;
            }
        }
        yeeVar.e("Initiate binding to the service.", new Object[0]);
        arrayList.add(bhxVar);
        fmp fmpVar = new fmp(3, hoxVar);
        hoxVar.l = fmpVar;
        hoxVar.g = true;
        if (hoxVar.a.bindService(hoxVar.h, fmpVar, 1)) {
            return;
        }
        yeeVar.e("Failed to bind to the service.", new Object[0]);
        hoxVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bhx bhxVar2 = (bhx) it.next();
            wp3 wp3Var = new wp3("Failed to bind to the service.");
            i8s i8sVar = bhxVar2.a;
            if (i8sVar != null) {
                i8sVar.c(wp3Var);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(i8s i8sVar) {
        synchronized (this.f) {
            this.e.remove(i8sVar);
        }
        a().post(new jkx(0, this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((i8s) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
