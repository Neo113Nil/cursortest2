package ru.yandex.taxi.preorder.source.userposition.repository;

import android.location.Location;
import android.location.LocationManager;
import defpackage.ai4;
import defpackage.bvf0;
import defpackage.eci0;
import defpackage.f8y;
import defpackage.g050;
import defpackage.gp50;
import defpackage.gtq0;
import defpackage.hcz;
import defpackage.hsx;
import defpackage.ike;
import defpackage.jbh;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.qfr0;
import defpackage.tpr;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes9.dex */
public final class c implements hcz {
    public final f8y a;
    public final LocationManager b;
    public final hsx c;
    public final ai4 d;
    public final gp50 e;
    public final qfr0 f;
    public final ru.yandex.taxi.location.lbs.b g;
    public eci0 i;
    public final ike h = bvf0.b();
    public final kotlinx.coroutines.sync.a j = gtq0.a();

    public c(f8y f8yVar, LocationManager locationManager, hsx hsxVar, ai4 ai4Var, gp50 gp50Var, qfr0 qfr0Var, ru.yandex.taxi.location.lbs.b bVar) {
        this.a = f8yVar;
        this.b = locationManager;
        this.c = hsxVar;
        this.d = ai4Var;
        this.e = gp50Var;
        this.f = qfr0Var;
        this.g = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0071, code lost:
    
        if (r11.a(r0) == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[Catch: all -> 0x0057, TryCatch #2 {all -> 0x0057, blocks: (B:32:0x0053, B:33:0x008a, B:35:0x0092, B:36:0x0098), top: B:31:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #2 {all -> 0x0057, blocks: (B:32:0x0053, B:33:0x008a, B:35:0x0092, B:36:0x0098), top: B:31:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #1 {all -> 0x0104, blocks: (B:44:0x0074, B:46:0x0078), top: B:43:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [g050] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [g050] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v20, types: [g050] */
    @Override // defpackage.hcz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LocationRepositoryAndroidApiImpl$requestLocationUpdates$1 locationRepositoryAndroidApiImpl$requestLocationUpdates$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        ?? r0;
        eci0 eci0Var;
        g050 g050Var;
        g050 g050Var2;
        tpr[] tprVarArr;
        tpr c;
        ?? r1;
        try {
            if (continuationImpl instanceof LocationRepositoryAndroidApiImpl$requestLocationUpdates$1) {
                locationRepositoryAndroidApiImpl$requestLocationUpdates$1 = (LocationRepositoryAndroidApiImpl$requestLocationUpdates$1) continuationImpl;
                int i2 = locationRepositoryAndroidApiImpl$requestLocationUpdates$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    locationRepositoryAndroidApiImpl$requestLocationUpdates$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = locationRepositoryAndroidApiImpl$requestLocationUpdates$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = locationRepositoryAndroidApiImpl$requestLocationUpdates$1.label;
                    int i3 = 1;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.j;
                        locationRepositoryAndroidApiImpl$requestLocationUpdates$1.L$0 = aVar;
                        locationRepositoryAndroidApiImpl$requestLocationUpdates$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                i3 = locationRepositoryAndroidApiImpl$requestLocationUpdates$1.I$0;
                                tpr[] tprVarArr2 = (tpr[]) locationRepositoryAndroidApiImpl$requestLocationUpdates$1.L$3;
                                tprVarArr = (tpr[]) locationRepositoryAndroidApiImpl$requestLocationUpdates$1.L$2;
                                r0 = (g050) locationRepositoryAndroidApiImpl$requestLocationUpdates$1.L$0;
                                try {
                                    kotlin.b.b(obj);
                                    g050Var2 = r0;
                                    r1 = tprVarArr2;
                                    r1[i3] = obj;
                                    c = kotlinx.coroutines.flow.e.K(tprVarArr);
                                    r0 = g050Var2;
                                    Location a = this.c.a();
                                    if (!((Boolean) ((jbh) this.f.a).f(SimplePersistentBooleanExperiment.SETUP_INITIAL_GEO_LOCATION).c()).booleanValue()) {
                                        a = null;
                                    }
                                    eci0Var = kotlinx.coroutines.flow.e.O(new jqr(ru.yandex.taxi.preorder.source.userposition.misc.a.b(c, a), new LocationRepositoryAndroidApiImpl$requestLocationUpdates$2$1$2(this, null), 3), this.h, wsr0.a(xsr0.a, 3), 0);
                                    this.i = eci0Var;
                                    aVar = r0;
                                    aVar.d(null);
                                    return eci0Var;
                                } catch (Throwable th) {
                                    th = th;
                                    r0.d(null);
                                    throw th;
                                }
                            }
                            g050Var = (g050) locationRepositoryAndroidApiImpl$requestLocationUpdates$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    c = c(true, true);
                                    r0 = g050Var;
                                    Location a2 = this.c.a();
                                    if (!((Boolean) ((jbh) this.f.a).f(SimplePersistentBooleanExperiment.SETUP_INITIAL_GEO_LOCATION).c()).booleanValue()) {
                                    }
                                    eci0Var = kotlinx.coroutines.flow.e.O(new jqr(ru.yandex.taxi.preorder.source.userposition.misc.a.b(c, a2), new LocationRepositoryAndroidApiImpl$requestLocationUpdates$2$1$2(this, null), 3), this.h, wsr0.a(xsr0.a, 3), 0);
                                    this.i = eci0Var;
                                    aVar = r0;
                                    aVar.d(null);
                                    return eci0Var;
                                }
                                tpr[] tprVarArr3 = new tpr[2];
                                tprVarArr3[0] = c(true, true);
                                f8y f8yVar = this.a;
                                locationRepositoryAndroidApiImpl$requestLocationUpdates$1.L$0 = g050Var;
                                locationRepositoryAndroidApiImpl$requestLocationUpdates$1.L$1 = null;
                                locationRepositoryAndroidApiImpl$requestLocationUpdates$1.L$2 = tprVarArr3;
                                locationRepositoryAndroidApiImpl$requestLocationUpdates$1.L$3 = tprVarArr3;
                                locationRepositoryAndroidApiImpl$requestLocationUpdates$1.I$0 = 1;
                                locationRepositoryAndroidApiImpl$requestLocationUpdates$1.label = 3;
                                ru.yandex.taxi.location.g gVar = (ru.yandex.taxi.location.g) f8yVar;
                                gVar.getClass();
                                Object b = ru.yandex.taxi.location.g.b(gVar, "LocationRepositoryAndroidApiImpl", locationRepositoryAndroidApiImpl$requestLocationUpdates$1);
                                if (b != coroutineSingletons) {
                                    tpr[] tprVarArr4 = tprVarArr3;
                                    obj = b;
                                    g050Var2 = g050Var;
                                    tprVarArr = tprVarArr4;
                                    r1 = tprVarArr4;
                                    r1[i3] = obj;
                                    c = kotlinx.coroutines.flow.e.K(tprVarArr);
                                    r0 = g050Var2;
                                    Location a22 = this.c.a();
                                    if (!((Boolean) ((jbh) this.f.a).f(SimplePersistentBooleanExperiment.SETUP_INITIAL_GEO_LOCATION).c()).booleanValue()) {
                                    }
                                    eci0Var = kotlinx.coroutines.flow.e.O(new jqr(ru.yandex.taxi.preorder.source.userposition.misc.a.b(c, a22), new LocationRepositoryAndroidApiImpl$requestLocationUpdates$2$1$2(this, null), 3), this.h, wsr0.a(xsr0.a, 3), 0);
                                    this.i = eci0Var;
                                    aVar = r0;
                                    aVar.d(null);
                                    return eci0Var;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                r0 = g050Var;
                                r0.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) locationRepositoryAndroidApiImpl$requestLocationUpdates$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    eci0Var = this.i;
                    if (eci0Var == null) {
                        ru.yandex.taxi.location.lbs.b bVar = this.g;
                        locationRepositoryAndroidApiImpl$requestLocationUpdates$1.L$0 = aVar;
                        locationRepositoryAndroidApiImpl$requestLocationUpdates$1.L$1 = null;
                        locationRepositoryAndroidApiImpl$requestLocationUpdates$1.label = 2;
                        Object e = bVar.e(locationRepositoryAndroidApiImpl$requestLocationUpdates$1);
                        if (e != coroutineSingletons) {
                            g050Var = aVar;
                            obj = e;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    aVar.d(null);
                    return eci0Var;
                }
            }
            eci0Var = this.i;
            if (eci0Var == null) {
            }
            aVar.d(null);
            return eci0Var;
        } catch (Throwable th3) {
            th = th3;
            r0 = aVar;
            r0.d(null);
            throw th;
        }
        locationRepositoryAndroidApiImpl$requestLocationUpdates$1 = new LocationRepositoryAndroidApiImpl$requestLocationUpdates$1(this, continuationImpl);
        Object obj2 = locationRepositoryAndroidApiImpl$requestLocationUpdates$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationRepositoryAndroidApiImpl$requestLocationUpdates$1.label;
        int i32 = 1;
        if (i != 0) {
        }
    }

    @Override // defpackage.hcz
    public final Object b(ContinuationImpl continuationImpl) {
        Location a = this.c.a();
        if (a != null) {
            return a;
        }
        throw new LocationRepository$LocationUnknownException();
    }

    public final synchronized kotlinx.coroutines.flow.b c(boolean z, boolean z2) {
        return kotlinx.coroutines.flow.e.g(new LocationRepositoryAndroidApiImpl$locationUpdatesFromProviders$1(z, this, z2, null));
    }
}
