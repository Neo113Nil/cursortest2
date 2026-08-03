package com.onesignal.location.internal;

import ac.o;
import android.os.Build;
import bc.n;
import com.onesignal.common.AndroidUtils;
import hc.j;
import java.util.List;
import q8.f;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements u9.a, d9.b, com.onesignal.location.internal.permissions.a {
    private final f _applicationService;
    private final w9.a _capturer;
    private boolean _isShared;
    private final z9.a _locationController;
    private final com.onesignal.location.internal.permissions.b _locationPermissionController;
    private final c9.b _prefs;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.location.internal.a$a, reason: collision with other inner class name */
    public static final class C0039a extends j implements oc.c {
        int label;

        public C0039a(fc.d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return a.this.new C0039a(dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((C0039a) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                a aVar = a.this;
                this.label = 1;
                Object startGetLocation = aVar.startGetLocation(this);
                gc.a aVar2 = gc.a.f2559g;
                if (startGetLocation == aVar2) {
                    return aVar2;
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
    public static final class b extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.requestPermission(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends j implements oc.e {
        final /* synthetic */ pc.o $result;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(pc.o oVar, fc.d dVar) {
            super(2, dVar);
            this.$result = oVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return a.this.new c(this.$result, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
        
            if (r2 == r9) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
        
            if (r2 == r9) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x010c, code lost:
        
            if (r1.startGetLocation(r16) == r9) goto L57;
         */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            pc.o oVar;
            Object backgroundLocationPermissionLogic;
            pc.o oVar2;
            Object prompt;
            int i10 = this.label;
            boolean z11 = true;
            if (i10 == 0) {
                v6.a.W(obj);
                String str = null;
                if (!a.this.isShared()) {
                    com.onesignal.debug.internal.logging.b.warn$default("Requesting location permission, but location sharing must also be enabled by setting isShared to true", null, 2, null);
                }
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                boolean hasPermission = androidUtils.hasPermission("android.permission.ACCESS_FINE_LOCATION", true, a.this._applicationService);
                if (hasPermission) {
                    z10 = false;
                } else {
                    z10 = androidUtils.hasPermission("android.permission.ACCESS_COARSE_LOCATION", true, a.this._applicationService);
                    a.this._capturer.setLocationCoarse(true);
                }
                int i11 = Build.VERSION.SDK_INT;
                boolean hasPermission2 = i11 >= 29 ? androidUtils.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", true, a.this._applicationService) : false;
                gc.a aVar = gc.a.f2559g;
                if (!hasPermission) {
                    List<String> filterManifestPermissions = androidUtils.filterManifestPermissions(n.L("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"), a.this._applicationService);
                    if (filterManifestPermissions.contains("android.permission.ACCESS_FINE_LOCATION")) {
                        str = "android.permission.ACCESS_FINE_LOCATION";
                    } else if (!filterManifestPermissions.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                        com.onesignal.debug.internal.logging.b.info$default("Location permissions not added on AndroidManifest file >= M", null, 2, null);
                    } else if (!z10) {
                        str = "android.permission.ACCESS_COARSE_LOCATION";
                    } else if (i11 >= 29 && filterManifestPermissions.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        str = "android.permission.ACCESS_BACKGROUND_LOCATION";
                    }
                    oVar2 = this.$result;
                    if (str != null) {
                        com.onesignal.location.internal.permissions.b bVar = a.this._locationPermissionController;
                        this.L$0 = oVar2;
                        this.label = 2;
                        prompt = bVar.prompt(true, str, this);
                    } else {
                        if (!z10) {
                            z11 = false;
                        }
                        oVar2.f5679g = z11;
                    }
                } else if (i11 < 29 || hasPermission2) {
                    this.$result.f5679g = true;
                    a aVar2 = a.this;
                    this.label = 4;
                } else {
                    oVar = this.$result;
                    a aVar3 = a.this;
                    this.L$0 = oVar;
                    this.label = 3;
                    backgroundLocationPermissionLogic = aVar3.backgroundLocationPermissionLogic(true, this);
                }
                return aVar;
            }
            if (i10 == 1) {
                v6.a.W(obj);
                this.$result.f5679g = true;
            } else if (i10 == 2) {
                oVar2 = (pc.o) this.L$0;
                v6.a.W(obj);
                prompt = obj;
                z11 = ((Boolean) prompt).booleanValue();
                oVar2.f5679g = z11;
            } else if (i10 == 3) {
                oVar = (pc.o) this.L$0;
                v6.a.W(obj);
                backgroundLocationPermissionLogic = obj;
                oVar.f5679g = ((Boolean) backgroundLocationPermissionLogic).booleanValue();
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((c) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends j implements oc.c {
        int label;

        public d(fc.d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return a.this.new d(dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((d) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                a aVar = a.this;
                this.label = 1;
                Object startGetLocation = aVar.startGetLocation(this);
                gc.a aVar2 = gc.a.f2559g;
                if (startGetLocation == aVar2) {
                    return aVar2;
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
    public static final class e extends hc.c {
        int label;
        /* synthetic */ Object result;

        public e(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.startGetLocation(this);
        }
    }

    public a(f fVar, w9.a aVar, z9.a aVar2, com.onesignal.location.internal.permissions.b bVar, c9.b bVar2) {
        pc.j.e(fVar, "_applicationService");
        pc.j.e(aVar, "_capturer");
        pc.j.e(aVar2, "_locationController");
        pc.j.e(bVar, "_locationPermissionController");
        pc.j.e(bVar2, "_prefs");
        this._applicationService = fVar;
        this._capturer = aVar;
        this._locationController = aVar2;
        this._locationPermissionController = bVar;
        this._prefs = bVar2;
        Boolean bool = bVar2.getBool("OneSignal", "OS_LOCATION_SHARED", Boolean.FALSE);
        pc.j.b(bool);
        this._isShared = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z10, fc.d dVar) {
        return AndroidUtils.INSTANCE.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", false, this._applicationService) ? this._locationPermissionController.prompt(z10, "android.permission.ACCESS_BACKGROUND_LOCATION", dVar) : Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:17|18))(2:19|(1:21)(4:22|23|24|(1:26)))|11|(1:13)|15))|29|6|7|(0)(0)|11|(0)|15) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        com.onesignal.debug.internal.logging.b.warn("LocationManager.startGetLocation: Location permission exists but there was an error initializing: ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x004f, B:13:0x0057, B:23:0x0042), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startGetLocation(fc.d dVar) {
        e eVar;
        Object obj;
        int i10;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.label = i11 - Integer.MIN_VALUE;
                obj = eVar.result;
                i10 = eVar.label;
                o oVar = o.f277a;
                if (i10 != 0) {
                    v6.a.W(obj);
                    if (!isShared()) {
                        return oVar;
                    }
                    com.onesignal.debug.internal.logging.b.debug$default("LocationManager.startGetLocation()", null, 2, null);
                    z9.a aVar = this._locationController;
                    eVar.label = 1;
                    obj = aVar.start(eVar);
                    gc.a aVar2 = gc.a.f2559g;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("LocationManager.startGetLocation: not possible, no location dependency found", null, 2, null);
                }
                return oVar;
            }
        }
        eVar = new e(dVar);
        obj = eVar.result;
        i10 = eVar.label;
        o oVar2 = o.f277a;
        if (i10 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return oVar2;
    }

    @Override // u9.a
    public boolean isShared() {
        return this._isShared;
    }

    @Override // com.onesignal.location.internal.permissions.a
    public void onLocationPermissionChanged(boolean z10) {
        if (z10) {
            com.onesignal.common.threading.b.suspendifyOnThread$default(0, new C0039a(null), 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // u9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestPermission(fc.d dVar) {
        b bVar;
        int i10;
        pc.o oVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                i10 = bVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    com.onesignal.debug.internal.logging.b.log(g9.c.DEBUG, "LocationManager.requestPermission()");
                    pc.o oVar2 = new pc.o();
                    fd.e eVar = i0.f8859a;
                    zc.d dVar2 = dd.o.f1880a;
                    c cVar = new c(oVar2, null);
                    bVar.L$0 = oVar2;
                    bVar.label = 1;
                    Object A = a0.A(dVar2, cVar, bVar);
                    gc.a aVar = gc.a.f2559g;
                    if (A == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = (pc.o) bVar.L$0;
                    v6.a.W(obj);
                }
                return Boolean.valueOf(oVar.f5679g);
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.result;
        i10 = bVar.label;
        if (i10 != 0) {
        }
        return Boolean.valueOf(oVar.f5679g);
    }

    @Override // u9.a
    public void setShared(boolean z10) {
        com.onesignal.debug.internal.logging.b.debug$default("LocationManager.setIsShared(value: " + z10 + ')', null, 2, null);
        this._prefs.saveBool("OneSignal", "OS_LOCATION_SHARED", Boolean.valueOf(z10));
        this._isShared = z10;
        onLocationPermissionChanged(z10);
    }

    @Override // d9.b
    public void start() {
        this._locationPermissionController.subscribe((com.onesignal.location.internal.permissions.a) this);
        if (y9.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            com.onesignal.common.threading.b.suspendifyOnThread$default(0, new d(null), 1, null);
        }
    }
}
