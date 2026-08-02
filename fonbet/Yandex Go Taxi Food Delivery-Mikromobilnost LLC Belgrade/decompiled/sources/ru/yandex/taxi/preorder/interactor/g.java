package ru.yandex.taxi.preorder.interactor;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.dd61;
import defpackage.git0;
import defpackage.jst;
import defpackage.mo21;
import defpackage.mth;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv0;
import defpackage.qwt;
import defpackage.s8z;
import defpackage.tpr;
import defpackage.z7l0;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes6.dex */
public final class g {
    public final git0 a;
    public final i b;
    public final po21 c;
    public final ru.yandex.taxi.preorder.source.sourcepointzone.a d;
    public final ru.yandex.taxi.e e;
    public final com.yandex.go.navigation.screen.c f;
    public final com.yandex.go.route.interactor.b g;
    public final s8z h;

    public g(git0 git0Var, i iVar, po21 po21Var, ru.yandex.taxi.preorder.source.sourcepointzone.a aVar, ru.yandex.taxi.e eVar, com.yandex.go.navigation.screen.c cVar, com.yandex.go.route.interactor.b bVar, s8z s8zVar) {
        this.a = git0Var;
        this.b = iVar;
        this.c = po21Var;
        this.d = aVar;
        this.e = eVar;
        this.f = cVar;
        this.g = bVar;
        this.h = s8zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r9 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        if (r9 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, ZoneAddress zoneAddress, ContinuationImpl continuationImpl) {
        MakeAccurateSourcePointInteractor$getNewAccurateAddress$1 makeAccurateSourcePointInteractor$getNewAccurateAddress$1;
        Object obj;
        int i;
        gVar.getClass();
        if (continuationImpl instanceof MakeAccurateSourcePointInteractor$getNewAccurateAddress$1) {
            makeAccurateSourcePointInteractor$getNewAccurateAddress$1 = (MakeAccurateSourcePointInteractor$getNewAccurateAddress$1) continuationImpl;
            int i2 = makeAccurateSourcePointInteractor$getNewAccurateAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                makeAccurateSourcePointInteractor$getNewAccurateAddress$1.label = i2 - Integer.MIN_VALUE;
                obj = makeAccurateSourcePointInteractor$getNewAccurateAddress$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = makeAccurateSourcePointInteractor$getNewAccurateAddress$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (zoneAddress.a.getGeoPointAcquisitionType() != GeoPointAcquisitionType.DEFAULT) {
                        ru.yandex.taxi.e eVar = gVar.e;
                        makeAccurateSourcePointInteractor$getNewAccurateAddress$1.L$0 = zoneAddress;
                        makeAccurateSourcePointInteractor$getNewAccurateAddress$1.label = 1;
                        obj = eVar.i(makeAccurateSourcePointInteractor$getNewAccurateAddress$1);
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    zoneAddress = (ZoneAddress) makeAccurateSourcePointInteractor$getNewAccurateAddress$1.L$0;
                    kotlin.b.b(obj);
                    mo21 mo21Var = (mo21) obj;
                    if (mo21Var != null) {
                        zzs a = mo21Var.a();
                        makeAccurateSourcePointInteractor$getNewAccurateAddress$1.L$0 = null;
                        makeAccurateSourcePointInteractor$getNewAccurateAddress$1.L$1 = null;
                        makeAccurateSourcePointInteractor$getNewAccurateAddress$1.label = 3;
                        if (a.a(zoneAddress.a.B(), 1.0E-6d)) {
                            zoneAddress.a.G(GeoPointAcquisitionType.UPDATED_POINT);
                        } else {
                            obj3 = gVar.e(a, makeAccurateSourcePointInteractor$getNewAccurateAddress$1);
                        }
                        if (obj3 == obj2) {
                            return obj2;
                        }
                    }
                    return obj3;
                }
                zoneAddress = (ZoneAddress) makeAccurateSourcePointInteractor$getNewAccurateAddress$1.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    makeAccurateSourcePointInteractor$getNewAccurateAddress$1.L$0 = zoneAddress;
                    makeAccurateSourcePointInteractor$getNewAccurateAddress$1.label = 2;
                    obj = gVar.b(makeAccurateSourcePointInteractor$getNewAccurateAddress$1);
                }
                return obj3;
            }
        }
        makeAccurateSourcePointInteractor$getNewAccurateAddress$1 = new MakeAccurateSourcePointInteractor$getNewAccurateAddress$1(gVar, continuationImpl);
        obj = makeAccurateSourcePointInteractor$getNewAccurateAddress$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = makeAccurateSourcePointInteractor$getNewAccurateAddress$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return obj32;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MakeAccurateSourcePointInteractor$tryToGetLocation$1 makeAccurateSourcePointInteractor$tryToGetLocation$1;
        int i;
        try {
            if (continuationImpl instanceof MakeAccurateSourcePointInteractor$tryToGetLocation$1) {
                makeAccurateSourcePointInteractor$tryToGetLocation$1 = (MakeAccurateSourcePointInteractor$tryToGetLocation$1) continuationImpl;
                int i2 = makeAccurateSourcePointInteractor$tryToGetLocation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    makeAccurateSourcePointInteractor$tryToGetLocation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = makeAccurateSourcePointInteractor$tryToGetLocation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = makeAccurateSourcePointInteractor$tryToGetLocation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        po21 po21Var = this.c;
                        makeAccurateSourcePointInteractor$tryToGetLocation$1.label = 1;
                        obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(makeAccurateSourcePointInteractor$tryToGetLocation$1);
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
                    return (mo21) obj;
                }
            }
            if (i != 0) {
            }
            return (mo21) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Location permission error for pin absence");
            return null;
        }
        makeAccurateSourcePointInteractor$tryToGetLocation$1 = new MakeAccurateSourcePointInteractor$tryToGetLocation$1(this, continuationImpl);
        Object obj2 = makeAccurateSourcePointInteractor$tryToGetLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = makeAccurateSourcePointInteractor$tryToGetLocation$1.label;
    }

    public final void c(ZoneAddress zoneAddress) {
        ru.yandex.taxi.lifecycle.c.b(this.a.a, CoroutineStart.DEFAULT, new MakeAccurateSourcePointInteractor$updateAddressWhenOpenSummary$1(this, zoneAddress, null));
    }

    public final Object d(Continuation continuation) {
        return new o(new mth(kotlinx.coroutines.flow.e.I(new d(kotlinx.coroutines.flow.e.t(new m0(new ru.yandex.taxi.d(this.e.c()), new f(this.f.c()), new MakeAccurateSourcePointInteractor$updateLocationWhenCloseSummary$3(3, null)))), new MakeAccurateSourcePointInteractor$updateLocationWhenCloseSummary$5(null, this)), 6), new MakeAccurateSourcePointInteractor$updateLocationWhenCloseSummary$$inlined$safeCollect$1(null, this)).collect(new qwt(28, this), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0102, code lost:
    
        if (r1 == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f0, code lost:
    
        if (r1 != r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(zzs zzsVar, ContinuationImpl continuationImpl) {
        MakeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1 makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        zzs zzsVar2;
        z7l0 z7l0Var;
        i iVar;
        String str;
        Object d;
        boolean z;
        String str2;
        z7l0 z7l0Var2;
        zzs zzsVar3;
        i iVar2;
        if (continuationImpl instanceof MakeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1) {
            makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1 = (MakeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1) continuationImpl;
            int i2 = makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.label;
                ru.yandex.taxi.e eVar = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    RoutePointType routePointType = RoutePointType.POINT_A;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$0 = null;
                    i iVar3 = this.b;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$1 = iVar3;
                    zzsVar2 = zzsVar;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$2 = zzsVar2;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$3 = routePointType;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$4 = "geo";
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.label = 1;
                    Object g = eVar.g(makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1);
                    if (g != coroutineSingletons) {
                        z7l0Var = routePointType;
                        obj = g;
                        iVar = iVar3;
                        str = "geo";
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    str = (String) makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$4;
                    z7l0Var = (z7l0) makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$3;
                    zzsVar2 = (zzs) makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$2;
                    iVar = (i) makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$1;
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    boolean z2 = makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.Z$0;
                    String str3 = (String) makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$4;
                    z7l0 z7l0Var3 = (z7l0) makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$3;
                    zzs zzsVar4 = (zzs) makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$2;
                    iVar2 = (i) makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$1;
                    kotlin.b.b(obj);
                    z = z2;
                    str2 = str3;
                    z7l0Var2 = z7l0Var3;
                    zzsVar3 = zzsVar4;
                    tpr q = iVar2.q(false, zzsVar3, z7l0Var2, z, ((Boolean) obj).booleanValue(), str2, null, PositionInitAction.AUTO_LOCATION);
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$0 = null;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$1 = null;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$2 = null;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$3 = null;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$4 = null;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.label = 3;
                    obj = kotlinx.coroutines.flow.e.y(q, makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1);
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ZoneAddress a = ((dd61) obj).a();
                        a.a.G(GeoPointAcquisitionType.UPDATED_POINT);
                        return a;
                    }
                    kotlin.b.b(obj);
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$0 = null;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$1 = null;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.label = 4;
                    obj = this.d.a((pv0) obj, false, makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$0 = null;
                makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$1 = iVar;
                makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$2 = zzsVar2;
                makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$3 = z7l0Var;
                makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$4 = str;
                makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.Z$0 = booleanValue;
                makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.label = 2;
                d = eVar.d(makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1);
                if (d != coroutineSingletons) {
                    z = booleanValue;
                    str2 = str;
                    obj = d;
                    z7l0Var2 = z7l0Var;
                    zzsVar3 = zzsVar2;
                    iVar2 = iVar;
                    tpr q2 = iVar2.q(false, zzsVar3, z7l0Var2, z, ((Boolean) obj).booleanValue(), str2, null, PositionInitAction.AUTO_LOCATION);
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$0 = null;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$1 = null;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$2 = null;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$3 = null;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$4 = null;
                    makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.label = 3;
                    obj = kotlinx.coroutines.flow.e.y(q2, makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1);
                }
                return coroutineSingletons;
            }
        }
        makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1 = new MakeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1(this, continuationImpl);
        Object obj2 = makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.label;
        ru.yandex.taxi.e eVar2 = this.e;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$0 = null;
        makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$1 = iVar;
        makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$2 = zzsVar2;
        makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$3 = z7l0Var;
        makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.L$4 = str;
        makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.Z$0 = booleanValue2;
        makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1.label = 2;
        d = eVar2.d(makeAccurateSourcePointInteractor$zoneAddressForGeoPoint$1);
        if (d != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
