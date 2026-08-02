package ru.yandex.taxi.personalstate.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.r6b0;
import defpackage.s6b0;
import defpackage.t6b0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls6b0;", "loadingState", "", "<anonymous>", "(Ls6b0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$patchPersonalState$3$1", f = "PersonalStateProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PersonalStateProvider$patchPersonalState$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    public PersonalStateProvider$patchPersonalState$3$1() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PersonalStateProvider$patchPersonalState$3$1 personalStateProvider$patchPersonalState$3$1 = new PersonalStateProvider$patchPersonalState$3$1(2, continuation);
        personalStateProvider$patchPersonalState$3$1.L$0 = obj;
        return personalStateProvider$patchPersonalState$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalStateProvider$patchPersonalState$3$1) create((s6b0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s6b0 s6b0Var = (s6b0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf((s6b0Var instanceof r6b0) && (((r6b0) s6b0Var).a() instanceof t6b0));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
