package ru.yandex.taxi.personalstate.domain;

import com.yandex.go.zone.model.Zone;
import defpackage.gwq;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/zone/model/Zone;", "zone", "Lzy11;", "<unused var>", "Lgwq;", "<anonymous>", "(Lcom/yandex/go/zone/model/Zone;V)Lru/yandex/taxi/personalstate/domain/FetchPersonalStateModel;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$subscribeFetchPersonalStateTriggers$3", f = "PersonalStateProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PersonalStateProvider$subscribeFetchPersonalStateTriggers$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PersonalStateProvider$subscribeFetchPersonalStateTriggers$3 personalStateProvider$subscribeFetchPersonalStateTriggers$3 = new PersonalStateProvider$subscribeFetchPersonalStateTriggers$3(3, (Continuation) obj3);
        personalStateProvider$subscribeFetchPersonalStateTriggers$3.L$0 = (Zone) obj;
        return personalStateProvider$subscribeFetchPersonalStateTriggers$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Zone zone = (Zone) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (zone != null) {
            return new gwq(zone);
        }
        return null;
    }
}
