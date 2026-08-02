package ru.yandex.taxi.deeplinks;

import com.yandex.go.zone.model.Zone;
import defpackage.atd0;
import defpackage.bvf0;
import defpackage.dd61;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv0;
import defpackage.qq80;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes9.dex */
public final class e {
    public final com.yandex.go.zone.interactors.b a;
    public final atd0 b;
    public final tt2 c;
    public final po21 d;

    public e(com.yandex.go.zone.interactors.b bVar, atd0 atd0Var, tt2 tt2Var, po21 po21Var) {
        this.a = bVar;
        this.b = atd0Var;
        this.c = tt2Var;
        this.d = po21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, pv0 pv0Var, ContinuationImpl continuationImpl) {
        DeeplinkGeoPointDecoder$addressSaturatedWithZone$1 deeplinkGeoPointDecoder$addressSaturatedWithZone$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof DeeplinkGeoPointDecoder$addressSaturatedWithZone$1) {
            deeplinkGeoPointDecoder$addressSaturatedWithZone$1 = (DeeplinkGeoPointDecoder$addressSaturatedWithZone$1) continuationImpl;
            int i2 = deeplinkGeoPointDecoder$addressSaturatedWithZone$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deeplinkGeoPointDecoder$addressSaturatedWithZone$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deeplinkGeoPointDecoder$addressSaturatedWithZone$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deeplinkGeoPointDecoder$addressSaturatedWithZone$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.zone.interactors.b bVar = eVar.a;
                    String zoneName = pv0Var.a.getZoneName();
                    zzs B = pv0Var.a.B();
                    deeplinkGeoPointDecoder$addressSaturatedWithZone$1.L$0 = pv0Var;
                    deeplinkGeoPointDecoder$addressSaturatedWithZone$1.label = 1;
                    obj = bVar.d(zoneName, B, deeplinkGeoPointDecoder$addressSaturatedWithZone$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0Var = (pv0) deeplinkGeoPointDecoder$addressSaturatedWithZone$1.L$0;
                    kotlin.b.b(obj);
                }
                return new dd61(pv0Var, (Zone) obj);
            }
        }
        deeplinkGeoPointDecoder$addressSaturatedWithZone$1 = new DeeplinkGeoPointDecoder$addressSaturatedWithZone$1(eVar, continuationImpl);
        Object obj2 = deeplinkGeoPointDecoder$addressSaturatedWithZone$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deeplinkGeoPointDecoder$addressSaturatedWithZone$1.label;
        if (i != 0) {
        }
        return new dd61(pv0Var, (Zone) obj2);
    }

    public static Object b(e eVar, zzs zzsVar, ContinuationImpl continuationImpl, int i) {
        eVar.getClass();
        return kotlinx.coroutines.flow.e.y(((i) eVar.b).g(zzsVar, null, RoutePointType.POINT_B, false, false, qq80.b, null), continuationImpl);
    }

    public final Object c(String str, List list, ContinuationImpl continuationImpl) {
        return bvf0.n(new DeeplinkGeoPointDecoder$midPoints$2(list, this, str, null), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        DeeplinkGeoPointDecoder$sourcePointForUserGeo$1 deeplinkGeoPointDecoder$sourcePointForUserGeo$1;
        int i;
        if (continuationImpl instanceof DeeplinkGeoPointDecoder$sourcePointForUserGeo$1) {
            deeplinkGeoPointDecoder$sourcePointForUserGeo$1 = (DeeplinkGeoPointDecoder$sourcePointForUserGeo$1) continuationImpl;
            int i2 = deeplinkGeoPointDecoder$sourcePointForUserGeo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deeplinkGeoPointDecoder$sourcePointForUserGeo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deeplinkGeoPointDecoder$sourcePointForUserGeo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deeplinkGeoPointDecoder$sourcePointForUserGeo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    deeplinkGeoPointDecoder$sourcePointForUserGeo$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.d).h(deeplinkGeoPointDecoder$sourcePointForUserGeo$1);
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
                tpr g = g(((mo21) obj).a(), null, true, false);
                deeplinkGeoPointDecoder$sourcePointForUserGeo$1.L$0 = null;
                deeplinkGeoPointDecoder$sourcePointForUserGeo$1.label = 2;
                Object y = kotlinx.coroutines.flow.e.y(g, deeplinkGeoPointDecoder$sourcePointForUserGeo$1);
                return y != coroutineSingletons ? coroutineSingletons : y;
            }
        }
        deeplinkGeoPointDecoder$sourcePointForUserGeo$1 = new DeeplinkGeoPointDecoder$sourcePointForUserGeo$1(this, continuationImpl);
        Object obj2 = deeplinkGeoPointDecoder$sourcePointForUserGeo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deeplinkGeoPointDecoder$sourcePointForUserGeo$1.label;
        if (i != 0) {
        }
        tpr g2 = g(((mo21) obj2).a(), null, true, false);
        deeplinkGeoPointDecoder$sourcePointForUserGeo$1.L$0 = null;
        deeplinkGeoPointDecoder$sourcePointForUserGeo$1.label = 2;
        Object y2 = kotlinx.coroutines.flow.e.y(g2, deeplinkGeoPointDecoder$sourcePointForUserGeo$1);
        if (y2 != coroutineSingletons2) {
        }
    }

    public final Object e(zzs zzsVar, String str, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        this.c.getClass();
        return tje.k0(uyj.a, new DeeplinkGeoPointDecoder$sourcePointInfo$2(this, zzsVar, str, z, z2, null), continuationImpl);
    }

    public final tpr g(zzs zzsVar, String str, boolean z, boolean z2) {
        d dVar = new d(((i) this.b).g(zzsVar, str, RoutePointType.POINT_A, z, z2, qq80.b, null), this);
        this.c.getClass();
        return kotlinx.coroutines.flow.e.F(dVar, uyj.a);
    }
}
