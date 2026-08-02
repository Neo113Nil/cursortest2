package ru.yandex.taxi;

import defpackage.dub0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.w511;
import defpackage.wtb0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/yandex/taxi/address/repository/AddressResolveRepository$State;", "pinState", "Ldub0;", "alertState", "Ltpr;", "Lru/yandex/taxi/widget/map/SourceOnMapControl$a;", "<anonymous>", "(Lru/yandex/taxi/address/repository/AddressResolveRepository$State;Ldub0;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.PinAlertAnimationInteractorImpl$pinStateOverrideFlow$1", f = "PinAlertAnimationInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PinAlertAnimationInteractorImpl$pinStateOverrideFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ SourceOnMapControl.a $defaultState;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinAlertAnimationInteractorImpl$pinStateOverrideFlow$1(f fVar, SourceOnMapControl.a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fVar;
        this.$defaultState = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PinAlertAnimationInteractorImpl$pinStateOverrideFlow$1 pinAlertAnimationInteractorImpl$pinStateOverrideFlow$1 = new PinAlertAnimationInteractorImpl$pinStateOverrideFlow$1(this.this$0, this.$defaultState, (Continuation) obj3);
        pinAlertAnimationInteractorImpl$pinStateOverrideFlow$1.L$0 = (AddressResolveRepository.State) obj;
        pinAlertAnimationInteractorImpl$pinStateOverrideFlow$1.L$1 = (dub0) obj2;
        return pinAlertAnimationInteractorImpl$pinStateOverrideFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AddressResolveRepository.State state = (AddressResolveRepository.State) this.L$0;
        dub0 dub0Var = (dub0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (dub0Var != null) {
            int i = wtb0.a[state.ordinal()];
            if (i == 1) {
                dub0.a aVar = dub0Var.a;
                if (aVar != null) {
                    f fVar = this.this$0;
                    return new rol0(new PinAlertAnimationInteractorImpl$alertStateFlow$1(fVar, (SourceOnMapControl.a) fVar.b.getValue(), aVar, null));
                }
            } else if (i == 2) {
                dub0.a aVar2 = dub0Var.b;
                if (aVar2 != null) {
                    f fVar2 = this.this$0;
                    SourceOnMapControl.a aVar3 = this.$defaultState;
                    fVar2.getClass();
                    return new rol0(new PinAlertAnimationInteractorImpl$alertStateFlow$1(fVar2, aVar3, aVar2, null));
                }
            } else if (i != 3 && i != 4 && i != 5) {
                w511.b();
                return null;
            }
        }
        return null;
    }
}
