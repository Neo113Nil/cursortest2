package com.gamericefishpro.space.le;

import android.content.pm.PackageManager;
import android.os.Build;
import com.gamericefishpro.space.ei.w;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.ui.m;
import com.gamericefishpro.space.vh.i;
import com.onesignal.common.AndroidUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.ke.a, com.gamericefishpro.space.jd.b, com.gamericefishpro.space.se.a {
    private final f _applicationService;
    private final com.gamericefishpro.space.ne.a _capturer;
    private boolean _isShared;
    private final com.gamericefishpro.space.qe.a _locationController;
    private final com.gamericefishpro.space.se.b _locationPermissionController;
    private final com.gamericefishpro.space.gd.b _prefs;

    /* JADX INFO: renamed from: com.gamericefishpro.space.le.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0032a extends i implements Function1 {
        int label;

        public C0032a(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return a.this.new C0032a(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((C0032a) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                a aVar2 = a.this;
                this.label = 1;
                if (aVar2.startGetLocation(this) == aVar) {
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

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.requestPermission(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends i implements Function2 {
        final /* synthetic */ w $result;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w wVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$result = wVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return a.this.new c(this.$result, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((c) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x0105, code lost:
        
            if (r15.startGetLocation(r14) == r0) goto L54;
         */
        @Override // com.gamericefishpro.space.vh.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException {
            boolean zHasPermission;
            w wVar;
            w wVar2;
            w wVar3;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                String str = null;
                if (!a.this.isShared()) {
                    com.gamericefishpro.space.od.b.warn$default("Requesting location permission, but location sharing must also be enabled by setting isShared to true", null, 2, null);
                }
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                boolean zHasPermission2 = androidUtils.hasPermission("android.permission.ACCESS_FINE_LOCATION", true, a.this._applicationService);
                if (zHasPermission2) {
                    zHasPermission = false;
                } else {
                    zHasPermission = androidUtils.hasPermission("android.permission.ACCESS_COARSE_LOCATION", true, a.this._applicationService);
                    a.this._capturer.setLocationCoarse(true);
                }
                int i2 = Build.VERSION.SDK_INT;
                boolean zHasPermission3 = i2 >= 29 ? androidUtils.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", true, a.this._applicationService) : false;
                if (!zHasPermission2) {
                    List<String> listFilterManifestPermissions = androidUtils.filterManifestPermissions(com.gamericefishpro.space.ph.x.f("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"), a.this._applicationService);
                    if (listFilterManifestPermissions.contains("android.permission.ACCESS_FINE_LOCATION")) {
                        str = "android.permission.ACCESS_FINE_LOCATION";
                    } else if (!listFilterManifestPermissions.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                        com.gamericefishpro.space.od.b.info$default("Location permissions not added on AndroidManifest file >= M", null, 2, null);
                    } else if (!zHasPermission) {
                        str = "android.permission.ACCESS_COARSE_LOCATION";
                    } else if (i2 >= 29 && listFilterManifestPermissions.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        str = "android.permission.ACCESS_BACKGROUND_LOCATION";
                    }
                    wVar2 = this.$result;
                    if (str != null) {
                        com.gamericefishpro.space.se.b bVar = a.this._locationPermissionController;
                        this.L$0 = wVar2;
                        this.label = 2;
                        Object objPrompt = bVar.prompt(true, str, this);
                        if (objPrompt != aVar) {
                            wVar3 = wVar2;
                            obj = objPrompt;
                            zHasPermission = ((Boolean) obj).booleanValue();
                            wVar2 = wVar3;
                        }
                    }
                    wVar2.d = zHasPermission;
                } else if (i2 < 29 || zHasPermission3) {
                    this.$result.d = true;
                    a aVar2 = a.this;
                    this.label = 4;
                } else {
                    w wVar4 = this.$result;
                    a aVar3 = a.this;
                    this.L$0 = wVar4;
                    this.label = 3;
                    Object objBackgroundLocationPermissionLogic = aVar3.backgroundLocationPermissionLogic(true, this);
                    if (objBackgroundLocationPermissionLogic != aVar) {
                        wVar = wVar4;
                        obj = objBackgroundLocationPermissionLogic;
                        wVar.d = ((Boolean) obj).booleanValue();
                    }
                }
                return aVar;
            }
            if (i == 1) {
                com.gamericefishpro.space.wa.b.P(obj);
                this.$result.d = true;
            } else if (i == 2) {
                wVar3 = (w) this.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                zHasPermission = ((Boolean) obj).booleanValue();
                wVar2 = wVar3;
                wVar2.d = zHasPermission;
            } else if (i == 3) {
                wVar = (w) this.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                wVar.d = ((Boolean) obj).booleanValue();
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends i implements Function1 {
        int label;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return a.this.new d(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((d) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                a aVar2 = a.this;
                this.label = 1;
                if (aVar2.startGetLocation(this) == aVar) {
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

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public e(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.startGetLocation(this);
        }
    }

    public a(f _applicationService, com.gamericefishpro.space.ne.a _capturer, com.gamericefishpro.space.qe.a _locationController, com.gamericefishpro.space.se.b _locationPermissionController, com.gamericefishpro.space.gd.b _prefs) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_capturer, "_capturer");
        Intrinsics.checkNotNullParameter(_locationController, "_locationController");
        Intrinsics.checkNotNullParameter(_locationPermissionController, "_locationPermissionController");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._applicationService = _applicationService;
        this._capturer = _capturer;
        this._locationController = _locationController;
        this._locationPermissionController = _locationPermissionController;
        this._prefs = _prefs;
        Boolean bool = _prefs.getBool("OneSignal", "OS_LOCATION_SHARED", Boolean.FALSE);
        Intrinsics.b(bool);
        this._isShared = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z, com.gamericefishpro.space.th.a aVar) {
        return AndroidUtils.INSTANCE.hasPermission("android.permission.ACCESS_BACKGROUND_LOCATION", false, this._applicationService) ? this._locationPermissionController.prompt(z, "android.permission.ACCESS_BACKGROUND_LOCATION", aVar) : Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object startGetLocation(com.gamericefishpro.space.th.a aVar) {
        e eVar;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i = eVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.label = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(aVar);
            }
        } else {
            eVar = new e(aVar);
        }
        Object objStart = eVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = eVar.label;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(objStart);
                if (!isShared()) {
                    return Unit.a;
                }
                com.gamericefishpro.space.od.b.debug$default("LocationManager.startGetLocation()", null, 2, null);
                com.gamericefishpro.space.qe.a aVar3 = this._locationController;
                eVar.label = 1;
                objStart = aVar3.start(eVar);
                if (objStart == aVar2) {
                    return aVar2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(objStart);
            }
            if (!((Boolean) objStart).booleanValue()) {
                com.gamericefishpro.space.od.b.warn$default("LocationManager.startGetLocation: not possible, no location dependency found", null, 2, null);
            }
        } catch (Throwable th) {
            com.gamericefishpro.space.od.b.warn("LocationManager.startGetLocation: Location permission exists but there was an error initializing: ", th);
        }
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.ke.a
    public boolean isShared() {
        return this._isShared;
    }

    @Override // com.gamericefishpro.space.se.a
    public void onLocationPermissionChanged(boolean z) {
        if (z) {
            com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new C0032a(null), 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.ke.a
    public Object requestPermission(com.gamericefishpro.space.th.a aVar) {
        b bVar;
        w wVar;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        Object obj = bVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.od.b.log(com.gamericefishpro.space.md.c.DEBUG, "LocationManager.requestPermission()");
            w wVar2 = new w();
            com.gamericefishpro.space.wi.e eVar = k0.a;
            com.gamericefishpro.space.qi.d dVar = m.a;
            c cVar = new c(wVar2, null);
            bVar.L$0 = wVar2;
            bVar.label = 1;
            if (a0.D(dVar, cVar, bVar) == aVar2) {
                return aVar2;
            }
            wVar = wVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (w) bVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Boolean.valueOf(wVar.d);
    }

    @Override // com.gamericefishpro.space.ke.a
    public void setShared(boolean z) {
        com.gamericefishpro.space.od.b.debug$default("LocationManager.setIsShared(value: " + z + ')', null, 2, null);
        this._prefs.saveBool("OneSignal", "OS_LOCATION_SHARED", Boolean.valueOf(z));
        this._isShared = z;
        onLocationPermissionChanged(z);
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        this._locationPermissionController.subscribe((com.gamericefishpro.space.se.a) this);
        if (com.gamericefishpro.space.pe.b.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new d(null), 1, null);
        }
    }
}
