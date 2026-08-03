package com.onesignal.location.internal.controller.impl;

import ac.o;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import hc.j;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import o6.q0;
import o6.v;
import p6.u;
import pc.k;
import pc.s;
import yc.a0;
import yc.i0;
import yc.v1;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements z9.a {
    private final q8.f _applicationService;
    private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
    private final com.onesignal.common.events.b event;
    private com.onesignal.location.internal.controller.impl.c googleApiClient;
    private Location lastLocation;
    private final c locationHandlerThread;
    private d locationUpdateListener;
    private final gd.a startStopMutex;
    public static final a Companion = new a(null);
    private static final int API_FALLBACK_TIME = 30000;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        public final int getAPI_FALLBACK_TIME() {
            return b.API_FALLBACK_TIME;
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.location.internal.controller.impl.b$b, reason: collision with other inner class name */
    public static final class C0040b implements n6.f, n6.g {
        private final b _parent;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.location.internal.controller.impl.b$b$a */
        public static final class a extends j implements oc.c {
            int label;

            public a(fc.d dVar) {
                super(1, dVar);
            }

            @Override // hc.a
            public final fc.d create(fc.d dVar) {
                return C0040b.this.new a(dVar);
            }

            @Override // oc.c
            public final Object invoke(fc.d dVar) {
                return ((a) create(dVar)).invokeSuspend(o.f277a);
            }

            @Override // hc.a
            public final Object invokeSuspend(Object obj) {
                int i10 = this.label;
                if (i10 == 0) {
                    v6.a.W(obj);
                    b bVar = C0040b.this._parent;
                    this.label = 1;
                    Object stop = bVar.stop(this);
                    gc.a aVar = gc.a.f2559g;
                    if (stop == aVar) {
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

        public C0040b(b bVar) {
            pc.j.e(bVar, "_parent");
            this._parent = bVar;
        }

        @Override // n6.f
        public void onConnected(Bundle bundle) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnected", null, 2, null);
        }

        @Override // n6.g
        public void onConnectionFailed(m6.b bVar) {
            pc.j.e(bVar, "connectionResult");
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + bVar, null, 2, null);
            com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(null), 1, null);
        }

        @Override // n6.f
        public void onConnectionSuspended(int i10) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i10, null, 2, null);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
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
            pc.j.e(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d implements LocationListener, q8.e, Closeable {
        private final q8.f _applicationService;
        private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
        private final b _parent;
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;

        public d(q8.f fVar, b bVar, GoogleApiClient googleApiClient, com.onesignal.location.internal.controller.impl.g gVar) {
            pc.j.e(fVar, "_applicationService");
            pc.j.e(bVar, "_parent");
            pc.j.e(googleApiClient, "googleApiClient");
            pc.j.e(gVar, "_fusedLocationApiWrapper");
            this._applicationService = fVar;
            this._parent = bVar;
            this.googleApiClient = googleApiClient;
            this._fusedLocationApiWrapper = gVar;
            if (!googleApiClient.d()) {
                throw new Exception("googleApiClient not connected, cannot listen!");
            }
            fVar.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (!this.googleApiClient.d()) {
                com.onesignal.debug.internal.logging.b.warn$default("Attempt to refresh location request but not currently connected!", null, 2, null);
                return;
            }
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
            long j3 = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j3).setInterval(j3).setMaxWaitTime((long) (j3 * 1.5d)).setPriority(102);
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClient requestLocationUpdates!", null, 2, null);
            com.onesignal.location.internal.controller.impl.g gVar = this._fusedLocationApiWrapper;
            GoogleApiClient googleApiClient = this.googleApiClient;
            pc.j.d(priority, "locationRequest");
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

        @Override // q8.e
        public void onFocus(boolean z10) {
            com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationChanged(Location location) {
            pc.j.e(location, "location");
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController onLocationChanged: " + location, null, 2, null);
            this._parent.setLocationAndFire(location);
        }

        @Override // q8.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends k implements oc.c {
        final /* synthetic */ Location $location;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Location location) {
            super(1);
            this.$location = location;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((z9.b) obj);
            return o.f277a;
        }

        public final void invoke(z9.b bVar) {
            pc.j.e(bVar, "it");
            bVar.onLocationChanged(this.$location);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.start(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends j implements oc.e {
        final /* synthetic */ s $self;
        final /* synthetic */ pc.o $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends k implements oc.c {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(1);
                this.this$0 = bVar;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((z9.b) obj);
                return o.f277a;
            }

            public final void invoke(z9.b bVar) {
                pc.j.e(bVar, "it");
                Location location = this.this$0.lastLocation;
                pc.j.b(location);
                bVar.onLocationChanged(location);
            }
        }

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.location.internal.controller.impl.b$g$b, reason: collision with other inner class name */
        public static final class C0041b extends j implements oc.e {
            final /* synthetic */ s $self;
            final /* synthetic */ pc.o $wasSuccessful;
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0041b(s sVar, b bVar, pc.o oVar, fc.d dVar) {
                super(2, dVar);
                this.$self = sVar;
                this.this$0 = bVar;
                this.$wasSuccessful = oVar;
            }

            @Override // hc.a
            public final fc.d create(Object obj, fc.d dVar) {
                return new C0041b(this.$self, this.this$0, this.$wasSuccessful, dVar);
            }

            @Override // hc.a
            public final Object invokeSuspend(Object obj) {
                Location lastLocation;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
                C0040b c0040b = new C0040b((b) this.$self.f5683g);
                Context appContext = this.this$0._applicationService.getAppContext();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                boolean z10 = false;
                s.f fVar = new s.f(0);
                s.f fVar2 = new s.f(0);
                Object obj2 = m6.e.f4912c;
                d7.b bVar = d7.c.f1718a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                appContext.getMainLooper();
                String packageName = appContext.getPackageName();
                String name = appContext.getClass().getName();
                n6.c cVar = LocationServices.API;
                u.h(cVar, "Api must not be null");
                fVar2.put(cVar, null);
                u.h(cVar.f5071a, "Base client builder must not be null");
                List list = Collections.EMPTY_LIST;
                hashSet2.addAll(list);
                hashSet.addAll(list);
                arrayList.add(c0040b);
                arrayList2.add(c0040b);
                Handler mHandler = this.this$0.locationHandlerThread.getMHandler();
                u.h(mHandler, "Handler must not be null");
                Looper looper = mHandler.getLooper();
                boolean z11 = true;
                u.a("must call addApi() to add at least one API", !fVar2.isEmpty());
                d7.a aVar = d7.a.f1716a;
                n6.c cVar2 = d7.c.f1719b;
                if (fVar2.containsKey(cVar2)) {
                    aVar = (d7.a) fVar2.get(cVar2);
                }
                p6.d dVar = new p6.d(hashSet, fVar, packageName, name, aVar);
                Map map = (Map) dVar.f5559e;
                s.f fVar3 = new s.f(0);
                s.f fVar4 = new s.f(0);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((s.c) fVar2.keySet()).iterator();
                while (true) {
                    s.b bVar2 = (s.b) it;
                    if (!bVar2.hasNext()) {
                        break;
                    }
                    n6.c cVar3 = (n6.c) bVar2.next();
                    Object obj3 = fVar2.get(cVar3);
                    boolean z12 = map.get(cVar3) != null ? z11 : z10;
                    fVar3.put(cVar3, Boolean.valueOf(z12));
                    q0 q0Var = new q0(cVar3, z12);
                    arrayList3.add(q0Var);
                    a.a aVar2 = cVar3.f5071a;
                    u.g(aVar2);
                    p6.d dVar2 = dVar;
                    Looper looper2 = looper;
                    s.f fVar5 = fVar4;
                    n6.a j3 = aVar2.j(appContext, looper2, dVar2, obj3, q0Var, q0Var);
                    fVar5.put(cVar3.f5072b, j3);
                    j3.getClass();
                    fVar4 = fVar5;
                    looper = looper2;
                    dVar = dVar2;
                    z11 = true;
                    z10 = false;
                }
                p6.d dVar3 = dVar;
                Looper looper3 = looper;
                s.f fVar6 = fVar4;
                boolean z13 = z11;
                v vVar = new v(appContext, new ReentrantLock(), looper3, dVar3, fVar3, arrayList, arrayList2, fVar6, v.e(fVar6.values(), z13), arrayList3);
                Set set = GoogleApiClient.f1418a;
                synchronized (set) {
                    set.add(vVar);
                }
                com.onesignal.location.internal.controller.impl.c cVar4 = new com.onesignal.location.internal.controller.impl.c(vVar);
                m6.b blockingConnect = cVar4.blockingConnect();
                if (blockingConnect == null || blockingConnect.b() != z13) {
                    StringBuilder sb = new StringBuilder("GMSLocationController connection to GoogleApiService failed: (");
                    sb.append(blockingConnect != null ? new Integer(blockingConnect.f4903h) : null);
                    sb.append(") ");
                    sb.append(blockingConnect != null ? blockingConnect.f4905j : null);
                    com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
                } else {
                    if (this.this$0.lastLocation == null && (lastLocation = this.this$0._fusedLocationApiWrapper.getLastLocation(vVar)) != null) {
                        this.this$0.setLocationAndFire(lastLocation);
                    }
                    ((b) this.$self.f5683g).locationUpdateListener = new d(this.this$0._applicationService, (b) this.$self.f5683g, cVar4.getRealInstance(), this.this$0._fusedLocationApiWrapper);
                    ((b) this.$self.f5683g).googleApiClient = cVar4;
                    this.$wasSuccessful.f5679g = z13;
                }
                return o.f277a;
            }

            @Override // oc.e
            public final Object invoke(y yVar, fc.d dVar) {
                return ((C0041b) create(yVar, dVar)).invokeSuspend(o.f277a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(pc.o oVar, s sVar, fc.d dVar) {
            super(2, dVar);
            this.$wasSuccessful = oVar;
            this.$self = sVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new g(this.$wasSuccessful, this.$self, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
        
            if (r11.c(r10) == r4) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v20, types: [gd.a] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r7v4, types: [gd.a] */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b bVar;
            pc.o oVar;
            s sVar;
            gd.d dVar;
            ?? r02;
            Throwable th;
            long api_fallback_time;
            C0041b c0041b;
            gd.d dVar2;
            int i10 = this.label;
            gc.a aVar = gc.a.f2559g;
            try {
                if (i10 == 0) {
                    v6.a.W(obj);
                    gd.a aVar2 = b.this.startStopMutex;
                    bVar = b.this;
                    oVar = this.$wasSuccessful;
                    sVar = this.$self;
                    this.L$0 = aVar2;
                    this.L$1 = bVar;
                    this.L$2 = oVar;
                    this.L$3 = sVar;
                    this.label = 1;
                    dVar = (gd.d) aVar2;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r02 = (gd.a) this.L$0;
                        try {
                            try {
                                v6.a.W(obj);
                                dVar2 = r02;
                            } catch (v1 unused) {
                                com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                                dVar2 = r02;
                                dVar = dVar2;
                                dVar.d(null);
                                return o.f277a;
                            }
                            dVar = dVar2;
                            dVar.d(null);
                            return o.f277a;
                        } catch (Throwable th2) {
                            th = th2;
                            ((gd.d) r02).d(null);
                            throw th;
                        }
                    }
                    sVar = (s) this.L$3;
                    oVar = (pc.o) this.L$2;
                    bVar = (b) this.L$1;
                    ?? r72 = (gd.a) this.L$0;
                    v6.a.W(obj);
                    dVar = r72;
                }
                if (bVar.googleApiClient != null) {
                    if (bVar.lastLocation != null) {
                        bVar.event.fire(new a(bVar));
                    } else {
                        Location lastLocation = bVar.getLastLocation();
                        if (lastLocation != null) {
                            bVar.setLocationAndFire(lastLocation);
                        }
                    }
                    oVar.f5679g = true;
                    dVar.d(null);
                    return o.f277a;
                }
                try {
                    api_fallback_time = b.Companion.getAPI_FALLBACK_TIME();
                    c0041b = new C0041b(sVar, bVar, oVar, null);
                    this.L$0 = dVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                } catch (v1 unused2) {
                    r02 = dVar;
                    com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                    dVar2 = r02;
                    dVar = dVar2;
                    dVar.d(null);
                    return o.f277a;
                }
                if (a0.B(api_fallback_time, c0041b, this) != aVar) {
                    dVar2 = dVar;
                    dVar = dVar2;
                    dVar.d(null);
                    return o.f277a;
                }
                return aVar;
            } catch (Throwable th3) {
                r02 = dVar;
                th = th3;
                ((gd.d) r02).d(null);
                throw th;
            }
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((g) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public h(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.stop(this);
        }
    }

    public b(q8.f fVar, com.onesignal.location.internal.controller.impl.g gVar) {
        pc.j.e(fVar, "_applicationService");
        pc.j.e(gVar, "_fusedLocationApiWrapper");
        this._applicationService = fVar;
        this._fusedLocationApiWrapper = gVar;
        this.locationHandlerThread = new c();
        this.startStopMutex = new gd.d();
        this.event = new com.onesignal.common.events.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationAndFire(Location location) {
        com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController lastLocation: " + this.lastLocation, null, 2, null);
        this.lastLocation = location;
        this.event.fire(new e(location));
    }

    @Override // z9.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // z9.a
    public Location getLastLocation() {
        GoogleApiClient realInstance;
        com.onesignal.location.internal.controller.impl.c cVar = this.googleApiClient;
        if (cVar == null || (realInstance = cVar.getRealInstance()) == null) {
            return null;
        }
        return this._fusedLocationApiWrapper.getLastLocation(realInstance);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // z9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(fc.d dVar) {
        f fVar;
        int i10;
        pc.o oVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i11 = fVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.label = i11 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                i10 = fVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    s sVar = new s();
                    sVar.f5683g = this;
                    pc.o oVar2 = new pc.o();
                    fd.d dVar2 = i0.f8861c;
                    g gVar = new g(oVar2, sVar, null);
                    fVar.L$0 = oVar2;
                    fVar.label = 1;
                    Object A = a0.A(dVar2, gVar, fVar);
                    gc.a aVar = gc.a.f2559g;
                    if (A == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = (pc.o) fVar.L$0;
                    v6.a.W(obj);
                }
                return Boolean.valueOf(oVar.f5679g);
            }
        }
        fVar = new f(dVar);
        Object obj2 = fVar.result;
        i10 = fVar.label;
        if (i10 != 0) {
        }
        return Boolean.valueOf(oVar.f5679g);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0063), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0063), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // z9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(fc.d dVar) {
        h hVar;
        int i10;
        b bVar;
        Object obj;
        d dVar2;
        com.onesignal.location.internal.controller.impl.c cVar;
        try {
            if (dVar instanceof h) {
                hVar = (h) dVar;
                int i11 = hVar.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    hVar.label = i11 - Integer.MIN_VALUE;
                    Object obj2 = hVar.result;
                    i10 = hVar.label;
                    if (i10 != 0) {
                        v6.a.W(obj2);
                        gd.a aVar = this.startStopMutex;
                        hVar.L$0 = this;
                        hVar.L$1 = aVar;
                        hVar.label = 1;
                        gd.d dVar3 = (gd.d) aVar;
                        Object c3 = dVar3.c(hVar);
                        gc.a aVar2 = gc.a.f2559g;
                        if (c3 == aVar2) {
                            return aVar2;
                        }
                        bVar = this;
                        obj = dVar3;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj3 = (gd.a) hVar.L$1;
                        bVar = (b) hVar.L$0;
                        v6.a.W(obj2);
                        obj = obj3;
                    }
                    dVar2 = bVar.locationUpdateListener;
                    if (dVar2 != null) {
                        dVar2.close();
                        bVar.locationUpdateListener = null;
                    }
                    cVar = bVar.googleApiClient;
                    if (cVar != null) {
                        cVar.disconnect();
                        bVar.googleApiClient = null;
                    }
                    bVar.lastLocation = null;
                    ((gd.d) obj).d(null);
                    return o.f277a;
                }
            }
            dVar2 = bVar.locationUpdateListener;
            if (dVar2 != null) {
            }
            cVar = bVar.googleApiClient;
            if (cVar != null) {
            }
            bVar.lastLocation = null;
            ((gd.d) obj).d(null);
            return o.f277a;
        } catch (Throwable th) {
            ((gd.d) obj).d(null);
            throw th;
        }
        hVar = new h(dVar);
        Object obj22 = hVar.result;
        i10 = hVar.label;
        if (i10 != 0) {
        }
    }

    @Override // z9.a, com.onesignal.common.events.d
    public void subscribe(z9.b bVar) {
        pc.j.e(bVar, "handler");
        this.event.subscribe(bVar);
    }

    @Override // z9.a, com.onesignal.common.events.d
    public void unsubscribe(z9.b bVar) {
        pc.j.e(bVar, "handler");
        this.event.unsubscribe(bVar);
    }
}
