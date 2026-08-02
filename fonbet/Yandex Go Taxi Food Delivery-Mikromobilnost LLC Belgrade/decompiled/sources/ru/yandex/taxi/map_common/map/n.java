package ru.yandex.taxi.map_common.map;

import android.app.Application;
import com.getkeepsafe.relinker.MissingLibraryException;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.location.LocationManager;
import defpackage.arb1;
import defpackage.bg00;
import defpackage.byn;
import defpackage.c350;
import defpackage.czo0;
import defpackage.el00;
import defpackage.evu0;
import defpackage.fk00;
import defpackage.hbp0;
import defpackage.hzk;
import defpackage.i3y;
import defpackage.jst;
import defpackage.l8x;
import defpackage.mdh;
import defpackage.nfm;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ok00;
import defpackage.q66;
import defpackage.qv10;
import defpackage.rby;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v2u0;
import defpackage.vuu0;
import defpackage.wls;
import defpackage.xby;
import defpackage.yb20;
import defpackage.zy11;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.map_common.map.h;
import ru.yandex.taxi.map_common.map.n;

/* loaded from: classes9.dex */
public final class n extends el00 {
    public static final yb20 q = new yb20("0", "0");
    public final Application b;
    public final tt2 c;
    public final v2u0 d;
    public final byn e;
    public final ru.yandex.taxi.map_common.map.experiment.a f;
    public final fk00 g;
    public final ok00 h;
    public final hzk i;
    public final i3y k;
    public final i3y l;
    public volatile String o;
    public final hbp0 j = new hbp0(new czo0(14), "mapkit", new rby("Error in MapKit scope", 0));
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final i3y n = kotlin.a.a(new sls() { // from class: ru.yandex.taxi.map_common.map.m
        @Override // defpackage.sls
        public final Object invoke() {
            n nVar = n.this;
            hbp0 j = nVar.j();
            nVar.c.getClass();
            sjh sjhVar = uyj.a;
            return tje.M(j.c(), mdh.b, CoroutineStart.LAZY, new MapKitManagerImpl$initJob$2$1(nVar, null));
        }
    });
    public final nfm p = new nfm(2, this);

    public n(Application application, tt2 tt2Var, bg00 bg00Var, v2u0 v2u0Var, byn bynVar, ru.yandex.taxi.map_common.map.experiment.a aVar, fk00 fk00Var, ok00 ok00Var, hzk hzkVar) {
        this.b = application;
        this.c = tt2Var;
        this.d = v2u0Var;
        this.e = bynVar;
        this.f = aVar;
        this.g = fk00Var;
        this.h = ok00Var;
        this.i = hzkVar;
        final int i = 0;
        this.k = kotlin.a.a(new sls(this) { // from class: fl00
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                n nVar = this.b;
                switch (i2) {
                    case 0:
                        hbp0 hbp0Var = nVar.j;
                        hbp0Var.a();
                        return hbp0Var;
                    default:
                        fk00 fk00Var2 = nVar.g;
                        fk00Var2.getClass();
                        return new h(fk00Var2);
                }
            }
        });
        final int i2 = 1;
        this.l = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls(this) { // from class: fl00
            public final /* synthetic */ n b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                n nVar = this.b;
                switch (i22) {
                    case 0:
                        hbp0 hbp0Var = nVar.j;
                        hbp0Var.a();
                        return hbp0Var;
                    default:
                        fk00 fk00Var2 = nVar.g;
                        fk00Var2.getClass();
                        return new h(fk00Var2);
                }
            }
        });
        MapKitFactory.setApiKey(bg00Var.a.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(n nVar, ContinuationImpl continuationImpl) {
        MapKitManagerImpl$initNativeLibrariesAsync$1 mapKitManagerImpl$initNativeLibrariesAsync$1;
        int i;
        tt2 tt2Var = nVar.c;
        Application application = nVar.b;
        if (continuationImpl instanceof MapKitManagerImpl$initNativeLibrariesAsync$1) {
            mapKitManagerImpl$initNativeLibrariesAsync$1 = (MapKitManagerImpl$initNativeLibrariesAsync$1) continuationImpl;
            int i2 = mapKitManagerImpl$initNativeLibrariesAsync$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapKitManagerImpl$initNativeLibrariesAsync$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapKitManagerImpl$initNativeLibrariesAsync$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapKitManagerImpl$initNativeLibrariesAsync$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        new q66().h(application, "maps-mobile");
                    } catch (MissingLibraryException e) {
                        List a = c350.a();
                        List b = c350.b(application);
                        String c = arb1.c(application);
                        StringBuilder v = qv10.v("\n        Failed to load mapkit library with\n        SupportedABIs: ", a, ",\n        SourceDirectories: ", b, ",\n        Installer: ");
                        v.append(c);
                        v.append("\n      ");
                        xby.t(jst.e, "MAPKIT:LOAD_LIBRARY:ERROR", e, vuu0.c(v.toString()), 2);
                    }
                    mapKitManagerImpl$initNativeLibrariesAsync$1.label = 1;
                    tt2Var.getClass();
                    sjh sjhVar = uyj.a;
                    Object k0 = tje.k0(o400.a, new MapKitManagerImpl$initNativeLibraries$2(nVar, null), mapKitManagerImpl$initNativeLibrariesAsync$1);
                    if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        k0 = zy11Var;
                    }
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                hbp0.e(nVar.j(), null, null, new MapKitManagerImpl$runPostInitActions$1(nVar, null), 3);
                hbp0 j = nVar.j();
                tt2Var.getClass();
                sjh sjhVar2 = uyj.a;
                hbp0.e(j, mdh.b, null, new MapKitManagerImpl$runPostInitActions$2(nVar, null), 2);
                hbp0.e(nVar.j(), uyj.a, null, new MapKitManagerImpl$runPostInitActions$3(nVar, null), 2);
                return zy11Var;
            }
        }
        mapKitManagerImpl$initNativeLibrariesAsync$1 = new MapKitManagerImpl$initNativeLibrariesAsync$1(nVar, continuationImpl);
        Object obj2 = mapKitManagerImpl$initNativeLibrariesAsync$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapKitManagerImpl$initNativeLibrariesAsync$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        hbp0.e(nVar.j(), null, null, new MapKitManagerImpl$runPostInitActions$1(nVar, null), 3);
        hbp0 j2 = nVar.j();
        tt2Var.getClass();
        sjh sjhVar22 = uyj.a;
        hbp0.e(j2, mdh.b, null, new MapKitManagerImpl$runPostInitActions$2(nVar, null), 2);
        hbp0.e(nVar.j(), uyj.a, null, new MapKitManagerImpl$runPostInitActions$3(nVar, null), 2);
        return zy11Var2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|29|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        defpackage.xby.l(defpackage.jst.e, "MapkitManager", null, r0, "FailedToReceiveStartupClientIdentifier", 2);
        r6.l(ru.yandex.taxi.map_common.map.n.q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if ((r0 instanceof java.util.concurrent.CancellationException) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(n nVar, ContinuationImpl continuationImpl) {
        MapKitManagerImpl$requestMetricaIdentifiers$1 mapKitManagerImpl$requestMetricaIdentifiers$1;
        int i;
        nVar.getClass();
        if (continuationImpl instanceof MapKitManagerImpl$requestMetricaIdentifiers$1) {
            mapKitManagerImpl$requestMetricaIdentifiers$1 = (MapKitManagerImpl$requestMetricaIdentifiers$1) continuationImpl;
            int i2 = mapKitManagerImpl$requestMetricaIdentifiers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapKitManagerImpl$requestMetricaIdentifiers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapKitManagerImpl$requestMetricaIdentifiers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapKitManagerImpl$requestMetricaIdentifiers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MapKitManagerImpl$requestMetricaIdentifiers$2 mapKitManagerImpl$requestMetricaIdentifiers$2 = new MapKitManagerImpl$requestMetricaIdentifiers$2(nVar, null);
                    mapKitManagerImpl$requestMetricaIdentifiers$1.label = 1;
                    Object u = kotlinx.coroutines.a.u(5000L, mapKitManagerImpl$requestMetricaIdentifiers$2, mapKitManagerImpl$requestMetricaIdentifiers$1);
                    nVar = u;
                    if (u == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    nVar = nVar;
                }
                return zy11.a;
            }
        }
        mapKitManagerImpl$requestMetricaIdentifiers$1 = new MapKitManagerImpl$requestMetricaIdentifiers$1(nVar, continuationImpl);
        Object obj2 = mapKitManagerImpl$requestMetricaIdentifiers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapKitManagerImpl$requestMetricaIdentifiers$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public static void k(String str, LinkedHashMap linkedHashMap) {
        linkedHashMap.put("com.yandex.mapkit.dataproviders.".concat(str), "osm");
    }

    @Override // defpackage.el00
    public final Object a(ContinuationImpl continuationImpl) {
        return ((l8x) this.n.getValue()).u0(continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.el00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, ContinuationImpl continuationImpl) {
        MapKitManagerImpl$awaitInstance$1 mapKitManagerImpl$awaitInstance$1;
        int i;
        if (continuationImpl instanceof MapKitManagerImpl$awaitInstance$1) {
            mapKitManagerImpl$awaitInstance$1 = (MapKitManagerImpl$awaitInstance$1) continuationImpl;
            int i2 = mapKitManagerImpl$awaitInstance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapKitManagerImpl$awaitInstance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapKitManagerImpl$awaitInstance$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapKitManagerImpl$awaitInstance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        m();
                    }
                    mapKitManagerImpl$awaitInstance$1.Z$0 = z;
                    mapKitManagerImpl$awaitInstance$1.label = 1;
                    if (a(mapKitManagerImpl$awaitInstance$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return MapKitFactory.getInstance();
            }
        }
        mapKitManagerImpl$awaitInstance$1 = new MapKitManagerImpl$awaitInstance$1(this, continuationImpl);
        Object obj3 = mapKitManagerImpl$awaitInstance$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapKitManagerImpl$awaitInstance$1.label;
        if (i != 0) {
        }
        return MapKitFactory.getInstance();
    }

    @Override // defpackage.el00
    public final LocationManager c() {
        return MapKitFactory.getInstance().createLocationManager();
    }

    @Override // defpackage.el00
    public final String d() {
        return this.o;
    }

    @Override // defpackage.el00
    public final nfm e() {
        return this.p;
    }

    @Override // defpackage.el00
    public final void f(boolean z, wls wlsVar) {
        if (z) {
            m();
        }
        i(new MapKitManagerImpl$invokeCallback$1(wlsVar, null));
    }

    public final void i(final tls tlsVar) {
        if (el00.a) {
            hbp0.e(j(), null, null, new MapKitManagerImpl$doOnInitialized$1(tlsVar, null), 3);
        } else {
            ((l8x) this.n.getValue()).w(new tls() { // from class: ru.yandex.taxi.map_common.map.l
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    if (((Throwable) obj) == null) {
                        hbp0.e(n.this.j(), null, null, new MapKitManagerImpl$doOnInitialized$2$1(tlsVar, null), 3);
                    }
                    return zy11.a;
                }
            });
        }
    }

    public final hbp0 j() {
        return (hbp0) this.k.getValue();
    }

    public final void l(yb20 yb20Var) {
        String str = yb20Var.b;
        String str2 = yb20Var.a;
        if (str != null && !evu0.J(str) && str2 != null && !evu0.J(str2)) {
            i(new MapKitManagerImpl$setMetricaParameters$1(str2, str, null));
            return;
        }
        jst.e.k(new IllegalArgumentException(), String.format("Invalid uuid(=%s) or deviceId(=%s), setting default values", Arrays.copyOf(new Object[]{str2, str}, 2)));
        if (el00.a) {
            MapKitFactory.getInstance().setMetricaIds("0", "0");
        }
    }

    public final void m() {
        if (this.m.compareAndSet(false, true)) {
            ((l8x) this.n.getValue()).start();
        }
    }
}
