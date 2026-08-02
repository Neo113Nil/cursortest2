package ru.yandex.taxi.preorder.source.userposition;

import android.location.Location;
import defpackage.acz;
import defpackage.ap21;
import defpackage.bp21;
import defpackage.c34;
import defpackage.ccz;
import defpackage.cp21;
import defpackage.dp21;
import defpackage.hcz;
import defpackage.hit;
import defpackage.jqr;
import defpackage.lo21;
import defpackage.mdh;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zo21;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.repository.LocationRepository$LocationUnknownException;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes9.dex */
public final class e implements po21 {
    public final acz a;
    public final hit b;
    public final ru.yandex.taxi.location.zerokm.a c;
    public final ru.yandex.taxi.preorder.source.userposition.repository.a d;
    public final ru.yandex.taxi.preorder.source.userposition.repository.d e;
    public final n f;
    public final ru.yandex.taxi.main.map.autoupdatelocationthrottle.e g;
    public final c34 h;
    public final ccz i;
    public final tt2 j;
    public pzt0 k;

    public e(acz aczVar, hit hitVar, ru.yandex.taxi.location.zerokm.a aVar, ru.yandex.taxi.preorder.source.userposition.repository.a aVar2, ru.yandex.taxi.preorder.source.userposition.repository.d dVar, n nVar, ru.yandex.taxi.main.map.autoupdatelocationthrottle.e eVar, c34 c34Var, ccz cczVar, tt2 tt2Var) {
        this.a = aczVar;
        this.b = hitVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = dVar;
        this.f = nVar;
        this.g = eVar;
        this.h = c34Var;
        this.i = cczVar;
        this.j = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, ContinuationImpl continuationImpl) {
        UserLocationInteractorImpl$disabledLocationFallback$1 userLocationInteractorImpl$disabledLocationFallback$1;
        int i;
        Location location;
        eVar.getClass();
        if (continuationImpl instanceof UserLocationInteractorImpl$disabledLocationFallback$1) {
            userLocationInteractorImpl$disabledLocationFallback$1 = (UserLocationInteractorImpl$disabledLocationFallback$1) continuationImpl;
            int i2 = userLocationInteractorImpl$disabledLocationFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userLocationInteractorImpl$disabledLocationFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userLocationInteractorImpl$disabledLocationFallback$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userLocationInteractorImpl$disabledLocationFallback$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    eVar.i.getClass();
                    ru.yandex.taxi.preorder.source.userposition.repository.a aVar = eVar.d;
                    userLocationInteractorImpl$disabledLocationFallback$1.label = 1;
                    obj = aVar.d(userLocationInteractorImpl$disabledLocationFallback$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                location = (Location) obj;
                if (location == null) {
                    return k(location);
                }
                userLocationInteractorImpl$disabledLocationFallback$1.label = 2;
                Object i3 = eVar.i(userLocationInteractorImpl$disabledLocationFallback$1);
                return i3 == obj2 ? obj2 : i3;
            }
        }
        userLocationInteractorImpl$disabledLocationFallback$1 = new UserLocationInteractorImpl$disabledLocationFallback$1(eVar, continuationImpl);
        Object obj3 = userLocationInteractorImpl$disabledLocationFallback$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationInteractorImpl$disabledLocationFallback$1.label;
        if (i != 0) {
        }
        location = (Location) obj3;
        if (location == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons b(e eVar, ContinuationImpl continuationImpl) {
        UserLocationInteractorImpl$noLocationPermissionFallback$1 userLocationInteractorImpl$noLocationPermissionFallback$1;
        int i;
        Location location;
        LocationRequirementsException locationRequirementsException;
        LocationRequirementsException locationRequirementsException2;
        eVar.getClass();
        if (continuationImpl instanceof UserLocationInteractorImpl$noLocationPermissionFallback$1) {
            userLocationInteractorImpl$noLocationPermissionFallback$1 = (UserLocationInteractorImpl$noLocationPermissionFallback$1) continuationImpl;
            int i2 = userLocationInteractorImpl$noLocationPermissionFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userLocationInteractorImpl$noLocationPermissionFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userLocationInteractorImpl$noLocationPermissionFallback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userLocationInteractorImpl$noLocationPermissionFallback$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    eVar.i.getClass();
                    ru.yandex.taxi.preorder.source.userposition.repository.a aVar = eVar.d;
                    userLocationInteractorImpl$noLocationPermissionFallback$1.label = 1;
                    obj = aVar.d(userLocationInteractorImpl$noLocationPermissionFallback$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        locationRequirementsException = (LocationRequirementsException) userLocationInteractorImpl$noLocationPermissionFallback$1.L$4;
                        locationRequirementsException2 = (LocationRequirementsException) userLocationInteractorImpl$noLocationPermissionFallback$1.L$2;
                        kotlin.b.b(obj);
                        locationRequirementsException.setFallbackUserLocation((mo21) obj);
                        throw locationRequirementsException2;
                    }
                    kotlin.b.b(obj);
                }
                location = (Location) obj;
                LocationRequirementsException.Companion.getClass();
                LocationRequirementsException d = ru.yandex.taxi.systemrequeirements.location.e.d();
                if (location == null) {
                    d.setFallbackUserLocation(k(location));
                    throw d;
                }
                userLocationInteractorImpl$noLocationPermissionFallback$1.L$0 = null;
                userLocationInteractorImpl$noLocationPermissionFallback$1.L$1 = null;
                userLocationInteractorImpl$noLocationPermissionFallback$1.L$2 = d;
                userLocationInteractorImpl$noLocationPermissionFallback$1.L$3 = null;
                userLocationInteractorImpl$noLocationPermissionFallback$1.L$4 = d;
                userLocationInteractorImpl$noLocationPermissionFallback$1.label = 2;
                obj = eVar.i(userLocationInteractorImpl$noLocationPermissionFallback$1);
                if (obj != coroutineSingletons) {
                    locationRequirementsException = d;
                    locationRequirementsException2 = locationRequirementsException;
                    locationRequirementsException.setFallbackUserLocation((mo21) obj);
                    throw locationRequirementsException2;
                }
                return coroutineSingletons;
            }
        }
        userLocationInteractorImpl$noLocationPermissionFallback$1 = new UserLocationInteractorImpl$noLocationPermissionFallback$1(eVar, continuationImpl);
        Object obj2 = userLocationInteractorImpl$noLocationPermissionFallback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationInteractorImpl$noLocationPermissionFallback$1.label;
        if (i != 0) {
        }
        location = (Location) obj2;
        LocationRequirementsException.Companion.getClass();
        LocationRequirementsException d2 = ru.yandex.taxi.systemrequeirements.location.e.d();
        if (location == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(e eVar, ContinuationImpl continuationImpl) {
        UserLocationInteractorImpl$softFallback$1 userLocationInteractorImpl$softFallback$1;
        int i;
        Location location;
        eVar.getClass();
        if (continuationImpl instanceof UserLocationInteractorImpl$softFallback$1) {
            userLocationInteractorImpl$softFallback$1 = (UserLocationInteractorImpl$softFallback$1) continuationImpl;
            int i2 = userLocationInteractorImpl$softFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userLocationInteractorImpl$softFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userLocationInteractorImpl$softFallback$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userLocationInteractorImpl$softFallback$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.preorder.source.userposition.repository.a aVar = eVar.d;
                    userLocationInteractorImpl$softFallback$1.L$0 = null;
                    userLocationInteractorImpl$softFallback$1.label = 1;
                    obj = aVar.d(userLocationInteractorImpl$softFallback$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                location = (Location) obj;
                if (location == null) {
                    return k(location);
                }
                userLocationInteractorImpl$softFallback$1.L$0 = null;
                userLocationInteractorImpl$softFallback$1.L$1 = null;
                userLocationInteractorImpl$softFallback$1.label = 2;
                Object i3 = eVar.i(userLocationInteractorImpl$softFallback$1);
                return i3 == obj2 ? obj2 : i3;
            }
        }
        userLocationInteractorImpl$softFallback$1 = new UserLocationInteractorImpl$softFallback$1(eVar, continuationImpl);
        Object obj3 = userLocationInteractorImpl$softFallback$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationInteractorImpl$softFallback$1.label;
        if (i != 0) {
        }
        location = (Location) obj3;
        if (location == null) {
        }
    }

    public static mo21 k(Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        float accuracy = location.getAccuracy();
        long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
        long time = location.getTime();
        float speed = location.getSpeed();
        String provider = location.getProvider();
        if (provider == null) {
            provider = "none";
        }
        return new mo21(latitude, longitude, accuracy, 13.0f, elapsedRealtimeNanos, time, speed, provider, false, true);
    }

    public static mo21 l(Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        float accuracy = location.getAccuracy();
        long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
        long time = location.getTime();
        float speed = location.getSpeed();
        String provider = location.getProvider();
        if (provider == null) {
            provider = "none";
        }
        return new mo21(latitude, longitude, accuracy, 17.0f, elapsedRealtimeNanos, time, speed, provider, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        UserLocationInteractorImpl$ensureLocationRequirements$1 userLocationInteractorImpl$ensureLocationRequirements$1;
        int i;
        if (continuationImpl instanceof UserLocationInteractorImpl$ensureLocationRequirements$1) {
            userLocationInteractorImpl$ensureLocationRequirements$1 = (UserLocationInteractorImpl$ensureLocationRequirements$1) continuationImpl;
            int i2 = userLocationInteractorImpl$ensureLocationRequirements$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userLocationInteractorImpl$ensureLocationRequirements$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userLocationInteractorImpl$ensureLocationRequirements$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userLocationInteractorImpl$ensureLocationRequirements$1.label;
                n nVar = this.f;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userLocationInteractorImpl$ensureLocationRequirements$1.label = 1;
                    if (nVar.c.g() || (r6 = kotlinx.coroutines.flow.e.y(nVar.e, userLocationInteractorImpl$ensureLocationRequirements$1)) != obj2) {
                        Object obj3 = zy11.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                userLocationInteractorImpl$ensureLocationRequirements$1.label = 2;
                Object a = nVar.a(userLocationInteractorImpl$ensureLocationRequirements$1);
                return a != obj2 ? obj2 : a;
            }
        }
        userLocationInteractorImpl$ensureLocationRequirements$1 = new UserLocationInteractorImpl$ensureLocationRequirements$1(this, continuationImpl);
        Object obj4 = userLocationInteractorImpl$ensureLocationRequirements$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationInteractorImpl$ensureLocationRequirements$1.label;
        n nVar2 = this.f;
        if (i != 0) {
        }
        userLocationInteractorImpl$ensureLocationRequirements$1.label = 2;
        Object a2 = nVar2.a(userLocationInteractorImpl$ensureLocationRequirements$1);
        if (a2 != obj22) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(2:22|(2:24|(2:26|27))(2:28|29))|19|20))|40|6|7|(0)(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        if ((r8 instanceof ru.yandex.taxi.preorder.source.userposition.repository.LocationRepository$LocationUnknownException) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        r7 = kotlin.collections.a.J(r7, 1);
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 2;
        r8 = e(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        throw r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, ContinuationImpl continuationImpl) {
        UserLocationInteractorImpl$getFromRepositoryByPriority$1 userLocationInteractorImpl$getFromRepositoryByPriority$1;
        int i;
        if (continuationImpl instanceof UserLocationInteractorImpl$getFromRepositoryByPriority$1) {
            userLocationInteractorImpl$getFromRepositoryByPriority$1 = (UserLocationInteractorImpl$getFromRepositoryByPriority$1) continuationImpl;
            int i2 = userLocationInteractorImpl$getFromRepositoryByPriority$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userLocationInteractorImpl$getFromRepositoryByPriority$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userLocationInteractorImpl$getFromRepositoryByPriority$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userLocationInteractorImpl$getFromRepositoryByPriority$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (list.isEmpty()) {
                        ny61.g("No location repositories passed");
                        return null;
                    }
                    hcz hczVar = (hcz) kotlin.collections.a.P(list);
                    userLocationInteractorImpl$getFromRepositoryByPriority$1.L$0 = list;
                    userLocationInteractorImpl$getFromRepositoryByPriority$1.label = 1;
                    obj = hczVar.b(userLocationInteractorImpl$getFromRepositoryByPriority$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (Location) obj;
                    }
                    list = (List) userLocationInteractorImpl$getFromRepositoryByPriority$1.L$0;
                    kotlin.b.b(obj);
                }
                return (Location) obj;
            }
        }
        userLocationInteractorImpl$getFromRepositoryByPriority$1 = new UserLocationInteractorImpl$getFromRepositoryByPriority$1(this, continuationImpl);
        Object obj3 = userLocationInteractorImpl$getFromRepositoryByPriority$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationInteractorImpl$getFromRepositoryByPriority$1.label;
        if (i != 0) {
        }
        return (Location) obj3;
    }

    public final Object f(Continuation continuation) {
        this.j.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new UserLocationInteractorImpl$getLocationImmediately$2(null, this), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        UserLocationInteractorImpl$getLocationImmediatelyWithFallback$1 userLocationInteractorImpl$getLocationImmediatelyWithFallback$1;
        int i;
        mo21 fallbackUserLocation;
        try {
            if (continuationImpl instanceof UserLocationInteractorImpl$getLocationImmediatelyWithFallback$1) {
                userLocationInteractorImpl$getLocationImmediatelyWithFallback$1 = (UserLocationInteractorImpl$getLocationImmediatelyWithFallback$1) continuationImpl;
                int i2 = userLocationInteractorImpl$getLocationImmediatelyWithFallback$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    userLocationInteractorImpl$getLocationImmediatelyWithFallback$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = userLocationInteractorImpl$getLocationImmediatelyWithFallback$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = userLocationInteractorImpl$getLocationImmediatelyWithFallback$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        userLocationInteractorImpl$getLocationImmediatelyWithFallback$1.label = 1;
                        obj = f(userLocationInteractorImpl$getLocationImmediatelyWithFallback$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (mo21) obj;
                }
            }
            if (i != 0) {
            }
            return (mo21) obj;
        } catch (Exception e) {
            LocationRequirementsException locationRequirementsException = e instanceof LocationRequirementsException ? (LocationRequirementsException) e : null;
            if (locationRequirementsException == null || (fallbackUserLocation = locationRequirementsException.getFallbackUserLocation()) == null) {
                throw e;
            }
            return fallbackUserLocation;
        }
        userLocationInteractorImpl$getLocationImmediatelyWithFallback$1 = new UserLocationInteractorImpl$getLocationImmediatelyWithFallback$1(this, continuationImpl);
        Object obj3 = userLocationInteractorImpl$getLocationImmediatelyWithFallback$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationInteractorImpl$getLocationImmediatelyWithFallback$1.label;
    }

    public final Object h(Continuation continuation) {
        this.j.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new UserLocationInteractorImpl$getLocationOrDefaultImmediately$2(null, this), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        UserLocationInteractorImpl$getZeroKmLocation$1 userLocationInteractorImpl$getZeroKmLocation$1;
        int i;
        lo21 lo21Var;
        String str;
        if (continuationImpl instanceof UserLocationInteractorImpl$getZeroKmLocation$1) {
            userLocationInteractorImpl$getZeroKmLocation$1 = (UserLocationInteractorImpl$getZeroKmLocation$1) continuationImpl;
            int i2 = userLocationInteractorImpl$getZeroKmLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userLocationInteractorImpl$getZeroKmLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userLocationInteractorImpl$getZeroKmLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userLocationInteractorImpl$getZeroKmLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lo21 lo21Var2 = mo21.k;
                    userLocationInteractorImpl$getZeroKmLocation$1.L$0 = lo21Var2;
                    userLocationInteractorImpl$getZeroKmLocation$1.label = 1;
                    Object d = this.c.d(userLocationInteractorImpl$getZeroKmLocation$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = d;
                    lo21Var = lo21Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lo21Var = (lo21) userLocationInteractorImpl$getZeroKmLocation$1.L$0;
                    kotlin.b.b(obj);
                }
                zzs zzsVar = (zzs) obj;
                lo21Var.getClass();
                double d2 = zzsVar.a;
                double d3 = zzsVar.b;
                float f = zzsVar.c;
                str = zzsVar.d;
                if (str == null) {
                    str = "none";
                }
                return new mo21(d2, d3, f, 13.0f, 0L, 0L, 0.0f, str, true, false);
            }
        }
        userLocationInteractorImpl$getZeroKmLocation$1 = new UserLocationInteractorImpl$getZeroKmLocation$1(this, continuationImpl);
        Object obj2 = userLocationInteractorImpl$getZeroKmLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationInteractorImpl$getZeroKmLocation$1.label;
        if (i != 0) {
        }
        zzs zzsVar2 = (zzs) obj2;
        lo21Var.getClass();
        double d22 = zzsVar2.a;
        double d32 = zzsVar2.b;
        float f2 = zzsVar2.c;
        str = zzsVar2.d;
        if (str == null) {
        }
        return new mo21(d22, d32, f2, 13.0f, 0L, 0L, 0.0f, str, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r8 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        UserLocationInteractorImpl$obtainAndCacheUserLocation$1 userLocationInteractorImpl$obtainAndCacheUserLocation$1;
        int i;
        e eVar;
        if (continuationImpl instanceof UserLocationInteractorImpl$obtainAndCacheUserLocation$1) {
            userLocationInteractorImpl$obtainAndCacheUserLocation$1 = (UserLocationInteractorImpl$obtainAndCacheUserLocation$1) continuationImpl;
            int i2 = userLocationInteractorImpl$obtainAndCacheUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userLocationInteractorImpl$obtainAndCacheUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userLocationInteractorImpl$obtainAndCacheUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userLocationInteractorImpl$obtainAndCacheUserLocation$1.label;
                ccz cczVar = this.i;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cczVar.getClass();
                    userLocationInteractorImpl$obtainAndCacheUserLocation$1.L$0 = this;
                    userLocationInteractorImpl$obtainAndCacheUserLocation$1.label = 1;
                    obj = this.e.b(userLocationInteractorImpl$obtainAndCacheUserLocation$1);
                    if (obj != coroutineSingletons) {
                        eVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    Location location = (Location) obj;
                    Objects.toString(location);
                    cczVar.getClass();
                    this.d.j(location);
                    return l(location);
                }
                eVar = (e) userLocationInteractorImpl$obtainAndCacheUserLocation$1.L$0;
                kotlin.b.b(obj);
                userLocationInteractorImpl$obtainAndCacheUserLocation$1.L$0 = null;
                userLocationInteractorImpl$obtainAndCacheUserLocation$1.label = 2;
                obj = eVar.e((List) obj, userLocationInteractorImpl$obtainAndCacheUserLocation$1);
            }
        }
        userLocationInteractorImpl$obtainAndCacheUserLocation$1 = new UserLocationInteractorImpl$obtainAndCacheUserLocation$1(this, continuationImpl);
        Object obj2 = userLocationInteractorImpl$obtainAndCacheUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationInteractorImpl$obtainAndCacheUserLocation$1.label;
        ccz cczVar2 = this.i;
        if (i != 0) {
        }
        userLocationInteractorImpl$obtainAndCacheUserLocation$1.L$0 = null;
        userLocationInteractorImpl$obtainAndCacheUserLocation$1.label = 2;
        obj2 = eVar.e((List) obj2, userLocationInteractorImpl$obtainAndCacheUserLocation$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ContinuationImpl continuationImpl) {
        UserLocationInteractorImpl$requestActualLocation$1 userLocationInteractorImpl$requestActualLocation$1;
        int i;
        try {
            if (continuationImpl instanceof UserLocationInteractorImpl$requestActualLocation$1) {
                userLocationInteractorImpl$requestActualLocation$1 = (UserLocationInteractorImpl$requestActualLocation$1) continuationImpl;
                int i2 = userLocationInteractorImpl$requestActualLocation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    userLocationInteractorImpl$requestActualLocation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = userLocationInteractorImpl$requestActualLocation$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = userLocationInteractorImpl$requestActualLocation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        n nVar = this.f;
                        if (nVar.b()) {
                            return ap21.a;
                        }
                        if (nVar.c()) {
                            return bp21.a;
                        }
                        userLocationInteractorImpl$requestActualLocation$1.label = 1;
                        obj = j(userLocationInteractorImpl$requestActualLocation$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return new cp21((mo21) obj);
                }
            }
            if (i != 0) {
            }
            return new cp21((mo21) obj);
        } catch (LocationRepository$LocationUnknownException unused) {
            return zo21.a;
        } catch (Exception e) {
            return new dp21(e);
        }
        userLocationInteractorImpl$requestActualLocation$1 = new UserLocationInteractorImpl$requestActualLocation$1(this, continuationImpl);
        Object obj3 = userLocationInteractorImpl$requestActualLocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationInteractorImpl$requestActualLocation$1.label;
    }

    public final jqr n() {
        int i = 3;
        return new jqr(new d(new jqr(kotlinx.coroutines.flow.e.B(new rol0(new UserLocationInteractorImpl$requestLocationUpdates$1(null, this)), new UserLocationInteractorImpl$requestLocationUpdates$$inlined$flatMapConcat$1(null, this)), new UserLocationInteractorImpl$requestLocationUpdates$3(null, this), i), this), new UserLocationInteractorImpl$requestLocationUpdates$5(null, this), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (d(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(ContinuationImpl continuationImpl) {
        UserLocationInteractorImpl$requestSingleUpdate$1 userLocationInteractorImpl$requestSingleUpdate$1;
        int i;
        if (continuationImpl instanceof UserLocationInteractorImpl$requestSingleUpdate$1) {
            userLocationInteractorImpl$requestSingleUpdate$1 = (UserLocationInteractorImpl$requestSingleUpdate$1) continuationImpl;
            int i2 = userLocationInteractorImpl$requestSingleUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userLocationInteractorImpl$requestSingleUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userLocationInteractorImpl$requestSingleUpdate$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userLocationInteractorImpl$requestSingleUpdate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userLocationInteractorImpl$requestSingleUpdate$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        this.a.b((mo21) obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                userLocationInteractorImpl$requestSingleUpdate$1.label = 2;
                obj = j(userLocationInteractorImpl$requestSingleUpdate$1);
            }
        }
        userLocationInteractorImpl$requestSingleUpdate$1 = new UserLocationInteractorImpl$requestSingleUpdate$1(this, continuationImpl);
        Object obj3 = userLocationInteractorImpl$requestSingleUpdate$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationInteractorImpl$requestSingleUpdate$1.label;
        if (i != 0) {
        }
        userLocationInteractorImpl$requestSingleUpdate$1.label = 2;
        obj3 = j(userLocationInteractorImpl$requestSingleUpdate$1);
    }
}
