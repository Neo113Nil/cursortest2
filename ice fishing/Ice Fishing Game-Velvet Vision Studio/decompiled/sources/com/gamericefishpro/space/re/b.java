package com.gamericefishpro.space.re;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.gamericefishpro.space.b8.k;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.ei.w;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.pi.y1;
import com.gamericefishpro.space.u8.r0;
import com.gamericefishpro.space.u8.u;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.vh.i;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.qe.a {
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.re.g _fusedLocationApiWrapper;
    private final com.gamericefishpro.space.dc.b event;
    private com.gamericefishpro.space.re.c googleApiClient;
    private Location lastLocation;
    private final c locationHandlerThread;
    private d locationUpdateListener;
    private final com.gamericefishpro.space.xi.a startStopMutex;
    public static final a Companion = new a(null);
    private static final int API_FALLBACK_TIME = 30000;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getAPI_FALLBACK_TIME() {
            return b.API_FALLBACK_TIME;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.re.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0047b implements com.gamericefishpro.space.t8.f, com.gamericefishpro.space.t8.g {
        private final b _parent;

        /* JADX INFO: renamed from: com.gamericefishpro.space.re.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends i implements Function1 {
            int label;

            public a(com.gamericefishpro.space.th.a aVar) {
                super(1, aVar);
            }

            @Override // com.gamericefishpro.space.vh.a
            public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
                return C0047b.this.new a(aVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(com.gamericefishpro.space.th.a aVar) {
                return ((a) create(aVar)).invokeSuspend(Unit.a);
            }

            @Override // com.gamericefishpro.space.vh.a
            public final Object invokeSuspend(Object obj) {
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.label;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    b bVar = C0047b.this._parent;
                    this.label = 1;
                    if (bVar.stop(this) == aVar) {
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

        public C0047b(b _parent) {
            Intrinsics.checkNotNullParameter(_parent, "_parent");
            this._parent = _parent;
        }

        @Override // com.gamericefishpro.space.t8.f
        public void onConnected(Bundle bundle) {
            com.gamericefishpro.space.od.b.debug$default("GMSLocationController GoogleApiClientListener onConnected", null, 2, null);
        }

        @Override // com.gamericefishpro.space.t8.g
        public void onConnectionFailed(com.gamericefishpro.space.s8.b connectionResult) {
            Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
            com.gamericefishpro.space.od.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult, null, 2, null);
            com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new a(null), 1, null);
        }

        @Override // com.gamericefishpro.space.t8.f
        public void onConnectionSuspended(int i) {
            com.gamericefishpro.space.od.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i, null, 2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends HandlerThread {
        private Handler mHandler;

        public c() {
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
    public static final class d implements LocationListener, com.gamericefishpro.space.lc.e, Closeable {
        private final com.gamericefishpro.space.lc.f _applicationService;
        private final com.gamericefishpro.space.re.g _fusedLocationApiWrapper;
        private final b _parent;
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;

        public d(com.gamericefishpro.space.lc.f _applicationService, b _parent, GoogleApiClient googleApiClient, com.gamericefishpro.space.re.g _fusedLocationApiWrapper) throws Exception {
            Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
            Intrinsics.checkNotNullParameter(_parent, "_parent");
            Intrinsics.checkNotNullParameter(googleApiClient, "googleApiClient");
            Intrinsics.checkNotNullParameter(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
            this._applicationService = _applicationService;
            this._parent = _parent;
            this.googleApiClient = googleApiClient;
            this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
            if (!googleApiClient.d()) {
                throw new Exception("googleApiClient not connected, cannot listen!");
            }
            _applicationService.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (!this.googleApiClient.d()) {
                com.gamericefishpro.space.od.b.warn$default("Attempt to refresh location request but not currently connected!", null, 2, null);
                return;
            }
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
            long j = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            com.gamericefishpro.space.od.b.debug$default("GMSLocationController GoogleApiClient requestLocationUpdates!", null, 2, null);
            com.gamericefishpro.space.re.g gVar = this._fusedLocationApiWrapper;
            GoogleApiClient googleApiClient = this.googleApiClient;
            Intrinsics.b(priority);
            gVar.requestLocationUpdates(googleApiClient, priority, this);
            this.hasExistingRequest = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._applicationService.removeApplicationLifecycleHandler(this);
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
        }

        @Override // com.gamericefishpro.space.lc.e
        public void onFocus(boolean z) {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationChanged(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            com.gamericefishpro.space.od.b.debug$default("GMSLocationController onLocationChanged: " + location, null, 2, null);
            this._parent.setLocationAndFire(location);
        }

        @Override // com.gamericefishpro.space.lc.e
        public void onUnfocused() {
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends l implements Function1 {
        final /* synthetic */ Location $location;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Location location) {
            super(1);
            this.$location = location;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.qe.b) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.qe.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onLocationChanged(this.$location);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.start(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g extends i implements Function2 {
        final /* synthetic */ a0 $self;
        final /* synthetic */ w $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends l implements Function1 {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(1);
                this.this$0 = bVar;
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

        /* JADX INFO: renamed from: com.gamericefishpro.space.re.b$g$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class C0048b extends i implements Function2 {
            final /* synthetic */ a0 $self;
            final /* synthetic */ w $wasSuccessful;
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0048b(a0 a0Var, b bVar, w wVar, com.gamericefishpro.space.th.a aVar) {
                super(2, aVar);
                this.$self = a0Var;
                this.this$0 = bVar;
                this.$wasSuccessful = wVar;
            }

            @Override // com.gamericefishpro.space.vh.a
            public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
                return new C0048b(this.$self, this.this$0, this.$wasSuccessful, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
                return ((C0048b) create(xVar, aVar)).invokeSuspend(Unit.a);
            }

            @Override // com.gamericefishpro.space.vh.a
            public final Object invokeSuspend(Object obj) {
                Location lastLocation;
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
                C0047b c0047b = new C0047b((b) this.$self.d);
                Context appContext = this.this$0._applicationService.getAppContext();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                boolean z = false;
                com.gamericefishpro.space.t.e eVar = new com.gamericefishpro.space.t.e(0);
                com.gamericefishpro.space.t.e eVar2 = new com.gamericefishpro.space.t.e(0);
                Object obj2 = com.gamericefishpro.space.s8.e.c;
                com.gamericefishpro.space.o9.b bVar = com.gamericefishpro.space.o9.c.a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                appContext.getMainLooper();
                String packageName = appContext.getPackageName();
                String name = appContext.getClass().getName();
                com.gamericefishpro.space.t8.c cVar = LocationServices.API;
                c0.h(cVar, "Api must not be null");
                eVar2.put(cVar, null);
                c0.h(cVar.a, "Base client builder must not be null");
                List list = Collections.EMPTY_LIST;
                hashSet2.addAll(list);
                hashSet.addAll(list);
                arrayList.add(c0047b);
                arrayList2.add(c0047b);
                Handler mHandler = this.this$0.locationHandlerThread.getMHandler();
                c0.h(mHandler, "Handler must not be null");
                Looper looper = mHandler.getLooper();
                boolean z2 = true;
                c0.a("must call addApi() to add at least one API", !eVar2.isEmpty());
                com.gamericefishpro.space.o9.a aVar2 = com.gamericefishpro.space.o9.a.a;
                com.gamericefishpro.space.t8.c cVar2 = com.gamericefishpro.space.o9.c.b;
                if (eVar2.containsKey(cVar2)) {
                    aVar2 = (com.gamericefishpro.space.o9.a) eVar2.get(cVar2);
                }
                k kVar = new k(hashSet, eVar, packageName, name, aVar2);
                Map map = (Map) kVar.i;
                com.gamericefishpro.space.t.e eVar3 = new com.gamericefishpro.space.t.e(0);
                com.gamericefishpro.space.t.e eVar4 = new com.gamericefishpro.space.t.e(0);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((com.gamericefishpro.space.t.b) eVar2.keySet()).iterator();
                while (true) {
                    com.gamericefishpro.space.t.a aVar3 = (com.gamericefishpro.space.t.a) it;
                    if (!aVar3.hasNext()) {
                        break;
                    }
                    com.gamericefishpro.space.t8.c cVar3 = (com.gamericefishpro.space.t8.c) aVar3.next();
                    Object obj3 = eVar2.get(cVar3);
                    boolean z3 = map.get(cVar3) != null ? z2 : z;
                    eVar3.put(cVar3, Boolean.valueOf(z3));
                    r0 r0Var = new r0(cVar3, z3);
                    arrayList3.add(r0Var);
                    d5 d5Var = cVar3.a;
                    c0.g(d5Var);
                    k kVar2 = kVar;
                    Looper looper2 = looper;
                    com.gamericefishpro.space.t.e eVar5 = eVar4;
                    com.gamericefishpro.space.t8.a aVarM = d5Var.m(appContext, looper2, kVar2, obj3, r0Var, r0Var);
                    eVar5.put(cVar3.b, aVarM);
                    aVarM.getClass();
                    eVar4 = eVar5;
                    looper = looper2;
                    kVar = kVar2;
                    z2 = true;
                    z = false;
                }
                k kVar3 = kVar;
                Looper looper3 = looper;
                com.gamericefishpro.space.t.e eVar6 = eVar4;
                boolean z4 = z2;
                u uVar = new u(appContext, new ReentrantLock(), looper3, kVar3, eVar3, arrayList, arrayList2, eVar6, u.e(eVar6.values(), z4), arrayList3);
                Set set = GoogleApiClient.a;
                synchronized (set) {
                    set.add(uVar);
                }
                com.gamericefishpro.space.re.c cVar4 = new com.gamericefishpro.space.re.c(uVar);
                com.gamericefishpro.space.s8.b bVarBlockingConnect = cVar4.blockingConnect();
                if (bVarBlockingConnect == null || bVarBlockingConnect.c() != z4) {
                    StringBuilder sb = new StringBuilder("GMSLocationController connection to GoogleApiService failed: (");
                    sb.append(bVarBlockingConnect != null ? new Integer(bVarBlockingConnect.e) : null);
                    sb.append(") ");
                    sb.append(bVarBlockingConnect != null ? bVarBlockingConnect.v : null);
                    com.gamericefishpro.space.od.b.debug$default(sb.toString(), null, 2, null);
                } else {
                    if (this.this$0.lastLocation == null && (lastLocation = this.this$0._fusedLocationApiWrapper.getLastLocation(uVar)) != null) {
                        this.this$0.setLocationAndFire(lastLocation);
                    }
                    ((b) this.$self.d).locationUpdateListener = new d(this.this$0._applicationService, (b) this.$self.d, cVar4.getRealInstance(), this.this$0._fusedLocationApiWrapper);
                    ((b) this.$self.d).googleApiClient = cVar4;
                    this.$wasSuccessful.d = z4;
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w wVar, a0 a0Var, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$wasSuccessful = wVar;
            this.$self = a0Var;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new g(this.$wasSuccessful, this.$self, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((g) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
        
            if (com.gamericefishpro.space.pi.a0.E(r7, r3, r10) == r0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.gamericefishpro.space.uh.a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v11, types: [com.gamericefishpro.space.xi.a] */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v2, types: [com.gamericefishpro.space.xi.a] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v6 */
        @Override // com.gamericefishpro.space.vh.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            com.gamericefishpro.space.xi.a aVar;
            b bVar;
            w wVar;
            a0 a0Var;
            com.gamericefishpro.space.xi.a aVar2;
            ?? r0 = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        com.gamericefishpro.space.wa.b.P(obj);
                        aVar = b.this.startStopMutex;
                        bVar = b.this;
                        wVar = this.$wasSuccessful;
                        a0Var = this.$self;
                        this.L$0 = aVar;
                        this.L$1 = bVar;
                        this.L$2 = wVar;
                        this.L$3 = a0Var;
                        this.label = 1;
                        if (aVar.c(this) != r0) {
                        }
                        return r0;
                    }
                    if (i == 1) {
                        a0Var = (a0) this.L$3;
                        wVar = (w) this.L$2;
                        bVar = (b) this.L$1;
                        com.gamericefishpro.space.xi.a aVar3 = (com.gamericefishpro.space.xi.a) this.L$0;
                        com.gamericefishpro.space.wa.b.P(obj);
                        aVar = aVar3;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (com.gamericefishpro.space.xi.a) this.L$0;
                        try {
                            com.gamericefishpro.space.wa.b.P(obj);
                            r0 = aVar2;
                        } catch (y1 unused) {
                            com.gamericefishpro.space.od.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                            r0 = aVar2;
                        }
                    }
                    Unit unit = Unit.a;
                    r0.b(null);
                    return Unit.a;
                    if (bVar.googleApiClient != null) {
                        if (bVar.lastLocation != null) {
                            bVar.event.fire(new a(bVar));
                        } else {
                            Location lastLocation = bVar.getLastLocation();
                            if (lastLocation != null) {
                                bVar.setLocationAndFire(lastLocation);
                            }
                        }
                        wVar.d = true;
                    } else {
                        try {
                            long api_fallback_time = b.Companion.getAPI_FALLBACK_TIME();
                            C0048b c0048b = new C0048b(a0Var, bVar, wVar, null);
                            this.L$0 = aVar;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 2;
                        } catch (y1 unused2) {
                            aVar2 = aVar;
                            com.gamericefishpro.space.od.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                            r0 = aVar2;
                        }
                    }
                    r0 = aVar;
                    Unit unit2 = Unit.a;
                    r0.b(null);
                    return Unit.a;
                } catch (Throwable th) {
                    r0 = aVar;
                    th = th;
                    r0.b(null);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class h extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public h(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.stop(this);
        }
    }

    public b(com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.re.g _fusedLocationApiWrapper) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
        this._applicationService = _applicationService;
        this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
        this.locationHandlerThread = new c();
        this.startStopMutex = new com.gamericefishpro.space.xi.c();
        this.event = new com.gamericefishpro.space.dc.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationAndFire(Location location) {
        com.gamericefishpro.space.od.b.debug$default("GMSLocationController lastLocation: " + this.lastLocation, null, 2, null);
        this.lastLocation = location;
        this.event.fire(new e(location));
    }

    @Override // com.gamericefishpro.space.qe.a, com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // com.gamericefishpro.space.qe.a
    public Location getLastLocation() {
        GoogleApiClient realInstance;
        com.gamericefishpro.space.re.c cVar = this.googleApiClient;
        if (cVar == null || (realInstance = cVar.getRealInstance()) == null) {
            return null;
        }
        return this._fusedLocationApiWrapper.getLastLocation(realInstance);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.qe.a
    public Object start(com.gamericefishpro.space.th.a aVar) {
        f fVar;
        w wVar;
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
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = fVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            a0 a0Var = new a0();
            a0Var.d = this;
            w wVar2 = new w();
            com.gamericefishpro.space.wi.e eVar = k0.a;
            com.gamericefishpro.space.wi.d dVar = com.gamericefishpro.space.wi.d.i;
            g gVar = new g(wVar2, a0Var, null);
            fVar.L$0 = wVar2;
            fVar.label = 1;
            if (com.gamericefishpro.space.pi.a0.D(dVar, gVar, fVar) == aVar2) {
                return aVar2;
            }
            wVar = wVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (w) fVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Boolean.valueOf(wVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.qe.a
    public Object stop(com.gamericefishpro.space.th.a aVar) {
        h hVar;
        b bVar;
        com.gamericefishpro.space.xi.a aVar2;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i = hVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.label = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(aVar);
            }
        } else {
            hVar = new h(aVar);
        }
        Object obj = hVar.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = hVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.xi.a aVar4 = this.startStopMutex;
            hVar.L$0 = this;
            hVar.L$1 = aVar4;
            hVar.label = 1;
            if (aVar4.c(hVar) == aVar3) {
                return aVar3;
            }
            bVar = this;
            aVar2 = aVar4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (com.gamericefishpro.space.xi.a) hVar.L$1;
            bVar = (b) hVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        try {
            d dVar = bVar.locationUpdateListener;
            if (dVar != null) {
                dVar.close();
                bVar.locationUpdateListener = null;
            }
            com.gamericefishpro.space.re.c cVar = bVar.googleApiClient;
            if (cVar != null) {
                cVar.disconnect();
                bVar.googleApiClient = null;
            }
            bVar.lastLocation = null;
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
