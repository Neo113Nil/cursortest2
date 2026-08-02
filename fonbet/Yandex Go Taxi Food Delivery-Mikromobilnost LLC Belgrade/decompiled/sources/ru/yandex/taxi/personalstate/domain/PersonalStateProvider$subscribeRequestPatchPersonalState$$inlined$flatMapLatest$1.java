package ru.yandex.taxi.personalstate.domain;

import com.yandex.go.zone.model.Zone;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yk;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$subscribeRequestPatchPersonalState$$inlined$flatMapLatest$1", f = "PersonalStateProvider.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class PersonalStateProvider$subscribeRequestPatchPersonalState$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalStateProvider$subscribeRequestPatchPersonalState$$inlined$flatMapLatest$1(Continuation continuation, o oVar) {
        super(3, continuation);
        this.this$0 = oVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PersonalStateProvider$subscribeRequestPatchPersonalState$$inlined$flatMapLatest$1 personalStateProvider$subscribeRequestPatchPersonalState$$inlined$flatMapLatest$1 = new PersonalStateProvider$subscribeRequestPatchPersonalState$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        personalStateProvider$subscribeRequestPatchPersonalState$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        personalStateProvider$subscribeRequestPatchPersonalState$$inlined$flatMapLatest$1.L$1 = obj2;
        return personalStateProvider$subscribeRequestPatchPersonalState$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr I;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Zone zone = (Zone) obj2;
            if (zone == null) {
                I = pvn.a;
            } else {
                o oVar = this.this$0;
                I = kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.n(oVar.k.a, com.yandex.go.coroutines.b.d(new com.yandex.go.requirements.comment.repositories.d(oVar.n.c), new PersonalStateProvider$requestPatchPersonalStateTriggersFlow$$inlined$start$1(Boolean.FALSE, null)), kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) oVar.i).j.b(), new yk(17)), new PersonalStateProvider$requestPatchPersonalStateTriggersFlow$2(4, null)), 200L), new PersonalStateProvider$subscribeRequestPatchPersonalState$2$1(this.this$0, zone, null));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(I, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
