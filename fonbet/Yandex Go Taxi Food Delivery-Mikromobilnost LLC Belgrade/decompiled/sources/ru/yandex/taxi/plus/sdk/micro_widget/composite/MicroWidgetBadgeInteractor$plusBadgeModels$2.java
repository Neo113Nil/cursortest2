package ru.yandex.taxi.plus.sdk.micro_widget.composite;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r2c;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.plus.api.dto.state.plaque.e0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lr2c;", "clientContext", "Lru/yandex/taxi/plus/api/dto/state/plaque/e0;", "badges", "", "", "templates", "Lkotlin/Triple;", "<anonymous>", "(Lr2c;Lru/yandex/taxi/plus/api/dto/state/plaque/e0;Ljava/util/Map;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.micro_widget.composite.MicroWidgetBadgeInteractor$plusBadgeModels$2", f = "MicroWidgetBadgeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MicroWidgetBadgeInteractor$plusBadgeModels$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        MicroWidgetBadgeInteractor$plusBadgeModels$2 microWidgetBadgeInteractor$plusBadgeModels$2 = new MicroWidgetBadgeInteractor$plusBadgeModels$2(4, (Continuation) obj4);
        microWidgetBadgeInteractor$plusBadgeModels$2.L$0 = (r2c) obj;
        microWidgetBadgeInteractor$plusBadgeModels$2.L$1 = (e0) obj2;
        microWidgetBadgeInteractor$plusBadgeModels$2.L$2 = (Map) obj3;
        return microWidgetBadgeInteractor$plusBadgeModels$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r2c r2cVar = (r2c) this.L$0;
        e0 e0Var = (e0) this.L$1;
        Map map = (Map) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Triple(r2cVar, e0Var, map);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
