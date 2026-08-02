package ru.yandex.taxi.preorder.source.userposition;

import android.location.Location;
import android.location.LocationManager;
import defpackage.adz;
import defpackage.bvf0;
import defpackage.d6z;
import defpackage.dqs;
import defpackage.h941;
import defpackage.j73;
import defpackage.k0b0;
import defpackage.ny61;
import defpackage.o9z;
import defpackage.oiy0;
import defpackage.s8o;
import defpackage.tcc;
import defpackage.tls;
import defpackage.yne;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.o;
import ru.yandex.taxi.location.dto.LbsResponse;
import ru.yandex.taxi.location.g;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

/* loaded from: classes9.dex */
public final class a {
    public final LocationManager a;
    public final g b;
    public final k0b0 c;
    public final ru.yandex.taxi.preorder.source.userposition.repository.b d;
    public final adz e;
    public final oiy0 f;
    public final h941 g;
    public final o h;

    public a(LocationManager locationManager, g gVar, k0b0 k0b0Var, ru.yandex.taxi.preorder.source.userposition.repository.b bVar, adz adzVar, oiy0 oiy0Var, h941 h941Var, o oVar) {
        this.a = locationManager;
        this.b = gVar;
        this.c = k0b0Var;
        this.d = bVar;
        this.e = adzVar;
        this.f = oiy0Var;
        this.g = h941Var;
        this.h = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        CoordinateProvidersFactory$createOrNull$1 coordinateProvidersFactory$createOrNull$1;
        Object obj;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof CoordinateProvidersFactory$createOrNull$1) {
            coordinateProvidersFactory$createOrNull$1 = (CoordinateProvidersFactory$createOrNull$1) continuationImpl;
            int i2 = coordinateProvidersFactory$createOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coordinateProvidersFactory$createOrNull$1.label = i2 - Integer.MIN_VALUE;
                obj = coordinateProvidersFactory$createOrNull$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coordinateProvidersFactory$createOrNull$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (aVar.c.b()) {
                        adz adzVar = aVar.e;
                        coordinateProvidersFactory$createOrNull$1.L$0 = str;
                        coordinateProvidersFactory$createOrNull$1.label = 1;
                        obj = ((com.yandex.go.g) adzVar).m();
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) coordinateProvidersFactory$createOrNull$1.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    return aVar.a.getLastKnownLocation(str);
                }
                return null;
            }
        }
        coordinateProvidersFactory$createOrNull$1 = new CoordinateProvidersFactory$createOrNull$1(aVar, continuationImpl);
        obj = coordinateProvidersFactory$createOrNull$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coordinateProvidersFactory$createOrNull$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, Continuation continuation) {
        CoordinateProvidersFactory$getLastKnownFusedLocation$1 coordinateProvidersFactory$getLastKnownFusedLocation$1;
        Object obj;
        int i;
        aVar.getClass();
        if (continuation instanceof CoordinateProvidersFactory$getLastKnownFusedLocation$1) {
            coordinateProvidersFactory$getLastKnownFusedLocation$1 = (CoordinateProvidersFactory$getLastKnownFusedLocation$1) continuation;
            int i2 = coordinateProvidersFactory$getLastKnownFusedLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coordinateProvidersFactory$getLastKnownFusedLocation$1.label = i2 - Integer.MIN_VALUE;
                obj = coordinateProvidersFactory$getLastKnownFusedLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coordinateProvidersFactory$getLastKnownFusedLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (aVar.c.b()) {
                        adz adzVar = aVar.e;
                        coordinateProvidersFactory$getLastKnownFusedLocation$1.label = 1;
                        obj = ((com.yandex.go.g) adzVar).m();
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    dqs dqsVar = (dqs) obj;
                    if (dqsVar != null) {
                        coordinateProvidersFactory$getLastKnownFusedLocation$1.label = 3;
                        Object a = dqsVar.a(coordinateProvidersFactory$getLastKnownFusedLocation$1);
                        return a == coroutineSingletons ? coroutineSingletons : a;
                    }
                    return null;
                }
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    ru.yandex.taxi.preorder.source.userposition.repository.b bVar = aVar.d;
                    coordinateProvidersFactory$getLastKnownFusedLocation$1.label = 2;
                    obj = bVar.a(coordinateProvidersFactory$getLastKnownFusedLocation$1);
                }
                return null;
            }
        }
        coordinateProvidersFactory$getLastKnownFusedLocation$1 = new CoordinateProvidersFactory$getLastKnownFusedLocation$1(aVar, continuation);
        obj = coordinateProvidersFactory$getLastKnownFusedLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coordinateProvidersFactory$getLastKnownFusedLocation$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, Continuation continuation) {
        CoordinateProvidersFactory$getLastKnownLbsGsmLocation$1 coordinateProvidersFactory$getLastKnownLbsGsmLocation$1;
        Object obj;
        int i;
        aVar.getClass();
        if (continuation instanceof CoordinateProvidersFactory$getLastKnownLbsGsmLocation$1) {
            coordinateProvidersFactory$getLastKnownLbsGsmLocation$1 = (CoordinateProvidersFactory$getLastKnownLbsGsmLocation$1) continuation;
            int i2 = coordinateProvidersFactory$getLastKnownLbsGsmLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coordinateProvidersFactory$getLastKnownLbsGsmLocation$1.label = i2 - Integer.MIN_VALUE;
                obj = coordinateProvidersFactory$getLastKnownLbsGsmLocation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coordinateProvidersFactory$getLastKnownLbsGsmLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    adz adzVar = aVar.e;
                    coordinateProvidersFactory$getLastKnownLbsGsmLocation$1.label = 1;
                    obj = ((com.yandex.go.g) adzVar).m();
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
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                return (Location) aVar.b.p.get(LbsResponse.Type.GSM);
            }
        }
        coordinateProvidersFactory$getLastKnownLbsGsmLocation$1 = new CoordinateProvidersFactory$getLastKnownLbsGsmLocation$1(aVar, continuation);
        obj = coordinateProvidersFactory$getLastKnownLbsGsmLocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coordinateProvidersFactory$getLastKnownLbsGsmLocation$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(a aVar, Continuation continuation) {
        CoordinateProvidersFactory$getLastKnownLbsIpLocation$1 coordinateProvidersFactory$getLastKnownLbsIpLocation$1;
        Object obj;
        int i;
        aVar.getClass();
        if (continuation instanceof CoordinateProvidersFactory$getLastKnownLbsIpLocation$1) {
            coordinateProvidersFactory$getLastKnownLbsIpLocation$1 = (CoordinateProvidersFactory$getLastKnownLbsIpLocation$1) continuation;
            int i2 = coordinateProvidersFactory$getLastKnownLbsIpLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coordinateProvidersFactory$getLastKnownLbsIpLocation$1.label = i2 - Integer.MIN_VALUE;
                obj = coordinateProvidersFactory$getLastKnownLbsIpLocation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coordinateProvidersFactory$getLastKnownLbsIpLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    adz adzVar = aVar.e;
                    coordinateProvidersFactory$getLastKnownLbsIpLocation$1.label = 1;
                    obj = ((com.yandex.go.g) adzVar).m();
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
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                return (Location) aVar.b.p.get(LbsResponse.Type.IP);
            }
        }
        coordinateProvidersFactory$getLastKnownLbsIpLocation$1 = new CoordinateProvidersFactory$getLastKnownLbsIpLocation$1(aVar, continuation);
        obj = coordinateProvidersFactory$getLastKnownLbsIpLocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coordinateProvidersFactory$getLastKnownLbsIpLocation$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(a aVar, Continuation continuation) {
        CoordinateProvidersFactory$getLastKnownLbsWifiLocation$1 coordinateProvidersFactory$getLastKnownLbsWifiLocation$1;
        Object obj;
        int i;
        aVar.getClass();
        if (continuation instanceof CoordinateProvidersFactory$getLastKnownLbsWifiLocation$1) {
            coordinateProvidersFactory$getLastKnownLbsWifiLocation$1 = (CoordinateProvidersFactory$getLastKnownLbsWifiLocation$1) continuation;
            int i2 = coordinateProvidersFactory$getLastKnownLbsWifiLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coordinateProvidersFactory$getLastKnownLbsWifiLocation$1.label = i2 - Integer.MIN_VALUE;
                obj = coordinateProvidersFactory$getLastKnownLbsWifiLocation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coordinateProvidersFactory$getLastKnownLbsWifiLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    adz adzVar = aVar.e;
                    coordinateProvidersFactory$getLastKnownLbsWifiLocation$1.label = 1;
                    obj = ((com.yandex.go.g) adzVar).m();
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
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                return (Location) aVar.b.p.get(LbsResponse.Type.WIFI);
            }
        }
        coordinateProvidersFactory$getLastKnownLbsWifiLocation$1 = new CoordinateProvidersFactory$getLastKnownLbsWifiLocation$1(aVar, continuation);
        obj = coordinateProvidersFactory$getLastKnownLbsWifiLocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coordinateProvidersFactory$getLastKnownLbsWifiLocation$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(a aVar, Continuation continuation) {
        CoordinateProvidersFactory$getLastKnownMapkitLocation$1 coordinateProvidersFactory$getLastKnownMapkitLocation$1;
        Object obj;
        int i;
        aVar.getClass();
        if (continuation instanceof CoordinateProvidersFactory$getLastKnownMapkitLocation$1) {
            coordinateProvidersFactory$getLastKnownMapkitLocation$1 = (CoordinateProvidersFactory$getLastKnownMapkitLocation$1) continuation;
            int i2 = coordinateProvidersFactory$getLastKnownMapkitLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coordinateProvidersFactory$getLastKnownMapkitLocation$1.label = i2 - Integer.MIN_VALUE;
                obj = coordinateProvidersFactory$getLastKnownMapkitLocation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coordinateProvidersFactory$getLastKnownMapkitLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    adz adzVar = aVar.e;
                    coordinateProvidersFactory$getLastKnownMapkitLocation$1.label = 1;
                    obj = ((com.yandex.go.g) adzVar).m();
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
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                return d6z.M();
            }
        }
        coordinateProvidersFactory$getLastKnownMapkitLocation$1 = new CoordinateProvidersFactory$getLastKnownMapkitLocation$1(aVar, continuation);
        obj = coordinateProvidersFactory$getLastKnownMapkitLocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coordinateProvidersFactory$getLastKnownMapkitLocation$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0214 A[LOOP:0: B:17:0x020e->B:19:0x0214, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0240 A[LOOP:1: B:22:0x023a->B:24:0x0240, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        CoordinateProvidersFactory$currentCoordinates$1 coordinateProvidersFactory$currentCoordinates$1;
        CoordinateProvidersFactory$currentCoordinates$1 coordinateProvidersFactory$currentCoordinates$12;
        Object[] objArr;
        int i;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        Object[] objArr9;
        Object[] objArr10;
        Object[] objArr11;
        int i2;
        Object[] objArr12;
        Object[] objArr13;
        int i3;
        Object[] objArr14;
        List arrayList;
        List list;
        List list2;
        ArrayList arrayList2;
        Iterator it;
        List list3;
        if (continuationImpl instanceof CoordinateProvidersFactory$currentCoordinates$1) {
            coordinateProvidersFactory$currentCoordinates$1 = (CoordinateProvidersFactory$currentCoordinates$1) continuationImpl;
            int i4 = coordinateProvidersFactory$currentCoordinates$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                coordinateProvidersFactory$currentCoordinates$1.label = i4 - Integer.MIN_VALUE;
                coordinateProvidersFactory$currentCoordinates$12 = coordinateProvidersFactory$currentCoordinates$1;
                Object obj = coordinateProvidersFactory$currentCoordinates$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = 6;
                int i6 = 5;
                int i7 = 4;
                int i8 = 3;
                int i9 = 2;
                int i10 = 1;
                switch (coordinateProvidersFactory$currentCoordinates$12.label) {
                    case 0:
                        kotlin.b.b(obj);
                        objArr = new yne[8];
                        CoordinateProvider$Source coordinateProvider$Source = CoordinateProvider$Source.GPS;
                        tls coordinateProvidersFactory$currentCoordinates$coopProviders$1 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$1(this, null);
                        coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr;
                        coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr;
                        coordinateProvidersFactory$currentCoordinates$12.I$0 = 0;
                        coordinateProvidersFactory$currentCoordinates$12.label = 1;
                        obj = j(coordinateProvider$Source, coordinateProvidersFactory$currentCoordinates$coopProviders$1, coordinateProvidersFactory$currentCoordinates$12);
                        if (obj != obj2) {
                            i = 0;
                            objArr2 = objArr;
                            objArr2[i] = obj;
                            CoordinateProvider$Source coordinateProvider$Source2 = CoordinateProvider$Source.PLATFORM_LBS;
                            tls coordinateProvidersFactory$currentCoordinates$coopProviders$2 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$2(this, null);
                            coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr;
                            coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr;
                            coordinateProvidersFactory$currentCoordinates$12.I$0 = 1;
                            coordinateProvidersFactory$currentCoordinates$12.label = 2;
                            obj = j(coordinateProvider$Source2, coordinateProvidersFactory$currentCoordinates$coopProviders$2, coordinateProvidersFactory$currentCoordinates$12);
                            if (obj != obj2) {
                                objArr3 = objArr;
                                objArr3[i10] = obj;
                                CoordinateProvider$Source coordinateProvider$Source3 = CoordinateProvider$Source.LBS_GSM;
                                Object[] objArr15 = objArr;
                                tls coordinateProvidersFactory$currentCoordinates$coopProviders$3 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$3(1, this, a.class, "getLastKnownLbsGsmLocation", "getLastKnownLbsGsmLocation(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                                coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr15;
                                coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr15;
                                coordinateProvidersFactory$currentCoordinates$12.I$0 = 2;
                                coordinateProvidersFactory$currentCoordinates$12.label = 3;
                                obj = j(coordinateProvider$Source3, coordinateProvidersFactory$currentCoordinates$coopProviders$3, coordinateProvidersFactory$currentCoordinates$12);
                                if (obj != obj2) {
                                    objArr4 = objArr15;
                                    objArr5 = objArr15;
                                    objArr4[i9] = obj;
                                    CoordinateProvider$Source coordinateProvider$Source4 = CoordinateProvider$Source.LBS_IP;
                                    tls coordinateProvidersFactory$currentCoordinates$coopProviders$4 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$4(1, this, a.class, "getLastKnownLbsIpLocation", "getLastKnownLbsIpLocation(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                                    coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr5;
                                    coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr5;
                                    coordinateProvidersFactory$currentCoordinates$12.I$0 = 3;
                                    coordinateProvidersFactory$currentCoordinates$12.label = 4;
                                    obj = j(coordinateProvider$Source4, coordinateProvidersFactory$currentCoordinates$coopProviders$4, coordinateProvidersFactory$currentCoordinates$12);
                                    if (obj != obj2) {
                                        objArr6 = objArr5;
                                        objArr7 = objArr5;
                                        objArr6[i8] = obj;
                                        CoordinateProvider$Source coordinateProvider$Source5 = CoordinateProvider$Source.LBS_WIFI;
                                        tls coordinateProvidersFactory$currentCoordinates$coopProviders$5 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$5(1, this, a.class, "getLastKnownLbsWifiLocation", "getLastKnownLbsWifiLocation(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                                        coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr7;
                                        coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr7;
                                        coordinateProvidersFactory$currentCoordinates$12.I$0 = 4;
                                        coordinateProvidersFactory$currentCoordinates$12.label = 5;
                                        obj = j(coordinateProvider$Source5, coordinateProvidersFactory$currentCoordinates$coopProviders$5, coordinateProvidersFactory$currentCoordinates$12);
                                        if (obj != obj2) {
                                            objArr8 = objArr7;
                                            objArr9 = objArr7;
                                            objArr8[i7] = obj;
                                            CoordinateProvider$Source coordinateProvider$Source6 = CoordinateProvider$Source.MAPKIT;
                                            tls coordinateProvidersFactory$currentCoordinates$coopProviders$6 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$6(1, this, a.class, "getLastKnownMapkitLocation", "getLastKnownMapkitLocation(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                                            coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr9;
                                            coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr9;
                                            coordinateProvidersFactory$currentCoordinates$12.I$0 = 5;
                                            coordinateProvidersFactory$currentCoordinates$12.label = 6;
                                            obj = j(coordinateProvider$Source6, coordinateProvidersFactory$currentCoordinates$coopProviders$6, coordinateProvidersFactory$currentCoordinates$12);
                                            if (obj != obj2) {
                                                objArr10 = objArr9;
                                                objArr11 = objArr9;
                                                objArr10[i6] = obj;
                                                CoordinateProvider$Source coordinateProvider$Source7 = CoordinateProvider$Source.FUSED;
                                                tls coordinateProvidersFactory$currentCoordinates$coopProviders$7 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$7(1, this, a.class, "getLastKnownFusedLocation", "getLastKnownFusedLocation(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                                                coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr11;
                                                coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr11;
                                                coordinateProvidersFactory$currentCoordinates$12.I$0 = 6;
                                                i2 = 7;
                                                coordinateProvidersFactory$currentCoordinates$12.label = 7;
                                                obj = j(coordinateProvider$Source7, coordinateProvidersFactory$currentCoordinates$coopProviders$7, coordinateProvidersFactory$currentCoordinates$12);
                                                if (obj != obj2) {
                                                    objArr12 = objArr11;
                                                    objArr13 = objArr11;
                                                    objArr13[i5] = obj;
                                                    coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr12;
                                                    coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr12;
                                                    coordinateProvidersFactory$currentCoordinates$12.I$0 = i2;
                                                    coordinateProvidersFactory$currentCoordinates$12.label = 8;
                                                    obj = i(coordinateProvidersFactory$currentCoordinates$12);
                                                    if (obj != obj2) {
                                                        i3 = i2;
                                                        objArr14 = objArr12;
                                                        objArr14[i3] = obj;
                                                        arrayList = new ArrayList(j73.A(objArr12));
                                                        coordinateProvidersFactory$currentCoordinates$12.L$0 = arrayList;
                                                        coordinateProvidersFactory$currentCoordinates$12.L$1 = arrayList;
                                                        coordinateProvidersFactory$currentCoordinates$12.L$2 = arrayList;
                                                        coordinateProvidersFactory$currentCoordinates$12.label = 9;
                                                        obj = ((com.yandex.go.g) this.e).e(coordinateProvidersFactory$currentCoordinates$12);
                                                        if (obj != obj2) {
                                                            list = arrayList;
                                                            list2 = list;
                                                            Iterable<o9z> iterable = (Iterable) obj;
                                                            ArrayList arrayList3 = new ArrayList(tcc.n(iterable, 10));
                                                            for (o9z o9zVar : iterable) {
                                                                arrayList3.add(s8o.g(o9zVar.a, CoordinateProvider$Source.RIDETECH_LOCATION_SDK_LAST_LOCATION, o9zVar.b));
                                                            }
                                                            arrayList.addAll(arrayList3);
                                                            List list4 = list;
                                                            arrayList2 = new ArrayList(tcc.n(list4, 10));
                                                            it = list4.iterator();
                                                            while (it.hasNext()) {
                                                                arrayList2.add(((yne) it.next()).c);
                                                            }
                                                            coordinateProvidersFactory$currentCoordinates$12.L$0 = list2;
                                                            coordinateProvidersFactory$currentCoordinates$12.L$1 = null;
                                                            coordinateProvidersFactory$currentCoordinates$12.L$2 = null;
                                                            coordinateProvidersFactory$currentCoordinates$12.label = 10;
                                                            if (this.h.b(arrayList2, coordinateProvidersFactory$currentCoordinates$12) != obj2) {
                                                                list3 = list2;
                                                                return this.f.b(list3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return obj2;
                    case 1:
                        i = coordinateProvidersFactory$currentCoordinates$12.I$0;
                        Object[] objArr16 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$1;
                        Object[] objArr17 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$0;
                        kotlin.b.b(obj);
                        objArr2 = objArr16;
                        objArr = objArr17;
                        objArr2[i] = obj;
                        CoordinateProvider$Source coordinateProvider$Source22 = CoordinateProvider$Source.PLATFORM_LBS;
                        tls coordinateProvidersFactory$currentCoordinates$coopProviders$22 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$2(this, null);
                        coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr;
                        coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr;
                        coordinateProvidersFactory$currentCoordinates$12.I$0 = 1;
                        coordinateProvidersFactory$currentCoordinates$12.label = 2;
                        obj = j(coordinateProvider$Source22, coordinateProvidersFactory$currentCoordinates$coopProviders$22, coordinateProvidersFactory$currentCoordinates$12);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 2:
                        i10 = coordinateProvidersFactory$currentCoordinates$12.I$0;
                        Object[] objArr18 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$1;
                        objArr = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$0;
                        kotlin.b.b(obj);
                        objArr3 = objArr18;
                        objArr3[i10] = obj;
                        CoordinateProvider$Source coordinateProvider$Source32 = CoordinateProvider$Source.LBS_GSM;
                        Object[] objArr152 = objArr;
                        tls coordinateProvidersFactory$currentCoordinates$coopProviders$32 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$3(1, this, a.class, "getLastKnownLbsGsmLocation", "getLastKnownLbsGsmLocation(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                        coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr152;
                        coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr152;
                        coordinateProvidersFactory$currentCoordinates$12.I$0 = 2;
                        coordinateProvidersFactory$currentCoordinates$12.label = 3;
                        obj = j(coordinateProvider$Source32, coordinateProvidersFactory$currentCoordinates$coopProviders$32, coordinateProvidersFactory$currentCoordinates$12);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 3:
                        i9 = coordinateProvidersFactory$currentCoordinates$12.I$0;
                        Object[] objArr19 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$1;
                        Object[] objArr20 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$0;
                        kotlin.b.b(obj);
                        objArr5 = objArr20;
                        objArr4 = objArr19;
                        objArr4[i9] = obj;
                        CoordinateProvider$Source coordinateProvider$Source42 = CoordinateProvider$Source.LBS_IP;
                        tls coordinateProvidersFactory$currentCoordinates$coopProviders$42 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$4(1, this, a.class, "getLastKnownLbsIpLocation", "getLastKnownLbsIpLocation(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                        coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr5;
                        coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr5;
                        coordinateProvidersFactory$currentCoordinates$12.I$0 = 3;
                        coordinateProvidersFactory$currentCoordinates$12.label = 4;
                        obj = j(coordinateProvider$Source42, coordinateProvidersFactory$currentCoordinates$coopProviders$42, coordinateProvidersFactory$currentCoordinates$12);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 4:
                        i8 = coordinateProvidersFactory$currentCoordinates$12.I$0;
                        Object[] objArr21 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$1;
                        Object[] objArr22 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$0;
                        kotlin.b.b(obj);
                        objArr7 = objArr22;
                        objArr6 = objArr21;
                        objArr6[i8] = obj;
                        CoordinateProvider$Source coordinateProvider$Source52 = CoordinateProvider$Source.LBS_WIFI;
                        tls coordinateProvidersFactory$currentCoordinates$coopProviders$52 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$5(1, this, a.class, "getLastKnownLbsWifiLocation", "getLastKnownLbsWifiLocation(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                        coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr7;
                        coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr7;
                        coordinateProvidersFactory$currentCoordinates$12.I$0 = 4;
                        coordinateProvidersFactory$currentCoordinates$12.label = 5;
                        obj = j(coordinateProvider$Source52, coordinateProvidersFactory$currentCoordinates$coopProviders$52, coordinateProvidersFactory$currentCoordinates$12);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 5:
                        i7 = coordinateProvidersFactory$currentCoordinates$12.I$0;
                        Object[] objArr23 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$1;
                        Object[] objArr24 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$0;
                        kotlin.b.b(obj);
                        objArr9 = objArr24;
                        objArr8 = objArr23;
                        objArr8[i7] = obj;
                        CoordinateProvider$Source coordinateProvider$Source62 = CoordinateProvider$Source.MAPKIT;
                        tls coordinateProvidersFactory$currentCoordinates$coopProviders$62 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$6(1, this, a.class, "getLastKnownMapkitLocation", "getLastKnownMapkitLocation(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                        coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr9;
                        coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr9;
                        coordinateProvidersFactory$currentCoordinates$12.I$0 = 5;
                        coordinateProvidersFactory$currentCoordinates$12.label = 6;
                        obj = j(coordinateProvider$Source62, coordinateProvidersFactory$currentCoordinates$coopProviders$62, coordinateProvidersFactory$currentCoordinates$12);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 6:
                        i6 = coordinateProvidersFactory$currentCoordinates$12.I$0;
                        Object[] objArr25 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$1;
                        Object[] objArr26 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$0;
                        kotlin.b.b(obj);
                        objArr11 = objArr26;
                        objArr10 = objArr25;
                        objArr10[i6] = obj;
                        CoordinateProvider$Source coordinateProvider$Source72 = CoordinateProvider$Source.FUSED;
                        tls coordinateProvidersFactory$currentCoordinates$coopProviders$72 = new CoordinateProvidersFactory$currentCoordinates$coopProviders$7(1, this, a.class, "getLastKnownFusedLocation", "getLastKnownFusedLocation(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                        coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr11;
                        coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr11;
                        coordinateProvidersFactory$currentCoordinates$12.I$0 = 6;
                        i2 = 7;
                        coordinateProvidersFactory$currentCoordinates$12.label = 7;
                        obj = j(coordinateProvider$Source72, coordinateProvidersFactory$currentCoordinates$coopProviders$72, coordinateProvidersFactory$currentCoordinates$12);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 7:
                        i5 = coordinateProvidersFactory$currentCoordinates$12.I$0;
                        Object[] objArr27 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$1;
                        objArr12 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$0;
                        kotlin.b.b(obj);
                        objArr13 = objArr27;
                        i2 = 7;
                        objArr13[i5] = obj;
                        coordinateProvidersFactory$currentCoordinates$12.L$0 = objArr12;
                        coordinateProvidersFactory$currentCoordinates$12.L$1 = objArr12;
                        coordinateProvidersFactory$currentCoordinates$12.I$0 = i2;
                        coordinateProvidersFactory$currentCoordinates$12.label = 8;
                        obj = i(coordinateProvidersFactory$currentCoordinates$12);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 8:
                        i3 = coordinateProvidersFactory$currentCoordinates$12.I$0;
                        Object[] objArr28 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$1;
                        objArr12 = (yne[]) coordinateProvidersFactory$currentCoordinates$12.L$0;
                        kotlin.b.b(obj);
                        objArr14 = objArr28;
                        objArr14[i3] = obj;
                        arrayList = new ArrayList(j73.A(objArr12));
                        coordinateProvidersFactory$currentCoordinates$12.L$0 = arrayList;
                        coordinateProvidersFactory$currentCoordinates$12.L$1 = arrayList;
                        coordinateProvidersFactory$currentCoordinates$12.L$2 = arrayList;
                        coordinateProvidersFactory$currentCoordinates$12.label = 9;
                        obj = ((com.yandex.go.g) this.e).e(coordinateProvidersFactory$currentCoordinates$12);
                        if (obj != obj2) {
                        }
                        return obj2;
                    case 9:
                        arrayList = (List) coordinateProvidersFactory$currentCoordinates$12.L$2;
                        list = (List) coordinateProvidersFactory$currentCoordinates$12.L$1;
                        list2 = (List) coordinateProvidersFactory$currentCoordinates$12.L$0;
                        kotlin.b.b(obj);
                        Iterable<o9z> iterable2 = (Iterable) obj;
                        ArrayList arrayList32 = new ArrayList(tcc.n(iterable2, 10));
                        while (r0.hasNext()) {
                        }
                        arrayList.addAll(arrayList32);
                        List list42 = list;
                        arrayList2 = new ArrayList(tcc.n(list42, 10));
                        it = list42.iterator();
                        while (it.hasNext()) {
                        }
                        coordinateProvidersFactory$currentCoordinates$12.L$0 = list2;
                        coordinateProvidersFactory$currentCoordinates$12.L$1 = null;
                        coordinateProvidersFactory$currentCoordinates$12.L$2 = null;
                        coordinateProvidersFactory$currentCoordinates$12.label = 10;
                        if (this.h.b(arrayList2, coordinateProvidersFactory$currentCoordinates$12) != obj2) {
                        }
                        return obj2;
                    case 10:
                        list3 = (List) coordinateProvidersFactory$currentCoordinates$12.L$0;
                        kotlin.b.b(obj);
                        return this.f.b(list3);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        coordinateProvidersFactory$currentCoordinates$1 = new CoordinateProvidersFactory$currentCoordinates$1(this, continuationImpl);
        coordinateProvidersFactory$currentCoordinates$12 = coordinateProvidersFactory$currentCoordinates$1;
        Object obj3 = coordinateProvidersFactory$currentCoordinates$12.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i52 = 6;
        int i62 = 5;
        int i72 = 4;
        int i82 = 3;
        int i92 = 2;
        int i102 = 1;
        switch (coordinateProvidersFactory$currentCoordinates$12.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a A[LOOP:0: B:19:0x0094->B:21:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6 A[LOOP:1: B:24:0x00c0->B:26:0x00c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        CoordinateProvidersFactory$currentCoordinatesParallel$1 coordinateProvidersFactory$currentCoordinatesParallel$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        Collection collection;
        ArrayList arrayList3;
        Iterator it;
        List list;
        if (continuationImpl instanceof CoordinateProvidersFactory$currentCoordinatesParallel$1) {
            coordinateProvidersFactory$currentCoordinatesParallel$1 = (CoordinateProvidersFactory$currentCoordinatesParallel$1) continuationImpl;
            int i2 = coordinateProvidersFactory$currentCoordinatesParallel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coordinateProvidersFactory$currentCoordinatesParallel$1.label = i2 - Integer.MIN_VALUE;
                obj = coordinateProvidersFactory$currentCoordinatesParallel$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coordinateProvidersFactory$currentCoordinatesParallel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1 coordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1 = new CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1(this, null);
                    coordinateProvidersFactory$currentCoordinatesParallel$1.label = 1;
                    obj = bvf0.n(coordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1, coordinateProvidersFactory$currentCoordinatesParallel$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            list = (List) coordinateProvidersFactory$currentCoordinatesParallel$1.L$0;
                            kotlin.b.b(obj);
                            return this.f.b(list);
                        }
                        ?? r2 = (List) coordinateProvidersFactory$currentCoordinatesParallel$1.L$2;
                        Collection collection2 = (List) coordinateProvidersFactory$currentCoordinatesParallel$1.L$1;
                        ?? r5 = (List) coordinateProvidersFactory$currentCoordinatesParallel$1.L$0;
                        kotlin.b.b(obj);
                        arrayList2 = r2;
                        arrayList = r5;
                        collection = collection2;
                        Iterable<o9z> iterable = (Iterable) obj;
                        ArrayList arrayList4 = new ArrayList(tcc.n(iterable, 10));
                        for (o9z o9zVar : iterable) {
                            arrayList4.add(s8o.g(o9zVar.a, CoordinateProvider$Source.RIDETECH_LOCATION_SDK_LAST_LOCATION, o9zVar.b));
                        }
                        arrayList2.addAll(arrayList4);
                        Collection collection3 = collection;
                        arrayList3 = new ArrayList(tcc.n(collection3, 10));
                        it = collection3.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((yne) it.next()).c);
                        }
                        coordinateProvidersFactory$currentCoordinatesParallel$1.L$0 = arrayList;
                        coordinateProvidersFactory$currentCoordinatesParallel$1.L$1 = null;
                        coordinateProvidersFactory$currentCoordinatesParallel$1.L$2 = null;
                        coordinateProvidersFactory$currentCoordinatesParallel$1.label = 3;
                        if (this.h.b(arrayList3, coordinateProvidersFactory$currentCoordinatesParallel$1) != coroutineSingletons) {
                            list = arrayList;
                            return this.f.b(list);
                        }
                        return coroutineSingletons;
                    }
                    kotlin.b.b(obj);
                }
                arrayList = new ArrayList((Collection) obj);
                coordinateProvidersFactory$currentCoordinatesParallel$1.L$0 = arrayList;
                coordinateProvidersFactory$currentCoordinatesParallel$1.L$1 = arrayList;
                coordinateProvidersFactory$currentCoordinatesParallel$1.L$2 = arrayList;
                coordinateProvidersFactory$currentCoordinatesParallel$1.label = 2;
                obj = ((com.yandex.go.g) this.e).e(coordinateProvidersFactory$currentCoordinatesParallel$1);
                if (obj != coroutineSingletons) {
                    arrayList2 = arrayList;
                    collection = arrayList2;
                    Iterable<o9z> iterable2 = (Iterable) obj;
                    ArrayList arrayList42 = new ArrayList(tcc.n(iterable2, 10));
                    while (r14.hasNext()) {
                    }
                    arrayList2.addAll(arrayList42);
                    Collection collection32 = collection;
                    arrayList3 = new ArrayList(tcc.n(collection32, 10));
                    it = collection32.iterator();
                    while (it.hasNext()) {
                    }
                    coordinateProvidersFactory$currentCoordinatesParallel$1.L$0 = arrayList;
                    coordinateProvidersFactory$currentCoordinatesParallel$1.L$1 = null;
                    coordinateProvidersFactory$currentCoordinatesParallel$1.L$2 = null;
                    coordinateProvidersFactory$currentCoordinatesParallel$1.label = 3;
                    if (this.h.b(arrayList3, coordinateProvidersFactory$currentCoordinatesParallel$1) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        coordinateProvidersFactory$currentCoordinatesParallel$1 = new CoordinateProvidersFactory$currentCoordinatesParallel$1(this, continuationImpl);
        obj = coordinateProvidersFactory$currentCoordinatesParallel$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coordinateProvidersFactory$currentCoordinatesParallel$1.label;
        if (i != 0) {
        }
        arrayList = new ArrayList((Collection) obj);
        coordinateProvidersFactory$currentCoordinatesParallel$1.L$0 = arrayList;
        coordinateProvidersFactory$currentCoordinatesParallel$1.L$1 = arrayList;
        coordinateProvidersFactory$currentCoordinatesParallel$1.L$2 = arrayList;
        coordinateProvidersFactory$currentCoordinatesParallel$1.label = 2;
        obj = ((com.yandex.go.g) this.e).e(coordinateProvidersFactory$currentCoordinatesParallel$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        CoordinateProvidersFactory$getRidetechLocationSdkLocation$1 coordinateProvidersFactory$getRidetechLocationSdkLocation$1;
        int i;
        o9z o9zVar;
        if (continuationImpl instanceof CoordinateProvidersFactory$getRidetechLocationSdkLocation$1) {
            coordinateProvidersFactory$getRidetechLocationSdkLocation$1 = (CoordinateProvidersFactory$getRidetechLocationSdkLocation$1) continuationImpl;
            int i2 = coordinateProvidersFactory$getRidetechLocationSdkLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coordinateProvidersFactory$getRidetechLocationSdkLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = coordinateProvidersFactory$getRidetechLocationSdkLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coordinateProvidersFactory$getRidetechLocationSdkLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    coordinateProvidersFactory$getRidetechLocationSdkLocation$1.label = 1;
                    obj = ((com.yandex.go.g) this.e).d(coordinateProvidersFactory$getRidetechLocationSdkLocation$1);
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
                o9zVar = (o9z) obj;
                if (o9zVar != null) {
                    return null;
                }
                return s8o.g(o9zVar.a, CoordinateProvider$Source.RIDETECH_LOCATION_SDK, o9zVar.b);
            }
        }
        coordinateProvidersFactory$getRidetechLocationSdkLocation$1 = new CoordinateProvidersFactory$getRidetechLocationSdkLocation$1(this, continuationImpl);
        Object obj2 = coordinateProvidersFactory$getRidetechLocationSdkLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coordinateProvidersFactory$getRidetechLocationSdkLocation$1.label;
        if (i != 0) {
        }
        o9zVar = (o9z) obj2;
        if (o9zVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(CoordinateProvider$Source coordinateProvider$Source, tls tlsVar, ContinuationImpl continuationImpl) {
        CoordinateProvidersFactory$getWarmUpLocationOrFallback$1 coordinateProvidersFactory$getWarmUpLocationOrFallback$1;
        int i;
        Location location;
        if (continuationImpl instanceof CoordinateProvidersFactory$getWarmUpLocationOrFallback$1) {
            coordinateProvidersFactory$getWarmUpLocationOrFallback$1 = (CoordinateProvidersFactory$getWarmUpLocationOrFallback$1) continuationImpl;
            int i2 = coordinateProvidersFactory$getWarmUpLocationOrFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coordinateProvidersFactory$getWarmUpLocationOrFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = coordinateProvidersFactory$getWarmUpLocationOrFallback$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coordinateProvidersFactory$getWarmUpLocationOrFallback$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    location = (Location) this.g.a.get(coordinateProvider$Source);
                    if (location == null) {
                        coordinateProvidersFactory$getWarmUpLocationOrFallback$1.L$0 = coordinateProvider$Source;
                        coordinateProvidersFactory$getWarmUpLocationOrFallback$1.L$1 = null;
                        coordinateProvidersFactory$getWarmUpLocationOrFallback$1.label = 1;
                        obj = tlsVar.invoke(coordinateProvidersFactory$getWarmUpLocationOrFallback$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    if (location != null) {
                        return s8o.g(location, coordinateProvider$Source, null);
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                coordinateProvider$Source = (CoordinateProvider$Source) coordinateProvidersFactory$getWarmUpLocationOrFallback$1.L$0;
                kotlin.b.b(obj);
                location = (Location) obj;
                if (location != null) {
                }
            }
        }
        coordinateProvidersFactory$getWarmUpLocationOrFallback$1 = new CoordinateProvidersFactory$getWarmUpLocationOrFallback$1(this, continuationImpl);
        Object obj3 = coordinateProvidersFactory$getWarmUpLocationOrFallback$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coordinateProvidersFactory$getWarmUpLocationOrFallback$1.label;
        if (i != 0) {
        }
        location = (Location) obj3;
        if (location != null) {
        }
    }
}
