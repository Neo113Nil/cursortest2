package ru.yandex.taxi.preorder.source.domain;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.dd61;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourcePointZoneRequestInteractor$requestZoneForSource$1", f = "SourcePointZoneRequestInteractor.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourcePointZoneRequestInteractor$requestZoneForSource$1 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $addressInfo;
    final /* synthetic */ Consumer<Throwable> $onZoneError;
    final /* synthetic */ Consumer<Zone> $onZoneSuccess;
    int label;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointZoneRequestInteractor$requestZoneForSource$1(w wVar, pv0 pv0Var, Consumer consumer, Consumer consumer2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wVar;
        this.$addressInfo = pv0Var;
        this.$onZoneSuccess = consumer;
        this.$onZoneError = consumer2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourcePointZoneRequestInteractor$requestZoneForSource$1(this.this$0, this.$addressInfo, this.$onZoneSuccess, this.$onZoneError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointZoneRequestInteractor$requestZoneForSource$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                w wVar = this.this$0;
                pv0 pv0Var = this.$addressInfo;
                ru.yandex.taxi.preorder.source.sourcepointzone.a aVar = wVar.e;
                this.label = 1;
                obj = aVar.a(pv0Var, false, this);
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
            failure = ((dd61) obj).b;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        w wVar2 = this.this$0;
        pv0 pv0Var2 = this.$addressInfo;
        Consumer<Zone> consumer = this.$onZoneSuccess;
        if (!(failure instanceof Result.Failure)) {
            Zone zone = (Zone) failure;
            wVar2.d.m(new ZoneAddress(pv0Var2.a, zone), null);
            consumer.accept(zone);
        }
        Consumer<Throwable> consumer2 = this.$onZoneError;
        Throwable a = Result.a(failure);
        if (a != null) {
            consumer2.accept(a);
        }
        return zy11.a;
    }
}
