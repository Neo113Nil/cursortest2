package ru.yandex.taxi.personalstate.domain;

import defpackage.bms;
import defpackage.fnx0;
import defpackage.lq90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/yandex/taxi/personalstate/api/interactor/SavePersonalStateNotifier$SavePersonalStateReason;", "savePersonalStateReason", "", "isCommentValidated", "Lfnx0;", "tariffSelection", "Llq90;", "<anonymous>", "(Lru/yandex/taxi/personalstate/api/interactor/SavePersonalStateNotifier$SavePersonalStateReason;ZLfnx0;)Llq90;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$requestPatchPersonalStateTriggersFlow$2", f = "PersonalStateProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PersonalStateProvider$requestPatchPersonalStateTriggersFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        PersonalStateProvider$requestPatchPersonalStateTriggersFlow$2 personalStateProvider$requestPatchPersonalStateTriggersFlow$2 = new PersonalStateProvider$requestPatchPersonalStateTriggersFlow$2(4, (Continuation) obj4);
        personalStateProvider$requestPatchPersonalStateTriggersFlow$2.L$0 = (SavePersonalStateNotifier$SavePersonalStateReason) obj;
        personalStateProvider$requestPatchPersonalStateTriggersFlow$2.Z$0 = booleanValue;
        personalStateProvider$requestPatchPersonalStateTriggersFlow$2.L$1 = (fnx0) obj3;
        return personalStateProvider$requestPatchPersonalStateTriggersFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason = (SavePersonalStateNotifier$SavePersonalStateReason) this.L$0;
        boolean z = this.Z$0;
        fnx0 fnx0Var = (fnx0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new lq90(savePersonalStateNotifier$SavePersonalStateReason, z, fnx0Var.c, fnx0Var.b);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
