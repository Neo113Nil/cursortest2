package ru.yandex.taxi.masstransit.stop.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/zone/model/Zone;", "<anonymous>", "(Ltse;)Lcom/yandex/go/zone/model/Zone;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopStateInteractor$zoneByGeo$2$1", f = "MtStopStateInteractor.kt", l = {214}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopStateInteractor$zoneByGeo$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $stopPoint;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopStateInteractor$zoneByGeo$2$1(g gVar, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$stopPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopStateInteractor$zoneByGeo$2$1(this.this$0, this.$stopPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopStateInteractor$zoneByGeo$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        com.yandex.go.zone.interactors.b bVar = this.this$0.g;
        zzs zzsVar = this.$stopPoint;
        this.label = 1;
        Object b = bVar.b(zzsVar, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
