package ru.yandex.taxi.combo.interactor;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.response.CompanionHeader;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.ysg;
import defpackage.zc11;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final ysg a;
    public final p2y0 b;

    public a(ysg ysgVar, p2y0 p2y0Var) {
        this.a = ysgVar;
        this.b = p2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(CompanionHeader.Animation animation, ContinuationImpl continuationImpl) {
        TravelCompanionAnimationInteractor$setAnimationShown$1 travelCompanionAnimationInteractor$setAnimationShown$1;
        int i;
        CompanionHeader.Animation animation2;
        o2y0 o2y0Var;
        TaxiOrder b;
        if (continuationImpl instanceof TravelCompanionAnimationInteractor$setAnimationShown$1) {
            travelCompanionAnimationInteractor$setAnimationShown$1 = (TravelCompanionAnimationInteractor$setAnimationShown$1) continuationImpl;
            int i2 = travelCompanionAnimationInteractor$setAnimationShown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                travelCompanionAnimationInteractor$setAnimationShown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = travelCompanionAnimationInteractor$setAnimationShown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = travelCompanionAnimationInteractor$setAnimationShown$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p2y0 p2y0Var = this.b;
                    travelCompanionAnimationInteractor$setAnimationShown$1.L$0 = animation;
                    travelCompanionAnimationInteractor$setAnimationShown$1.label = 1;
                    obj = ((e0) p2y0Var).y(travelCompanionAnimationInteractor$setAnimationShown$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    animation2 = animation;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    animation2 = (CompanionHeader.Animation) travelCompanionAnimationInteractor$setAnimationShown$1.L$0;
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null || (b = o2y0Var.b()) == null) {
                    return zy11.a;
                }
                synchronized (b) {
                    TaxiOrderLocalData taxiOrderLocalData = b.l;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(taxiOrderLocalData.O);
                    String localDataKey = animation2.getLocalDataKey();
                    Integer num = (Integer) linkedHashMap.get(animation2.getLocalDataKey());
                    linkedHashMap.put(localDataKey, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                    b.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, false, null, false, null, null, null, -1, 16776959);
                }
                this.a.g(b);
                return zy11.a;
            }
        }
        travelCompanionAnimationInteractor$setAnimationShown$1 = new TravelCompanionAnimationInteractor$setAnimationShown$1(this, continuationImpl);
        Object obj2 = travelCompanionAnimationInteractor$setAnimationShown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = travelCompanionAnimationInteractor$setAnimationShown$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zc11 zc11Var, ContinuationImpl continuationImpl) {
        TravelCompanionAnimationInteractor$shouldShowAnimation$1 travelCompanionAnimationInteractor$shouldShowAnimation$1;
        int i;
        int i2;
        o2y0 o2y0Var;
        TaxiOrder b;
        if (continuationImpl instanceof TravelCompanionAnimationInteractor$shouldShowAnimation$1) {
            travelCompanionAnimationInteractor$shouldShowAnimation$1 = (TravelCompanionAnimationInteractor$shouldShowAnimation$1) continuationImpl;
            int i3 = travelCompanionAnimationInteractor$shouldShowAnimation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                travelCompanionAnimationInteractor$shouldShowAnimation$1.label = i3 - Integer.MIN_VALUE;
                Object obj = travelCompanionAnimationInteractor$shouldShowAnimation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = travelCompanionAnimationInteractor$shouldShowAnimation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Integer num = zc11Var.b.a;
                    if (num == null) {
                        return Boolean.TRUE;
                    }
                    int intValue = num.intValue();
                    p2y0 p2y0Var = this.b;
                    travelCompanionAnimationInteractor$shouldShowAnimation$1.L$0 = zc11Var;
                    travelCompanionAnimationInteractor$shouldShowAnimation$1.I$0 = intValue;
                    travelCompanionAnimationInteractor$shouldShowAnimation$1.label = 1;
                    Object y = ((e0) p2y0Var).y(travelCompanionAnimationInteractor$shouldShowAnimation$1);
                    if (y == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = y;
                    i2 = intValue;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = travelCompanionAnimationInteractor$shouldShowAnimation$1.I$0;
                    zc11Var = (zc11) travelCompanionAnimationInteractor$shouldShowAnimation$1.L$0;
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null || (b = o2y0Var.b()) == null) {
                    return Boolean.TRUE;
                }
                Integer num2 = (Integer) b.l.O.get(zc11Var.a.getLocalDataKey());
                return Boolean.valueOf((num2 != null ? num2.intValue() : 0) < i2 && zc11Var.c);
            }
        }
        travelCompanionAnimationInteractor$shouldShowAnimation$1 = new TravelCompanionAnimationInteractor$shouldShowAnimation$1(this, continuationImpl);
        Object obj2 = travelCompanionAnimationInteractor$shouldShowAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = travelCompanionAnimationInteractor$shouldShowAnimation$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
        }
        return Boolean.TRUE;
    }
}
