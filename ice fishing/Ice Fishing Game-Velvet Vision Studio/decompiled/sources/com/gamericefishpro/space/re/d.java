package com.gamericefishpro.space.re;

import android.location.Location;
import android.os.Handler;
import android.os.HandlerThread;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.ei.w;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.vh.i;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.gamericefishpro.space.qe.a {
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.dc.b event;
    private FusedLocationProviderClient hmsFusedLocationClient;
    private Location lastLocation;
    private final a locationHandlerThread;
    private b locationUpdateListener;
    private final com.gamericefishpro.space.xi.a startStopMutex;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
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
            Intrinsics.checkNotNullParameter(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends LocationCallback implements com.gamericefishpro.space.lc.e, Closeable {
        private final com.gamericefishpro.space.lc.f _applicationService;
        private final d _parent;
        private boolean hasExistingRequest;
        private final FusedLocationProviderClient huaweiFusedLocationProviderClient;

        public b(d _parent, com.gamericefishpro.space.lc.f _applicationService, FusedLocationProviderClient huaweiFusedLocationProviderClient) {
            Intrinsics.checkNotNullParameter(_parent, "_parent");
            Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
            Intrinsics.checkNotNullParameter(huaweiFusedLocationProviderClient, "huaweiFusedLocationProviderClient");
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
            long j = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            com.gamericefishpro.space.od.b.debug$default("HMSLocationController Huawei LocationServices requestLocationUpdates!", null, 2, null);
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

        @Override // com.gamericefishpro.space.lc.e
        public void onFocus(boolean z) {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationResult(LocationResult locationResult) {
            Intrinsics.checkNotNullParameter(locationResult, "locationResult");
            com.gamericefishpro.space.od.b.debug$default("HMSLocationController onLocationResult: " + locationResult, null, 2, null);
            this._parent.lastLocation = locationResult.getLastLocation();
        }

        @Override // com.gamericefishpro.space.lc.e
        public void onUnfocused() {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends i implements Function1 {
        final /* synthetic */ FusedLocationProviderClient $locationClient;
        final /* synthetic */ a0 $retVal;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FusedLocationProviderClient fusedLocationProviderClient, a0 a0Var, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$locationClient = fusedLocationProviderClient;
            this.$retVal = a0Var;
        }

        private static final void invokeSuspend$lambda$0(a0 a0Var, a0 a0Var2, Location location) {
            com.gamericefishpro.space.od.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.gamericefishpro.space.ic.c) a0Var.d).wake();
            } else {
                a0Var2.d = location;
                ((com.gamericefishpro.space.ic.c) a0Var.d).wake();
            }
        }

        private static final void invokeSuspend$lambda$1(a0 a0Var, Exception exc) {
            com.gamericefishpro.space.od.b.error("Huawei LocationServices getLastLocation failed!", exc);
            ((com.gamericefishpro.space.ic.c) a0Var.d).wake();
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return new c(this.$locationClient, this.$retVal, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((c) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                a0 a0Var = new a0();
                a0Var.d = new com.gamericefishpro.space.ic.c();
                this.$locationClient.getLastLocation().addOnSuccessListener(new com.gamericefishpro.space.re.e()).addOnFailureListener(new com.gamericefishpro.space.re.f());
                com.gamericefishpro.space.ic.c cVar = (com.gamericefishpro.space.ic.c) a0Var.d;
                this.label = 1;
                if (cVar.waitForWake(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.re.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0049d extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0049d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.start(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends i implements Function2 {
        final /* synthetic */ a0 $self;
        final /* synthetic */ w $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends l implements Function1 {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.qe.b) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.qe.b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Location location = this.this$0.lastLocation;
                Intrinsics.b(location);
                it.onLocationChanged(location);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class b extends l implements Function1 {
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.qe.b) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.qe.b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Location location = this.this$0.lastLocation;
                Intrinsics.b(location);
                it.onLocationChanged(location);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w wVar, a0 a0Var, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$wasSuccessful = wVar;
            this.$self = a0Var;
        }

        private static final void invokeSuspend$lambda$2$lambda$0(a0 a0Var, d dVar, Location location) {
            com.gamericefishpro.space.od.b.warn$default("Huawei LocationServices getLastLocation returned location: " + location, null, 2, null);
            if (location == null) {
                ((com.gamericefishpro.space.ic.d) a0Var.d).wake(Boolean.FALSE);
            } else {
                dVar.lastLocation = location;
                ((com.gamericefishpro.space.ic.d) a0Var.d).wake(Boolean.TRUE);
            }
        }

        private static final void invokeSuspend$lambda$2$lambda$1(a0 a0Var, Exception exc) {
            com.gamericefishpro.space.od.b.error("Huawei LocationServices getLastLocation failed!", exc);
            ((com.gamericefishpro.space.ic.d) a0Var.d).wake(Boolean.FALSE);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return d.this.new e(this.$wasSuccessful, this.$self, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((e) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00a3 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:18:0x006c, B:20:0x0072, B:27:0x009d, B:29:0x00a3, B:30:0x00b0, B:25:0x0088), top: B:43:0x006c, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:18:0x006c, B:20:0x0072, B:27:0x009d, B:29:0x00a3, B:30:0x00b0, B:25:0x0088), top: B:43:0x006c, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:36:0x0101 A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:7:0x0023, B:34:0x00f5, B:36:0x0101, B:38:0x0127), top: B:44:0x0023 }] */
        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            com.gamericefishpro.space.xi.a aVar;
            w wVar;
            d dVar;
            a0 a0Var;
            com.gamericefishpro.space.xi.a aVar2;
            Throwable th;
            Object objWaitForWake;
            a0 a0Var2;
            w wVar2;
            w wVar3;
            d dVar2;
            com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            try {
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    aVar = d.this.startStopMutex;
                    d dVar3 = d.this;
                    w wVar4 = this.$wasSuccessful;
                    a0 a0Var3 = this.$self;
                    this.L$0 = aVar;
                    this.L$1 = dVar3;
                    this.L$2 = wVar4;
                    this.L$3 = a0Var3;
                    this.label = 1;
                    if (aVar.c(this) != aVar3) {
                        wVar = wVar4;
                        dVar = dVar3;
                        a0Var = a0Var3;
                    }
                    return aVar3;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar2 = (w) this.L$4;
                    a0Var2 = (a0) this.L$3;
                    wVar3 = (w) this.L$2;
                    dVar2 = (d) this.L$1;
                    aVar2 = (com.gamericefishpro.space.xi.a) this.L$0;
                    try {
                        com.gamericefishpro.space.wa.b.P(obj);
                        wVar2.d = ((Boolean) obj).booleanValue();
                        if (wVar3.d) {
                            dVar2.event.fire(new b(dVar2));
                            d dVar4 = (d) a0Var2.d;
                            com.gamericefishpro.space.lc.f fVar = dVar2._applicationService;
                            FusedLocationProviderClient fusedLocationProviderClient = dVar2.hmsFusedLocationClient;
                            Intrinsics.b(fusedLocationProviderClient);
                            dVar2.locationUpdateListener = new b(dVar4, fVar, fusedLocationProviderClient);
                        }
                        aVar = aVar2;
                        aVar2 = aVar;
                        Unit unit = Unit.a;
                        aVar2.b(null);
                        return Unit.a;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.b(null);
                        throw th;
                    }
                }
                a0Var = (a0) this.L$3;
                wVar = (w) this.L$2;
                dVar = (d) this.L$1;
                com.gamericefishpro.space.xi.a aVar4 = (com.gamericefishpro.space.xi.a) this.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                aVar = aVar4;
                if (dVar.hmsFusedLocationClient == null) {
                    try {
                        dVar.hmsFusedLocationClient = LocationServices.getFusedLocationProviderClient(dVar._applicationService.getAppContext());
                        if (dVar.lastLocation != null) {
                            a0 a0Var4 = new a0();
                            a0Var4.d = new com.gamericefishpro.space.ic.d();
                            FusedLocationProviderClient fusedLocationProviderClient2 = dVar.hmsFusedLocationClient;
                            Intrinsics.b(fusedLocationProviderClient2);
                            fusedLocationProviderClient2.getLastLocation().addOnSuccessListener(new com.gamericefishpro.space.re.e()).addOnFailureListener(new com.gamericefishpro.space.re.f());
                            com.gamericefishpro.space.ic.d dVar5 = (com.gamericefishpro.space.ic.d) a0Var4.d;
                            this.L$0 = aVar;
                            this.L$1 = dVar;
                            this.L$2 = wVar;
                            this.L$3 = a0Var;
                            this.L$4 = wVar;
                            this.label = 2;
                            objWaitForWake = dVar5.waitForWake(this);
                            if (objWaitForWake != aVar3) {
                                aVar2 = aVar;
                                obj = objWaitForWake;
                                a0Var2 = a0Var;
                                wVar2 = wVar;
                                wVar3 = wVar2;
                                dVar2 = dVar;
                                wVar2.d = ((Boolean) obj).booleanValue();
                                if (wVar3.d) {
                                    dVar2.event.fire(new b(dVar2));
                                    d dVar6 = (d) a0Var2.d;
                                    com.gamericefishpro.space.lc.f fVar2 = dVar2._applicationService;
                                    FusedLocationProviderClient fusedLocationProviderClient3 = dVar2.hmsFusedLocationClient;
                                    Intrinsics.b(fusedLocationProviderClient3);
                                    dVar2.locationUpdateListener = new b(dVar6, fVar2, fusedLocationProviderClient3);
                                }
                                aVar = aVar2;
                            }
                            return aVar3;
                        }
                        dVar.event.fire(new a(dVar));
                    } catch (Exception e) {
                        com.gamericefishpro.space.od.b.error$default("Huawei LocationServices getFusedLocationProviderClient failed! " + e, null, 2, null);
                        wVar.d = false;
                    }
                } else {
                    if (dVar.lastLocation != null) {
                        a0 a0Var5 = new a0();
                        a0Var5.d = new com.gamericefishpro.space.ic.d();
                        FusedLocationProviderClient fusedLocationProviderClient4 = dVar.hmsFusedLocationClient;
                        Intrinsics.b(fusedLocationProviderClient4);
                        fusedLocationProviderClient4.getLastLocation().addOnSuccessListener(new com.gamericefishpro.space.re.e()).addOnFailureListener(new com.gamericefishpro.space.re.f());
                        com.gamericefishpro.space.ic.d dVar7 = (com.gamericefishpro.space.ic.d) a0Var5.d;
                        this.L$0 = aVar;
                        this.L$1 = dVar;
                        this.L$2 = wVar;
                        this.L$3 = a0Var;
                        this.L$4 = wVar;
                        this.label = 2;
                        objWaitForWake = dVar7.waitForWake(this);
                        if (objWaitForWake != aVar3) {
                            aVar2 = aVar;
                            obj = objWaitForWake;
                            a0Var2 = a0Var;
                            wVar2 = wVar;
                            wVar3 = wVar2;
                            dVar2 = dVar;
                            wVar2.d = ((Boolean) obj).booleanValue();
                            if (wVar3.d) {
                                dVar2.event.fire(new b(dVar2));
                                d dVar8 = (d) a0Var2.d;
                                com.gamericefishpro.space.lc.f fVar3 = dVar2._applicationService;
                                FusedLocationProviderClient fusedLocationProviderClient5 = dVar2.hmsFusedLocationClient;
                                Intrinsics.b(fusedLocationProviderClient5);
                                dVar2.locationUpdateListener = new b(dVar8, fVar3, fusedLocationProviderClient5);
                            }
                            aVar = aVar2;
                        }
                        return aVar3;
                    }
                    dVar.event.fire(new a(dVar));
                }
                aVar2 = aVar;
                Unit unit2 = Unit.a;
                aVar2.b(null);
                return Unit.a;
            } catch (Throwable th3) {
                aVar2 = aVar;
                th = th3;
                aVar2.b(null);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.stop(this);
        }
    }

    public d(com.gamericefishpro.space.lc.f _applicationService) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
        this.locationHandlerThread = new a();
        this.startStopMutex = new com.gamericefishpro.space.xi.c();
        this.event = new com.gamericefishpro.space.dc.b();
    }

    @Override // com.gamericefishpro.space.qe.a, com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // com.gamericefishpro.space.qe.a
    public Location getLastLocation() {
        FusedLocationProviderClient fusedLocationProviderClient = this.hmsFusedLocationClient;
        if (fusedLocationProviderClient == null) {
            return null;
        }
        a0 a0Var = new a0();
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new c(fusedLocationProviderClient, a0Var, null), 1, null);
        return (Location) a0Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.qe.a
    public Object start(com.gamericefishpro.space.th.a aVar) {
        C0049d c0049d;
        w wVar;
        if (aVar instanceof C0049d) {
            c0049d = (C0049d) aVar;
            int i = c0049d.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0049d.label = i - Integer.MIN_VALUE;
            } else {
                c0049d = new C0049d(aVar);
            }
        } else {
            c0049d = new C0049d(aVar);
        }
        Object obj = c0049d.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0049d.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            a0 a0Var = new a0();
            a0Var.d = this;
            w wVar2 = new w();
            com.gamericefishpro.space.wi.e eVar = k0.a;
            com.gamericefishpro.space.wi.d dVar = com.gamericefishpro.space.wi.d.i;
            e eVar2 = new e(wVar2, a0Var, null);
            c0049d.L$0 = wVar2;
            c0049d.label = 1;
            if (com.gamericefishpro.space.pi.a0.D(dVar, eVar2, c0049d) == aVar2) {
                return aVar2;
            }
            wVar = wVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (w) c0049d.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Boolean.valueOf(wVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.qe.a
    public Object stop(com.gamericefishpro.space.th.a aVar) {
        f fVar;
        d dVar;
        com.gamericefishpro.space.xi.a aVar2;
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i = fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.label = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(aVar);
            }
        } else {
            fVar = new f(aVar);
        }
        Object obj = fVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = fVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.xi.a aVar4 = this.startStopMutex;
            fVar.L$0 = this;
            fVar.L$1 = aVar4;
            fVar.label = 1;
            if (aVar4.c(fVar) == aVar3) {
                return aVar3;
            }
            dVar = this;
            aVar2 = aVar4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (com.gamericefishpro.space.xi.a) fVar.L$1;
            dVar = (d) fVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        try {
            b bVar = dVar.locationUpdateListener;
            if (bVar != null) {
                bVar.close();
                dVar.locationUpdateListener = null;
            }
            if (dVar.hmsFusedLocationClient != null) {
                dVar.hmsFusedLocationClient = null;
            }
            dVar.lastLocation = null;
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            aVar2.b(null);
        }
    }

    @Override // com.gamericefishpro.space.qe.a, com.gamericefishpro.space.dc.d
    public void subscribe(com.gamericefishpro.space.qe.b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.event.subscribe(handler);
    }

    @Override // com.gamericefishpro.space.qe.a, com.gamericefishpro.space.dc.d
    public void unsubscribe(com.gamericefishpro.space.qe.b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.event.unsubscribe(handler);
    }
}
