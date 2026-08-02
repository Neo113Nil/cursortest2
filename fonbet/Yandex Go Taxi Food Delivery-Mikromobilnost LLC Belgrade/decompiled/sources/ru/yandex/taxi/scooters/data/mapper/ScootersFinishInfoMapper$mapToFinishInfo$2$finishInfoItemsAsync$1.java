package ru.yandex.taxi.scooters.data.mapper;

import defpackage.fef;
import defpackage.kmu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lemn0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.mapper.ScootersFinishInfoMapper$mapToFinishInfo$2$finishInfoItemsAsync$1", f = "ScootersFinishInfoMapper.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoMapper$mapToFinishInfo$2$finishInfoItemsAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ kmu $historySession;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoMapper$mapToFinishInfo$2$finishInfoItemsAsync$1(fef fefVar, kmu kmuVar, Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
        this.$historySession = kmuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersFinishInfoMapper$mapToFinishInfo$2$finishInfoItemsAsync$1(this.$currencyRules, this.$historySession, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoMapper$mapToFinishInfo$2$finishInfoItemsAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        d dVar = this.this$0;
        fef fefVar = this.$currencyRules;
        kmu.b bVar = this.$historySession.a;
        List list = bVar != null ? bVar.e : null;
        this.label = 1;
        Object a = d.a(dVar, fefVar, list, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
