package ru.yandex.taxi.analytics;

import defpackage.g050;
import defpackage.g8y;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.jbh;
import defpackage.m0t;
import defpackage.n0t;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.pcz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.a;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

/* loaded from: classes9.dex */
public final class o {
    public final n0t a;
    public final h3y b;
    public final ru.yandex.taxi.perf.b c;
    public final a d = gtq0.a();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public boolean g;
    public boolean h;

    public o(n0t n0tVar, h3y h3yVar, ru.yandex.taxi.perf.b bVar) {
        this.a = n0tVar;
        this.b = h3yVar;
        this.c = bVar;
    }

    public final n a() {
        return (n) this.b.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
    
        if (r1 != r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0077, code lost:
    
        if (r4 == r3) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, ContinuationImpl continuationImpl) {
        GeoProvidersAnalyticsImpl$onCoordProvidersPrepared$1 geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1;
        int i;
        ArrayList arrayList2;
        Object b;
        g050 g050Var;
        List list;
        boolean contains;
        boolean contains2;
        o oVar = this;
        if (continuationImpl instanceof GeoProvidersAnalyticsImpl$onCoordProvidersPrepared$1) {
            geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1 = (GeoProvidersAnalyticsImpl$onCoordProvidersPrepared$1) continuationImpl;
            int i2 = geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    arrayList2 = arrayList;
                    geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.L$0 = arrayList2;
                    geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.label = 1;
                    b = ((jbh) oVar.a().d).f(SimplePersistentBooleanExperiment.SEND_GEO_PROVIDERS_ANALYTICS).b(geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1);
                } else if (i == 1) {
                    ?? r4 = (List) geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.L$0;
                    kotlin.b.b(obj);
                    b = obj;
                    arrayList2 = r4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oVar = (o) geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.L$1;
                        kotlin.b.b(obj);
                        m0t m0tVar = (m0t) obj;
                        oVar.getClass();
                        g8y c = m0tVar.c();
                        Map i3 = kotlin.collections.b.i(new Pair("hasEverBeenLaunched", Boolean.valueOf(c.b())), new Pair("hasEverObtainedCellOrWifiNetworks", Boolean.valueOf(c.c())), new Pair("hasEverSucceededLbsRequest", Boolean.valueOf(c.e())), new Pair("hasEverProducedLocation", Boolean.valueOf(c.d())), new Pair("currentSubscribers", c.a()), new Pair("hasLastLocation", Boolean.valueOf(c.f())), new Pair("hasLocationInWarmUpRepository", Boolean.valueOf(c.g())));
                        pcz d = m0tVar.d();
                        Map i4 = kotlin.collections.b.i(new Pair("isInitializedNow", Boolean.valueOf(d.d())), new Pair("hasEverBeenInitialized", Boolean.valueOf(d.a())), new Pair("hasEverProducedLocation", Boolean.valueOf(d.b())), new Pair("hasLastLocation", Boolean.valueOf(d.c())));
                        Map d2 = oVar.c.d();
                        n0t n0tVar = oVar.a;
                        boolean a = m0tVar.a();
                        boolean b2 = m0tVar.b();
                        boolean f = m0tVar.f();
                        boolean e = m0tVar.e();
                        Object obj2 = d2.get("app_launch_type");
                        String str = obj2 instanceof String ? (String) obj2 : null;
                        Object obj3 = d2.get("timeSinceAppLaunch");
                        String str2 = obj3 instanceof String ? (String) obj3 : null;
                        Object obj4 = d2.get("time_since_app_launch_sec");
                        String str3 = obj4 instanceof String ? (String) obj4 : null;
                        n0tVar.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("lbsProviderState", i3);
                        hashMap.put("locationSdkState", i4);
                        oo31.q(a, hashMap, "hasCoarseLocationAccess", b2, "hasFineLocationAccess");
                        oo31.q(f, hashMap, "isEarlySubscriptionWorking", e, "wasAnalyticsExperimentEnabledAtStartup");
                        if (str != null) {
                            hashMap.put("app_launch_type", str);
                        }
                        if (str2 != null) {
                            hashMap.put("timeSinceAppLaunch", str2);
                        }
                        if (str3 != null) {
                            hashMap.put("time_since_app_launch_sec", str3);
                        }
                        n0tVar.a.a("GeoProvidersStateOnFsRequest", hashMap, 1, new HashMap());
                        return zy11Var;
                    }
                    g050Var = (g050) geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.L$1;
                    list = (List) geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.L$0;
                    kotlin.b.b(obj);
                    try {
                        contains = list.contains(CoordinateProvider$Source.LBS);
                        boolean z = oVar.g;
                        if (contains) {
                            if (z) {
                                oVar.g("OnLbsLocationMissingFromCoordProviders");
                            }
                        } else if (!z) {
                            oVar.g("OnFirstLbsLocationAddedToCoordProviders");
                            oVar.g = true;
                        }
                        contains2 = list.contains(CoordinateProvider$Source.RIDETECH_LOCATION_SDK);
                        boolean z2 = oVar.h;
                        if (contains2) {
                            if (z2) {
                                oVar.g("OnSdkLocationMissingFromCoordProviders");
                            }
                        } else if (!z2) {
                            oVar.g("OnFirstSdkLocationAddedToCoordProviders");
                            oVar.h = true;
                        }
                        g050Var.d(null);
                        n a2 = oVar.a();
                        geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.L$0 = null;
                        geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.L$1 = oVar;
                        geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.label = 3;
                        obj = a2.a(geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1);
                    } catch (Throwable th) {
                        g050Var.d(null);
                        throw th;
                    }
                }
                if (((Boolean) b).booleanValue()) {
                    return zy11Var;
                }
                geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.L$0 = arrayList2;
                g050Var = oVar.d;
                geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.L$1 = g050Var;
                geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.label = 2;
                if (g050Var.a(geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1) != coroutineSingletons) {
                    list = arrayList2;
                    contains = list.contains(CoordinateProvider$Source.LBS);
                    boolean z3 = oVar.g;
                    if (contains) {
                    }
                    contains2 = list.contains(CoordinateProvider$Source.RIDETECH_LOCATION_SDK);
                    boolean z22 = oVar.h;
                    if (contains2) {
                    }
                    g050Var.d(null);
                    n a22 = oVar.a();
                    geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.L$0 = null;
                    geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.L$1 = oVar;
                    geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.label = 3;
                    obj = a22.a(geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1);
                }
                return coroutineSingletons;
            }
        }
        geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1 = new GeoProvidersAnalyticsImpl$onCoordProvidersPrepared$1(oVar, continuationImpl);
        Object obj5 = geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoProvidersAnalyticsImpl$onCoordProvidersPrepared$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((Boolean) b).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        GeoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1 geoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof GeoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1) {
            geoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1 = (GeoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1) continuationImpl;
            int i2 = geoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a().j.set(true);
                    geoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1.label = 1;
                    obj = ((jbh) a().d).f(SimplePersistentBooleanExperiment.SEND_GEO_PROVIDERS_ANALYTICS).b(geoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1);
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
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (booleanValue && !this.e.getAndSet(true)) {
                    g("OnFirstLbsLocationProduced");
                }
                return zy11Var;
            }
        }
        geoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1 = new GeoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1(this, continuationImpl);
        Object obj2 = geoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoProvidersAnalyticsImpl$onFirstLbsLocationProduced$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (booleanValue) {
            g("OnFirstLbsLocationProduced");
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        GeoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1 geoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof GeoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1) {
            geoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1 = (GeoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1) continuationImpl;
            int i2 = geoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a().o.set(true);
                    geoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1.label = 1;
                    obj = ((jbh) a().d).f(SimplePersistentBooleanExperiment.SEND_GEO_PROVIDERS_ANALYTICS).b(geoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1);
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
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (booleanValue && !this.f.getAndSet(true)) {
                    g("OnFirstSdkLocationProduced");
                }
                return zy11Var;
            }
        }
        geoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1 = new GeoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1(this, continuationImpl);
        Object obj2 = geoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoProvidersAnalyticsImpl$onFirstSdkLocationProduced$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (booleanValue) {
            g("OnFirstSdkLocationProduced");
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        GeoProvidersAnalyticsImpl$onLbsSubscriberAdded$1 geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof GeoProvidersAnalyticsImpl$onLbsSubscriberAdded$1) {
            geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1 = (GeoProvidersAnalyticsImpl$onLbsSubscriberAdded$1) continuationImpl;
            int i2 = geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n a = a();
                    a.g.set(true);
                    a.k.add(str);
                    geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1.L$0 = str;
                    geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1.label = 1;
                    obj = ((jbh) a().d).f(SimplePersistentBooleanExperiment.SEND_GEO_PROVIDERS_ANALYTICS).b(geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (booleanValue) {
                    return zy11Var;
                }
                Map d = this.c.d();
                Object obj2 = d.get("app_launch_type");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                Object obj3 = d.get("timeSinceAppLaunch");
                String str3 = obj3 instanceof String ? (String) obj3 : null;
                Object obj4 = d.get("time_since_app_launch_sec");
                String str4 = obj4 instanceof String ? (String) obj4 : null;
                n0t n0tVar = this.a;
                n0tVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("subscriber", str);
                if (str2 != null) {
                    hashMap.put("app_launch_type", str2);
                }
                if (str3 != null) {
                    hashMap.put("timeSinceAppLaunch", str3);
                }
                if (str4 != null) {
                    hashMap.put("time_since_app_launch_sec", str4);
                }
                n0tVar.a.a("OnLbsSubscriberAdded", hashMap, 1, new HashMap());
                return zy11Var;
            }
        }
        geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1 = new GeoProvidersAnalyticsImpl$onLbsSubscriberAdded$1(this, continuationImpl);
        Object obj5 = geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoProvidersAnalyticsImpl$onLbsSubscriberAdded$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj5).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (booleanValue) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, Throwable th, ContinuationImpl continuationImpl) {
        GeoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1 geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1;
        int i;
        boolean booleanValue;
        Throwable cause;
        if (continuationImpl instanceof GeoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1) {
            geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1 = (GeoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1) continuationImpl;
            int i2 = geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a().k.remove(str);
                    geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1.L$0 = str;
                    geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1.L$1 = th;
                    geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1.label = 1;
                    obj = ((jbh) a().d).f(SimplePersistentBooleanExperiment.SEND_GEO_PROVIDERS_ANALYTICS).b(geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1.L$1;
                    str = (String) geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (booleanValue) {
                    return zy11Var;
                }
                Throwable th2 = th instanceof CancellationException ? th : null;
                if (th2 != null && (cause = th2.getCause()) != null) {
                    th = cause;
                }
                Map d = this.c.d();
                String valueOf = String.valueOf(th);
                Object obj2 = d.get("app_launch_type");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                Object obj3 = d.get("timeSinceAppLaunch");
                String str3 = obj3 instanceof String ? (String) obj3 : null;
                Object obj4 = d.get("time_since_app_launch_sec");
                String str4 = obj4 instanceof String ? (String) obj4 : null;
                n0t n0tVar = this.a;
                n0tVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("subscriber", str);
                hashMap.put("subscriberError", valueOf);
                if (str2 != null) {
                    hashMap.put("app_launch_type", str2);
                }
                if (str3 != null) {
                    hashMap.put("timeSinceAppLaunch", str3);
                }
                if (str4 != null) {
                    hashMap.put("time_since_app_launch_sec", str4);
                }
                n0tVar.a.a("OnLbsSubscriberRemoved", hashMap, 1, new HashMap());
                return zy11Var;
            }
        }
        geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1 = new GeoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1(this, continuationImpl);
        Object obj5 = geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoProvidersAnalyticsImpl$onLbsSubscriberRemoved$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj5).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (booleanValue) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void g(String str) {
        Map d = this.c.d();
        Object obj = d.get("app_launch_type");
        String str2 = obj instanceof String ? (String) obj : null;
        Object obj2 = d.get("timeSinceAppLaunch");
        String str3 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = d.get("time_since_app_launch_sec");
        String str4 = obj3 instanceof String ? (String) obj3 : null;
        int hashCode = str.hashCode();
        n0t n0tVar = this.a;
        switch (hashCode) {
            case -1909455126:
                if (str.equals("OnFirstSdkLocationAddedToCoordProviders")) {
                    n0tVar.getClass();
                    HashMap hashMap = new HashMap();
                    if (str2 != null) {
                        hashMap.put("app_launch_type", str2);
                    }
                    if (str3 != null) {
                        hashMap.put("timeSinceAppLaunch", str3);
                    }
                    if (str4 != null) {
                        hashMap.put("time_since_app_launch_sec", str4);
                    }
                    n0tVar.a.a("OnFirstSdkLocationAddedToCoordProviders", hashMap, 1, new HashMap());
                    break;
                }
                break;
            case -1334700985:
                if (str.equals("OnFirstLbsLocationAddedToCoordProviders")) {
                    n0tVar.getClass();
                    HashMap hashMap2 = new HashMap();
                    if (str2 != null) {
                        hashMap2.put("app_launch_type", str2);
                    }
                    if (str3 != null) {
                        hashMap2.put("timeSinceAppLaunch", str3);
                    }
                    if (str4 != null) {
                        hashMap2.put("time_since_app_launch_sec", str4);
                    }
                    n0tVar.a.a("OnFirstLbsLocationAddedToCoordProviders", hashMap2, 1, new HashMap());
                    break;
                }
                break;
            case -1270440534:
                if (str.equals("OnLbsLocationMissingFromCoordProviders")) {
                    n0tVar.getClass();
                    HashMap hashMap3 = new HashMap();
                    if (str2 != null) {
                        hashMap3.put("app_launch_type", str2);
                    }
                    if (str3 != null) {
                        hashMap3.put("timeSinceAppLaunch", str3);
                    }
                    if (str4 != null) {
                        hashMap3.put("time_since_app_launch_sec", str4);
                    }
                    n0tVar.a.a("OnLbsLocationMissingFromCoordProviders", hashMap3, 1, new HashMap());
                    break;
                }
                break;
            case -961247539:
                if (str.equals("OnSdkLocationMissingFromCoordProviders")) {
                    n0tVar.getClass();
                    HashMap hashMap4 = new HashMap();
                    if (str2 != null) {
                        hashMap4.put("app_launch_type", str2);
                    }
                    if (str3 != null) {
                        hashMap4.put("timeSinceAppLaunch", str3);
                    }
                    if (str4 != null) {
                        hashMap4.put("time_since_app_launch_sec", str4);
                    }
                    n0tVar.a.a("OnSdkLocationMissingFromCoordProviders", hashMap4, 1, new HashMap());
                    break;
                }
                break;
            case 114725634:
                if (str.equals("OnFirstSdkLocationProduced")) {
                    n0tVar.getClass();
                    HashMap hashMap5 = new HashMap();
                    if (str2 != null) {
                        hashMap5.put("app_launch_type", str2);
                    }
                    if (str3 != null) {
                        hashMap5.put("timeSinceAppLaunch", str3);
                    }
                    if (str4 != null) {
                        hashMap5.put("time_since_app_launch_sec", str4);
                    }
                    n0tVar.a.a("OnFirstSdkLocationProduced", hashMap5, 1, new HashMap());
                    break;
                }
                break;
            case 1666781829:
                if (str.equals("OnFirstLbsLocationProduced")) {
                    n0tVar.getClass();
                    HashMap hashMap6 = new HashMap();
                    if (str2 != null) {
                        hashMap6.put("app_launch_type", str2);
                    }
                    if (str3 != null) {
                        hashMap6.put("timeSinceAppLaunch", str3);
                    }
                    if (str4 != null) {
                        hashMap6.put("time_since_app_launch_sec", str4);
                    }
                    n0tVar.a.a("OnFirstLbsLocationProduced", hashMap6, 1, new HashMap());
                    break;
                }
                break;
        }
    }
}
