package com.gamericefishpro.space.u8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Handler.Callback {
    public static final Status H = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status I = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object J = new Object();
    public static d K;
    public final AtomicInteger A;
    public final AtomicInteger B;
    public final ConcurrentHashMap C;
    public final com.gamericefishpro.space.t.f D;
    public final com.gamericefishpro.space.t.f E;
    public final com.gamericefishpro.space.f9.e F;
    public volatile boolean G;
    public long d;
    public boolean e;
    public com.gamericefishpro.space.v8.n i;
    public com.gamericefishpro.space.x8.b v;
    public final Context w;
    public final com.gamericefishpro.space.s8.e y;
    public final com.gamericefishpro.space.u6.e z;

    public d(Context context, Looper looper) {
        com.gamericefishpro.space.s8.e eVar = com.gamericefishpro.space.s8.e.d;
        this.d = 10000L;
        this.e = false;
        this.A = new AtomicInteger(1);
        this.B = new AtomicInteger(0);
        this.C = new ConcurrentHashMap(5, 0.75f, 1);
        this.D = new com.gamericefishpro.space.t.f(0);
        this.E = new com.gamericefishpro.space.t.f(0);
        this.G = true;
        this.w = context;
        com.gamericefishpro.space.f9.e eVar2 = new com.gamericefishpro.space.f9.e(looper, this);
        this.F = eVar2;
        this.y = eVar;
        this.z = new com.gamericefishpro.space.u6.e(eVar);
        PackageManager packageManager = context.getPackageManager();
        if (com.gamericefishpro.space.z8.b.f == null) {
            com.gamericefishpro.space.z8.b.f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (com.gamericefishpro.space.z8.b.f.booleanValue()) {
            this.G = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    public static Status b(a aVar, com.gamericefishpro.space.s8.b bVar) {
        return new Status(17, "API: " + aVar.b.c + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.i, bVar);
    }

    public static d d(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (J) {
            if (K == null) {
                synchronized (com.gamericefishpro.space.v8.n0.g) {
                    try {
                        handlerThread = com.gamericefishpro.space.v8.n0.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            com.gamericefishpro.space.v8.n0.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = com.gamericefishpro.space.v8.n0.i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = com.gamericefishpro.space.s8.e.c;
                K = new d(applicationContext, looper);
            }
            dVar = K;
        }
        return dVar;
    }

    public final boolean a(com.gamericefishpro.space.s8.b bVar, int i) {
        PendingIntent activity;
        com.gamericefishpro.space.s8.e eVar = this.y;
        eVar.getClass();
        Context context = this.w;
        if (!com.gamericefishpro.space.b9.a.y(context)) {
            boolean zB = bVar.b();
            int i2 = bVar.e;
            if (zB) {
                activity = bVar.i;
            } else {
                activity = null;
                Intent intentA = eVar.a(i2, context, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.e;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.f(context, i2, PendingIntent.getActivity(context, 0, intent, com.gamericefishpro.space.f9.d.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final a0 c(com.gamericefishpro.space.x8.b bVar) {
        a aVar = bVar.e;
        ConcurrentHashMap concurrentHashMap = this.C;
        a0 a0Var = (a0) concurrentHashMap.get(aVar);
        if (a0Var == null) {
            a0Var = new a0(this, bVar);
            concurrentHashMap.put(aVar, a0Var);
        }
        if (a0Var.e.m()) {
            this.E.add(aVar);
        }
        a0Var.j();
        return a0Var;
    }

    public final void e(com.gamericefishpro.space.s8.b bVar, int i) {
        if (a(bVar, i)) {
            return;
        }
        com.gamericefishpro.space.f9.e eVar = this.F;
        eVar.sendMessage(eVar.obtainMessage(5, i, 0, bVar));
    }

    /* JADX WARN: Code duplicated, block: B:208:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:212:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:214:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x012b  */
    /* JADX WARN: Code duplicated, block: B:82:0x012f  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 com.gamericefishpro.space.u8.a0, still in use, count: 2, list:
          (r3v5 com.gamericefishpro.space.u8.a0) from 0x0398: IGET (r3v5 com.gamericefishpro.space.u8.a0) A[WRAPPED] (LINE:921) com.gamericefishpro.space.u8.a0.j int
          (r3v5 com.gamericefishpro.space.u8.a0) from 0x039e: PHI (r3 I:??) = (r3v2 com.gamericefishpro.space.u8.a0), (r3v5 com.gamericefishpro.space.u8.a0) binds: [B:206:0x039d, B:267:0x039e] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.u8.d.handleMessage(android.os.Message):boolean");
    }
}
