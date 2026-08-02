package ru.yandex.taxi.summary.personalaction.popup;

import defpackage.hxx;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.u3b0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu3b0;", "viewModel", "Lzy11;", "<anonymous>", "(Lu3b0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.personalaction.popup.PersonalActionPopupInteractor$viewModelFlow$3", f = "PersonalActionPopupInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PersonalActionPopupInteractor$viewModelFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalActionPopupInteractor$viewModelFlow$3(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PersonalActionPopupInteractor$viewModelFlow$3 personalActionPopupInteractor$viewModelFlow$3 = new PersonalActionPopupInteractor$viewModelFlow$3(this.this$0, continuation);
        personalActionPopupInteractor$viewModelFlow$3.L$0 = obj;
        return personalActionPopupInteractor$viewModelFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PersonalActionPopupInteractor$viewModelFlow$3 personalActionPopupInteractor$viewModelFlow$3 = (PersonalActionPopupInteractor$viewModelFlow$3) create((u3b0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        personalActionPopupInteractor$viewModelFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        u3b0 u3b0Var = (u3b0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        String str = u3b0Var.d;
        if (((Number) eVar.d.a.getOrDefault(str, 0)).intValue() < u3b0Var.e) {
            e eVar2 = this.this$0;
            ((pep0) eVar2.e).f((m950) eVar2.c.get(), u3b0Var, hxx.a);
        }
        return zy11.a;
    }
}
