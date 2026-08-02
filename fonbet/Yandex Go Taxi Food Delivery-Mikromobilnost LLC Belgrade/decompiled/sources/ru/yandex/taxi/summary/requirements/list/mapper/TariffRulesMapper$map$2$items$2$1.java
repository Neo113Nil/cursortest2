package ru.yandex.taxi.summary.requirements.list.mapper;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lanx0;", "<anonymous>", "(Ltse;)Lanx0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.mapper.TariffRulesMapper$map$2$items$2$1", f = "TariffRulesMapper.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffRulesMapper$map$2$items$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ ServiceLevel.TariffCard.Bullet $it;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffRulesMapper$map$2$items$2$1(b bVar, ServiceLevel.TariffCard.Bullet bullet, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$it = bullet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffRulesMapper$map$2$items$2$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffRulesMapper$map$2$items$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        ServiceLevel.TariffCard.Bullet bullet = this.$it;
        this.label = 1;
        bVar.getClass();
        Object n = bvf0.n(new TariffRulesMapper$mapItem$2(bVar, bullet, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
