package ru.yandex.taxi.main_screen_custom.domain;

import com.yandex.go.shortcuts.dto.response.AnimationSourceType;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.dto.response.LottieAnimation;
import com.yandex.go.shortcuts.dto.response.ObjectOverMap;
import com.yandex.go.shortcuts.dto.response.PositionOverMap;
import com.yandex.go.shortcuts.dto.response.ProductMode$Scooters;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import defpackage.arf0;
import defpackage.bms;
import defpackage.byx;
import defpackage.dzs;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s9f0;
import defpackage.yaf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Ldzs;", "Lr9f0;", "products", "Lbyx;", "layersCondition", "", "giftIsVisible", "Ls9f0;", "<anonymous>", "(Ldzs;Lbyx;Z)Ls9f0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.main_screen_custom.domain.PromoUpdateInteractor$updatesPromo$1", f = "PromoUpdateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PromoUpdateInteractor$updatesPromo$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoUpdateInteractor$updatesPromo$1(f fVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        PromoUpdateInteractor$updatesPromo$1 promoUpdateInteractor$updatesPromo$1 = new PromoUpdateInteractor$updatesPromo$1(this.this$0, (Continuation) obj4);
        promoUpdateInteractor$updatesPromo$1.L$0 = (dzs) obj;
        promoUpdateInteractor$updatesPromo$1.L$1 = (byx) obj2;
        promoUpdateInteractor$updatesPromo$1.Z$0 = booleanValue;
        return promoUpdateInteractor$updatesPromo$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Pair pair;
        Layout layout;
        dzs dzsVar = (dzs) this.L$0;
        byx byxVar = (byx) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        fVar.getClass();
        List b = dzsVar.b().getB();
        int i = arf0.a[byxVar.b.a.ordinal()];
        if (i == 1) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : b) {
                if (obj3 instanceof ProductMode$Taxi) {
                    arrayList.add(obj3);
                }
            }
            ProductMode$Taxi productMode$Taxi = (ProductMode$Taxi) kotlin.collections.a.R(arrayList);
            List list = productMode$Taxi != null ? productMode$Taxi.f : null;
            if (productMode$Taxi == null || (layout = productMode$Taxi.a) == null || (str = layout.c) == null) {
                str = "";
            }
            pair = new Pair(list, str);
        } else if (i != 2) {
            pair = new Pair(null, "");
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : b) {
                if (obj4 instanceof ProductMode$Scooters) {
                    arrayList2.add(obj4);
                }
            }
            ProductMode$Scooters productMode$Scooters = (ProductMode$Scooters) kotlin.collections.a.R(arrayList2);
            pair = new Pair(productMode$Scooters != null ? productMode$Scooters.b : null, "");
        }
        List list2 = (List) pair.getFirst();
        String str2 = (String) pair.getSecond();
        if (list2 == null) {
            return s9f0.e;
        }
        yaf0 a = dzsVar.a();
        for (Object obj5 : list2) {
            ObjectOverMap objectOverMap = (ObjectOverMap) obj5;
            String str3 = objectOverMap.a;
            ObjectOverMap.ShowPolicy showPolicy = objectOverMap.b;
            PositionOverMap positionOverMap = objectOverMap.f;
            com.yandex.go.shortcuts.dto.response.d dVar = objectOverMap.c;
            if (!jl40.l(str3, "") && dVar != null && positionOverMap != null && showPolicy != null) {
                if ((dVar != null ? dVar.a() : null) != AnimationSourceType.LOTTIE_ANIMATION || ((LottieAnimation) dVar).d != null) {
                    if (showPolicy != null && fVar.b.a(showPolicy.a) < showPolicy.b && (positionOverMap != PositionOverMap.CENTER_START || !z)) {
                        obj2 = obj5;
                        break;
                    }
                }
            }
        }
        return new s9f0(a, byxVar, (ObjectOverMap) obj2, str2);
    }
}
