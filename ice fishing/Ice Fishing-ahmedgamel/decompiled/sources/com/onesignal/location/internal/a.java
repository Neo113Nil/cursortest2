package com.onesignal.location.internal;

import B7.h;
import I7.l;
import I7.p;
import S7.AbstractC0406y;
import S7.InterfaceC0404w;
import X7.o;
import a5.InterfaceC0437a;
import c5.InterfaceC0543a;
import com.onesignal.common.AndroidUtils;
import f5.InterfaceC4510a;
import java.util.List;
import u7.v;
import v7.AbstractC5130k;
import x4.f;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class a implements InterfaceC0437a, com.onesignal.core.internal.startup.b, com.onesignal.location.internal.permissions.a {
    private final f _applicationService;
    private final InterfaceC0543a _capturer;
    private boolean _isShared;
    private final InterfaceC4510a _locationController;
    private final com.onesignal.location.internal.permissions.b _locationPermissionController;
    private final J4.b _prefs;

    /* renamed from: com.onesignal.location.internal.a$a, reason: collision with other inner class name */
    public static final class C0218a extends h implements l {
        int label;

        public C0218a(InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return a.this.new C0218a(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                a aVar2 = a.this;
                this.label = 1;
                if (aVar2.startGetLocation(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((C0218a) create(interfaceC5267d)).invokeSuspend(v.f41353a);
        }
    }

    public static final class b extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.requestPermission(this);
        }
    }

    public static final class c extends h implements p {
        final /* synthetic */ kotlin.jvm.internal.p $result;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.jvm.internal.p pVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$result = pVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return a.this.new c(this.$result, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((c) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        
            if (r2.startGetLocation(r16) == r1) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0129, code lost:
        
            if (r2.startGetLocation(r16) == r1) goto L64;
         */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z3;
            Object backgroundLocationPermissionLogic;
            kotlin.jvm.internal.p pVar;
            kotlin.jvm.internal.p pVar2;
            Object prompt;
            kotlin.jvm.internal.p pVar3;
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                String str = null;
                if (!a.this.isShared()) {
                    com.onesignal.debug.internal.logging.b.warn$default("Requesting location permission, but location sharing must also be enabled by setting isShared to true", null, 2, null);
                }
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                boolean hasPermission = androidUtils.hasPermission("android.permission.ACCESS_FINE_LOCATION", true, a.this._applicationService);
                if (hasPermission) {
                    z3 = false;
                } else {
                    z3 = androidUtils.hasPermission("android.permission.ACCESS_COARSE_LOCATION", true, a.this._applicationService);
                    a.this._capturer.setLocationCoarse(true);
                }
                int androidSDKInt = androidUtils.getAndroidSDKInt();
                boolean hasPermission2 = androidSDKInt >= 29 ? androidUtils.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", true, a.this._applicationService) : false;
                if (androidSDKInt < 23) {
                    if (!hasPermission && !z3) {
                        com.onesignal.debug.internal.logging.b.info$default("Location permissions not added on AndroidManifest file < M", null, 2, null);
                        return Boolean.FALSE;
                    }
                    a aVar2 = a.this;
                    this.label = 1;
                } else if (!hasPermission) {
                    List<String> filterManifestPermissions = androidUtils.filterManifestPermissions(AbstractC5130k.v("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"), a.this._applicationService);
                    if (filterManifestPermissions.contains("android.permission.ACCESS_FINE_LOCATION")) {
                        str = "android.permission.ACCESS_FINE_LOCATION";
                    } else if (!filterManifestPermissions.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                        com.onesignal.debug.internal.logging.b.info$default("Location permissions not added on AndroidManifest file >= M", null, 2, null);
                    } else if (!z3) {
                        str = "android.permission.ACCESS_COARSE_LOCATION";
                    } else if (androidSDKInt >= 29 && filterManifestPermissions.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        str = "android.permission.ACCESS_BACKGROUND_LOCATION";
                    }
                    pVar2 = this.$result;
                    if (str != null) {
                        com.onesignal.location.internal.permissions.b bVar = a.this._locationPermissionController;
                        this.L$0 = pVar2;
                        this.label = 2;
                        prompt = bVar.prompt(true, str, this);
                        if (prompt != aVar) {
                            pVar3 = pVar2;
                            z3 = ((Boolean) prompt).booleanValue();
                            pVar2 = pVar3;
                        }
                    }
                    pVar2.f38715n = z3;
                } else if (androidSDKInt < 29 || hasPermission2) {
                    this.$result.f38715n = true;
                    a aVar3 = a.this;
                    this.label = 4;
                } else {
                    kotlin.jvm.internal.p pVar4 = this.$result;
                    a aVar4 = a.this;
                    this.L$0 = pVar4;
                    this.label = 3;
                    backgroundLocationPermissionLogic = aVar4.backgroundLocationPermissionLogic(true, this);
                    if (backgroundLocationPermissionLogic != aVar) {
                        pVar = pVar4;
                        pVar.f38715n = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
                    }
                }
                return aVar;
            }
            if (i == 1) {
                com.bumptech.glide.d.k(obj);
                this.$result.f38715n = true;
            } else if (i == 2) {
                pVar3 = (kotlin.jvm.internal.p) this.L$0;
                com.bumptech.glide.d.k(obj);
                prompt = obj;
                z3 = ((Boolean) prompt).booleanValue();
                pVar2 = pVar3;
                pVar2.f38715n = z3;
            } else if (i == 3) {
                pVar = (kotlin.jvm.internal.p) this.L$0;
                com.bumptech.glide.d.k(obj);
                backgroundLocationPermissionLogic = obj;
                pVar.f38715n = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return v.f41353a;
        }
    }

    public static final class d extends h implements l {
        int label;

        public d(InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return a.this.new d(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                a aVar2 = a.this;
                this.label = 1;
                if (aVar2.startGetLocation(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((d) create(interfaceC5267d)).invokeSuspend(v.f41353a);
        }
    }

    public static final class e extends B7.c {
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.startGetLocation(this);
        }
    }

    public a(f _applicationService, InterfaceC0543a _capturer, InterfaceC4510a _locationController, com.onesignal.location.internal.permissions.b _locationPermissionController, J4.b _prefs) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_capturer, "_capturer");
        kotlin.jvm.internal.h.e(_locationController, "_locationController");
        kotlin.jvm.internal.h.e(_locationPermissionController, "_locationPermissionController");
        kotlin.jvm.internal.h.e(_prefs, "_prefs");
        this._applicationService = _applicationService;
        this._capturer = _capturer;
        this._locationController = _locationController;
        this._locationPermissionController = _locationPermissionController;
        this._prefs = _prefs;
        Boolean bool = _prefs.getBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, "OS_LOCATION_SHARED", Boolean.FALSE);
        kotlin.jvm.internal.h.b(bool);
        this._isShared = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z3, InterfaceC5267d interfaceC5267d) {
        return AndroidUtils.INSTANCE.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", false, this._applicationService) ? this._locationPermissionController.prompt(z3, "android.permission.ACCESS_BACKGROUND_LOCATION", interfaceC5267d) : Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:17|18))(2:19|(1:21)(3:22|23|(1:25)))|11|(1:13)|15))|28|6|7|(0)(0)|11|(0)|15) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        com.onesignal.debug.internal.logging.b.warn("LocationManager.startGetLocation: Location permission exists but there was an error initializing: ", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:10:0x0027, B:11:0x004f, B:13:0x0057, B:23:0x0044), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startGetLocation(InterfaceC5267d interfaceC5267d) {
        e eVar;
        Object obj;
        int i;
        if (interfaceC5267d instanceof e) {
            eVar = (e) interfaceC5267d;
            int i6 = eVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eVar.label = i6 - Integer.MIN_VALUE;
                obj = eVar.result;
                A7.a aVar = A7.a.f58n;
                i = eVar.label;
                v vVar = v.f41353a;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    if (!isShared()) {
                        return vVar;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("LocationManager.startGetLocation()", null, 2, null);
                    InterfaceC4510a interfaceC4510a = this._locationController;
                    eVar.label = 1;
                    obj = interfaceC4510a.start(eVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("LocationManager.startGetLocation: not possible, no location dependency found", null, 2, null);
                }
                return vVar;
            }
        }
        eVar = new e(interfaceC5267d);
        obj = eVar.result;
        A7.a aVar2 = A7.a.f58n;
        i = eVar.label;
        v vVar2 = v.f41353a;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return vVar2;
    }

    @Override // a5.InterfaceC0437a
    public boolean isShared() {
        return this._isShared;
    }

    @Override // com.onesignal.location.internal.permissions.a
    public void onLocationPermissionChanged(boolean z3) {
        if (z3) {
            com.onesignal.common.threading.c.suspendifyOnIO(new C0218a(null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // a5.InterfaceC0437a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestPermission(InterfaceC5267d interfaceC5267d) {
        b bVar;
        int i;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5267d instanceof b) {
            bVar = (b) interfaceC5267d;
            int i6 = bVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.label = i6 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                A7.a aVar = A7.a.f58n;
                i = bVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "LocationManager.requestPermission()");
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    T7.e eVar = o.f3856a;
                    c cVar = new c(pVar2, null);
                    bVar.L$0 = pVar2;
                    bVar.label = 1;
                    if (AbstractC0406y.y(eVar, cVar, bVar) == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) bVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                return Boolean.valueOf(pVar.f38715n);
            }
        }
        bVar = new b(interfaceC5267d);
        Object obj2 = bVar.result;
        A7.a aVar2 = A7.a.f58n;
        i = bVar.label;
        if (i != 0) {
        }
        return Boolean.valueOf(pVar.f38715n);
    }

    @Override // a5.InterfaceC0437a
    public void setShared(boolean z3) {
        com.onesignal.debug.internal.logging.b.debug$default("LocationManager.setIsShared(value: " + z3 + ')', null, 2, null);
        this._prefs.saveBool(com.onesignal.common.threading.b.BASE_THREAD_NAME, "OS_LOCATION_SHARED", Boolean.valueOf(z3));
        this._isShared = z3;
        onLocationPermissionChanged(z3);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._locationPermissionController.subscribe((com.onesignal.location.internal.permissions.a) this);
        if (e5.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            com.onesignal.common.threading.c.suspendifyOnIO(new d(null));
        }
    }
}
