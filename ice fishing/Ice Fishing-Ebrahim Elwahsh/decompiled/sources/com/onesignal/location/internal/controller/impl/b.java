package com.onesignal.location.internal.controller.impl;

import E7.l;
import E7.p;
import M2.i;
import M2.j;
import N2.T;
import O2.w;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import O7.s0;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import b5.InterfaceC0528a;
import b5.InterfaceC0529b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import e3.AbstractC4471b;
import e3.C4470a;
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
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class b implements InterfaceC0528a {
    private final t4.f _applicationService;
    private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
    private final com.onesignal.common.events.b event;
    private com.onesignal.location.internal.controller.impl.c googleApiClient;
    private Location lastLocation;
    private final c locationHandlerThread;
    private d locationUpdateListener;
    private final W7.a startStopMutex;
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
    public static final class C0218b implements i, j {
        private final b _parent;

        /* renamed from: com.onesignal.location.internal.controller.impl.b$b$a */
        public static final class a extends x7.h implements l {
            int label;

            public a(InterfaceC5133d interfaceC5133d) {
                super(1, interfaceC5133d);
            }

            @Override // x7.AbstractC5217a
            public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
                return C0218b.this.new a(interfaceC5133d);
            }

            @Override // x7.AbstractC5217a
            public final Object invokeSuspend(Object obj) {
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                int i = this.label;
                if (i == 0) {
                    com.bumptech.glide.f.r(obj);
                    b bVar = C0218b.this._parent;
                    this.label = 1;
                    if (bVar.stop(this) == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                return v.f40183a;
            }

            @Override // E7.l
            public final Object invoke(InterfaceC5133d interfaceC5133d) {
                return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
            }
        }

        public C0218b(b _parent) {
            kotlin.jvm.internal.h.e(_parent, "_parent");
            this._parent = _parent;
        }

        @Override // M2.i
        public void onConnected(Bundle bundle) {
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnected", null, 2, null);
        }

        @Override // M2.j
        public void onConnectionFailed(L2.b connectionResult) {
            kotlin.jvm.internal.h.e(connectionResult, "connectionResult");
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult, null, 2, null);
            com.onesignal.common.threading.c.suspendifyOnIO(new a(null));
        }

        @Override // M2.i
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

    public static final class d implements LocationListener, t4.e, Closeable {
        private final t4.f _applicationService;
        private final com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper;
        private final b _parent;
        private final GoogleApiClient googleApiClient;
        private boolean hasExistingRequest;

        public d(t4.f _applicationService, b _parent, GoogleApiClient googleApiClient, com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper) {
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
            long j9 = this._applicationService.isInForeground() ? 270000L : 570000L;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j9).setInterval(j9).setMaxWaitTime((long) (j9 * 1.5d)).setPriority(102);
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

        @Override // t4.e
        public void onFocus(boolean z8) {
            com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "LocationUpdateListener.onFocus()");
            refreshRequest();
        }

        public void onLocationChanged(Location location) {
            kotlin.jvm.internal.h.e(location, "location");
            com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController onLocationChanged: " + location, null, 2, null);
            this._parent.setLocationAndFire(location);
        }

        @Override // t4.e
        public void onUnfocused() {
            com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "LocationUpdateListener.onUnfocused()");
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

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0529b) obj);
            return v.f40183a;
        }

        public final void invoke(InterfaceC0529b it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.onLocationChanged(this.$location);
        }
    }

    public static final class f extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.start(this);
        }
    }

    public static final class g extends x7.h implements p {
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

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC0529b) obj);
                return v.f40183a;
            }

            public final void invoke(InterfaceC0529b it) {
                kotlin.jvm.internal.h.e(it, "it");
                Location location = this.this$0.lastLocation;
                kotlin.jvm.internal.h.b(location);
                it.onLocationChanged(location);
            }
        }

        /* renamed from: com.onesignal.location.internal.controller.impl.b$g$b, reason: collision with other inner class name */
        public static final class C0219b extends x7.h implements p {
            final /* synthetic */ r $self;
            final /* synthetic */ kotlin.jvm.internal.p $wasSuccessful;
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0219b(r rVar, b bVar, kotlin.jvm.internal.p pVar, InterfaceC5133d interfaceC5133d) {
                super(2, interfaceC5133d);
                this.$self = rVar;
                this.this$0 = bVar;
                this.$wasSuccessful = pVar;
            }

            @Override // x7.AbstractC5217a
            public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
                return new C0219b(this.$self, this.this$0, this.$wasSuccessful, interfaceC5133d);
            }

            @Override // E7.p
            public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
                return ((C0219b) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
            }

            @Override // x7.AbstractC5217a
            public final Object invokeSuspend(Object obj) {
                Location lastLocation;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
                C0218b c0218b = new C0218b((b) this.$self.f38861n);
                Context appContext = this.this$0._applicationService.getAppContext();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                s.b bVar = new s.b();
                s.b bVar2 = new s.b();
                Object obj2 = L2.e.f1723c;
                Q2.b bVar3 = AbstractC4471b.f37326a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                appContext.getMainLooper();
                String packageName = appContext.getPackageName();
                String name = appContext.getClass().getName();
                M2.e eVar = LocationServices.API;
                w.i(eVar, "Api must not be null");
                Object obj3 = null;
                bVar2.put(eVar, null);
                w.i(eVar.f1881a, "Base client builder must not be null");
                List list = Collections.EMPTY_LIST;
                hashSet2.addAll(list);
                hashSet.addAll(list);
                arrayList.add(c0218b);
                arrayList2.add(c0218b);
                Handler mHandler = this.this$0.locationHandlerThread.getMHandler();
                w.i(mHandler, "Handler must not be null");
                Looper looper = mHandler.getLooper();
                w.a("must call addApi() to add at least one API", !bVar2.isEmpty());
                C4470a c4470a = C4470a.f37325b;
                M2.e eVar2 = AbstractC4471b.f37327b;
                if (bVar2.containsKey(eVar2)) {
                    c4470a = (C4470a) bVar2.getOrDefault(eVar2, null);
                }
                c1 c1Var = new c1(hashSet, bVar, packageName, name, c4470a);
                Map map = (Map) c1Var.f39396v;
                s.b bVar4 = new s.b();
                s.b bVar5 = new s.b();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((s.g) bVar2.keySet()).iterator();
                while (true) {
                    s.f fVar = (s.f) it;
                    if (!fVar.hasNext()) {
                        break;
                    }
                    M2.e eVar3 = (M2.e) fVar.next();
                    Object orDefault = bVar2.getOrDefault(eVar3, obj3);
                    boolean z8 = map.get(eVar3) != null;
                    bVar4.put(eVar3, Boolean.valueOf(z8));
                    T t9 = new T(eVar3, z8);
                    arrayList3.add(t9);
                    s.b bVar6 = bVar5;
                    com.bumptech.glide.g gVar = eVar3.f1881a;
                    w.h(gVar);
                    c1 c1Var2 = c1Var;
                    Looper looper2 = looper;
                    M2.c A8 = gVar.A(appContext, looper2, c1Var2, orDefault, t9, t9);
                    bVar6.put(eVar3.f1882b, A8);
                    A8.getClass();
                    bVar5 = bVar6;
                    looper = looper2;
                    c1Var = c1Var2;
                    obj3 = null;
                }
                c1 c1Var3 = c1Var;
                Looper looper3 = looper;
                s.b bVar7 = bVar5;
                N2.v vVar = new N2.v(appContext, new ReentrantLock(), looper3, c1Var3, bVar4, arrayList, arrayList2, bVar7, N2.v.b(bVar7.values(), true), arrayList3);
                Set set = GoogleApiClient.f23765n;
                synchronized (set) {
                    set.add(vVar);
                }
                com.onesignal.location.internal.controller.impl.c cVar = new com.onesignal.location.internal.controller.impl.c(vVar);
                L2.b blockingConnect = cVar.blockingConnect();
                if (blockingConnect == null || !blockingConnect.b()) {
                    StringBuilder sb = new StringBuilder("GMSLocationController connection to GoogleApiService failed: (");
                    sb.append(blockingConnect != null ? new Integer(blockingConnect.f1712u) : null);
                    sb.append(") ");
                    sb.append(blockingConnect != null ? blockingConnect.f1714w : null);
                    com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
                } else {
                    if (this.this$0.lastLocation == null && (lastLocation = this.this$0._fusedLocationApiWrapper.getLastLocation(vVar)) != null) {
                        this.this$0.setLocationAndFire(lastLocation);
                    }
                    ((b) this.$self.f38861n).locationUpdateListener = new d(this.this$0._applicationService, (b) this.$self.f38861n, cVar.getRealInstance(), this.this$0._fusedLocationApiWrapper);
                    ((b) this.$self.f38861n).googleApiClient = cVar;
                    this.$wasSuccessful.f38859n = true;
                }
                return v.f40183a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(kotlin.jvm.internal.p pVar, r rVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$wasSuccessful = pVar;
            this.$self = rVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return b.this.new g(this.$wasSuccessful, this.$self, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((g) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0055, code lost:
        
            if (r11.c(r10) == r0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v4, types: [W7.a] */
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b bVar;
            kotlin.jvm.internal.p pVar;
            r rVar;
            W7.d dVar;
            long api_fallback_time;
            C0219b c0219b;
            Object obj2 = EnumC5179a.f41704n;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        com.bumptech.glide.f.r(obj);
                        W7.a aVar = b.this.startStopMutex;
                        bVar = b.this;
                        pVar = this.$wasSuccessful;
                        rVar = this.$self;
                        this.L$0 = aVar;
                        this.L$1 = bVar;
                        this.L$2 = pVar;
                        this.L$3 = rVar;
                        this.label = 1;
                        dVar = (W7.d) aVar;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj2 = (W7.a) this.L$0;
                            try {
                                com.bumptech.glide.f.r(obj);
                            } catch (s0 unused) {
                                com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                                dVar = obj2;
                                dVar.d(null);
                                return v.f40183a;
                            }
                            dVar = obj2;
                            dVar.d(null);
                            return v.f40183a;
                        }
                        rVar = (r) this.L$3;
                        pVar = (kotlin.jvm.internal.p) this.L$2;
                        bVar = (b) this.L$1;
                        ?? r72 = (W7.a) this.L$0;
                        com.bumptech.glide.f.r(obj);
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
                        pVar.f38859n = true;
                        dVar.d(null);
                        return v.f40183a;
                    }
                    try {
                        api_fallback_time = b.Companion.getAPI_FALLBACK_TIME();
                        c0219b = new C0219b(rVar, bVar, pVar, null);
                        this.L$0 = dVar;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 2;
                    } catch (s0 unused2) {
                        obj2 = dVar;
                        com.onesignal.debug.internal.logging.b.warn$default("Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null, 2, null);
                        dVar = obj2;
                        dVar.d(null);
                        return v.f40183a;
                    }
                    if (AbstractC0399y.z(api_fallback_time, c0219b, this) != obj2) {
                        obj2 = dVar;
                        dVar = obj2;
                        dVar.d(null);
                        return v.f40183a;
                    }
                    return obj2;
                } catch (Throwable th) {
                    obj2 = dVar;
                    th = th;
                    ((W7.d) obj2).d(null);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static final class h extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public h(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.stop(this);
        }
    }

    public b(t4.f _applicationService, com.onesignal.location.internal.controller.impl.g _fusedLocationApiWrapper) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_fusedLocationApiWrapper, "_fusedLocationApiWrapper");
        this._applicationService = _applicationService;
        this._fusedLocationApiWrapper = _fusedLocationApiWrapper;
        this.locationHandlerThread = new c();
        this.startStopMutex = new W7.d();
        this.event = new com.onesignal.common.events.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocationAndFire(Location location) {
        com.onesignal.debug.internal.logging.b.debug$default("GMSLocationController lastLocation: " + this.lastLocation, null, 2, null);
        this.lastLocation = location;
        this.event.fire(new e(location));
    }

    @Override // b5.InterfaceC0528a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.event.getHasSubscribers();
    }

    @Override // b5.InterfaceC0528a
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
    @Override // b5.InterfaceC0528a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(InterfaceC5133d interfaceC5133d) {
        f fVar;
        int i;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5133d instanceof f) {
            fVar = (f) interfaceC5133d;
            int i4 = fVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fVar.label = i4 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = fVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    r rVar = new r();
                    rVar.f38861n = this;
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    V7.d dVar = F.f2553c;
                    g gVar = new g(pVar2, rVar, null);
                    fVar.L$0 = pVar2;
                    fVar.label = 1;
                    if (AbstractC0399y.y(dVar, gVar, fVar) == enumC5179a) {
                        return enumC5179a;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) fVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                return Boolean.valueOf(pVar.f38859n);
            }
        }
        fVar = new f(interfaceC5133d);
        Object obj2 = fVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = fVar.label;
        if (i != 0) {
        }
        return Boolean.valueOf(pVar.f38859n);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0063), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x004e, B:14:0x0052, B:15:0x005a, B:17:0x005e, B:18:0x0063), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // b5.InterfaceC0528a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object stop(InterfaceC5133d interfaceC5133d) {
        h hVar;
        int i;
        b bVar;
        W7.a aVar;
        d dVar;
        com.onesignal.location.internal.controller.impl.c cVar;
        try {
            if (interfaceC5133d instanceof h) {
                hVar = (h) interfaceC5133d;
                int i4 = hVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    hVar.label = i4 - Integer.MIN_VALUE;
                    Object obj = hVar.result;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = hVar.label;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        W7.a aVar2 = this.startStopMutex;
                        hVar.L$0 = this;
                        hVar.L$1 = aVar2;
                        hVar.label = 1;
                        W7.d dVar2 = (W7.d) aVar2;
                        if (dVar2.c(hVar) == enumC5179a) {
                            return enumC5179a;
                        }
                        bVar = this;
                        aVar = dVar2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (W7.a) hVar.L$1;
                        bVar = (b) hVar.L$0;
                        com.bumptech.glide.f.r(obj);
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
                    ((W7.d) aVar).d(null);
                    return v.f40183a;
                }
            }
            dVar = bVar.locationUpdateListener;
            if (dVar != null) {
            }
            cVar = bVar.googleApiClient;
            if (cVar != null) {
            }
            bVar.lastLocation = null;
            ((W7.d) aVar).d(null);
            return v.f40183a;
        } catch (Throwable th) {
            ((W7.d) aVar).d(null);
            throw th;
        }
        hVar = new h(interfaceC5133d);
        Object obj2 = hVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = hVar.label;
        if (i != 0) {
        }
    }

    @Override // b5.InterfaceC0528a, com.onesignal.common.events.d
    public void subscribe(InterfaceC0529b handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.event.subscribe(handler);
    }

    @Override // b5.InterfaceC0528a, com.onesignal.common.events.d
    public void unsubscribe(InterfaceC0529b handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.event.unsubscribe(handler);
    }
}
