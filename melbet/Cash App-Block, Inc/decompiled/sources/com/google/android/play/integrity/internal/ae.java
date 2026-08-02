package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ae {
    public static final HashMap a = new HashMap();
    public final Context b;
    public final s c;
    public final String d;
    public boolean h;
    public final Intent i;
    public final z j;
    public ac n;
    public IInterface o;
    public final ArrayList e = new ArrayList();
    public final HashSet f = new HashSet();
    public final Object g = new Object();
    public final u l = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ae aeVar = ae.this;
            s sVar = aeVar.c;
            sVar.d("reportBinderDeath", new Object[0]);
            JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(aeVar.k.get());
            sVar.d("%s : Binder has died.", aeVar.d);
            ArrayList arrayList = aeVar.e;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((t) it.next()).a(new RemoteException(String.valueOf(aeVar.d).concat(" : Binder has died.")));
            }
            arrayList.clear();
            synchronized (aeVar.g) {
                HashSet hashSet = aeVar.f;
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((TaskCompletionSource) it2.next()).trySetException(new RemoteException(String.valueOf(aeVar.d).concat(" : Binder has died.")));
                }
                hashSet.clear();
            }
        }
    };
    public final AtomicInteger m = new AtomicInteger(0);
    public final WeakReference k = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.integrity.internal.u] */
    public ae(Context context, s sVar, String str, Intent intent, z zVar) {
        this.b = context;
        this.c = sVar;
        this.d = str;
        this.i = intent;
        this.j = zVar;
    }

    public static void r(ae aeVar, t tVar) {
        IInterface iInterface = aeVar.o;
        ArrayList arrayList = aeVar.e;
        s sVar = aeVar.c;
        if (iInterface != null || aeVar.h) {
            if (!aeVar.h) {
                tVar.run();
                return;
            } else {
                sVar.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(tVar);
                return;
            }
        }
        sVar.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(tVar);
        ac acVar = new ac(aeVar);
        aeVar.n = acVar;
        aeVar.h = true;
        if (aeVar.b.bindService(aeVar.i, acVar, 1)) {
            return;
        }
        sVar.d("Failed to bind to the service.", new Object[0]);
        aeVar.h = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(new af("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler c() {
        Handler handler;
        HashMap hashMap = a;
        synchronized (hashMap) {
            try {
                String str = this.d;
                if (!hashMap.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    hashMap.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.g) {
            this.f.remove(taskCompletionSource);
        }
        c().post(new x(this));
    }
}
