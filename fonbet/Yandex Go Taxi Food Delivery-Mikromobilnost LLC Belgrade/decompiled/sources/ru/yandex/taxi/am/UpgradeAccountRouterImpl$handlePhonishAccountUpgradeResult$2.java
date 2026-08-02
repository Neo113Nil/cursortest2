package ru.yandex.taxi.am;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pj;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.UpgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$2", f = "UpgradeAccountRouterImpl.kt", l = {181}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class UpgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$2 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.api.w $result;
    int label;
    final /* synthetic */ s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$2(s0 s0Var, com.yandex.passport.api.w wVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s0Var;
        this.$result = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$2(this.this$0, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeAccountRouterImpl$handlePhonishAccountUpgradeResult$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pj pjVar = this.this$0.o;
            pjVar.getClass();
            pjVar.a.a("Account.PhonishUpgrade.Completed", new HashMap(), 1, new HashMap());
            SimpleSpinnerModalView simpleSpinnerModalView = this.this$0.l.b;
            if (simpleSpinnerModalView != null) {
                simpleSpinnerModalView.startSpinner();
            }
            ru.yandex.taxi.am.internal.b bVar = this.this$0.e;
            com.yandex.passport.api.u uVar = (com.yandex.passport.api.u) this.$result;
            this.label = 1;
            c = bVar.c(uVar, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        return new Result(c);
    }
}
