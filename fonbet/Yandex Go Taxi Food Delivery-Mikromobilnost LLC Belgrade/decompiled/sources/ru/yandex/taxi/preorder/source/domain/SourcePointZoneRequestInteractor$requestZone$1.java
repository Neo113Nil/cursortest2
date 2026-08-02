package ru.yandex.taxi.preorder.source.domain;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourcePointZoneRequestInteractor$requestZone$1", f = "SourcePointZoneRequestInteractor.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourcePointZoneRequestInteractor$requestZone$1 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $addressInfo;
    final /* synthetic */ Consumer<Throwable> $onZoneError;
    final /* synthetic */ Consumer<Zone> $onZoneSuccess;
    int label;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointZoneRequestInteractor$requestZone$1(w wVar, pv0 pv0Var, Consumer consumer, Consumer consumer2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wVar;
        this.$addressInfo = pv0Var;
        this.$onZoneSuccess = consumer;
        this.$onZoneError = consumer2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourcePointZoneRequestInteractor$requestZone$1(this.this$0, this.$addressInfo, this.$onZoneSuccess, this.$onZoneError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointZoneRequestInteractor$requestZone$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            w wVar = this.this$0;
            pv0 pv0Var = this.$addressInfo;
            this.label = 1;
            a = w.a(wVar, pv0Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        w wVar2 = this.this$0;
        pv0 pv0Var2 = this.$addressInfo;
        Consumer<Zone> consumer = this.$onZoneSuccess;
        if (!(a instanceof Result.Failure)) {
            Zone zone = (Zone) a;
            com.yandex.go.route.interactor.b bVar = wVar2.d;
            ZoneAddress zoneAddress = new ZoneAddress(pv0Var2.a, zone);
            com.yandex.go.route.interactor.c cVar = wVar2.c;
            Address h = cVar.c().h();
            zzs d = cVar.b.d();
            if (d == null && h != null) {
                d = h.B();
            }
            bVar.m(zoneAddress, d);
            consumer.accept(zone);
        }
        Consumer<Throwable> consumer2 = this.$onZoneError;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            consumer2.accept(a2);
        }
        return zy11.a;
    }
}
