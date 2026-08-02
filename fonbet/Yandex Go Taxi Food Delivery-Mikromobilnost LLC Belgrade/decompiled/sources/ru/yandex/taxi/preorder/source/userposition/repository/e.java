package ru.yandex.taxi.preorder.source.userposition.repository;

import android.location.Location;
import com.google.android.gms.common.api.ApiException;
import defpackage.ai4;
import defpackage.bvf0;
import defpackage.dqs;
import defpackage.eci0;
import defpackage.fqs;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hcz;
import defpackage.hsx;
import defpackage.ike;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.qfr0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tpr;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.yow;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class e implements hcz {
    public final dqs a;
    public final ru.yandex.taxi.location.g b;
    public final ai4 c;
    public final hsx d;
    public final qfr0 e;
    public final ru.yandex.taxi.location.lbs.b f;
    public final ike g = bvf0.b();
    public final LinkedHashMap h = new LinkedHashMap();
    public final kotlinx.coroutines.sync.a i = gtq0.a();

    public e(dqs dqsVar, ru.yandex.taxi.location.g gVar, ai4 ai4Var, hsx hsxVar, qfr0 qfr0Var, ru.yandex.taxi.location.lbs.b bVar) {
        this.a = dqsVar;
        this.b = gVar;
        this.c = ai4Var;
        this.d = hsxVar;
        this.e = qfr0Var;
        this.f = bVar;
    }

    public static /* synthetic */ Object d(e eVar, tls tlsVar, yow yowVar, ContinuationImpl continuationImpl, int i) {
        if ((i & 1) != 0) {
            tlsVar = null;
        }
        if ((i & 2) != 0) {
            yowVar = null;
        }
        return eVar.c(tlsVar, yowVar, fqs.a, continuationImpl);
    }

    @Override // defpackage.hcz
    public final Object a(ContinuationImpl continuationImpl) {
        return d(this, null, null, continuationImpl, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[Catch: all -> 0x0051, CancellationException -> 0x0068, TryCatch #2 {CancellationException -> 0x0068, all -> 0x0051, blocks: (B:10:0x0023, B:11:0x003c, B:13:0x0040, B:16:0x004b, B:17:0x0050, B:21:0x0031), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[Catch: all -> 0x0051, CancellationException -> 0x0068, TryCatch #2 {CancellationException -> 0x0068, all -> 0x0051, blocks: (B:10:0x0023, B:11:0x003c, B:13:0x0040, B:16:0x004b, B:17:0x0050, B:21:0x0031), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.hcz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        LocationRepositoryFusedApiImpl$getLocationImmediately$1 locationRepositoryFusedApiImpl$getLocationImmediately$1;
        int i;
        Location location;
        try {
            if (continuationImpl instanceof LocationRepositoryFusedApiImpl$getLocationImmediately$1) {
                locationRepositoryFusedApiImpl$getLocationImmediately$1 = (LocationRepositoryFusedApiImpl$getLocationImmediately$1) continuationImpl;
                int i2 = locationRepositoryFusedApiImpl$getLocationImmediately$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    locationRepositoryFusedApiImpl$getLocationImmediately$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = locationRepositoryFusedApiImpl$getLocationImmediately$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = locationRepositoryFusedApiImpl$getLocationImmediately$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        dqs dqsVar = this.a;
                        locationRepositoryFusedApiImpl$getLocationImmediately$1.label = 1;
                        obj = dqsVar.a(locationRepositoryFusedApiImpl$getLocationImmediately$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    location = (Location) obj;
                    if (location != null) {
                        throw new LocationRepository$LocationUnknownException();
                    }
                    this.c.a("FuseLocation::getLocationImmediately", new Object[0]);
                    return location;
                }
            }
            if (i != 0) {
            }
            location = (Location) obj;
            if (location != null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if ((th instanceof ApiException) && th.b() == 17) {
                throw new LocationRepository$LocationUnknownException(th);
            }
            throw th;
        }
        locationRepositoryFusedApiImpl$getLocationImmediately$1 = new LocationRepositoryFusedApiImpl$getLocationImmediately$1(this, continuationImpl);
        Object obj2 = locationRepositoryFusedApiImpl$getLocationImmediately$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationRepositoryFusedApiImpl$getLocationImmediately$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cc, code lost:
    
        if (r15.a(r0) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff A[Catch: all -> 0x005a, TRY_ENTER, TryCatch #1 {all -> 0x005a, blocks: (B:13:0x0055, B:14:0x0132, B:15:0x0139, B:18:0x014d, B:28:0x0080, B:30:0x00f5, B:33:0x00ff, B:34:0x0104), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104 A[Catch: all -> 0x005a, TryCatch #1 {all -> 0x005a, blocks: (B:13:0x0055, B:14:0x0132, B:15:0x0139, B:18:0x014d, B:28:0x0080, B:30:0x00f5, B:33:0x00ff, B:34:0x0104), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[Catch: all -> 0x0170, TRY_LEAVE, TryCatch #0 {all -> 0x0170, blocks: (B:40:0x00cf, B:42:0x00da), top: B:39:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v18, types: [g050] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [fqs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(tls tlsVar, sls slsVar, fqs fqsVar, ContinuationImpl continuationImpl) {
        LocationRepositoryFusedApiImpl$internalRequestLocationUpdates$1 locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        fqs fqsVar2;
        tpr tprVar;
        fqs fqsVar3;
        Object obj;
        sls slsVar2;
        boolean booleanValue;
        tpr[] tprVarArr;
        sls slsVar3;
        ?? r12;
        tpr b;
        Object obj2;
        try {
            try {
                if (continuationImpl instanceof LocationRepositoryFusedApiImpl$internalRequestLocationUpdates$1) {
                    locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1 = (LocationRepositoryFusedApiImpl$internalRequestLocationUpdates$1) continuationImpl;
                    int i2 = locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.label = i2 - Integer.MIN_VALUE;
                        Object obj3 = locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.label;
                        LinkedHashMap linkedHashMap = this.h;
                        int i3 = 3;
                        int i4 = 1;
                        if (i != 0) {
                            kotlin.b.b(obj3);
                            if (tlsVar == null) {
                                tlsVar = new LocationRepositoryFusedApiImpl$internalRequestLocationUpdates$disableLbsProviderExperiment$1(this, null);
                            }
                            if (slsVar == null) {
                                slsVar = new yow(23, this);
                            }
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$0 = null;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$1 = null;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$2 = fqsVar;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$3 = tlsVar;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$4 = slsVar;
                            aVar = this.i;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$5 = aVar;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.label = 1;
                            fqsVar2 = fqsVar;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    i4 = locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.I$0;
                                    tpr[] tprVarArr2 = (tpr[]) locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$8;
                                    tprVarArr = (tpr[]) locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$7;
                                    Object obj4 = (g050) locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$5;
                                    slsVar3 = (sls) locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$4;
                                    fqsVar3 = (fqs) locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$2;
                                    kotlin.b.b(obj3);
                                    r12 = tprVarArr2;
                                    obj2 = obj4;
                                    r12[i4] = obj3;
                                    b = kotlinx.coroutines.flow.e.K(tprVarArr);
                                    slsVar2 = slsVar3;
                                    fqsVar = obj2;
                                    Location a = this.d.a();
                                    if (!((Boolean) slsVar2.invoke()).booleanValue()) {
                                        a = null;
                                    }
                                    eci0 O = kotlinx.coroutines.flow.e.O(new jqr(ru.yandex.taxi.preorder.source.userposition.misc.a.b(b, a), new LocationRepositoryFusedApiImpl$internalRequestLocationUpdates$2$1$2(this, null), i3), this.g, wsr0.a(xsr0.a, 3), 0);
                                    fqsVar3.getClass();
                                    linkedHashMap.put("default", O);
                                    tprVar = O;
                                    aVar = fqsVar;
                                    aVar.d(null);
                                    return tprVar;
                                }
                                Object obj5 = (g050) locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$5;
                                slsVar2 = (sls) locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$4;
                                fqs fqsVar4 = (fqs) locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$2;
                                kotlin.b.b(obj3);
                                fqsVar3 = fqsVar4;
                                obj = obj5;
                                booleanValue = ((Boolean) obj3).booleanValue();
                                dqs dqsVar = this.a;
                                if (!booleanValue) {
                                    b = dqsVar.b(fqsVar3);
                                    fqsVar = obj;
                                    Location a2 = this.d.a();
                                    if (!((Boolean) slsVar2.invoke()).booleanValue()) {
                                    }
                                    eci0 O2 = kotlinx.coroutines.flow.e.O(new jqr(ru.yandex.taxi.preorder.source.userposition.misc.a.b(b, a2), new LocationRepositoryFusedApiImpl$internalRequestLocationUpdates$2$1$2(this, null), i3), this.g, wsr0.a(xsr0.a, 3), 0);
                                    fqsVar3.getClass();
                                    linkedHashMap.put("default", O2);
                                    tprVar = O2;
                                    aVar = fqsVar;
                                    aVar.d(null);
                                    return tprVar;
                                }
                                tprVarArr = new tpr[2];
                                tprVarArr[0] = dqsVar.b(fqsVar3);
                                ru.yandex.taxi.location.g gVar = this.b;
                                locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$0 = null;
                                locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$1 = null;
                                locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$2 = fqsVar3;
                                locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$3 = null;
                                locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$4 = slsVar2;
                                locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$5 = obj;
                                locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$6 = null;
                                locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$7 = tprVarArr;
                                locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$8 = tprVarArr;
                                locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.I$0 = 1;
                                locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.label = 3;
                                gVar.getClass();
                                obj3 = ru.yandex.taxi.location.g.b(gVar, "LocationRepositoryFusedApiImpl", locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1);
                                if (obj3 != coroutineSingletons) {
                                    slsVar3 = slsVar2;
                                    r12 = tprVarArr;
                                    obj2 = obj;
                                    r12[i4] = obj3;
                                    b = kotlinx.coroutines.flow.e.K(tprVarArr);
                                    slsVar2 = slsVar3;
                                    fqsVar = obj2;
                                    Location a22 = this.d.a();
                                    if (!((Boolean) slsVar2.invoke()).booleanValue()) {
                                    }
                                    eci0 O22 = kotlinx.coroutines.flow.e.O(new jqr(ru.yandex.taxi.preorder.source.userposition.misc.a.b(b, a22), new LocationRepositoryFusedApiImpl$internalRequestLocationUpdates$2$1$2(this, null), i3), this.g, wsr0.a(xsr0.a, 3), 0);
                                    fqsVar3.getClass();
                                    linkedHashMap.put("default", O22);
                                    tprVar = O22;
                                    aVar = fqsVar;
                                    aVar.d(null);
                                    return tprVar;
                                }
                                return coroutineSingletons;
                            }
                            ?? r122 = (g050) locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$5;
                            slsVar = (sls) locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$4;
                            tls tlsVar2 = (tls) locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$3;
                            fqs fqsVar5 = (fqs) locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$2;
                            kotlin.b.b(obj3);
                            aVar = r122;
                            tlsVar = tlsVar2;
                            fqsVar2 = fqsVar5;
                        }
                        fqsVar2.getClass();
                        tprVar = (tpr) linkedHashMap.get("default");
                        if (tprVar == null) {
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$0 = null;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$1 = null;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$2 = fqsVar2;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$3 = null;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$4 = slsVar;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$5 = aVar;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.L$6 = null;
                            locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.label = 2;
                            Object invoke = tlsVar.invoke(locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1);
                            if (invoke != coroutineSingletons) {
                                fqsVar3 = fqsVar2;
                                obj = aVar;
                                obj3 = invoke;
                                slsVar2 = slsVar;
                                booleanValue = ((Boolean) obj3).booleanValue();
                                dqs dqsVar2 = this.a;
                                if (!booleanValue) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        aVar.d(null);
                        return tprVar;
                    }
                }
                fqsVar2.getClass();
                tprVar = (tpr) linkedHashMap.get("default");
                if (tprVar == null) {
                }
                aVar.d(null);
                return tprVar;
            } catch (Throwable th) {
                th = th;
                fqsVar = aVar;
                fqsVar.d(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1 = new LocationRepositoryFusedApiImpl$internalRequestLocationUpdates$1(this, continuationImpl);
        Object obj32 = locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationRepositoryFusedApiImpl$internalRequestLocationUpdates$1.label;
        LinkedHashMap linkedHashMap2 = this.h;
        int i32 = 3;
        int i42 = 1;
    }
}
