package ru.yandex.taxi.deeplinks;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.qq80;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/address/models/Address;", "<anonymous>", "(Ltse;)Lcom/yandex/go/address/models/Address;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.deeplinks.DeeplinkGeoPointDecoder$midPoints$2$1$1", f = "DeeplinkGeoPointDecoder.kt", l = {105}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DeeplinkGeoPointDecoder$midPoints$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $analyticsEventForRouteDeeplink;
    final /* synthetic */ zzs $point;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkGeoPointDecoder$midPoints$2$1$1(e eVar, zzs zzsVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$point = zzsVar;
        this.$analyticsEventForRouteDeeplink = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeeplinkGeoPointDecoder$midPoints$2$1$1(this.this$0, this.$point, this.$analyticsEventForRouteDeeplink, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeeplinkGeoPointDecoder$midPoints$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            tpr g = ((i) eVar.b).g(this.$point, this.$analyticsEventForRouteDeeplink, RoutePointType.POINT_MID, true, false, qq80.b, null);
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(g, this);
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
        return ((pv0) obj).a;
    }
}
