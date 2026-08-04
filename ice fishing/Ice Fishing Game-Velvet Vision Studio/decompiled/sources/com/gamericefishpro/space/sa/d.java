package com.gamericefishpro.space.sa;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final o b;
    public boolean g;
    public final Intent h;
    public c m;
    public n n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final q k = new IBinder.DeathRecipient() { // from class: com.gamericefishpro.space.sa.q
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            d dVar = this.a;
            int i = 0;
            dVar.b.a("reportBinderDeath", new Object[0]);
            if (dVar.j.get() != null) {
                throw new ClassCastException();
            }
            dVar.b.a("%s : Binder has died.", dVar.c);
            ArrayList arrayList = dVar.d;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((p) obj).a(new RemoteException(String.valueOf(dVar.c).concat(" : Binder has died.")));
            }
            dVar.d.clear();
            synchronized (dVar.f) {
                dVar.c();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final String c = "IntegrityService";
    public final com.gamericefishpro.space.qa.d i = com.gamericefishpro.space.qa.d.b;
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.gamericefishpro.space.sa.q] */
    public d(Context context, o oVar, Intent intent) {
        this.a = context;
        this.b = oVar;
        this.h = intent;
    }

    public static void b(d dVar, com.gamericefishpro.space.qa.e eVar) {
        n nVar = dVar.n;
        o oVar = dVar.b;
        ArrayList arrayList = dVar.d;
        int i = 0;
        if (nVar != null || dVar.g) {
            if (!dVar.g) {
                eVar.run();
                return;
            } else {
                oVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(eVar);
                return;
            }
        }
        oVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(eVar);
        c cVar = new c(dVar);
        dVar.m = cVar;
        dVar.g = true;
        if (dVar.a.bindService(dVar.h, cVar, 1)) {
            return;
        }
        oVar.a("Failed to bind to the service.", new Object[0]);
        dVar.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((p) obj).a(new e("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.gamericefishpro.space.r9.h) it.next()).b(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
