package com.onesignal.location.internal.controller.impl;

import I7.l;
import I7.p;
import S7.AbstractC0410y;
import S7.F;
import S7.InterfaceC0408w;
import a8.InterfaceC0451a;
import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import f5.InterfaceC4520a;
import f5.InterfaceC4521b;
import java.io.Closeable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.r;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class d implements InterfaceC4520a {
    private final x4.f _applicationService;
    private final com.onesignal.common.events.b event;
    private FusedLocationProviderClient hmsFusedLocationClient;
    private Location lastLocation;
    private final a locationHandlerThread;
    private b locationUpdateListener;
    private final InterfaceC0451a startStopMutex;

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
            kotlin.jvm.internal.h.e(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    public static final class b extends LocationCallback implements x4.e, Closeable {
        private final x4.f _applicationService;
        private final d _parent;
        private boolean hasExistingRequest;
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public b(d _parent, x4.f _applicationService, FusedLocationProviderClient huaweiFusedLocationProviderClient) {
            kotlin.jvm.internal.h.e(_parent, "_parent");
            kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
            kotlin.jvm.internal.h.e(huaweiFusedLocationProviderClient, "huaweiFusedLocationProviderClient");
            this._parent = _parent;
            this._applicationService = _applicationService;
            this.huaweiFusedLocationProviderClient = huaweiFusedLocationProviderClient;
            _applicationService.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (this.hasExistingRequest) {
                this.huaweiFusedLocationProviderClient.removeLocationUpdates(this);
            }
            long j6 = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j6).setInterval(j6).setMaxWaitTime((long) (j6 * 1.5d)).setPriority(102);
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

        @Override // x4.e
        public void onFocus(boolean z6) {
            com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationResult(LocationResult locationResult) {
            kotlin.jvm.internal.h.e(locationResult, "locationResult");
            com.onesignal.debug.internal.logging.b.debug$default("HMSLocationController onLocationResult: " + locationResult, null, 2, null);
            this._parent.lastLocation = locationResult.getLastLocation();
        }

        @Override // x4.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    public static final class c extends B7.h implements l {
        final /* synthetic */ FusedLocationProviderClient $locationClient;
        final /* synthetic */ r $retVal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FusedLocationProviderClient fusedLocationProviderClient, r rVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$locationClient = fusedLocationProviderClient;
            this.$retVal = rVar;
        }

        private static final void invokeSuspend$lambda$0(r rVar, r rVar2, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.e) rVar.f38644n).wake();
            } else {
                rVar2.f38644n = location;
                ((com.onesignal.common.threading.e) rVar.f38644n).wake();
            }
        }

        private static final void invokeSuspend$lambda$1(r rVar, Exception exc) {
            com.onesignal.debug.internal.logging.b.warn("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.e) rVar.f38644n).wake();
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new c(this.$locationClient, this.$retVal, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                com.onesignal.common.threading.e eVar = new com.onesignal.common.threading.e();
                this.$locationClient.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                this.label = 1;
                if (eVar.waitForWake(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((c) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    /* renamed from: com.onesignal.location.internal.controller.impl.d$d, reason: collision with other inner class name */
    public static final class C0221d extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0221d(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.start(this);
        }
    }

    public static final class e extends B7.h implements p {
        final /* synthetic */ r $self;
        final /* synthetic */ kotlin.jvm.internal.p $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        public static final class a extends i implements l {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC4521b) obj);
                return v.f41073a;
            }

            public final void invoke(InterfaceC4521b it) {
                kotlin.jvm.internal.h.e(it, "it");
                Location location = this.this$0.lastLocation;
                kotlin.jvm.internal.h.b(location);
                it.onLocationChanged(location);
            }
        }

        public static final class b extends i implements l {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC4521b) obj);
                return v.f41073a;
            }

            public final void invoke(InterfaceC4521b it) {
                kotlin.jvm.internal.h.e(it, "it");
                Location location = this.this$0.lastLocation;
                kotlin.jvm.internal.h.b(location);
                it.onLocationChanged(location);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlin.jvm.internal.p pVar, r rVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$wasSuccessful = pVar;
            this.$self = rVar;
        }

        private static final void invokeSuspend$lambda$2$lambda$0(r rVar, d dVar, Location location) {
            com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.onesignal.common.threading.f) rVar.f38644n).wake(Boolean.FALSE);
            } else {
                dVar.lastLocation = location;
                ((com.onesignal.common.threading.f) rVar.f38644n).wake(Boolean.TRUE);
            }
        }

        private static final void invokeSuspend$lambda$2$lambda$1(r rVar, Exception exc) {
            com.onesignal.debug.internal.logging.b.warn("Huawei LocationServices getLastLocation failed!", exc);
            ((com.onesignal.common.threading.f) rVar.f38644n).wake(Boolean.FALSE);
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return d.this.new e(this.$wasSuccessful, this.$self, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((e) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00f7 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #2 {all -> 0x0028, blocks: (B:7:0x0023, B:8:0x00eb, B:10:0x00f7), top: B:6:0x0023 }] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8, types: [a8.a] */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r7v9, types: [a8.a] */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a8.d dVar;
            kotlin.jvm.internal.p pVar;
            d dVar2;
            r rVar;
            ?? r42;
            Throwable th;
            r rVar2;
            kotlin.jvm.internal.p pVar2;
            kotlin.jvm.internal.p pVar3;
            d dVar3;
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    InterfaceC0451a interfaceC0451a = d.this.startStopMutex;
                    d dVar4 = d.this;
                    kotlin.jvm.internal.p pVar4 = this.$wasSuccessful;
                    r rVar3 = this.$self;
                    this.L$0 = interfaceC0451a;
                    this.L$1 = dVar4;
                    this.L$2 = pVar4;
                    this.L$3 = rVar3;
                    this.label = 1;
                    dVar = (a8.d) interfaceC0451a;
                    if (dVar.c(this) != aVar) {
                        pVar = pVar4;
                        dVar2 = dVar4;
                        rVar = rVar3;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar2 = (kotlin.jvm.internal.p) this.L$4;
                    rVar2 = (r) this.L$3;
                    pVar3 = (kotlin.jvm.internal.p) this.L$2;
                    dVar3 = (d) this.L$1;
                    r42 = (InterfaceC0451a) this.L$0;
                    try {
                        Q3.b.s(obj);
                        r42 = r42;
                        pVar2.f38642n = ((Boolean) obj).booleanValue();
                        if (pVar3.f38642n) {
                            dVar3.event.fire(new b(dVar3));
                            d dVar5 = (d) rVar2.f38644n;
                            x4.f fVar = dVar3._applicationService;
                            FusedLocationProviderClient fusedLocationProviderClient = dVar3.hmsFusedLocationClient;
                            kotlin.jvm.internal.h.b(fusedLocationProviderClient);
                            dVar3.locationUpdateListener = new b(dVar5, fVar, fusedLocationProviderClient);
                        }
                        dVar = r42;
                        dVar.d(null);
                        return v.f41073a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((a8.d) r42).d(null);
                        throw th;
                    }
                }
                rVar = (r) this.L$3;
                pVar = (kotlin.jvm.internal.p) this.L$2;
                dVar2 = (d) this.L$1;
                ?? r72 = (InterfaceC0451a) this.L$0;
                Q3.b.s(obj);
                dVar = r72;
                if (dVar2.hmsFusedLocationClient == null) {
                    try {
                        dVar2.hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient(dVar2._applicationService.getAppContext());
                    } catch (Exception e9) {
                        com.onesignal.debug.internal.logging.b.warn$default("Huawei LocationServices getFusedLocationProviderClient failed! " + e9, null, 2, null);
                        pVar.f38642n = false;
                    }
                }
                if (dVar2.lastLocation != null) {
                    dVar2.event.fire(new a(dVar2));
                    dVar.d(null);
                    return v.f41073a;
                }
                com.onesignal.common.threading.f fVar2 = new com.onesignal.common.threading.f();
                FusedLocationProviderClient fusedLocationProviderClient2 = dVar2.hmsFusedLocationClient;
                kotlin.jvm.internal.h.b(fusedLocationProviderClient2);
                fusedLocationProviderClient2.getLastLocation().addOnSuccessListener(new com.onesignal.location.internal.controller.impl.e()).addOnFailureListener(new com.onesignal.location.internal.controller.impl.f());
                this.L$0 = dVar;
                this.L$1 = dVar2;
                this.L$2 = pVar;
                this.L$3 = rVar;
                this.L$4 = pVar;
                this.label = 2;
                Object waitForWake = fVar2.waitForWake(this);
                if (waitForWake != aVar) {
                    r42 = dVar;
                    obj = waitForWake;
                    rVar2 = rVar;
                    pVar2 = pVar;
                    pVar3 = pVar2;
                    dVar3 = dVar2;
                    pVar2.f38642n = ((Boolean) obj).booleanValue();
                    if (pVar3.f38642n) {
                    }
                    dVar = r42;
                    dVar.d(null);
                    return v.f41073a;
                }
                return aVar;
            } catch (Throwable th3) {
                r42 = dVar;
                th = th3;
                ((a8.d) r42).d(null);
                throw th;
            }
        }
    }

    public static final class f extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.stop(this);
        }
    }

    public d(x4.f _applicationService) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
        this.locationHandlerThread = new a();
        this.startStopMutex = new a8.d();
        this.event = new com.onesignal.common.events.b();
    }

    @Override // f5.InterfaceC4520a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // f5.InterfaceC4520a
    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        r rVar = new r();
        com.onesignal.common.threading.c.suspendifyOnIO(new c(fusedLocationProviderClient, rVar, null));
        return (Location) rVar.f38644n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // f5.InterfaceC4520a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(InterfaceC5240d interfaceC5240d) {
        C0221d c0221d;
        int i;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5240d instanceof C0221d) {
            c0221d = (C0221d) interfaceC5240d;
            int i4 = c0221d.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0221d.label = i4 - Integer.MIN_VALUE;
                Object obj = c0221d.result;
                A7.a aVar = A7.a.f215n;
                i = c0221d.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    r rVar = new r();
                    rVar.f38644n = this;
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    Z7.d dVar = F.f3000c;
                    e eVar = new e(pVar2, rVar, null);
                    c0221d.L$0 = pVar2;
                    c0221d.label = 1;
                    if (AbstractC0410y.y(dVar, eVar, c0221d) == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) c0221d.L$0;
                    Q3.b.s(obj);
                }
                return Boolean.valueOf(pVar.f38642n);
            }
        }
        c0221d = new C0221d(interfaceC5240d);
        Object obj2 = c0221d.result;
        A7.a aVar2 = A7.a.f215n;
        i = c0221d.label;
        if (i != 0) {
        }
        return Boolean.valueOf(pVar.f38642n);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0060), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0060), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // f5.InterfaceC4520a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(InterfaceC5240d interfaceC5240d) {
        f fVar;
        int i;
        d dVar;
        InterfaceC0451a interfaceC0451a;
        b bVar;
        try {
            if (interfaceC5240d instanceof f) {
                fVar = (f) interfaceC5240d;
                int i4 = fVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    fVar.label = i4 - Integer.MIN_VALUE;
                    Object obj = fVar.result;
                    A7.a aVar = A7.a.f215n;
                    i = fVar.label;
                    if (i != 0) {
                        Q3.b.s(obj);
                        InterfaceC0451a interfaceC0451a2 = this.startStopMutex;
                        fVar.L$0 = this;
                        fVar.L$1 = interfaceC0451a2;
                        fVar.label = 1;
                        a8.d dVar2 = (a8.d) interfaceC0451a2;
                        if (dVar2.c(fVar) == aVar) {
                            return aVar;
                        }
                        dVar = this;
                        interfaceC0451a = dVar2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0451a = (InterfaceC0451a) fVar.L$1;
                        dVar = (d) fVar.L$0;
                        Q3.b.s(obj);
                    }
                    bVar = dVar.locationUpdateListener;
                    if (bVar != null) {
                        bVar.close();
                        dVar.locationUpdateListener = null;
                    }
                    if (dVar.hmsFusedLocationClient != null) {
                        dVar.hmsFusedLocationClient = null;
                    }
                    dVar.lastLocation = null;
                    ((a8.d) interfaceC0451a).d(null);
                    return v.f41073a;
                }
            }
            bVar = dVar.locationUpdateListener;
            if (bVar != null) {
            }
            if (dVar.hmsFusedLocationClient != null) {
            }
            dVar.lastLocation = null;
            ((a8.d) interfaceC0451a).d(null);
            return v.f41073a;
        } catch (Throwable th) {
            ((a8.d) interfaceC0451a).d(null);
            throw th;
        }
        fVar = new f(interfaceC5240d);
        Object obj2 = fVar.result;
        A7.a aVar2 = A7.a.f215n;
        i = fVar.label;
        if (i != 0) {
        }
    }

    @Override // f5.InterfaceC4520a, com.onesignal.common.events.d
    public void subscribe(InterfaceC4521b handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.event.subscribe(handler);
    }

    @Override // f5.InterfaceC4520a, com.onesignal.common.events.d
    public void unsubscribe(InterfaceC4521b handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.event.unsubscribe(handler);
    }
}
