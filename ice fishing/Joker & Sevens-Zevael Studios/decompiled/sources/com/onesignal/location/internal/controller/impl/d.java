package com.onesignal.location.internal.controller.impl;

import ac.o;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import java.io.Closeable;
import pc.j;
import pc.k;
import pc.s;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements z9.a {
    private final q8.f _applicationService;
    private final com.onesignal.common.events.b event;
    private FusedLocationProviderClient hmsFusedLocationClient;
    private Location lastLocation;
    private final a locationHandlerThread;
    private b locationUpdateListener;
    private final gd.a startStopMutex;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends HandlerThread {
        private Handler mHandler;

        public a() {
            super("OSH_LocationHandlerThread");
            start();
            this.mHandler = new Handler(getLooper());
        }

        public final Handler getMHandler() {
            return this.mHandler;
        }

        public final void setMHandler(Handler handler) {
            j.e(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends LocationCallback implements q8.e, Closeable {
        private final q8.f _applicationService;
        private final d _parent;
        private boolean hasExistingRequest;
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public b(d dVar, q8.f fVar, FusedLocationProviderClient fusedLocationProviderClient) {
            j.e(dVar, "_parent");
            j.e(fVar, "_applicationService");
            j.e(fusedLocationProviderClient, "huaweiFusedLocationProviderClient");
            this._parent = dVar;
            this._applicationService = fVar;
            this.huaweiFusedLocationProviderClient = fusedLocationProviderClient;
            fVar.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
            long j3 = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j3).setInterval(j3).setMaxWaitTime((long) (j3 * 1.5d)).setPriority(102);
            com.onesignal.debug.internal.logging.b.debug$default("HMSLocationController Huawei LocationServices requestLocationUpdates!", null, 2, null);
            this.huaweiFusedLocationProviderClient.requestLocationUpdates(priority, this, this._parent.locationHandlerThread.getLooper());
            this.hasExistingRequest = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
        }

        @Override // q8.e
        public void onFocus(boolean z10) {
            com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationResult(LocationResult locationResult) {
            j.e(locationResult, "locationResult");
            com.onesignal.debug.internal.logging.b.debug$default("HMSLocationController onLocationResult: " + locationResult, null, 2, null);
            this._parent.lastLocation = locationResult.getLastLocation();
        }

        @Override // q8.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.j implements oc.c {
        final /* synthetic */ FusedLocationProviderClient $locationClient;
        final /* synthetic */ s $retVal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FusedLocationProviderClient fusedLocationProviderClient, s sVar, fc.d dVar) {
            super(1, dVar);
            this.$locationClient = fusedLocationProviderClient;
            this.$retVal = sVar;
        }

        /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        private static final void m22invokeSuspend$lambda0(s sVar, s sVar2, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.c) sVar.f5683g).wake();
            } else {
                sVar2.f5683g = location;
                ((com.onesignal.common.threading.c) sVar.f5683g).wake();
            }
        }

        /* renamed from: invokeSuspend$lambda-1, reason: not valid java name */
        private static final void m23invokeSuspend$lambda1(s sVar, Exception exc) {
            com.onesignal.debug.internal.logging.b.error("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.c) sVar.f5683g).wake();
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return new c(this.$locationClient, this.$retVal, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((c) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                com.onesignal.common.threading.c cVar = new com.onesignal.common.threading.c();
                this.$locationClient.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                this.label = 1;
                Object waitForWake = cVar.waitForWake(this);
                gc.a aVar = gc.a.f2559g;
                if (waitForWake == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.location.internal.controller.impl.d$d, reason: collision with other inner class name */
    public static final class C0042d extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0042d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.start(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.j implements oc.e {
        final /* synthetic */ s $self;
        final /* synthetic */ pc.o $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends k implements oc.c {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((z9.b) obj);
                return o.f277a;
            }

            public final void invoke(z9.b bVar) {
                j.e(bVar, "it");
                Location location = this.this$0.lastLocation;
                j.b(location);
                bVar.onLocationChanged(location);
            }
        }

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class b extends k implements oc.c {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((z9.b) obj);
                return o.f277a;
            }

            public final void invoke(z9.b bVar) {
                j.e(bVar, "it");
                Location location = this.this$0.lastLocation;
                j.b(location);
                bVar.onLocationChanged(location);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(pc.o oVar, s sVar, fc.d dVar) {
            super(2, dVar);
            this.$wasSuccessful = oVar;
            this.$self = sVar;
        }

        /* renamed from: invokeSuspend$lambda-2$lambda-0, reason: not valid java name */
        private static final void m24invokeSuspend$lambda2$lambda0(s sVar, d dVar, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.d) sVar.f5683g).wake(Boolean.FALSE);
            } else {
                dVar.lastLocation = location;
                ((com.onesignal.common.threading.d) sVar.f5683g).wake(Boolean.TRUE);
            }
        }

        /* renamed from: invokeSuspend$lambda-2$lambda-1, reason: not valid java name */
        private static final void m25invokeSuspend$lambda2$lambda1(s sVar, Exception exc) {
            com.onesignal.debug.internal.logging.b.error("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.d) sVar.f5683g).wake(Boolean.FALSE);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return d.this.new e(this.$wasSuccessful, this.$self, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00f5 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #2 {all -> 0x0028, blocks: (B:7:0x0023, B:8:0x00e9, B:10:0x00f5), top: B:6:0x0023 }] */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* JADX WARN: Type inference failed for: r5v9, types: [gd.a] */
        /* JADX WARN: Type inference failed for: r7v9, types: [gd.a] */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            gd.d dVar;
            pc.o oVar;
            d dVar2;
            s sVar;
            ?? r5;
            Throwable th;
            pc.o oVar2;
            d dVar3;
            int i10 = this.label;
            gc.a aVar = gc.a.f2559g;
            try {
                if (i10 == 0) {
                    v6.a.W(obj);
                    gd.a aVar2 = d.this.startStopMutex;
                    d dVar4 = d.this;
                    pc.o oVar3 = this.$wasSuccessful;
                    s sVar2 = this.$self;
                    this.L$0 = aVar2;
                    this.L$1 = dVar4;
                    this.L$2 = oVar3;
                    this.L$3 = sVar2;
                    this.label = 1;
                    dVar = (gd.d) aVar2;
                    if (dVar.c(this) != aVar) {
                        oVar = oVar3;
                        dVar2 = dVar4;
                        sVar = sVar2;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar2 = (pc.o) this.L$4;
                    sVar = (s) this.L$3;
                    oVar = (pc.o) this.L$2;
                    dVar3 = (d) this.L$1;
                    r5 = (gd.a) this.L$0;
                    try {
                        v6.a.W(obj);
                        r5 = r5;
                        oVar2.f5679g = ((Boolean) obj).booleanValue();
                        if (oVar.f5679g) {
                            dVar3.event.fire(new b(dVar3));
                            d dVar5 = (d) sVar.f5683g;
                            q8.f fVar = dVar3._applicationService;
                            FusedLocationProviderClient fusedLocationProviderClient = dVar3.hmsFusedLocationClient;
                            j.b(fusedLocationProviderClient);
                            dVar3.locationUpdateListener = new b(dVar5, fVar, fusedLocationProviderClient);
                        }
                        dVar = r5;
                        dVar.d(null);
                        return o.f277a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((gd.d) r5).d(null);
                        throw th;
                    }
                }
                sVar = (s) this.L$3;
                oVar = (pc.o) this.L$2;
                dVar2 = (d) this.L$1;
                ?? r72 = (gd.a) this.L$0;
                v6.a.W(obj);
                dVar = r72;
                if (dVar2.hmsFusedLocationClient == null) {
                    try {
                        dVar2.hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient(dVar2._applicationService.getAppContext());
                    } catch (Exception e10) {
                        com.onesignal.debug.internal.logging.b.error$default("Huawei LocationServices getFusedLocationProviderClient failed! " + e10, null, 2, null);
                        oVar.f5679g = false;
                    }
                }
                if (dVar2.lastLocation != null) {
                    dVar2.event.fire(new a(dVar2));
                    dVar.d(null);
                    return o.f277a;
                }
                com.onesignal.common.threading.d dVar6 = new com.onesignal.common.threading.d();
                FusedLocationProviderClient fusedLocationProviderClient2 = dVar2.hmsFusedLocationClient;
                j.b(fusedLocationProviderClient2);
                fusedLocationProviderClient2.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                this.L$0 = dVar;
                this.L$1 = dVar2;
                this.L$2 = oVar;
                this.L$3 = sVar;
                this.L$4 = oVar;
                this.label = 2;
                Object waitForWake = dVar6.waitForWake(this);
                if (waitForWake != aVar) {
                    r5 = dVar;
                    obj = waitForWake;
                    oVar2 = oVar;
                    dVar3 = dVar2;
                    oVar2.f5679g = ((Boolean) obj).booleanValue();
                    if (oVar.f5679g) {
                    }
                    dVar = r5;
                    dVar.d(null);
                    return o.f277a;
                }
                return aVar;
            } catch (Throwable th3) {
                r5 = dVar;
                th = th3;
                ((gd.d) r5).d(null);
                throw th;
            }
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((e) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.stop(this);
        }
    }

    public d(q8.f fVar) {
        j.e(fVar, "_applicationService");
        this._applicationService = fVar;
        this.locationHandlerThread = new a();
        this.startStopMutex = new gd.d();
        this.event = new com.onesignal.common.events.b();
    }

    @Override // z9.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // z9.a
    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        s sVar = new s();
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new c(fusedLocationProviderClient, sVar, null), 1, null);
        return (Location) sVar.f5683g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // z9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(fc.d dVar) {
        C0042d c0042d;
        int i10;
        pc.o oVar;
        if (dVar instanceof C0042d) {
            c0042d = (C0042d) dVar;
            int i11 = c0042d.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0042d.label = i11 - Integer.MIN_VALUE;
                Object obj = c0042d.result;
                i10 = c0042d.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    s sVar = new s();
                    sVar.f5683g = this;
                    pc.o oVar2 = new pc.o();
                    fd.d dVar2 = i0.f8861c;
                    e eVar = new e(oVar2, sVar, null);
                    c0042d.L$0 = oVar2;
                    c0042d.label = 1;
                    Object A = a0.A(dVar2, eVar, c0042d);
                    gc.a aVar = gc.a.f2559g;
                    if (A == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = (pc.o) c0042d.L$0;
                    v6.a.W(obj);
                }
                return Boolean.valueOf(oVar.f5679g);
            }
        }
        c0042d = new C0042d(dVar);
        Object obj2 = c0042d.result;
        i10 = c0042d.label;
        if (i10 != 0) {
        }
        return Boolean.valueOf(oVar.f5679g);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0060), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0060), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // z9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(fc.d dVar) {
        f fVar;
        int i10;
        d dVar2;
        Object obj;
        b bVar;
        try {
            if (dVar instanceof f) {
                fVar = (f) dVar;
                int i11 = fVar.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    fVar.label = i11 - Integer.MIN_VALUE;
                    Object obj2 = fVar.result;
                    i10 = fVar.label;
                    if (i10 != 0) {
                        v6.a.W(obj2);
                        gd.a aVar = this.startStopMutex;
                        fVar.L$0 = this;
                        fVar.L$1 = aVar;
                        fVar.label = 1;
                        gd.d dVar3 = (gd.d) aVar;
                        Object c3 = dVar3.c(fVar);
                        gc.a aVar2 = gc.a.f2559g;
                        if (c3 == aVar2) {
                            return aVar2;
                        }
                        dVar2 = this;
                        obj = dVar3;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj3 = (gd.a) fVar.L$1;
                        dVar2 = (d) fVar.L$0;
                        v6.a.W(obj2);
                        obj = obj3;
                    }
                    bVar = dVar2.locationUpdateListener;
                    if (bVar != null) {
                        bVar.close();
                        dVar2.locationUpdateListener = null;
                    }
                    if (dVar2.hmsFusedLocationClient != null) {
                        dVar2.hmsFusedLocationClient = null;
                    }
                    dVar2.lastLocation = null;
                    ((gd.d) obj).d(null);
                    return o.f277a;
                }
            }
            bVar = dVar2.locationUpdateListener;
            if (bVar != null) {
            }
            if (dVar2.hmsFusedLocationClient != null) {
            }
            dVar2.lastLocation = null;
            ((gd.d) obj).d(null);
            return o.f277a;
        } catch (Throwable th) {
            ((gd.d) obj).d(null);
            throw th;
        }
        fVar = new f(dVar);
        Object obj22 = fVar.result;
        i10 = fVar.label;
        if (i10 != 0) {
        }
    }

    @Override // z9.a, com.onesignal.common.events.d
    public void subscribe(z9.b bVar) {
        j.e(bVar, "handler");
        this.event.subscribe(bVar);
    }

    @Override // z9.a, com.onesignal.common.events.d
    public void unsubscribe(z9.b bVar) {
        j.e(bVar, "handler");
        this.event.unsubscribe(bVar);
    }
}
