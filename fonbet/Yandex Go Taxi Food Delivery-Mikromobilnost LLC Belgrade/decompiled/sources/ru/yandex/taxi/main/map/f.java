package ru.yandex.taxi.main.map;

import android.os.SystemClock;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.au50;
import defpackage.c34;
import defpackage.dr3;
import defpackage.er3;
import defpackage.f34;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.ir3;
import defpackage.kr0;
import defpackage.mc00;
import defpackage.mo21;
import defpackage.nc00;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.w24;
import defpackage.w511;
import defpackage.w6r;
import defpackage.x24;
import defpackage.xwt;
import defpackage.y24;
import defpackage.z24;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.repository.AutoFsSessionPhase;

/* loaded from: classes9.dex */
public final class f {
    public final com.yandex.go.route.interactor.b a;
    public final ru.yandex.taxi.e b;
    public final au50 c;
    public final com.yandex.go.navigation.screen.c d;
    public final w6r e;
    public final d f;
    public final h3y g;
    public final ru.yandex.taxi.main.map.autoupdatelocationthrottle.e h;
    public final com.yandex.go.shortcuts.impl.experiments.f i;
    public final ru.yandex.taxi.location.lbs.wifi.a j;
    public final ir3 k;
    public final er3 l;
    public final xwt m;
    public final kr0 n;
    public final kotlinx.coroutines.sync.a o = gtq0.a();
    public final ConcurrentHashMap p = new ConcurrentHashMap();
    public volatile mo21 q;
    public volatile long r;

    public f(com.yandex.go.route.interactor.b bVar, ru.yandex.taxi.e eVar, au50 au50Var, com.yandex.go.navigation.screen.c cVar, w6r w6rVar, d dVar, h3y h3yVar, ru.yandex.taxi.main.map.autoupdatelocationthrottle.e eVar2, com.yandex.go.shortcuts.impl.experiments.f fVar, ru.yandex.taxi.location.lbs.wifi.a aVar, ir3 ir3Var, er3 er3Var, xwt xwtVar, kr0 kr0Var) {
        this.a = bVar;
        this.b = eVar;
        this.c = au50Var;
        this.d = cVar;
        this.e = w6rVar;
        this.f = dVar;
        this.g = h3yVar;
        this.h = eVar2;
        this.i = fVar;
        this.j = aVar;
        this.k = ir3Var;
        this.l = er3Var;
        this.m = xwtVar;
        this.n = kr0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:13:0x0076, B:15:0x007a, B:16:0x007e, B:24:0x0065), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r7v0, types: [ru.yandex.taxi.main.map.f] */
    /* JADX WARN: Type inference failed for: r8v0, types: [float] */
    /* JADX WARN: Type inference failed for: r8v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(float f, w24 w24Var, ContinuationImpl continuationImpl) {
        MainScreenUserLocationTracker$checkTimeThrottle$1 mainScreenUserLocationTracker$checkTimeThrottle$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        w24 w24Var2;
        float f2;
        Object obj2;
        float f3;
        w24 w24Var3;
        try {
            if (continuationImpl instanceof MainScreenUserLocationTracker$checkTimeThrottle$1) {
                mainScreenUserLocationTracker$checkTimeThrottle$1 = (MainScreenUserLocationTracker$checkTimeThrottle$1) continuationImpl;
                int i2 = mainScreenUserLocationTracker$checkTimeThrottle$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mainScreenUserLocationTracker$checkTimeThrottle$1.label = i2 - Integer.MIN_VALUE;
                    obj = mainScreenUserLocationTracker$checkTimeThrottle$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mainScreenUserLocationTracker$checkTimeThrottle$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        mainScreenUserLocationTracker$checkTimeThrottle$1.L$0 = w24Var;
                        kotlinx.coroutines.sync.a aVar = this.o;
                        mainScreenUserLocationTracker$checkTimeThrottle$1.L$1 = aVar;
                        mainScreenUserLocationTracker$checkTimeThrottle$1.F$0 = f;
                        mainScreenUserLocationTracker$checkTimeThrottle$1.label = 1;
                        if (aVar.a(mainScreenUserLocationTracker$checkTimeThrottle$1) != coroutineSingletons) {
                            w24Var2 = w24Var;
                            f2 = f;
                            obj2 = aVar;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f3 = mainScreenUserLocationTracker$checkTimeThrottle$1.F$0;
                        g050 g050Var = (g050) mainScreenUserLocationTracker$checkTimeThrottle$1.L$1;
                        w24Var3 = (w24) mainScreenUserLocationTracker$checkTimeThrottle$1.L$0;
                        kotlin.b.b(obj);
                        f = g050Var;
                        f34 f34Var = (f34) obj;
                        return Boolean.valueOf(f34Var != null ? f34Var.a(f3, w24Var3) : true);
                    }
                    float f4 = mainScreenUserLocationTracker$checkTimeThrottle$1.F$0;
                    Object obj3 = (g050) mainScreenUserLocationTracker$checkTimeThrottle$1.L$1;
                    w24Var2 = (w24) mainScreenUserLocationTracker$checkTimeThrottle$1.L$0;
                    kotlin.b.b(obj);
                    f2 = f4;
                    obj2 = obj3;
                    mainScreenUserLocationTracker$checkTimeThrottle$1.L$0 = w24Var2;
                    mainScreenUserLocationTracker$checkTimeThrottle$1.L$1 = obj2;
                    mainScreenUserLocationTracker$checkTimeThrottle$1.F$0 = f2;
                    mainScreenUserLocationTracker$checkTimeThrottle$1.label = 2;
                    obj = d(w24Var2, mainScreenUserLocationTracker$checkTimeThrottle$1);
                    if (obj != coroutineSingletons) {
                        f3 = f2;
                        w24Var3 = w24Var2;
                        f = obj2;
                        f34 f34Var2 = (f34) obj;
                        return Boolean.valueOf(f34Var2 != null ? f34Var2.a(f3, w24Var3) : true);
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            mainScreenUserLocationTracker$checkTimeThrottle$1.L$0 = w24Var2;
            mainScreenUserLocationTracker$checkTimeThrottle$1.L$1 = obj2;
            mainScreenUserLocationTracker$checkTimeThrottle$1.F$0 = f2;
            mainScreenUserLocationTracker$checkTimeThrottle$1.label = 2;
            obj = d(w24Var2, mainScreenUserLocationTracker$checkTimeThrottle$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } finally {
            f.d(null);
        }
        mainScreenUserLocationTracker$checkTimeThrottle$1 = new MainScreenUserLocationTracker$checkTimeThrottle$1(this, continuationImpl);
        obj = mainScreenUserLocationTracker$checkTimeThrottle$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenUserLocationTracker$checkTimeThrottle$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, int i2, ContinuationImpl continuationImpl) {
        MainScreenUserLocationTracker$createComparisonData$1 mainScreenUserLocationTracker$createComparisonData$1;
        int i3;
        AutoUpdateUserLocationStrategyExperiment autoUpdateUserLocationStrategyExperiment;
        if (continuationImpl instanceof MainScreenUserLocationTracker$createComparisonData$1) {
            mainScreenUserLocationTracker$createComparisonData$1 = (MainScreenUserLocationTracker$createComparisonData$1) continuationImpl;
            int i4 = mainScreenUserLocationTracker$createComparisonData$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mainScreenUserLocationTracker$createComparisonData$1.label = i4 - Integer.MIN_VALUE;
                Object obj = mainScreenUserLocationTracker$createComparisonData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = mainScreenUserLocationTracker$createComparisonData$1.label;
                z24 z24Var = null;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    mainScreenUserLocationTracker$createComparisonData$1.I$0 = i;
                    mainScreenUserLocationTracker$createComparisonData$1.I$1 = i2;
                    mainScreenUserLocationTracker$createComparisonData$1.label = 1;
                    obj = this.h.a(mainScreenUserLocationTracker$createComparisonData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mainScreenUserLocationTracker$createComparisonData$1.I$1;
                    i = mainScreenUserLocationTracker$createComparisonData$1.I$0;
                    kotlin.b.b(obj);
                }
                autoUpdateUserLocationStrategyExperiment = (AutoUpdateUserLocationStrategyExperiment) obj;
                Screen b = this.d.b();
                boolean z = b == Screen.TAXI_MAIN;
                if (autoUpdateUserLocationStrategyExperiment != null) {
                    if (b == Screen.MAIN_V4 || b == Screen.MAIN) {
                        z24Var = c(autoUpdateUserLocationStrategyExperiment, autoUpdateUserLocationStrategyExperiment.n, i, b);
                    } else if (z) {
                        z24Var = c(autoUpdateUserLocationStrategyExperiment, autoUpdateUserLocationStrategyExperiment.o, i, b);
                    }
                }
                return new mc00(i, i2, z24Var, autoUpdateUserLocationStrategyExperiment != null ? autoUpdateUserLocationStrategyExperiment.h : false);
            }
        }
        mainScreenUserLocationTracker$createComparisonData$1 = new MainScreenUserLocationTracker$createComparisonData$1(this, continuationImpl);
        Object obj2 = mainScreenUserLocationTracker$createComparisonData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = mainScreenUserLocationTracker$createComparisonData$1.label;
        z24 z24Var2 = null;
        if (i3 != 0) {
        }
        autoUpdateUserLocationStrategyExperiment = (AutoUpdateUserLocationStrategyExperiment) obj2;
        Screen b2 = this.d.b();
        if (b2 == Screen.TAXI_MAIN) {
        }
        if (autoUpdateUserLocationStrategyExperiment != null) {
        }
        return new mc00(i, i2, z24Var2, autoUpdateUserLocationStrategyExperiment != null ? autoUpdateUserLocationStrategyExperiment.h : false);
    }

    public final z24 c(AutoUpdateUserLocationStrategyExperiment autoUpdateUserLocationStrategyExperiment, AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType, int i, Screen screen) {
        int i2 = i;
        Integer num = autoUpdateUserLocationStrategyExperiment.l;
        c34 c34Var = (c34) this.g.get();
        Objects.toString(autoUpdateUserLocationStrategyType);
        Objects.toString(screen);
        c34Var.getClass();
        int i3 = nc00.a[autoUpdateUserLocationStrategyType.ordinal()];
        if (i3 == 1) {
            if (num != null) {
                i2 = Math.min(i2, num.intValue());
            }
            return new w24(screen, i2, autoUpdateUserLocationStrategyExperiment.d, autoUpdateUserLocationStrategyExperiment.e, autoUpdateUserLocationStrategyExperiment.f, autoUpdateUserLocationStrategyExperiment.g, autoUpdateUserLocationStrategyExperiment.i);
        }
        if (i3 == 2) {
            return new x24(Math.max(i2, (int) autoUpdateUserLocationStrategyExperiment.k), autoUpdateUserLocationStrategyExperiment.j);
        }
        if (i3 == 3) {
            return y24.a;
        }
        if (num != null) {
            i2 = Math.min(i2, num.intValue());
        }
        return new w24(screen, i2, autoUpdateUserLocationStrategyExperiment.d, autoUpdateUserLocationStrategyExperiment.e, autoUpdateUserLocationStrategyExperiment.f, autoUpdateUserLocationStrategyExperiment.g, autoUpdateUserLocationStrategyExperiment.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(w24 w24Var, ContinuationImpl continuationImpl) {
        MainScreenUserLocationTracker$getTimeThrottleCounter$1 mainScreenUserLocationTracker$getTimeThrottleCounter$1;
        int i;
        ConcurrentHashMap concurrentHashMap;
        if (continuationImpl instanceof MainScreenUserLocationTracker$getTimeThrottleCounter$1) {
            mainScreenUserLocationTracker$getTimeThrottleCounter$1 = (MainScreenUserLocationTracker$getTimeThrottleCounter$1) continuationImpl;
            int i2 = mainScreenUserLocationTracker$getTimeThrottleCounter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenUserLocationTracker$getTimeThrottleCounter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainScreenUserLocationTracker$getTimeThrottleCounter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenUserLocationTracker$getTimeThrottleCounter$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mainScreenUserLocationTracker$getTimeThrottleCounter$1.L$0 = w24Var;
                    mainScreenUserLocationTracker$getTimeThrottleCounter$1.label = 1;
                    obj = this.h.a(mainScreenUserLocationTracker$getTimeThrottleCounter$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w24Var = (w24) mainScreenUserLocationTracker$getTimeThrottleCounter$1.L$0;
                    kotlin.b.b(obj);
                }
                AutoUpdateUserLocationStrategyExperiment autoUpdateUserLocationStrategyExperiment = (AutoUpdateUserLocationStrategyExperiment) obj;
                concurrentHashMap = this.p;
                if (concurrentHashMap.isEmpty()) {
                    h3y h3yVar = this.g;
                    f34 f34Var = new f34((c34) h3yVar.get());
                    concurrentHashMap.put(Screen.MAIN_V4, f34Var);
                    concurrentHashMap.put(Screen.MAIN, f34Var);
                    if (autoUpdateUserLocationStrategyExperiment == null || !autoUpdateUserLocationStrategyExperiment.m) {
                        ((c34) h3yVar.get()).getClass();
                        concurrentHashMap.put(Screen.TAXI_MAIN, new f34((c34) h3yVar.get()));
                    } else {
                        ((c34) h3yVar.get()).getClass();
                        concurrentHashMap.put(Screen.TAXI_MAIN, f34Var);
                    }
                }
                return concurrentHashMap.get(w24Var.a);
            }
        }
        mainScreenUserLocationTracker$getTimeThrottleCounter$1 = new MainScreenUserLocationTracker$getTimeThrottleCounter$1(this, continuationImpl);
        Object obj2 = mainScreenUserLocationTracker$getTimeThrottleCounter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenUserLocationTracker$getTimeThrottleCounter$1.label;
        if (i != 0) {
        }
        AutoUpdateUserLocationStrategyExperiment autoUpdateUserLocationStrategyExperiment2 = (AutoUpdateUserLocationStrategyExperiment) obj2;
        concurrentHashMap = this.p;
        if (concurrentHashMap.isEmpty()) {
        }
        return concurrentHashMap.get(w24Var.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00de, code lost:
    
        if (r11 == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0193, code lost:
    
        if (r2 == r4) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007a  */
    /* JADX WARN: Type inference failed for: r17v0, types: [ru.yandex.taxi.main.map.f] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(mo21 mo21Var, mc00 mc00Var, ContinuationImpl continuationImpl) {
        MainScreenUserLocationTracker$needUpdateCurrentLocation$1 mainScreenUserLocationTracker$needUpdateCurrentLocation$1;
        int i;
        mo21 mo21Var2;
        mo21 mo21Var3;
        Object c;
        ?? r2;
        float f;
        AutoFsSessionPhase autoFsSessionPhase;
        boolean z;
        mc00 mc00Var2 = mc00Var;
        if (continuationImpl instanceof MainScreenUserLocationTracker$needUpdateCurrentLocation$1) {
            mainScreenUserLocationTracker$needUpdateCurrentLocation$1 = (MainScreenUserLocationTracker$needUpdateCurrentLocation$1) continuationImpl;
            int i2 = mainScreenUserLocationTracker$needUpdateCurrentLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenUserLocationTracker$needUpdateCurrentLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainScreenUserLocationTracker$needUpdateCurrentLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenUserLocationTracker$needUpdateCurrentLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c34 c34Var = (c34) this.g.get();
                    boolean z2 = ((ru.yandex.taxi.persuggest.source.f) this.e).d;
                    c34Var.getClass();
                    boolean z3 = mc00Var2 != null ? mc00Var2.d : false;
                    ((c34) this.g.get()).getClass();
                    if (((ru.yandex.taxi.persuggest.source.f) this.e).d && !z3) {
                        c34 c34Var2 = (c34) this.g.get();
                        Objects.toString(mo21Var);
                        c34Var2.getClass();
                        return Boolean.FALSE;
                    }
                    mo21Var2 = this.q;
                    if (mo21Var2 == null) {
                        ((c34) this.g.get()).getClass();
                        return Boolean.TRUE;
                    }
                    ru.yandex.taxi.location.lbs.wifi.a aVar = this.j;
                    mo21Var3 = mo21Var;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$0 = mo21Var3;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$1 = mc00Var2;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$2 = mo21Var2;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.I$0 = z3 ? 1 : 0;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.label = 1;
                    c = aVar.c(mainScreenUserLocationTracker$needUpdateCurrentLocation$1);
                    r2 = z3;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            if (((Boolean) obj).booleanValue()) {
                                return Boolean.TRUE;
                            }
                            ((c34) this.g.get()).getClass();
                            return Boolean.FALSE;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f = mainScreenUserLocationTracker$needUpdateCurrentLocation$1.F$1;
                        kotlin.b.b(obj);
                        return Boolean.valueOf(f <= ((float) ((Number) obj).intValue()));
                    }
                    int i3 = mainScreenUserLocationTracker$needUpdateCurrentLocation$1.I$0;
                    mo21Var2 = (mo21) mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$2;
                    mc00 mc00Var3 = (mc00) mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$1;
                    mo21Var3 = (mo21) mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$0;
                    kotlin.b.b(obj);
                    r2 = i3;
                    mc00Var2 = mc00Var3;
                    c = obj;
                }
                if (!((Boolean) c).booleanValue()) {
                    ((c34) this.g.get()).getClass();
                    return Boolean.TRUE;
                }
                if (mc00Var2 == null) {
                    ((c34) this.g.get()).getClass();
                    return Boolean.FALSE;
                }
                z24 z24Var = mc00Var2.c;
                if (z24Var instanceof y24) {
                    if (this.m.a) {
                        return Boolean.FALSE;
                    }
                    ir3 ir3Var = this.k;
                    synchronized (ir3Var) {
                        ir3.a(ir3Var);
                        autoFsSessionPhase = ir3Var.c;
                    }
                    int i4 = nc00.b[autoFsSessionPhase.ordinal()];
                    if (i4 == 1 || i4 == 2) {
                        z = false;
                    } else {
                        if (i4 != 3 && i4 != 4) {
                            w511.b();
                            return null;
                        }
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                float j = ru.yandex.taxi.map.utils.a.j(mo21Var2.a(), mo21Var3.a());
                long j2 = (mo21Var3.f - mo21Var2.f) / 1000;
                boolean z4 = z24Var instanceof w24;
                h3y h3yVar = this.g;
                if (z4) {
                    ((c34) h3yVar.get()).getClass();
                    w24 w24Var = (w24) z24Var;
                    if (j < w24Var.b) {
                        ((c34) this.g.get()).getClass();
                        return Boolean.FALSE;
                    }
                    float f2 = mo21Var3.g;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$0 = null;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$1 = null;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$2 = null;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$3 = null;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.I$0 = r2;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.F$0 = j;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.J$0 = j2;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.label = 2;
                    obj = a(f2, w24Var, mainScreenUserLocationTracker$needUpdateCurrentLocation$1);
                } else {
                    if (z24Var instanceof x24) {
                        ((c34) h3yVar.get()).getClass();
                        x24 x24Var = (x24) z24Var;
                        if (j < x24Var.a()) {
                            ((c34) this.g.get()).getClass();
                            return Boolean.FALSE;
                        }
                        if ((SystemClock.elapsedRealtime() / 1000) - this.r >= x24Var.b()) {
                            return Boolean.TRUE;
                        }
                        ((c34) this.g.get()).getClass();
                        return Boolean.FALSE;
                    }
                    ((c34) h3yVar.get()).getClass();
                    if (j <= mc00Var2.a && j2 <= mc00Var2.b) {
                        ((c34) this.g.get()).getClass();
                        return Boolean.FALSE;
                    }
                    com.yandex.go.shortcuts.impl.experiments.f fVar = this.i;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$0 = null;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$1 = null;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$2 = null;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.L$3 = null;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.I$0 = r2;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.F$0 = j;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.J$0 = j2;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.F$1 = j;
                    mainScreenUserLocationTracker$needUpdateCurrentLocation$1.label = 3;
                    obj = fVar.a(mainScreenUserLocationTracker$needUpdateCurrentLocation$1);
                    if (obj != coroutineSingletons) {
                        f = j;
                        return Boolean.valueOf(f <= ((float) ((Number) obj).intValue()));
                    }
                }
                return coroutineSingletons;
            }
        }
        mainScreenUserLocationTracker$needUpdateCurrentLocation$1 = new MainScreenUserLocationTracker$needUpdateCurrentLocation$1(this, continuationImpl);
        Object obj2 = mainScreenUserLocationTracker$needUpdateCurrentLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenUserLocationTracker$needUpdateCurrentLocation$1.label;
        if (i != 0) {
        }
        if (!((Boolean) c).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0237, code lost:
    
        if (r12 == r1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0207, code lost:
    
        if (r12 != r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0195, code lost:
    
        if (r8 == ru.yandex.taxi.persuggest.repository.AutoFsSessionPhase.ReadyForAutoFs) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0137, code lost:
    
        if (r2 == r1) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(mo21 mo21Var, ContinuationImpl continuationImpl) {
        MainScreenUserLocationTracker$tryUpdateLocation$1 mainScreenUserLocationTracker$tryUpdateLocation$1;
        int i;
        Object b;
        Object h;
        f fVar;
        Object b2;
        mo21 mo21Var2;
        int i2;
        mc00 mc00Var;
        boolean z;
        Object b3;
        int i3;
        int i4;
        mc00 mc00Var2;
        mo21 mo21Var3;
        int i5;
        ir3 ir3Var;
        Address h2;
        GeoPointAcquisitionType geoPointAcquisitionType;
        mo21 mo21Var4;
        if (continuationImpl instanceof MainScreenUserLocationTracker$tryUpdateLocation$1) {
            mainScreenUserLocationTracker$tryUpdateLocation$1 = (MainScreenUserLocationTracker$tryUpdateLocation$1) continuationImpl;
            int i6 = mainScreenUserLocationTracker$tryUpdateLocation$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                mainScreenUserLocationTracker$tryUpdateLocation$1.label = i6 - Integer.MIN_VALUE;
                Object obj = mainScreenUserLocationTracker$tryUpdateLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = 1;
                switch (mainScreenUserLocationTracker$tryUpdateLocation$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        c34 c34Var = (c34) this.g.get();
                        Objects.toString(mo21Var);
                        c34Var.getClass();
                        i = (this.d.h() || this.d.e() || this.d.b() == Screen.SUPERAPP_SUGGEST) ? 1 : 0;
                        if (i == 0) {
                            c34 c34Var2 = (c34) this.g.get();
                            Objects.toString(this.d.b());
                            c34Var2.getClass();
                            return null;
                        }
                        if (!this.b.f()) {
                            au50 au50Var = this.c;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.label = 3;
                            b = ((t1b0) au50Var.b).b(mainScreenUserLocationTracker$tryUpdateLocation$1);
                            break;
                        } else {
                            ru.yandex.taxi.e eVar = this.b;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = this;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.label = 1;
                            h = eVar.h(mainScreenUserLocationTracker$tryUpdateLocation$1);
                            if (h != coroutineSingletons) {
                                fVar = this;
                                int intValue = ((Number) h).intValue();
                                mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var;
                                mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = null;
                                mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i;
                                mainScreenUserLocationTracker$tryUpdateLocation$1.label = 2;
                                b2 = fVar.b(intValue, 9999, mainScreenUserLocationTracker$tryUpdateLocation$1);
                                if (b2 != coroutineSingletons) {
                                    mo21Var2 = mo21Var;
                                    i2 = i;
                                    obj = b2;
                                    mc00Var = (mc00) obj;
                                    z = (mc00Var != null ? mc00Var.c : null) instanceof y24;
                                    if (z && ((dr3) this.l.a).a()) {
                                        ir3Var = this.k;
                                        synchronized (ir3Var) {
                                            ir3.a(ir3Var);
                                            AutoFsSessionPhase autoFsSessionPhase = ir3Var.c;
                                        }
                                        break;
                                    }
                                    i7 = 0;
                                    kr0 kr0Var = this.n;
                                    mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var2;
                                    mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = mc00Var;
                                    mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i2;
                                    mainScreenUserLocationTracker$tryUpdateLocation$1.I$1 = z ? 1 : 0;
                                    mainScreenUserLocationTracker$tryUpdateLocation$1.I$2 = i7;
                                    mainScreenUserLocationTracker$tryUpdateLocation$1.label = 5;
                                    b3 = ((com.yandex.go.clarify_address.a) kr0Var).b(mainScreenUserLocationTracker$tryUpdateLocation$1);
                                    if (b3 != coroutineSingletons) {
                                        int i8 = i7;
                                        i3 = i2;
                                        i4 = i8;
                                        mc00Var2 = mc00Var;
                                        obj = b3;
                                        mo21Var3 = mo21Var2;
                                        i5 = z ? 1 : 0;
                                        if (!((Boolean) obj).booleanValue() && i4 == 0) {
                                            ((c34) this.g.get()).getClass();
                                            return null;
                                        }
                                        h2 = this.a.c().h();
                                        geoPointAcquisitionType = h2 == null ? h2.getGeoPointAcquisitionType() : null;
                                        if (geoPointAcquisitionType != null && geoPointAcquisitionType != GeoPointAcquisitionType.USER_LOCATION) {
                                            d dVar = this.f;
                                            Long requestTime = h2.getRequestTime();
                                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var3;
                                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = mc00Var2;
                                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$2 = null;
                                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$3 = null;
                                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i3;
                                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$1 = i5;
                                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$2 = i4;
                                            mainScreenUserLocationTracker$tryUpdateLocation$1.label = 6;
                                            obj = dVar.a(requestTime, mainScreenUserLocationTracker$tryUpdateLocation$1);
                                            break;
                                        }
                                        int i9 = i4;
                                        mo21Var4 = mo21Var3;
                                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var4;
                                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = null;
                                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$2 = null;
                                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$3 = null;
                                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i3;
                                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$1 = i5;
                                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$2 = i9;
                                        mainScreenUserLocationTracker$tryUpdateLocation$1.label = 7;
                                        obj = e(mo21Var4, mc00Var2, mainScreenUserLocationTracker$tryUpdateLocation$1);
                                        break;
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        int i10 = mainScreenUserLocationTracker$tryUpdateLocation$1.I$0;
                        f fVar2 = (f) mainScreenUserLocationTracker$tryUpdateLocation$1.L$1;
                        mo21 mo21Var5 = (mo21) mainScreenUserLocationTracker$tryUpdateLocation$1.L$0;
                        kotlin.b.b(obj);
                        i = i10;
                        mo21Var = mo21Var5;
                        fVar = fVar2;
                        h = obj;
                        int intValue2 = ((Number) h).intValue();
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = null;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.label = 2;
                        b2 = fVar.b(intValue2, 9999, mainScreenUserLocationTracker$tryUpdateLocation$1);
                        if (b2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        i2 = mainScreenUserLocationTracker$tryUpdateLocation$1.I$0;
                        mo21Var2 = (mo21) mainScreenUserLocationTracker$tryUpdateLocation$1.L$0;
                        kotlin.b.b(obj);
                        mc00Var = (mc00) obj;
                        z = (mc00Var != null ? mc00Var.c : null) instanceof y24;
                        if (z) {
                            ir3Var = this.k;
                            synchronized (ir3Var) {
                            }
                            break;
                        }
                        i7 = 0;
                        kr0 kr0Var2 = this.n;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var2;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = mc00Var;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i2;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$1 = z ? 1 : 0;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$2 = i7;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.label = 5;
                        b3 = ((com.yandex.go.clarify_address.a) kr0Var2).b(mainScreenUserLocationTracker$tryUpdateLocation$1);
                        if (b3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        int i11 = mainScreenUserLocationTracker$tryUpdateLocation$1.I$0;
                        mo21 mo21Var6 = (mo21) mainScreenUserLocationTracker$tryUpdateLocation$1.L$0;
                        kotlin.b.b(obj);
                        i = i11;
                        mo21Var = mo21Var6;
                        b = obj;
                        if (!((Boolean) b).booleanValue()) {
                            mo21Var2 = mo21Var;
                            i2 = i;
                            mc00Var = null;
                            z = (mc00Var != null ? mc00Var.c : null) instanceof y24;
                            if (z) {
                            }
                            i7 = 0;
                            kr0 kr0Var22 = this.n;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var2;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = mc00Var;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i2;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$1 = z ? 1 : 0;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$2 = i7;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.label = 5;
                            b3 = ((com.yandex.go.clarify_address.a) kr0Var22).b(mainScreenUserLocationTracker$tryUpdateLocation$1);
                            if (b3 != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        mo21 mo21Var7 = this.q;
                        int i12 = mo21Var7 != null ? (int) mo21Var7.c : 0;
                        ((c34) this.g.get()).getClass();
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$1 = i12;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.label = 4;
                        Object b4 = b(i12, 10, mainScreenUserLocationTracker$tryUpdateLocation$1);
                        if (b4 != coroutineSingletons) {
                            mo21Var2 = mo21Var;
                            i2 = i;
                            obj = b4;
                            mc00Var = (mc00) obj;
                            z = (mc00Var != null ? mc00Var.c : null) instanceof y24;
                            if (z) {
                            }
                            i7 = 0;
                            kr0 kr0Var222 = this.n;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var2;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = mc00Var;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i2;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$1 = z ? 1 : 0;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$2 = i7;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.label = 5;
                            b3 = ((com.yandex.go.clarify_address.a) kr0Var222).b(mainScreenUserLocationTracker$tryUpdateLocation$1);
                            if (b3 != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    case 4:
                        i2 = mainScreenUserLocationTracker$tryUpdateLocation$1.I$0;
                        mo21Var2 = (mo21) mainScreenUserLocationTracker$tryUpdateLocation$1.L$0;
                        kotlin.b.b(obj);
                        mc00Var = (mc00) obj;
                        z = (mc00Var != null ? mc00Var.c : null) instanceof y24;
                        if (z) {
                        }
                        i7 = 0;
                        kr0 kr0Var2222 = this.n;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var2;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = mc00Var;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i2;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$1 = z ? 1 : 0;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$2 = i7;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.label = 5;
                        b3 = ((com.yandex.go.clarify_address.a) kr0Var2222).b(mainScreenUserLocationTracker$tryUpdateLocation$1);
                        if (b3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        i4 = mainScreenUserLocationTracker$tryUpdateLocation$1.I$2;
                        i5 = mainScreenUserLocationTracker$tryUpdateLocation$1.I$1;
                        i3 = mainScreenUserLocationTracker$tryUpdateLocation$1.I$0;
                        mc00Var2 = (mc00) mainScreenUserLocationTracker$tryUpdateLocation$1.L$1;
                        mo21Var3 = (mo21) mainScreenUserLocationTracker$tryUpdateLocation$1.L$0;
                        kotlin.b.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        h2 = this.a.c().h();
                        if (h2 == null) {
                        }
                        if (geoPointAcquisitionType != null) {
                            d dVar2 = this.f;
                            Long requestTime2 = h2.getRequestTime();
                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var3;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = mc00Var2;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$2 = null;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.L$3 = null;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i3;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$1 = i5;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.I$2 = i4;
                            mainScreenUserLocationTracker$tryUpdateLocation$1.label = 6;
                            obj = dVar2.a(requestTime2, mainScreenUserLocationTracker$tryUpdateLocation$1);
                            break;
                        }
                        int i92 = i4;
                        mo21Var4 = mo21Var3;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var4;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = null;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$2 = null;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$3 = null;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i3;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$1 = i5;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$2 = i92;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.label = 7;
                        obj = e(mo21Var4, mc00Var2, mainScreenUserLocationTracker$tryUpdateLocation$1);
                        break;
                    case 6:
                        i4 = mainScreenUserLocationTracker$tryUpdateLocation$1.I$2;
                        i5 = mainScreenUserLocationTracker$tryUpdateLocation$1.I$1;
                        i3 = mainScreenUserLocationTracker$tryUpdateLocation$1.I$0;
                        mc00Var2 = (mc00) mainScreenUserLocationTracker$tryUpdateLocation$1.L$1;
                        mo21Var3 = (mo21) mainScreenUserLocationTracker$tryUpdateLocation$1.L$0;
                        kotlin.b.b(obj);
                        if (!((Boolean) obj).booleanValue() && i4 == 0) {
                            ((c34) this.g.get()).getClass();
                            return null;
                        }
                        int i922 = i4;
                        mo21Var4 = mo21Var3;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$0 = mo21Var4;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$1 = null;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$2 = null;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.L$3 = null;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$0 = i3;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$1 = i5;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.I$2 = i922;
                        mainScreenUserLocationTracker$tryUpdateLocation$1.label = 7;
                        obj = e(mo21Var4, mc00Var2, mainScreenUserLocationTracker$tryUpdateLocation$1);
                        break;
                    case 7:
                        mo21Var4 = (mo21) mainScreenUserLocationTracker$tryUpdateLocation$1.L$0;
                        kotlin.b.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        ((c34) this.g.get()).getClass();
                        this.q = mo21Var4;
                        this.b.d = mo21Var4;
                        this.r = SystemClock.elapsedRealtime() / 1000;
                        return mo21Var4;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        mainScreenUserLocationTracker$tryUpdateLocation$1 = new MainScreenUserLocationTracker$tryUpdateLocation$1(this, continuationImpl);
        Object obj2 = mainScreenUserLocationTracker$tryUpdateLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i72 = 1;
        switch (mainScreenUserLocationTracker$tryUpdateLocation$1.label) {
        }
    }
}
