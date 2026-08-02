package com.onesignal.location.internal.controller.impl;

import I7.l;
import I7.p;
import P2.i;
import P2.j;
import Q2.T;
import R2.w;
import S7.AbstractC0410y;
import S7.F;
import S7.InterfaceC0408w;
import S7.s0;
import a8.InterfaceC0451a;
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
import f5.InterfaceC4520a;
import f5.InterfaceC4521b;
import i3.AbstractC4592b;
import i3.C4591a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.r;
import m.c1;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class b implements InterfaceC4520a {
    private final x4.f _applicationService;
    private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
    private final com.onesignal.common.events.b event;
    private com.onesignal.location.internal.controller.impl.c googleApiClient;
    private Location lastLocation;
    private final c locationHandlerThread;
    private d locationUpdateListener;
    private final InterfaceC0451a startStopMutex;
    public static final a Companion = new a(null);
    private static final int API_FALLBACK_TIME = 30000;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final int getAPI_FALLBACK_TIME() {
            return b.API_FALLBACK_TIME;
        }

        private a() {
        }
    }

    /* renamed from: com.onesignal.location.internal.controller.impl.b$b, reason: collision with other inner class name */
    public static final class C0219b implements i, j {
        private final b _parent;

        /* renamed from: com.onesignal.location.internal.controller.impl.b$b$a */
        public static final class a extends B7.h implements l {
            int label;

            public a(InterfaceC5240d interfaceC5240d) {
                super(1, interfaceC5240d);
            }

            @Override // B7.a
            public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
                return C0219b.this.new a(interfaceC5240d);
            }

            @Override // B7.a
            public final Object invokeSuspend(Object obj) {
                A7.a aVar = A7.a.f215n;
                int i = this.label;
                if (i == 0) {
                    Q3.b.s(obj);
                    b bVar = C0219b.this._parent;
                    this.label = 1;
                    if (bVar.stop(this) == aVar) {
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
                return ((a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
            }
        }

        public C0219b(b _parent) {
            kotlin.jvm.internal.h.e(_parent, "_parent");
            this._parent = _parent;
        }

        @Override // P2.i
        public void onConnected(Bundle bundle) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnected", null, 2, null);
        }

        @Override // P2.j
        public void onConnectionFailed(O2.b connectionResult) {
            kotlin.jvm.internal.h.e(connectionResult, "connectionResult");
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult, null, 2, null);
            com.onesignal.common.threading.c.suspendifyOnIO(new a(null));
        }

        @Override // P2.i
        public void onConnectionSuspended(int i) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i, null, 2, null);
        }
    }

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
            kotlin.jvm.internal.h.e(handler, "<set-?>");
            this.mHandler = handler;
        }
    }

    public static final class d implements LocationListener, x4.e, Closeable {
        private final x4.f _applicationService;
        private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
        private final b _parent;
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;

        public d(x4.f _applicationService, b _parent, GoogleApiClient googleApiClient, com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper) {
            kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
            kotlin.jvm.internal.h.e(_parent, "_parent");
            kotlin.jvm.internal.h.e(googleApiClient, "googleApiClient");
            kotlin.jvm.internal.h.e(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
            this._applicationService = _applicationService;
            this._parent = _parent;
            this.googleApiClient = googleApiClient;
            this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
            if (!googleApiClient.a()) {
                throw new Exception("googleApiClient not connected, cannot listen!");
            }
            _applicationService.addApplicationLifecycleHandler(this);
            refreshRequest();
        }

        private final void refreshRequest() {
            if (!this.googleApiClient.a()) {
                com.onesignal.debug.internal.logging.b.warn$default("Attempt to refresh location request but not currently connected!", null, 2, null);
                return;
            }
            if (this.hasExistingRequest) {
                this._fusedLocationApiWrapper.cancelLocationUpdates(this.googleApiClient, this);
            }
            long j6 = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j6).setInterval(j6).setMaxWaitTime((long) (j6 * 1.5d)).setPriority(102);
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClient requestLocationUpdates!", null, 2, null);
            com.onesignal.location.internal.controller.impl.g gVar = this._fusedLocationApiWrapper;
            GoogleApiClient googleApiClient = this.googleApiClient;
            kotlin.jvm.internal.h.b(priority);
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

        @Override // x4.e
        public void onFocus(boolean z6) {
            com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationChanged(Location location) {
            kotlin.jvm.internal.h.e(location, "location");
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController onLocationChanged: " + location, null, 2, null);
            this._parent.setLocationAndFire(location);
        }

        @Override // x4.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "LocationUpdateListener.onUnfocused()");
            refreshRequest();
        }
    }

    public static final class e extends kotlin.jvm.internal.i implements l {
        final /* synthetic */ Location $location;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Location location) {
            super(1);
            this.$location = location;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC4521b) obj);
            return v.f41073a;
        }

        public final void invoke(InterfaceC4521b it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onLocationChanged(this.$location);
        }
    }

    public static final class f extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.start(this);
        }
    }

    public static final class g extends B7.h implements p {
        final /* synthetic */ r $self;
        final /* synthetic */ kotlin.jvm.internal.p $wasSuccessful;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements l {
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(1);
                this.this$0 = bVar;
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

        /* renamed from: com.onesignal.location.internal.controller.impl.b$g$b, reason: collision with other inner class name */
        public static final class C0220b extends B7.h implements p {
            final /* synthetic */ r $self;
            final /* synthetic */ kotlin.jvm.internal.p $wasSuccessful;
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0220b(r rVar, b bVar, kotlin.jvm.internal.p pVar, InterfaceC5240d interfaceC5240d) {
                super(2, interfaceC5240d);
                this.$self = rVar;
                this.this$0 = bVar;
                this.$wasSuccessful = pVar;
            }

            @Override // B7.a
            public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
                return new C0220b(this.$self, this.this$0, this.$wasSuccessful, interfaceC5240d);
            }

            @Override // I7.p
            public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
                return ((C0220b) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
            }

            @Override // B7.a
            public final Object invokeSuspend(Object obj) {
                Location lastLocation;
                A7.a aVar = A7.a.f215n;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
                C0219b c0219b = new C0219b((b) this.$self.f38644n);
                Context appContext = this.this$0._applicationService.getAppContext();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                s.b bVar = new s.b();
                s.b bVar2 = new s.b();
                Object obj2 = O2.e.f2267c;
                T2.b bVar3 = AbstractC4592b.f38181a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                appContext.getMainLooper();
                String packageName = appContext.getPackageName();
                String name = appContext.getClass().getName();
                P2.e eVar = LocationServices.API;
                w.i(eVar, "Api must not be null");
                Object obj3 = null;
                bVar2.put(eVar, null);
                w.i(eVar.f2380a, "Base client builder must not be null");
                List list = Collections.EMPTY_LIST;
                hashSet2.addAll(list);
                hashSet.addAll(list);
                arrayList.add(c0219b);
                arrayList2.add(c0219b);
                Handler mHandler = this.this$0.locationHandlerThread.getMHandler();
                w.i(mHandler, "Handler must not be null");
                Looper looper = mHandler.getLooper();
                w.a("must call addApi() to add at least one API", !bVar2.isEmpty());
                C4591a c4591a = C4591a.f38180b;
                P2.e eVar2 = AbstractC4592b.f38182b;
                if (bVar2.containsKey(eVar2)) {
                    c4591a = (C4591a) bVar2.getOrDefault(eVar2, null);
                }
                c1 c1Var = new c1(hashSet, bVar, packageName, name, c4591a);
                Map map = (Map) c1Var.f39194v;
                s.b bVar4 = new s.b();
                s.b bVar5 = new s.b();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((s.g) bVar2.keySet()).iterator();
                while (true) {
                    s.f fVar = (s.f) it;
                    if (!fVar.hasNext()) {
                        break;
                    }
                    P2.e eVar3 = (P2.e) fVar.next();
                    Object orDefault = bVar2.getOrDefault(eVar3, obj3);
                    boolean z6 = map.get(eVar3) != null;
                    bVar4.put(eVar3, Boolean.valueOf(z6));
                    T t6 = new T(eVar3, z6);
                    arrayList3.add(t6);
                    s.b bVar6 = bVar5;
                    com.bumptech.glide.g gVar = eVar3.f2380a;
                    w.h(gVar);
                    c1 c1Var2 = c1Var;
                    Looper looper2 = looper;
                    P2.c b9 = gVar.b(appContext, looper2, c1Var2, orDefault, t6, t6);
                    bVar6.put(eVar3.f2381b, b9);
                    b9.getClass();
                    bVar5 = bVar6;
                    looper = looper2;
                    c1Var = c1Var2;
                    obj3 = null;
                }
                c1 c1Var3 = c1Var;
                Looper looper3 = looper;
                s.b bVar7 = bVar5;
                Q2.v vVar = new Q2.v(appContext, new ReentrantLock(), looper3, c1Var3, bVar4, arrayList, arrayList2, bVar7, Q2.v.b(bVar7.values(), true), arrayList3);
                Set set = GoogleApiClient.f24392n;
                synchronized (set) {
                    set.add(vVar);
                }
                com.onesignal.location.internal.controller.impl.c cVar = new com.onesignal.location.internal.controller.impl.c(vVar);
                O2.b blockingConnect = cVar.blockingConnect();
                if (blockingConnect == null || !blockingConnect.b()) {
                    StringBuilder sb = new StringBuilder("GMSLocationController connection to GoogleApiService failed: (");
                    sb.append(blockingConnect != null ? new Integer(blockingConnect.f2256u) : null);
                    sb.append(") ");
                    sb.append(blockingConnect != null ? blockingConnect.f2258w : null);
                    com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
                } else {
                    if (this.this$0.lastLocation == null && (lastLocation = this.this$0._fusedLocationApiWrapper.getLastLocation(vVar)) != null) {
                        this.this$0.setLocationAndFire(lastLocation);
                    }
                    ((b) this.$self.f38644n).locationUpdateListener = new d(this.this$0._applicationService, (b) this.$self.f38644n, cVar.getRealInstance(), this.this$0._fusedLocationApiWrapper);
                    ((b) this.$self.f38644n).googleApiClient = cVar;
                    this.$wasSuccessful.f38642n = true;
                }
                return v.f41073a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(kotlin.jvm.internal.p pVar, r rVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$wasSuccessful = pVar;
            this.$self = rVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return b.this.new g(this.$wasSuccessful, this.$self, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((g) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
        
            if (r11.c(r10) == r0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v15, types: [a8.a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r7v4, types: [a8.a] */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b bVar;
            kotlin.jvm.internal.p pVar;
            r rVar;
            a8.d dVar;
            ?? r02;
            Throwable th;
            long api_fallback_time;
            C0220b c0220b;
            a8.d dVar2;
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    InterfaceC0451a interfaceC0451a = b.this.startStopMutex;
                    bVar = b.this;
                    pVar = this.$wasSuccessful;
                    rVar = this.$self;
                    this.L$0 = interfaceC0451a;
                    this.L$1 = bVar;
                    this.L$2 = pVar;
                    this.L$3 = rVar;
                    this.label = 1;
                    dVar = (a8.d) interfaceC0451a;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r02 = (InterfaceC0451a) this.L$0;
                        try {
                            try {
                                Q3.b.s(obj);
                                dVar2 = r02;
                            } catch (s0 unused) {
                                com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                                dVar2 = r02;
                                dVar = dVar2;
                                dVar.d(null);
                                return v.f41073a;
                            }
                            dVar = dVar2;
                            dVar.d(null);
                            return v.f41073a;
                        } catch (Throwable th2) {
                            th = th2;
                            ((a8.d) r02).d(null);
                            throw th;
                        }
                    }
                    rVar = (r) this.L$3;
                    pVar = (kotlin.jvm.internal.p) this.L$2;
                    bVar = (b) this.L$1;
                    ?? r72 = (InterfaceC0451a) this.L$0;
                    Q3.b.s(obj);
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
                    pVar.f38642n = true;
                    dVar.d(null);
                    return v.f41073a;
                }
                try {
                    api_fallback_time = b.Companion.getAPI_FALLBACK_TIME();
                    c0220b = new C0220b(rVar, bVar, pVar, null);
                    this.L$0 = dVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                } catch (s0 unused2) {
                    r02 = dVar;
                    com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                    dVar2 = r02;
                    dVar = dVar2;
                    dVar.d(null);
                    return v.f41073a;
                }
                if (AbstractC0410y.z(api_fallback_time, c0220b, this) != aVar) {
                    dVar2 = dVar;
                    dVar = dVar2;
                    dVar.d(null);
                    return v.f41073a;
                }
                return aVar;
            } catch (Throwable th3) {
                r02 = dVar;
                th = th3;
                ((a8.d) r02).d(null);
                throw th;
            }
        }
    }

    public static final class h extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public h(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.stop(this);
        }
    }

    public b(x4.f _applicationService, com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
        this._applicationService = _applicationService;
        this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
        this.locationHandlerThread = new c();
        this.startStopMutex = new a8.d();
        this.event = new com.onesignal.common.events.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationAndFire(Location location) {
        com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController lastLocation: " + this.lastLocation, null, 2, null);
        this.lastLocation = location;
        this.event.fire(new e(location));
    }

    @Override // f5.InterfaceC4520a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // f5.InterfaceC4520a
    public Location getLastLocation() {
        GoogleApiClient realInstance;
        com.onesignal.location.internal.controller.impl.c cVar = this.googleApiClient;
        if (cVar == null || (realInstance = cVar.getRealInstance()) == null) {
            return null;
        }
        return this._fusedLocationApiWrapper.getLastLocation(realInstance);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // f5.InterfaceC4520a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(InterfaceC5240d interfaceC5240d) {
        f fVar;
        int i;
        kotlin.jvm.internal.p pVar;
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
                    r rVar = new r();
                    rVar.f38644n = this;
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    Z7.d dVar = F.f3000c;
                    g gVar = new g(pVar2, rVar, null);
                    fVar.L$0 = pVar2;
                    fVar.label = 1;
                    if (AbstractC0410y.y(dVar, gVar, fVar) == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) fVar.L$0;
                    Q3.b.s(obj);
                }
                return Boolean.valueOf(pVar.f38642n);
            }
        }
        fVar = new f(interfaceC5240d);
        Object obj2 = fVar.result;
        A7.a aVar2 = A7.a.f215n;
        i = fVar.label;
        if (i != 0) {
        }
        return Boolean.valueOf(pVar.f38642n);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0063), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0063), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // f5.InterfaceC4520a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(InterfaceC5240d interfaceC5240d) {
        h hVar;
        int i;
        b bVar;
        InterfaceC0451a interfaceC0451a;
        d dVar;
        com.onesignal.location.internal.controller.impl.c cVar;
        try {
            if (interfaceC5240d instanceof h) {
                hVar = (h) interfaceC5240d;
                int i4 = hVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    hVar.label = i4 - Integer.MIN_VALUE;
                    Object obj = hVar.result;
                    A7.a aVar = A7.a.f215n;
                    i = hVar.label;
                    if (i != 0) {
                        Q3.b.s(obj);
                        InterfaceC0451a interfaceC0451a2 = this.startStopMutex;
                        hVar.L$0 = this;
                        hVar.L$1 = interfaceC0451a2;
                        hVar.label = 1;
                        a8.d dVar2 = (a8.d) interfaceC0451a2;
                        if (dVar2.c(hVar) == aVar) {
                            return aVar;
                        }
                        bVar = this;
                        interfaceC0451a = dVar2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0451a = (InterfaceC0451a) hVar.L$1;
                        bVar = (b) hVar.L$0;
                        Q3.b.s(obj);
                    }
                    dVar = bVar.locationUpdateListener;
                    if (dVar != null) {
                        dVar.close();
                        bVar.locationUpdateListener = null;
                    }
                    cVar = bVar.googleApiClient;
                    if (cVar != null) {
                        cVar.disconnect();
                        bVar.googleApiClient = null;
                    }
                    bVar.lastLocation = null;
                    ((a8.d) interfaceC0451a).d(null);
                    return v.f41073a;
                }
            }
            dVar = bVar.locationUpdateListener;
            if (dVar != null) {
            }
            cVar = bVar.googleApiClient;
            if (cVar != null) {
            }
            bVar.lastLocation = null;
            ((a8.d) interfaceC0451a).d(null);
            return v.f41073a;
        } catch (Throwable th) {
            ((a8.d) interfaceC0451a).d(null);
            throw th;
        }
        hVar = new h(interfaceC5240d);
        Object obj2 = hVar.result;
        A7.a aVar2 = A7.a.f215n;
        i = hVar.label;
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
